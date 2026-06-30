package hq1;

/* loaded from: classes13.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq1.h0 f283105d;

    public e0(hq1.h0 h0Var) {
        this.f283105d = h0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        hq1.h0 h0Var = this.f283105d;
        if (h0Var.f283127r) {
            hq1.f0 f0Var = h0Var.f283114e;
            if (f0Var != null) {
                f0Var.a(h0Var.f283110a, false, h0Var.f283125p);
            }
            h0Var.e();
        }
    }
}
