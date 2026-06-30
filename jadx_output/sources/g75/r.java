package g75;

/* loaded from: classes10.dex */
public final class r implements androidx.lifecycle.y {

    /* renamed from: p, reason: collision with root package name */
    public static final g75.k f269391p = new g75.k(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f269392d;

    /* renamed from: e, reason: collision with root package name */
    public final g75.z f269393e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f269394f;

    /* renamed from: g, reason: collision with root package name */
    public g75.s f269395g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f269396h;

    /* renamed from: i, reason: collision with root package name */
    public final i75.a f269397i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f269398m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f269399n;

    /* renamed from: o, reason: collision with root package name */
    public final j75.k f269400o;

    public r(java.util.Set set, g75.z zVar, java.lang.String str, g75.s sVar, boolean z17) {
        this.f269392d = set;
        this.f269393e = zVar;
        this.f269394f = str;
        this.f269395g = sVar;
        this.f269396h = z17;
        this.f269397i = new i75.a(this);
        jz5.g b17 = jz5.h.b(new g75.q(this));
        this.f269398m = b17;
        this.f269399n = new java.util.HashSet();
        this.f269400o = new j75.k(zVar, this, "MicroMsg.Pipeline.Pipeline", (com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) b17).getValue());
    }

    public static final void a(g75.r rVar) {
        java.util.HashSet hashSet;
        com.tencent.mars.xlog.Log.i("MicroMsg.Pipeline.Pipeline", "onCreate " + rVar.hashCode());
        rVar.f269397i.d();
        java.util.Iterator it = rVar.f269392d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashSet = rVar.f269399n;
            if (!hasNext) {
                try {
                    break;
                } catch (java.lang.IllegalArgumentException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Pipeline.Pipeline", e17, "onCreate", new java.lang.Object[0]);
                    g75.z zVar = new g75.z();
                    zVar.l("ErrCode", -1);
                    rVar.e(-1, zVar);
                    rVar.c();
                    return;
                }
            }
            hashSet.add((g75.t) ((java.lang.Class) it.next()).getConstructor(g75.r.class).newInstance(rVar));
        }
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            ((g75.t) it6.next()).getClass();
        }
        java.util.Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            ((g75.t) it7.next()).c();
        }
        java.util.Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            ((g75.t) it8.next()).d();
        }
    }

    public static final void b(g75.r rVar) {
        rVar.getClass();
        try {
            java.util.Iterator it = rVar.f269399n.iterator();
            while (it.hasNext()) {
                ((g75.t) it.next()).e();
            }
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Pipeline.Pipeline", e17, "onDestroy", new java.lang.Object[0]);
            g75.z zVar = new g75.z();
            zVar.l("ErrCode", -2);
            rVar.e(-1, zVar);
            rVar.c();
        }
        rVar.f269397i.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.Pipeline.Pipeline", "onDestroy " + rVar.hashCode());
    }

    public final void c() {
        if (this.f269396h) {
            d75.b.g(new g75.l(this));
        } else {
            v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) this.f269398m).getValue(), null, new g75.m(this, null), 1, null);
        }
    }

    public final g75.r d() {
        if (this.f269396h) {
            d75.b.g(new g75.n(this));
        } else {
            v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) this.f269398m).getValue(), null, new g75.o(this, null), 1, null);
        }
        return this;
    }

    public final void e(int i17, g75.z data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResult ");
        sb6.append(hashCode());
        sb6.append(' ');
        java.lang.String str = this.f269394f;
        sb6.append(str);
        sb6.append(' ');
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Pipeline.Pipeline", sb6.toString());
        g75.s sVar = this.f269395g;
        if (sVar != null) {
            sVar.a(new g75.x(str, i17, data));
        }
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f269397i;
    }

    public /* synthetic */ r(java.util.Set set, g75.z zVar, java.lang.String str, g75.s sVar, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(set, zVar, str, (i17 & 8) != 0 ? null : sVar, (i17 & 16) != 0 ? false : z17);
    }
}
