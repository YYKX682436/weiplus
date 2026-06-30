package he4;

/* loaded from: classes4.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f280918d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f280919e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f280920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ he4.h f280921g;

    /* renamed from: h, reason: collision with root package name */
    public int f280922h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(he4.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f280921g = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoRemuxChain$doWorkImpl$1");
        this.f280920f = obj;
        this.f280922h |= Integer.MIN_VALUE;
        java.lang.Object a17 = this.f280921g.a(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.SnsPublishLivePhotoRemuxChain$doWorkImpl$1");
        return a17;
    }
}
