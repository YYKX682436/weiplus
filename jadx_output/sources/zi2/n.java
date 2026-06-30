package zi2;

/* loaded from: classes.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f473123d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f473124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zi2.w f473125f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.c0 c0Var, zi2.w wVar) {
        super(2, continuation);
        this.f473123d = hVar;
        this.f473124e = c0Var;
        this.f473125f = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zi2.n(this.f473123d, continuation, this.f473124e, this.f473125f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zi2.n nVar = (zi2.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        nVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f473123d).f454381b;
        rm0.j jVar = aVar2.f454379a;
        int i17 = jVar != null ? jVar.f397425f : -1;
        if (jVar == null || (str = jVar.getMessage()) == null) {
            str = "";
        }
        rm0.j jVar2 = aVar2.f454379a;
        int i18 = jVar2 != null ? jVar2.f397424e : -1;
        this.f473124e.f310112d = false;
        com.tencent.mars.xlog.Log.i("FinderLiveMicCoverPlugin", "opMicConfig fail, errCode: " + i17 + " errType: " + i18 + " errMsg: " + str);
        if (str.length() > 0) {
            db5.t7.m(this.f473125f.f365323d.getContext(), str);
        }
        return jz5.f0.f302826a;
    }
}
