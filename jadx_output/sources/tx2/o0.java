package tx2;

/* loaded from: classes15.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f422625d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f422626e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f422627f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422628g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.notice.NoticeStatusView f422629h;

    /* renamed from: i, reason: collision with root package name */
    public int f422630i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f422629h = noticeStatusView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f422628g = obj;
        this.f422630i |= Integer.MIN_VALUE;
        int i17 = com.tencent.mm.plugin.finder.view.notice.NoticeStatusView.f132732w;
        return this.f422629h.d(null, null, this);
    }
}
