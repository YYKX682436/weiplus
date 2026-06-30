package yx0;

/* loaded from: classes5.dex */
public final class g0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467317d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467318e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467319f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467320g;

    /* renamed from: h, reason: collision with root package name */
    public int f467321h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467320g = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467319f = obj;
        this.f467321h |= Integer.MIN_VALUE;
        return yx0.b8.a(this.f467320g, null, null, this);
    }
}
