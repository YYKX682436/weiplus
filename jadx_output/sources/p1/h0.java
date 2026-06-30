package p1;

/* loaded from: classes14.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r2.o f350830d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(r2.o oVar) {
        super(1);
        this.f350830d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean dispatchTouchEvent;
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(motionEvent, "motionEvent");
        int actionMasked = motionEvent.getActionMasked();
        r2.o oVar = this.f350830d;
        switch (actionMasked) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                dispatchTouchEvent = oVar.dispatchTouchEvent(motionEvent);
                break;
            default:
                dispatchTouchEvent = oVar.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return java.lang.Boolean.valueOf(dispatchTouchEvent);
    }
}
