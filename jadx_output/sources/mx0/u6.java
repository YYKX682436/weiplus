package mx0;

/* loaded from: classes5.dex */
public final class u6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332374d;

    /* renamed from: e, reason: collision with root package name */
    public int f332375e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332376f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mx0.v6 f332377g;

    /* renamed from: h, reason: collision with root package name */
    public int f332378h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(mx0.v6 v6Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f332377g = v6Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f332376f = obj;
        this.f332378h |= Integer.MIN_VALUE;
        return this.f332377g.emit(null, this);
    }
}
