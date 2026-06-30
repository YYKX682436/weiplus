package ju3;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout f301955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f301956e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout cameraKitPluginLayout, int i17) {
        super(0);
        this.f301955d = cameraKitPluginLayout;
        this.f301956e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout cameraKitPluginLayout = this.f301955d;
        cameraKitPluginLayout.getCameraSwitchPlugin().b(cameraKitPluginLayout.getEnableLandscape() ? 0 : this.f301956e);
        return jz5.f0.f302826a;
    }
}
