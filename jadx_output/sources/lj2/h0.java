package lj2;

/* loaded from: classes3.dex */
public final class h0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.i0 f318861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lj2.e0 f318862e;

    public h0(lj2.i0 i0Var, lj2.e0 e0Var) {
        this.f318861d = i0Var;
        this.f318862e = e0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        lj2.i0 i0Var = this.f318861d;
        i0Var.f318867d.getViewTreeObserver().removeOnPreDrawListener(this);
        i0Var.getClass();
        lj2.e0 e0Var = this.f318862e;
        android.view.View view = e0Var.f318852a;
        int i17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        int[] t17 = pm0.v.t(view);
        int i18 = t17[0];
        int height = t17[1] + view.getHeight();
        int width = (view.getWidth() / 2) + i18;
        int b17 = i65.a.b(i0Var.f318864a, 16);
        lj2.f0 f0Var = lj2.f0.f318855d;
        lj2.f0 f0Var2 = e0Var.f318853b;
        android.view.View view2 = i0Var.f318870g;
        if (f0Var2 == f0Var) {
            if ((i17 - i18) - b17 <= view2.getWidth()) {
                i18 = (i17 - view2.getWidth()) - b17;
            }
        } else if (width - (view2.getWidth() / 2) < b17) {
            i18 = b17;
        } else {
            int i19 = i17 - b17;
            i18 = (view2.getWidth() / 2) + width > i19 ? i19 - view2.getWidth() : width - (view2.getWidth() / 2);
        }
        android.widget.PopupWindow popupWindow = i0Var.f318868e;
        popupWindow.dismiss();
        popupWindow.showAtLocation(view, 51, i18, height);
        popupWindow.setOnDismissListener(lj2.g0.f318859d);
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (i18 < b17) {
                i18 = b17;
            }
            marginLayoutParams.leftMargin = i18;
            marginLayoutParams.rightMargin = b17;
        }
        android.widget.ImageView imageView = i0Var.f318869f;
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.leftMargin = width - (imageView.getWidth() / 2);
        }
        android.view.View view3 = i0Var.f318867d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment", "adjustWidget", "(Lcom/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment$AttachData;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment", "adjustWidget", "(Lcom/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment$AttachData;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        return true;
    }
}
