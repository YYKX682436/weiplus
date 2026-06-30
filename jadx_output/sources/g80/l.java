package g80;

/* loaded from: classes12.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f269493d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f269494e;

    /* renamed from: f, reason: collision with root package name */
    public long f269495f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f269496g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g80.o f269497h;

    /* renamed from: i, reason: collision with root package name */
    public int f269498i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g80.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f269497h = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f269496g = obj;
        this.f269498i |= Integer.MIN_VALUE;
        return this.f269497h.d7(null, this);
    }
}
