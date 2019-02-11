package sky4s.garmin.hud;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

/* Fragment used as page 1 */
public class Page1Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page1, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        ((MainActivity)getActivity()).switchHudConnected = (Switch) getView().findViewById(R.id.switchHudConnected);
        ((MainActivity)getActivity()).switchNotificationCatched = (Switch) getView().findViewById(R.id.switchNotificationCatched);
        ((MainActivity)getActivity()).switchGmapsNotificationCatched = (Switch)getView(). findViewById(R.id.switchGmapsNotificationCatched);
    }
}