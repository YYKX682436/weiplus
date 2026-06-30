package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public final class q1 extends com.tencent.mm.plugin.fts.ui.f0 implements t13.j {

    /* renamed from: q, reason: collision with root package name */
    public final int f138147q;

    /* renamed from: r, reason: collision with root package name */
    public final int f138148r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f138149s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f138150t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.tencent.mm.plugin.fts.ui.w0 ftsBaseUIComponent, int i17, int i18) {
        super(ftsBaseUIComponent);
        kotlin.jvm.internal.o.g(ftsBaseUIComponent, "ftsBaseUIComponent");
        this.f138147q = i17;
        this.f138148r = i18;
        this.f138149s = jz5.h.b(new com.tencent.mm.plugin.fts.ui.p1(this));
        this.f138150t = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    }

    @Override // t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        n(((t13.k) ((jz5.n) this.f138149s).getValue()).j(0));
        notifyDataSetChanged();
        l(getCount(), true);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public u13.g d(int i17) {
        u13.g b17 = ((t13.k) ((jz5.n) this.f138149s).getValue()).b(i17);
        kotlin.jvm.internal.o.f(b17, "createDataItem(...)");
        return b17;
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0
    public void f() {
        ((t13.k) ((jz5.n) this.f138149s).getValue()).f(this.f138050g, this.f138150t, new java.util.HashSet(), 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        a23.g gVar2;
        com.tencent.mm.plugin.fts.ui.w0 w0Var = this.f138047d;
        if (w0Var instanceof com.tencent.mm.plugin.fts.ui.FTSBizDetailUI) {
            kotlin.jvm.internal.o.e(w0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSBizDetailUI");
            com.tencent.mm.plugin.fts.ui.FTSBizDetailUI fTSBizDetailUI = (com.tencent.mm.plugin.fts.ui.FTSBizDetailUI) w0Var;
            if (fTSBizDetailUI.f137948r && (gVar instanceof zq1.e0)) {
                sr1.a0 a0Var = (sr1.a0) ((zq1.e0) gVar);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(a0Var.f411450t) && (gVar2 = fTSBizDetailUI.f137950t) != null) {
                    java.lang.String str = a0Var.f411450t;
                    kotlin.jvm.internal.o.f(str, "getNickName(...)");
                    gVar2.a(str, true, fTSBizDetailUI.h7(), fTSBizDetailUI.g7(), java.lang.String.valueOf(fTSBizDetailUI.H));
                }
            }
        }
        return ((t13.k) ((jz5.n) this.f138149s).getValue()).a(view, gVar, z17);
    }

    @Override // com.tencent.mm.plugin.fts.ui.f0, android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.lang.String str;
        super.onScroll(absListView, i17, i18, i19);
        com.tencent.mm.plugin.fts.ui.w0 w0Var = this.f138047d;
        if (w0Var instanceof com.tencent.mm.plugin.fts.ui.FTSBizDetailUI) {
            kotlin.jvm.internal.o.e(w0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.FTSBizDetailUI");
            com.tencent.mm.plugin.fts.ui.FTSBizDetailUI fTSBizDetailUI = (com.tencent.mm.plugin.fts.ui.FTSBizDetailUI) w0Var;
            kotlin.jvm.internal.o.e(absListView, "null cannot be cast to non-null type android.widget.ListView");
            android.widget.ListView listView = (android.widget.ListView) absListView;
            int headerViewsCount = listView.getHeaderViewsCount();
            com.tencent.mm.plugin.fts.ui.q1 q1Var = fTSBizDetailUI.f137951u;
            r45.h55 h55Var = fTSBizDetailUI.E;
            if (q1Var == null || h55Var == null) {
                return;
            }
            android.view.View view = fTSBizDetailUI.f137954x;
            if (view != null && listView.getLastVisiblePosition() >= q1Var.getCount() + headerViewsCount && view.getVisibility() == 0 && fTSBizDetailUI.f137945J == 1) {
                int k17 = i65.a.k(fTSBizDetailUI);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                if (view.getMeasuredHeight() + iArr[1] <= k17) {
                    fTSBizDetailUI.f137945J = 2;
                    fTSBizDetailUI.k7(h55Var, 2);
                }
            }
            android.widget.LinearLayout linearLayout = fTSBizDetailUI.f137956z;
            if (linearLayout == null || listView.getLastVisiblePosition() < q1Var.getCount() + headerViewsCount || linearLayout.getVisibility() != 0) {
                return;
            }
            int k18 = i65.a.k(fTSBizDetailUI);
            int childCount = linearLayout.getChildCount();
            for (int i27 = 0; i27 < childCount; i27++) {
                android.view.View childAt = linearLayout.getChildAt(i27);
                int[] iArr2 = new int[2];
                childAt.getLocationOnScreen(iArr2);
                int measuredHeight = childAt.getMeasuredHeight() + iArr2[1];
                java.lang.Object tag = childAt.getTag();
                kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FTSRelatedSugItem");
                r45.jo0 jo0Var = (r45.jo0) tag;
                if (measuredHeight <= k18) {
                    java.util.HashSet hashSet = fTSBizDetailUI.I;
                    r45.di6 di6Var = jo0Var.f377986d;
                    if (di6Var == null || (str = di6Var.f372513e) == null) {
                        str = "";
                    }
                    if (hashSet.add(str)) {
                        fTSBizDetailUI.j7(jo0Var, h55Var, 2);
                    }
                }
            }
        }
    }
}
