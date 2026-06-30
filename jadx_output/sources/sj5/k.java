package sj5;

/* loaded from: classes10.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.scroll_view_widgets.widgets.ScrollViewWidgetQuickScrollBarView f408924d;

    public k(com.tencent.mm.ui.scroll_view_widgets.widgets.ScrollViewWidgetQuickScrollBarView scrollViewWidgetQuickScrollBarView) {
        this.f408924d = scrollViewWidgetQuickScrollBarView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        em.v3 v3Var = this.f408924d.f209796g;
        if (v3Var == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (v3Var.f254875d == null) {
            v3Var.f254875d = (com.tencent.mm.ui.widget.imageview.WeImageView) v3Var.f254872a.findViewById(com.tencent.mm.R.id.a4t);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = v3Var.f254875d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(weImageView, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(weImageView, arrayList2.toArray(), "com/tencent/mm/ui/scroll_view_widgets/widgets/ScrollViewWidgetQuickScrollBarView$tryCollapse$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        weImageView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(weImageView, "com/tencent/mm/ui/scroll_view_widgets/widgets/ScrollViewWidgetQuickScrollBarView$tryCollapse$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(weImageView, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
