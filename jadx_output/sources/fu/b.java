package fu;

/* loaded from: classes5.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f266746d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f266747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fu.d f266748f;

    /* renamed from: g, reason: collision with root package name */
    public int f266749g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(fu.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f266748f = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f266747e = obj;
        this.f266749g |= Integer.MIN_VALUE;
        return this.f266748f.D(null, this);
    }
}
