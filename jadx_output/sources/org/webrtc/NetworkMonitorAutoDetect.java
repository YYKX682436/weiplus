package org.webrtc;

/* loaded from: classes13.dex */
public class NetworkMonitorAutoDetect extends android.content.BroadcastReceiver implements org.webrtc.NetworkChangeDetector {
    private static final long INVALID_NET_ID = -1;
    private static final java.lang.String TAG = "NetworkMonitorAutoDetect";
    private static boolean includeWifiDirect;
    private final android.net.ConnectivityManager.NetworkCallback allNetworkCallback;
    private org.webrtc.NetworkChangeDetector.ConnectionType connectionType;
    private org.webrtc.NetworkMonitorAutoDetect.ConnectivityManagerDelegate connectivityManagerDelegate;
    private final android.content.Context context;
    private final android.content.IntentFilter intentFilter;
    private boolean isRegistered;
    private final android.net.ConnectivityManager.NetworkCallback mobileNetworkCallback;
    private final org.webrtc.NetworkChangeDetector.Observer observer;
    private org.webrtc.NetworkMonitorAutoDetect.WifiDirectManagerDelegate wifiDirectManagerDelegate;
    private org.webrtc.NetworkMonitorAutoDetect.WifiManagerDelegate wifiManagerDelegate;
    private java.lang.String wifiSSID;

    /* loaded from: classes13.dex */
    public static class NetworkState {
        private final boolean connected;
        private final int subtype;
        private final int type;
        private final int underlyingNetworkSubtypeForVpn;
        private final int underlyingNetworkTypeForVpn;

        public NetworkState(boolean z17, int i17, int i18, int i19, int i27) {
            this.connected = z17;
            this.type = i17;
            this.subtype = i18;
            this.underlyingNetworkTypeForVpn = i19;
            this.underlyingNetworkSubtypeForVpn = i27;
        }

        public int getNetworkSubType() {
            return this.subtype;
        }

        public int getNetworkType() {
            return this.type;
        }

        public int getUnderlyingNetworkSubtypeForVpn() {
            return this.underlyingNetworkSubtypeForVpn;
        }

        public int getUnderlyingNetworkTypeForVpn() {
            return this.underlyingNetworkTypeForVpn;
        }

        public boolean isConnected() {
            return this.connected;
        }
    }

    /* loaded from: classes13.dex */
    public class SimpleNetworkCallback extends android.net.ConnectivityManager.NetworkCallback {
        private SimpleNetworkCallback() {
        }

