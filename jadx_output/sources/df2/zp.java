package df2;

/* loaded from: classes3.dex */
public final class zp extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f231983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.gq f231984e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.gq gqVar) {
        super(2, continuation);
        this.f231983d = hVar;
        this.f231984e = gqVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.zp(this.f231983d, continuation, this.f231984e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.zp zpVar = (df2.zp) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        zpVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f231983d).f454381b;
        java.lang.String str = this.f231984e.f230237m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[cgiGetPanelData], errcode = ");
        rm0.j jVar = aVar2.f454379a;
        sb6.append(jVar != null ? new java.lang.Integer(jVar.f397425f) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        return jz5.f0.f302826a;
    }
}
