package yl2;

/* loaded from: classes3.dex */
public final class b0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f462975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f462976e;

    /* renamed from: f, reason: collision with root package name */
    public int f462977f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(yl2.g1 g1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f462976e = g1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f462975d = obj;
        this.f462977f |= Integer.MIN_VALUE;
        return this.f462976e.b(0, null, false, this);
    }
}
