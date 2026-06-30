package vc1;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434955d;

    public e(vc1.p1 p1Var) {
        this.f434955d = p1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        vc1.p1 p1Var = this.f434955d;
        vc1.c3 c3Var = p1Var.f435065c0;
        if (c3Var == null || !p1Var.f435063b0) {
            return;
        }
        p1Var.f435068e.getIController().animateTo(c3Var.getLatitude(), p1Var.f435065c0.getLongitude());
    }
}
