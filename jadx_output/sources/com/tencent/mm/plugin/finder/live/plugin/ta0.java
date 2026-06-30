package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ta0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wa0 f114367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta0(com.tencent.mm.plugin.finder.live.plugin.wa0 wa0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114367d = wa0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.ta0(this.f114367d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.ta0 ta0Var = (com.tencent.mm.plugin.finder.live.plugin.ta0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        ta0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("FinderLiveSubtitlePlugin", "count down timeout, hideSubtitle");
        com.tencent.mm.plugin.finder.live.plugin.wa0.t1(this.f114367d);
        return jz5.f0.f302826a;
    }
}
