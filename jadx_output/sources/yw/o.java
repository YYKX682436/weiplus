package yw;

/* loaded from: classes9.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f466411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f466412e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yw.y yVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466411d = yVar;
        this.f466412e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw.o(this.f466411d, this.f466412e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yw.o oVar = (yw.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        oVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int wi6 = ((com.tencent.mm.ui.conversation.b2) ((rv.c3) i95.n0.c(rv.c3.class))).wi();
        dw5.i iVar = new dw5.i();
        if (wi6 < 0) {
            iVar.f244367e = 99999;
            iVar.f244369g[2] = true;
        } else {
            iVar.f244367e = wi6;
            iVar.f244369g[2] = true;
        }
        iVar.f244366d = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).l() != -1;
        iVar.f244369g[1] = true;
        ((ku5.t0) ku5.t0.f312615d).h(new yw.n(iVar, this.f466411d, this.f466412e), "BizFlutterResortUserActiveReportInfo");
        return jz5.f0.f302826a;
    }
}
