package cu1;

/* loaded from: classes2.dex */
public final class e extends au1.s {
    public e(java.lang.String cardId) {
        kotlin.jvm.internal.o.g(cardId, "cardId");
        r45.to5 to5Var = new r45.to5();
        r45.js5 uo5Var = new r45.uo5();
        to5Var.f386635d = cardId;
        s(to5Var, uo5Var, 5170, "/cgi-bin/mmpay-bin/mktremovecoupon");
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiRemoveCouponRequest", "cardid: %s", cardId);
    }
}
