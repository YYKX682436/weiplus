package en5;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final en5.b f255347d = new en5.b();

    public b() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        float f17 = 2 * 8;
        en5.g.b(rz0.a.a(com.tencent.mm.R.raw.icons_filled_close2, rz0.a.b(com.tencent.mm.R.color.BW_100_Alpha_0_3, context), oVar, 0), f17, f17, null, oVar, com.tencent.mm.plugin.appbrand.jsapi.appdownload.v.CTRL_INDEX, 8);
        return jz5.f0.f302826a;
    }
}
