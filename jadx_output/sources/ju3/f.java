package ju3;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout f301938d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout cameraKitPluginLayout) {
        super(0);
        this.f301938d = cameraKitPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitPluginLayout", "recorder init finished");
        com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout cameraKitPluginLayout = this.f301938d;
        yt3.b recordPlugin = cameraKitPluginLayout.getRecordPlugin();
        if (recordPlugin != null) {
            recordPlugin.i(true);
        }
        cameraKitPluginLayout.A = true;
        return jz5.f0.f302826a;
    }
}
