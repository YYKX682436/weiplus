package yx0;

/* loaded from: classes5.dex */
public final class r5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467613d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467614e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f467615f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467616g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467617h;

    /* renamed from: i, reason: collision with root package name */
    public int f467618i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467617h = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467616g = obj;
        this.f467618i |= Integer.MIN_VALUE;
        return yx0.b8.m(this.f467617h, null, this);
    }
}
