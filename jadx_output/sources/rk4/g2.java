package rk4;

/* loaded from: classes11.dex */
public final class g2 extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f396672a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(rk4.l3 l3Var, android.content.Context context) {
        super(context, 3);
        this.f396672a = l3Var;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        rk4.l3 l3Var = this.f396672a;
        if (l3Var.f396827r) {
            if (l3Var.f396826q) {
                if ((i17 >= 0 && i17 < 31) || java.lang.Math.abs(360 - i17) <= 30) {
                    l3Var.allowRotate(true);
                    l3Var.f396826q = false;
                    return;
                }
                return;
            }
            if (l3Var.f396825p) {
                if (!(75 <= i17 && i17 < 106)) {
                    int abs = java.lang.Math.abs(360 - i17);
                    if (!(75 <= abs && abs < 106)) {
                        return;
                    }
                }
                l3Var.allowRotate(true);
                l3Var.f396825p = false;
            }
        }
    }
}
