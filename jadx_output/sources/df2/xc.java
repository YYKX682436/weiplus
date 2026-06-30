package df2;

/* loaded from: classes3.dex */
public final class xc implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ad f231771d;

    public xc(df2.ad adVar) {
        this.f231771d = adVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveAnchorHitPromptTipsController$parentRootView$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            df2.ad adVar = this.f231771d;
            if2.d0 d0Var = adVar.f229707m;
            if (d0Var != null) {
                d0Var.d(8);
            }
            kotlinx.coroutines.r2 r2Var = adVar.f229708n;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorHitPromptTipsController$parentRootView$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
