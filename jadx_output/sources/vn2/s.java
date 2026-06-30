package vn2;

/* loaded from: classes2.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f438369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f438371f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(xg2.h hVar, kotlin.coroutines.Continuation continuation, java.lang.String str, so2.j5 j5Var) {
        super(2, continuation);
        this.f438369d = hVar;
        this.f438370e = str;
        this.f438371f = j5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vn2.s(this.f438369d, continuation, this.f438370e, this.f438371f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vn2.s sVar = (vn2.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i(this.f438370e, "addSeeLater success " + this.f438371f);
        return jz5.f0.f302826a;
    }
}
