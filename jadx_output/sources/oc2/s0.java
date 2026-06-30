package oc2;

/* loaded from: classes8.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f344245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.render.RenderView f344246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oc2.y f344247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oc2.l0 f344248g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView, oc2.y yVar, oc2.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f344246e = renderView;
        this.f344247f = yVar;
        this.f344248g = l0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new oc2.s0(this.f344246e, this.f344247f, this.f344248g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((oc2.s0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f344245d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            oc2.v vVar = oc2.v.f344282a;
            java.lang.String o17 = vVar.o(this.f344247f.f344311a, this.f344248g.f344219a);
            this.f344245d = 1;
            boolean z17 = com.tencent.mm.plugin.finder.extension.reddot.render.RenderView.H;
            com.tencent.mm.plugin.finder.extension.reddot.render.RenderView renderView = this.f344246e;
            renderView.getClass();
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            mn2.g1 g1Var = mn2.g1.f329975a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(o17, com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.f329964r));
            oc2.r0 r0Var = new oc2.r0(nVar);
            b17.getClass();
            b17.f447873d = r0Var;
            vVar.u(b17, renderView.h(), renderView.getCtrlInfo(), renderView.getShowInfo(), o17);
            b17.f();
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
