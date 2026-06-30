package mx0;

/* loaded from: classes5.dex */
public final class i0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332036d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f332038f;

    /* renamed from: g, reason: collision with root package name */
    public int f332039g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(mx0.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f332038f = e1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f332037e = obj;
        this.f332039g |= Integer.MIN_VALUE;
        return mx0.e1.b(this.f332038f, this);
    }
}
