package qp;

/* loaded from: classes4.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f365668d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f365669e;

    /* renamed from: f, reason: collision with root package name */
    public long f365670f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f365671g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qp.b f365672h;

    /* renamed from: i, reason: collision with root package name */
    public int f365673i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qp.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f365672h = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f365671g = obj;
        this.f365673i |= Integer.MIN_VALUE;
        return this.f365672h.a(null, null, this);
    }
}
