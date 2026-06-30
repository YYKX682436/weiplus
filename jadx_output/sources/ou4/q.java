package ou4;

/* loaded from: classes8.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f349009d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f349010e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ou4.s f349011f;

    /* renamed from: g, reason: collision with root package name */
    public int f349012g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ou4.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f349011f = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f349010e = obj;
        this.f349012g |= Integer.MIN_VALUE;
        return this.f349011f.e(null, null, null, null, this);
    }
}
