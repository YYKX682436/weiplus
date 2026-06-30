package ju3;

/* loaded from: classes10.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout f302017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout improveCameraKitPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f302017d = improveCameraKitPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ju3.t0(this.f302017d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ju3.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout improveCameraKitPluginLayout = this.f302017d;
        improveCameraKitPluginLayout.getClosePlugin().setVisibility(8);
        improveCameraKitPluginLayout.getCameraSwitchPlugin().setVisibility(8);
        improveCameraKitPluginLayout.getSwitchFlashPlugin().f465345d.setVisibility(8);
        nu3.i iVar = nu3.i.f340218a;
        iVar.n("KEY_CAMERA_SESSION_ID", nu3.f.f340212c);
        iVar.n("KEY_CAMERA_ENTER_SESSION_ID", nu3.f.f340213d);
        iVar.n("KEY_CHAT_USERNAME", nu3.f.f340214e);
        iVar.n("KEY_ROOM_SIZE", new java.lang.Integer(nu3.f.f340215f));
        iVar.n("KEY_MEDIA_SOURCE_INT", new java.lang.Integer(improveCameraKitPluginLayout.getCameraSwitchPlugin().f465731h ? 1 : 2));
        improveCameraKitPluginLayout.K(1, 2);
        com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout.G(improveCameraKitPluginLayout);
        yt3.b recordPlugin = improveCameraKitPluginLayout.getRecordPlugin();
        if (recordPlugin == null) {
            return null;
        }
        recordPlugin.f(false);
        return jz5.f0.f302826a;
    }
}
