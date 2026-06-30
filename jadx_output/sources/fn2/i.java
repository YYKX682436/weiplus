package fn2;

/* loaded from: classes5.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f264276d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f264277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fn2.j f264278f;

    /* renamed from: g, reason: collision with root package name */
    public int f264279g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(fn2.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f264278f = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f264277e = obj;
        this.f264279g |= Integer.MIN_VALUE;
        return this.f264278f.emit(null, this);
    }
}
