package rk1;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final rk1.a f396398d = new rk1.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            cl0.e eVar = new cl0.e(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_android_appbrand_wasm_precompile_black_list, "[]", true));
            int length = eVar.length();
            int[] iArr = new int[length];
            for (int i17 = 0; i17 < length; i17++) {
                iArr[i17] = eVar.getInt(i17);
            }
            return iArr;
        } catch (cl0.f unused) {
            return new int[0];
        }
    }
}
