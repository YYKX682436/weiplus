package yx0;

/* loaded from: classes5.dex */
public final class a8 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467138d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467139e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467140f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467141g;

    /* renamed from: h, reason: collision with root package name */
    public int f467142h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467141g = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467140f = obj;
        this.f467142h |= Integer.MIN_VALUE;
        return this.f467141g.y0(null, this);
    }
}
