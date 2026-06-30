package sf2;

/* loaded from: classes10.dex */
public final class z2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407380d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407381e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f407382f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f407383g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407384h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f407385i;

    /* renamed from: m, reason: collision with root package name */
    public int f407386m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(sf2.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407385i = d3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407384h = obj;
        this.f407386m |= Integer.MIN_VALUE;
        return this.f407385i.t7(null, null, this);
    }
}
