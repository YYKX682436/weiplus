package yx0;

/* loaded from: classes5.dex */
public final class q1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467566d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467567e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467569g;

    /* renamed from: h, reason: collision with root package name */
    public int f467570h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467569g = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467568f = obj;
        this.f467570h |= Integer.MIN_VALUE;
        return this.f467569g.A(this);
    }
}
