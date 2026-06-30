package sx5;

/* loaded from: classes13.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f413731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double[] f413732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f413733f;

    public g0(sx5.a1 a1Var, double d17, double[] dArr) {
        this.f413733f = a1Var;
        this.f413731d = d17;
        this.f413732e = dArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx5.d dVar = this.f413733f.I;
        if (dVar == null) {
            return;
        }
        dVar.getClass();
        double d17 = 0.0d;
        int i17 = 0;
        while (true) {
            double[] dArr = this.f413732e;
            if (i17 >= dArr.length) {
                android.widget.ImageView imageView = dVar.f413717d;
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams.width = (int) ((d17 / 100.0d) * dVar.f413716c.getWidth());
                imageView.setLayoutParams(layoutParams);
                imageView.requestLayout();
                return;
            }
            int i18 = i17 + 1;
            if (dArr.length > i18) {
                double d18 = dArr[i17];
                double d19 = this.f413731d;
                double d27 = (d18 / d19) * 100.0d;
                double d28 = dVar.f413722i;
                if (d27 <= d28) {
                    double d29 = (dArr[i18] / d19) * 100.0d;
                    if (d29 > d28) {
                        d17 = d29;
                    }
                }
            }
            i17 += 2;
        }
    }
}
