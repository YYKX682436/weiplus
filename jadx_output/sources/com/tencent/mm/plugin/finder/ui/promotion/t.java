package com.tencent.mm.plugin.finder.ui.promotion;

/* loaded from: classes14.dex */
public final class t extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f129684d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f129685e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f129686f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f129687g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f129688h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f129689i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f129690m;

    /* renamed from: n, reason: collision with root package name */
    public final az2.f f129691n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f129692o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f129693p;

    /* renamed from: q, reason: collision with root package name */
    public long f129694q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f129695r;

    /* renamed from: s, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f129696s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f129697t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f129698u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f129699v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f129700w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f129701x;

    /* renamed from: y, reason: collision with root package name */
    public final int f129702y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.promotion.i f129703z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f129691n = az2.c.a(az2.f.f16125d, getContext(), null, 200L, null, 8, null);
        this.f129693p = new java.util.ArrayList();
        this.f129694q = -1L;
        this.f129696s = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f129702y = 9;
        this.f129703z = new com.tencent.mm.plugin.finder.ui.promotion.i(this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(2:21|22))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        r9 = kotlin.Result.INSTANCE;
        r8 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O6(com.tencent.mm.plugin.finder.ui.promotion.t r8, kotlin.coroutines.Continuation r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof com.tencent.mm.plugin.finder.ui.promotion.h
            if (r0 == 0) goto L16
            r0 = r9
            com.tencent.mm.plugin.finder.ui.promotion.h r0 = (com.tencent.mm.plugin.finder.ui.promotion.h) r0
            int r1 = r0.f129664f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f129664f = r1
            goto L1b
        L16:
            com.tencent.mm.plugin.finder.ui.promotion.h r0 = new com.tencent.mm.plugin.finder.ui.promotion.h
            r0.<init>(r8, r9)
        L1b:
            r5 = r0
            java.lang.Object r9 = r5.f129662d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f129664f
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L59
            goto L52
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L59
            db2.s0 r1 = new db2.s0     // Catch: java.lang.Throwable -> L59
            long r3 = r8.f129694q     // Catch: java.lang.Throwable -> L59
            java.lang.String r8 = r8.f129697t     // Catch: java.lang.Throwable -> L59
            r9 = 150(0x96, float:2.1E-43)
            r1.<init>(r3, r9, r8)     // Catch: java.lang.Throwable -> L59
            r8 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f129664f = r2     // Catch: java.lang.Throwable -> L59
            r2 = r8
            java.lang.Object r9 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L59
            if (r9 != r0) goto L52
            goto L65
        L52:
            r45.g61 r9 = (r45.g61) r9     // Catch: java.lang.Throwable -> L59
            java.lang.Object r8 = kotlin.Result.m521constructorimpl(r9)     // Catch: java.lang.Throwable -> L59
            goto L64
        L59:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m521constructorimpl(r8)
        L64:
            r0 = r8
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.promotion.t.O6(com.tencent.mm.plugin.finder.ui.promotion.t, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void P6(com.tencent.mm.plugin.finder.ui.promotion.t tVar) {
        if (tVar.f129698u && tVar.f129699v && !tVar.f129700w) {
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "requestLoadMore CgiGetFinderPromotionUser");
            tVar.f129700w = true;
            kotlinx.coroutines.l.d(tVar.f129696s, null, null, new com.tencent.mm.plugin.finder.ui.promotion.r(tVar, null), 3, null);
        }
    }

    public static final java.util.List Q6(com.tencent.mm.plugin.finder.ui.promotion.t tVar, r45.g61 g61Var) {
        tVar.getClass();
        java.util.LinkedList<r45.eb1> list = g61Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getHelp_promotion_infos(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (r45.eb1 eb1Var : list) {
            kotlin.jvm.internal.o.d(eb1Var);
            arrayList.add(new com.tencent.mm.plugin.finder.ui.promotion.e(eb1Var));
        }
        return arrayList;
    }

    public final android.view.View R6() {
        android.view.View view = this.f129688h;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("retryView");
        throw null;
    }

    public final void S6() {
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "requestInit CgiGetFinderPromotionUser");
        this.f129697t = null;
        T6(false);
        kotlinx.coroutines.l.d(this.f129696s, null, null, new com.tencent.mm.plugin.finder.ui.promotion.o(this, null), 3, null);
    }

    public final void T6(boolean z17) {
        this.f129698u = z17;
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "set continueFlag " + z17);
    }

    public final void U6() {
        android.widget.FrameLayout frameLayout = this.f129685e;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = this.f129686f;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f129687g;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View R6 = R6();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(R6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        R6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(R6, "com/tencent/mm/plugin/finder/ui/promotion/FinderPromotionUserListUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getRecyclerView().setVisibility(8);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f129690m;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setEnabled(false);
        } else {
            kotlin.jvm.internal.o.o("switchBtn");
            throw null;
        }
    }

    public final void V6(boolean z17) {
        this.f129691n.a();
        if (z17) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.app.Activity context = getContext();
            com.tencent.mm.plugin.finder.ui.promotion.i iVar = this.f129703z;
            kotlin.jvm.internal.o.g(context, "context");
            hb2.g gVar = hb2.g.f280044e;
            gVar.getClass();
            r45.bi2 bi2Var = new r45.bi2();
            bi2Var.set(0, 1);
            hb2.w0.m(gVar, bi2Var, iVar, false, false, null, null, 60, null);
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.app.Activity context2 = getContext();
        com.tencent.mm.plugin.finder.ui.promotion.i iVar2 = this.f129703z;
        kotlin.jvm.internal.o.g(context2, "context");
        hb2.g gVar2 = hb2.g.f280044e;
        gVar2.getClass();
        r45.bi2 bi2Var2 = new r45.bi2();
        bi2Var2.set(0, 2);
        hb2.w0.m(gVar2, bi2Var2, iVar2, false, false, null, null, 60, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.du9;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView getRecyclerView() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f129684d;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f129694q = getIntent().getLongExtra("promotion_feed_id", 0L);
        this.f129695r = getIntent().getStringExtra("promotion_author_finder_username");
        boolean booleanExtra = getIntent().getBooleanExtra("promotion_update_switch", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("promotion_update_switch_value", false);
        android.view.View findViewById = getRootView().findViewById(com.tencent.mm.R.id.t5s);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f129689i = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = getRootView().findViewById(com.tencent.mm.R.id.t5u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f129690m = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById2;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getRootView().findViewById(com.tencent.mm.R.id.t5v);
        android.view.View findViewById3 = getRootView().findViewById(com.tencent.mm.R.id.s1j);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f129684d = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById3;
        android.view.View findViewById4 = getRootView().findViewById(com.tencent.mm.R.id.s1i);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f129685e = (android.widget.FrameLayout) findViewById4;
        android.view.View findViewById5 = getRootView().findViewById(com.tencent.mm.R.id.oai);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f129686f = findViewById5;
        android.view.View findViewById6 = getRootView().findViewById(com.tencent.mm.R.id.oao);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f129687g = findViewById6;
        android.view.View findViewById7 = getRootView().findViewById(com.tencent.mm.R.id.oav);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f129688h = findViewById7;
        ((androidx.core.widget.NestedScrollView) getRootView().findViewById(com.tencent.mm.R.id.t5t)).setOnScrollChangeListener(new com.tencent.mm.plugin.finder.ui.promotion.j(this, viewGroup));
        android.widget.TextView textView = this.f129689i;
        if (textView == null) {
            kotlin.jvm.internal.o.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            throw null;
        }
        com.tencent.mm.ui.fk.b(textView);
        getRecyclerView().setHasFixedSize(true);
        getRecyclerView().setItemViewCacheSize(50);
        getRecyclerView().setNestedScrollingEnabled(false);
        androidx.recyclerview.widget.n2 itemAnimator = getRecyclerView().getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f129690m;
        if (mMSwitchBtn == null) {
            kotlin.jvm.internal.o.o("switchBtn");
            throw null;
        }
        mMSwitchBtn.setSwitchListener(new com.tencent.mm.plugin.finder.ui.promotion.k(this));
        U6();
        if (booleanExtra) {
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = this.f129690m;
            if (mMSwitchBtn2 == null) {
                kotlin.jvm.internal.o.o("switchBtn");
                throw null;
            }
            mMSwitchBtn2.setCheck(booleanExtra2);
            this.f129701x = true;
            V6(booleanExtra2);
            return;
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn3 = this.f129690m;
        if (mMSwitchBtn3 == null) {
            kotlin.jvm.internal.o.o("switchBtn");
            throw null;
        }
        mMSwitchBtn3.setCheck(!gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_PROMOTION_HIDE_BOOLEAN_SYNC, false));
        this.f129701x = false;
        S6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        kotlinx.coroutines.z0.e(this.f129696s, null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f129691n = az2.c.a(az2.f.f16125d, getContext(), null, 200L, null, 8, null);
        this.f129693p = new java.util.ArrayList();
        this.f129694q = -1L;
        this.f129696s = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f129702y = 9;
        this.f129703z = new com.tencent.mm.plugin.finder.ui.promotion.i(this);
    }
}
