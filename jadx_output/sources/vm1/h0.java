package vm1;

/* loaded from: classes11.dex */
public final class h0 extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vm1.x0 f438013a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(vm1.x0 x0Var, android.content.Context context) {
        super(context, 3);
        this.f438013a = x0Var;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        vm1.x0 x0Var = this.f438013a;
        if (x0Var.f438077p) {
            if (x0Var.f438076o) {
                if ((i17 >= 0 && i17 < 31) || java.lang.Math.abs(360 - i17) <= 30) {
                    x0Var.allowRotate(true);
                    x0Var.f438076o = false;
                    return;
                }
                return;
            }
            if (x0Var.f438075n) {
                if (!(75 <= i17 && i17 < 106)) {
                    int abs = java.lang.Math.abs(360 - i17);
                    if (!(75 <= abs && abs < 106)) {
                        return;
                    }
                }
                x0Var.allowRotate(true);
                x0Var.f438075n = false;
            }
        }
    }
}
