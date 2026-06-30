package org.webrtc;

/* loaded from: classes13.dex */
public class NetworkMonitor {
    private static final java.lang.String TAG = "NetworkMonitor";
    private volatile org.webrtc.NetworkChangeDetector.ConnectionType currentConnectionType;
    private final java.util.ArrayList<java.lang.Long> nativeNetworkObservers;
    private org.webrtc.NetworkChangeDetector networkChangeDetector;
    private org.webrtc.NetworkChangeDetectorFactory networkChangeDetectorFactory;
    private final java.lang.Object networkChangeDetectorLock;
    private final java.util.ArrayList<org.webrtc.NetworkMonitor.NetworkObserver> networkObservers;
    private int numObservers;

    /* loaded from: classes13.dex */
    public static class InstanceHolder {
        static final org.webrtc.NetworkMonitor instance = new org.webrtc.NetworkMonitor();

        private InstanceHolder() {
        }
    }

    /* loaded from: classes13.dex */
    public interface NetworkObserver {
        void onConnectionTypeChanged(org.webrtc.NetworkChangeDetector.ConnectionType connectionType);
    }

    @java.lang.Deprecated
    public static void addNetworkObserver(org.webrtc.NetworkMonitor.NetworkObserver networkObserver) {
        getInstance().addObserver(networkObserver);
    }

    private static int androidSdkInt() {
        return android.os.Build.VERSION.SDK_INT;
    }

    private static void assertIsTrue(boolean z17) {
        if (!z17) {
            throw new java.lang.AssertionError("Expected to be true");
        }
    }

    public static org.webrtc.NetworkMonitorAutoDetect createAndSetAutoDetectForTest(android.content.Context context) {
        org.webrtc.NetworkMonitor networkMonitor = getInstance();
        org.webrtc.NetworkChangeDetector createNetworkChangeDetector = networkMonitor.createNetworkChangeDetector(context);
        networkMonitor.networkChangeDetector = createNetworkChangeDetector;
        return (org.webrtc.NetworkMonitorAutoDetect) createNetworkChangeDetector;
    }

    private org.webrtc.NetworkChangeDetector createNetworkChangeDetector(android.content.Context context) {
        return this.networkChangeDetectorFactory.create(new org.webrtc.NetworkChangeDetector.Observer() { // from class: org.webrtc.NetworkMonitor.2
            @Override // org.webrtc.NetworkChangeDetector.Observer
            public void onConnectionTypeChanged(org.webrtc.NetworkChangeDetector.ConnectionType connectionType) {
                org.webrtc.NetworkMonitor.this.updateCurrentConnectionType(connectionType);
            }

            @Override // org.webrtc.NetworkChangeDetector.Observer
            public void onNetworkConnect(org.webrtc.NetworkChangeDetector.NetworkInformation networkInformation) {
                org.webrtc.NetworkMonitor.this.notifyObserversOfNetworkConnect(networkInformation);
            }

            @Override // org.webrtc.NetworkChangeDetector.Observer
            public void onNetworkDisconnect(long j17) {
                org.webrtc.NetworkMonitor.this.notifyObserversOfNetworkDisconnect(j17);
            }

            @Override // org.webrtc.NetworkChangeDetector.Observer
            public void onNetworkPreference(java.util.List<org.webrtc.NetworkChangeDetector.ConnectionType> list, int i17) {
                org.webrtc.NetworkMonitor.this.notifyObserversOfNetworkPreference(list, i17);
            }
        }, context);
    }

    private org.webrtc.NetworkChangeDetector.ConnectionType getCurrentConnectionType() {
        return this.currentConnectionType;
    }

    public static org.webrtc.NetworkMonitor getInstance() {
        return org.webrtc.NetworkMonitor.InstanceHolder.instance;
    }

    private java.util.List<java.lang.Long> getNativeNetworkObserversSync() {
        java.util.ArrayList arrayList;
        synchronized (this.nativeNetworkObservers) {
            arrayList = new java.util.ArrayList(this.nativeNetworkObservers);
        }
        return arrayList;
    }

    @java.lang.Deprecated
    public static void init(android.content.Context context) {
    }

    public static boolean isOnline() {
        return getInstance().getCurrentConnectionType() != org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_NONE;
    }

    private native void nativeNotifyConnectionTypeChanged(long j17);

    private native void nativeNotifyOfActiveNetworkList(long j17, org.webrtc.NetworkChangeDetector.NetworkInformation[] networkInformationArr);

    private native void nativeNotifyOfNetworkConnect(long j17, org.webrtc.NetworkChangeDetector.NetworkInformation networkInformation);

    private native void nativeNotifyOfNetworkDisconnect(long j17, long j18);

    private native void nativeNotifyOfNetworkPreference(long j17, org.webrtc.NetworkChangeDetector.ConnectionType connectionType, int i17);

    private boolean networkBindingSupported() {
        boolean z17;
        synchronized (this.networkChangeDetectorLock) {
            org.webrtc.NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
            z17 = networkChangeDetector != null && networkChangeDetector.supportNetworkCallback();
        }
        return z17;
    }

