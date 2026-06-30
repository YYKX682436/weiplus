package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class v20 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.i30 f114640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo0.c f114641e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v20(com.tencent.mm.plugin.finder.live.plugin.i30 i30Var, qo0.c cVar) {
        super(2);
        this.f114640d = i30Var;
        this.f114641e = cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        ((java.lang.Number) obj2).longValue();
        com.tencent.mm.plugin.finder.live.plugin.i30 i30Var = this.f114640d;
        com.tencent.mars.xlog.Log.i(i30Var.f112903q, "getWeCoinBalance: " + longValue);
        if (longValue >= 0) {
            ((mm2.c1) i30Var.P0(mm2.c1.class)).w8(longValue);
            ce2.i iVar = i30Var.f112910x;
            if (iVar != null) {
                qo0.b bVar = qo0.b.Z1;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("PARAM_FINDER_LIVE_GIFT_ID", iVar.field_rewardProductId);
                bundle.putBoolean("PARAM_FINDER_LIVE_SEND_GIFT_FROM_ONECLICK", true);
                this.f114641e.statusChange(bVar, bundle);
            }
        }
        return jz5.f0.f302826a;
    }
}
