package ku3;

/* loaded from: classes10.dex */
public final class l1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f312299d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f312300e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f312301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout f312302g;

    /* renamed from: h, reason: collision with root package name */
    public int f312303h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout professionalCameraKitPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f312302g = professionalCameraKitPluginLayout;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f312301f = obj;
        this.f312303h |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout.G(this.f312302g, this);
    }
}
