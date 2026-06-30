package re4;

/* loaded from: classes.dex */
public enum f0 {
    INSTANCE;

    public void a(java.lang.String str, java.lang.String str2, int i17, int i18) {
        int i19;
        str.getClass();
        if (str.equals("requireSoterBiometricAuthentication")) {
            i19 = 0;
        } else if (str.equals("getSupportSoter")) {
            i19 = 1;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterReportManager", "unknown soter jsapi function name");
            i19 = -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterReportManager", "functionNameCode: %d", java.lang.Integer.valueOf(i19));
        if (i19 != -1) {
            jx3.f.INSTANCE.d(13711, java.lang.Integer.valueOf(i19), str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
    }
}
