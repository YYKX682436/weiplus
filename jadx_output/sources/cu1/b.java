package cu1;

/* loaded from: classes4.dex */
public final class b extends au1.s {
    public b(long j17, long j18, int i17) {
        r45.pd3 pd3Var = new r45.pd3();
        r45.js5 qd3Var = new r45.qd3();
        pd3Var.f382956d = j17;
        pd3Var.f382957e = j18;
        pd3Var.f382958f = i17;
        s(pd3Var, qd3Var, 4735, "/cgi-bin/mmpay-bin/mktgetcouponandgifthistory");
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetMemberCardHistoryRequest", "pageNum: " + j17 + ", pageSize: " + j18);
    }
}
