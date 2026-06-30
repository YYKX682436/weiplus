package yx0;

/* loaded from: classes5.dex */
public final class e5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467280d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467282f;

    /* renamed from: g, reason: collision with root package name */
    public int f467283g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467282f = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467281e = obj;
        this.f467283g |= Integer.MIN_VALUE;
        return this.f467282f.o0(null, null, this);
    }
}
