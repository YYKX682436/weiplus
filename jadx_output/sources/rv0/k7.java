package rv0;

/* loaded from: classes5.dex */
public final class k7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.o7 f400095d;

    public k7(rv0.o7 o7Var) {
        this.f400095d = o7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/VideoOriginVolumeAdjPanel$setupViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a onMuteIconClicked = this.f400095d.getOnMuteIconClicked();
        if (onMuteIconClicked != null) {
            onMuteIconClicked.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/VideoOriginVolumeAdjPanel$setupViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
