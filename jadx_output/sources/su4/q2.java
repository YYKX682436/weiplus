package su4;

/* loaded from: classes8.dex */
public class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f413050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f413051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f413052f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f413053g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f413054h;

    public q2(int i17, boolean z17, int i18, java.util.Map map, boolean z18) {
        this.f413050d = i17;
        this.f413051e = z17;
        this.f413052f = i18;
        this.f413053g = map;
        this.f413054h = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.search.RepairerConfigWebSearchPreloadWebView()) != 1) {
            return;
        }
        int i17 = this.f413050d;
        java.lang.String f17 = su4.r2.f(i17);
        java.util.Map b17 = su4.r2.b(i17, this.f413051e, 0);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        hashMap.putAll(this.f413053g);
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        hashMap.put("inputMarginTop", "32");
        hashMap.put("inputMarginLeftRight", "24");
        hashMap.put("inputHeight", "48");
        hashMap.put("isPreload", "1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i18 = this.f413052f;
        sb6.append(i18);
        sb6.append("");
        hashMap.put("preloadForScene", sb6.toString());
        java.lang.String e17 = su4.r2.e(b17, 0);
        if (android.text.TextUtils.isEmpty(e17)) {
            return;
        }
        su4.v2.a().b(e17, this.f413054h, i18);
    }
}
