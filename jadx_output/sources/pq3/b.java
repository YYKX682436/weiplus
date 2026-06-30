package pq3;

/* loaded from: classes12.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357605d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357606e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357607f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pq3.j f357608g;

    /* renamed from: h, reason: collision with root package name */
    public int f357609h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(pq3.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357608g = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357607f = obj;
        this.f357609h |= Integer.MIN_VALUE;
        return this.f357608g.e(this);
    }
}
