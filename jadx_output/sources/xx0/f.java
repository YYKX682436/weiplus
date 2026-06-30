package xx0;

/* loaded from: classes5.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f457889d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f457890e;

    /* renamed from: f, reason: collision with root package name */
    public long f457891f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f457892g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xx0.i f457893h;

    /* renamed from: i, reason: collision with root package name */
    public int f457894i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xx0.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f457893h = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f457892g = obj;
        this.f457894i |= Integer.MIN_VALUE;
        return this.f457893h.c(null, this);
    }
}
