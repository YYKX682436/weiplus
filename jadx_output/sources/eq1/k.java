package eq1;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eq1.m f255824d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(eq1.m mVar) {
        super(0);
        this.f255824d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h.e().m(this.f255824d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FlutterBizGetPOIHelper", "stop locationGeo failed: " + e17.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
