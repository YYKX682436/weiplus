package yx0;

/* loaded from: classes5.dex */
public final class r0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467599d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467600e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467601f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467602g;

    /* renamed from: h, reason: collision with root package name */
    public int f467603h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467602g = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467601f = obj;
        this.f467603h |= Integer.MIN_VALUE;
        return this.f467602g.z(this);
    }
}
