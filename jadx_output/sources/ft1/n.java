package ft1;

/* loaded from: classes11.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f266500d;

    /* renamed from: e, reason: collision with root package name */
    public int f266501e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f266502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ft1.q f266503g;

    /* renamed from: h, reason: collision with root package name */
    public int f266504h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ft1.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f266503g = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f266502f = obj;
        this.f266504h |= Integer.MIN_VALUE;
        return ft1.q.b(this.f266503g, null, 0, this);
    }
}
