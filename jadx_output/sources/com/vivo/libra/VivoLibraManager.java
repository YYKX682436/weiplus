package com.vivo.libra;

/* loaded from: classes13.dex */
public final class VivoLibraManager {
    private static com.vivo.libra.VivoLibraManager sInstance;
    private com.vivo.libra.ILibraSdk mILibraSdk;
    private boolean mWaitPermission = true;

    public static com.vivo.libra.VivoLibraManager getInstance() {
        if (sInstance == null) {
            sInstance = new com.vivo.libra.VivoLibraManager();
        }
        return sInstance;
    }

    public boolean checkPermission(java.lang.String str) {
        if (!this.mWaitPermission) {
            return true;
        }
        if (this.mILibraSdk == null) {
            this.mILibraSdk = com.vivo.libra.ILibraSdk.Proxy.asInterfaces();
        }
        com.vivo.libra.ILibraSdk iLibraSdk = this.mILibraSdk;
        if (iLibraSdk == null) {
            return false;
        }
        boolean checkPermission = iLibraSdk.checkPermission(str);
        this.mWaitPermission = !checkPermission;
        return checkPermission;
    }

    public boolean funSupportCheck(java.lang.String str) {
        if (this.mWaitPermission) {
            return false;
        }
        return this.mILibraSdk.hasFun(str);
    }

    public int getShellTemp() {
        if (this.mWaitPermission) {
            return -2740;
        }
        return this.mILibraSdk.getIntResult("getShellTemp");
    }
}
