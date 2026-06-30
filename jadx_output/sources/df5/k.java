package df5;

/* loaded from: classes5.dex */
public final class k implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.g f232141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df5.l f232142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v11.e f232143f;

    public k(df5.g gVar, df5.l lVar, v11.e eVar) {
        this.f232141d = gVar;
        this.f232142e = lVar;
        this.f232143f = eVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/InteractOptionsView$updateSingleButtonView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        df5.g gVar = this.f232141d;
        boolean z17 = true;
        if (action == 0) {
            gVar.setPressedState(true);
        } else if (action == 1) {
            gVar.setPressedState(false);
            df5.l lVar = this.f232142e;
            yz5.a onInteractionConsumed = lVar.getOnInteractionConsumed();
            if (onInteractionConsumed != null) {
                onInteractionConsumed.invoke();
            }
            yz5.l onButtonClickListener = lVar.getOnButtonClickListener();
            if (onButtonClickListener != null) {
                onButtonClickListener.invoke(this.f232143f);
            }
        } else if (action != 3) {
            z17 = false;
        } else {
            gVar.setPressedState(false);
        }
        yj0.a.i(z17, this, "com/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/InteractOptionsView$updateSingleButtonView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
