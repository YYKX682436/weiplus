package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class ha extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f116355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.ka f116356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.view.ka kaVar) {
        super(2, continuation);
        this.f116355d = hVar;
        this.f116356e = kaVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.view.ha(this.f116355d, continuation, this.f116356e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.view.ha haVar = (com.tencent.mm.plugin.finder.live.view.ha) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        haVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rm0.j jVar = ((xg2.a) ((xg2.b) this.f116355d).f454381b).f454379a;
        if (jVar != null) {
            com.tencent.mars.xlog.Log.i(this.f116356e.H, "[requestData] errCode = " + jVar.f397425f + ", errType = " + jVar.f397424e);
        }
        return jz5.f0.f302826a;
    }
}
