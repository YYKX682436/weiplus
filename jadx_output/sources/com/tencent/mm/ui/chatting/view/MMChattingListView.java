package com.tencent.mm.ui.chatting.view;

/* loaded from: classes9.dex */
public class MMChattingListView extends com.tencent.mm.ui.base.MMPullDownView implements db5.j5, db5.k5, db5.l5, db5.o5, db5.m5 {
    public static final /* synthetic */ int L1 = 0;
    public int A1;
    public boolean B1;
    public boolean C1;
    public android.os.Bundle D1;
    public int E1;
    public int F1;
    public int G1;
    public boolean H1;
    public final java.lang.Runnable I1;
    public boolean J1;
    public boolean K1;
    public com.tencent.mm.pluginsdk.ui.tools.v3 T;
    public com.tencent.mm.pluginsdk.ui.tools.u3 U;
    public ke5.f0 V;
    public final android.graphics.Rect W;

    /* renamed from: l1, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.hc f202843l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.graphics.Paint f202844p0;

    /* renamed from: p1, reason: collision with root package name */
    public final android.graphics.Rect f202845p1;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f202846x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.graphics.Paint f202847x1;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f202848y0;

    /* renamed from: y1, reason: collision with root package name */
    public float f202849y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.animation.ValueAnimator f202850z1;

