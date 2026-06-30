package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class vm0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f114798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f114799e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm0(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var) {
        super(2, continuation);
        this.f114798d = hVar;
        this.f114799e = wn0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.vm0(this.f114798d, continuation, this.f114799e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.vm0 vm0Var = (com.tencent.mm.plugin.finder.live.plugin.vm0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vm0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = this.f114799e;
        db5.t7.h(wn0Var.f365323d.getContext(), wn0Var.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.f493744ow0));
        mm2.f7 f7Var = (mm2.f7) wn0Var.P0(mm2.f7.class);
        r45.i82 i82Var = new r45.i82();
        i82Var.set(0, java.lang.Boolean.TRUE);
        f7Var.f329058f.postValue(i82Var);
        wn0Var.z1().a();
        return jz5.f0.f302826a;
    }
}
