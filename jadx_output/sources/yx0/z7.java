package yx0;

/* loaded from: classes5.dex */
public final class z7 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467817d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467818e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467820g;

    /* renamed from: h, reason: collision with root package name */
    public int f467821h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467820g = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467819f = obj;
        this.f467821h |= Integer.MIN_VALUE;
        return this.f467820g.x0(false, this);
    }
}
