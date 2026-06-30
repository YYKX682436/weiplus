package vg2;

/* loaded from: classes3.dex */
public final class b implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.c f436478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f436479e;

    public b(vg2.c cVar, android.view.ViewGroup viewGroup) {
        this.f436478d = cVar;
        this.f436479e = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.graphics.drawable.Drawable drawable;
        vg2.c cVar = this.f436478d;
        cVar.f436485c.getViewTreeObserver().removeOnPreDrawListener(this);
        cVar.getClass();
        int i17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        android.view.ViewGroup viewGroup = this.f436479e;
        int[] t17 = pm0.v.t(viewGroup);
        int i18 = t17[1];
        android.view.View view = cVar.f436485c;
        int height = (i18 - view.getHeight()) + cVar.b();
        int width = t17[0] + (viewGroup.getWidth() / 2);
        android.content.Context context = cVar.f436483a;
        int b17 = i65.a.b(context, 16);
        if (width - (view.getWidth() / 2) >= b17) {
            int i19 = i17 - b17;
            b17 = (view.getWidth() / 2) + width > i19 ? i19 - view.getWidth() : width - (view.getWidth() / 2);
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = b17;
            marginLayoutParams.topMargin = height;
        }
        android.widget.ImageView imageView = cVar.f436486d;
        android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
        android.graphics.drawable.LayerDrawable layerDrawable = drawable2 instanceof android.graphics.drawable.LayerDrawable ? (android.graphics.drawable.LayerDrawable) drawable2 : null;
        if (layerDrawable != null && (drawable = layerDrawable.getDrawable(0)) != null) {
            drawable.setColorFilter(new android.graphics.PorterDuffColorFilter(context.getResources().getColor(com.tencent.mm.R.color.f479058om), android.graphics.PorterDuff.Mode.SRC_IN));
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.leftMargin = (width - (imageView.getWidth() / 2)) - b17;
        }
        pm0.v.V(100L, new vg2.a(cVar));
        view.requestLayout();
        return true;
    }
}
