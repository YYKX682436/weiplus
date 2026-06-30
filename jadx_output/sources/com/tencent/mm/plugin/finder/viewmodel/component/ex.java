package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class ex extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f134305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(xg2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f134305d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.ex(this.f134305d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.ex exVar = (com.tencent.mm.plugin.finder.viewmodel.component.ex) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        exVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f134305d).f454381b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestFeedUrl: fail, errType=");
        rm0.j jVar = aVar2.f454379a;
        sb6.append(jVar != null ? new java.lang.Integer(jVar.f397424e) : null);
        sb6.append(", errCode=");
        rm0.j jVar2 = aVar2.f454379a;
        sb6.append(jVar2 != null ? new java.lang.Integer(jVar2.f397425f) : null);
        com.tencent.mars.xlog.Log.e("FinderProjectionScreenUIC", sb6.toString());
        return jz5.f0.f302826a;
    }
}
