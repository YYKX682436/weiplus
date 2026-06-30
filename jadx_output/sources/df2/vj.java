package df2;

/* loaded from: classes3.dex */
public final class vj extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f231612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.pk f231613e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.pk pkVar) {
        super(2, continuation);
        this.f231612d = hVar;
        this.f231613e = pkVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.vj(this.f231612d, continuation, this.f231613e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.vj vjVar = (df2.vj) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vjVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f231612d).f454381b;
        df2.pk pkVar = this.f231613e;
        d75.b.g(new df2.uj(pkVar));
        rm0.j jVar = aVar2.f454379a;
        if (jVar != null) {
            com.tencent.mars.xlog.Log.i(pkVar.f231073m, "FinderLiveSwitchGiftSkinReq errCode = " + jVar.f397425f + ", errType = " + jVar.f397424e);
        }
        return jz5.f0.f302826a;
    }
}
