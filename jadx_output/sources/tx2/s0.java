package tx2;

/* loaded from: classes15.dex */
public final class s0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.notice.NoticeStatusView f422656e;

    /* renamed from: f, reason: collision with root package name */
    public int f422657f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f422656e = noticeStatusView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f422655d = obj;
        this.f422657f |= Integer.MIN_VALUE;
        int i17 = com.tencent.mm.plugin.finder.view.notice.NoticeStatusView.f132732w;
        return this.f422656e.h(null, this);
    }
}
