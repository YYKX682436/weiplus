package z35;

/* loaded from: classes4.dex */
public final class r0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView f470040d;

    public r0(com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView suspendableHeroSeekBarView) {
        this.f470040d = suspendableHeroSeekBarView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int i17 = com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView.U;
        boolean l17 = this.f470040d.l(motionEvent);
        yj0.a.i(l17, this, "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return l17;
    }
}
