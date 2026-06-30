package h00;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h00.h f277820a = new h00.h();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f277821b = jz5.h.b(h00.g.f277819d);

    /* renamed from: c, reason: collision with root package name */
    public static boolean f277822c = true;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f277823d = jz5.h.b(h00.d.f277815d);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f277824e = new java.util.concurrent.ConcurrentHashMap();

    public static void a(h00.h hVar, int i17, android.os.Bundle bundle, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            bundle = null;
        }
        hVar.getClass();
        if (((java.lang.Boolean) ((jz5.n) f277821b).getValue()).booleanValue()) {
            if (i17 != 1 || !f277822c) {
                pm0.v.L("MicroMsg.EcsInitCgiHandler", true, new h00.f(i17, bundle));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsInitCgiHandler", "isFirstAppForeground true , coincides with SceneProcessBoot");
                f277822c = false;
            }
        }
    }
}
