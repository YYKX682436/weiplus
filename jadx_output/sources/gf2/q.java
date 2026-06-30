package gf2;

/* loaded from: classes10.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f271296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f271297e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f271297e = anchorMilestoneShareView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gf2.q(this.f271297e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gf2.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        gf2.z currentPostExtraInfo;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f271296d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView = this.f271297e;
            currentPostExtraInfo = anchorMilestoneShareView.getCurrentPostExtraInfo();
            if (currentPostExtraInfo == null || (str = currentPostExtraInfo.f271326a) == null) {
                str = "";
            }
            this.f271296d = 1;
            if (com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView.d(anchorMilestoneShareView, str, this) == aVar) {
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
