package com.tencent.mm.plugin.zero;

/* loaded from: classes12.dex */
public final /* synthetic */ class b$$a implements com.tencent.wcdb.support.Log.LogCallback {
    @Override // com.tencent.wcdb.support.Log.LogCallback
    public final void println(int i17, java.lang.String str, java.lang.String str2) {
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
