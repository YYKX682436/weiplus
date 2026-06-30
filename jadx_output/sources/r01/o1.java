package r01;

/* loaded from: classes9.dex */
public class o1 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public long f368170d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r01.r1 f368171e;

    public o1(r01.r1 r1Var) {
        this.f368171e = r1Var;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportLocation", "LBSManager notify. lat:%f, lng:%f", java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17));
        long i18 = com.tencent.mm.sdk.platformtools.t8.i1();
        long j17 = this.f368170d;
        r01.r1 r1Var = this.f368171e;
        if (i18 >= j17 + r1Var.f368223e) {
            r1Var.a(r1Var.f368219a, 11, 0, f18, f17, (int) d18, null);
            this.f368170d = com.tencent.mm.sdk.platformtools.t8.i1();
        }
        r01.r1 r1Var2 = this.f368171e;
        if (r1Var2.f368220b == 2) {
            r1Var2.g();
        }
        if (!r1Var2.f368224f) {
            r1Var2.f368224f = true;
            ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_VOD_PLAY_PREPARED, f17, f18, (int) d18);
        }
        return true;
    }
}
