package ju3;

/* loaded from: classes10.dex */
public final class c1 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f301922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.MediaTabCameraKitPluginLayout f301923b;

    public c1(boolean z17, com.tencent.mm.plugin.recordvideo.plugin.parent.MediaTabCameraKitPluginLayout mediaTabCameraKitPluginLayout) {
        this.f301922a = z17;
        this.f301923b = mediaTabCameraKitPluginLayout;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        kotlin.jvm.internal.o.d(bool);
        if (!bool.booleanValue() || this.f301922a) {
            return;
        }
        this.f301923b.T.f(androidx.lifecycle.m.ON_RESUME);
    }
}
