package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class ChattingScrollLayout extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.OverScroller f190122d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f190123e;

    /* renamed from: f, reason: collision with root package name */
    public int f190124f;

    /* renamed from: g, reason: collision with root package name */
    public int f190125g;

    /* renamed from: h, reason: collision with root package name */
    public int f190126h;

    /* renamed from: i, reason: collision with root package name */
    public int f190127i;

    /* renamed from: m, reason: collision with root package name */
    public int f190128m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f190129n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f190130o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.view.MMChattingListView f190131p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f190132q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f190133r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f190134s;

    /* renamed from: t, reason: collision with root package name */
    public float f190135t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f190136u;

    public ChattingScrollLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getInterTranslationY() {
        int i17 = this.f190126h;
        if (i17 != 0) {
            return (int) (((this.f190124f * 1.0d) / i17) * this.f190128m);
        }
        return 0;
    }

    public boolean a(int i17) {
        android.view.View childAt;
        com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = this.f190131p;
        if (mMChattingListView != null && mMChattingListView.getListView() != null) {
            int lastVisiblePosition = (this.f190131p.getListView().getLastVisiblePosition() - this.f190131p.getListView().getHeaderViewsCount()) - (this.f190131p.getListView().getFirstVisiblePosition() - this.f190131p.getListView().getHeaderViewsCount());
            if (lastVisiblePosition >= 0 && lastVisiblePosition < this.f190131p.getListView().getChildCount() && (childAt = this.f190131p.getListView().getChildAt(lastVisiblePosition)) != null) {
                int[] iArr = new int[2];
                childAt.getLocationOnScreen(iArr);
                if (iArr[1] + childAt.getHeight() > com.tencent.mm.ui.bl.b(getContext()).y - i17) {
                    return true;
                }
            }
        }
        return false;
    }

    public void b(int i17, boolean z17, int i18, int i19) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingScrollLayout", "scrollContentTo: y:%s, targetScroll:%s, alwaysScroll:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f190125g), java.lang.Boolean.valueOf(this.f190132q));
        if (this.f190125g != i17 || this.f190132q) {
            this.f190125g = i17;
            if (i17 != 0) {
                this.f190126h = i17;
            }
            this.f190128m = i19;
            android.view.View view = (com.tencent.mm.ui.chatting.ChattingAnimFrame) findViewById(com.tencent.mm.R.id.bhk);
            if (view == null) {
                view = findViewById(com.tencent.mm.R.id.p2g);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingScrollLayout", "resizeChatAnimFrame: use view stub");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingScrollLayout", "resizeChatAnimFrame: use view");
            }
            if (view != null && (marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
                marginLayoutParams.bottomMargin = this.f190125g;
                view.setLayoutParams(marginLayoutParams);
            }
            this.f190122d.forceFinished(true);
            removeCallbacks(this.f190123e);
            com.tencent.mm.pluginsdk.ui.chat.m5 m5Var = new com.tencent.mm.pluginsdk.ui.chat.m5(this, i18, z17);
            this.f190123e = m5Var;
            post(m5Var);
        }
    }

    public final void c(boolean z17, boolean z18) {
        com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView = this.f190131p;
        if (mMChattingListView == null) {
            return;
        }
        int bottomSpace = mMChattingListView.getBottomSpace();
        float translationY = this.f190129n.getTranslationY();
        float interTranslationY = (bottomSpace > 0 ? bottomSpace + translationY : translationY) + getInterTranslationY();
        if (interTranslationY > 0.0f) {
            interTranslationY = 0.0f;
        }
        if (translationY == 0.0f && interTranslationY < 0.0f) {
            java.lang.String format = java.lang.String.format("updateListContent isValueException:%s footerTranslationY:%s bottomSpace:%s targetTranslate:%s curTranslationY:%s targetScroll:%s scroller.isFinished:%s isFromOnLayout:%s isFromScroller:%s lastTranslateY:%s targetTranslate:%s", java.lang.Boolean.TRUE, java.lang.Float.valueOf(translationY), java.lang.Integer.valueOf(bottomSpace), java.lang.Float.valueOf(interTranslationY), java.lang.Float.valueOf(this.f190131p.getTranslationY()), java.lang.Integer.valueOf(this.f190125g), java.lang.Boolean.valueOf(this.f190122d.isFinished()), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Float.valueOf(this.f190135t), java.lang.Float.valueOf(interTranslationY));
            com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
            errorMsgInfoStruct.f56113e = 2998L;
            errorMsgInfoStruct.f56117i = interTranslationY;
            errorMsgInfoStruct.f56118j = z17 ? 1L : 0L;
            errorMsgInfoStruct.f56119k = z18 ? 1L : 0L;
            errorMsgInfoStruct.r(format);
            errorMsgInfoStruct.k();
        }
        if (this.f190135t != interTranslationY) {
            if (z17 && this.f190122d.isFinished() && this.f190125g > 0 && interTranslationY < this.f190131p.getTranslationY() && fp.h.c(24)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingScrollLayout", "updateListContent called with animate:%s", java.lang.Float.valueOf(interTranslationY));
                android.view.ViewPropertyAnimator duration = this.f190131p.animate().translationY(interTranslationY).setDuration(100L);
                this.f190136u = duration;
                duration.start();
            } else {
                if (this.f190136u != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingScrollLayout", "tryCancelContentListViewPropertyAnimator called");
                    this.f190136u.cancel();
                    this.f190136u = null;
                }
                this.f190131p.setTranslationY(interTranslationY);
            }
        }
        this.f190135t = interTranslationY;
        if (z17) {
            return;
        }
        boolean z19 = z18 && this.f190122d.isFinished();
        java.util.Iterator it = new java.util.ArrayList(this.f190133r).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.pluginsdk.ui.chat.n5) it.next()).q(interTranslationY, z19);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f190122d.computeScrollOffset()) {
            this.f190124f = this.f190122d.getCurrY();
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                android.view.View childAt = getChildAt(i17);
                if (childAt != this.f190130o) {
                    childAt.setTranslationY(-this.f190124f);
                }
            }
            c(false, true);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f190127i = this.f190124f;
        } else {
            motionEvent.offsetLocation(0.0f, this.f190127i - this.f190124f);
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                this.f190127i = 0;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f190129n = findViewById(com.tencent.mm.R.id.f486092k52);
        this.f190130o = findViewById(com.tencent.mm.R.id.bki);
        this.f190131p = (com.tencent.mm.ui.chatting.view.MMChattingListView) findViewById(com.tencent.mm.R.id.bm6);
        if (this.f190130o == null) {
            this.f190130o = findViewById(com.tencent.mm.R.id.r3z);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingScrollLayout", "onLayout: %s, %s, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        super.onLayout(z17, i17, i18, i19, i27);
        java.lang.Runnable runnable = this.f190123e;
        if (runnable != null) {
            removeCallbacks(runnable);
            post(this.f190123e);
        }
        android.widget.OverScroller overScroller = this.f190122d;
        if (overScroller == null || !overScroller.isFinished()) {
            return;
        }
        c(true, true);
    }

    public void setAlwaysScroll(boolean z17) {
        this.f190132q = z17;
    }

    public ChattingScrollLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f190124f = 0;
        this.f190125g = 0;
        this.f190126h = 0;
        this.f190127i = 0;
        this.f190132q = false;
        this.f190133r = new java.util.LinkedList();
        this.f190134s = new java.util.LinkedList();
        this.f190135t = 0.0f;
        this.f190122d = new android.widget.OverScroller(getContext(), new y3.b());
    }
}
