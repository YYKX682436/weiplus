package mz0;

/* loaded from: classes5.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332931d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332932e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332933f;

    /* renamed from: g, reason: collision with root package name */
    public int f332934g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(mz0.b2 b2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f332933f = b2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f332932e = obj;
        this.f332934g |= Integer.MIN_VALUE;
        return this.f332933f.U6(this);
    }
}
