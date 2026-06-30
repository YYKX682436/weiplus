package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes16.dex */
public final class jp0 extends kotlin.jvm.internal.q implements yz5.p {
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a80 C;
    public final /* synthetic */ long D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp0(com.tencent.mm.plugin.finder.live.plugin.a80 a80Var, long j17) {
        super(2);
        this.C = a80Var;
        this.D = j17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mars.xlog.Log.e(this.C.f111830q, "notifyCoLiveCancelLiveCreatingIfNeeded failed: invitationId=" + this.D + ", errCode=" + intValue + ", errMsg=" + ((java.lang.String) obj2));
        return jz5.f0.f302826a;
    }
}
