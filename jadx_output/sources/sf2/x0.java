package sf2;

/* loaded from: classes10.dex */
public final class x0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407349d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407350e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407351f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f407352g;

    /* renamed from: h, reason: collision with root package name */
    public int f407353h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(sf2.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407352g = e1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407351f = obj;
        this.f407353h |= Integer.MIN_VALUE;
        return this.f407352g.i7(null, this);
    }
}
