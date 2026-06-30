package yx0;

/* loaded from: classes5.dex */
public final class p0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467532d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467533e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467535g;

    /* renamed from: h, reason: collision with root package name */
    public int f467536h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467535g = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467534f = obj;
        this.f467536h |= Integer.MIN_VALUE;
        return this.f467535g.x(this);
    }
}
