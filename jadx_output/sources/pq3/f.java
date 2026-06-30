package pq3;

/* loaded from: classes12.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357620d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357621e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f357622f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357623g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pq3.j f357624h;

    /* renamed from: i, reason: collision with root package name */
    public int f357625i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(pq3.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357624h = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357623g = obj;
        this.f357625i |= Integer.MIN_VALUE;
        return pq3.j.c(this.f357624h, null, this);
    }
}
