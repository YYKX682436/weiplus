package j23;

/* loaded from: classes12.dex */
public final class y extends t13.b {

    /* renamed from: h, reason: collision with root package name */
    public java.util.HashSet f297292h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f297293i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f297294m;

    /* renamed from: n, reason: collision with root package name */
    public long f297295n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f297296o;

    /* renamed from: p, reason: collision with root package name */
    public long f297297p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f297298q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f297299r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f297300s;

    /* renamed from: t, reason: collision with root package name */
    public int f297301t;

    /* renamed from: u, reason: collision with root package name */
    public int f297302u;

    /* renamed from: v, reason: collision with root package name */
    public e23.b1 f297303v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.l f297304w;

    /* JADX WARN: Multi-variable type inference failed */
    public y(android.content.Context context, t13.j jVar, int i17) {
        super(context, jVar, i17);
        j75.f stateCenter;
        this.f297292h = new java.util.HashSet();
        this.f297296o = true;
        this.f297299r = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f297300s = "";
        this.f297301t = 3;
        if ((context instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) && (stateCenter = ((com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) context).getStateCenter()) != null) {
            stateCenter.z3((androidx.lifecycle.y) context, new j23.v(this, context, jVar));
        }
        this.f297302u = Integer.MAX_VALUE;
    }

    @Override // t13.k
    public u13.g b(int i17) {
        if (i17 != this.f297302u) {
            return null;
        }
        e23.b1 b1Var = new e23.b1(18, i17);
        java.lang.String str = this.f297294m;
        if (str == null) {
            str = "";
        }
        int i18 = 0;
        b1Var.f423762e = p13.r.b(str, false);
        this.f297303v = b1Var;
        java.util.LinkedList linkedList = this.f297298q;
        if (linkedList != null) {
            java.lang.String sugTitle = this.f297300s;
            int i19 = this.f297301t;
            kotlin.jvm.internal.o.g(sugTitle, "sugTitle");
            b1Var.f246785s = sugTitle;
            b1Var.f246784r = i19;
            java.util.LinkedList linkedList2 = b1Var.f246783q;
            linkedList2.clear();
            for (java.lang.Object obj : linkedList) {
                int i27 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.jo0 jo0Var = new r45.jo0();
                jo0Var.f377988f = o13.p.f342251d;
                jo0Var.f377987e = i18;
                jo0Var.f377986d = (r45.di6) obj;
                linkedList2.add(jo0Var);
                i18 = i27;
            }
        }
        yz5.l lVar = this.f297304w;
        if (lVar != null) {
            lVar.invoke(b1Var);
        }
        return b1Var;
    }

    @Override // t13.k
    public void c() {
        this.f297302u = Integer.MAX_VALUE;
        this.f297292h.clear();
        this.f297292h = new java.util.HashSet();
        this.f297296o = true;
        this.f297294m = null;
        this.f297295n = 0L;
        this.f297297p = 0L;
        this.f297303v = null;
        this.f297304w = null;
    }

    @Override // t13.k
    public void cancelSearch() {
        kotlinx.coroutines.r2 r2Var = this.f297293i;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // t13.k
    public long d() {
        return this.f297297p;
    }

    @Override // t13.k
    public int e() {
        int i17;
        e23.b1 b1Var = this.f297303v;
        if (b1Var != null) {
            i17 = b1Var.f246783q.size();
            if (i17 > 3) {
                i17 = 3;
            }
        } else {
            i17 = 0;
        }
        if (i17 == 0) {
            java.util.LinkedList linkedList = this.f297298q;
            if (!(linkedList == null || linkedList.isEmpty())) {
                java.util.LinkedList linkedList2 = this.f297298q;
                if (linkedList2 != null) {
                    return linkedList2.size();
                }
                return 0;
            }
        }
        return i17;
    }

    @Override // t13.k
    public void f(java.lang.String str, com.tencent.mm.sdk.platformtools.n3 n3Var, java.util.HashSet hashSet, long j17) {
        cancelSearch();
        this.f297294m = str;
        this.f297295n = j17;
        if (hashSet != null) {
            this.f297292h.addAll(hashSet);
        }
        this.f297299r.set(false);
        this.f297298q = null;
        this.f297300s = "";
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        this.f297293i = lifecycleScope != null ? v65.i.b(lifecycleScope, null, new j23.x(this, j17, str, null), 1, null) : null;
    }

    @Override // t13.k
    public java.util.LinkedList g() {
        return new java.util.LinkedList();
    }

    @Override // t13.k
    public int getType() {
        return 256;
    }

    @Override // t13.k
    public java.util.List h(long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p13.e eVar = new p13.e();
        long c17 = c01.id.c();
        eVar.f351079g = "SOSItemRelevant:" + this.f297294m;
        eVar.f351074b = this.f297302u;
        eVar.f351073a = 0;
        eVar.f351075c = 0;
        long j18 = c17 - j17;
        eVar.f351078f = j18;
        eVar.f351077e = j18;
        eVar.f351083k = c17;
        eVar.f351076d = 1;
        arrayList.add(eVar);
        return arrayList;
    }

    @Override // t13.k
    public int j(int i17) {
        if (this.f297296o) {
            this.f297302u = Integer.MAX_VALUE;
            return i17;
        }
        this.f297302u = i17;
        return i17 + 1;
    }
}
