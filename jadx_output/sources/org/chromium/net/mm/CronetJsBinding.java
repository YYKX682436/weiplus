package org.chromium.net.mm;

@org.chromium.base.annotations.JNINamespace("weapp_core")
/* loaded from: classes7.dex */
public abstract class CronetJsBinding {

    /* loaded from: classes7.dex */
    public interface Natives {
        void cancelAllRequests(long j17);

        void destroy(long j17);

        long initCronetJsBinding(org.chromium.net.mm.CronetJsBinding cronetJsBinding, long j17, long j18, long j19);

        void setupConfig(long j17, java.lang.String str, java.lang.String str2, long j18, long j19, long j27, long j28, java.lang.String str3, boolean z17);

        void setupMemoryPressureListener();
    }

    public static void setupMemoryPressureListener() {
        org.chromium.base.ThreadUtils.assertOnUiThread();
        org.chromium.net.mm.CronetJsBindingJni.get().setupMemoryPressureListener();
    }

    public void cancelAllRequests(long j17) {
        org.chromium.net.mm.CronetJsBindingJni.get().cancelAllRequests(j17);
    }

    public abstract boolean checkMatchIP(java.lang.String str);

    public void destroy(long j17) {
        org.chromium.net.mm.CronetJsBindingJni.get().destroy(j17);
    }

    public abstract org.chromium.net.mm.FileOpResult getAbsolutePathFromJSTempFile(java.lang.String str);

    public abstract java.lang.String[] getDownloadDomains();

    public abstract int getDownloadMaxFileSize();

    public abstract java.lang.String getReferer();

    public abstract java.lang.String[] getRequestDomains();

    public abstract java.lang.String getTempFileDir();

    public abstract java.lang.String[] getUploadDomains();

    public abstract int getUserVisibleDownloadMaxFileSize();

    public long initCronetJsBinding(long j17, long j18, long j19) {
        return org.chromium.net.mm.CronetJsBindingJni.get().initCronetJsBinding(this, j17, j18, j19);
    }

    public abstract org.chromium.net.mm.FileOpResult moveFileToJSFile(java.lang.String str, java.lang.String str2);

    public abstract org.chromium.net.mm.FileOpResult moveFileToJSTempDir(java.lang.String str, java.lang.String str2);

    public abstract void onHeaderReceived(java.lang.String str, java.lang.String str2, int i17);

    public abstract void onRequestCreated(java.lang.String str, int i17);

    public abstract void onRequestFinished(java.lang.String str, int i17);

    public abstract void onUserVisibleTaskCanceled(java.lang.String str, int i17);

    public abstract void onUserVisibleTaskFailed(java.lang.String str, int i17);

    public abstract void onUserVisibleTaskProgressUpdate(java.lang.String str, int i17, int i18, long j17, long j18);

    public abstract void onUserVisibleTaskStart(java.lang.String str, int i17);

    public abstract void onUserVisibleTaskSucceeded(java.lang.String str, int i17);

    public void setupConfig(long j17, java.lang.String str, java.lang.String str2, long j18, long j19, long j27, long j28, java.lang.String str3, boolean z17) {
        org.chromium.net.mm.CronetJsBindingJni.get().setupConfig(j17, str, str2, j18, j19, j27, j28, str3, z17);
    }

    public abstract boolean shouldCheckDomains();

    public boolean shouldEnableWildcardDomainMatch() {
        return false;
    }
}
