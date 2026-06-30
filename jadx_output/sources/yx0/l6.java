package yx0;

/* loaded from: classes5.dex */
public final class l6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467438d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467440f;

    /* renamed from: g, reason: collision with root package name */
    public int f467441g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467440f = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467439e = obj;
        this.f467441g |= Integer.MIN_VALUE;
        return this.f467440f.t0(null, this);
    }
}
