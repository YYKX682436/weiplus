package sc2;

/* loaded from: classes2.dex */
public final class f1 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f405879g;

    public f1(sc2.h1 h1Var) {
        this.f405879g = h1Var;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6 instanceof ec2.f) {
            ec2.f fVar = (ec2.f) ev6;
            long j17 = fVar.f250965j;
            sc2.h1 h1Var = this.f405879g;
            if (j17 == h1Var.f3145f) {
                int i17 = fVar.f250959d;
                if (i17 == 11) {
                    com.tencent.mars.xlog.Log.i(h1Var.f405928w, "pauseCountdown");
                    h1Var.D = true;
                } else if (i17 == 1) {
                    com.tencent.mars.xlog.Log.i(h1Var.f405928w, "resumeCountdown");
                    h1Var.D = false;
                }
            }
        }
    }
}
