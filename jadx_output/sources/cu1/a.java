package cu1;

/* loaded from: classes2.dex */
public final class a extends au1.s {
    public a(java.lang.String cardId) {
        kotlin.jvm.internal.o.g(cardId, "cardId");
        r45.gd0 gd0Var = new r45.gd0();
        r45.js5 id0Var = new r45.id0();
        gd0Var.f375130d = cardId;
        s(gd0Var, id0Var, 5027, "/cgi-bin/mmpay-bin/mktdeletecoupon");
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiDeleteCouponRequest", "cardid: %s", cardId);
    }
}
