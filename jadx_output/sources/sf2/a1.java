package sf2;

/* loaded from: classes10.dex */
public final class a1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407027d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407028e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f407029f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f407030g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407031h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f407032i;

    /* renamed from: m, reason: collision with root package name */
    public int f407033m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(sf2.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407032i = e1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407031h = obj;
        this.f407033m |= Integer.MIN_VALUE;
        return this.f407032i.l7(false, null, null, this);
    }
}
