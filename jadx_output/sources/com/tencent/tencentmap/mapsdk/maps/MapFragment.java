package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public class MapFragment extends android.app.Fragment {
    private com.tencent.tencentmap.mapsdk.maps.TencentMap mTencentMap;
    protected com.tencent.tencentmap.mapsdk.maps.MapView mapV = null;
    private boolean isOnTop = true;

    public static com.tencent.tencentmap.mapsdk.maps.MapFragment newInstance(android.content.Context context) {
        com.tencent.tencentmap.mapsdk.maps.MapFragment mapFragment = new com.tencent.tencentmap.mapsdk.maps.MapFragment();
        mapFragment.initMap(context);
        return mapFragment;
    }

    public com.tencent.tencentmap.mapsdk.maps.TencentMap getMap() {
        if (this.mTencentMap == null) {
            this.mTencentMap = this.mapV.getMap();
        }
        return this.mTencentMap;
    }

    public void initMap(android.content.Context context) {
        if (this.mapV == null) {
            this.mapV = onCreateMapView(context.getApplicationContext(), null);
        }
    }

    @Override // android.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
    }

    @Override // android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    public com.tencent.tencentmap.mapsdk.maps.MapView onCreateMapView(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.TencentMapOptions tencentMapOptions) {
        return new com.tencent.tencentmap.mapsdk.maps.MapView(context, tencentMapOptions);
    }

    @Override // android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        if (this.mapV == null) {
            this.mapV = onCreateMapView(getActivity().getBaseContext(), null);
        }
        this.mapV.setOnTop(this.isOnTop);
        return this.mapV;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.mapV.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.mapV.onDestroy();
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onInflate(android.app.Activity activity, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public void onPause() {
        this.mapV.onPause();
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        this.mapV.onResume();
        super.onResume();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        this.mapV.onStart();
        super.onStart();
    }

    @Override // android.app.Fragment
    public void onStop() {
        this.mapV.onStop();
        super.onStop();
    }

    @Override // android.app.Fragment
    public void setArguments(android.os.Bundle bundle) {
        super.setArguments(bundle);
    }

    public void setOnTop(boolean z17) {
        this.isOnTop = z17;
    }
}
