package zu3;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu3.c f475770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f475771e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(zu3.c cVar, android.view.MotionEvent motionEvent) {
        super(2);
        this.f475770d = cVar;
        this.f475771e = motionEvent;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Matrix m17 = (android.graphics.Matrix) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(m17, "m");
        zu3.c cVar = this.f475770d;
        cVar.getTouchTracker().h(m17);
        cVar.postInvalidate();
        if (booleanValue) {
            bw3.e touchTracker = cVar.getTouchTracker();
            android.view.MotionEvent motionEvent = this.f475771e;
            touchTracker.a(motionEvent);
            cVar.bringToFront();
            zu3.f fVar = cVar.f475773e;
            if (fVar != null) {
                fVar.a(cVar, motionEvent);
            }
            if (!cVar.getTouchMoved()) {
                cVar.performClick();
            }
        }
        return jz5.f0.f302826a;
    }
}
