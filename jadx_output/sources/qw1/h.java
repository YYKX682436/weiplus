package qw1;

/* loaded from: classes14.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f367093d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f367094e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f367095f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f367096g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qw1.j f367097h;

    /* renamed from: i, reason: collision with root package name */
    public int f367098i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qw1.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f367097h = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f367096g = obj;
        this.f367098i |= Integer.MIN_VALUE;
        return this.f367097h.b(null, false, this);
    }
}
