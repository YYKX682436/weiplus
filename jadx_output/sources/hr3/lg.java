package hr3;

/* loaded from: classes11.dex */
public class lg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f283780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI f283781e;

    public lg(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI, int i17) {
        this.f283781e = sayHiWithSnsPermissionUI;
        this.f283780d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = this.f283781e;
        java.util.ArrayList arrayList = sayHiWithSnsPermissionUI.K;
        int size = arrayList.size();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int size2 = sayHiWithSnsPermissionUI.N.size();
        if (size2 > 0) {
            for (int i17 = 0; i17 < size2; i17++) {
                sb6.append((java.lang.String) sayHiWithSnsPermissionUI.N.get(i17));
                if (i17 < size2 - 1) {
                    sb6.append("#");
                }
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        int size3 = arrayList.size();
        if (size3 > 0) {
            for (int i18 = 0; i18 < size3; i18++) {
                sb7.append((java.lang.String) arrayList.get(i18));
                if (i18 < size3 - 1) {
                    sb7.append("#");
                }
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18713, sayHiWithSnsPermissionUI.f153826q, java.lang.Integer.valueOf(this.f283780d), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI.F1), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI.G1), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI.H1), 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - sayHiWithSnsPermissionUI.D1), java.lang.Integer.valueOf(((com.tencent.mm.storage.k4) c01.d9.b().q()).O(false, c01.e2.f37132p, c01.z1.r(), "weixin", "helper_entry", "filehelper")), "", sb7.toString(), sb6, java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI.I1), 0, java.lang.Integer.valueOf(sayHiWithSnsPermissionUI.f153839z[0]), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI.f153839z[1]), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI.f153839z[2]), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI.f153839z[3]), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI.f153839z[4]), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI.f153839z[5]), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI.A[0]), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI.A[1]), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI.A[2]));
    }
}
