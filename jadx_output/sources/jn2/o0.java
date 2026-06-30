package jn2;

/* loaded from: classes5.dex */
public final class o0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.r0 f300659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.p0 f300660e;

    public o0(jn2.r0 r0Var, jn2.p0 p0Var) {
        this.f300659d = r0Var;
        this.f300660e = p0Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        yz5.l lVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongEditPanelAdapter$EditViewHolder$bind$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getActionMasked() == 0 && (lVar = this.f300659d.f300681m) != null) {
            lVar.invoke(this.f300660e);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongEditPanelAdapter$EditViewHolder$bind$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
