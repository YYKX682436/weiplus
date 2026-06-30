package pq3;

/* loaded from: classes12.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357664d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357665e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pq3.q f357667g;

    /* renamed from: h, reason: collision with root package name */
    public int f357668h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(pq3.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357667g = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357666f = obj;
        this.f357668h |= Integer.MIN_VALUE;
        return this.f357667g.d(this);
    }
}
