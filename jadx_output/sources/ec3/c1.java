package ec3;

/* loaded from: classes9.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f250992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f250993e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(ec3.g1 g1Var, yz5.a aVar) {
        super(0);
        this.f250992d = g1Var;
        this.f250993e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ec3.g1 g1Var = this.f250992d;
        android.widget.TextView W6 = g1Var.W6();
        if (W6 != null) {
            W6.setText(g1Var.getString(com.tencent.mm.R.string.f492439o80));
        }
        android.widget.TextView W62 = g1Var.W6();
        if (W62 != null) {
            W62.postDelayed(new ec3.b1(g1Var, this.f250993e), 70L);
        }
        return jz5.f0.f302826a;
    }
}
