package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public final class z implements com.tencent.kinda.gen.UseCaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f181007a;

    public z(yz5.p pVar) {
        this.f181007a = pVar;
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData data) {
        kotlin.jvm.internal.o.g(data, "data");
        int i17 = data.getInt("compliance_half_page_action");
        long j17 = data.getLong("usecase_platform_session");
        com.tencent.mars.xlog.Log.i("MicroMsg.WCPayComplianceHalfPage", "closed with action: " + i17);
        yz5.p pVar = this.f181007a;
        if (pVar != null) {
            com.tencent.mm.plugin.wallet_core.utils.y.f180999e.getClass();
            for (com.tencent.mm.plugin.wallet_core.utils.y yVar : com.tencent.mm.plugin.wallet_core.utils.y.values()) {
                if (yVar.f181003d == i17) {
                    pVar.invoke(yVar, java.lang.Long.valueOf(j17));
                    return;
                }
            }
            throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
        }
    }
}
