package yl2;

/* loaded from: classes3.dex */
public final class f1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f462998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f462999e;

    /* renamed from: f, reason: collision with root package name */
    public int f463000f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(yl2.g1 g1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f462999e = g1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f462998d = obj;
        this.f463000f |= Integer.MIN_VALUE;
        return this.f462999e.u(null, this);
    }
}
