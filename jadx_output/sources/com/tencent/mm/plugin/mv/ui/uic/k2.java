package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class k2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151244e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f151243d = musicMvMainUIC;
        this.f151244e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.mv.ui.uic.k2(this.f151243d, this.f151244e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.mv.ui.uic.k2 k2Var = (com.tencent.mm.plugin.mv.ui.uic.k2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = 0;
        for (java.lang.Object obj2 : this.f151243d.f150977g) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            lm3.e eVar = (lm3.e) obj2;
            if (java.lang.Math.abs(i17 - this.f151244e) > 1) {
                eVar.f319482d.getClass();
            }
            i17 = i18;
        }
        return jz5.f0.f302826a;
    }
}
