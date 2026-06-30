package ij5;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.n0 f291782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ij5.n0 n0Var) {
        super(0);
        this.f291782d = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        java.lang.String stringExtra = this.f291782d.getIntent().getStringExtra("key_rightButtonLightFontColor");
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
