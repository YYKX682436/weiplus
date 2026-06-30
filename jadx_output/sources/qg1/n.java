package qg1;

/* loaded from: classes7.dex */
public abstract class n {
    public static r45.de7 a(com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer) {
        r45.de7 de7Var = null;
        if (appBrandLaunchReferrer == null) {
            return null;
        }
        int i17 = appBrandLaunchReferrer.f77322d;
        if (1 == i17 || 5 == i17 || 4 == i17 || 2 == i17) {
            de7Var = new r45.de7();
            de7Var.f372366d = appBrandLaunchReferrer.f77323e;
            de7Var.f372367e = appBrandLaunchReferrer.f77329n;
            de7Var.f372368f = appBrandLaunchReferrer.f77328m;
        }
        if (appBrandLaunchReferrer.f77329n != 0) {
            if (de7Var == null) {
                de7Var = new r45.de7();
            }
            de7Var.f372367e = appBrandLaunchReferrer.f77329n;
        }
        return de7Var;
    }

    public static r45.ag7 b(com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer) {
        if (appBrandLaunchReferrer == null || 2 != appBrandLaunchReferrer.f77322d) {
            return null;
        }
        r45.ag7 ag7Var = new r45.ag7();
        ag7Var.f370003d = appBrandLaunchReferrer.f77323e;
        ag7Var.f370004e = appBrandLaunchReferrer.f77327i;
        return ag7Var;
    }
}
