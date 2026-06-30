package px0;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.r41 f358787e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment, r45.r41 r41Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358786d = materialImportPreviewFragment;
        this.f358787e = r41Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new px0.l(this.f358786d, this.f358787e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        px0.l lVar = (px0.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleOnAIGCTaskQuery aigc:");
        com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment = this.f358786d;
        sb6.append(materialImportPreviewFragment.f69655s);
        sb6.append(' ');
        r45.r41 r41Var = this.f358787e;
        sb6.append(r41Var.getInteger(7));
        sb6.append(' ');
        sb6.append(r41Var.getInteger(6));
        com.tencent.mars.xlog.Log.i("MaterialImportPreviewFragment", sb6.toString());
        int integer = r41Var.getInteger(7);
        jz5.g gVar = materialImportPreviewFragment.f69649m;
        com.tencent.mm.view.RingProgressView ringProgressView = (com.tencent.mm.view.RingProgressView) gVar.getValue();
        int progress = ringProgressView != null ? ringProgressView.getProgress() : 1;
        int i17 = materialImportPreviewFragment.f69645f ? 95 : 100;
        if (progress > 50 && (shootComposingPluginLayout = materialImportPreviewFragment.f69653q) != null) {
            shootComposingPluginLayout.X0();
        }
        com.tencent.mm.view.RingProgressView ringProgressView2 = (com.tencent.mm.view.RingProgressView) gVar.getValue();
        if (ringProgressView2 != null) {
            ringProgressView2.a(e06.p.f(integer, progress, i17));
        }
        return jz5.f0.f302826a;
    }
}
