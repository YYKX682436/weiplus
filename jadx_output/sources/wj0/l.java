package wj0;

/* loaded from: classes11.dex */
public class l implements java.lang.Runnable {
    public l(wj0.m mVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.hardcoder.WXHardCoderJNI wXHardCoderJNI = (com.tencent.mm.hardcoder.WXHardCoderJNI) i95.n0.c(com.tencent.mm.hardcoder.WXHardCoderJNI.class);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        objArr[1] = java.lang.Thread.currentThread().getName();
        objArr[2] = java.lang.Boolean.valueOf(wXHardCoderJNI.isCheckEnv() && wXHardCoderJNI.isRunning() > 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WXHardCoderJNI", "reportHardCoder tid[%d, %s], running[%b]", objArr);
        wXHardCoderJNI.reportIDKey(true, 0, 1, false);
        wXHardCoderJNI.readServerAddr(true);
        wXHardCoderJNI.reportIDKey(true, (!wXHardCoderJNI.isCheckEnv() || wXHardCoderJNI.isRunning() <= 0) ? 5 : 4, 1, false);
        wXHardCoderJNI.reportIDKey(true, wXHardCoderJNI.isHCEnable() ? 6 : 7, 1, false);
    }
}
