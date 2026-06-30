package hr3;

/* loaded from: classes11.dex */
public class ph implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f283902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 f283903e;

    public ph(com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3, boolean z17) {
        this.f283903e = sayHiWithSnsPermissionUI3;
        this.f283902d = z17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = this.f283903e;
        int i18 = sayHiWithSnsPermissionUI3.A ? 1 : this.f283902d ? 2 : 3;
        int i19 = com.tencent.mm.sdk.platformtools.t8.K0(sayHiWithSnsPermissionUI3.a7()) ? 3 : (sayHiWithSnsPermissionUI3.a7().equals(sayHiWithSnsPermissionUI3.f153862x) || sayHiWithSnsPermissionUI3.a7().equals(sayHiWithSnsPermissionUI3.f153861w)) ? 2 : 1;
        int i27 = 6;
        if (sayHiWithSnsPermissionUI3.H) {
            i17 = 6;
        } else {
            int i28 = sayHiWithSnsPermissionUI3.J1;
            i17 = (i28 & 8) != 0 ? 5 : ((i28 & 1) == 0 || (i28 & 2) == 0) ? (i28 & 2) != 0 ? 3 : (i28 & 1) != 0 ? 2 : 0 : 4;
        }
        int i29 = sayHiWithSnsPermissionUI3.f153868z;
        if (i29 == 1) {
            i27 = 4;
        } else if (i29 != 3) {
            if (i29 != 6 && i29 != 10 && i29 != 52) {
                if (i29 == 17) {
                    i27 = 5;
                } else if (i29 == 18 || i29 == 44) {
                    i27 = 9;
                } else if (i29 != 45) {
                    if (i29 == 48) {
                        i27 = 8;
                    } else if (i29 != 49) {
                        if (i29 != 78 && i29 != 79 && i29 != 181 && i29 != 182) {
                            switch (i29) {
                                case 13:
                                    break;
                                case 14:
                                    i27 = 7;
                                    break;
                                case 15:
                                    i27 = 2;
                                    break;
                                default:
                                    switch (i29) {
                                        case 21:
                                            break;
                                        default:
                                            switch (i29) {
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                    break;
                                                case 30:
                                                    break;
                                                default:
                                                    i27 = 11;
                                                    break;
                                            }
                                        case 22:
                                        case 23:
                                        case 24:
                                            i27 = 10;
                                            break;
                                    }
                            }
                        } else {
                            i27 = 12;
                        }
                    }
                }
            }
            i27 = 1;
        } else {
            i27 = 3;
        }
        java.util.ArrayList arrayList = sayHiWithSnsPermissionUI3.M;
        int size = arrayList.size();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int size2 = sayHiWithSnsPermissionUI3.Q.size();
        if (size2 > 0) {
            for (int i37 = 0; i37 < size2; i37++) {
                sb6.append((java.lang.String) sayHiWithSnsPermissionUI3.Q.get(i37));
                if (i37 < size2 - 1) {
                    sb6.append("#");
                }
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        int size3 = arrayList.size();
        if (size3 > 0) {
            for (int i38 = 0; i38 < size3; i38++) {
                sb7.append((java.lang.String) arrayList.get(i38));
                if (i38 < size3 - 1) {
                    sb7.append("#");
                }
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18713, sayHiWithSnsPermissionUI3.f153860v, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27), 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - sayHiWithSnsPermissionUI3.I1), java.lang.Integer.valueOf(((com.tencent.mm.storage.k4) c01.d9.b().q()).O(false, c01.e2.f37132p, c01.z1.r(), "weixin", "helper_entry", "filehelper")), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI3.K1), sb7.toString(), sb6, java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI3.L1), 0, java.lang.Integer.valueOf(sayHiWithSnsPermissionUI3.E[0]), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI3.E[1]), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI3.E[2]), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI3.E[3]), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI3.E[4]), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI3.E[5]), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI3.F[0]), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI3.F[1]), java.lang.Integer.valueOf(sayHiWithSnsPermissionUI3.F[2]));
    }
}
