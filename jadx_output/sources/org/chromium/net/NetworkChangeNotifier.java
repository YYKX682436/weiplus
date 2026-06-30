package org.chromium.net;

@org.chromium.base.annotations.JNINamespace("net")
/* loaded from: classes13.dex */
public class NetworkChangeNotifier {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static org.chromium.net.NetworkChangeNotifier sInstance;
    private org.chromium.net.NetworkChangeNotifierAutoDetect mAutoDetector;
    private int mCurrentConnectionType = 0;
    private int mCurrentConnectionCost = 0;
    private final java.util.ArrayList<java.lang.Long> mNativeChangeNotifiers = new java.util.ArrayList<>();
    private final org.chromium.base.ObserverList<org.chromium.net.NetworkChangeNotifier.ConnectionTypeObserver> mConnectionTypeObservers = new org.chromium.base.ObserverList<>();

    /* loaded from: classes13.dex */
    public interface ConnectionTypeObserver {
        void onConnectionTypeChanged(int i17);
    }

    /* loaded from: classes13.dex */
    public interface Natives {
        @org.chromium.base.annotations.NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
        void notifyConnectionCostChanged(long j17, org.chromium.net.NetworkChangeNotifier networkChangeNotifier, int i17);

        @org.chromium.base.annotations.NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
        void notifyConnectionTypeChanged(long j17, org.chromium.net.NetworkChangeNotifier networkChangeNotifier, int i17, long j18);

        @org.chromium.base.annotations.NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
        void notifyMaxBandwidthChanged(long j17, org.chromium.net.NetworkChangeNotifier networkChangeNotifier, int i17);

        @org.chromium.base.annotations.NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
        void notifyOfNetworkConnect(long j17, org.chromium.net.NetworkChangeNotifier networkChangeNotifier, long j18, int i17);

        @org.chromium.base.annotations.NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
        void notifyOfNetworkDisconnect(long j17, org.chromium.net.NetworkChangeNotifier networkChangeNotifier, long j18);

        @org.chromium.base.annotations.NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
        void notifyOfNetworkSoonToDisconnect(long j17, org.chromium.net.NetworkChangeNotifier networkChangeNotifier, long j18);

        @org.chromium.base.annotations.NativeClassQualifiedName("NetworkChangeNotifierDelegateAndroid")
        void notifyPurgeActiveNetworkList(long j17, org.chromium.net.NetworkChangeNotifier networkChangeNotifier, long[] jArr);
    }

    public static void addConnectionTypeObserver(org.chromium.net.NetworkChangeNotifier.ConnectionTypeObserver connectionTypeObserver) {
        getInstance().addConnectionTypeObserverInternal(connectionTypeObserver);
    }

    private void addConnectionTypeObserverInternal(org.chromium.net.NetworkChangeNotifier.ConnectionTypeObserver connectionTypeObserver) {
        this.mConnectionTypeObservers.addObserver(connectionTypeObserver);
    }

