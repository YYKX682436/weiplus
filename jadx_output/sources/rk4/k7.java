package rk4;

/* loaded from: classes11.dex */
public final class k7 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f396784d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f396785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f396786f;

    /* renamed from: g, reason: collision with root package name */
    public int f396787g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(rk4.k8 k8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f396786f = k8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f396785e = obj;
        this.f396787g |= Integer.MIN_VALUE;
        return this.f396786f.q(this);
    }
}
