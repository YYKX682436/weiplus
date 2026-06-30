package x14;

/* loaded from: classes5.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f451439d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f451440e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f451441f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f451442g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f451443h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView f451444i;

    /* renamed from: m, reason: collision with root package name */
    public int f451445m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f451444i = getHdHeadImageGalleryView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f451443h = obj;
        this.f451445m |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView.e(this.f451444i, false, null, null, this);
    }
}
