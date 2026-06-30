package mx0;

/* loaded from: classes5.dex */
public final class y4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332451d = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.y4(this.f332451d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.y4 y4Var = (mx0.y4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        hu3.q0 loadingDialog;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332451d;
        loadingDialog = shootComposingPluginLayout.getLoadingDialog();
        loadingDialog.dismiss();
        if (shootComposingPluginLayout.getContext() instanceof com.tencent.mm.plugin.recordvideo.activity.MMRecordUI) {
            android.content.Context context = shootComposingPluginLayout.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
            ((com.tencent.mm.plugin.recordvideo.activity.MMRecordUI) context).Z6();
        } else {
            android.content.Context context2 = shootComposingPluginLayout.getContext();
            android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
            if (activity != null) {
                activity.finish();
            }
        }
        return jz5.f0.f302826a;
    }
}
