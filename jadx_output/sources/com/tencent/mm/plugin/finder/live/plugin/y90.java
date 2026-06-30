package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class y90 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f115166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ea0 f115167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f115168f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y90(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var, cm2.m0 m0Var) {
        super(2, continuation);
        this.f115166d = hVar;
        this.f115167e = ea0Var;
        this.f115168f = m0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.y90(this.f115166d, continuation, this.f115167e, this.f115168f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.y90 y90Var = (com.tencent.mm.plugin.finder.live.plugin.y90) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y90Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.protobuf.g byteString = ((r45.nd2) ((xg2.i) this.f115166d).f454393b).getByteString(1);
        r45.y23 y23Var = null;
        if (byteString != null) {
            r45.ju1 ju1Var = new r45.ju1();
            try {
                ju1Var.parseFrom(byteString.g());
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                ju1Var = null;
            }
            if (ju1Var != null) {
                y23Var = (r45.y23) ju1Var.getCustom(3);
            }
        }
        com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = this.f115167e;
        java.lang.String str = ea0Var.f112390t;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveGetProductPromoteReplayWidgetRequest success hasData ");
        sb6.append(y23Var != null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (!(y23Var == null)) {
            cm2.m0 m0Var = this.f115168f;
            m0Var.n(y23Var);
            ea0Var.y1().n(ea0Var.S0(), m0Var);
        }
        return jz5.f0.f302826a;
    }
}
