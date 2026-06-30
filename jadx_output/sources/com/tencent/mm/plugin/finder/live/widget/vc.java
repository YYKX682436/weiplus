package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class vc implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.yc f120059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f120060e;

    public vc(com.tencent.mm.plugin.finder.live.widget.yc ycVar, android.view.View view) {
        this.f120059d = ycVar;
        this.f120060e = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int b17;
        int width;
        com.tencent.mm.plugin.finder.live.widget.yc ycVar = this.f120059d;
        ycVar.f120433b.getViewTreeObserver().removeOnPreDrawListener(this);
        com.tencent.mm.plugin.finder.live.widget.sc scVar = ycVar.f120432a.f119628j;
        ycVar.getClass();
        int i17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        android.view.View view = this.f120060e;
        int[] t17 = pm0.v.t(view);
        int i18 = t17[0];
        int i19 = t17[1];
        com.tencent.mm.plugin.finder.live.widget.sc scVar2 = com.tencent.mm.plugin.finder.live.widget.sc.f119749d;
        com.tencent.mm.plugin.finder.live.widget.rc rcVar = ycVar.f120432a;
        if (scVar == scVar2) {
            b17 = view.getHeight();
        } else {
            i19 -= ycVar.f120433b.getHeight();
            b17 = i65.a.b(rcVar.f119619a, 8);
        }
        int i27 = i19 + b17;
        int width2 = i18 + (view.getWidth() / 2);
        int b18 = i65.a.b(rcVar.f119619a, 16);
        android.widget.TextView textView = ycVar.f120437f;
        if (width2 - (textView.getWidth() / 2) < b18) {
            width = b18;
        } else {
            int i28 = i17 - b18;
            width = (textView.getWidth() / 2) + width2 > i28 ? i28 - textView.getWidth() : width2 - (textView.getWidth() / 2);
        }
        android.widget.PopupWindow popupWindow = ycVar.f120434c;
        popupWindow.dismiss();
        popupWindow.showAtLocation(view, 51, width, i27);
        popupWindow.setOnDismissListener(new com.tencent.mm.plugin.finder.live.widget.tc(ycVar));
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (width < b18) {
                width = b18;
            }
            marginLayoutParams.leftMargin = width;
            marginLayoutParams.rightMargin = b18;
        }
        android.widget.ImageView arrowTopView = ycVar.f120435d;
        kotlin.jvm.internal.o.f(arrowTopView, "arrowTopView");
        ycVar.a(arrowTopView, width2);
        android.widget.ImageView arrowBottomView = ycVar.f120436e;
        kotlin.jvm.internal.o.f(arrowBottomView, "arrowBottomView");
        ycVar.a(arrowBottomView, width2);
        android.view.View view2 = ycVar.f120433b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommonGuideWidget", "adjustWidget", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveCommonGuideWidget$Orientation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommonGuideWidget", "adjustWidget", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveCommonGuideWidget$Orientation;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        rcVar.f119621c.invoke();
        return true;
    }
}
