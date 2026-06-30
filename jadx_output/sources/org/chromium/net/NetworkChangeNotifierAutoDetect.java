package org.chromium.net;

/* loaded from: classes13.dex */
public class NetworkChangeNotifierAutoDetect extends android.content.BroadcastReceiver {
    private static final java.lang.String TAG = "NetworkChangeNotifierAutoDetect";
    private static final int UNKNOWN_LINK_SPEED = -1;
    private org.chromium.net.NetworkChangeNotifierAutoDetect.ConnectivityManagerDelegate mConnectivityManagerDelegate;
    private android.net.ConnectivityManager.NetworkCallback mDefaultNetworkCallback;
    private final android.os.Handler mHandler;
    private boolean mIgnoreNextBroadcast;
    private final org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkConnectivityIntentFilter mIntentFilter;
    private final android.os.Looper mLooper;
    private org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback mNetworkCallback;
    private android.net.NetworkRequest mNetworkRequest;
    private org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState mNetworkState;
    private final org.chromium.net.NetworkChangeNotifierAutoDetect.Observer mObserver;
    private boolean mRegisterNetworkCallbackFailed;
    private boolean mRegistered;
    private final org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy mRegistrationPolicy;
    private boolean mShouldSignalObserver;
    private org.chromium.net.NetworkChangeNotifierAutoDetect.WifiManagerDelegate mWifiManagerDelegate;

    /* loaded from: classes13.dex */
    public class AndroidRDefaultNetworkCallback extends android.net.ConnectivityManager.NetworkCallback {
        android.net.LinkProperties mLinkProperties;
        android.net.NetworkCapabilities mNetworkCapabilities;

