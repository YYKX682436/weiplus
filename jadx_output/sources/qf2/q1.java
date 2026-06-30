package qf2;

/* loaded from: classes.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f362543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.m f362544f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362545g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(xg2.h hVar, kotlin.coroutines.Continuation continuation, qf2.y1 y1Var, dk2.m mVar, yz5.l lVar) {
        super(2, continuation);
        this.f362542d = hVar;
        this.f362543e = y1Var;
        this.f362544f = mVar;
        this.f362545g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.q1(this.f362542d, continuation, this.f362543e, this.f362544f, this.f362545g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.q1 q1Var = (qf2.q1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dk2.u4 u4Var = ((mm2.o4) this.f362543e.business(mm2.o4.class)).Z;
        if (u4Var != null) {
            u4Var.f234168o = this.f362544f.f233744g;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "newModifyAnchorBattle success");
        yz5.l lVar = this.f362545g;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
