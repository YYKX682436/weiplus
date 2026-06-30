package gf2;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f271265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.c02 f271266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f271267f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f271268g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f271269h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r45.c02 c02Var, com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView, com.tencent.mm.view.MMPAGView mMPAGView, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f271266e = c02Var;
        this.f271267f = anchorMilestoneShareView;
        this.f271268g = mMPAGView;
        this.f271269h = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gf2.c(this.f271266e, this.f271267f, this.f271268g, this.f271269h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gf2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f271265d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            gf2.b bVar = new gf2.b(this.f271266e, this.f271267f, this.f271268g, this.f271269h, null);
            this.f271265d = 1;
            if (kotlinx.coroutines.l.g(p0Var, bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
