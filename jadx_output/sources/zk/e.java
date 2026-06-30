package zk;

/* loaded from: classes12.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f473366d;

    /* renamed from: e, reason: collision with root package name */
    public long f473367e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f473368f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f473369g;

    /* renamed from: h, reason: collision with root package name */
    public int f473370h;

    /* renamed from: i, reason: collision with root package name */
    public int f473371i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f473372m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.provider.ShareableChatRecordsProvider f473373n;

    /* renamed from: o, reason: collision with root package name */
    public int f473374o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.app.provider.ShareableChatRecordsProvider shareableChatRecordsProvider, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f473373n = shareableChatRecordsProvider;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f473372m = obj;
        this.f473374o |= Integer.MIN_VALUE;
        return com.tencent.mm.app.provider.ShareableChatRecordsProvider.b(this.f473373n, 0L, null, this);
    }
}
