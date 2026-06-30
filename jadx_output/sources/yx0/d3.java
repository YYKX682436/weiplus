package yx0;

/* loaded from: classes5.dex */
public final class d3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467242d;

    /* renamed from: e, reason: collision with root package name */
    public int f467243e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467244f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467245g;

    /* renamed from: h, reason: collision with root package name */
    public int f467246h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467245g = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467244f = obj;
        this.f467246h |= Integer.MIN_VALUE;
        return yx0.b8.i(this.f467245g, this);
    }
}
