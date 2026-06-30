package zu2;

/* loaded from: classes8.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu2.o f475714d;

    public i(zu2.o oVar) {
        this.f475714d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zu2.o oVar = this.f475714d;
        com.tencent.mars.xlog.Log.i(oVar.f475724e, "click reason 1");
        oVar.f475723d.c();
        android.app.Activity activity = oVar.f475720a;
        db5.t7.h(activity, activity.getResources().getString(com.tencent.mm.R.string.ck6));
        oVar.c();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/sharerel/WxaAdFeedbackWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
