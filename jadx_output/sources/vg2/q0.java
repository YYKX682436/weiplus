package vg2;

/* loaded from: classes3.dex */
public final class q0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.v0 f436554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f436555e;

    public q0(vg2.v0 v0Var, android.view.ViewGroup viewGroup) {
        this.f436554d = v0Var;
        this.f436555e = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int width;
        android.graphics.drawable.Drawable drawable;
        vg2.v0 v0Var = this.f436554d;
        v0Var.f436603d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.view.ViewGroup viewGroup = this.f436555e;
        if (viewGroup != null) {
            v0Var.getClass();
            int i17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
            int[] t17 = pm0.v.t(viewGroup);
            int i18 = t17[1];
            int height = v0Var.a().getHeight();
            android.widget.ImageView imageView = v0Var.f436604e;
            int height2 = i18 - (height + imageView.getHeight());
            int width2 = t17[0] + (viewGroup.getWidth() / 2);
            android.content.Context context = v0Var.f436600a;
            int b17 = i65.a.b(context, 16);
            if (width2 - (v0Var.a().getWidth() / 2) < b17) {
                width = b17;
            } else {
                int i19 = i17 - b17;
                width = (v0Var.a().getWidth() / 2) + width2 > i19 ? (i19 - v0Var.a().getWidth()) - v0Var.a().getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479644bj) : width2 - (v0Var.a().getWidth() / 2);
            }
            android.view.ViewGroup.LayoutParams layoutParams = v0Var.a().getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                if (width < b17) {
                    width = b17;
                }
                marginLayoutParams.leftMargin = width;
                marginLayoutParams.topMargin = height2;
                marginLayoutParams.rightMargin = b17;
            }
            android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
            android.graphics.drawable.LayerDrawable layerDrawable = drawable2 instanceof android.graphics.drawable.LayerDrawable ? (android.graphics.drawable.LayerDrawable) drawable2 : null;
            if (layerDrawable != null && (drawable = layerDrawable.getDrawable(0)) != null) {
                drawable.setColorFilter(new android.graphics.PorterDuffColorFilter(context.getResources().getColor(com.tencent.mm.R.color.f479058om), android.graphics.PorterDuff.Mode.SRC_IN));
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.leftMargin = width2 - (imageView.getWidth() / 2);
            }
            android.view.View view = v0Var.f436603d;
            view.requestLayout();
            view.post(new vg2.k0(v0Var));
        }
    }
}