        private void onNetworkChanged(android.net.Network network) {
            org.webrtc.NetworkChangeDetector.NetworkInformation networkToInfo = org.webrtc.NetworkMonitorAutoDetect.this.connectivityManagerDelegate.networkToInfo(network);
            if (networkToInfo != null) {
                org.webrtc.NetworkMonitorAutoDetect.this.observer.onNetworkConnect(networkToInfo);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network network) {
            org.webrtc.Logging.d(org.webrtc.NetworkMonitorAutoDetect.TAG, "Network becomes available: " + network.toString());
            onNetworkChanged(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
            org.webrtc.Logging.d(org.webrtc.NetworkMonitorAutoDetect.TAG, "capabilities changed: " + networkCapabilities.toString());
            onNetworkChanged(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(android.net.Network network, android.net.LinkProperties linkProperties) {
            org.webrtc.Logging.d(org.webrtc.NetworkMonitorAutoDetect.TAG, "link properties changed");
            onNetworkChanged(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(android.net.Network network, int i17) {
            org.webrtc.Logging.d(org.webrtc.NetworkMonitorAutoDetect.TAG, "Network " + network.toString() + " is about to lose in " + i17 + "ms");
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network network) {
            org.webrtc.Logging.d(org.webrtc.NetworkMonitorAutoDetect.TAG, "Network " + network.toString() + " is disconnected");
            org.webrtc.NetworkMonitorAutoDetect.this.observer.onNetworkDisconnect(org.webrtc.NetworkMonitorAutoDetect.networkToNetId(network));
        }
    }

    /* loaded from: classes13.dex */
    public static class WifiDirectManagerDelegate extends android.content.BroadcastReceiver {
        private static final int WIFI_P2P_NETWORK_HANDLE = 0;
        private final android.content.Context context;
        private final org.webrtc.NetworkChangeDetector.Observer observer;
        private org.webrtc.NetworkChangeDetector.NetworkInformation wifiP2pNetworkInfo;

        public WifiDirectManagerDelegate(org.webrtc.NetworkChangeDetector.Observer observer, android.content.Context context) {
            this.context = context;
            this.observer = observer;
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
            context.registerReceiver(this, intentFilter);
            if (android.os.Build.VERSION.SDK_INT > 28) {
                android.net.wifi.p2p.WifiP2pManager wifiP2pManager = (android.net.wifi.p2p.WifiP2pManager) context.getSystemService("wifip2p");
                wifiP2pManager.requestGroupInfo(wifiP2pManager.initialize(context, context.getMainLooper(), null), new android.net.wifi.p2p.WifiP2pManager.GroupInfoListener() { // from class: org.webrtc.NetworkMonitorAutoDetect$WifiDirectManagerDelegate$$a
                    @Override // android.net.wifi.p2p.WifiP2pManager.GroupInfoListener
                    public final void onGroupInfoAvailable(android.net.wifi.p2p.WifiP2pGroup wifiP2pGroup) {
                        org.webrtc.NetworkMonitorAutoDetect.WifiDirectManagerDelegate.this.lambda$new$0(wifiP2pGroup);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: onWifiP2pGroupChange, reason: merged with bridge method [inline-methods] */
        public void lambda$new$0(android.net.wifi.p2p.WifiP2pGroup wifiP2pGroup) {
            if (wifiP2pGroup == null || wifiP2pGroup.getInterface() == null) {
                return;
            }
            try {
                java.util.ArrayList list = java.util.Collections.list(java.net.NetworkInterface.getByName(wifiP2pGroup.getInterface()).getInetAddresses());
                org.webrtc.NetworkChangeDetector.IPAddress[] iPAddressArr = new org.webrtc.NetworkChangeDetector.IPAddress[list.size()];
                for (int i17 = 0; i17 < list.size(); i17++) {
                    iPAddressArr[i17] = new org.webrtc.NetworkChangeDetector.IPAddress(((java.net.InetAddress) list.get(i17)).getAddress());
                }
                org.webrtc.NetworkChangeDetector.NetworkInformation networkInformation = new org.webrtc.NetworkChangeDetector.NetworkInformation(wifiP2pGroup.getInterface(), org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_WIFI, org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_NONE, 0L, iPAddressArr);
                this.wifiP2pNetworkInfo = networkInformation;
                this.observer.onNetworkConnect(networkInformation);
            } catch (java.net.SocketException e17) {
                org.webrtc.Logging.e(org.webrtc.NetworkMonitorAutoDetect.TAG, "Unable to get WifiP2p network interface", e17);
            }
        }

        private void onWifiP2pStateChange(int i17) {
            if (i17 == 1) {
                this.wifiP2pNetworkInfo = null;
                this.observer.onNetworkDisconnect(0L);
            }
        }

        public java.util.List<org.webrtc.NetworkChangeDetector.NetworkInformation> getActiveNetworkList() {
            org.webrtc.NetworkChangeDetector.NetworkInformation networkInformation = this.wifiP2pNetworkInfo;
            return networkInformation != null ? java.util.Collections.singletonList(networkInformation) : java.util.Collections.emptyList();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
                lambda$new$0((android.net.wifi.p2p.WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo"));
            } else if ("android.net.wifi.p2p.STATE_CHANGED".equals(intent.getAction())) {
                onWifiP2pStateChange(intent.getIntExtra("wifi_p2p_state", 0));
            }
        }

        public void release() {
            this.context.unregisterReceiver(this);
        }
    }

    public NetworkMonitorAutoDetect(org.webrtc.NetworkChangeDetector.Observer observer, android.content.Context context) {
        this.observer = observer;
        this.context = context;
        this.connectivityManagerDelegate = new org.webrtc.NetworkMonitorAutoDetect.ConnectivityManagerDelegate(context);
        this.wifiManagerDelegate = new org.webrtc.NetworkMonitorAutoDetect.WifiManagerDelegate(context);
        org.webrtc.NetworkMonitorAutoDetect.NetworkState networkState = this.connectivityManagerDelegate.getNetworkState();
        this.connectionType = getConnectionType(networkState);
        this.wifiSSID = getWifiSSID(networkState);
        this.intentFilter = new android.content.IntentFilter(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
        if (includeWifiDirect) {
            this.wifiDirectManagerDelegate = new org.webrtc.NetworkMonitorAutoDetect.WifiDirectManagerDelegate(observer, context);
        }
        registerReceiver();
        if (!this.connectivityManagerDelegate.supportNetworkCallback()) {
            this.mobileNetworkCallback = null;
            this.allNetworkCallback = null;
            return;
        }
        android.net.ConnectivityManager.NetworkCallback networkCallback = new android.net.ConnectivityManager.NetworkCallback();
        try {
            this.connectivityManagerDelegate.requestMobileNetwork(networkCallback);
        } catch (java.lang.SecurityException unused) {
            org.webrtc.Logging.w(TAG, "Unable to obtain permission to request a cellular network.");
            networkCallback = null;
        }
        this.mobileNetworkCallback = networkCallback;
        org.webrtc.NetworkMonitorAutoDetect.SimpleNetworkCallback simpleNetworkCallback = new org.webrtc.NetworkMonitorAutoDetect.SimpleNetworkCallback();
        this.allNetworkCallback = simpleNetworkCallback;
        this.connectivityManagerDelegate.registerNetworkCallback(simpleNetworkCallback);
    }

    private void connectionTypeChanged(org.webrtc.NetworkMonitorAutoDetect.NetworkState networkState) {
        org.webrtc.NetworkChangeDetector.ConnectionType connectionType = getConnectionType(networkState);
        java.lang.String wifiSSID = getWifiSSID(networkState);
        if (connectionType == this.connectionType && wifiSSID.equals(this.wifiSSID)) {
            return;
        }
        this.connectionType = connectionType;
        this.wifiSSID = wifiSSID;
        org.webrtc.Logging.d(TAG, "Network connectivity changed, type is: " + this.connectionType);
        this.observer.onConnectionTypeChanged(connectionType);
    }

    private static org.webrtc.NetworkChangeDetector.ConnectionType getConnectionType(boolean z17, int i17, int i18) {
        if (!z17) {
            return org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_NONE;
        }
        if (i17 == 0) {
            switch (i18) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    return org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_2G;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    return org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_3G;
                case 13:
                case 18:
                    return org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_4G;
                case 19:
                default:
                    return org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR;
                case 20:
                    return org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_5G;
            }
        }
        if (i17 == 1) {
            return org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_WIFI;
        }
        if (i17 == 6) {
            return org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_4G;
        }
        if (i17 == 7) {
            return org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_BLUETOOTH;
        }
        if (i17 == 9) {
            return org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_ETHERNET;
        }
        if (i17 != 17) {
            return org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN;
        }
        return org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_VPN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static org.webrtc.NetworkChangeDetector.ConnectionType getUnderlyingConnectionTypeForVpn(org.webrtc.NetworkMonitorAutoDetect.NetworkState networkState) {
        return networkState.getNetworkType() != 17 ? org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_NONE : getConnectionType(networkState.isConnected(), networkState.getUnderlyingNetworkTypeForVpn(), networkState.getUnderlyingNetworkSubtypeForVpn());
    }

    private java.lang.String getWifiSSID(org.webrtc.NetworkMonitorAutoDetect.NetworkState networkState) {
        return getConnectionType(networkState) != org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_WIFI ? "" : this.wifiManagerDelegate.getWifiSSID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long networkToNetId(android.net.Network network) {
        return network.getNetworkHandle();
    }

    private void registerReceiver() {
        if (this.isRegistered) {
            return;
        }
        this.isRegistered = true;
        this.context.registerReceiver(this, this.intentFilter);
    }

    public static void setIncludeWifiDirect(boolean z17) {
        includeWifiDirect = z17;
    }

    private void unregisterReceiver() {
        if (this.isRegistered) {
            this.isRegistered = false;
            this.context.unregisterReceiver(this);
        }
    }

    @Override // org.webrtc.NetworkChangeDetector
    public void destroy() {
        android.net.ConnectivityManager.NetworkCallback networkCallback = this.allNetworkCallback;
        if (networkCallback != null) {
            this.connectivityManagerDelegate.releaseCallback(networkCallback);
        }
        android.net.ConnectivityManager.NetworkCallback networkCallback2 = this.mobileNetworkCallback;
        if (networkCallback2 != null) {
            this.connectivityManagerDelegate.releaseCallback(networkCallback2);
        }
        org.webrtc.NetworkMonitorAutoDetect.WifiDirectManagerDelegate wifiDirectManagerDelegate = this.wifiDirectManagerDelegate;
        if (wifiDirectManagerDelegate != null) {
            wifiDirectManagerDelegate.release();
        }
        unregisterReceiver();
    }

    @Override // org.webrtc.NetworkChangeDetector
    public java.util.List<org.webrtc.NetworkChangeDetector.NetworkInformation> getActiveNetworkList() {
        java.util.List<org.webrtc.NetworkChangeDetector.NetworkInformation> activeNetworkList = this.connectivityManagerDelegate.getActiveNetworkList();
        if (activeNetworkList == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(activeNetworkList);
        org.webrtc.NetworkMonitorAutoDetect.WifiDirectManagerDelegate wifiDirectManagerDelegate = this.wifiDirectManagerDelegate;
        if (wifiDirectManagerDelegate != null) {
            arrayList.addAll(wifiDirectManagerDelegate.getActiveNetworkList());
        }
        return arrayList;
    }

    @Override // org.webrtc.NetworkChangeDetector
    public org.webrtc.NetworkChangeDetector.ConnectionType getCurrentConnectionType() {
        return getConnectionType(getCurrentNetworkState());
    }

    public org.webrtc.NetworkMonitorAutoDetect.NetworkState getCurrentNetworkState() {
        return this.connectivityManagerDelegate.getNetworkState();
    }

    public long getDefaultNetId() {
        return this.connectivityManagerDelegate.getDefaultNetId();
    }

    public boolean isReceiverRegisteredForTesting() {
        return this.isRegistered;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        org.webrtc.NetworkMonitorAutoDetect.NetworkState currentNetworkState = getCurrentNetworkState();
        if (io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION.equals(intent.getAction())) {
            connectionTypeChanged(currentNetworkState);
        }
    }

    public void setConnectivityManagerDelegateForTests(org.webrtc.NetworkMonitorAutoDetect.ConnectivityManagerDelegate connectivityManagerDelegate) {
        this.connectivityManagerDelegate = connectivityManagerDelegate;
    }

    public void setWifiManagerDelegateForTests(org.webrtc.NetworkMonitorAutoDetect.WifiManagerDelegate wifiManagerDelegate) {
        this.wifiManagerDelegate = wifiManagerDelegate;
    }

    @Override // org.webrtc.NetworkChangeDetector
    public boolean supportNetworkCallback() {
        return this.connectivityManagerDelegate.supportNetworkCallback();
    }

    /* loaded from: classes13.dex */
    public static class ConnectivityManagerDelegate {
        private final android.net.ConnectivityManager connectivityManager;

        public ConnectivityManagerDelegate(android.content.Context context) {
            this.connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public org.webrtc.NetworkChangeDetector.NetworkInformation networkToInfo(android.net.Network network) {
            android.net.ConnectivityManager connectivityManager;
            if (network == null || (connectivityManager = this.connectivityManager) == null) {
                return null;
            }
            android.net.LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                org.webrtc.Logging.w(org.webrtc.NetworkMonitorAutoDetect.TAG, "Detected unknown network: " + network.toString());
                return null;
            }
            if (linkProperties.getInterfaceName() == null) {
                org.webrtc.Logging.w(org.webrtc.NetworkMonitorAutoDetect.TAG, "Null interface name for network " + network.toString());
                return null;
            }
            org.webrtc.NetworkMonitorAutoDetect.NetworkState networkState = getNetworkState(network);
            org.webrtc.NetworkChangeDetector.ConnectionType connectionType = org.webrtc.NetworkMonitorAutoDetect.getConnectionType(networkState);
            if (connectionType == org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_NONE) {
                org.webrtc.Logging.d(org.webrtc.NetworkMonitorAutoDetect.TAG, "Network " + network.toString() + " is disconnected");
                return null;
            }
            if (connectionType == org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN || connectionType == org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR) {
                org.webrtc.Logging.d(org.webrtc.NetworkMonitorAutoDetect.TAG, "Network " + network.toString() + " connection type is " + connectionType + " because it has type " + networkState.getNetworkType() + " and subtype " + networkState.getNetworkSubType());
            }
            return new org.webrtc.NetworkChangeDetector.NetworkInformation(linkProperties.getInterfaceName(), connectionType, org.webrtc.NetworkMonitorAutoDetect.getUnderlyingConnectionTypeForVpn(networkState), org.webrtc.NetworkMonitorAutoDetect.networkToNetId(network), getIPAddresses(linkProperties));
        }

        public java.util.List<org.webrtc.NetworkChangeDetector.NetworkInformation> getActiveNetworkList() {
            if (!supportNetworkCallback()) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.net.Network network : getAllNetworks()) {
                org.webrtc.NetworkChangeDetector.NetworkInformation networkToInfo = networkToInfo(network);
                if (networkToInfo != null) {
                    arrayList.add(networkToInfo);
                }
            }
            return arrayList;
        }

        public android.net.Network[] getAllNetworks() {
            android.net.ConnectivityManager connectivityManager = this.connectivityManager;
            return connectivityManager == null ? new android.net.Network[0] : connectivityManager.getAllNetworks();
        }

        public long getDefaultNetId() {
            android.net.NetworkInfo activeNetworkInfo;
            android.net.NetworkInfo networkInfo;
            if (!supportNetworkCallback() || (activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo()) == null) {
                return -1L;
            }
            long j17 = -1;
            for (android.net.Network network : getAllNetworks()) {
                if (hasInternetCapability(network) && (networkInfo = this.connectivityManager.getNetworkInfo(network)) != null && networkInfo.getType() == activeNetworkInfo.getType()) {
                    if (j17 != -1) {
                        throw new java.lang.RuntimeException("Multiple connected networks of same type are not supported.");
                    }
                    j17 = org.webrtc.NetworkMonitorAutoDetect.networkToNetId(network);
                }
            }
            return j17;
        }

        public org.webrtc.NetworkChangeDetector.IPAddress[] getIPAddresses(android.net.LinkProperties linkProperties) {
            org.webrtc.NetworkChangeDetector.IPAddress[] iPAddressArr = new org.webrtc.NetworkChangeDetector.IPAddress[linkProperties.getLinkAddresses().size()];
            java.util.Iterator<android.net.LinkAddress> it = linkProperties.getLinkAddresses().iterator();
            int i17 = 0;
            while (it.hasNext()) {
                iPAddressArr[i17] = new org.webrtc.NetworkChangeDetector.IPAddress(it.next().getAddress().getAddress());
                i17++;
            }
            return iPAddressArr;
        }

        public org.webrtc.NetworkMonitorAutoDetect.NetworkState getNetworkState() {
            android.net.ConnectivityManager connectivityManager = this.connectivityManager;
            if (connectivityManager == null) {
                return new org.webrtc.NetworkMonitorAutoDetect.NetworkState(false, -1, -1, -1, -1);
            }
            return getNetworkState(connectivityManager.getActiveNetworkInfo());
        }

        public boolean hasInternetCapability(android.net.Network network) {
            android.net.NetworkCapabilities networkCapabilities;
            android.net.ConnectivityManager connectivityManager = this.connectivityManager;
            return (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null || !networkCapabilities.hasCapability(12)) ? false : true;
        }

        public void registerNetworkCallback(android.net.ConnectivityManager.NetworkCallback networkCallback) {
            this.connectivityManager.registerNetworkCallback(new android.net.NetworkRequest.Builder().addCapability(12).build(), networkCallback);
        }

        public void releaseCallback(android.net.ConnectivityManager.NetworkCallback networkCallback) {
            if (supportNetworkCallback()) {
                org.webrtc.Logging.d(org.webrtc.NetworkMonitorAutoDetect.TAG, "Unregister network callback");
                this.connectivityManager.unregisterNetworkCallback(networkCallback);
            }
        }

        public void requestMobileNetwork(android.net.ConnectivityManager.NetworkCallback networkCallback) {
            android.net.NetworkRequest.Builder builder = new android.net.NetworkRequest.Builder();
            builder.addCapability(12).addTransportType(0);
            this.connectivityManager.requestNetwork(builder.build(), networkCallback);
        }

        public boolean supportNetworkCallback() {
            return this.connectivityManager != null;
        }

        public ConnectivityManagerDelegate() {
            this.connectivityManager = null;
        }

        public org.webrtc.NetworkMonitorAutoDetect.NetworkState getNetworkState(android.net.Network network) {
            android.net.ConnectivityManager connectivityManager;
            android.net.NetworkInfo activeNetworkInfo;
            if (network != null && (connectivityManager = this.connectivityManager) != null) {
                android.net.NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                if (networkInfo == null) {
                    org.webrtc.Logging.w(org.webrtc.NetworkMonitorAutoDetect.TAG, "Couldn't retrieve information from network " + network.toString());
                    return new org.webrtc.NetworkMonitorAutoDetect.NetworkState(false, -1, -1, -1, -1);
                }
                if (networkInfo.getType() != 17) {
                    android.net.NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
                    if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                        return new org.webrtc.NetworkMonitorAutoDetect.NetworkState(networkInfo.isConnected(), 17, -1, networkInfo.getType(), networkInfo.getSubtype());
                    }
                    return getNetworkState(networkInfo);
                }
                if (networkInfo.getType() == 17) {
                    if (network.equals(this.connectivityManager.getActiveNetwork()) && (activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.getType() != 17) {
                        return new org.webrtc.NetworkMonitorAutoDetect.NetworkState(networkInfo.isConnected(), 17, -1, activeNetworkInfo.getType(), activeNetworkInfo.getSubtype());
                    }
                    return new org.webrtc.NetworkMonitorAutoDetect.NetworkState(networkInfo.isConnected(), 17, -1, -1, -1);
                }
                return getNetworkState(networkInfo);
            }
            return new org.webrtc.NetworkMonitorAutoDetect.NetworkState(false, -1, -1, -1, -1);
        }

        private org.webrtc.NetworkMonitorAutoDetect.NetworkState getNetworkState(android.net.NetworkInfo networkInfo) {
            if (networkInfo != null && networkInfo.isConnected()) {
                return new org.webrtc.NetworkMonitorAutoDetect.NetworkState(true, networkInfo.getType(), networkInfo.getSubtype(), -1, -1);
            }
            return new org.webrtc.NetworkMonitorAutoDetect.NetworkState(false, -1, -1, -1, -1);
        }
    }

    /* loaded from: classes13.dex */
    public static class WifiManagerDelegate {
        private final android.content.Context context;

        public WifiManagerDelegate(android.content.Context context) {
            this.context = context;
        }

        public java.lang.String getWifiSSID() {
            android.net.wifi.WifiInfo wifiInfo;
            java.lang.String ssid;
            android.content.Intent registerReceiver = this.context.registerReceiver(null, new android.content.IntentFilter("android.net.wifi.STATE_CHANGE"));
            return (registerReceiver == null || (wifiInfo = (android.net.wifi.WifiInfo) registerReceiver.getParcelableExtra("wifiInfo")) == null || (ssid = wifiInfo.getSSID()) == null) ? "" : ssid;
        }

        public WifiManagerDelegate() {
            this.context = null;
        }
    }

    public static org.webrtc.NetworkChangeDetector.ConnectionType getConnectionType(org.webrtc.NetworkMonitorAutoDetect.NetworkState networkState) {
        return getConnectionType(networkState.isConnected(), networkState.getNetworkType(), networkState.getNetworkSubType());
    }
}