    private void notifyObserversOfConnectionTypeChange(org.webrtc.NetworkChangeDetector.ConnectionType connectionType) {
        java.util.ArrayList arrayList;
        java.util.Iterator<java.lang.Long> it = getNativeNetworkObserversSync().iterator();
        while (it.hasNext()) {
            nativeNotifyConnectionTypeChanged(it.next().longValue());
        }
        synchronized (this.networkObservers) {
            arrayList = new java.util.ArrayList(this.networkObservers);
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ((org.webrtc.NetworkMonitor.NetworkObserver) it6.next()).onConnectionTypeChanged(connectionType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserversOfNetworkConnect(org.webrtc.NetworkChangeDetector.NetworkInformation networkInformation) {
        java.util.Iterator<java.lang.Long> it = getNativeNetworkObserversSync().iterator();
        while (it.hasNext()) {
            nativeNotifyOfNetworkConnect(it.next().longValue(), networkInformation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserversOfNetworkDisconnect(long j17) {
        java.util.Iterator<java.lang.Long> it = getNativeNetworkObserversSync().iterator();
        while (it.hasNext()) {
            nativeNotifyOfNetworkDisconnect(it.next().longValue(), j17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserversOfNetworkPreference(java.util.List<org.webrtc.NetworkChangeDetector.ConnectionType> list, int i17) {
        java.util.List<java.lang.Long> nativeNetworkObserversSync = getNativeNetworkObserversSync();
        for (org.webrtc.NetworkChangeDetector.ConnectionType connectionType : list) {
            java.util.Iterator<java.lang.Long> it = nativeNetworkObserversSync.iterator();
            while (it.hasNext()) {
                nativeNotifyOfNetworkPreference(it.next().longValue(), connectionType, i17);
            }
        }
    }

    @java.lang.Deprecated
    public static void removeNetworkObserver(org.webrtc.NetworkMonitor.NetworkObserver networkObserver) {
        getInstance().removeObserver(networkObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentConnectionType(org.webrtc.NetworkChangeDetector.ConnectionType connectionType) {
        this.currentConnectionType = connectionType;
        notifyObserversOfConnectionTypeChange(connectionType);
    }

    private void updateObserverActiveNetworkList(long j17) {
        java.util.List<org.webrtc.NetworkChangeDetector.NetworkInformation> activeNetworkList;
        synchronized (this.networkChangeDetectorLock) {
            org.webrtc.NetworkChangeDetector networkChangeDetector = this.networkChangeDetector;
            activeNetworkList = networkChangeDetector == null ? null : networkChangeDetector.getActiveNetworkList();
        }
        if (activeNetworkList == null || activeNetworkList.size() == 0) {
            return;
        }
        nativeNotifyOfActiveNetworkList(j17, (org.webrtc.NetworkChangeDetector.NetworkInformation[]) activeNetworkList.toArray(new org.webrtc.NetworkChangeDetector.NetworkInformation[activeNetworkList.size()]));
    }

    public void addObserver(org.webrtc.NetworkMonitor.NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.add(networkObserver);
        }
    }

    public org.webrtc.NetworkChangeDetector getNetworkChangeDetector() {
        org.webrtc.NetworkChangeDetector networkChangeDetector;
        synchronized (this.networkChangeDetectorLock) {
            networkChangeDetector = this.networkChangeDetector;
        }
        return networkChangeDetector;
    }

    public int getNumObservers() {
        int i17;
        synchronized (this.networkChangeDetectorLock) {
            i17 = this.numObservers;
        }
        return i17;
    }

    public void removeObserver(org.webrtc.NetworkMonitor.NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.remove(networkObserver);
        }
    }

    public void setNetworkChangeDetectorFactory(org.webrtc.NetworkChangeDetectorFactory networkChangeDetectorFactory) {
        assertIsTrue(this.numObservers == 0);
        this.networkChangeDetectorFactory = networkChangeDetectorFactory;
    }

    public void startMonitoring(android.content.Context context) {
        synchronized (this.networkChangeDetectorLock) {
            this.numObservers++;
            if (this.networkChangeDetector == null) {
                this.networkChangeDetector = createNetworkChangeDetector(context);
            }
            this.currentConnectionType = this.networkChangeDetector.getCurrentConnectionType();
        }
    }

    public void stopMonitoring() {
        synchronized (this.networkChangeDetectorLock) {
            int i17 = this.numObservers - 1;
            this.numObservers = i17;
            if (i17 == 0) {
                this.networkChangeDetector.destroy();
                this.networkChangeDetector = null;
            }
        }
    }

    private NetworkMonitor() {
        this.networkChangeDetectorFactory = new org.webrtc.NetworkChangeDetectorFactory() { // from class: org.webrtc.NetworkMonitor.1
            @Override // org.webrtc.NetworkChangeDetectorFactory
            public org.webrtc.NetworkChangeDetector create(org.webrtc.NetworkChangeDetector.Observer observer, android.content.Context context) {
                return new org.webrtc.NetworkMonitorAutoDetect(observer, context);
            }
        };
        this.networkChangeDetectorLock = new java.lang.Object();
        this.nativeNetworkObservers = new java.util.ArrayList<>();
        this.networkObservers = new java.util.ArrayList<>();
        this.numObservers = 0;
        this.currentConnectionType = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN;
    }

    private void stopMonitoring(long j17) {
        org.webrtc.Logging.d(TAG, "Stop monitoring with native observer " + j17);
        stopMonitoring();
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.remove(java.lang.Long.valueOf(j17));
        }
    }

    @java.lang.Deprecated
    public void startMonitoring() {
        startMonitoring(org.webrtc.ContextUtils.getApplicationContext());
    }

    private void startMonitoring(android.content.Context context, long j17) {
        org.webrtc.Logging.d(TAG, "Start monitoring with native observer " + j17);
        if (context == null) {
            context = org.webrtc.ContextUtils.getApplicationContext();
        }
        startMonitoring(context);
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.add(java.lang.Long.valueOf(j17));
        }
        updateObserverActiveNetworkList(j17);
        notifyObserversOfConnectionTypeChange(this.currentConnectionType);
    }
}
