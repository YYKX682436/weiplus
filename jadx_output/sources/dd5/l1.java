package dd5;

/* loaded from: classes12.dex */
public final class l1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f229199d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f229200e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dd5.m1 f229201f;

    /* renamed from: g, reason: collision with root package name */
    public int f229202g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(dd5.m1 m1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f229201f = m1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f229200e = obj;
        this.f229202g |= Integer.MIN_VALUE;
        return this.f229201f.w(null, null, this);
    }
}
