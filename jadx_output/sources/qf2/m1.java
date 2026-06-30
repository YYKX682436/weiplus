package qf2;

/* loaded from: classes10.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f362476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362477f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.m f362478g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(xg2.h hVar, kotlin.coroutines.Continuation continuation, qf2.y1 y1Var, yz5.l lVar, dk2.m mVar) {
        super(2, continuation);
        this.f362475d = hVar;
        this.f362476e = y1Var;
        this.f362477f = lVar;
        this.f362478g = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.m1(this.f362475d, continuation, this.f362476e, this.f362477f, this.f362478g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.m1 m1Var = (qf2.m1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        m1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = true;
        java.lang.String string = ((r45.mm1) ((xg2.i) this.f362475d).f454393b).getString(1);
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorBattlePkController", "anchorApplyVisitorBattle success battleId: " + string);
        dk2.u4 u4Var = ((mm2.o4) this.f362476e.business(mm2.o4.class)).Z;
        if (u4Var != null) {
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                u4Var.f234154a = string;
            }
            dk2.m mVar = this.f362478g;
            u4Var.f234160g = mVar.f233738a;
            u4Var.f234161h = mVar.f233739b;
            u4Var.f234162i = mVar.f233740c;
            java.util.List list = mVar.f233743f;
            kotlin.jvm.internal.o.g(list, "<set-?>");
            u4Var.f234163j = list;
            u4Var.f234166m = mVar.f233742e;
            u4Var.f234167n = mVar.f233741d;
        }
        yz5.l lVar = this.f362477f;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
