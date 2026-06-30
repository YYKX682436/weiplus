package el2;

/* loaded from: classes3.dex */
public final class e1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f253782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.kv1 f253783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f253784f;

    public e1(el2.i1 i1Var, r45.kv1 kv1Var, boolean z17) {
        this.f253782d = i1Var;
        this.f253783e = kv1Var;
        this.f253784f = z17;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveOuterGiftWidget$setData$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        el2.i1 i1Var = this.f253782d;
        com.tencent.mars.xlog.Log.i(i1Var.f253815g, "event.actionMasked:" + motionEvent.getActionMasked());
        if (motionEvent.getActionMasked() == 0) {
            com.tencent.mars.xlog.Log.i(i1Var.f253815g, "[ACTION_DOWN] sendAgainViewShown:" + i1Var.f253821p + ", notify2OpenSendAgainViewAlready:" + i1Var.f253822q);
            if (!i1Var.f253821p) {
                el2.i1.l(i1Var, this.f253783e, 0, this.f253784f);
                i1Var.o(false);
            }
        }
        ((android.view.View) ((jz5.n) i1Var.f253817i).getValue()).dispatchTouchEvent(motionEvent);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveOuterGiftWidget$setData$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
