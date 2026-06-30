package yx0;

/* loaded from: classes5.dex */
public final class j2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467393e;

    /* renamed from: f, reason: collision with root package name */
    public int f467394f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467393e = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467392d = obj;
        this.f467394f |= Integer.MIN_VALUE;
        return this.f467393e.N(this);
    }
}
