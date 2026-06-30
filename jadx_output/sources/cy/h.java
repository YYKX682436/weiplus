package cy;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final cy.h f224666a = new cy.h();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f224667b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f224668c;

    public final void a() {
        if (f224668c) {
            return;
        }
        synchronized (this) {
            if (f224668c) {
                return;
            }
            f224668c = true;
            try {
                dy.a aVar = dy.a.f244522a;
                java.util.Map map = f224667b;
                if (map.containsKey("map")) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ChatbotCardSceneRegistry", "scene \"map\" re-registered, overriding previous builder");
                }
                map.put("map", aVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatbotCardSceneRegistry", "registerScene: map (total=" + map.size() + ')');
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatbotCardSceneRegistry", "registerAll failed: " + th6);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatbotCardSceneRegistry", "ensureInitialized: " + f224667b.size() + " scenes");
        }
    }
}
