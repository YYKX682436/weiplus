package qf2;

/* loaded from: classes.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f362574f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(xg2.h hVar, kotlin.coroutines.Continuation continuation, yz5.l lVar, qf2.c3 c3Var) {
        super(2, continuation);
        this.f362572d = hVar;
        this.f362573e = lVar;
        this.f362574f = c3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.s2(this.f362572d, continuation, this.f362573e, this.f362574f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.s2 s2Var = (qf2.s2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f362572d).f454381b;
        yz5.l lVar = this.f362573e;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
        rm0.j jVar = aVar2.f454379a;
        if (jVar == null || (str = jVar.f397426g) == null) {
            str = "";
        }
        int i17 = jVar != null ? jVar.f397425f : 0;
        int i18 = jVar != null ? jVar.f397424e : 0;
        if (str.length() > 0) {
            db5.t7.g(this.f362574f.O6(), str);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicVisitorBattlePkController", "modifyBattleInfo fail, errCode: " + i17 + " errMsg: " + str + " errType: " + i18);
        return jz5.f0.f302826a;
    }
}
