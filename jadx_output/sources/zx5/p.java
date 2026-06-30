package zx5;

/* loaded from: classes13.dex */
public class p extends by5.l0 {

    /* renamed from: e, reason: collision with root package name */
    public static zx5.p f477255e;

    public static zx5.p Z() {
        if (f477255e == null) {
            f477255e = new zx5.p();
        }
        return f477255e;
    }

    @Override // by5.l0
    public boolean M() {
        if (!(2000 <= org.xwalk.core.XWalkEnvironment.h())) {
            if (!"true".equalsIgnoreCase(com.tencent.xweb.b.m().g("dis_update_immediately_when_no_xweb", "tools"))) {
                if (i().f36565d > 0) {
                    by5.c4.a(this.f36529a, "needForceUpdate, update failed before, do not force update");
                    if (!"true".equalsIgnoreCase(com.tencent.xweb.b.m().g("allow_failed_schedule_force_update", "tools"))) {
                        return false;
                    }
                }
                by5.c4.a(this.f36529a, "needForceUpdate, no availableVersion installed, do start download");
                return true;
            }
            by5.c4.a(this.f36529a, "needForceUpdate, no availableVersion but dis_update_immediately_when_no_xweb is true");
        }
        return false;
    }

    public zx5.f Y(by5.n0 n0Var) {
        java.lang.String str;
        int i17;
        java.lang.String str2;
        int i18;
        int i19;
        java.lang.String str3;
        java.lang.String str4;
        boolean z17;
        boolean z18;
        java.lang.String str5;
        java.lang.String str6;
        try {
            boolean z19 = n0Var.f36571j;
            by5.m0 m0Var = n0Var.f36574m;
            if (z19) {
                java.lang.String str7 = n0Var.f36567f;
                if (str7 != null && !str7.isEmpty() && (str5 = m0Var.f36542j) != null && !str5.isEmpty()) {
                    java.lang.String str8 = m0Var.f36542j;
                    java.lang.String str9 = n0Var.f36567f;
                    str = n0Var.f36568g;
                    i17 = m0Var.f36537e;
                    str2 = m0Var.f36550r;
                    i18 = m0Var.f36556x;
                    i19 = m0Var.f36554v;
                    str3 = str8;
                    str4 = str9;
                    z17 = true;
                    z18 = z17;
                    return new zx5.f(this, z17, str3, z18, i18, str4, str, i17, m0Var.f36538f, n0Var.f36569h, m0Var.f36549q, str2, i19, t(), n0Var.f36572k);
                }
                str = n0Var.f36568g;
                i17 = m0Var.f36537e;
                str2 = m0Var.f36550r;
                i18 = m0Var.f36556x;
                i19 = m0Var.f36554v;
                str3 = null;
                str4 = null;
                z17 = false;
                z18 = true;
                return new zx5.f(this, z17, str3, z18, i18, str4, str, i17, m0Var.f36538f, n0Var.f36569h, m0Var.f36549q, str2, i19, t(), n0Var.f36572k);
            }
            java.lang.String str10 = n0Var.f36567f;
            if (str10 != null && !str10.isEmpty()) {
                str6 = n0Var.f36567f;
                str = n0Var.f36568g;
                i17 = m0Var.f36537e;
                str2 = m0Var.f36550r;
                i18 = m0Var.f36556x;
                i19 = m0Var.f36554v;
                com.tencent.xweb.u0 u0Var = com.tencent.xweb.t0.f220594a;
                if (!by5.d4.e().getBoolean("enableDebugPackage", false)) {
                    str4 = null;
                    str3 = str6;
                    z18 = false;
                    z17 = true;
                    return new zx5.f(this, z17, str3, z18, i18, str4, str, i17, m0Var.f36538f, n0Var.f36569h, m0Var.f36549q, str2, i19, t(), n0Var.f36572k);
                }
                str = "http://dldir1.qq.com/weixin/android/wxwebtest/datafile/config/packagefile/runtime_package.zip";
                str4 = null;
                str3 = str6;
                z17 = false;
                z18 = z17;
                return new zx5.f(this, z17, str3, z18, i18, str4, str, i17, m0Var.f36538f, n0Var.f36569h, m0Var.f36549q, str2, i19, t(), n0Var.f36572k);
            }
            java.lang.String str11 = n0Var.f36568g;
            i17 = m0Var.f36537e;
            str2 = m0Var.f36550r;
            i18 = m0Var.f36556x;
            i19 = m0Var.f36554v;
            str = str11;
            str6 = null;
            str4 = null;
            str3 = str6;
            z17 = false;
            z18 = z17;
            return new zx5.f(this, z17, str3, z18, i18, str4, str, i17, m0Var.f36538f, n0Var.f36569h, m0Var.f36549q, str2, i19, t(), n0Var.f36572k);
        } catch (java.lang.Throwable th6) {
            by5.c4.d(this.f36529a, "getUpdateConfig error", th6);
            return null;
        }
        by5.c4.d(this.f36529a, "getUpdateConfig error", th6);
        return null;
    }

    public by5.n0 a0(by5.i iVar) {
        if (iVar == null) {
            return null;
        }
        by5.c4.a(this.f36529a, "onConfigDownLoaded, config version:" + iVar.f36480c + ", runtime abi:" + by5.a.b());
        if (com.tencent.xweb.g2.a()) {
            zx5.k kVar = org.xwalk.core.XWalkEnvironment.f347968a;
            if (!(!android.text.TextUtils.isEmpty(by5.e4.d()))) {
                by5.c4.a(this.f36529a, "onConfigDownLoaded, forbid download code");
                return null;
            }
        }
        by5.n0 b17 = new by5.q0().b(iVar, by5.a.b(), this);
        y(b17);
        by5.n0 Q = Q(b17);
        if (Q != null) {
            by5.c4.a(this.f36529a, "onConfigDownLoaded, download apk version:" + Q.f36574m.f36537e);
        }
        return Q;
    }

    @Override // by5.l0
    public java.lang.String k(boolean z17) {
        return !z17 ? com.tencent.xweb.b.m().g("UPDATE_SPEED_CONFIG", "tools") : com.tencent.xweb.b.m().g("UPDATE_FORWARD_SPEED_CONFIG", "tools");
    }

    @Override // by5.l0
    public java.lang.String r() {
        return "XWebCore";
    }

    @Override // by5.l0
    public synchronized boolean x() {
        if (!super.x()) {
            return false;
        }
        if (i().f36574m.f36537e > org.xwalk.core.XWalkEnvironment.g(i().f36574m.f36550r)) {
            return true;
        }
        by5.c4.g(this.f36529a, "hasScheduler, scheduler config version lower than current version");
        return false;
    }
}
