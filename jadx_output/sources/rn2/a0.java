package rn2;

/* loaded from: classes.dex */
public final class a0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f397634d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f397635e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f397636f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f397637g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f397638h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rn2.l0 f397639i;

    /* renamed from: m, reason: collision with root package name */
    public int f397640m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(rn2.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f397639i = l0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f397638h = obj;
        this.f397640m |= Integer.MIN_VALUE;
        return rn2.l0.a(this.f397639i, null, null, this);
    }
}
