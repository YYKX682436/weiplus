package yx0;

/* loaded from: classes5.dex */
public final class h0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467347d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467348e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f467349f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467350g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467351h;

    /* renamed from: i, reason: collision with root package name */
    public int f467352i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467351h = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467350g = obj;
        this.f467352i |= Integer.MIN_VALUE;
        return yx0.b8.b(this.f467351h, null, false, this);
    }
}
