package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public class SupportMapFragment extends androidx.fragment.app.Fragment {
    private com.tencent.tencentmap.mapsdk.maps.TencentMap mTencentMap;
    protected com.tencent.tencentmap.mapsdk.maps.MapView mapV = null;
    private boolean isOnTop = false;

    public static com.tencent.tencentmap.mapsdk.maps.SupportMapFragment newInstance(android.content.Context context) {
        com.tencent.tencentmap.mapsdk.maps.SupportMapFragment supportMapFragment = new com.tencent.tencentmap.mapsdk.maps.SupportMapFragment();
        supportMapFragment.initMap(context);
        return supportMapFragment;
    }

    public com.tencent.tencentmap.mapsdk.maps.TencentMap getMap() {
        if (this.mTencentMap == null) {
            this.mTencentMap = this.mapV.getMap();
        }
        return this.mTencentMap;
    }

    public void initMap(android.content.Context context) {
        this.mapV = onCreateMapView(context, null);
    }

    public com.tencent.tencentmap.mapsdk.maps.MapView onCreateMapView(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        return new com.tencent.tencentmap.mapsdk.maps.MapView(context, tencentMapOptions);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        if (this.mapV == null) {
            this.mapV = onCreateMapView(getActivity().getBaseContext(), null);
        }
        this.mapV.setOnTop(this.isOnTop);
        return this.mapV;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.mapV.onDestroy();
        super.onDestroy();
        this.mapV = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.mapV.onDestroy();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.mapV.onPause();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        this.mapV.onResume();
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        this.mapV.onStart();
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.mapV.onStop();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(android.os.Bundle bundle) {
        super.setArguments(bundle);
    }

    public void setOnTop(boolean z17) {
        this.isOnTop = z17;
    }
}
