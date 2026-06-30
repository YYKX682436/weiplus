package pq3;

/* loaded from: classes12.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357669d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357670e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pq3.q f357672g;

    /* renamed from: h, reason: collision with root package name */
    public int f357673h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(pq3.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357672g = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357671f = obj;
        this.f357673h |= Integer.MIN_VALUE;
        return this.f357672g.e(this);
    }
}
