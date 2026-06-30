package p1;

/* loaded from: classes14.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1.g0 f350812d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(p1.g0 g0Var) {
        super(1);
        this.f350812d = g0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(motionEvent, "motionEvent");
        yz5.l lVar = this.f350812d.f350820d;
        if (lVar != null) {
            lVar.invoke(motionEvent);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("onTouchEvent");
        throw null;
    }
}
