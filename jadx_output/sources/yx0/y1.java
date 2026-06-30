package yx0;

/* loaded from: classes5.dex */
public final class y1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467774d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467775e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467776f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467777g;

    /* renamed from: h, reason: collision with root package name */
    public int f467778h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467777g = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467776f = obj;
        this.f467778h |= Integer.MIN_VALUE;
        return this.f467777g.E(null, null, this);
    }
}
