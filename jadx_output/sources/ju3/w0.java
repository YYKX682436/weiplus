package ju3;

/* loaded from: classes10.dex */
public final class w0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f302032d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f302033e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f302034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout f302035g;

    /* renamed from: h, reason: collision with root package name */
    public int f302036h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout improveCameraKitPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f302035g = improveCameraKitPluginLayout;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f302034f = obj;
        this.f302036h |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout.H(this.f302035g, this);
    }
}
