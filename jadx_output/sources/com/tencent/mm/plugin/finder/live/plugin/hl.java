package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f112822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vg2.m f112823e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(xg2.h hVar, kotlin.coroutines.Continuation continuation, vg2.m mVar) {
        super(2, continuation);
        this.f112822d = hVar;
        this.f112823e = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.hl(this.f112822d, continuation, this.f112823e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.hl hlVar = (com.tencent.mm.plugin.finder.live.plugin.hl) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hlVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        d75.b.g(new com.tencent.mm.plugin.finder.live.plugin.gl(this.f112823e));
        return jz5.f0.f302826a;
    }
}
