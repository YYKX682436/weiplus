package gx0;

/* loaded from: classes5.dex */
public final class y7 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f277211d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f277212e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f277213f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f277214g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f277215h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f277216i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f277217m;

    /* renamed from: n, reason: collision with root package name */
    public int f277218n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f277217m = w8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f277216i = obj;
        this.f277218n |= Integer.MIN_VALUE;
        return gx0.w8.m7(this.f277217m, null, null, null, this);
    }
}
