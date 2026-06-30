package yx0;

/* loaded from: classes5.dex */
public final class f5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467300d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467301e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467302f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467303g;

    /* renamed from: h, reason: collision with root package name */
    public int f467304h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467303g = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467302f = obj;
        this.f467304h |= Integer.MIN_VALUE;
        return this.f467303g.p0(null, null, this);
    }
}
