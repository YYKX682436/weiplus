package vg2;

/* loaded from: classes3.dex */
public final class z implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.a0 f436632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f436633e;

    public z(vg2.a0 a0Var, android.view.ViewGroup viewGroup) {
        this.f436632d = a0Var;
        this.f436633e = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int width;
        android.graphics.drawable.Drawable drawable;
        vg2.a0 a0Var = this.f436632d;
        a0Var.f436468d.getViewTreeObserver().removeOnPreDrawListener(this);
        a0Var.getClass();
        android.view.ViewGroup attachView = this.f436633e;
        kotlin.jvm.internal.o.g(attachView, "attachView");
        int i17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        int[] t17 = pm0.v.t(attachView);
        int i18 = t17[1];
        androidx.recyclerview.widget.RecyclerView recyclerView = a0Var.f436473i;
        int height = recyclerView.getHeight();
        android.widget.ImageView imageView = a0Var.f436469e;
        int height2 = i18 - (height + imageView.getHeight());
        int width2 = t17[0] + (attachView.getWidth() / 2);
        android.content.Context context = a0Var.f436465a;
        int b17 = i65.a.b(context, 16);
        if (width2 - (recyclerView.getWidth() / 2) < b17) {
            width = b17;
        } else {
            int i19 = i17 - b17;
            width = (recyclerView.getWidth() / 2) + width2 > i19 ? i19 - recyclerView.getWidth() : width2 - (recyclerView.getWidth() / 2);
        }
        android.view.ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
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
            drawable.setColorFilter(new android.graphics.PorterDuffColorFilter(context.getResources().getColor(com.tencent.mm.R.color.f479057ol), android.graphics.PorterDuff.Mode.SRC_IN));
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.leftMargin = width2 - (imageView.getWidth() / 2);
        }
        android.view.View view = a0Var.f436468d;
        view.requestLayout();
        view.post(new vg2.y(a0Var));
        return true;
    }
}
