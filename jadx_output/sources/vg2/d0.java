package vg2;

/* loaded from: classes.dex */
public final class d0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.e0 f436489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f436490e;

    public d0(vg2.e0 e0Var, android.view.ViewGroup viewGroup) {
        this.f436489d = e0Var;
        this.f436490e = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int width;
        vg2.e0 e0Var = this.f436489d;
        e0Var.f436499c.getViewTreeObserver().removeOnPreDrawListener(this);
        e0Var.getClass();
        int i17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        android.view.ViewGroup viewGroup = this.f436490e;
        int[] t17 = pm0.v.t(viewGroup);
        int i18 = t17[1];
        android.view.View view = e0Var.f436500d;
        int height = view.getHeight();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = e0Var.f436501e;
        int height2 = i18 - (height + weImageView.getHeight());
        int width2 = t17[0] + (viewGroup.getWidth() / 2);
        android.content.Context context = e0Var.f436497a;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        if (width2 - (view.getWidth() / 2) < dimensionPixelSize) {
            width = dimensionPixelSize;
        } else {
            int i19 = i17 - dimensionPixelSize;
            width = (view.getWidth() / 2) + width2 > i19 ? i19 - view.getWidth() : width2 - (view.getWidth() / 2);
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (width < dimensionPixelSize) {
                width = dimensionPixelSize;
            }
            marginLayoutParams.leftMargin = width;
            marginLayoutParams.topMargin = height2;
            marginLayoutParams.rightMargin = dimensionPixelSize;
        }
        weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478493e));
        android.view.ViewGroup.LayoutParams layoutParams2 = weImageView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.leftMargin = width2 - (weImageView.getWidth() / 2);
        }
        android.view.View view2 = e0Var.f436499c;
        view2.requestLayout();
        view2.post(new vg2.c0(e0Var));
        return true;
    }
}