        private org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState getNetworkState(android.net.Network network) {
            int i17;
            int i18;
            int type;
            if (!this.mNetworkCapabilities.hasTransport(1) && !this.mNetworkCapabilities.hasTransport(5)) {
                if (this.mNetworkCapabilities.hasTransport(0)) {
                    android.net.NetworkInfo rawNetworkInfo = org.chromium.net.NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getRawNetworkInfo(network);
                    i18 = rawNetworkInfo != null ? rawNetworkInfo.getSubtype() : -1;
                    i17 = 0;
                } else {
                    if (this.mNetworkCapabilities.hasTransport(3)) {
                        type = 9;
                    } else if (this.mNetworkCapabilities.hasTransport(2)) {
                        type = 7;
                    } else if (this.mNetworkCapabilities.hasTransport(4)) {
                        android.net.NetworkInfo networkInfo = org.chromium.net.NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkInfo(network);
                        type = networkInfo != null ? networkInfo.getType() : 17;
                    } else {
                        i17 = -1;
                        i18 = -1;
                    }
                    i17 = type;
                }
                return new org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState(true, i17, i18, !this.mNetworkCapabilities.hasCapability(11), java.lang.String.valueOf(org.chromium.net.NetworkChangeNotifierAutoDetect.networkToNetId(network)), org.chromium.base.compat.ApiHelperForP.isPrivateDnsActive(this.mLinkProperties), org.chromium.base.compat.ApiHelperForP.getPrivateDnsServerName(this.mLinkProperties));
            }
            i17 = 1;
            i18 = -1;
            return new org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState(true, i17, i18, !this.mNetworkCapabilities.hasCapability(11), java.lang.String.valueOf(org.chromium.net.NetworkChangeNotifierAutoDetect.networkToNetId(network)), org.chromium.base.compat.ApiHelperForP.isPrivateDnsActive(this.mLinkProperties), org.chromium.base.compat.ApiHelperForP.getPrivateDnsServerName(this.mLinkProperties));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network network) {
            this.mLinkProperties = null;
            this.mNetworkCapabilities = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            this.mNetworkCapabilities = networkCapabilities;
            if (!org.chromium.net.NetworkChangeNotifierAutoDetect.this.mRegistered || this.mLinkProperties == null || this.mNetworkCapabilities == null) {
                return;
            }
            org.chromium.net.NetworkChangeNotifierAutoDetect.this.connectionTypeChangedTo(getNetworkState(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(android.net.Network network, android.net.LinkProperties linkProperties) {
            this.mLinkProperties = linkProperties;
            if (!org.chromium.net.NetworkChangeNotifierAutoDetect.this.mRegistered || this.mLinkProperties == null || this.mNetworkCapabilities == null) {
                return;
            }
            org.chromium.net.NetworkChangeNotifierAutoDetect.this.connectionTypeChangedTo(getNetworkState(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network network) {
            this.mLinkProperties = null;
            this.mNetworkCapabilities = null;
            if (org.chromium.net.NetworkChangeNotifierAutoDetect.this.mRegistered) {
                org.chromium.net.NetworkChangeNotifierAutoDetect.this.connectionTypeChangedTo(new org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState(false, -1, -1, false, null, false, ""));
            }
        }

        private AndroidRDefaultNetworkCallback() {
        }
    }

    /* loaded from: classes13.dex */
    public class DefaultNetworkCallback extends android.net.ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network network) {
            if (org.chromium.net.NetworkChangeNotifierAutoDetect.this.mRegistered) {
                org.chromium.net.NetworkChangeNotifierAutoDetect.this.connectionTypeChanged();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(android.net.Network network, android.net.LinkProperties linkProperties) {
            onAvailable(null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network network) {
            onAvailable(null);
        }

        private DefaultNetworkCallback() {
        }
    }

    /* loaded from: classes13.dex */
    public class MyNetworkCallback extends android.net.ConnectivityManager.NetworkCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private android.net.Network mVpnInPlace;

        private boolean ignoreConnectedInaccessibleVpn(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            if (networkCapabilities == null) {
                networkCapabilities = org.chromium.net.NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkCapabilities(network);
            }
            return networkCapabilities == null || (networkCapabilities.hasTransport(4) && !org.chromium.net.NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.vpnAccessible(network));
        }

        private boolean ignoreConnectedNetwork(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            return ignoreNetworkDueToVpn(network) || ignoreConnectedInaccessibleVpn(network, networkCapabilities);
        }

        private boolean ignoreNetworkDueToVpn(android.net.Network network) {
            android.net.Network network2 = this.mVpnInPlace;
            return (network2 == null || network2.equals(network)) ? false : true;
        }

        public void initializeVpnInPlace() {
            android.net.NetworkCapabilities networkCapabilities;
            android.net.Network[] allNetworksFiltered = org.chromium.net.NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(org.chromium.net.NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate, null);
            this.mVpnInPlace = null;
            if (allNetworksFiltered.length == 1 && (networkCapabilities = org.chromium.net.NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkCapabilities(allNetworksFiltered[0])) != null && networkCapabilities.hasTransport(4)) {
                this.mVpnInPlace = allNetworksFiltered[0];
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network network) {
            android.net.Network network2;
            org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped("NetworkChangeNotifierCallback::onAvailable");
            try {
                android.net.NetworkCapabilities networkCapabilities = org.chromium.net.NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getNetworkCapabilities(network);
                if (ignoreConnectedNetwork(network, networkCapabilities)) {
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                final boolean z17 = networkCapabilities.hasTransport(4) && ((network2 = this.mVpnInPlace) == null || !network.equals(network2));
                if (z17) {
                    this.mVpnInPlace = network;
                }
                final long networkToNetId = org.chromium.net.NetworkChangeNotifierAutoDetect.networkToNetId(network);
                final int connectionType = org.chromium.net.NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getConnectionType(network);
                org.chromium.net.NetworkChangeNotifierAutoDetect.this.runOnThread(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.1
                    @Override // java.lang.Runnable
                    public void run() {
                        org.chromium.net.NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkConnect(networkToNetId, connectionType);
                        if (z17) {
                            org.chromium.net.NetworkChangeNotifierAutoDetect.this.mObserver.onConnectionTypeChanged(connectionType);
                            org.chromium.net.NetworkChangeNotifierAutoDetect.this.mObserver.purgeActiveNetworkList(new long[]{networkToNetId});
                        }
                    }
                });
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped("NetworkChangeNotifierCallback::onCapabilitiesChanged");
            try {
                if (ignoreConnectedNetwork(network, networkCapabilities)) {
                    if (scoped != null) {
                        scoped.close();
                    }
                } else {
                    final long networkToNetId = org.chromium.net.NetworkChangeNotifierAutoDetect.networkToNetId(network);
                    final int connectionType = org.chromium.net.NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate.getConnectionType(network);
                    org.chromium.net.NetworkChangeNotifierAutoDetect.this.runOnThread(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.2
                        @Override // java.lang.Runnable
                        public void run() {
                            org.chromium.net.NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkConnect(networkToNetId, connectionType);
                        }
                    });
                    if (scoped != null) {
                        scoped.close();
                    }
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(android.net.Network network, int i17) {
            org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped("NetworkChangeNotifierCallback::onLosing");
            try {
                if (ignoreConnectedNetwork(network, null)) {
                    if (scoped != null) {
                        scoped.close();
                    }
                } else {
                    final long networkToNetId = org.chromium.net.NetworkChangeNotifierAutoDetect.networkToNetId(network);
                    org.chromium.net.NetworkChangeNotifierAutoDetect.this.runOnThread(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.3
                        @Override // java.lang.Runnable
                        public void run() {
                            org.chromium.net.NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkSoonToDisconnect(networkToNetId);
                        }
                    });
                    if (scoped != null) {
                        scoped.close();
                    }
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(final android.net.Network network) {
            org.chromium.base.TraceEvent scoped = org.chromium.base.TraceEvent.scoped("NetworkChangeNotifierCallback::onLost");
            try {
                if (ignoreNetworkDueToVpn(network)) {
                    if (scoped != null) {
                        scoped.close();
                        return;
                    }
                    return;
                }
                org.chromium.net.NetworkChangeNotifierAutoDetect.this.runOnThread(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.4
                    @Override // java.lang.Runnable
                    public void run() {
                        org.chromium.net.NetworkChangeNotifierAutoDetect.this.mObserver.onNetworkDisconnect(org.chromium.net.NetworkChangeNotifierAutoDetect.networkToNetId(network));
                    }
                });
                if (this.mVpnInPlace != null) {
                    this.mVpnInPlace = null;
                    for (android.net.Network network2 : org.chromium.net.NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(org.chromium.net.NetworkChangeNotifierAutoDetect.this.mConnectivityManagerDelegate, network)) {
                        onAvailable(network2);
                    }
                    final int connectionType = org.chromium.net.NetworkChangeNotifierAutoDetect.this.getCurrentNetworkState().getConnectionType();
                    org.chromium.net.NetworkChangeNotifierAutoDetect.this.runOnThread(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback.5
                        @Override // java.lang.Runnable
                        public void run() {
                            org.chromium.net.NetworkChangeNotifierAutoDetect.this.mObserver.onConnectionTypeChanged(connectionType);
                        }
                    });
                }
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

        private MyNetworkCallback() {
        }
    }

    /* loaded from: classes13.dex */
    public static class NetworkConnectivityIntentFilter extends android.content.IntentFilter {
        public NetworkConnectivityIntentFilter() {
            addAction(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
        }
    }

    /* loaded from: classes13.dex */
    public static class NetworkState {
        private final boolean mConnected;
        private final boolean mIsMetered;
        private final boolean mIsPrivateDnsActive;
        private final java.lang.String mNetworkIdentifier;
        private final java.lang.String mPrivateDnsServerName;
        private final int mSubtype;
        private final int mType;

        public NetworkState(boolean z17, int i17, int i18, boolean z18, java.lang.String str, boolean z19, java.lang.String str2) {
            this.mConnected = z17;
            this.mType = i17;
            this.mSubtype = i18;
            this.mIsMetered = z18;
            this.mNetworkIdentifier = str == null ? "" : str;
            this.mIsPrivateDnsActive = z19;
            this.mPrivateDnsServerName = str2 == null ? "" : str2;
        }

        public int getConnectionCost() {
            return isMetered() ? 2 : 1;
        }

        public int getConnectionSubtype() {
            if (!isConnected()) {
                return 1;
            }
            int networkType = getNetworkType();
            if (networkType != 0 && networkType != 4 && networkType != 5) {
                return 0;
            }
            switch (getNetworkSubType()) {
                case 1:
                    return 7;
                case 2:
                    return 8;
                case 3:
                    return 9;
                case 4:
                    return 5;
                case 5:
                    return 10;
                case 6:
                    return 11;
                case 7:
                    return 6;
                case 8:
                    return 14;
                case 9:
                    return 15;
                case 10:
                    return 12;
                case 11:
                    return 4;
                case 12:
                    return 13;
                case 13:
                    return 18;
                case 14:
                    return 16;
                case 15:
                    return 17;
                default:
                    return 0;
            }
        }

        public int getConnectionType() {
            if (isConnected()) {
                return org.chromium.net.NetworkChangeNotifierAutoDetect.convertToConnectionType(getNetworkType(), getNetworkSubType());
            }
            return 6;
        }

        public java.lang.String getNetworkIdentifier() {
            return this.mNetworkIdentifier;
        }

        public int getNetworkSubType() {
            return this.mSubtype;
        }

        public int getNetworkType() {
            return this.mType;
        }

        public java.lang.String getPrivateDnsServerName() {
            return this.mPrivateDnsServerName;
        }

        public boolean isConnected() {
            return this.mConnected;
        }

        public boolean isMetered() {
            return this.mIsMetered;
        }

        public boolean isPrivateDnsActive() {
            return this.mIsPrivateDnsActive;
        }
    }

    /* loaded from: classes13.dex */
    public interface Observer {
        void onConnectionCostChanged(int i17);

        void onConnectionSubtypeChanged(int i17);

        void onConnectionTypeChanged(int i17);

        void onNetworkConnect(long j17, int i17);

        void onNetworkDisconnect(long j17);

        void onNetworkSoonToDisconnect(long j17);

        void purgeActiveNetworkList(long[] jArr);
    }

    /* loaded from: classes13.dex */
    public static abstract class RegistrationPolicy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private org.chromium.net.NetworkChangeNotifierAutoDetect mNotifier;

        public abstract void destroy();

        public void init(org.chromium.net.NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
            this.mNotifier = networkChangeNotifierAutoDetect;
        }

        public final void register() {
            this.mNotifier.register();
        }

        public final void unregister() {
            this.mNotifier.unregister();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkChangeNotifierAutoDetect(org.chromium.net.NetworkChangeNotifierAutoDetect.Observer observer, org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy registrationPolicy) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        this.mLooper = myLooper;
        this.mHandler = new android.os.Handler(myLooper);
        this.mObserver = observer;
        this.mConnectivityManagerDelegate = new org.chromium.net.NetworkChangeNotifierAutoDetect.ConnectivityManagerDelegate(org.chromium.base.ContextUtils.getApplicationContext());
        int i17 = android.os.Build.VERSION.SDK_INT;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        this.mNetworkCallback = new org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback();
        this.mNetworkRequest = new android.net.NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
        if (i17 >= 30) {
            this.mDefaultNetworkCallback = new org.chromium.net.NetworkChangeNotifierAutoDetect.AndroidRDefaultNetworkCallback();
        } else {
            this.mDefaultNetworkCallback = i17 >= 28 ? new org.chromium.net.NetworkChangeNotifierAutoDetect.DefaultNetworkCallback() : null;
        }
        this.mNetworkState = getCurrentNetworkState();
        this.mIntentFilter = new org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkConnectivityIntentFilter();
        this.mIgnoreNextBroadcast = false;
        this.mShouldSignalObserver = false;
        this.mRegistrationPolicy = registrationPolicy;
        registrationPolicy.init(this);
        this.mShouldSignalObserver = true;
    }

    private void assertOnThread() {
        if (org.chromium.build.BuildConfig.ENABLE_ASSERTS && !onThread()) {
            throw new java.lang.IllegalStateException("Must be called on NetworkChangeNotifierAutoDetect thread.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionTypeChanged() {
        connectionTypeChangedTo(getCurrentNetworkState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionTypeChangedTo(org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState networkState) {
        if (networkState.getConnectionType() != this.mNetworkState.getConnectionType() || !networkState.getNetworkIdentifier().equals(this.mNetworkState.getNetworkIdentifier()) || networkState.isPrivateDnsActive() != this.mNetworkState.isPrivateDnsActive() || !networkState.getPrivateDnsServerName().equals(this.mNetworkState.getPrivateDnsServerName())) {
            this.mObserver.onConnectionTypeChanged(networkState.getConnectionType());
        }
        if (networkState.getConnectionType() != this.mNetworkState.getConnectionType() || networkState.getConnectionSubtype() != this.mNetworkState.getConnectionSubtype()) {
            this.mObserver.onConnectionSubtypeChanged(networkState.getConnectionSubtype());
        }
        if (networkState.getConnectionCost() != this.mNetworkState.getConnectionCost()) {
            this.mObserver.onConnectionCostChanged(networkState.getConnectionCost());
        }
        this.mNetworkState = networkState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int convertToConnectionType(int i17, int i18) {
        if (i17 != 0) {
            if (i17 == 1) {
                return 2;
            }
            if (i17 != 4 && i17 != 5) {
                if (i17 == 6) {
                    return 5;
                }
                if (i17 != 7) {
                    return i17 != 9 ? 0 : 1;
                }
                return 7;
            }
        }
        if (i18 == 20) {
            return 8;
        }
        switch (i18) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 3;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 4;
            case 13:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.net.Network[] getAllNetworksFiltered(org.chromium.net.NetworkChangeNotifierAutoDetect.ConnectivityManagerDelegate connectivityManagerDelegate, android.net.Network network) {
        android.net.NetworkCapabilities networkCapabilities;
        android.net.Network[] allNetworksUnfiltered = connectivityManagerDelegate.getAllNetworksUnfiltered();
        int i17 = 0;
        for (android.net.Network network2 : allNetworksUnfiltered) {
            if (!network2.equals(network) && (networkCapabilities = connectivityManagerDelegate.getNetworkCapabilities(network2)) != null && networkCapabilities.hasCapability(12)) {
                if (!networkCapabilities.hasTransport(4)) {
                    allNetworksUnfiltered[i17] = network2;
                    i17++;
                } else if (connectivityManagerDelegate.vpnAccessible(network2)) {
                    return new android.net.Network[]{network2};
                }
            }
        }
        return (android.net.Network[]) java.util.Arrays.copyOf(allNetworksUnfiltered, i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runOnThread$0(java.lang.Runnable runnable) {
        if (this.mRegistered) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setConnectivityManagerDelegateForTests$1(org.chromium.net.NetworkChangeNotifierAutoDetect.ConnectivityManagerDelegate connectivityManagerDelegate) {
        this.mConnectivityManagerDelegate = connectivityManagerDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setWifiManagerDelegateForTests$2(org.chromium.net.NetworkChangeNotifierAutoDetect.WifiManagerDelegate wifiManagerDelegate) {
        this.mWifiManagerDelegate = wifiManagerDelegate;
    }

    public static long networkToNetId(android.net.Network network) {
        return org.chromium.base.compat.ApiHelperForM.getNetworkHandle(network);
    }

    private boolean onThread() {
        return this.mLooper == android.os.Looper.myLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnThread(final java.lang.Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.chromium.net.NetworkChangeNotifierAutoDetect.this.lambda$runOnThread$0(runnable);
                }
            });
        }
    }

    public void destroy() {
        assertOnThread();
        this.mRegistrationPolicy.destroy();
        unregister();
    }

    public org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState getCurrentNetworkState() {
        return this.mConnectivityManagerDelegate.getNetworkState(this.mWifiManagerDelegate);
    }

    public long getDefaultNetId() {
        android.net.Network defaultNetwork = getDefaultNetwork();
        if (defaultNetwork == null) {
            return -1L;
        }
        return networkToNetId(defaultNetwork);
    }

    public android.net.Network getDefaultNetwork() {
        return this.mConnectivityManagerDelegate.getDefaultNetwork();
    }

    public long[] getNetworksAndTypes() {
        android.net.Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
        long[] jArr = new long[allNetworksFiltered.length * 2];
        int i17 = 0;
        for (android.net.Network network : allNetworksFiltered) {
            int i18 = i17 + 1;
            jArr[i17] = networkToNetId(network);
            i17 = i18 + 1;
            jArr[i18] = this.mConnectivityManagerDelegate.getConnectionType(r5);
        }
        return jArr;
    }

    public android.net.Network[] getNetworksForTesting() {
        return getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
    }

    public org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy getRegistrationPolicy() {
        return this.mRegistrationPolicy;
    }

    public boolean isReceiverRegisteredForTesting() {
        return this.mRegistered;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        runOnThread(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect.1
            @Override // java.lang.Runnable
            public void run() {
                if (org.chromium.net.NetworkChangeNotifierAutoDetect.this.mIgnoreNextBroadcast) {
                    org.chromium.net.NetworkChangeNotifierAutoDetect.this.mIgnoreNextBroadcast = false;
                } else {
                    org.chromium.net.NetworkChangeNotifierAutoDetect.this.connectionTypeChanged();
                }
            }
        });
    }

    public void register() {
        assertOnThread();
        if (this.mRegistered) {
            connectionTypeChanged();
            return;
        }
        if (this.mShouldSignalObserver) {
            connectionTypeChanged();
        }
        android.net.ConnectivityManager.NetworkCallback networkCallback = this.mDefaultNetworkCallback;
        if (networkCallback != null) {
            try {
                this.mConnectivityManagerDelegate.registerDefaultNetworkCallback(networkCallback, this.mHandler);
            } catch (java.lang.RuntimeException unused) {
                this.mDefaultNetworkCallback = null;
            }
        }
        if (this.mDefaultNetworkCallback == null) {
            this.mIgnoreNextBroadcast = org.chromium.base.ContextUtils.registerProtectedBroadcastReceiver(org.chromium.base.ContextUtils.getApplicationContext(), this, this.mIntentFilter) != null;
        }
        this.mRegistered = true;
        org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback myNetworkCallback = this.mNetworkCallback;
        if (myNetworkCallback != null) {
            myNetworkCallback.initializeVpnInPlace();
            try {
                this.mConnectivityManagerDelegate.registerNetworkCallback(this.mNetworkRequest, this.mNetworkCallback, this.mHandler);
            } catch (java.lang.RuntimeException unused2) {
                this.mRegisterNetworkCallbackFailed = true;
                this.mNetworkCallback = null;
            }
            if (this.mRegisterNetworkCallbackFailed || !this.mShouldSignalObserver) {
                return;
            }
            android.net.Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerDelegate, null);
            long[] jArr = new long[allNetworksFiltered.length];
            for (int i17 = 0; i17 < allNetworksFiltered.length; i17++) {
                jArr[i17] = networkToNetId(allNetworksFiltered[i17]);
            }
            this.mObserver.purgeActiveNetworkList(jArr);
        }
    }

    public boolean registerNetworkCallbackFailed() {
        return this.mRegisterNetworkCallbackFailed;
    }

    public void setConnectivityManagerDelegateForTests(org.chromium.net.NetworkChangeNotifierAutoDetect.ConnectivityManagerDelegate connectivityManagerDelegate) {
        final org.chromium.net.NetworkChangeNotifierAutoDetect.ConnectivityManagerDelegate connectivityManagerDelegate2 = this.mConnectivityManagerDelegate;
        this.mConnectivityManagerDelegate = connectivityManagerDelegate;
        org.chromium.base.ResettersForTesting.register(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect$$c
            @Override // java.lang.Runnable
            public final void run() {
                org.chromium.net.NetworkChangeNotifierAutoDetect.this.lambda$setConnectivityManagerDelegateForTests$1(connectivityManagerDelegate2);
            }
        });
    }

    public void setWifiManagerDelegateForTests(org.chromium.net.NetworkChangeNotifierAutoDetect.WifiManagerDelegate wifiManagerDelegate) {
        final org.chromium.net.NetworkChangeNotifierAutoDetect.WifiManagerDelegate wifiManagerDelegate2 = this.mWifiManagerDelegate;
        this.mWifiManagerDelegate = wifiManagerDelegate;
        org.chromium.base.ResettersForTesting.register(new java.lang.Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect$$b
            @Override // java.lang.Runnable
            public final void run() {
                org.chromium.net.NetworkChangeNotifierAutoDetect.this.lambda$setWifiManagerDelegateForTests$2(wifiManagerDelegate2);
            }
        });
    }

    public void unregister() {
        assertOnThread();
        if (this.mRegistered) {
            this.mRegistered = false;
            org.chromium.net.NetworkChangeNotifierAutoDetect.MyNetworkCallback myNetworkCallback = this.mNetworkCallback;
            if (myNetworkCallback != null) {
                this.mConnectivityManagerDelegate.unregisterNetworkCallback(myNetworkCallback);
            }
            android.net.ConnectivityManager.NetworkCallback networkCallback = this.mDefaultNetworkCallback;
            if (networkCallback != null) {
                this.mConnectivityManagerDelegate.unregisterNetworkCallback(networkCallback);
            } else {
                org.chromium.base.ContextUtils.getApplicationContext().unregisterReceiver(this);
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class ConnectivityManagerDelegate {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final android.net.ConnectivityManager mConnectivityManager;

        public ConnectivityManagerDelegate(android.content.Context context) {
            this.mConnectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        }

        private android.net.NetworkInfo processActiveNetworkInfo(android.net.NetworkInfo networkInfo) {
            if (networkInfo == null) {
                return null;
            }
            if (networkInfo.isConnected()) {
                return networkInfo;
            }
            if (networkInfo.getDetailedState() == android.net.NetworkInfo.DetailedState.BLOCKED && org.chromium.base.ApplicationStatus.getStateForApplication() == 1) {
                return networkInfo;
            }
            return null;
        }

        public android.net.Network[] getAllNetworksUnfiltered() {
            android.net.Network[] allNetworks = this.mConnectivityManager.getAllNetworks();
            return allNetworks == null ? new android.net.Network[0] : allNetworks;
        }

        public int getConnectionType(android.net.Network network) {
            android.net.NetworkInfo networkInfo = getNetworkInfo(network);
            if (networkInfo == null || !networkInfo.isConnected()) {
                return 6;
            }
            return org.chromium.net.NetworkChangeNotifierAutoDetect.convertToConnectionType(networkInfo.getType(), networkInfo.getSubtype());
        }

        public android.net.Network getDefaultNetwork() {
            android.net.NetworkInfo networkInfo;
            android.net.Network activeNetwork = org.chromium.base.compat.ApiHelperForM.getActiveNetwork(this.mConnectivityManager);
            if (activeNetwork != null) {
                return activeNetwork;
            }
            try {
                networkInfo = this.mConnectivityManager.getActiveNetworkInfo();
            } catch (java.lang.SecurityException unused) {
                networkInfo = null;
            }
            if (networkInfo == null) {
                return null;
            }
            for (android.net.Network network : org.chromium.net.NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this, null)) {
                android.net.NetworkInfo rawNetworkInfo = getRawNetworkInfo(network);
                if (rawNetworkInfo != null && (rawNetworkInfo.getType() == networkInfo.getType() || rawNetworkInfo.getType() == 17)) {
                    if (activeNetwork != null && android.os.Build.VERSION.SDK_INT >= 29) {
                        if (rawNetworkInfo.getDetailedState() != android.net.NetworkInfo.DetailedState.CONNECTING) {
                            android.net.NetworkInfo rawNetworkInfo2 = getRawNetworkInfo(activeNetwork);
                            if (rawNetworkInfo2 != null) {
                                rawNetworkInfo2.getDetailedState();
                                android.net.NetworkInfo.DetailedState detailedState = android.net.NetworkInfo.DetailedState.CONNECTING;
                            }
                        }
                    }
                    activeNetwork = network;
                }
            }
            return activeNetwork;
        }

        public android.net.NetworkCapabilities getNetworkCapabilities(android.net.Network network) {
            for (int i17 = 0; i17 < 2; i17++) {
                try {
                    return this.mConnectivityManager.getNetworkCapabilities(network);
                } catch (java.lang.SecurityException unused) {
                }
            }
            return null;
        }

        public android.net.NetworkInfo getNetworkInfo(android.net.Network network) {
            android.net.NetworkInfo rawNetworkInfo = getRawNetworkInfo(network);
            return (rawNetworkInfo == null || rawNetworkInfo.getType() != 17) ? rawNetworkInfo : this.mConnectivityManager.getActiveNetworkInfo();
        }

        public org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState getNetworkState(org.chromium.net.NetworkChangeNotifierAutoDetect.WifiManagerDelegate wifiManagerDelegate) {
            android.net.Network defaultNetwork = getDefaultNetwork();
            android.net.NetworkInfo processActiveNetworkInfo = processActiveNetworkInfo(getNetworkInfo(defaultNetwork));
            if (processActiveNetworkInfo == null) {
                return new org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState(false, -1, -1, false, null, false, "");
            }
            if (defaultNetwork == null) {
                return processActiveNetworkInfo.getType() == 1 ? (processActiveNetworkInfo.getExtraInfo() == null || "".equals(processActiveNetworkInfo.getExtraInfo())) ? new org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), false, wifiManagerDelegate.getWifiSsid(), false, "") : new org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), false, processActiveNetworkInfo.getExtraInfo(), false, "") : new org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), false, null, false, "");
            }
            android.net.NetworkCapabilities networkCapabilities = getNetworkCapabilities(defaultNetwork);
            boolean z17 = (networkCapabilities == null || networkCapabilities.hasCapability(11)) ? false : true;
            org.chromium.net.DnsStatus dnsStatus = org.chromium.net.AndroidNetworkLibrary.getDnsStatus(defaultNetwork);
            return dnsStatus == null ? new org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), z17, java.lang.String.valueOf(org.chromium.net.NetworkChangeNotifierAutoDetect.networkToNetId(defaultNetwork)), false, "") : new org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState(true, processActiveNetworkInfo.getType(), processActiveNetworkInfo.getSubtype(), z17, java.lang.String.valueOf(org.chromium.net.NetworkChangeNotifierAutoDetect.networkToNetId(defaultNetwork)), dnsStatus.getPrivateDnsActive(), dnsStatus.getPrivateDnsServerName());
        }

        public android.net.NetworkInfo getRawNetworkInfo(android.net.Network network) {
            try {
                try {
                    return this.mConnectivityManager.getNetworkInfo(network);
                } catch (java.lang.NullPointerException unused) {
                    return null;
                }
            } catch (java.lang.NullPointerException unused2) {
                return this.mConnectivityManager.getNetworkInfo(network);
            }
        }

        public void registerDefaultNetworkCallback(android.net.ConnectivityManager.NetworkCallback networkCallback, android.os.Handler handler) {
            org.chromium.base.compat.ApiHelperForO.registerDefaultNetworkCallback(this.mConnectivityManager, networkCallback, handler);
        }

        public void registerNetworkCallback(android.net.NetworkRequest networkRequest, android.net.ConnectivityManager.NetworkCallback networkCallback, android.os.Handler handler) {
            if (android.os.Build.VERSION.SDK_INT < 26) {
                this.mConnectivityManager.registerNetworkCallback(networkRequest, networkCallback);
                return;
            }
            org.chromium.base.StrictModeContext allowDiskReads = org.chromium.base.StrictModeContext.allowDiskReads();
            try {
                this.mConnectivityManager.registerNetworkCallback(networkRequest, networkCallback, handler);
                if (allowDiskReads != null) {
                    allowDiskReads.close();
                }
            } catch (java.lang.Throwable th6) {
                if (allowDiskReads != null) {
                    try {
                        allowDiskReads.close();
                    } catch (java.lang.Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        }

        public void unregisterNetworkCallback(android.net.ConnectivityManager.NetworkCallback networkCallback) {
            this.mConnectivityManager.unregisterNetworkCallback(networkCallback);
        }

        public boolean vpnAccessible(android.net.Network network) {
            java.net.Socket socket = new java.net.Socket();
            try {
                try {
                    org.chromium.base.StrictModeContext allowAllVmPolicies = org.chromium.base.StrictModeContext.allowAllVmPolicies();
                    try {
                        network.bindSocket(socket);
                        if (allowAllVmPolicies != null) {
                            allowAllVmPolicies.close();
                        }
                        try {
                            socket.close();
                            return true;
                        } catch (java.io.IOException unused) {
                            return true;
                        }
                    } catch (java.lang.Throwable th6) {
                        if (allowAllVmPolicies != null) {
                            try {
                                allowAllVmPolicies.close();
                            } catch (java.lang.Throwable th7) {
                                th6.addSuppressed(th7);
                            }
                        }
                        throw th6;
                    }
                } catch (java.io.IOException unused2) {
                    return false;
                }
            } catch (java.io.IOException unused3) {
                socket.close();
                return false;
            } catch (java.lang.Throwable th8) {
                try {
                    socket.close();
                } catch (java.io.IOException unused4) {
                }
                throw th8;
            }
        }

        public ConnectivityManagerDelegate() {
            this.mConnectivityManager = null;
        }
    }

    /* loaded from: classes13.dex */
    public static class WifiManagerDelegate {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final android.content.Context mContext;
        private boolean mHasWifiPermission;
        private boolean mHasWifiPermissionComputed;
        private final java.lang.Object mLock;
        private android.net.wifi.WifiManager mWifiManager;

        public WifiManagerDelegate(android.content.Context context) {
            this.mLock = new java.lang.Object();
            this.mContext = context;
        }

        private android.net.wifi.WifiInfo getWifiInfoLocked() {
            try {
                try {
                    return (android.net.wifi.WifiInfo) yj0.a.j(this.mWifiManager, "org/chromium/net/NetworkChangeNotifierAutoDetect$WifiManagerDelegate", "getWifiInfoLocked", "()Landroid/net/wifi/WifiInfo;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
                } catch (java.lang.NullPointerException unused) {
                    return (android.net.wifi.WifiInfo) yj0.a.j(this.mWifiManager, "org/chromium/net/NetworkChangeNotifierAutoDetect$WifiManagerDelegate", "getWifiInfoLocked", "()Landroid/net/wifi/WifiInfo;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
                }
            } catch (java.lang.NullPointerException unused2) {
                return null;
            }
        }

        private boolean hasPermissionLocked() {
            if (this.mHasWifiPermissionComputed) {
                return this.mHasWifiPermission;
            }
            boolean z17 = this.mContext.getPackageManager().checkPermission("android.permission.ACCESS_WIFI_STATE", this.mContext.getPackageName()) == 0;
            this.mHasWifiPermission = z17;
            this.mWifiManager = z17 ? (android.net.wifi.WifiManager) this.mContext.getSystemService("wifi") : null;
            this.mHasWifiPermissionComputed = true;
            return this.mHasWifiPermission;
        }

        public java.lang.String getWifiSsid() {
            synchronized (this.mLock) {
                if (!hasPermissionLocked()) {
                    return org.chromium.net.AndroidNetworkLibrary.getWifiSSID();
                }
                android.net.wifi.WifiInfo wifiInfoLocked = getWifiInfoLocked();
                if (wifiInfoLocked == null) {
                    return "";
                }
                return wifiInfoLocked.getSSID();
            }
        }

        public WifiManagerDelegate() {
            this.mLock = new java.lang.Object();
            this.mContext = null;
        }
    }
}
