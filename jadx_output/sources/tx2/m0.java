package tx2;

/* loaded from: classes15.dex */
public final class m0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f422610d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f422611e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422612f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.notice.NoticeStatusView f422613g;

    /* renamed from: h, reason: collision with root package name */
    public int f422614h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f422613g = noticeStatusView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f422612f = obj;
        this.f422614h |= Integer.MIN_VALUE;
        int i17 = com.tencent.mm.plugin.finder.view.notice.NoticeStatusView.f132732w;
        return this.f422613g.b(null, this);
    }
}
