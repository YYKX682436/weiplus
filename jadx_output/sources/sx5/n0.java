package sx5;

/* loaded from: classes13.dex */
public class n0 extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f413749a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(sx5.a1 a1Var, android.content.Context context, int i17) {
        super(context, i17);
        this.f413749a = a1Var;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        int i18;
        sx5.a1 a1Var = this.f413749a;
        if (a1Var.z() != null) {
            if (i17 >= 80 && i17 <= 100) {
                i18 = 8;
            } else if (i17 >= 260 && i17 <= 280) {
                i18 = 0;
            } else if (i17 >= 170 && i17 <= 190) {
                i18 = 9;
            } else if (i17 > 10 && i17 < 350) {
                return;
            } else {
                i18 = 1;
            }
            int i19 = a1Var.V;
            if (i19 != i18) {
                if (i19 == 0 || i19 == 8) {
                    if (i18 == 0 || i18 == 8) {
                        by5.c4.f("XWebNativeInterface", "onOrientationChanged, orientation:" + i17 + ", rotation:" + i18);
                        a1Var.V = i18;
                        a1Var.x(i18);
                        return;
                    }
                    return;
                }
                if (i19 == 1 || i19 == 9) {
                    if (i18 == 1 || i18 == 9) {
                        by5.c4.f("XWebNativeInterface", "onOrientationChanged, orientation:" + i17 + ", rotation:" + i18);
                        a1Var.V = i18;
                        a1Var.x(i18);
                    }
                }
            }
        }
    }
}
