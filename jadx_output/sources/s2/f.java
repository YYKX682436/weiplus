package s2;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s2.b0 f402220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s2.f0 f402221e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(s2.b0 b0Var, s2.f0 f0Var) {
        super(1);
        this.f402220d = b0Var;
        this.f402221e = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        s2.b0 b0Var = this.f402220d;
        b0Var.setPositionProvider(this.f402221e);
        b0Var.n();
        return new s2.e();
    }
}
