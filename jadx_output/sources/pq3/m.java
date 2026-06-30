package pq3;

/* loaded from: classes12.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357658d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357659e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f357660f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357661g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pq3.q f357662h;

    /* renamed from: i, reason: collision with root package name */
    public int f357663i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(pq3.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357662h = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357661g = obj;
        this.f357663i |= Integer.MIN_VALUE;
        return this.f357662h.b(null, this);
    }
}
