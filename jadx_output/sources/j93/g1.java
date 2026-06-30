package j93;

/* loaded from: classes.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.j1 f298392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(j93.j1 j1Var) {
        super(0);
        this.f298392d = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        j93.j1 j1Var = this.f298392d;
        java.lang.String stringExtra = j1Var.getIntent().getStringExtra("key_rightButtonWord");
        if (stringExtra != null) {
            if (!(!r26.n0.N(stringExtra))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return j1Var.getString(com.tencent.mm.R.string.f492313mb3);
    }
}
