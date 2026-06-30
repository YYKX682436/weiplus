package dk2;

/* loaded from: classes.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f233996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233997e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(xg2.h hVar, kotlin.coroutines.Continuation continuation, dk2.r4 r4Var) {
        super(2, continuation);
        this.f233996d = hVar;
        this.f233997e = r4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.r1(this.f233996d, continuation, this.f233997e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dk2.r1 r1Var = (dk2.r1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        rm0.j jVar;
        rm0.j jVar2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f233996d).f454381b;
        java.lang.Integer num = null;
        java.lang.Integer num2 = (aVar2 == null || (jVar2 = aVar2.f454379a) == null) ? null : new java.lang.Integer(jVar2.f397424e);
        if (aVar2 != null && (jVar = aVar2.f454379a) != null) {
            num = new java.lang.Integer(jVar.f397425f);
        }
        com.tencent.mars.xlog.Log.i(this.f233997e.f234009d, "onSceneEnd errType:" + num2 + " errCode:" + num);
        return jz5.f0.f302826a;
    }
}
