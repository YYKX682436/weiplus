package cu1;

/* loaded from: classes4.dex */
public final class c extends au1.s {
    public c(long j17, long j18, int i17) {
        r45.rd3 rd3Var = new r45.rd3();
        r45.js5 sd3Var = new r45.sd3();
        rd3Var.f384738d = j17;
        rd3Var.f384739e = j18;
        rd3Var.f384740f = i17;
        s(rd3Var, sd3Var, 4796, "/cgi-bin/mmpay-bin/mktgetcouponandgiftlist");
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetCouponAndGiftList", "pageNum: " + j17 + ", pageSize: " + j18);
    }
}
