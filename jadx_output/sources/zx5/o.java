package zx5;

/* loaded from: classes13.dex */
public class o extends zx5.p {

    /* renamed from: f, reason: collision with root package name */
    public static zx5.o f477254f;

    public static zx5.o b0() {
        if (f477254f == null) {
            f477254f = new zx5.o();
        }
        return f477254f;
    }

    @Override // zx5.p, by5.l0
    public boolean M() {
        return false;
    }

    @Override // zx5.p
    public by5.n0 a0(by5.i iVar) {
        by5.n0 n0Var = null;
        if (iVar == null) {
            return null;
        }
        boolean z17 = false;
        if (!com.tencent.xweb.b.m().h("enable_predown_core", "tools", false)) {
            by5.c4.a(this.f36529a, "onConfigDownLoaded, config version:" + iVar.f36480c + ", disable predown core");
            a();
            if (by5.c1.d(org.xwalk.core.XWalkEnvironment.i())) {
                by5.s0.d(1749L, 85);
            }
            if ("armeabi-v7a".equalsIgnoreCase(by5.a.b())) {
                if (by5.u3.c("arm64-v8a").f36605a != -1) {
                    by5.u3.e(-1, null, "arm64-v8a");
                }
            } else if (by5.u3.c("armeabi-v7a").f36605a != -1) {
                by5.u3.e(-1, null, "armeabi-v7a");
            }
            return null;
        }
        java.lang.String g17 = com.tencent.xweb.b.m().g("pre_down_abi", "tools");
        by5.c4.a(this.f36529a, "onConfigDownLoaded, config version:" + iVar.f36480c + ", enable predown core:" + g17);
        if (!android.text.TextUtils.isEmpty(g17) && !g17.equalsIgnoreCase(by5.a.b())) {
            n0Var = new by5.q0().b(iVar, g17, this);
            if (n0Var != null) {
                by5.s0.e(577L, 240L, 1L);
            }
            y(n0Var);
        }
        if (n0Var != null) {
            by5.c4.a(this.f36529a, "onConfigDownLoaded, pre download version:" + n0Var.f36574m.f36537e);
            z17 = true;
        }
        by5.n0 Q = Q(n0Var);
        if (z17 && Q == n0Var) {
            if ("armeabi-v7a".equalsIgnoreCase(n0Var.f36574m.f36550r)) {
                by5.s0.e(577L, 236L, 1L);
            } else if ("arm64-v8a".equalsIgnoreCase(n0Var.f36574m.f36550r)) {
                by5.s0.e(577L, 237L, 1L);
            }
        }
        return Q;
    }

    @Override // zx5.p, by5.l0
    public java.lang.String r() {
        return "XWebCorePredown";
    }
}
