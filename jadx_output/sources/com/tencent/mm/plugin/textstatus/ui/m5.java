package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes10.dex */
public final class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f174090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusCommentTransparentActivity f174091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f174092f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f174093g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f174094h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f174095i;

    public m5(int i17, com.tencent.mm.plugin.textstatus.ui.TextStatusCommentTransparentActivity textStatusCommentTransparentActivity, java.lang.String str, java.lang.String str2, boolean z17, long j17) {
        this.f174090d = i17;
        this.f174091e = textStatusCommentTransparentActivity;
        this.f174092f = str;
        this.f174093g = str2;
        this.f174094h = z17;
        this.f174095i = j17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v28 */
    @Override // java.lang.Runnable
    public final void run() {
        c61.z6 z6Var;
        long j17;
        boolean z17;
        java.lang.String str;
        ?? r37;
        java.lang.String textStatusId = this.f174093g;
        com.tencent.mm.plugin.textstatus.ui.TextStatusCommentTransparentActivity context = this.f174091e;
        int i17 = this.f174090d;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            com.tencent.mm.plugin.textstatus.ui.bc bcVar = com.tencent.mm.plugin.textstatus.ui.TextStatusHalfScreenLikeListUI.f173626i;
            androidx.appcompat.app.AppCompatActivity context2 = context.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            bcVar.a(context2, textStatusId);
            return;
        }
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        com.tencent.mm.plugin.textstatus.ui.l5 l5Var = new com.tencent.mm.plugin.textstatus.ui.l5(textStatusId, context);
        ((c61.l7) b6Var).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String userName = this.f174092f;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(textStatusId, "textStatusId");
        ci4.b bVar = (ci4.b) pf5.z.f353948a.a(context).a(ci4.b.class);
        c61.z6 z6Var2 = new c61.z6(l5Var);
        bVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTextStatusCommentClick() called with: refCommentId = ");
        long j18 = this.f174095i;
        sb6.append(j18);
        sb6.append(", userName = ");
        sb6.append(userName);
        sb6.append(", textStatusId = ");
        sb6.append(textStatusId);
        sb6.append(", isExpired = ");
        boolean z18 = this.f174094h;
        sb6.append(z18);
        sb6.append(", closeCallback = ");
        sb6.append(z6Var2);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentUIC", sb6.toString());
        if (bVar.f41714d == null) {
            int i18 = com.tencent.mm.plugin.finder.uniComments.b.f130201b;
            androidx.appcompat.app.AppCompatActivity activity = bVar.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
            android.view.View decorView = bVar.getActivity().getWindow().getDecorView();
            kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
            mMActivity.getWindow().setSoftInputMode(50);
            com.tencent.mm.plugin.finder.uniComments.b bVar2 = new com.tencent.mm.plugin.finder.uniComments.b(2, false, null, 4, null);
            int i19 = com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer.S;
            com.tencent.mm.plugin.finder.uniComments.a2 a2Var = new com.tencent.mm.plugin.finder.uniComments.a2(new com.tencent.mm.plugin.finder.uniComments.o0(mMActivity));
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer textStatusCommentDrawer = new com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer(mMActivity);
            android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i27 = b17.x;
            int i28 = b17.y;
            java.lang.System.nanoTime();
            boolean z19 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!z19) {
                if (i28 >= i27) {
                    i27 = i28;
                }
                i28 = i27;
            }
            j17 = j18;
            textStatusCommentDrawer.setTopOffset((int) (i28 * 0.25d));
            android.content.Context context3 = textStatusCommentDrawer.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            a2Var.f130181u = context3;
            a2Var.f130175o = textStatusCommentDrawer;
            textStatusCommentDrawer.setSquaresBackgroundResource(com.tencent.mm.R.drawable.f482180b66);
            textStatusCommentDrawer.setEnableClickBackgroundToCloseDrawer(true);
            textStatusCommentDrawer.f213559s.add(a2Var);
            a2Var.e().setScene(2);
            a2Var.e().setSelfProfile(a2Var.e().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String() == 1);
            com.tencent.mm.plugin.finder.uniComments.d dVar = a2Var.f130167d;
            com.tencent.mm.plugin.finder.uniComments.o0 o0Var = dVar instanceof com.tencent.mm.plugin.finder.uniComments.o0 ? (com.tencent.mm.plugin.finder.uniComments.o0) dVar : null;
            if (o0Var != null) {
                o0Var.f130325g = 70;
            }
            kotlin.jvm.internal.o.e(dVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawerPresenter");
            ((com.tencent.mm.plugin.finder.uniComments.o0) dVar).f130340y = false;
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawer", "[initView] bottomMargin= " + com.tencent.mm.ui.bl.g(mMActivity));
            ((android.widget.FrameLayout) decorView).addView(textStatusCommentDrawer, layoutParams);
            android.widget.FrameLayout headerLayout = textStatusCommentDrawer.getHeaderLayout();
            kotlin.jvm.internal.o.g(headerLayout, "headerLayout");
            a2Var.f130176p = headerLayout;
            android.view.View inflate = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.cyr, headerLayout);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.d4v);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            a2Var.f130171h = (android.widget.TextView) findViewById;
            android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.d4u);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            a2Var.f130172i = (android.widget.TextView) findViewById2;
            android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.ear);
            kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
            a2Var.f130182v = findViewById3;
            android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.eap);
            kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
            a2Var.f130170g = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.iiy);
            android.widget.TextView textView = a2Var.f130171h;
            if (textView == null) {
                kotlin.jvm.internal.o.o("headerTitleTv");
                throw null;
            }
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.byz);
            if (findViewById5 != null) {
                findViewById5.setOnClickListener(new com.tencent.mm.plugin.finder.uniComments.x1(a2Var));
            }
            if (findViewById5 != null) {
                com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares textStatusRecyclerViewDrawerSquares = a2Var.e().f213551h;
                if (!textStatusRecyclerViewDrawerSquares.getIgnoreInterceptViewList().contains(findViewById5)) {
                    textStatusRecyclerViewDrawerSquares.getIgnoreInterceptViewList().add(findViewById5);
                }
            }
            com.tencent.mm.view.RefreshLoadMoreLayout rlLayout = textStatusCommentDrawer.getCenterLayout();
            kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
            a2Var.f130173m = rlLayout;
            android.view.View inflate2 = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.czr, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            rlLayout.setLoadMoreFooter(inflate2);
            rlLayout.setBackgroundColor(i65.a.d(mMActivity, com.tencent.mm.R.color.f478490b));
            androidx.recyclerview.widget.RecyclerView recyclerView = rlLayout.getRecyclerView();
            recyclerView.setItemAnimator(null);
            recyclerView.setHasFixedSize(true);
            recyclerView.setItemViewCacheSize(4);
            androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                z17 = z18;
            } else {
                z17 = z18;
                itemAnimator.f12171f = 0L;
            }
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(mMActivity));
            recyclerView.setAdapter(((com.tencent.mm.plugin.finder.uniComments.o0) dVar).e(mMActivity));
            int dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
            recyclerView.setPadding(dimensionPixelSize, recyclerView.getPaddingTop(), dimensionPixelSize, recyclerView.getPaddingBottom());
            if (com.tencent.mm.ui.bk.C()) {
                recyclerView.setRecycledViewPool(a2Var.f130169f);
            } else {
                recyclerView.setRecycledViewPool(a2Var.f130168e);
            }
            recyclerView.i(new com.tencent.mm.plugin.finder.uniComments.t1(a2Var, mMActivity));
            int[] iArr = new int[4];
            iArr[0] = (int) mMActivity.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
            str = "MicroMsg.TextStatus.TextStatusCommentDrawer";
            z6Var = z6Var2;
            recyclerView.N(new dx2.a(new android.graphics.drawable.ColorDrawable(mMActivity.getResources().getColor(com.tencent.mm.R.color.BW_90)), (int) mMActivity.getResources().getDimension(com.tencent.mm.R.dimen.f480414x9), iArr, (int) mMActivity.getResources().getDimension(com.tencent.mm.R.dimen.x_)));
            java.lang.Object parent = rlLayout.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
            a2Var.e().getFooterLayout().addOnLayoutChangeListener(new com.tencent.mm.plugin.finder.uniComments.u1(a2Var, (android.view.View) parent));
            android.widget.FrameLayout footerLayout = textStatusCommentDrawer.getFooterLayout();
            kotlin.jvm.internal.o.g(footerLayout, "footerLayout");
            android.view.View findViewById6 = com.tencent.mm.ui.id.b(mMActivity).inflate(com.tencent.mm.R.layout.cyq, footerLayout).findViewById(com.tencent.mm.R.id.eat);
            kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
            a2Var.f130174n = (com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter) findViewById6;
            a2Var.f().setBackClickListener(new com.tencent.mm.plugin.finder.uniComments.v1(a2Var));
            a2Var.f().setSwitchSceneListener(new com.tencent.mm.plugin.finder.uniComments.w1(a2Var));
            a2Var.f().setSelfProfile(a2Var.e().isSelfProfile);
            a2Var.f().setScene(a2Var.e().getSceneForReply());
            a2Var.f().setBanSwitchScene(a2Var.e().getBanSwitch());
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusTimelineDrawerBuilder", "drawerFooter.scene " + a2Var.f().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String());
            a2Var.f().l(false);
            a2Var.f().k(false);
            a2Var.e().setKeyboardHeightObserver(a2Var.f());
            a2Var.e().setFooter(a2Var.f());
            android.widget.FrameLayout loadingLayout = textStatusCommentDrawer.getLoadingLayout();
            kotlin.jvm.internal.o.g(loadingLayout, "loadingLayout");
            a2Var.f130177q = loadingLayout;
            android.view.View inflate3 = android.view.LayoutInflater.from(mMActivity).inflate(com.tencent.mm.R.layout.cyx, (android.view.ViewGroup) loadingLayout, true);
            android.view.View findViewById7 = inflate3.findViewById(com.tencent.mm.R.id.c7i);
            kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
            a2Var.f130178r = findViewById7;
            android.view.View findViewById8 = inflate3.findViewById(com.tencent.mm.R.id.f486141kc0);
            kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
            a2Var.f130179s = findViewById8;
            android.view.View findViewById9 = inflate3.findViewById(com.tencent.mm.R.id.m2a);
            kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
            a2Var.f130180t = findViewById9;
            android.view.View view = a2Var.f130178r;
            if (view == null) {
                kotlin.jvm.internal.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View i29 = a2Var.i();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(i29, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i29.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(i29, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View j19 = a2Var.j();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(j19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            j19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(j19, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bVar2.f130202a = textStatusCommentDrawer;
            bVar.f41714d = bVar2;
        } else {
            z6Var = z6Var2;
            j17 = j18;
            z17 = z18;
            str = "MicroMsg.TextStatus.TextStatusCommentDrawer";
        }
        com.tencent.mm.plugin.finder.uniComments.b bVar3 = bVar.f41714d;
        if (bVar3 != null) {
            iv2.a aVar = new iv2.a("", textStatusId, userName, z17);
            int i37 = com.tencent.mm.plugin.finder.uniComments.b.f130201b;
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer textStatusCommentDrawer2 = bVar3.f130202a;
            if (textStatusCommentDrawer2 != null) {
                textStatusCommentDrawer2.setOnCloseDrawerCallback(z6Var);
            }
            com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer textStatusCommentDrawer3 = bVar3.f130202a;
            if (textStatusCommentDrawer3 != 0) {
                int i38 = com.tencent.mm.plugin.finder.uniComments.TextStatusCommentDrawer.S;
                textStatusCommentDrawer3.isOnlyShowDesc = false;
                textStatusCommentDrawer3.showFooter = true;
                if (aVar.f295120c) {
                    textStatusCommentDrawer3.showFooter = false;
                }
                textStatusCommentDrawer3.closeComment = false;
                textStatusCommentDrawer3.oldVersion = false;
                textStatusCommentDrawer3.banSwitch = false;
                textStatusCommentDrawer3.com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String = 0;
                com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter = textStatusCommentDrawer3.footer;
                if (textStatusCommentFooter != null) {
                    textStatusCommentFooter.setBanSwitchScene(false);
                }
                com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter2 = textStatusCommentDrawer3.footer;
                if (textStatusCommentFooter2 != null) {
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter.N;
                    r37 = 1;
                    textStatusCommentFooter2.l(true);
                } else {
                    r37 = 1;
                }
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                if (t70Var.C2() > 0) {
                    t70Var.c3(t70Var.C2() - r37);
                }
                textStatusCommentDrawer3.k(r37);
                if (textStatusCommentDrawer3.getVisibility() == 0) {
                    return;
                }
                com.tencent.mars.xlog.Log.i(str, "openDrawer: username=" + aVar.f295119b + ", statusId=" + aVar.f295118a);
                textStatusCommentDrawer3.feedObj = aVar;
                long j27 = j17;
                textStatusCommentDrawer3.refCommentId = j27;
                textStatusCommentDrawer3.isSingleMode = false;
                textStatusCommentDrawer3.replyCommentObj = null;
                textStatusCommentDrawer3.blinkRefComment = true;
                boolean z27 = j27 == 0;
                com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares textStatusRecyclerViewDrawerSquares2 = textStatusCommentDrawer3.f213551h;
                com.tencent.mars.xlog.Log.i("DrawerSquares", "[openDrawer] isOpening=" + textStatusRecyclerViewDrawerSquares2.isOpening + ", canCloseDrawerWhenStop=" + z27);
                if (textStatusRecyclerViewDrawerSquares2.isOpening) {
                    return;
                }
                textStatusRecyclerViewDrawerSquares2.setCanCloseDrawerWhenStop(z27);
                com.tencent.mm.ui.tools.f5 f5Var = textStatusRecyclerViewDrawerSquares2.f213574o;
                if (f5Var != null) {
                    f5Var.f210400e = textStatusRecyclerViewDrawerSquares2;
                }
                cn5.k kVar = textStatusRecyclerViewDrawerSquares2.onOpenDrawerListener;
                if (kVar != null) {
                    kVar.c(true, true, 0);
                }
                textStatusRecyclerViewDrawerSquares2.isOpening = true;
                if (textStatusRecyclerViewDrawerSquares2.getHeight() <= 0.0f) {
                    textStatusRecyclerViewDrawerSquares2.f213576q = new cn5.u(textStatusRecyclerViewDrawerSquares2, 0);
                } else {
                    textStatusRecyclerViewDrawerSquares2.setTranslationY(textStatusRecyclerViewDrawerSquares2.getHeight());
                    ((cn5.r) textStatusRecyclerViewDrawerSquares2.f213577r).invoke(new cn5.v(textStatusRecyclerViewDrawerSquares2));
                }
                textStatusRecyclerViewDrawerSquares2.setVisibility(0);
            }
        }
    }
}
