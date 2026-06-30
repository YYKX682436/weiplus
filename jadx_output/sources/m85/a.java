package m85;

/* loaded from: classes4.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f324825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m85.b f324826e;

    /* renamed from: f, reason: collision with root package name */
    public int f324827f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m85.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f324826e = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f324825d = obj;
        this.f324827f |= Integer.MIN_VALUE;
        return this.f324826e.k(0L, 0, this);
    }
}
