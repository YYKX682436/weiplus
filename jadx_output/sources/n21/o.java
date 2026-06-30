package n21;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: e, reason: collision with root package name */
    public static n21.o f334276e;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.i6 f334277a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f334278b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f334279c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f334280d;

    public o() {
        n21.i iVar = new n21.i(this);
        this.f334277a = new com.tencent.mm.sdk.platformtools.i6(1, "speex_worker", 1);
        this.f334279c = new byte[0];
        this.f334280d = new n21.n(this);
        iVar.alive();
    }

    public static n21.o b() {
        if (f334276e == null) {
            f334276e = new n21.o();
        }
        return f334276e;
    }

    public final com.tencent.mm.vfs.r6 a(int i17, int i18) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(n21.c.a());
        if (!r6Var.m() || !r6Var.y()) {
            return null;
        }
        com.tencent.mm.vfs.r6[] G = r6Var.G();
        com.tencent.mm.vfs.r6 r6Var2 = null;
        for (int i19 = 0; G != null && i19 < G.length; i19++) {
            r6Var2 = G[i19];
            if (r6Var2 != null && r6Var2.A()) {
                r6Var2.u();
                java.lang.String u17 = r6Var2.u();
                long C = r6Var2.C();
                if (r6Var2.getName().endsWith(".spx")) {
                    if (C >= i17 && C <= i18) {
                        break;
                    }
                    com.tencent.mm.vfs.w6.h(u17);
                }
                r6Var2 = null;
            }
        }
        return r6Var2;
    }

    public void c() {
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postDelayed(new n21.m(this), 100L);
        }
    }
}
