package ju3;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout f301967d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout cameraKitPluginLayout) {
        super(0);
        this.f301967d = cameraKitPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitPluginLayout", "recorder reset finished");
        yt3.b recordPlugin = this.f301967d.getRecordPlugin();
        if (recordPlugin != null) {
            recordPlugin.reset();
        }
        return jz5.f0.f302826a;
    }
}
