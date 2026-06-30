package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class q2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f117335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f117336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.z2 f117337f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.live.viewmodel.z2 z2Var) {
        super(2, continuation);
        this.f117335d = hVar;
        this.f117336e = c0Var;
        this.f117337f = z2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.q2(this.f117335d, continuation, this.f117336e, this.f117337f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.viewmodel.q2 q2Var = (com.tencent.mm.plugin.finder.live.viewmodel.q2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f117335d).f454381b;
        this.f117336e.f310112d = false;
        rm0.j jVar = aVar2.f454379a;
        java.lang.Integer num = jVar != null ? new java.lang.Integer(jVar.f397425f) : null;
        rm0.j jVar2 = aVar2.f454379a;
        java.lang.String str = jVar2 != null ? jVar2.f397426g : null;
        java.lang.Integer num2 = jVar2 != null ? new java.lang.Integer(jVar2.f397424e) : null;
        com.tencent.mars.xlog.Log.i(this.f117337f.f117557d, "modifyCityShow fail, errCode: " + num + " errType: " + num2 + " errMsg: " + str);
        return jz5.f0.f302826a;
    }
}
