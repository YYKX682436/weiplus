package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public final class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.y1 f175103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f175104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.bz2 f175105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f175106g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wm4.y f175107h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f175108i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.f03 f175109m;

    public x1(com.tencent.mm.plugin.topstory.ui.home.y1 y1Var, android.view.View view, r45.bz2 bz2Var, int i17, wm4.y yVar, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var) {
        this.f175103d = y1Var;
        this.f175104e = view;
        this.f175105f = bz2Var;
        this.f175106g = i17;
        this.f175107h = yVar;
        this.f175108i = jbVar;
        this.f175109m = f03Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStoryTabBubbleUIC", "after tabview post delayed");
        android.view.View tabViewContainer = this.f175104e;
        kotlin.jvm.internal.o.f(tabViewContainer, "$tabViewContainer");
        com.tencent.mm.plugin.topstory.ui.home.y1 y1Var = this.f175103d;
        wm4.y yVar = this.f175107h;
        com.tencent.mm.plugin.topstory.ui.home.u1 u1Var = new com.tencent.mm.plugin.topstory.ui.home.u1(y1Var, this.f175106g, yVar);
        com.tencent.mm.plugin.topstory.ui.home.w1 w1Var = new com.tencent.mm.plugin.topstory.ui.home.w1(y1Var, yVar, this.f175108i, this.f175109m, this.f175104e);
        com.tencent.mm.plugin.topstory.ui.home.y1 y1Var2 = this.f175103d;
        y1Var2.getClass();
        r45.bz2 bz2Var = this.f175105f;
        r45.f03 f03Var = bz2Var.f371168e;
        java.lang.String str = f03Var != null ? f03Var.f373889f : null;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TopStoryTabBubbleUIC", "[doShowTips] title.isNullOrEmpty");
            return;
        }
        com.tencent.mm.plugin.topstory.ui.widget.TopStoryTipsPopupWindow topStoryTipsPopupWindow = new com.tencent.mm.plugin.topstory.ui.widget.TopStoryTipsPopupWindow(com.tencent.mm.ui.id.b(com.tencent.mm.sdk.platformtools.x2.f193071a).inflate(com.tencent.mm.R.layout.dor, (android.view.ViewGroup) null));
        topStoryTipsPopupWindow.setAnimationStyle(com.tencent.mm.R.style.f494619w4);
        topStoryTipsPopupWindow.setOutsideTouchable(true);
        android.graphics.Rect rect = new android.graphics.Rect();
        tabViewContainer.getGlobalVisibleRect(rect);
        topStoryTipsPopupWindow.setTouchInterceptor(new com.tencent.mm.plugin.topstory.ui.home.q1(y1Var2, rect, topStoryTipsPopupWindow));
        topStoryTipsPopupWindow.setFocusable(false);
        topStoryTipsPopupWindow.getContentView().setOnClickListener(new com.tencent.mm.plugin.topstory.ui.home.r1(topStoryTipsPopupWindow, u1Var));
        topStoryTipsPopupWindow.setOnDismissListener(new com.tencent.mm.plugin.topstory.ui.home.s1(w1Var));
        android.widget.TextView textView = (android.widget.TextView) topStoryTipsPopupWindow.getContentView().findViewById(com.tencent.mm.R.id.f487380r93);
        i95.m c17 = i95.n0.c(zy2.s6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.text.SpannableString l66 = zy2.s6.l6((zy2.s6) c17, str, (int) textView.getTextSize(), false, null, 0, false, null, 120, null);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        textView.setText(l66);
        android.widget.ImageView imageView = (android.widget.ImageView) topStoryTipsPopupWindow.getContentView().findViewById(com.tencent.mm.R.id.f487377r90);
        android.widget.ImageView imageView2 = (android.widget.ImageView) topStoryTipsPopupWindow.getContentView().findViewById(com.tencent.mm.R.id.f487378r91);
        android.widget.ImageView imageView3 = (android.widget.ImageView) topStoryTipsPopupWindow.getContentView().findViewById(com.tencent.mm.R.id.f487379r92);
        r45.f03 f03Var2 = bz2Var.f371168e;
        java.lang.String str2 = f03Var2 != null ? f03Var2.f373890g : null;
        if (str2 == null || str2.length() == 0) {
            imageView.setVisibility(8);
            imageView2.setVisibility(8);
            imageView3.setVisibility(0);
        } else {
            imageView.setVisibility(0);
            imageView2.setVisibility(0);
            imageView3.setVisibility(8);
            int h17 = i65.a.h(y1Var2.getActivity(), com.tencent.mm.R.dimen.f479704cz);
            gk0.k kVar = new gk0.k(h17, h17);
            r45.f03 f03Var3 = bz2Var.f371168e;
            java.lang.Integer valueOf = f03Var3 != null ? java.lang.Integer.valueOf(f03Var3.f373887d) : null;
            if ((valueOf != null && valueOf.intValue() == 11) || (valueOf != null && valueOf.intValue() == 13)) {
                z17 = true;
            } else {
                if ((valueOf == null || valueOf.intValue() != 12) && valueOf != null) {
                    valueOf.intValue();
                }
                z17 = false;
            }
            if (z17) {
                kVar.f272433d = 0.5f;
            } else {
                kVar.f272432c = i65.a.a(y1Var2.getContext(), 2.4f);
            }
            kVar.f272434e = com.tencent.mm.R.drawable.bhm;
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            if (str2 == null) {
                str2 = "";
            }
            ((h83.g) n0Var).wi(imageView, str2, kVar);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        topStoryTipsPopupWindow.f175279k = tabViewContainer;
        if (topStoryTipsPopupWindow.getBackground() == null) {
            topStoryTipsPopupWindow.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
        android.view.View contentView = topStoryTipsPopupWindow.getContentView();
        if (contentView != null) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = layoutParams.leftMargin;
            layoutParams2.rightMargin = layoutParams.rightMargin;
            layoutParams2.topMargin = layoutParams.topMargin;
            layoutParams2.bottomMargin = layoutParams.bottomMargin;
            contentView.setLayoutParams(layoutParams2);
            com.tencent.mm.ui.bk.t();
            int i17 = com.tencent.mm.ui.bk.t().heightPixels;
            int[] iArr = new int[2];
            tabViewContainer.getLocationInWindow(iArr);
            topStoryTipsPopupWindow.setWidth(-2);
            topStoryTipsPopupWindow.setHeight(-2);
            topStoryTipsPopupWindow.f175272d = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479701cx);
            topStoryTipsPopupWindow.f175273e = (i17 - iArr[1]) - tabViewContainer.getHeight();
            android.widget.FrameLayout frameLayout = topStoryTipsPopupWindow.f175269a;
            frameLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(topStoryTipsPopupWindow.f175272d, android.view.View.MeasureSpec.getMode(Integer.MIN_VALUE)), android.view.View.MeasureSpec.makeMeasureSpec(topStoryTipsPopupWindow.f175273e, android.view.View.MeasureSpec.getMode(Integer.MIN_VALUE)));
            topStoryTipsPopupWindow.setWidth(java.lang.Math.min(frameLayout.getMeasuredWidth(), topStoryTipsPopupWindow.f175272d));
            topStoryTipsPopupWindow.setHeight(java.lang.Math.min(frameLayout.getMeasuredHeight(), topStoryTipsPopupWindow.f175273e));
            frameLayout.getMeasuredWidth();
            frameLayout.getMeasuredHeight();
            tabViewContainer.getLocationInWindow(new int[2]);
            topStoryTipsPopupWindow.f175270b = 0;
            topStoryTipsPopupWindow.f175271c = 0;
            topStoryTipsPopupWindow.f175270b = (-(frameLayout.getMeasuredWidth() - tabViewContainer.getWidth())) / 2;
            topStoryTipsPopupWindow.f175271c -= com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv);
            topStoryTipsPopupWindow.f175276h = 0;
            topStoryTipsPopupWindow.f175277i = new in4.c0(topStoryTipsPopupWindow, tabViewContainer);
            tabViewContainer.getViewTreeObserver().addOnGlobalLayoutListener(topStoryTipsPopupWindow.f175277i);
            if (topStoryTipsPopupWindow.isShowing()) {
                topStoryTipsPopupWindow.update(tabViewContainer, topStoryTipsPopupWindow.f175270b, topStoryTipsPopupWindow.f175271c, topStoryTipsPopupWindow.getWidth(), topStoryTipsPopupWindow.getHeight());
            } else {
                topStoryTipsPopupWindow.showAsDropDown(tabViewContainer, topStoryTipsPopupWindow.f175270b, topStoryTipsPopupWindow.f175271c);
            }
        }
        tabViewContainer.postDelayed(new com.tencent.mm.plugin.topstory.ui.home.t1(topStoryTipsPopupWindow), 5000L);
    }
}
