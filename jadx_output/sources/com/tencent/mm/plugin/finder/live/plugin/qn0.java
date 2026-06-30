package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class qn0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f114029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f114030e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn0(xg2.h hVar, kotlin.coroutines.Continuation continuation, yz5.q qVar) {
        super(2, continuation);
        this.f114029d = hVar;
        this.f114030e = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.qn0(this.f114029d, continuation, this.f114030e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.qn0 qn0Var = (com.tencent.mm.plugin.finder.live.plugin.qn0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        qn0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f114029d).f454381b;
        rm0.j jVar = aVar2.f454379a;
        java.lang.String str = jVar != null ? jVar.f397426g : null;
        java.lang.Integer num = jVar != null ? new java.lang.Integer(jVar.f397425f) : null;
        rm0.j jVar2 = aVar2.f454379a;
        this.f114030e.invoke(str, num, jVar2 != null ? new java.lang.Integer(jVar2.f397424e) : null);
        return jz5.f0.f302826a;
    }
}
