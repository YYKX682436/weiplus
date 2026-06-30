package zu3;

/* loaded from: classes10.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu3.x f475854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f475855e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(zu3.x xVar, android.view.MotionEvent motionEvent) {
        super(2);
        this.f475854d = xVar;
        this.f475855e = motionEvent;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Matrix m17 = (android.graphics.Matrix) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(m17, "m");
        zu3.x xVar = this.f475854d;
        if (xVar.f475863n) {
            xVar.getTouchTracker().h(m17);
            zu3.y yVar = xVar.f475862m;
            if (yVar != null) {
                yVar.p(xVar.getTouchTracker().f24917g);
            }
            xVar.postInvalidate();
            if (booleanValue) {
                bw3.e touchTracker = xVar.getTouchTracker();
                android.view.MotionEvent motionEvent = this.f475855e;
                touchTracker.a(motionEvent);
                xVar.bringToFront();
                zu3.f fVar = xVar.f475857e;
                if (fVar != null) {
                    fVar.a(xVar, motionEvent);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
