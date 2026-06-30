package ju3;

/* loaded from: classes10.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f302001d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f302002e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f302003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout f302004g;

    /* renamed from: h, reason: collision with root package name */
    public int f302005h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout cameraKitPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f302004g = cameraKitPluginLayout;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f302003f = obj;
        this.f302005h |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout.B(this.f302004g, this);
    }
}
