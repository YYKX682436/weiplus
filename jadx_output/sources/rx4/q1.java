package rx4;

/* loaded from: classes.dex */
public final class q1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f401255d;

    public q1(rx4.h2 h2Var) {
        this.f401255d = h2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSTeachViewUIC$onCreate$1$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        this.f401255d.hideVKB();
        yj0.a.i(false, this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSTeachViewUIC$onCreate$1$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
