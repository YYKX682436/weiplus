package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public final class o2 extends com.tencent.mm.plugin.fts.ui.f0 implements t13.j {

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f138132q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f138133r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f138134s;

    /* renamed from: t, reason: collision with root package name */
    public int f138135t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f138136u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f138137v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.tencent.mm.plugin.fts.ui.w0 w0Var, java.util.HashSet searchTypeSet, int i17) {
        super(w0Var);
        kotlin.jvm.internal.o.g(searchTypeSet, "searchTypeSet");
        android.content.Context h17 = h();
        kotlin.jvm.internal.o.f(h17, "getContext(...)");
        this.f138132q = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Vi(searchTypeSet, h17, this, i17);
        this.f138134s = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f138135t = -1;
        this.f138137v = new com.tencent.mm.plugin.fts.ui.n2(this, android.os.Looper.getMainLooper());
    }

    @Override // t13.j
    public void a(t13.k unit, java.lang.String query, boolean z17) {
        kotlin.jvm.internal.o.g(unit, "unit");
        kotlin.jvm.internal.o.g(query, "query");
        if (query.equals(this.f138050g)) {
            q();
        }
        new com.tencent.mm.plugin.fts.ui.m2(this, unit, query).run();
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void c() {
        super.c();
        java.util.LinkedList<t13.k> linkedList = this.f138132q;
        if (linkedList != null) {
            for (t13.k kVar : linkedList) {
                kVar.cancelSearch();
                kVar.c();
            }
        }
        this.f138137v.removeMessages(1);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public u13.g d(int i17) {
        java.util.LinkedList linkedList = this.f138132q;
        u13.g gVar = null;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext() && (gVar = ((t13.k) it.next()).b(i17)) == null) {
            }
        }
        return gVar;
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void f() {
        this.f138133r = false;
        this.f138135t = -1;
        q();
        g23.j.f267934e = 0L;
        java.lang.String str = this.f138050g;
        kotlin.jvm.internal.o.f(str, "getQuery(...)");
        g23.j.f267933d = str;
        com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct kFContactSessionSearchLogStruct = new com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct();
        kFContactSessionSearchLogStruct.q(g23.j.f267932c);
        kFContactSessionSearchLogStruct.f58543d = 4L;
        kFContactSessionSearchLogStruct.f58544e = g23.j.f267931b;
        kFContactSessionSearchLogStruct.p(g23.j.f267933d);
        kFContactSessionSearchLogStruct.f58546g = g23.j.f267934e;
        kFContactSessionSearchLogStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSKefuBoxReporter", "report 29105 " + kFContactSessionSearchLogStruct.m());
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void g() {
        super.g();
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public boolean k(android.view.View view, u13.g ftsDataItem, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(ftsDataItem, "ftsDataItem");
        java.util.LinkedList linkedList = this.f138132q;
        if (linkedList == null) {
            return false;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (((t13.k) it.next()).a(view, ftsDataItem, z17)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0, android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onScrollStateChanged(view, i17);
        if (i17 == 2) {
            this.f138136u = true;
            ((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).g();
            ((com.tencent.mm.plugin.sns.model.i1) p94.w0.d()).G();
        } else {
            this.f138136u = false;
            if (((com.tencent.mm.plugin.fts.n) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f137769c) {
                return;
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f138137v;
            n3Var.removeMessages(1);
            n3Var.sendEmptyMessageDelayed(1, 200L);
        }
    }

    public final void q() {
        java.util.LinkedList linkedList = this.f138132q;
        if (linkedList != null) {
            int i17 = this.f138135t + 1;
            this.f138135t = i17;
            if (i17 < linkedList.size()) {
                java.lang.Object obj = linkedList.get(this.f138135t);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                ((t13.k) obj).f(this.f138050g, this.f138134s, new java.util.HashSet(), 0L);
            }
        }
    }
}
