package k91;

/* loaded from: classes4.dex */
public final class g3 {

    /* renamed from: a, reason: collision with root package name */
    public static final k91.g3 f305592a = new k91.g3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f305593b = jz5.h.b(k91.f3.f305581d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f305594c = "%s_private_infos";

    public final int a(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f305593b).getValue();
        java.lang.String format = java.lang.String.format(f305594c, java.util.Arrays.copyOf(new java.lang.Object[]{appId}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        int o17 = o4Var.o(format, 0);
        com.tencent.mars.xlog.Log.i("Luggage.RequirePrivateInfoLogic", "getExtFlag %s, %d", appId, java.lang.Integer.valueOf(o17));
        return o17;
    }
}
