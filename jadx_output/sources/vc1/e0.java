package vc1;

/* loaded from: classes13.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mapsdk.raster.model.Marker f434956d;

    public e0(vc1.p1 p1Var, com.tencent.mapsdk.raster.model.Marker marker) {
        this.f434956d = marker;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f434956d.showInfoWindow();
    }
}
