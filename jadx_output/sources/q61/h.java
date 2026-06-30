package q61;

/* loaded from: classes11.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f360251d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f360252e;

    /* renamed from: f, reason: collision with root package name */
    public int f360253f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f360254g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q61.j f360255h;

    /* renamed from: i, reason: collision with root package name */
    public int f360256i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q61.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f360255h = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f360254g = obj;
        this.f360256i |= Integer.MIN_VALUE;
        return this.f360255h.c(0, null, null, null, this);
    }
}
