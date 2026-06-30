package vc1;

/* loaded from: classes13.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mapsdk.raster.model.Marker f434963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc1.q2 f434964e;

    public f0(vc1.p1 p1Var, com.tencent.mapsdk.raster.model.Marker marker, vc1.q2 q2Var) {
        this.f434963d = marker;
        this.f434964e = q2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        vc1.o2 o2Var = this.f434964e.f435148s;
        this.f434963d.setInfoWindowOffset(o2Var.f435049p, o2Var.f435050q);
    }
}
