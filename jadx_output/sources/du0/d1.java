package du0;

/* loaded from: classes5.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du0.p1 f243340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(du0.p1 p1Var) {
        super(1);
        this.f243340d = p1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(motionEvent, "motionEvent");
        du0.p1 p1Var = this.f243340d;
        android.view.ViewGroup viewGroup = p1Var.f243410m;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("musicTipContainer");
            throw null;
        }
        int[] t17 = pm0.v.t(viewGroup);
        boolean z17 = false;
        int i17 = t17[0];
        int i18 = t17[1];
        if (i17 <= motionEvent.getRawX()) {
            float rawX = motionEvent.getRawX();
            if (p1Var.f243410m == null) {
                kotlin.jvm.internal.o.o("musicTipContainer");
                throw null;
            }
            if (rawX <= i17 + r8.getWidth() && i18 <= motionEvent.getRawY()) {
                float rawY = motionEvent.getRawY();
                if (p1Var.f243410m == null) {
                    kotlin.jvm.internal.o.o("musicTipContainer");
                    throw null;
                }
                if (rawY <= i18 + r0.getHeight()) {
                    z17 = true;
                }
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
