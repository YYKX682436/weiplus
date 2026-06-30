package mx0;

/* loaded from: classes5.dex */
public final class g7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f332006e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332005d = shootComposingPluginLayout;
        this.f332006e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.g7(this.f332005d, this.f332006e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.g7 g7Var = (mx0.g7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        wx0.e0 cameraSwitchPlugin;
        wx0.v0 genderSwitchPlugin;
        wx0.s0 flashControlPlugin;
        mx0.c closePlugin;
        wx0.b1 replayPlugin;
        wx0.c0 beautifyPlugin;
        wx0.g1 subtitlePlugin;
        wx0.k0 countdownPlugin;
        wx0.z0 maxRecordDurationPlugin;
        wx0.f backgroundPlugin;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332005d;
        java.lang.String M = shootComposingPluginLayout.f69557v.M();
        int i17 = 0;
        if (!(!(M == null || r26.n0.N(M))) && !shootComposingPluginLayout.K) {
            i17 = this.f332006e;
        }
        cameraSwitchPlugin = shootComposingPluginLayout.getCameraSwitchPlugin();
        float f17 = i17;
        cameraSwitchPlugin.a(f17);
        genderSwitchPlugin = shootComposingPluginLayout.getGenderSwitchPlugin();
        genderSwitchPlugin.a(f17);
        flashControlPlugin = shootComposingPluginLayout.getFlashControlPlugin();
        flashControlPlugin.a(f17);
        closePlugin = shootComposingPluginLayout.getClosePlugin();
        closePlugin.a(f17);
        replayPlugin = shootComposingPluginLayout.getReplayPlugin();
        replayPlugin.a(f17);
        beautifyPlugin = shootComposingPluginLayout.getBeautifyPlugin();
        beautifyPlugin.a(f17);
        subtitlePlugin = shootComposingPluginLayout.getSubtitlePlugin();
        subtitlePlugin.a(f17);
        countdownPlugin = shootComposingPluginLayout.getCountdownPlugin();
        countdownPlugin.a(f17);
        maxRecordDurationPlugin = shootComposingPluginLayout.getMaxRecordDurationPlugin();
        maxRecordDurationPlugin.a(f17);
        backgroundPlugin = shootComposingPluginLayout.getBackgroundPlugin();
        backgroundPlugin.a(f17);
        com.tencent.mm.media.camera.view.CameraKitView cameraKitView = shootComposingPluginLayout.N;
        if (cameraKitView != null) {
            cameraKitView.setCurrentOrientation(i17);
        }
        return jz5.f0.f302826a;
    }
}
