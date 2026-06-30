package zu3;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu3.l f475812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f475813e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(zu3.l lVar, android.view.MotionEvent motionEvent) {
        super(2);
        this.f475812d = lVar;
        this.f475813e = motionEvent;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Matrix m17 = (android.graphics.Matrix) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(m17, "m");
        zu3.l lVar = this.f475812d;
        lVar.getTouchTracker().h(m17);
        lVar.postInvalidate();
        if (booleanValue) {
            bw3.e touchTracker = lVar.getTouchTracker();
            android.view.MotionEvent motionEvent = this.f475813e;
            touchTracker.a(motionEvent);
            lVar.bringToFront();
            zu3.f fVar = lVar.f475816t;
            if (fVar != null) {
                fVar.a(lVar, motionEvent);
            }
        }
        return jz5.f0.f302826a;
    }
}
