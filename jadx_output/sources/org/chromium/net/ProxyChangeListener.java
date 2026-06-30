package org.chromium.net;

@org.chromium.base.annotations.JNINamespace("net")
/* loaded from: classes13.dex */
public class ProxyChangeListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String TAG = "ProxyChangeListener";
    private static boolean sEnabled = true;
    private org.chromium.net.ProxyChangeListener.Delegate mDelegate;
    private final android.os.Handler mHandler;
    private final android.os.Looper mLooper;
    private long mNativePtr;
    private org.chromium.net.ProxyChangeListener.ProxyReceiver mProxyReceiver;
    private android.content.BroadcastReceiver mRealProxyReceiver;

    /* loaded from: classes13.dex */
    public interface Delegate {
        void proxySettingsChanged();
    }

    /* loaded from: classes13.dex */
    public interface Natives {
        @org.chromium.base.annotations.NativeClassQualifiedName("ProxyConfigServiceAndroid::JNIDelegate")
        void proxySettingsChanged(long j17, org.chromium.net.ProxyChangeListener proxyChangeListener);

        @org.chromium.base.annotations.NativeClassQualifiedName("ProxyConfigServiceAndroid::JNIDelegate")
        void proxySettingsChangedTo(long j17, org.chromium.net.ProxyChangeListener proxyChangeListener, java.lang.String str, int i17, java.lang.String str2, java.lang.String[] strArr);
    }

    /* loaded from: classes13.dex */
    public static class ProxyConfig {
        public static final org.chromium.net.ProxyChangeListener.ProxyConfig DIRECT = new org.chromium.net.ProxyChangeListener.ProxyConfig("", 0, "", new java.lang.String[0]);
        public final java.lang.String[] mExclusionList;
        public final java.lang.String mHost;
        public final java.lang.String mPacUrl;
        public final int mPort;

        public ProxyConfig(java.lang.String str, int i17, java.lang.String str2, java.lang.String[] strArr) {
            this.mHost = str;
            this.mPort = i17;
            this.mPacUrl = str2;
            this.mExclusionList = strArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static org.chromium.net.ProxyChangeListener.ProxyConfig fromProxyInfo(android.net.ProxyInfo proxyInfo) {
            if (proxyInfo == null) {
                return null;
            }
            java.lang.String host = proxyInfo.getHost();
            android.net.Uri pacFileUrl = proxyInfo.getPacFileUrl();
            if (host == null) {
                host = "";
            }
            return new org.chromium.net.ProxyChangeListener.ProxyConfig(host, proxyInfo.getPort(), android.net.Uri.EMPTY.equals(pacFileUrl) ? null : pacFileUrl.toString(), proxyInfo.getExclusionList());
        }

        public java.lang.String toString() {
            java.lang.String str = (this.mHost.equals("localhost") || this.mHost.isEmpty()) ? this.mHost : "<redacted>";
            java.util.Locale locale = java.util.Locale.US;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str;
            objArr[1] = java.lang.Integer.valueOf(this.mPort);
            objArr[2] = this.mPacUrl == null ? "null" : "\"<redacted>\"";
            return java.lang.String.format(locale, "ProxyConfig [mHost=\"%s\", mPort=%d, mPacUrl=%s]", objArr);
        }
    }

    /* loaded from: classes13.dex */
    public class ProxyReceiver extends android.content.BroadcastReceiver {
        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$0(android.content.Intent intent) {
            org.chromium.net.ProxyChangeListener.this.proxySettingsChanged(org.chromium.net.ProxyChangeListener.extractNewProxy(intent));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, final android.content.Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                org.chromium.net.ProxyChangeListener.this.runOnThread(new java.lang.Runnable() { // from class: org.chromium.net.ProxyChangeListener$ProxyReceiver$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        org.chromium.net.ProxyChangeListener.ProxyReceiver.this.lambda$onReceive$0(intent);
                    }
                });
            }
        }

        private ProxyReceiver() {
        }
    }

    private ProxyChangeListener() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        this.mLooper = myLooper;
        this.mHandler = new android.os.Handler(myLooper);
    }

    private void assertOnThread() {
        if (org.chromium.build.BuildConfig.ENABLE_ASSERTS && !onThread()) {
            throw new java.lang.IllegalStateException("Must be called on ProxyChangeListener thread.");
        }
    }

    public static org.chromium.net.ProxyChangeListener create() {
        return new org.chromium.net.ProxyChangeListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static org.chromium.net.ProxyChangeListener.ProxyConfig extractNewProxy(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        return org.chromium.net.ProxyChangeListener.ProxyConfig.fromProxyInfo((android.net.ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
    }

    public static java.lang.String getProperty(java.lang.String str) {
        return java.lang.System.getProperty(str);
    }

    private org.chromium.net.ProxyChangeListener.ProxyConfig getProxyConfig(android.content.Intent intent) {
        org.chromium.net.ProxyChangeListener.ProxyConfig fromProxyInfo = org.chromium.net.ProxyChangeListener.ProxyConfig.fromProxyInfo(((android.net.ConnectivityManager) org.chromium.base.ContextUtils.getApplicationContext().getSystemService("connectivity")).getDefaultProxy());
        if (fromProxyInfo == null) {
            return org.chromium.net.ProxyChangeListener.ProxyConfig.DIRECT;
        }
        if (android.os.Build.VERSION.SDK_INT < 29 || !fromProxyInfo.mHost.equals("localhost") || fromProxyInfo.mPort != -1) {
            return fromProxyInfo;
        }
        org.chromium.net.ProxyChangeListener.ProxyConfig extractNewProxy = extractNewProxy(intent);
        org.chromium.base.Log.i(TAG, "configFromConnectivityManager = %s, configFromIntent = %s", fromProxyInfo, extractNewProxy);
        if (extractNewProxy == null) {
            return null;
        }
        return new org.chromium.net.ProxyChangeListener.ProxyConfig(extractNewProxy.mHost, extractNewProxy.mPort, fromProxyInfo.mPacUrl, fromProxyInfo.mExclusionList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDelegateForTesting$0(org.chromium.net.ProxyChangeListener.Delegate delegate) {
        this.mDelegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateProxyConfigFromConnectivityManager$1(android.content.Intent intent) {
        proxySettingsChanged(getProxyConfig(intent));
    }

    private boolean onThread() {
        return this.mLooper == android.os.Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void proxySettingsChanged(org.chromium.net.ProxyChangeListener.ProxyConfig proxyConfig) {
        assertOnThread();
        if (sEnabled) {
            org.chromium.net.ProxyChangeListener.Delegate delegate = this.mDelegate;
            if (delegate != null) {
                delegate.proxySettingsChanged();
            }
            if (this.mNativePtr == 0) {
                return;
            }
            if (proxyConfig != null) {
                org.chromium.net.ProxyChangeListenerJni.get().proxySettingsChangedTo(this.mNativePtr, this, proxyConfig.mHost, proxyConfig.mPort, proxyConfig.mPacUrl, proxyConfig.mExclusionList);
            } else {
                org.chromium.net.ProxyChangeListenerJni.get().proxySettingsChanged(this.mNativePtr, this);
            }
        }
    }

    private void registerBroadcastReceiver() {
        assertOnThread();
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        this.mProxyReceiver = new org.chromium.net.ProxyChangeListener.ProxyReceiver();
        if (!org.chromium.base.ContextUtils.isSdkSandboxProcess()) {
            org.chromium.base.ContextUtils.registerNonExportedBroadcastReceiver(org.chromium.base.ContextUtils.getApplicationContext(), this.mProxyReceiver, new android.content.IntentFilter());
        }
        this.mRealProxyReceiver = new org.chromium.net.ProxyBroadcastReceiver(this);
        org.chromium.base.ContextUtils.registerProtectedBroadcastReceiver(org.chromium.base.ContextUtils.getApplicationContext(), this.mRealProxyReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnThread(java.lang.Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }

    public static void setEnabled(boolean z17) {
        sEnabled = z17;
    }

    private void unregisterBroadcastReceiver() {
        assertOnThread();
        org.chromium.base.ContextUtils.getApplicationContext().unregisterReceiver(this.mProxyReceiver);
        if (this.mRealProxyReceiver != null) {
            org.chromium.base.ContextUtils.getApplicationContext().unregisterReceiver(this.mRealProxyReceiver);
        }
        this.mProxyReceiver = null;
        this.mRealProxyReceiver = null;
    }

    public void setDelegateForTesting(org.chromium.net.ProxyChangeListener.Delegate delegate) {
        final org.chromium.net.ProxyChangeListener.Delegate delegate2 = this.mDelegate;
        this.mDelegate = delegate;
        org.chromium.base.ResettersForTesting.register(new java.lang.Runnable() { // from class: org.chromium.net.ProxyChangeListener$$b
            @Override // java.lang.Runnable
            public final void run() {
                org.chromium.net.ProxyChangeListener.this.lambda$setDelegateForTesting$0(delegate2);
            }
        });
    }

    public void start(long j17) {
        org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped("ProxyChangeListener.start");
        try {
            assertOnThread();
            this.mNativePtr = j17;
            registerBroadcastReceiver();
            if (scoped != null) {
                scoped.close();
            }
        } catch (java.lang.Throwable th6) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public void stop() {
        assertOnThread();
        this.mNativePtr = 0L;
        unregisterBroadcastReceiver();
    }

    public void updateProxyConfigFromConnectivityManager(final android.content.Intent intent) {
        runOnThread(new java.lang.Runnable() { // from class: org.chromium.net.ProxyChangeListener$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.chromium.net.ProxyChangeListener.this.lambda$updateProxyConfigFromConnectivityManager$1(intent);
            }
        });
    }
}
