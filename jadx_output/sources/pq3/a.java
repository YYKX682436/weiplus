package pq3;

/* loaded from: classes12.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357601d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pq3.j f357603f;

    /* renamed from: g, reason: collision with root package name */
    public int f357604g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(pq3.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357603f = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357602e = obj;
        this.f357604g |= Integer.MIN_VALUE;
        return pq3.j.a(this.f357603f, this);
    }
}
