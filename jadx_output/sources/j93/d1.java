package j93;

/* loaded from: classes.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.j1 f298370d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(j93.j1 j1Var) {
        super(0);
        this.f298370d = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        java.lang.String stringExtra = this.f298370d.getIntent().getStringExtra("key_rightButtonDarkFontColor");
        if (stringExtra != null) {
            if (!(!r26.n0.N(stringExtra))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                i17 = android.graphics.Color.parseColor(stringExtra);
                return java.lang.Integer.valueOf(i17);
            }
        }
        i17 = -1;
        return java.lang.Integer.valueOf(i17);
    }
}
