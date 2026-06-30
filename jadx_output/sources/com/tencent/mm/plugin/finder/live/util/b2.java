package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes5.dex */
public final class b2 extends qz5.l implements yz5.p {
    public b2(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.util.b2(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.tencent.mm.plugin.finder.live.util.b2((kotlin.coroutines.Continuation) obj2).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            java.lang.String str = com.tencent.mm.plugin.finder.live.util.d2.f115476a;
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteSongDecodeResource fileDir: ");
            sb6.append(r6Var);
            sb6.append(" size: ");
            com.tencent.mm.vfs.r6[] G = r6Var.G();
            sb6.append(G != null ? new java.lang.Integer(G.length) : null);
            com.tencent.mars.xlog.Log.i("LiveKTVResourceUtil", sb6.toString());
            return java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.g(str, true));
        } catch (java.lang.Throwable unused) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("deleteSongDecodeResource error, ");
            jz5.f0 f0Var = jz5.f0.f302826a;
            sb7.append(f0Var);
            com.tencent.mars.xlog.Log.e("LiveKTVResourceUtil", sb7.toString());
            return f0Var;
        }
    }
}
