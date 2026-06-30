package pp;

/* loaded from: classes9.dex */
public class a extends dm.i2 {

    /* renamed from: e2, reason: collision with root package name */
    public static final l75.e0 f357364e2 = dm.i2.initAutoDBInfo(pp.a.class);

    public a() {
    }

    public void c2(int i17) {
        int u07 = u0() | i17;
        if (u0() >= 0 && u0() < 536870912 && ((u07 >= 536870912 || u07 < 0) && h1().contains("@"))) {
            java.lang.String h17 = h1();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(u0());
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("Conversition", "wrong add attr flag: %s, %s, %s, %s", h17, valueOf, valueOf2, new com.tencent.mm.sdk.platformtools.z3());
            jx3.f.INSTANCE.d(20435, 2, java.lang.Integer.valueOf(u0()), java.lang.Integer.valueOf(i17), h1());
        }
        j1(i17 | u0());
    }

    public boolean d2(int i17) {
        return (i17 & u0()) != 0;
    }

    public void e2(int i17) {
        j1((~i17) & u0());
    }

    @Override // dm.i2, l75.f0
    public l75.e0 getDBInfo() {
        return f357364e2;
    }

    public a(java.lang.String str) {
        b2(str);
    }
}
