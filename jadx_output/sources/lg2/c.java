package lg2;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lg2.d f318568d;

    public c(lg2.d dVar) {
        this.f318568d = dVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/fluent/director/base/BaseSwitchOutDirector$createTransitionContainerView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mars.xlog.Log.i(this.f318568d.f318557e, "onTouch");
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/fluent/director/base/BaseSwitchOutDirector$createTransitionContainerView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
