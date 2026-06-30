package zl2;

/* loaded from: classes3.dex */
public final class i5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public boolean f473823d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f473824e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f473825f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zl2.j5 f473826g;

    /* renamed from: h, reason: collision with root package name */
    public int f473827h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(zl2.j5 j5Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f473826g = j5Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f473825f = obj;
        this.f473827h |= Integer.MIN_VALUE;
        return this.f473826g.d(null, null, false, this);
    }
}
