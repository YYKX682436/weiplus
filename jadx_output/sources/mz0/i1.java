package mz0;

/* loaded from: classes5.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(mz0.b2 b2Var) {
        super(0);
        this.f332969d = b2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mz0.b2 b2Var = this.f332969d;
        b2Var.f7().dismiss();
        db5.t7.g(b2Var.getContext(), b2Var.getString(com.tencent.mm.R.string.gvm));
        b2Var.B7(4);
        b2Var.getContext().setResult(0);
        b2Var.getContext().finish();
        return jz5.f0.f302826a;
    }
}
