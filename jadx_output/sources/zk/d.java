package zk;

/* loaded from: classes12.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f473359d;

    /* renamed from: e, reason: collision with root package name */
    public int f473360e;

    /* renamed from: f, reason: collision with root package name */
    public long f473361f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f473362g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f473363h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.provider.ShareableChatRecordsProvider f473364i;

    /* renamed from: m, reason: collision with root package name */
    public int f473365m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.app.provider.ShareableChatRecordsProvider shareableChatRecordsProvider, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f473364i = shareableChatRecordsProvider;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f473363h = obj;
        this.f473365m |= Integer.MIN_VALUE;
        return com.tencent.mm.app.provider.ShareableChatRecordsProvider.a(this.f473364i, this);
    }
}