    public MMChattingListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = new android.graphics.Rect();
        this.f202845p1 = new android.graphics.Rect();
        this.f202849y1 = 0.0f;
        this.A1 = -1;
        this.B1 = false;
        this.C1 = false;
        this.F1 = -1;
        this.G1 = Integer.MIN_VALUE;
        this.H1 = false;
        this.I1 = new com.tencent.mm.ui.chatting.view.o0(this);
        this.J1 = false;
        this.K1 = false;
        m(context);
    }

    private void setTopLoadViewRpt(final android.view.View view) {
        if (!(view.getContext() instanceof com.tencent.mm.ui.MMFragmentActivity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMChattingListView", "setTopLoadViewRpt getContext error");
            return;
        }
        com.tencent.mm.ui.MMFragmentActivity lifecycleOwner = (com.tencent.mm.ui.MMFragmentActivity) getContext();
        boolean z17 = te5.d2.f418627a;
        te5.a2 a2Var = new te5.a2();
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        java.lang.Object tag = view.getTag(112828121);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (kotlin.jvm.internal.o.b(tag, bool)) {
            return;
        }
        te5.c2 c2Var = new te5.c2(view, -208931566, a2Var);
        final kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = new te5.b2(c2Var);
        view.getViewTreeObserver().addOnScrollChangedListener((android.view.ViewTreeObserver.OnScrollChangedListener) h0Var.f310123d);
        lifecycleOwner.mo133getLifecycle().a(new androidx.lifecycle.f() { // from class: com.tencent.mm.ui.chatting.utils.TopLoadExpReportKt$onVisibilityChange$2
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onDestroy(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                view.getViewTreeObserver().removeOnScrollChangedListener((android.view.ViewTreeObserver.OnScrollChangedListener) h0Var.f310123d);
            }
        });
        view.setTag(112828121, bool);
    }

    @Override // db5.j5
    public boolean A5() {
        android.view.View childAt = getListView().getChildAt(getListView().getChildCount() - 1);
        if (childAt == null) {
            return true;
        }
        return childAt.getBottom() <= getListView().getHeight() - getListView().getPaddingBottom() && getListView().getLastVisiblePosition() == getListView().s().getCount() - 1;
    }

    @Override // db5.k5
    public boolean E0() {
        android.view.View childAt = getListView().getChildAt(getListView().getFirstVisiblePosition());
        return childAt != null && childAt.getTop() == 0;
    }

    @Override // db5.l5
    public boolean J6() {
        if (this.V.isLoading()) {
            return true;
        }
        this.E1 = getCurCount();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMChattingListView", "[onBottomLoadData] mPreCount:" + this.E1);
        ke5.f0 f0Var = this.V;
        if (f0Var != null) {
            f0Var.a(hd5.n.ACTION_BOTTOM, false, this.D1);
            this.D1 = null;
            this.C1 = false;
        }
        return false;
    }

    @Override // db5.o5
    public boolean a() {
        android.os.Bundle bundle;
        if (this.V.isLoading()) {
            return true;
        }
        this.E1 = getCurCount();
        this.G1 = Integer.MIN_VALUE;
        this.F1 = -1;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMChattingListView", "[onTopLoadData] mPreCount:" + this.E1 + " isForceTopLoadDataForPosition:" + this.C1);
        if (this.V != null) {
            if (this.C1 && (bundle = this.D1) != null) {
                bundle.putInt("SCENE", 2);
            }
            this.V.a(this.C1 ? hd5.n.ACTION_POSITION : hd5.n.ACTION_TOP, false, this.D1);
        }
        this.D1 = null;
        this.C1 = false;
        return false;
    }

    @Override // com.tencent.mm.ui.base.MMPullDownView
    public void e(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMChattingListView", "[forceTopLoadData] start:" + z17 + " isForceTopLoadDataForPosition:" + this.C1);
        if (this.C1) {
            return;
        }
        f(z17, i17, false);
    }

    @Override // com.tencent.mm.ui.base.MMPullDownView
    public void g() {
        super.g();
        if (this.B1) {
            setTopLoadViewRpt(getChildAt(0));
        }
    }

    public com.tencent.mm.pluginsdk.ui.tools.u3 getBaseAdapter() {
        return this.U;
    }

    public int getBottomSpace() {
        int height = this.T.getHeight() - this.T.getPaddingBottom();
        if (this.T.getChildCount() <= 0) {
            return height;
        }
        android.view.View childAt = getListView().getChildAt(getListView().getChildCount() - 1);
        if (childAt == null || this.T.getLastVisiblePosition() != ((com.tencent.mm.pluginsdk.ui.tools.ChattingRecyclerView) this.T).s().getCount() - 1) {
            return 0;
        }
        return height - childAt.getBottom();
    }

    public int getCurCount() {
        com.tencent.mm.pluginsdk.ui.tools.u3 u3Var = this.U;
        if (u3Var == null) {
            return 0;
        }
        return u3Var.getCount();
    }

    public int getHeaderViewsCount() {
        return this.T.getHeaderViewsCount();
    }

    public com.tencent.mm.pluginsdk.ui.tools.v3 getListView() {
        return this.T;
    }

    public int getPersistentHighLightIndex() {
        return this.A1;
    }

    public int getPreCount() {
        return this.E1;
    }

    public int getPreloadFirstVisitPos() {
        return this.F1;
    }

    public int getPreloadFirstVisitViewTop() {
        return this.G1;
    }

    @Override // com.tencent.mm.ui.base.MMPullDownView
    public boolean h() {
        if (this.H1) {
            return true;
        }
        if (((sb5.z) ((ke5.a) this.V).f307041b.f460708c.a(sb5.z.class)) != null) {
            return ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) ((ke5.a) this.V).f307041b.f460708c.a(sb5.z.class))).R1;
        }
        return false;
    }

    @Override // com.tencent.mm.ui.base.MMPullDownView
    public boolean i() {
        int i17;
        boolean z17 = this.V instanceof ke5.s;
        try {
            i17 = java.lang.Integer.parseInt(j62.e.g().f(new com.tencent.mm.repairer.config.chatting.RepairerConfigMsgListTopPreLoadCount()));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMChattingListView", e17, "", new java.lang.Object[0]);
            i17 = 0;
        }
        return ((i17 > 0) && z17) ? false : true;
    }

    public final int k(android.view.View view) {
        android.widget.TextView textView;
        if (view == null || (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483696br1)) == null || textView.getVisibility() != 0) {
            return 0;
        }
        int height = textView.getHeight();
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return height > 0 ? height : i65.a.b(getContext(), 50);
    }

    public void l(boolean z17) {
        android.animation.ValueAnimator valueAnimator = this.f202850z1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f202850z1 = null;
        }
        float f17 = this.f202849y1;
        android.graphics.Rect rect = this.f202845p1;
        if (f17 <= 0.0f) {
            rect.setEmpty();
            this.A1 = -1;
            return;
        }
        if (!z17) {
            this.f202849y1 = 0.0f;
            rect.setEmpty();
            this.A1 = -1;
            this.T.postInvalidate();
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, 0.0f);
        this.f202850z1 = ofFloat;
        ofFloat.setDuration(300L);
        this.f202850z1.setInterpolator(new android.view.animation.DecelerateInterpolator());
        this.f202850z1.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.mm.ui.chatting.view.MMChattingListView$$a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                int i17 = com.tencent.mm.ui.chatting.view.MMChattingListView.L1;
                com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = com.tencent.mm.ui.chatting.view.MMChattingListView.this;
                mMChattingListView.getClass();
                float floatValue = ((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue();
                mMChattingListView.f202849y1 = floatValue;
                mMChattingListView.f202847x1.setAlpha((int) (floatValue * 255.0f));
                mMChattingListView.T.postInvalidate();
            }
        });
        this.f202850z1.addListener(new com.tencent.mm.ui.chatting.view.p0(this));
        this.f202850z1.start();
    }

    public final void m(android.content.Context context) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f202844p0 = paint;
        paint.setColor(-16777216);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f202847x1 = paint2;
        paint2.setColor(-16777216);
        com.tencent.mm.pluginsdk.ui.tools.ScrollControlRecyclerView scrollControlRecyclerView = (com.tencent.mm.pluginsdk.ui.tools.ScrollControlRecyclerView) android.view.LayoutInflater.from(this.f197544y).inflate(com.tencent.mm.R.layout.f488588xy, (android.view.ViewGroup) null);
        scrollControlRecyclerView.setOnDrawListener(new com.tencent.mm.ui.chatting.view.j0(this));
        scrollControlRecyclerView.setItemAnimator(null);
        scrollControlRecyclerView.setLayoutAnimation(null);
        scrollControlRecyclerView.setMotionEventSplittingEnabled(false);
        scrollControlRecyclerView.setLayoutManager(new com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager(getContext()));
        jz5.g gVar = com.tencent.mm.ui.chatting.adapter.m.f198435a;
        scrollControlRecyclerView.setRecycledViewPool(new in5.a(50));
        this.T = scrollControlRecyclerView;
        scrollControlRecyclerView.setBackgroundDrawable(null);
        this.T.setSelector(com.tencent.mm.R.drawable.aoc);
        this.T.setCacheColorHint(0);
        this.T.setDivider(null);
        this.T.setPadding(0, 0, 0, i65.a.b(context, 6));
        this.T.setClipToPadding(false);
        this.T.setScrollBarStyle(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62);
        this.T.setId(com.tencent.mm.R.id.f483683bp0);
        setOverScrollMode(2);
        addView(this.T.f(), new android.widget.FrameLayout.LayoutParams(-1, -1));
        setCanOverScrool(false);
        d(false);
        c(false);
        setTopViewVisible(true);
        setOnBottomLoadDataListener(this);
        setOnTopLoadDataListener(this);
        setOnPreTopLoadDataListener(this);
        setAtBottomCallBack(this);
        setAtTopCallBack(this);
        setIsBottomShowAll(true);
        setIsTopShowAll(false);
        setBottomViewVisible(true);
        setNestedOverScrollEnabled(true);
        this.f202848y0 = false;
    }

    public void n() {
        int firstVisiblePosition = this.T.getFirstVisiblePosition();
        android.view.View F = ((com.tencent.mm.pluginsdk.ui.tools.ChattingRecyclerView) this.T).F(firstVisiblePosition);
        if (firstVisiblePosition < 0 || F == null) {
            return;
        }
        this.G1 = F.getTop();
        this.F1 = firstVisiblePosition - this.T.getHeaderViewsCount();
        this.T.getHeaderViewsCount();
    }

    public void o(int i17, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, android.os.Bundle bundle) {
        this.f202848y0 = true;
        if (com.tencent.mm.ui.bk.C()) {
            this.f202844p0.setColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
        } else {
            this.f202844p0.setColor(getResources().getColor(com.tencent.mm.R.color.f478712f3));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMChattingListView", "[newStyle] setfalse" + this.f202848y0);
        int max = java.lang.Math.max(0, i17);
        com.tencent.mm.pluginsdk.ui.tools.v3 v3Var = this.T;
        if (v3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMChattingListView", "null == listView index:%s", java.lang.Integer.valueOf(max));
            return;
        }
        android.view.View F = ((com.tencent.mm.pluginsdk.ui.tools.ChattingRecyclerView) v3Var).F(max);
        if (F == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMChattingListView", "null == view index:%s", java.lang.Integer.valueOf(max));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMChattingListView", "[setHighLightChild] index:%s view rect:%s headerCount:%s", java.lang.Integer.valueOf(max), new android.graphics.Rect(F.getLeft(), F.getTop(), F.getRight(), F.getBottom()), java.lang.Integer.valueOf(this.T.getHeaderViewsCount()));
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(com.tencent.mm.ui.bk.C() ? android.animation.PropertyValuesHolder.ofFloat("alpha", 0.0f, 0.08f, 0.08f, 0.08f, 0.08f, 0.08f, 0.0f) : android.animation.PropertyValuesHolder.ofFloat("alpha", 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.0f));
        android.widget.TextView textView = (android.widget.TextView) F.findViewById(com.tencent.mm.R.id.f483696br1);
        if (textView == null || textView.getVisibility() != 0) {
            this.f202846x0 = false;
        } else {
            this.f202846x0 = true;
        }
        F.clearAnimation();
        if (bundle != null) {
            android.os.Bundle bundle2 = bundle.getBundle("EXTRA_BUNDLE");
            if (bundle2 == null) {
                bundle2 = new android.os.Bundle();
            }
            int i18 = bundle2.getInt("locate_end", -1);
            int i19 = bundle2.getInt("locate_start", -1);
            r15.f fVar = (i19 == -1 || i18 == -1) ? null : new r15.f(i19, i18);
            if (fVar != null && (F.findViewById(com.tencent.mm.R.id.bkl) instanceof com.tencent.mm.ui.widget.MMNeat7extView)) {
                final com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) F.findViewById(com.tencent.mm.R.id.bkl);
                java.lang.CharSequence a17 = mMNeat7extView.a();
                com.tencent.mm.ui.chatting.hc hcVar = this.f202843l1;
                if (hcVar != null) {
                    hcVar.b();
                    this.f202843l1 = null;
                }
                com.tencent.mm.ui.chatting.ec ecVar = new com.tencent.mm.ui.chatting.ec(mMNeat7extView);
                ecVar.f200476d = true;
                com.tencent.mm.ui.chatting.hc hcVar2 = new com.tencent.mm.ui.chatting.hc(ecVar, null);
                this.f202843l1 = hcVar2;
                hcVar2.f201673e = fVar.f368644a;
                hcVar2.f201674f = fVar.f368645b;
                android.text.SpannableString spannableString = new android.text.SpannableString(a17);
                hcVar2.a(spannableString, getContext().getResources().getColor(com.tencent.mm.R.color.Brand_Alpha_0_3));
                if (mMNeat7extView.isLongClickable()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMChattingListView", "[setHighLightChild] should locate high select text,disable long click first");
                    mMNeat7extView.setLongClickable(false);
                    mMNeat7extView.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.view.MMChattingListView$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i27 = com.tencent.mm.ui.chatting.view.MMChattingListView.L1;
                            com.tencent.mm.ui.widget.MMNeat7extView.this.setLongClickable(true);
                        }
                    }, this.f202843l1.f201677i);
                }
                mMNeat7extView.c(spannableString, android.widget.TextView.BufferType.SPANNABLE, null);
            }
            if (!msgIdTalker.equals(com.tencent.mm.plugin.msg.MsgIdTalker.f149479g) && (F.findViewById(com.tencent.mm.R.id.sr8) instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView)) {
                bundle2.getBoolean("is_from_mediagroup_tongue", false);
                int i27 = bundle2.getInt("is_from_mediagroup_unread_count", 0);
                com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView) F.findViewById(com.tencent.mm.R.id.sr8);
                chattingMediaGroupMvvmView.setFromNewsJumpInfo(new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.e1(i27));
                com.tencent.mm.storage.f9 f27 = pt0.f0.f2(msgIdTalker.a(), msgIdTalker.f149480d);
                com.tencent.mars.xlog.Log.i("MicroMsg.MMChattingListView", "[setHighLightChild] msgInfo:%s", msgIdTalker);
                chattingMediaGroupMvvmView.D(f27);
            }
        }
        ofPropertyValuesHolder.addUpdateListener(new com.tencent.mm.ui.chatting.view.m0(this, F));
        ofPropertyValuesHolder.addListener(new com.tencent.mm.ui.chatting.view.n0(this));
        ofPropertyValuesHolder.setDuration(1150L);
        ofPropertyValuesHolder.start();
    }

    @Override // com.tencent.mm.ui.base.MMPullDownView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.J1) {
            this.J1 = false;
            this.K1 = true;
        }
    }

    public void p(boolean z17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMChattingListView", "[setInterruptTouch] interrupt:%s recoverDelayTimeMs:%s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17));
        this.H1 = z17;
        java.lang.Runnable runnable = this.I1;
        removeCallbacks(runnable);
        if (z17) {
            postDelayed(runnable, j17);
        }
    }

    public final void q() {
        if (com.tencent.mm.ui.bk.C()) {
            this.f202847x1.setColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
        } else {
            this.f202847x1.setColor(getResources().getColor(com.tencent.mm.R.color.f478712f3));
        }
    }

    public void r(int i17, boolean z17) {
        if (this.T == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMChattingListView", "[showPersistentHighLight] null == listView index:%s", java.lang.Integer.valueOf(i17));
            return;
        }
        int max = java.lang.Math.max(0, i17);
        final android.view.View F = ((com.tencent.mm.pluginsdk.ui.tools.ChattingRecyclerView) this.T).F(max);
        if (F == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMChattingListView", "[showPersistentHighLight] null == view index:%s", java.lang.Integer.valueOf(max));
            l(false);
            return;
        }
        this.A1 = max;
        q();
        float f17 = com.tencent.mm.ui.bk.C() ? 0.08f : 0.1f;
        final int k17 = k(F);
        android.animation.ValueAnimator valueAnimator = this.f202850z1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f202850z1 = null;
        }
        if (!z17) {
            this.f202849y1 = f17;
            this.f202847x1.setAlpha((int) (f17 * 255.0f));
            s(F, k17);
            this.T.postInvalidate();
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, f17);
        this.f202850z1 = ofFloat;
        ofFloat.setDuration(300L);
        this.f202850z1.setInterpolator(new android.view.animation.DecelerateInterpolator());
        this.f202850z1.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.mm.ui.chatting.view.MMChattingListView$$c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                int i18 = com.tencent.mm.ui.chatting.view.MMChattingListView.L1;
                com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = com.tencent.mm.ui.chatting.view.MMChattingListView.this;
                mMChattingListView.getClass();
                float floatValue = ((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue();
                mMChattingListView.f202849y1 = floatValue;
                mMChattingListView.f202847x1.setAlpha((int) (floatValue * 255.0f));
                mMChattingListView.s(F, k17);
                mMChattingListView.T.postInvalidate();
            }
        });
        this.f202850z1.start();
    }

    public final void s(android.view.View view, int i17) {
        android.graphics.Rect rect = this.f202845p1;
        view.getGlobalVisibleRect(rect);
        rect.top = view.getTop() + i17;
        rect.bottom = view.getBottom();
    }

    public void setAdapter(com.tencent.mm.pluginsdk.ui.tools.u3 u3Var) {
        this.U = u3Var;
        getListView().k(this.U);
    }

    public void setHighLightChild(int i17) {
        int max = java.lang.Math.max(0, i17);
        com.tencent.mm.pluginsdk.ui.tools.v3 v3Var = this.T;
        if (v3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMChattingListView", "null == listView index:%s", java.lang.Integer.valueOf(max));
            return;
        }
        android.view.View childAt = v3Var.getChildAt(max);
        if (childAt == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMChattingListView", "null == view index:%s", java.lang.Integer.valueOf(max));
            return;
        }
        if (childAt.getBottom() - childAt.getTop() <= 0) {
            com.tencent.mm.pluginsdk.ui.tools.v3 v3Var2 = this.T;
            childAt = v3Var2.getChildAt(v3Var2.getHeaderViewsCount() + max);
        }
        if (childAt == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMChattingListView", "null == view index:%s", java.lang.Integer.valueOf(max + this.T.getHeaderViewsCount()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMChattingListView", "[setHighLightChild] index:%s view rect:%s headerCount:%s", java.lang.Integer.valueOf(max), new android.graphics.Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()), java.lang.Integer.valueOf(this.T.getHeaderViewsCount()));
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("alpha", 0.0f, 0.85f, 0.85f, 0.85f, 0.85f, 0.85f, 0.0f));
        ofPropertyValuesHolder.addUpdateListener(new com.tencent.mm.ui.chatting.view.k0(this, childAt));
        ofPropertyValuesHolder.addListener(new com.tencent.mm.ui.chatting.view.l0(this));
        ofPropertyValuesHolder.setDuration(1600L);
        ofPropertyValuesHolder.start();
    }

    public void setHighLightChildNew(int i17) {
        o(i17, com.tencent.mm.plugin.msg.MsgIdTalker.f149479g, null);
    }

    public void setLoadExecutor(ke5.f0 f0Var) {
        ke5.f0 f0Var2 = this.V;
        if (f0Var2 != null) {
            ((ke5.a) f0Var2).f307044e = null;
        }
        this.V = f0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMChattingListView", "initResetLoadStateListener");
        ((ke5.a) this.V).f307044e = new com.tencent.mm.ui.chatting.view.i0(this);
    }

    public MMChattingListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.W = new android.graphics.Rect();
        this.f202845p1 = new android.graphics.Rect();
        this.f202849y1 = 0.0f;
        this.A1 = -1;
        this.B1 = false;
        this.C1 = false;
        this.F1 = -1;
        this.G1 = Integer.MIN_VALUE;
        this.H1 = false;
        this.I1 = new com.tencent.mm.ui.chatting.view.o0(this);
        this.J1 = false;
        this.K1 = false;
        m(context);
    }
}
