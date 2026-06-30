package mm2;

/* loaded from: classes3.dex */
public final class x4 extends mm2.e {
    public final kotlinx.coroutines.flow.j2 A;
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData B;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f329528f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f329529g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f329530h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f329531i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f329532m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f329533n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f329534o;

    /* renamed from: p, reason: collision with root package name */
    public dk2.zf f329535p;

    /* renamed from: q, reason: collision with root package name */
    public int f329536q;

    /* renamed from: r, reason: collision with root package name */
    public int f329537r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f329538s;

    /* renamed from: t, reason: collision with root package name */
    public long f329539t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f329540u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Set f329541v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Map f329542w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f329543x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f329544y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329545z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329528f = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f329529g = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f329530h = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f329531i = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f329532m = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f329533n = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f329534o = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f329536q = -1;
        this.f329537r = -1;
        this.f329538s = true;
        this.f329541v = new java.util.LinkedHashSet();
        this.f329542w = new java.util.LinkedHashMap();
        this.f329544y = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f329545z = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.A = kotlinx.coroutines.flow.i3.a(null);
        this.B = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
    }

    public final boolean N6(java.lang.String msg, java.util.List variantMessages, java.lang.String logTag) {
        java.lang.Object obj;
        dk2.zf zfVar;
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(variantMessages, "variantMessages");
        kotlin.jvm.internal.o.g(logTag, "logTag");
        java.util.List list = this.f329528f;
        kotlin.jvm.internal.o.d(list);
        synchronized (list) {
            java.util.List list2 = this.f329528f;
            kotlin.jvm.internal.o.d(list2);
            java.util.ListIterator listIterator = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                dk2.zf zfVar2 = (dk2.zf) obj;
                if (zfVar2.getType() == 10001 && kz5.n0.O(variantMessages, zfVar2.j())) {
                    break;
                }
            }
            zfVar = (dk2.zf) obj;
        }
        if (!kotlin.jvm.internal.o.b(zfVar != null ? zfVar.j() : null, msg)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MMFinder.LiveMsgSlice", logTag + " skip duplicate, msg:" + msg);
        return true;
    }

    public final void O6(dk2.zf comment) {
        kotlin.jvm.internal.o.g(comment, "comment");
        try {
            int indexOf = this.f329528f.indexOf(comment);
            java.util.List list = this.f329528f;
            kotlin.jvm.internal.o.d(list);
            synchronized (list) {
                if (indexOf != -1) {
                    this.f329528f.remove(comment);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MMFinder.LiveMsgSlice", e17.toString());
        }
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        this.f329528f.clear();
        this.f329529g.clear();
        this.f329531i.clear();
        this.f329533n.clear();
        this.f329532m.clear();
        this.f329541v.clear();
        ((java.util.LinkedHashMap) this.f329542w).clear();
        this.f329530h.clear();
        this.f329544y.clear();
        this.f329538s = true;
        this.f329539t = 0L;
        this.f329543x = false;
    }
}
