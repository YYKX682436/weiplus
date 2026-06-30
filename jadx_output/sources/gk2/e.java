package gk2;

/* loaded from: classes3.dex */
public final class e extends gk2.g implements androidx.lifecycle.y {

    /* renamed from: n, reason: collision with root package name */
    public static gk2.e f272471n;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f272472f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f272473g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.lifecycle.b0 f272474h;

    /* renamed from: i, reason: collision with root package name */
    public yg2.b f272475i;

    /* renamed from: m, reason: collision with root package name */
    public final gk2.h f272476m;

    static {
        new gk2.b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String tag) {
        super(tag);
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f272472f = tag;
        this.f272473g = "LiveBuContext_TAG";
        com.tencent.mars.xlog.Log.i("LiveBuContext_TAG", "init name = " + tag + ", hashCode = " + hashCode());
        this.f272474h = new androidx.lifecycle.b0(this, true);
        this.f272475i = new yg2.b(this, "liveScope");
        this.f272476m = new gk2.h();
    }

    public final androidx.lifecycle.c1 a(java.lang.Class bu6) {
        kotlin.jvm.internal.o.g(bu6, "bu");
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new gk2.a(this)).a(bu6);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return a17;
    }

    public void b() {
        com.tencent.mars.xlog.Log.i(this.f272473g, "clear name = " + this.f272472f + ", hashCode = " + hashCode());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveContext clear ");
        sb6.append(this.f272479d.size());
        com.tencent.mars.xlog.Log.i("LiveContext", sb6.toString());
        try {
            java.util.LinkedList<mm2.e> linkedList = new java.util.LinkedList();
            gk2.f fVar = this.f272479d;
            synchronized (fVar) {
                java.util.Iterator it = fVar.entrySet().iterator();
                while (it.hasNext()) {
                    java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
                    mm2.e eVar = value instanceof mm2.e ? (mm2.e) value : null;
                    if (eVar != null) {
                        linkedList.add(eVar);
                    }
                }
            }
            for (mm2.e eVar2 : linkedList) {
                com.tencent.mars.xlog.Log.i("LiveContext", "[reset] " + eVar2.hashCode());
                eVar2.onCleared();
                eVar2.f328964e.dead();
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "LiveContext clear");
        }
        pm0.v.X(new gk2.d(this));
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f272474h;
    }

    public java.lang.String toString() {
        return this.f272472f + '_' + a(mm2.c1.class);
    }

    public /* synthetic */ e(java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? "" : str);
    }
}
