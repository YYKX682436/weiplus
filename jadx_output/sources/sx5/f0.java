package sx5;

/* loaded from: classes13.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f413728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f413729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f413730f;

    public f0(sx5.a1 a1Var, boolean z17, double d17) {
        this.f413730f = a1Var;
        this.f413728d = z17;
        this.f413729e = d17;
    }

    @Override // java.lang.Runnable
    public void run() {
        sx5.a1 a1Var = this.f413730f;
        sx5.d dVar = a1Var.I;
        double d17 = this.f413729e;
        if (dVar != null && this.f413728d) {
            double d18 = a1Var.N;
            if (d18 != 0.0d) {
                dVar.a((float) ((100.0d * d17) / d18), false);
            }
        }
        android.widget.TextView textView = a1Var.f413684r;
        if (textView != null) {
            textView.setText(a1Var.q(d17, a1Var.N));
        }
        android.widget.TextView textView2 = a1Var.f413685s;
        if (textView2 != null) {
            double d19 = a1Var.N;
            textView2.setText(a1Var.q(d19, d19));
        }
    }
}
