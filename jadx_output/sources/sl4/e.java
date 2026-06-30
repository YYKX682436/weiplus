package sl4;

/* loaded from: classes11.dex */
public final class e extends gp1.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl4.g f409257a;

    public e(sl4.g gVar) {
        this.f409257a = gVar;
    }

    @Override // gp1.a0, gp1.z
    public void F0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, com.tencent.mm.plugin.ball.model.BallInfo ballInfo2) {
        com.tencent.mm.plugin.ball.model.BallReportInfo ballReportInfo;
        sl4.g gVar = this.f409257a;
        gVar.getClass();
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.Integer num = null;
        boolean z17 = false;
        objArr[0] = ballInfo != null ? java.lang.Integer.valueOf(ballInfo.f93046d) : null;
        com.tencent.mars.xlog.Log.i(gVar.f409259n, "onFloatBallInfoReplaced type: %s", objArr);
        if (ballInfo != null && ballInfo.f93046d == gVar.h0()) {
            z17 = true;
        }
        if (z17) {
            if (ballInfo2 != null && (ballReportInfo = ballInfo2.M) != null) {
                num = java.lang.Integer.valueOf(ballReportInfo.f93086f);
            }
            gVar.f409265t = num;
            gVar.w0(true, qk.z9.f364414f);
            gVar.u0(ballInfo, ballInfo2);
        }
    }

    @Override // gp1.a0, gp1.z
    public void N0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        sl4.g gVar = this.f409257a;
        com.tencent.mars.xlog.Log.i(gVar.f409259n, "onFloatBallDeleteButtonClick");
        gVar.n0();
        gVar.x0(qk.y9.f364384g);
        gVar.w0(true, qk.z9.f364413e);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    @Override // gp1.a0, gp1.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S(com.tencent.mm.plugin.ball.model.BallInfo r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sl4.e.S(com.tencent.mm.plugin.ball.model.BallInfo, int, int, int, int):void");
    }

    @Override // gp1.a0, gp1.z
    public void V0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFloatBallPlayButtonClick status: ");
        sl4.g gVar = this.f409257a;
        bl4.b bVar = gVar.f409260o;
        sb6.append(bVar != null ? java.lang.Integer.valueOf(bVar.f21734c) : null);
        com.tencent.mars.xlog.Log.i(gVar.f409259n, sb6.toString());
        gVar.t0();
    }

    @Override // gp1.a0, gp1.z
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        sl4.g gVar = this.f409257a;
        if (gVar.k0()) {
            gVar.x0(qk.y9.f364382e);
            gVar.a();
        }
    }
}
