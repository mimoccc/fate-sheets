package link.standen.michael.fatesheets.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import link.standen.michael.fatesheets.R;
import link.standen.michael.fatesheets.model.Character;

/**
 * An abstract class to force availability of getCharacter method while maintaining context
 * inheritance generically.
 */
public abstract class CharacterEditActivity extends AppCompatActivity {

	public abstract Character getCharacter();

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_character_edit, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_credits) {
			startActivity(new Intent(this, CreditsActivity.class));
			return true;
		} else if (id == R.id.action_docs) {
			startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://fate-srd.com/")));
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

}
