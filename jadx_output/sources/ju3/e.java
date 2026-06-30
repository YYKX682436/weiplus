package ju3;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout f301933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout cameraKitPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f301933d = cameraKitPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ju3.e(this.f301933d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ju3.e eVar = (ju3.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        eVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout cameraKitPluginLayout = this.f301933d;
        yt3.b recordPlugin = cameraKitPluginLayout.getRecordPlugin();
        java.lang.Boolean valueOf = recordPlugin != null ? java.lang.Boolean.valueOf(recordPlugin.c()) : null;
        com.tencent.mars.xlog.Log.e("MicroMsg.CameraKitPluginLayout", "CameraStatus trigger CameraGrab ,isRecording:" + valueOf);
        if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitPluginLayout", "CameraGrab and StopRecord");
            yt3.b recordPlugin2 = cameraKitPluginLayout.getRecordPlugin();
            if (recordPlugin2 != null) {
                recordPlugin2.k();
            }
        }
        return jz5.f0.f302826a;
    }
}
