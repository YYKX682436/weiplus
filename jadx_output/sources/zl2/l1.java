package zl2;

/* loaded from: classes3.dex */
public final class l1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f473867d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f473868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zl2.r4 f473869f;

    /* renamed from: g, reason: collision with root package name */
    public int f473870g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(zl2.r4 r4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f473869f = r4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f473868e = obj;
        this.f473870g |= Integer.MIN_VALUE;
        return this.f473869f.J(null, null, this);
    }
}
