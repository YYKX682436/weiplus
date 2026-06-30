package yx0;

/* loaded from: classes5.dex */
public final class t2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467650d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467651e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467652f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467653g;

    /* renamed from: h, reason: collision with root package name */
    public int f467654h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467653g = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467652f = obj;
        this.f467654h |= Integer.MIN_VALUE;
        return this.f467653g.S(null, this);
    }
}
