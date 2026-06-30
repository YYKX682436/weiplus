package qf2;

/* loaded from: classes.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(xg2.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362486d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.n0(this.f362486d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.n0 n0Var = (qf2.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rm0.j jVar = ((xg2.a) ((xg2.b) this.f362486d).f454381b).f454379a;
        if (jVar == null || (str = jVar.f397426g) == null) {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "getNewAnchorPkInfoData fail, errCode: " + (jVar != null ? jVar.f397425f : 0) + " errMsg: " + str + " errType: " + (jVar != null ? jVar.f397424e : 0));
        return jz5.f0.f302826a;
    }
}
