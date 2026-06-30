package m11;

/* loaded from: classes.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final m11.o1 f322765d = new m11.o1();

    public o1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean a17 = z65.c.a();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var != null) {
            a17 = ((h62.d) e0Var).fj(e42.c0.clicfg_android_wxa_image_by_msg_content, a17);
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaInfoMsgHelper", "wxaImageByMsgContent: " + valueOf.booleanValue());
        return valueOf;
    }
}
