package nf2;

/* loaded from: classes8.dex */
public final class b0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d0 f336657d;

    public b0(nf2.d0 d0Var) {
        this.f336657d = d0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsGestureHelper$setupCollapsedButtonTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.d(motionEvent);
        boolean d17 = this.f336657d.d(motionEvent, view);
        yj0.a.i(d17, this, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsGestureHelper$setupCollapsedButtonTouchListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return d17;
    }
}
