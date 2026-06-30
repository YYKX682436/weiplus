package sf2;

/* loaded from: classes10.dex */
public final class c3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407082d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407083e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f407084f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f407085g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407086h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f407087i;

    /* renamed from: m, reason: collision with root package name */
    public int f407088m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(sf2.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407087i = d3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407086h = obj;
        this.f407088m |= Integer.MIN_VALUE;
        return this.f407087i.u7(null, this);
    }
}
