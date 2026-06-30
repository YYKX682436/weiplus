package he4;

/* loaded from: classes4.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f280907d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f280908e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f280909f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ he4.c f280910g;

    /* renamed from: h, reason: collision with root package name */
    public int f280911h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(he4.c cVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f280910g = cVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain$startWork$1");
        this.f280909f = obj;
        this.f280911h |= Integer.MIN_VALUE;
        java.lang.Object h17 = he4.c.h(this.f280910g, null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain$startWork$1");
        return h17;
    }
}
