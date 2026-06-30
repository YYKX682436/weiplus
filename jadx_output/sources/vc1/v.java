package vc1;

/* loaded from: classes13.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc1.w f435184d;

    public v(vc1.w wVar) {
        this.f435184d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        vc1.w wVar = this.f435184d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "setMarkerIconFromStream attachMarkerIcon, url=%s", wVar.f435190a);
        vc1.x xVar = wVar.f435191b;
        vc1.p1 p1Var = xVar.f435202p;
        java.lang.String str = xVar.f435195f;
        com.tencent.mapsdk.raster.model.Marker marker = xVar.f435196g;
        android.widget.FrameLayout frameLayout = xVar.f435198i;
        java.lang.String str2 = vc1.p1.E0;
        p1Var.Z(str, marker, frameLayout);
    }
}
