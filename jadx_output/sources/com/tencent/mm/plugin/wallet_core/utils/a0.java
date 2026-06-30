package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.a0 f180849a = new com.tencent.mm.plugin.wallet_core.utils.a0();

    public final java.lang.Long a(java.lang.String base64Data, yz5.p pVar) {
        kotlin.jvm.internal.o.g(base64Data, "base64Data");
        byte[] decode = android.util.Base64.decode(base64Data, 0);
        kotlin.jvm.internal.o.f(decode, "decode(...)");
        if (decode.length == 0) {
            return null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putBinary("half_page_view_data", decode);
        create.putLong("usecase_platform_session", currentTimeMillis);
        h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
        if (qVar != null) {
            qVar.startUseCase("complianceHalfPage", create, new com.tencent.mm.plugin.wallet_core.utils.z(pVar));
        }
        return java.lang.Long.valueOf(currentTimeMillis);
    }
}
