package hr3;

/* loaded from: classes10.dex */
public final class uc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f284085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI f284086e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI recommendDeleteContactUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f284086e = recommendDeleteContactUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr3.uc(this.f284086e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((hr3.uc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        return pz5.a.f359186d;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f284085d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI recommendDeleteContactUI = this.f284086e;
            kotlinx.coroutines.flow.f3 f3Var = recommendDeleteContactUI.f153806z.f265793e;
            hr3.tc tcVar = new hr3.tc(recommendDeleteContactUI);
            this.f284085d = 1;
            if (((kotlinx.coroutines.flow.l2) f3Var).a(tcVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
