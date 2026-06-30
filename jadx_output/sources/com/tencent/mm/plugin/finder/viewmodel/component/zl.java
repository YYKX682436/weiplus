package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class zl extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public so2.u1 f136689d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.tl f136690e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.playlist.e2 f136691f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f136692g;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.tencent.mm.protobuf.g f136693h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f136694i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f136695m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f136696n;

    /* renamed from: o, reason: collision with root package name */
    public int f136697o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.playlist.z1 f136698p;

    /* renamed from: q, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f136699q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f136700r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f136701s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f136702t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f136703u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f136691f = new com.tencent.mm.plugin.finder.playlist.e2();
        this.f136692g = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f136695m = true;
        this.f136696n = true;
        this.f136697o = -1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(6:18|19|(1:21)(1:28)|(1:23)|24|(2:26|27))|11|12|13))|31|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        r9 = kotlin.Result.INSTANCE;
        r8 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O6(com.tencent.mm.plugin.finder.viewmodel.component.zl r8, so2.q6 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof com.tencent.mm.plugin.finder.viewmodel.component.pl
            if (r0 == 0) goto L16
            r0 = r10
            com.tencent.mm.plugin.finder.viewmodel.component.pl r0 = (com.tencent.mm.plugin.finder.viewmodel.component.pl) r0
            int r1 = r0.f135559f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f135559f = r1
            goto L1b
        L16:
            com.tencent.mm.plugin.finder.viewmodel.component.pl r0 = new com.tencent.mm.plugin.finder.viewmodel.component.pl
            r0.<init>(r8, r10)
        L1b:
            r5 = r0
            java.lang.Object r10 = r5.f135557d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f135559f
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L79
            goto L72
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.Result$Companion r10 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L79
            db2.t1 r1 = new db2.t1     // Catch: java.lang.Throwable -> L79
            android.app.Activity r8 = r8.getContext()     // Catch: java.lang.Throwable -> L79
            java.lang.String r10 = "context"
            kotlin.jvm.internal.o.g(r8, r10)     // Catch: java.lang.Throwable -> L79
            boolean r10 = r8 instanceof com.tencent.mm.ui.MMFragmentActivity     // Catch: java.lang.Throwable -> L79
            r3 = 0
            if (r10 == 0) goto L59
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8     // Catch: java.lang.Throwable -> L79
            pf5.z r10 = pf5.z.f353948a     // Catch: java.lang.Throwable -> L79
            pf5.v r8 = r10.a(r8)     // Catch: java.lang.Throwable -> L79
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r10 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r8 = r8.a(r10)     // Catch: java.lang.Throwable -> L79
            com.tencent.mm.plugin.finder.viewmodel.component.ny r8 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r8     // Catch: java.lang.Throwable -> L79
            goto L5a
        L59:
            r8 = r3
        L5a:
            if (r8 == 0) goto L60
            r45.qt2 r3 = r8.V6()     // Catch: java.lang.Throwable -> L79
        L60:
            r1.<init>(r9, r3)     // Catch: java.lang.Throwable -> L79
            r8 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f135559f = r2     // Catch: java.lang.Throwable -> L79
            r2 = r8
            java.lang.Object r10 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L79
            if (r10 != r0) goto L72
            goto L85
        L72:
            r45.oa1 r10 = (r45.oa1) r10     // Catch: java.lang.Throwable -> L79
            java.lang.Object r8 = kotlin.Result.m521constructorimpl(r10)     // Catch: java.lang.Throwable -> L79
            goto L84
        L79:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m521constructorimpl(r8)
        L84:
            r0 = r8
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.zl.O6(com.tencent.mm.plugin.finder.viewmodel.component.zl, so2.q6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void P6(com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar, boolean z17) {
        com.tencent.mm.plugin.finder.playlist.e2 e2Var = zlVar.f136691f;
        if (z17) {
            zlVar.f136701s = false;
            qr2.d dVar = qr2.e.f366070e;
            java.util.ArrayList arrayList = e2Var.f122296a;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = zlVar.f136700r;
            if (wxRecyclerAdapter != null) {
                qr2.d.a(dVar, arrayList, wxRecyclerAdapter, zlVar.f136695m, false, 8, null);
                return;
            } else {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
        }
        zlVar.f136702t = false;
        qr2.g gVar = qr2.h.f366071e;
        java.util.ArrayList arrayList2 = e2Var.f122296a;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = zlVar.f136700r;
        if (wxRecyclerAdapter2 != null) {
            qr2.g.a(gVar, arrayList2, wxRecyclerAdapter2, zlVar.f136694i, false, 8, null);
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }

    public static final void Q6(com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar, boolean z17) {
        r45.vx0 vx0Var;
        zlVar.getClass();
        so2.q6 q6Var = new so2.q6(null, 0, 0L, null, 0L, 0, null, null, 255, null);
        q6Var.f410555a = zlVar.f136693h;
        q6Var.f410556b = 16;
        q6Var.f410557c = zlVar.R6().getFeedObject().getId();
        q6Var.f410558d = zlVar.R6().getFeedObject().getDupFlag();
        r45.dm2 object_extend = zlVar.R6().getFeedObject().getFeedObject().getObject_extend();
        if (object_extend != null && (vx0Var = (r45.vx0) object_extend.getCustom(0)) != null) {
            q6Var.f410559e = vx0Var.getLong(0);
        }
        q6Var.f410560f = z17 ? 1 : 0;
        kotlinx.coroutines.l.d(zlVar.f136692g, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.xl(z17, zlVar, q6Var, null), 3, null);
    }

    public final so2.u1 R6() {
        so2.u1 u1Var = this.f136689d;
        if (u1Var != null) {
            return u1Var;
        }
        kotlin.jvm.internal.o.o("attachFeed");
        throw null;
    }

    public final boolean S6(so2.u1 u1Var) {
        r45.vx0 vx0Var;
        r45.dm2 object_extend = u1Var.getFeedObject().getFeedObject().getObject_extend();
        return (object_extend == null || (vx0Var = (r45.vx0) object_extend.getCustom(0)) == null || vx0Var.getInteger(16) != 1) ? false : true;
    }

    public final void T6(int i17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f136699q;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int dimension = i17 == 0 ? 0 : (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f136699q;
        if (recyclerView2 != null) {
            recyclerView2.post(new com.tencent.mm.plugin.finder.viewmodel.component.yl(this, linearLayoutManager, i17, dimension));
        } else {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
    }

    public final void U6(boolean z17) {
        this.f136695m = z17;
        com.tencent.mars.xlog.Log.i("FinderHorizontalCollectionUIC", "set downContinue " + z17);
    }

    public final void V6(boolean z17) {
        this.f136694i = z17;
        com.tencent.mars.xlog.Log.i("FinderHorizontalCollectionUIC", "set upContinue " + z17);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }
}
