package com.tencent.tencentmap.mapsdk.map;

/* loaded from: classes13.dex */
public class QSupportMapFragment extends androidx.fragment.app.Fragment {
    private com.tencent.tencentmap.mapsdk.map.MapView mapView;

    public static com.tencent.tencentmap.mapsdk.map.QSupportMapFragment newInstance() {
        return new com.tencent.tencentmap.mapsdk.map.QSupportMapFragment();
    }

    public com.tencent.tencentmap.mapsdk.map.MapView getMapView() {
        return this.mapView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        if (bundle == null) {
            bundle = getArguments();
        }
        if (this.mapView == null) {
            com.tencent.tencentmap.mapsdk.map.MapView mapView = new com.tencent.tencentmap.mapsdk.map.MapView(layoutInflater.getContext());
            this.mapView = mapView;
            mapView.onCreate(bundle);
        }
        com.tencent.mapsdk.rastercore.LogHelper.v("js", "QSupportMapFragment onCreateView ");
        return this.mapView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.mapView.onDestroy();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.mapView.onDestroyView();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(android.app.Activity activity, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mapView.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.mapView.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        this.mapView.onSaveInstanceState(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(android.os.Bundle bundle) {
        super.setArguments(bundle);
    }
}
