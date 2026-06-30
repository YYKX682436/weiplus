package zl2;

/* loaded from: classes3.dex */
public final class p2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f473917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zl2.r4 f473918e;

    /* renamed from: f, reason: collision with root package name */
    public int f473919f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(zl2.r4 r4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f473918e = r4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f473917d = obj;
        this.f473919f |= Integer.MIN_VALUE;
        return this.f473918e.s2(null, null, this);
    }
}
