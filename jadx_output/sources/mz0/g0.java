package mz0;

/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332961d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(mz0.b2 b2Var) {
        super(0);
        this.f332961d = b2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mz0.b2 b2Var = this.f332961d;
        py0.f0 f0Var = new py0.f0(b2Var.getContext());
        f0Var.c(b2Var.getString(com.tencent.mm.R.string.gvp));
        return f0Var;
    }
}
