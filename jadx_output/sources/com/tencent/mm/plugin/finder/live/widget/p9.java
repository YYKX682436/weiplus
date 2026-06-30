package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class p9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f119374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x9 f119375e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.widget.x9 x9Var) {
        super(2, continuation);
        this.f119374d = hVar;
        this.f119375e = x9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.p9(this.f119374d, continuation, this.f119375e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.p9 p9Var = (com.tencent.mm.plugin.finder.live.widget.p9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        p9Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f119374d).f454381b;
        rm0.j jVar = aVar2.f454379a;
        java.lang.Integer num = jVar != null ? new java.lang.Integer(jVar.f397424e) : null;
        rm0.j jVar2 = aVar2.f454379a;
        java.lang.Integer num2 = jVar2 != null ? new java.lang.Integer(jVar2.f397425f) : null;
        java.lang.String str = jVar2 != null ? jVar2.f397426g : null;
        com.tencent.mm.plugin.finder.live.widget.x9 x9Var = this.f119375e;
        com.tencent.mars.xlog.Log.i(x9Var.K, "[requestChangeRole] errType:" + num + ", errCode:" + num2);
        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.u9(str, x9Var));
        return jz5.f0.f302826a;
    }
}
