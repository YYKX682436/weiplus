package pq3;

/* loaded from: classes12.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357610d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357611e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357612f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pq3.j f357613g;

    /* renamed from: h, reason: collision with root package name */
    public int f357614h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pq3.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357613g = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357612f = obj;
        this.f357614h |= Integer.MIN_VALUE;
        return pq3.j.b(this.f357613g, this);
    }
}
