package com.tencent.mm.sdk.platformtools;

/* loaded from: classes11.dex */
public final class x7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f193091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f193092e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(android.content.Context context, kotlinx.coroutines.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f193091d = context;
        this.f193092e = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.sdk.platformtools.x7(this.f193091d, this.f193092e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.sdk.platformtools.x7 x7Var = (com.tencent.mm.sdk.platformtools.x7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.lang.Object systemService = this.f193091d.getSystemService("connectivity");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
        com.tencent.mm.sdk.platformtools.u7 u7Var = new com.tencent.mm.sdk.platformtools.u7(this.f193091d, new com.tencent.mm.sdk.platformtools.w7(linkedHashSet), null, 4, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        u7Var.f193024c = new com.tencent.mm.sdk.platformtools.v7(java.lang.System.currentTimeMillis(), linkedHashSet, connectivityManager, u7Var, this.f193092e);
        try {
            connectivityManager.requestNetwork(new android.net.NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), u7Var, 200);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SimCardUtil", "doRequest, requestNetwork fail");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) this.f193092e).resumeWith(kotlin.Result.m521constructorimpl(kz5.p0.f313996d));
        }
        return jz5.f0.f302826a;
    }
}
