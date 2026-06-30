package com.tencent.mm.plugin.zero;

/* loaded from: classes12.dex */
public class f1 implements com.tencent.stubs.logger.Log.Logger {
    public f1(com.tencent.mm.plugin.zero.m1 m1Var) {
    }

    @Override // com.tencent.stubs.logger.Log.Logger
    public boolean isLoggable(java.lang.String str, int i17) {
        return i17 >= 2 && i17 <= 7 && com.tencent.mm.plugin.zero.m1.f188659g[i17] >= com.tencent.mars.xlog.Log.getLogLevel();
    }

    @Override // com.tencent.stubs.logger.Log.Logger
    public void println(int i17, java.lang.String str, java.lang.String str2) {
        if (isLoggable(str, i17)) {
            com.tencent.mars.xlog.Log.LogImp impl = com.tencent.mars.xlog.Log.getImpl();
            int myPid = android.os.Process.myPid();
            int myTid = android.os.Process.myTid();
            switch (i17) {
                case 2:
                    impl.logV(0L, str, "", "", 0, myPid, myTid, myPid, str2);
                    return;
                case 3:
                    impl.logD(0L, str, "", "", 0, myPid, myTid, myPid, str2);
                    return;
                case 4:
                    impl.logI(0L, str, "", "", 0, myPid, myTid, myPid, str2);
                    return;
                case 5:
                    impl.logW(0L, str, "", "", 0, myPid, myTid, myPid, str2);
                    return;
                case 6:
                    impl.logE(0L, str, "", "", 0, myPid, myTid, myPid, str2);
                    return;
                case 7:
                    impl.logF(0L, str, "", "", 0, myPid, myTid, myPid, str2);
                    return;
                default:
                    return;
            }
        }
    }
}
