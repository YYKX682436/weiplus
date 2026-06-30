package yx0;

/* loaded from: classes5.dex */
public final class c2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467210d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467211e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f467212f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f467213g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f467214h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467215i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467216m;

    /* renamed from: n, reason: collision with root package name */
    public int f467217n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467216m = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467215i = obj;
        this.f467217n |= Integer.MIN_VALUE;
        return yx0.b8.f(this.f467216m, null, null, this);
    }
}
