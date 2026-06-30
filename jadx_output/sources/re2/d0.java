package re2;

/* loaded from: classes3.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re2.e0 f394377d;

    public d0(re2.e0 e0Var) {
        this.f394377d = e0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        re2.e0 e0Var = this.f394377d;
        if (e0Var.f394389b != re2.a0.f394356e) {
            return;
        }
        if (e0Var.e()) {
            this.f394377d.f(4);
            return;
        }
        re2.e0 e0Var2 = this.f394377d;
        if (e0Var2.f394401n) {
            return;
        }
        e0Var2.f394401n = true;
        boolean z17 = e0Var2.f394403p;
        e0Var2.f394403p = false;
        long j17 = e0Var2.f394390c;
        long j18 = e0Var2.f394394g;
        java.lang.String initiatorFinderUsername = e0Var2.f394388a;
        re2.b0 b0Var = new re2.b0(e0Var2);
        re2.c0 c0Var = new re2.c0(e0Var2);
        kotlin.jvm.internal.o.g(initiatorFinderUsername, "initiatorFinderUsername");
        com.tencent.mars.xlog.Log.i("Finder.CoLiveRequestHelper", "pollInvitation: invitationId=" + j17 + ", version=" + j18 + ", screenshotDetected=" + z17);
        new ek2.u(j17, j18, initiatorFinderUsername, z17, new re2.d1(b0Var, c0Var)).l();
    }
}
