package g4;

/* loaded from: classes5.dex */
public final class m2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268432d;

    /* renamed from: e, reason: collision with root package name */
    public int f268433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.n2 f268434f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f268435g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f268436h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f268437i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f268438m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f268439n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f268440o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Object f268441p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(g4.n2 n2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268434f = n2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268432d = obj;
        this.f268433e |= Integer.MIN_VALUE;
        return this.f268434f.emit(null, this);
    }
}
