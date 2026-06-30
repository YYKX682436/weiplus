package vb1;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final vb1.b f434473c = new vb1.b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f434474d = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f434475a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f434476b;

    public d(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f434475a = appId;
        com.tencent.mm.plugin.appbrand.x0.a(appId, new vb1.a(this));
        this.f434476b = new java.util.concurrent.ConcurrentHashMap();
    }

    public final void a(int i17, com.tencent.magicbrush.ui.MagicBrushView view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f434476b.put(java.lang.Integer.valueOf(i17), new vb1.c(view));
    }

    public final void b(int i17) {
        vb1.c cVar = (vb1.c) this.f434476b.get(java.lang.Integer.valueOf(i17));
        if (cVar == null) {
            return;
        }
        cVar.f434472b = false;
    }

    public final void c(int i17) {
        vb1.c cVar = (vb1.c) this.f434476b.get(java.lang.Integer.valueOf(i17));
        if (cVar == null) {
            return;
        }
        cVar.f434472b = true;
    }

    public final int d() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f434476b;
        int i17 = 0;
        if (!concurrentHashMap.isEmpty()) {
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((vb1.c) ((java.util.Map.Entry) it.next()).getValue()).f434472b) {
                    i17++;
                }
            }
        }
        return i17;
    }
}
