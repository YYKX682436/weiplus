package vr4;

@j95.b
/* loaded from: classes9.dex */
public class f1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public int f439720d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f439721e = 0;

    static {
        com.tencent.mm.wallet_core.a.h("ForgotPwdProcess", fs4.h.class);
        com.tencent.mm.wallet_core.a.h("BindCardProcess", qs4.j.class);
    }

    public f1() {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(dt4.b.f243228a);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a() ? m17.f213266a.F(m17.f213267b) : false) {
            return;
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, m17);
        if (m18.a()) {
            m18.f213266a.r(m18.f213267b);
        }
    }

    public static vr4.f1 wi() {
        return (vr4.f1) i95.n0.c(vr4.f1.class);
    }

    public at4.x1 Ai() {
        return ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        gm0.j1.i();
        this.f439720d = ((java.lang.Integer) gm0.j1.u().c().l(339975, 0)).intValue();
        gm0.j1.i();
        this.f439721e = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_AGREE_PAY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
    }
}
