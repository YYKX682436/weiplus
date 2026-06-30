package gl5;

/* loaded from: classes5.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f272924a;

    /* renamed from: b, reason: collision with root package name */
    public final fl5.i f272925b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f272926c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f272927d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f272928e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f272929f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f272930g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f272931h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f272932i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f272933j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f272934k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f272935l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f272936m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f272937n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f272938o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f272939p;

    public d1(android.app.Activity activity, fl5.i oriEdt, android.view.ViewGroup editLayout, android.view.View view, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(oriEdt, "oriEdt");
        kotlin.jvm.internal.o.g(editLayout, "editLayout");
        this.f272924a = activity;
        this.f272925b = oriEdt;
        this.f272926c = editLayout;
        this.f272927d = view;
        this.f272928e = z17;
        this.f272931h = jz5.h.b(new gl5.x0(this));
        this.f272932i = jz5.h.b(new gl5.t0(this));
        this.f272933j = jz5.h.b(new gl5.c1(this));
        this.f272934k = jz5.h.b(new gl5.a1(this));
        this.f272935l = jz5.h.b(new gl5.y0(this));
        this.f272936m = jz5.h.b(new gl5.w0(this));
        this.f272937n = jz5.h.b(new gl5.s0(this));
        this.f272938o = jz5.h.b(new gl5.o0(this));
        this.f272939p = jz5.h.b(new gl5.q0(this));
    }

    public static final boolean a(gl5.d1 d1Var) {
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((jz5.n) d1Var.f272935l).getValue();
        java.lang.Boolean valueOf = inputMethodManager != null ? java.lang.Boolean.valueOf(inputMethodManager.showSoftInput(d1Var.f272925b.j(), 0)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    public final void b() {
        fl5.i iVar = this.f272925b;
        iVar.getSelectHelper().a();
        if (this.f272928e) {
            iVar.setImeOptions(4);
            iVar.setEnableSendBtn(true);
        }
        iVar.setInputType(131073);
        iVar.setMaxLines(7);
        java.lang.Object tag = this.f272926c.getTag(com.tencent.mm.R.id.bkw);
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type android.view.View");
        android.view.View view = (android.view.View) tag;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        android.view.ViewGroup.LayoutParams layoutParams = c().getLayoutParams();
        layoutParams.width = measuredWidth;
        c().setLayoutParams(layoutParams);
        int[] iArr2 = new int[2];
        iVar.l().getLocationOnScreen(iArr2);
        float translationY = iArr2[1] - d().getTranslationY();
        int left = c().getLeft();
        int top = c().getTop();
        int i17 = measuredHeight + top;
        int i18 = iArr[0] - iArr2[0];
        int intValue = ((java.lang.Number) ((jz5.n) this.f272932i).getValue()).intValue();
        int h17 = i65.a.h(this.f272924a, com.tencent.mm.R.dimen.f479672c9);
        android.view.ViewPropertyAnimator translationY2 = d().animate().translationX(i18).translationY(iArr[1] - translationY);
        translationY2.setInterpolator(ta5.h.f416879a.a());
        translationY2.setDuration(300L);
        translationY2.start();
        translationY2.setUpdateListener(new gl5.i0(this, left, top, measuredWidth + left, i17, h17, intValue, 0.5f, 0.0f));
        translationY2.setListener(new gl5.j0(this, translationY2));
    }

    public final android.widget.LinearLayout c() {
        java.lang.Object value = ((jz5.n) this.f272937n).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.LinearLayout) value;
    }

    public final android.view.View d() {
        java.lang.Object value = ((jz5.n) this.f272936m).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public android.view.View e() {
        java.lang.Object value = ((jz5.n) this.f272931h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final void f() {
        int[] iArr = new int[2];
        android.view.ViewGroup viewGroup = this.f272926c;
        viewGroup.getLocationOnScreen(iArr);
        android.app.Activity activity = this.f272924a;
        int h17 = com.tencent.mm.ui.bl.h(activity);
        int f17 = i65.a.f(activity, com.tencent.mm.R.dimen.f479738dv);
        com.tencent.mars.xlog.Log.i("MicroMsg.FullScreenEditHelper", "initFullScreenEdtLayoutHeight editLayoutPos[0]=" + iArr[0] + " editLayoutPos[1]=" + iArr[1] + " editLayout.height=" + viewGroup.getHeight() + " bottomPadding=" + f17);
        int height = com.tencent.mm.ui.b4.c(activity) ? ((iArr[1] + viewGroup.getHeight()) + f17) - h17 : ((iArr[1] + viewGroup.getHeight()) + f17) - (h17 * 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.FullScreenEditHelper", "initFullScreenEdtLayoutHeight showHeight=" + height);
        android.view.ViewGroup.LayoutParams layoutParams = d().getLayoutParams();
        layoutParams.height = height;
        d().setLayoutParams(layoutParams);
    }

    public final void g(android.view.ViewGroup viewGroup) {
        fl5.i iVar = this.f272925b;
        int selectionStart = iVar.getSelectionStart();
        android.view.ViewParent g17 = iVar.g();
        android.view.ViewGroup viewGroup2 = g17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) g17 : null;
        if (viewGroup2 != null) {
            iVar.getSelectHelper().M = true;
            int indexOfChild = viewGroup2.indexOfChild(iVar.l());
            android.view.ViewGroup.LayoutParams layoutParams = iVar.l().getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams((android.widget.LinearLayout.LayoutParams) layoutParams);
            layoutParams2.width = iVar.l().getMeasuredWidth();
            layoutParams2.height = iVar.l().getMeasuredHeight();
            android.view.View view = new android.view.View(this.f272924a);
            viewGroup2.addView(view, indexOfChild, layoutParams2);
            viewGroup2.setTag(com.tencent.mm.R.id.bkw, view);
            viewGroup2.setTag(com.tencent.mm.R.id.bkx, java.lang.Integer.valueOf(indexOfChild));
            viewGroup2.removeView(iVar.l());
            iVar.getSelectHelper().M = false;
        }
        java.lang.Object tag = viewGroup.getTag(com.tencent.mm.R.id.bkx);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        viewGroup.addView(iVar.l(), num != null ? num.intValue() : -1);
        java.lang.Object tag2 = viewGroup.getTag(com.tencent.mm.R.id.bkw);
        android.view.View view2 = tag2 instanceof android.view.View ? (android.view.View) tag2 : null;
        if (view2 != null) {
            viewGroup.removeView(view2);
        }
        iVar.k();
        iVar.setSelection(selectionStart);
    }

    public final void h(int i17) {
        if (this.f272929f && e().getParent() != null) {
            android.app.Activity activity = this.f272924a;
            if (com.tencent.mm.ui.b4.c(activity)) {
                e().post(new gl5.b1(this));
                return;
            }
            int c17 = (((com.tencent.mm.ui.bl.b(activity).y - i17) - com.tencent.mm.ui.bl.c(activity)) - (com.tencent.mm.ui.bl.h(activity) * 2)) + i65.a.f(activity, com.tencent.mm.R.dimen.f479738dv);
            com.tencent.mars.xlog.Log.i("MicroMsg.FullScreenEditHelper", "showHeight:" + c17 + ", height:" + i17 + ", screenHeight:" + com.tencent.mm.ui.bl.b(activity).y + ", navigation:" + com.tencent.mm.ui.bl.c(activity) + ", status:" + com.tencent.mm.ui.bl.h(activity));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateFullScreenEdtLayoutHeight:");
            sb6.append(c17);
            sb6.append(", stack:");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(new com.tencent.mm.sdk.platformtools.z3());
            com.tencent.mars.xlog.Log.i("MicroMsg.FullScreenEditHelper", sb6.toString());
            android.view.ViewGroup.LayoutParams layoutParams = d().getLayoutParams();
            layoutParams.height = c17;
            d().setLayoutParams(layoutParams);
        }
    }
}
