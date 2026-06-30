package ov0;

/* loaded from: classes5.dex */
public abstract class t extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.y {
    public final int L;
    public final int M;
    public final int N;
    public final jz5.g P;
    public final jz5.g Q;
    public final jz5.g R;
    public final jz5.g S;
    public final jz5.g T;
    public final jz5.g U;
    public final jz5.g V;
    public final jz5.g W;

    /* renamed from: l1, reason: collision with root package name */
    public final ov0.r f349147l1;

    /* renamed from: p0, reason: collision with root package name */
    public final jz5.g f349148p0;

    /* renamed from: p1, reason: collision with root package name */
    public ov0.f f349149p1;

    /* renamed from: x0, reason: collision with root package name */
    public final jz5.g f349150x0;

    /* renamed from: x1, reason: collision with root package name */
    public ov0.e f349151x1;

    /* renamed from: y0, reason: collision with root package name */
    public final java.util.ArrayList f349152y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.L = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.agt);
        this.M = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.agk);
        this.N = j65.q.a(context).getDimensionPixelSize(com.tencent.mm.R.dimen.ago);
        this.P = jz5.h.b(new ov0.q(this));
        this.Q = jz5.h.b(new ov0.s(this));
        this.R = jz5.h.b(new ov0.i(this));
        this.S = jz5.h.b(new ov0.j(this));
        this.T = jz5.h.b(new ov0.p(this));
        this.U = jz5.h.b(new ov0.o(this));
        this.V = jz5.h.b(new ov0.h(this));
        this.W = jz5.h.b(new ov0.k(this));
        this.f349148p0 = jz5.h.b(new ov0.n(this));
        this.f349150x0 = jz5.h.b(new ov0.g(this));
        this.f349152y0 = new java.util.ArrayList();
        this.f349147l1 = new ov0.r(this);
    }

    private final ov0.e getInitTabPage() {
        ov0.e eVar = ov0.e.f349125e;
        ov0.e eVar2 = (ov0.e) j("key_open_page", eVar);
        return eVar2 == null ? eVar : eVar2;
    }

    private final com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout getTabLayout() {
        java.lang.Object value = ((jz5.n) this.P).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MJSlidingTabLayout) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.viewpager.widget.ViewPager getViewPager() {
        java.lang.Object value = ((jz5.n) this.Q).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.viewpager.widget.ViewPager) value;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.y
    public void D(int i17, int i18) {
        if (i18 != 0) {
            int panelHeight = getPanelHeight();
            android.widget.LinearLayout linearLayout = this.f69212o;
            if (linearLayout.getHeight() != panelHeight) {
                linearLayout.getLayoutParams().height = panelHeight;
            }
        }
        getViewPager().getLayoutParams().height = i17;
        getViewPager().requestLayout();
    }

    public final void H() {
        com.tencent.mm.mj_publisher.finder.widgets.MJEditText editText = getSecondEditText();
        kotlin.jvm.internal.o.g(editText, "editText");
        editText.setInputType(0);
        editText.setCursorVisible(false);
        editText.setFocusableInTouchMode(false);
        getSecondEditText().setVisibility(8);
        getSecondDeleteBtn().setVisibility(8);
    }

    public float I(ov0.e page) {
        kotlin.jvm.internal.o.g(page, "page");
        if (page != ov0.e.f349126f) {
            return (page == ov0.e.f349125e || M()) ? getPanelHeight() : getPanelHeight();
        }
        float f17 = this.L;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.g3 a17 = n3.b1.a(this);
        e3.d a18 = a17 != null ? a17.a(2) : null;
        int c17 = (a18 != null ? a18.f247047d - a18.f247045b : com.tencent.mm.ui.bl.c(getContext())) - j65.q.a(getContext()).getDimensionPixelSize(com.tencent.mm.R.dimen.ajd);
        if (c17 < 0) {
            c17 = 0;
        }
        return f17 + c17;
    }

    public final void J() {
        getDeleteBtn().setVisibility(8);
    }

    public final void K(java.util.List tabs, ov0.f tabChangeListener) {
        kotlin.jvm.internal.o.g(tabs, "tabs");
        kotlin.jvm.internal.o.g(tabChangeListener, "tabChangeListener");
        this.f349149p1 = tabChangeListener;
        getViewPager().setAdapter(new pw0.j(tabs));
        java.util.ArrayList arrayList = this.f349152y0;
        arrayList.clear();
        arrayList.addAll(tabs);
        getTabLayout().setViewPager(getViewPager());
        getTabLayout().setOnTabSelectListener(this.f349147l1);
        getTabLayout().setSnapOnTabClick(true);
    }

    public abstract void L();

    public boolean M() {
        return getInitTabPage() == ov0.e.f349125e;
    }

    public boolean N() {
        return false;
    }

    public void O() {
        com.tencent.mm.mj_publisher.finder.widgets.MJEditText editText = getEditText();
        kotlin.jvm.internal.o.g(editText, "editText");
        editText.setInputType(131073);
        editText.setCursorVisible(true);
        editText.setFocusableInTouchMode(true);
        editText.setSelection(editText.getText().length());
        editText.requestFocus();
        if (N()) {
            getSecondEditText().setVisibility(0);
            com.tencent.mm.mj_publisher.finder.widgets.MJEditText editText2 = getSecondEditText();
            kotlin.jvm.internal.o.g(editText2, "editText");
            editText2.setInputType(1);
            editText2.setCursorVisible(true);
            editText2.setFocusableInTouchMode(true);
            editText2.setSelection(editText2.getText().length());
        } else {
            H();
        }
        com.tencent.mm.mj_publisher.finder.widgets.MJEditText editText3 = getEditText();
        kotlin.jvm.internal.o.g(editText3, "editText");
        android.content.res.Resources a17 = j65.q.a(getContext());
        editText3.setPadding(a17.getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), a17.getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv), a17.getDimensionPixelSize(com.tencent.mm.R.dimen.f479715d8), a17.getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv));
        editText3.setGravity(8388627);
        editText3.setVerticalScrollBarEnabled(true);
        editText3.setMaxLines(getEditTextMaxLineOnExpand());
        android.view.ViewGroup.LayoutParams layoutParams = editText3.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
        getContentContainer().setTranslationY(0.0f);
        E();
        F(I(ov0.e.f349125e), true, null, null);
    }

    public void P() {
        com.tencent.mm.mj_publisher.finder.widgets.MJEditText editText = getEditText();
        kotlin.jvm.internal.o.g(editText, "editText");
        editText.setInputType(0);
        editText.setCursorVisible(false);
        editText.setFocusableInTouchMode(false);
        C();
        J();
        H();
        boolean M = M();
        com.tencent.mm.mj_publisher.finder.widgets.MJEditText editText2 = getEditText();
        kotlin.jvm.internal.o.g(editText2, "editText");
        android.content.res.Resources a17 = j65.q.a(getContext());
        editText2.setPadding(a17.getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), 0, a17.getDimensionPixelSize(com.tencent.mm.R.dimen.f479715d8), 0);
        editText2.setGravity(8388627);
        editText2.setVerticalScrollBarEnabled(false);
        android.view.ViewGroup.LayoutParams layoutParams = editText2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.H;
        }
        F(I(ov0.e.f349126f), M, new ov0.l(this), new ov0.m(this));
    }

    public final void Q() {
        getDeleteBtn().setVisibility(0);
    }

    public final void R(ov0.e page) {
        kotlin.jvm.internal.o.g(page, "page");
        if (page == getSelectedTabPage()) {
            return;
        }
        java.util.Iterator it = this.f349152y0.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((sw0.c) it.next()).f413420b == page) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            getTabLayout().e(valueOf.intValue(), false);
        }
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public ou0.z b() {
        return new ou0.v(false, 1, null);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dg9, bodyContainerLayout);
        L();
    }

    public final android.widget.LinearLayout getContentContainer() {
        java.lang.Object value = ((jz5.n) this.f349150x0).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.LinearLayout) value;
    }

    public final android.widget.ImageView getDeleteBtn() {
        java.lang.Object value = ((jz5.n) this.V).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView getDoneBtn() {
        java.lang.Object value = ((jz5.n) this.R).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    public final com.tencent.mm.mj_publisher.finder.widgets.MJEditText getEditText() {
        java.lang.Object value = ((jz5.n) this.S).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.mj_publisher.finder.widgets.MJEditText) value;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.y
    public float getInitialAnimationPanelHeight() {
        return I(getInitTabPage());
    }

    public int getInputBoxHeight() {
        return this.M;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.y
    public android.widget.EditText getInputEditText() {
        return getEditText();
    }

    public final android.widget.TextView getNextBtn() {
        java.lang.Object value = ((jz5.n) this.W).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public android.graphics.drawable.Drawable getPanelBackground() {
        return new android.graphics.drawable.ColorDrawable(0);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q
    public int getPanelHeight() {
        return getInputBoxHeight() + this.N + getKeyboardViewHeight();
    }

    @Override // android.view.View
    public final android.widget.LinearLayout getRootView() {
        java.lang.Object value = ((jz5.n) this.f349148p0).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.LinearLayout) value;
    }

    public final android.widget.ImageView getSecondDeleteBtn() {
        java.lang.Object value = ((jz5.n) this.U).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    public final com.tencent.mm.mj_publisher.finder.widgets.MJEditText getSecondEditText() {
        java.lang.Object value = ((jz5.n) this.T).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.mj_publisher.finder.widgets.MJEditText) value;
    }

    public final ov0.e getSelectedTabPage() {
        return this.f349151x1;
    }

    public final android.view.View getStylePageView() {
        java.lang.Object obj;
        java.util.Iterator it = this.f349152y0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((sw0.c) obj).f413420b == ov0.e.f349126f) {
                break;
            }
        }
        sw0.c cVar = (sw0.c) obj;
        if (cVar != null) {
            return cVar.f413421c;
        }
        return null;
    }

    public final android.view.View getTitlePageView() {
        java.lang.Object obj;
        java.util.Iterator it = this.f349152y0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((sw0.c) obj).f413420b == ov0.e.f349125e) {
                break;
            }
        }
        sw0.c cVar = (sw0.c) obj;
        if (cVar != null) {
            return cVar.f413421c;
        }
        return null;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public boolean m() {
        return false;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public boolean n(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return true;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public boolean o() {
        return false;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void p() {
        R(getInitTabPage());
        if (N() && getSelectedTabPage() == ov0.e.f349125e) {
            getSecondEditText().setVisibility(0);
            com.tencent.mm.mj_publisher.finder.widgets.MJEditText editText = getSecondEditText();
            kotlin.jvm.internal.o.g(editText, "editText");
            editText.setInputType(1);
            editText.setCursorVisible(true);
            editText.setFocusableInTouchMode(true);
            editText.setSelection(editText.getText().length());
        } else {
            H();
        }
        android.content.Context context = getContext();
        com.tencent.mm.mj_publisher.finder.movie_composing.MovieComposingUI movieComposingUI = context instanceof com.tencent.mm.mj_publisher.finder.movie_composing.MovieComposingUI ? (com.tencent.mm.mj_publisher.finder.movie_composing.MovieComposingUI) context : null;
        if (movieComposingUI != null) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.INPUT_METHOD_CHANGED");
            movieComposingUI.registerReceiver(this.K, intentFilter);
        }
        float initialAnimationPanelHeight = getInitialAnimationPanelHeight();
        qw0.e eVar = this.A;
        eVar.f367067a = initialAnimationPanelHeight;
        setPanelAnimation(eVar);
        this.C.f();
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void s() {
        yz5.a aVar = this.I;
        if (aVar != null) {
            aVar.invoke();
        }
        java.lang.Object text = getInputEditText().getText();
        if (text == null) {
            text = "";
        }
        setResult(text);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void x() {
        if (M()) {
            E();
        }
        R(getInitTabPage());
    }
}
