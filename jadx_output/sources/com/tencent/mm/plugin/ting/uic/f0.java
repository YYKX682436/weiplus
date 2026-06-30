package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes11.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.uic.j0 f174752d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.ting.uic.j0 j0Var) {
        super(1);
        this.f174752d = j0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l lVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkMembershipStatus success: ");
        sb6.append(booleanValue);
        sb6.append(", isDestroyed: ");
        com.tencent.mm.plugin.ting.uic.j0 j0Var = this.f174752d;
        sb6.append(j0Var.f174769n);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipUIC", sb6.toString());
        if (!j0Var.f174769n) {
            com.tencent.pigeon.ting.TingWecoinSubscribeResult tingWecoinSubscribeResult = j0Var.f174767i;
            if (tingWecoinSubscribeResult != null) {
                j0Var.f174767i = com.tencent.pigeon.ting.TingWecoinSubscribeResult.copy$default(tingWecoinSubscribeResult, (booleanValue ? com.tencent.pigeon.ting.TingWecoinSubscribeStatus.SUCCEED : com.tencent.pigeon.ting.TingWecoinSubscribeStatus.FAIL).ordinal(), null, null, 6, null);
                com.tencent.mm.api.TingMemberShipSubscribeRequest tingMemberShipSubscribeRequest = j0Var.f174764f;
                if (tingMemberShipSubscribeRequest != null && j0Var.f174765g != null) {
                    qk.ea eaVar = j0Var.f174765g;
                    kotlin.jvm.internal.o.d(eaVar);
                    j0Var.P6(tingMemberShipSubscribeRequest, eaVar);
                }
            }
            com.tencent.pigeon.ting.TingWecoinSubscribeResult tingWecoinSubscribeResult2 = j0Var.f174767i;
            if (tingWecoinSubscribeResult2 != null && (lVar = j0Var.f174766h) != null) {
                lVar.invoke(tingWecoinSubscribeResult2);
            }
        }
        return jz5.f0.f302826a;
    }
}
