package ju3;

/* loaded from: classes10.dex */
public final class h implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout f301946d;

    public h(com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout cameraKitPluginLayout) {
        this.f301946d = cameraKitPluginLayout;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Object C = this.f301946d.C((jz5.l) obj, continuation);
        return C == pz5.a.f359186d ? C : jz5.f0.f302826a;
    }
}
