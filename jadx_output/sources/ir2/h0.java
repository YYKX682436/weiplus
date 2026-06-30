package ir2;

/* loaded from: classes2.dex */
public final class h0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f294144d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ir2.a1 f294146f;

    /* renamed from: g, reason: collision with root package name */
    public int f294147g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ir2.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f294146f = a1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f294145e = obj;
        this.f294147g |= Integer.MIN_VALUE;
        return ir2.a1.N6(this.f294146f, null, this);
    }
}
