package yx0;

/* loaded from: classes5.dex */
public final class c3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467218d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467219e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467220f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467221g;

    /* renamed from: h, reason: collision with root package name */
    public int f467222h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467221g = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467220f = obj;
        this.f467222h |= Integer.MIN_VALUE;
        return this.f467221g.a0(null, null, this);
    }
}
