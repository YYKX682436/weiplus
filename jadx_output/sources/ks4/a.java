package ks4;

/* loaded from: classes2.dex */
public final class a extends ks4.i {
    public a(java.lang.String billNo) {
        kotlin.jvm.internal.o.g(billNo, "billNo");
        r45.jt jtVar = new r45.jt();
        jtVar.f378094d = billNo;
        jtVar.f378095e = js4.r.f301567c;
        s(jtVar, new r45.kt(), 6233, "/cgi-bin/micromsg-bin/cancelwecoinrecharge");
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonWeCoinCgi", "CgiCancelWecoinRechargeRequest: billNo: ".concat(billNo));
    }
}
