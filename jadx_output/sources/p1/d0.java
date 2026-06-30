package p1;

/* loaded from: classes14.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1.f0 f350808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1.g0 f350809e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(p1.f0 f0Var, p1.g0 g0Var) {
        super(1);
        this.f350808d = f0Var;
        this.f350809e = g0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(motionEvent, "motionEvent");
        int actionMasked = motionEvent.getActionMasked();
        p1.g0 g0Var = this.f350809e;
        if (actionMasked == 0) {
            yz5.l lVar = g0Var.f350820d;
            if (lVar == null) {
                kotlin.jvm.internal.o.o("onTouchEvent");
                throw null;
            }
            this.f350808d.f350815f = ((java.lang.Boolean) lVar.invoke(motionEvent)).booleanValue() ? p1.b0.Dispatching : p1.b0.NotDispatching;
        } else {
            yz5.l lVar2 = g0Var.f350820d;
            if (lVar2 == null) {
                kotlin.jvm.internal.o.o("onTouchEvent");
                throw null;
            }
            lVar2.invoke(motionEvent);
        }
        return jz5.f0.f302826a;
    }
}
