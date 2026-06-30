package uw;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw.s f431502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(uw.s sVar) {
        super(0);
        this.f431502d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h.e().m(this.f431502d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FlutterBSGetPoiHelper", "stop locationGeo failed: " + e17.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
