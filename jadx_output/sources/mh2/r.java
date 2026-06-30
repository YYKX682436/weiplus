package mh2;

/* loaded from: classes10.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f326444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget f326445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget kTVInteractiveWidget, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f326445e = kTVInteractiveWidget;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mh2.r(this.f326445e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mh2.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.f3 f3Var;
        kotlinx.coroutines.flow.j2 j2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f326444d;
        if (i17 != 0) {
            if (i17 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                throw new jz5.d();
            }
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            throw new jz5.d();
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.ktv.view.KTVInteractiveWidget kTVInteractiveWidget = this.f326445e;
        lj2.v0 v0Var = kTVInteractiveWidget.f111669m;
        zi2.w wVar = v0Var instanceof zi2.w ? (zi2.w) v0Var : null;
        if (wVar != null && (j2Var = ((om2.e) wVar.P0(om2.e.class)).f346290f) != null) {
            mh2.p pVar = new mh2.p(kTVInteractiveWidget);
            this.f326444d = 1;
            if (((kotlinx.coroutines.flow.h3) j2Var).a(pVar, this) == aVar) {
                return aVar;
            }
            throw new jz5.d();
        }
        if (wVar == null || (f3Var = ((om2.g) wVar.P0(om2.g.class)).A) == null) {
            return jz5.f0.f302826a;
        }
        mh2.q qVar = new mh2.q(kTVInteractiveWidget);
        this.f326444d = 2;
        if (((kotlinx.coroutines.flow.h3) f3Var).a(qVar, this) == aVar) {
            return aVar;
        }
        throw new jz5.d();
    }
}
