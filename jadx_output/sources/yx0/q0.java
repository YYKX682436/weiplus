package yx0;

/* loaded from: classes5.dex */
public final class q0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467561d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467562e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467564g;

    /* renamed from: h, reason: collision with root package name */
    public int f467565h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467564g = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467563f = obj;
        this.f467565h |= Integer.MIN_VALUE;
        return this.f467564g.y(this);
    }
}
