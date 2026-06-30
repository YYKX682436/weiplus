package sc2;

/* loaded from: classes2.dex */
public final class k implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f406006f;

    public k(android.view.View view, android.view.View view2, int i17) {
        this.f406004d = view;
        this.f406005e = view2;
        this.f406006f = i17;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view = this.f406004d;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        android.view.View view2 = this.f406005e;
        view2.getLocationOnScreen(iArr2);
        int i17 = iArr[1];
        int n17 = i17 - (iArr2[1] + hc2.f1.n(view2));
        int i18 = this.f406006f;
        if (n17 < i18) {
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = (i17 - i18) - hc2.f1.n(view2);
                view2.setLayoutParams(marginLayoutParams);
            }
        }
    }
}
