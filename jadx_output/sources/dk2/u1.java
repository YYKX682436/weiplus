package dk2;

/* loaded from: classes.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f234144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234145e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(xg2.h hVar, kotlin.coroutines.Continuation continuation, dk2.r4 r4Var) {
        super(2, continuation);
        this.f234144d = hVar;
        this.f234145e = r4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.u1(this.f234144d, continuation, this.f234145e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dk2.u1 u1Var = (dk2.u1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        rm0.j jVar;
        java.lang.String str;
        android.content.Context context;
        rm0.j jVar2;
        rm0.j jVar3;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f234144d).f454381b;
        java.lang.Integer num = (aVar2 == null || (jVar3 = aVar2.f454379a) == null) ? null : new java.lang.Integer(jVar3.f397424e);
        java.lang.Integer num2 = (aVar2 == null || (jVar2 = aVar2.f454379a) == null) ? null : new java.lang.Integer(jVar2.f397425f);
        com.tencent.mars.xlog.Log.i(this.f234145e.f234009d, "[doLikeRecommendLive] onSceneEnd errType:" + num + " errCode:" + num2);
        if (aVar2 != null && (jVar = aVar2.f454379a) != null && (str = jVar.f397426g) != null) {
            java.lang.String str2 = str.length() > 0 ? str : null;
            if (str2 != null) {
                dk2.ef efVar = dk2.ef.f233372a;
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                if (k0Var != null && (context = k0Var.getContext()) != null) {
                    int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                    e4Var.f211776c = str2;
                    e4Var.c();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
