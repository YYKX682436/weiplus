package nu0;

/* loaded from: classes5.dex */
public final class m2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f340020d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f340021e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f340022f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f340023g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f340024h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340025i;

    /* renamed from: m, reason: collision with root package name */
    public int f340026m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f340025i = b4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f340024h = obj;
        this.f340026m |= Integer.MIN_VALUE;
        return nu0.b4.c7(this.f340025i, this);
    }
}
