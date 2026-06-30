package yl2;

/* loaded from: classes3.dex */
public final class m0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f463047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f463048e;

    /* renamed from: f, reason: collision with root package name */
    public int f463049f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(yl2.g1 g1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f463048e = g1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f463047d = obj;
        this.f463049f |= Integer.MIN_VALUE;
        return this.f463048e.l(null, false, this);
    }
}
