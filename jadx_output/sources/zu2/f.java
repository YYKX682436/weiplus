package zu2;

/* loaded from: classes8.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu2.o f475711d;

    public f(zu2.o oVar) {
        this.f475711d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zu2.o oVar = this.f475711d;
        android.view.ViewGroup viewGroup = oVar.f475725f;
        if (!(viewGroup != null && viewGroup.getVisibility() == 0)) {
            com.tencent.mars.xlog.Log.i(oVar.f475724e, "showFeedBackFrameOne");
            android.view.ViewGroup viewGroup2 = oVar.f475725f;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            android.view.View view2 = oVar.f475726g;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "showFeedBackFrameOne", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "showFeedBackFrameOne", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = oVar.f475727h;
            if (view3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "showFeedBackFrameOne", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget", "showFeedBackFrameOne", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
