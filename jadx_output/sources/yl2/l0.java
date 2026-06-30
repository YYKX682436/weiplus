package yl2;

/* loaded from: classes3.dex */
public final class l0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f463041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f463042e;

    /* renamed from: f, reason: collision with root package name */
    public int f463043f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(yl2.g1 g1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f463042e = g1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f463041d = obj;
        this.f463043f |= Integer.MIN_VALUE;
        return this.f463042e.k(null, this);
    }
}
