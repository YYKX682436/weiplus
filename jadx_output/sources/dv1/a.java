package dv1;

/* loaded from: classes9.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f243798d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f243799e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f243800f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f243801g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dv1.b f243802h;

    /* renamed from: i, reason: collision with root package name */
    public int f243803i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(dv1.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f243802h = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f243801g = obj;
        this.f243803i |= Integer.MIN_VALUE;
        return this.f243802h.i(null, null, this);
    }
}
