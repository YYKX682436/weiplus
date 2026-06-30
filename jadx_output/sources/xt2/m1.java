package xt2;

/* loaded from: classes10.dex */
public final class m1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f456884d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f456885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xt2.u1 f456886f;

    /* renamed from: g, reason: collision with root package name */
    public int f456887g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(xt2.u1 u1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f456886f = u1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f456885e = obj;
        this.f456887g |= Integer.MIN_VALUE;
        return xt2.u1.a(this.f456886f, this);
    }
}
