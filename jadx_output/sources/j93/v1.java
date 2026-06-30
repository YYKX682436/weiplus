package j93;

/* loaded from: classes.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.w1 f298516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(j93.w1 w1Var) {
        super(0);
        this.f298516d = w1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stringExtra = this.f298516d.getIntent().getStringExtra("INTENT_KEY_SEARCH_LABEL_USERNAME_LIST");
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
