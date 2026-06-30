package pk2;

/* loaded from: classes3.dex */
public final class ga extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f355789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355790e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga(xg2.h hVar, kotlin.coroutines.Continuation continuation, pk2.o9 o9Var) {
        super(2, continuation);
        this.f355789d = hVar;
        this.f355790e = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pk2.ga(this.f355789d, continuation, this.f355790e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pk2.ga gaVar = (pk2.ga) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gaVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f355789d).f454381b;
        rm0.j jVar = aVar2.f454379a;
        java.lang.Integer num = jVar != null ? new java.lang.Integer(jVar.f397424e) : null;
        rm0.j jVar2 = aVar2.f454379a;
        java.lang.Integer num2 = jVar2 != null ? new java.lang.Integer(jVar2.f397425f) : null;
        java.lang.String str = jVar2 != null ? jVar2.f397426g : null;
        com.tencent.mars.xlog.Log.e(this.f355790e.f356072a, "FinderGetLiveH5UrlCGI failed: errType=" + num + ", errCode=" + num2 + ", errMsg=" + str);
        return jz5.f0.f302826a;
    }
}
