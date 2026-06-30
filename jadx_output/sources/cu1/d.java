package cu1;

/* loaded from: classes2.dex */
public final class d extends au1.s {
    public d(long j17, long j18) {
        r45.ki3 ki3Var = new r45.ki3();
        r45.js5 li3Var = new r45.li3();
        ki3Var.f378714d = j17;
        ki3Var.f378715e = j18;
        s(ki3Var, li3Var, 4406, "/cgi-bin/mmpay-bin/mktgetmembercardhistory");
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetMemberCardHistoryRequest", "pageNum: " + j17 + ", pageSize: " + j18);
    }
}
