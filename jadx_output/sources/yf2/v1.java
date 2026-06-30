package yf2;

/* loaded from: classes3.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.i2 f461801d;

    public v1(yf2.i2 i2Var) {
        this.f461801d = i2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jm2.a.z1(this.f461801d, 0, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
