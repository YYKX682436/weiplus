package zu2;

/* loaded from: classes3.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jx2.j f475743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zu2.a0 f475744g;

    public s(android.view.View view, android.view.View view2, jx2.j jVar, zu2.a0 a0Var) {
        this.f475741d = view;
        this.f475742e = view2;
        this.f475743f = jVar;
        this.f475744g = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f475741d;
        int left = view.getLeft() + (view.getMeasuredWidth() / 2);
        android.view.View anchor = this.f475742e;
        int measuredWidth = left - (anchor.getMeasuredWidth() / 2);
        jx2.j jVar = this.f475743f;
        jVar.f302434d = measuredWidth;
        jVar.getClass();
        kotlin.jvm.internal.o.g(anchor, "anchor");
        if (!jVar.f302435e) {
            jVar.getContentView().measure(0, 0);
            jVar.f302435e = true;
        }
        int measuredWidth2 = jVar.getContentView().getMeasuredWidth();
        int measuredHeight = jVar.getContentView().getMeasuredHeight();
        jVar.setWidth(measuredWidth2);
        jVar.setHeight(measuredHeight);
        int measuredHeight2 = jVar.getContentView().getMeasuredHeight();
        int[] iArr = new int[2];
        anchor.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = iArr[0];
        rect.left = i17;
        rect.top = iArr[1];
        rect.right = i17 + anchor.getMeasuredWidth();
        rect.bottom = rect.top + anchor.getMeasuredHeight();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        anchor.getWindowVisibleDisplayFrame(rect2);
        int i18 = rect.bottom + measuredHeight2 > rect2.height() ? -(measuredHeight2 + rect.height()) : 0;
        jVar.a(anchor, java.lang.Integer.valueOf(i18));
        jVar.setAnimationStyle(i18 < 0 ? com.tencent.mm.R.style.f494462np : com.tencent.mm.R.style.f494463nq);
        jVar.showAsDropDown(anchor, 0, i18, 8388613);
        float f17 = com.tencent.mm.ui.bk.C() ? 0.1f : 0.5f;
        try {
            android.view.View contentView = jVar.getContentView();
            android.view.View rootView = contentView != null ? contentView.getRootView() : null;
            if (rootView != null) {
                java.lang.Object systemService = jVar.f302432b.getSystemService("window");
                android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
                if (windowManager != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
                    android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        layoutParams2.flags |= 2;
                        layoutParams2.dimAmount = f17;
                        windowManager.updateViewLayout(rootView, layoutParams2);
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        kotlin.jvm.internal.o.f(java.lang.String.format("pw:%s, ph:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(measuredWidth2), java.lang.Integer.valueOf(measuredHeight)}, 2)), "format(...)");
        this.f475744g.f475696h = jVar;
    }
}
