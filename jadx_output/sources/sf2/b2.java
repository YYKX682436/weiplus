package sf2;

/* loaded from: classes10.dex */
public final class b2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407050d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407051e;

    /* renamed from: f, reason: collision with root package name */
    public int f407052f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407053g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f407054h;

    /* renamed from: i, reason: collision with root package name */
    public int f407055i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(sf2.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407054h = d3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407053g = obj;
        this.f407055i |= Integer.MIN_VALUE;
        return this.f407054h.a7(0, null, false, this);
    }
}
