package yx0;

/* loaded from: classes5.dex */
public final class r1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467604d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467605e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f467606f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467607g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467608h;

    /* renamed from: i, reason: collision with root package name */
    public int f467609i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467608h = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467607g = obj;
        this.f467609i |= Integer.MIN_VALUE;
        return this.f467608h.B(null, null, this);
    }
}
