package mx0;

/* loaded from: classes5.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.q2 f331821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(mx0.q2 q2Var) {
        super(1);
        this.f331821d = q2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(motionEvent, "motionEvent");
        int[] iArr = new int[2];
        this.f331821d.e().getLocationOnScreen(iArr);
        boolean z17 = false;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(iArr[0]);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(iArr[1]);
        int intValue = valueOf.intValue();
        int intValue2 = valueOf2.intValue();
        if (intValue <= motionEvent.getRawX() && motionEvent.getRawX() <= intValue + r0.e().getWidth() && intValue2 <= motionEvent.getRawY() && motionEvent.getRawY() <= intValue2 + r0.e().getHeight()) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
