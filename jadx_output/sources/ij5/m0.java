package ij5;

/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.n0 f291785d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ij5.n0 n0Var) {
        super(0);
        this.f291785d = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ij5.n0 n0Var = this.f291785d;
        java.lang.String stringExtra = n0Var.getIntent().getStringExtra("key_rightButtonWord");
        if (stringExtra != null) {
            if (!(!r26.n0.N(stringExtra))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return n0Var.getString(com.tencent.mm.R.string.f490441v5);
    }
}
