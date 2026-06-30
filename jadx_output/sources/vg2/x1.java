package vg2;

/* loaded from: classes3.dex */
public final class x1 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.y1 f436617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f436618e;

    public x1(vg2.y1 y1Var, android.view.ViewGroup viewGroup) {
        this.f436617d = y1Var;
        this.f436618e = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int width;
        android.graphics.drawable.Drawable drawable;
        vg2.y1 y1Var = this.f436617d;
        y1Var.f436625d.getViewTreeObserver().removeOnPreDrawListener(this);
        y1Var.getClass();
        int i17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        android.view.ViewGroup viewGroup = this.f436618e;
        int[] t17 = pm0.v.t(viewGroup);
        int i18 = t17[0];
        int i19 = t17[1];
        androidx.recyclerview.widget.RecyclerView recyclerView = y1Var.f436631j;
        int height = recyclerView.getHeight();
        android.widget.ImageView imageView = y1Var.f436627f;
        int height2 = i19 - (height + imageView.getHeight());
        int width2 = i18 + (viewGroup.getWidth() / 2);
        int b17 = i65.a.b(y1Var.f436622a, 16);
        if (width2 - (recyclerView.getWidth() / 2) < b17) {
            width = b17;
        } else {
            int i27 = i17 - b17;
            width = (recyclerView.getWidth() / 2) + width2 > i27 ? i27 - recyclerView.getWidth() : width2 - (recyclerView.getWidth() / 2);
        }
        android.widget.PopupWindow popupWindow = y1Var.f436626e;
        popupWindow.dismiss();
        popupWindow.showAtLocation(viewGroup, 51, width, height2);
        popupWindow.setOnDismissListener(new vg2.w1(y1Var));
        android.view.ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (width < b17) {
                width = b17;
            }
            marginLayoutParams.leftMargin = width;
            marginLayoutParams.rightMargin = b17;
        }
        android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
        android.graphics.drawable.LayerDrawable layerDrawable = drawable2 instanceof android.graphics.drawable.LayerDrawable ? (android.graphics.drawable.LayerDrawable) drawable2 : null;
        if (layerDrawable != null && (drawable = layerDrawable.getDrawable(0)) != null) {
            drawable.setColorFilter(new android.graphics.PorterDuffColorFilter(android.graphics.Color.parseColor("#CCCFB177"), android.graphics.PorterDuff.Mode.SRC_IN));
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.leftMargin = width2 - (imageView.getWidth() / 2);
        }
        android.view.View view = y1Var.f436625d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/KTVGiftBatchSelectPanelWidget", "adjustWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/gift/widget/KTVGiftBatchSelectPanelWidget", "adjustWidget", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        return true;
    }
}
