package vn2;

/* loaded from: classes.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f438364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438365e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(xg2.h hVar, kotlin.coroutines.Continuation continuation, java.lang.String str) {
        super(2, continuation);
        this.f438364d = hVar;
        this.f438365e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vn2.r(this.f438364d, continuation, this.f438365e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vn2.r rVar = (vn2.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f438365e, "addSeeLater fail," + ((xg2.a) ((xg2.b) this.f438364d).f454381b).f454379a + '!');
        return jz5.f0.f302826a;
    }
}
