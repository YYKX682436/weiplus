package je2;

/* loaded from: classes3.dex */
public final class t extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f299263f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f299264g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f299265h;

    /* renamed from: i, reason: collision with root package name */
    public it2.z f299266i;

    /* renamed from: m, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f299267m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f299268n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f299269o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f299270p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f299271q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f299272r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f299273s;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.lifecycle.j0 f299274t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f299275u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f299276v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Set f299277w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f299263f = "LiveGiftSlice";
        this.f299264g = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f299267m = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.FALSE);
        this.f299268n = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f299269o = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f299270p = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f299271q = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f299273s = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f299274t = new androidx.lifecycle.j0(null);
        this.f299275u = new java.util.ArrayList();
        this.f299276v = new java.util.ArrayList();
        this.f299277w = new java.util.LinkedHashSet();
    }

    public static com.tencent.mm.plugin.finder.reward.view.MagicRewardView N6(je2.t tVar, java.lang.String str, android.view.ViewGroup root, int i17, android.view.ViewGroup.LayoutParams layoutParams, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            str = "";
        }
        java.lang.String source = str;
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        int i19 = i17;
        if ((i18 & 8) != 0) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        }
        android.view.ViewGroup.LayoutParams params = layoutParams;
        tVar.getClass();
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(params, "params");
        it2.z zVar = tVar.f299266i;
        if (zVar == null) {
            zVar = new it2.z();
        }
        it2.z zVar2 = zVar;
        tVar.f299266i = zVar2;
        return zVar2.a(source, kt2.c.f311972e, root, i19, params);
    }

    public static com.tencent.mm.plugin.finder.reward.view.MagicRewardView O6(je2.t tVar, java.lang.String str, android.view.ViewGroup root, int i17, android.view.ViewGroup.LayoutParams layoutParams, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            str = "";
        }
        java.lang.String source = str;
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        int i19 = i17;
        if ((i18 & 8) != 0) {
            layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        }
        android.view.ViewGroup.LayoutParams params = layoutParams;
        tVar.getClass();
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(params, "params");
        it2.z zVar = tVar.f299266i;
        if (zVar == null) {
            zVar = new it2.z();
        }
        it2.z zVar2 = zVar;
        tVar.f299266i = zVar2;
        return zVar2.a(source, kt2.c.f311971d, root, i19, params);
    }

    public final java.util.List P6() {
        java.util.List list = this.f299275u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!kz5.n0.O(this.f299277w, ((r45.oq1) obj).f382441d)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void Q6() {
        r45.oq1 oq1Var = (r45.oq1) kz5.n0.Z(P6());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update outer free gift = ");
        sb6.append(oq1Var != null ? je2.u.a(oq1Var) : null);
        com.tencent.mars.xlog.Log.i(this.f299263f, sb6.toString());
        this.f299274t.postValue(oq1Var);
    }

    public final void R6(r45.pq1 freeGiftInfo) {
        kotlin.jvm.internal.o.g(freeGiftInfo, "freeGiftInfo");
        synchronized (this) {
            if (freeGiftInfo.f383302d != ((mm2.e1) business(mm2.e1.class)).f328983m) {
                com.tencent.mars.xlog.Log.w(this.f299263f, "sync freegift but objectId " + freeGiftInfo.f383302d + " does not match current Object");
            }
            com.tencent.mars.xlog.Log.i(this.f299263f, "on receive free gift list " + je2.u.b(freeGiftInfo));
            java.lang.String str = this.f299263f;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("on receive free gift list when local received = ");
            java.util.List list = this.f299276v;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(je2.u.a((r45.oq1) it.next()));
            }
            sb6.append(arrayList);
            sb6.append("  sentGiftList = ");
            sb6.append(this.f299277w);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.LinkedList gift = freeGiftInfo.f383303e;
            kotlin.jvm.internal.o.f(gift, "gift");
            arrayList2.addAll(gift);
            java.util.Iterator it6 = ((java.util.ArrayList) this.f299276v).iterator();
            while (it6.hasNext()) {
                r45.oq1 oq1Var = (r45.oq1) it6.next();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
                java.util.Iterator it7 = arrayList2.iterator();
                while (it7.hasNext()) {
                    arrayList3.add(((r45.oq1) it7.next()).f382441d);
                }
                if (!arrayList3.contains(oq1Var.f382441d)) {
                    arrayList2.add(0, oq1Var);
                }
            }
            ((java.util.ArrayList) this.f299275u).clear();
            ((java.util.ArrayList) this.f299275u).addAll(arrayList2);
            java.lang.String str2 = this.f299263f;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append("save free gift list after merge ");
            java.util.List list2 = this.f299275u;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList4.add(je2.u.a((r45.oq1) it8.next()));
            }
            sb7.append(arrayList4);
            com.tencent.mars.xlog.Log.i(str2, sb7.toString());
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new je2.r(freeGiftInfo, this, null), 2, null);
        }
    }

    public final r45.ad5 S6(r45.oq1 oq1Var) {
        kotlin.jvm.internal.o.g(oq1Var, "<this>");
        r45.ad5 ad5Var = new r45.ad5();
        ad5Var.set(5, oq1Var.f382441d);
        ad5Var.set(6, java.lang.Long.valueOf(oq1Var.f382443f));
        ad5Var.set(1, 1L);
        return ad5Var;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        this.f299265h = false;
        it2.z zVar = this.f299266i;
        if (zVar != null) {
            zVar.b("onCleared", kt2.c.f311971d);
        }
        it2.z zVar2 = this.f299266i;
        if (zVar2 != null) {
            zVar2.b("onCleared", kt2.c.f311972e);
        }
        ((java.util.ArrayList) this.f299275u).clear();
        ((java.util.ArrayList) this.f299276v).clear();
        this.f299277w.clear();
        pm0.v.X(new je2.p(this));
    }
}
