package i55;

/* loaded from: classes8.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f288840a;

    /* renamed from: c, reason: collision with root package name */
    public long f288842c;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f288841b = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f288843d = new java.util.LinkedHashSet();

    public d(int i17) {
        this.f288840a = i17;
    }

    public void a(java.lang.ref.WeakReference weakView) {
        kotlin.jvm.internal.o.g(weakView, "weakView");
    }

    public abstract boolean b(java.lang.String str);

    public abstract java.lang.String c(java.lang.String str);

    public java.util.Map d() {
        return null;
    }

    public void e(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRedDotLogic", this.f288840a + " onPagePause");
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        java.util.Map map = this.f288841b;
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            g55.e eVar = (g55.e) entry.getValue();
            if (eVar.f268974m || eVar.f268964c != this.f288842c) {
                arrayList.add(str);
            }
        }
        for (java.lang.String str2 : arrayList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseRedDotLogic", str2 + " is disappear remove");
            map.remove(str2);
        }
    }

    public void f(long j17, java.lang.String prefKey) {
        kotlin.jvm.internal.o.g(prefKey, "prefKey");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = this.f288840a;
        sb6.append(i17);
        sb6.append(' ');
        sb6.append(prefKey);
        sb6.append("  on click");
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRedDotLogic", sb6.toString());
        i55.s sVar = i55.s.f288878a;
        boolean contains = this.f288843d.contains(prefKey);
        i55.s.f288882e.put(java.lang.Integer.valueOf(i17), new jz5.l(prefKey, java.lang.Boolean.valueOf(contains)));
    }

    public void g(long j17, java.lang.String redDotKey, java.util.Map map) {
        kotlin.jvm.internal.o.g(redDotKey, "redDotKey");
        g55.e eVar = (g55.e) ((java.util.LinkedHashMap) this.f288841b).get(redDotKey);
        if (eVar != null && eVar.f268973l) {
            eVar.f(j17, map);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(j17);
            sb6.append(' ');
            sb6.append(redDotKey);
            sb6.append(" on unexp  uuid ");
            java.lang.Object obj = eVar.d().get("tips_uuid");
            if (obj == null) {
                obj = "";
            }
            sb6.append(obj);
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseRedDotLogic", sb6.toString());
            h(c("red_dot_unexp"), eVar);
        }
        java.lang.String a17 = e55.e.f249667a.a(redDotKey);
        if (a17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseRedDotLogic", this.f288840a + " onRedDotUnExposure cur entry key = " + a17 + " remove");
            this.f288843d.remove(a17);
        }
    }

    public abstract void h(java.lang.String str, g55.e eVar);
}
