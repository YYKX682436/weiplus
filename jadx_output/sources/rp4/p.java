package rp4;

/* loaded from: classes10.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f398679d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f398680e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f398681f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout f398682g;

    /* renamed from: h, reason: collision with root package name */
    public int f398683h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout editorVideoCompositionPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f398682g = editorVideoCompositionPluginLayout;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f398681f = obj;
        this.f398683h |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout.y(this.f398682g, this);
    }
}
