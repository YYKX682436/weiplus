package dd5;

/* loaded from: classes12.dex */
public final class a3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f229085d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f229086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dd5.c3 f229087f;

    /* renamed from: g, reason: collision with root package name */
    public int f229088g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(dd5.c3 c3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f229087f = c3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f229086e = obj;
        this.f229088g |= Integer.MIN_VALUE;
        return this.f229087f.A(null, this);
    }
}
