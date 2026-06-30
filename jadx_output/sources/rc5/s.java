package rc5;

/* loaded from: classes11.dex */
public final class s implements com.tencent.mm.ui.wc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rc5.x f394191a;

    public s(rc5.x xVar) {
        this.f394191a = xVar;
    }

    @Override // com.tencent.mm.ui.wc
    public void a(android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            rc5.x xVar = this.f394191a;
            xVar.getClass();
            if (!(xVar instanceof com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC)) {
                xVar.n7(motionEvent);
                return;
            }
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent);
            obtain.offsetLocation(0.0f, xVar.X6() - ((java.lang.Number) ((jz5.n) xVar.f200435r).getValue()).intValue());
            xVar.n7(obtain);
        }
    }

    @Override // com.tencent.mm.ui.wc
    public java.lang.String key() {
        return java.lang.String.valueOf(this.f394191a.hashCode());
    }
}
