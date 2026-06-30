package ko0;

/* loaded from: classes5.dex */
public final class g0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f309854d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f309855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ko0.l0 f309856f;

    /* renamed from: g, reason: collision with root package name */
    public int f309857g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ko0.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f309856f = l0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f309855e = obj;
        this.f309857g |= Integer.MIN_VALUE;
        return this.f309856f.a(null, this);
    }
}
