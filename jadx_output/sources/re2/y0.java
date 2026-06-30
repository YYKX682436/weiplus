package re2;

/* loaded from: classes3.dex */
public final class y0 extends re2.e0 {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f394505r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(java.lang.String initiatorFinderUsername) {
        super(initiatorFinderUsername);
        kotlin.jvm.internal.o.g(initiatorFinderUsername, "initiatorFinderUsername");
        this.f394505r = "Finder.CoLiveInviteeTask";
    }

    @Override // re2.e0
    public java.lang.String c() {
        return this.f394505r;
    }

    @Override // re2.e0
    public boolean g(int i17) {
        if (i17 != -200030) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(this.f394505r, "onPollFail: invitee kicked out (errCode=" + i17 + ')');
        if (this.f394389b != re2.a0.f394357f) {
            com.tencent.mars.xlog.Log.i(c(), "markDeadKicked: phase=" + this.f394389b + " → DEAD");
            gk2.e eVar = dk2.ef.I;
            mm2.n0 n0Var = eVar != null ? (mm2.n0) eVar.a(mm2.n0.class) : null;
            if (n0Var != null) {
                n0Var.f329275t = mm2.m0.f329231e;
            }
            f(1);
        }
        return true;
    }

    @Override // re2.e0
    public void h() {
        com.tencent.mars.xlog.Log.i(this.f394505r, "onScreenshotDetected ignored: invitee doesn't need qrcode refresh");
    }
}
