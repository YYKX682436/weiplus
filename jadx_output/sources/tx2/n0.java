package tx2;

/* loaded from: classes15.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f422616d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f422617e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f422618f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422619g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.notice.NoticeStatusView f422620h;

    /* renamed from: i, reason: collision with root package name */
    public int f422621i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f422620h = noticeStatusView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f422619g = obj;
        this.f422621i |= Integer.MIN_VALUE;
        int i17 = com.tencent.mm.plugin.finder.view.notice.NoticeStatusView.f132732w;
        return this.f422620h.c(null, null, this);
    }
}