    private void destroyAutoDetector() {
        org.chromium.net.NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect != null) {
            networkChangeNotifierAutoDetect.destroy();
            this.mAutoDetector = null;
        }
    }

    public static void fakeConnectionCostChanged(int i17) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionCostChange(i17);
    }

    public static void fakeConnectionSubtypeChanged(int i17) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionSubtypeChange(i17);
    }

    public static void fakeDefaultNetwork(long j17, int i17) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionTypeChange(i17, j17);
    }

    public static void fakeNetworkConnected(long j17, int i17) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkConnect(j17, i17);
    }

    public static void fakeNetworkDisconnected(long j17) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkDisconnect(j17);
    }

    public static void fakeNetworkSoonToBeDisconnected(long j17) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkSoonToDisconnect(j17);
    }

    public static void fakePurgeActiveNetworkList(long[] jArr) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversToPurgeActiveNetworkList(jArr);
    }

    public static void forceConnectivityState(boolean z17) {
        setAutoDetectConnectivityState(false);
        getInstance().forceConnectivityStateInternal(z17);
    }

    private void forceConnectivityStateInternal(boolean z17) {
        if ((this.mCurrentConnectionType != 6) != z17) {
            updateCurrentConnectionType(z17 ? 0 : 6);
            notifyObserversOfConnectionSubtypeChange(!z17 ? 1 : 0);
        }
    }

    public static org.chromium.net.NetworkChangeNotifierAutoDetect getAutoDetectorForTest() {
        return getInstance().mAutoDetector;
    }

    public static org.chromium.net.NetworkChangeNotifier getInstance() {
        return sInstance;
    }

    public static org.chromium.net.NetworkChangeNotifier init() {
        if (sInstance == null) {
            sInstance = new org.chromium.net.NetworkChangeNotifier();
        }
        return sInstance;
    }

    public static boolean isInitialized() {
        return sInstance != null;
    }

    public static boolean isOnline() {
        return getInstance().getCurrentConnectionType() != 6;
    }

    public static void registerToReceiveNotificationsAlways() {
        getInstance().setAutoDetectConnectivityStateInternal(true, new org.chromium.net.RegistrationPolicyAlwaysRegister());
    }

    public static void removeConnectionTypeObserver(org.chromium.net.NetworkChangeNotifier.ConnectionTypeObserver connectionTypeObserver) {
        getInstance().removeConnectionTypeObserverInternal(connectionTypeObserver);
    }

    private void removeConnectionTypeObserverInternal(org.chromium.net.NetworkChangeNotifier.ConnectionTypeObserver connectionTypeObserver) {
        this.mConnectionTypeObservers.removeObserver(connectionTypeObserver);
    }

    public static void resetInstanceForTests() {
        sInstance = new org.chromium.net.NetworkChangeNotifier();
    }

    public static void setAutoDetectConnectivityState(boolean z17) {
        getInstance().setAutoDetectConnectivityStateInternal(z17, new org.chromium.net.RegistrationPolicyApplicationStatus());
    }

    private void setAutoDetectConnectivityStateInternal(boolean z17, org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy registrationPolicy) {
        if (!z17) {
            destroyAutoDetector();
            return;
        }
        if (this.mAutoDetector == null) {
            org.chromium.net.NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = new org.chromium.net.NetworkChangeNotifierAutoDetect(new org.chromium.net.NetworkChangeNotifierAutoDetect.Observer() { // from class: org.chromium.net.NetworkChangeNotifier.1
                @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                public void onConnectionCostChanged(int i17) {
                    org.chromium.net.NetworkChangeNotifier.this.notifyObserversOfConnectionCostChange(i17);
                }

                @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                public void onConnectionSubtypeChanged(int i17) {
                    org.chromium.net.NetworkChangeNotifier.this.notifyObserversOfConnectionSubtypeChange(i17);
                }

                @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                public void onConnectionTypeChanged(int i17) {
                    org.chromium.net.NetworkChangeNotifier.this.updateCurrentConnectionType(i17);
                }

                @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                public void onNetworkConnect(long j17, int i17) {
                    org.chromium.net.NetworkChangeNotifier.this.notifyObserversOfNetworkConnect(j17, i17);
                }

                @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                public void onNetworkDisconnect(long j17) {
                    org.chromium.net.NetworkChangeNotifier.this.notifyObserversOfNetworkDisconnect(j17);
                }

                @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                public void onNetworkSoonToDisconnect(long j17) {
                    org.chromium.net.NetworkChangeNotifier.this.notifyObserversOfNetworkSoonToDisconnect(j17);
                }

                @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
                public void purgeActiveNetworkList(long[] jArr) {
                    org.chromium.net.NetworkChangeNotifier.this.notifyObserversToPurgeActiveNetworkList(jArr);
                }
            }, registrationPolicy);
            this.mAutoDetector = networkChangeNotifierAutoDetect;
            org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState currentNetworkState = networkChangeNotifierAutoDetect.getCurrentNetworkState();
            updateCurrentConnectionType(currentNetworkState.getConnectionType());
            updateCurrentConnectionCost(currentNetworkState.getConnectionCost());
            notifyObserversOfConnectionSubtypeChange(currentNetworkState.getConnectionSubtype());
        }
    }

    private void updateCurrentConnectionCost(int i17) {
        this.mCurrentConnectionCost = i17;
        notifyObserversOfConnectionCostChange(i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentConnectionType(int i17) {
        this.mCurrentConnectionType = i17;
        notifyObserversOfConnectionTypeChange(i17);
    }

    public void addNativeObserver(long j17) {
        this.mNativeChangeNotifiers.add(java.lang.Long.valueOf(j17));
    }

    public int getCurrentConnectionCost() {
        return this.mCurrentConnectionCost;
    }

    public int getCurrentConnectionSubtype() {
        org.chromium.net.NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return 0;
        }
        return networkChangeNotifierAutoDetect.getCurrentNetworkState().getConnectionSubtype();
    }

    public int getCurrentConnectionType() {
        return this.mCurrentConnectionType;
    }

    public long getCurrentDefaultNetId() {
        org.chromium.net.NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return -1L;
        }
        return networkChangeNotifierAutoDetect.getDefaultNetId();
    }

    public long[] getCurrentNetworksAndTypes() {
        org.chromium.net.NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        return networkChangeNotifierAutoDetect == null ? new long[0] : networkChangeNotifierAutoDetect.getNetworksAndTypes();
    }

    public void notifyObserversOfConnectionCostChange(int i17) {
        java.util.Iterator<java.lang.Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            org.chromium.net.NetworkChangeNotifierJni.get().notifyConnectionCostChanged(it.next().longValue(), this, i17);
        }
    }

    public void notifyObserversOfConnectionSubtypeChange(int i17) {
        java.util.Iterator<java.lang.Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            org.chromium.net.NetworkChangeNotifierJni.get().notifyMaxBandwidthChanged(it.next().longValue(), this, i17);
        }
    }

    public void notifyObserversOfConnectionTypeChange(int i17) {
        notifyObserversOfConnectionTypeChange(i17, getCurrentDefaultNetId());
    }

    public void notifyObserversOfNetworkConnect(long j17, int i17) {
        java.util.Iterator<java.lang.Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            org.chromium.net.NetworkChangeNotifierJni.get().notifyOfNetworkConnect(it.next().longValue(), this, j17, i17);
        }
    }

    public void notifyObserversOfNetworkDisconnect(long j17) {
        java.util.Iterator<java.lang.Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            org.chromium.net.NetworkChangeNotifierJni.get().notifyOfNetworkDisconnect(it.next().longValue(), this, j17);
        }
    }

    public void notifyObserversOfNetworkSoonToDisconnect(long j17) {
        java.util.Iterator<java.lang.Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            org.chromium.net.NetworkChangeNotifierJni.get().notifyOfNetworkSoonToDisconnect(it.next().longValue(), this, j17);
        }
    }

    public void notifyObserversToPurgeActiveNetworkList(long[] jArr) {
        java.util.Iterator<java.lang.Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            org.chromium.net.NetworkChangeNotifierJni.get().notifyPurgeActiveNetworkList(it.next().longValue(), this, jArr);
        }
    }

    public boolean registerNetworkCallbackFailed() {
        org.chromium.net.NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return false;
        }
        return networkChangeNotifierAutoDetect.registerNetworkCallbackFailed();
    }

    public void removeNativeObserver(long j17) {
        this.mNativeChangeNotifiers.remove(java.lang.Long.valueOf(j17));
    }

    private void notifyObserversOfConnectionTypeChange(int i17, long j17) {
        java.util.Iterator<java.lang.Long> it = this.mNativeChangeNotifiers.iterator();
        while (it.hasNext()) {
            org.chromium.net.NetworkChangeNotifierJni.get().notifyConnectionTypeChanged(it.next().longValue(), this, i17, j17);
        }
        java.util.Iterator<org.chromium.net.NetworkChangeNotifier.ConnectionTypeObserver> it6 = this.mConnectionTypeObservers.iterator();
        while (it6.hasNext()) {
            it6.next().onConnectionTypeChanged(i17);
        }
    }

    public static void resetInstanceForTests(org.chromium.net.NetworkChangeNotifier networkChangeNotifier) {
        sInstance = networkChangeNotifier;
    }

    public static void setAutoDetectConnectivityState(org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy registrationPolicy) {
        getInstance().setAutoDetectConnectivityStateInternal(true, registrationPolicy);
    }
}
