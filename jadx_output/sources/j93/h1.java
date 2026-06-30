package j93;

/* loaded from: classes.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.j1 f298400d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(j93.j1 j1Var) {
        super(0);
        this.f298400d = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f298400d.getIntent().getStringExtra("block_contact");
        if (stringExtra != null) {
            if (!(!r26.n0.N(stringExtra))) {
                stringExtra = null;
            }
            java.lang.String str = stringExtra;
            if (str != null) {
                return r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
            }
        }
        return kz5.p0.f313996d;
    }
}
