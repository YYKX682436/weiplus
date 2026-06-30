package org.chromium.net;

/* JADX INFO: Access modifiers changed from: package-private */
@org.chromium.build.annotations.MainDex
/* loaded from: classes13.dex */
public class AndroidNetworkLibrary {
    private static final java.lang.String TAG = "AndroidNetworkLibrary";
    private static java.lang.Boolean sHaveAccessNetworkState;
    private static java.lang.Boolean sHaveAccessWifiState;

    /* loaded from: classes13.dex */
    public static class NetworkSecurityPolicyProxy {
        private static org.chromium.net.AndroidNetworkLibrary.NetworkSecurityPolicyProxy sInstance = new org.chromium.net.AndroidNetworkLibrary.NetworkSecurityPolicyProxy();

        public static org.chromium.net.AndroidNetworkLibrary.NetworkSecurityPolicyProxy getInstance() {
            return sInstance;
        }

        public static void setInstanceForTesting(org.chromium.net.AndroidNetworkLibrary.NetworkSecurityPolicyProxy networkSecurityPolicyProxy) {
            final org.chromium.net.AndroidNetworkLibrary.NetworkSecurityPolicyProxy networkSecurityPolicyProxy2 = sInstance;
            sInstance = networkSecurityPolicyProxy;
            org.chromium.base.ResettersForTesting.register(new java.lang.Runnable() { // from class: org.chromium.net.AndroidNetworkLibrary$NetworkSecurityPolicyProxy$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.chromium.net.AndroidNetworkLibrary.NetworkSecurityPolicyProxy.sInstance = org.chromium.net.AndroidNetworkLibrary.NetworkSecurityPolicyProxy.this;
                }
            });
        }

        public boolean isCleartextTrafficPermitted(java.lang.String str) {
            return org.chromium.base.compat.ApiHelperForN.isCleartextTrafficPermitted(str);
        }

        public boolean isCleartextTrafficPermitted() {
            return org.chromium.base.compat.ApiHelperForM.isCleartextTrafficPermitted();
        }
    }

    /* loaded from: classes7.dex */
    public static class SetFileDescriptor {
        private static final java.lang.reflect.Method sFileDescriptorSetInt;

        static {
            try {
                sFileDescriptorSetInt = java.io.FileDescriptor.class.getMethod("setInt$", java.lang.Integer.TYPE);
            } catch (java.lang.NoSuchMethodException | java.lang.SecurityException e17) {
                throw new java.lang.RuntimeException("Unable to get FileDescriptor.setInt$", e17);
            }
        }

        private SetFileDescriptor() {
        }

        public static java.io.FileDescriptor createWithFd(int i17) {
            try {
                java.io.FileDescriptor fileDescriptor = new java.io.FileDescriptor();
                sFileDescriptorSetInt.invoke(fileDescriptor, java.lang.Integer.valueOf(i17));
                return fileDescriptor;
            } catch (java.lang.IllegalAccessException e17) {
                throw new java.lang.RuntimeException("FileDescriptor.setInt$() failed", e17);
            } catch (java.lang.reflect.InvocationTargetException e18) {
                throw new java.lang.RuntimeException("FileDescriptor.setInt$() failed", e18);
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class SocketFd extends java.net.Socket {

        /* loaded from: classes13.dex */
        public static class SocketImplFd extends java.net.SocketImpl {
            public SocketImplFd(java.io.FileDescriptor fileDescriptor) {
                ((java.net.SocketImpl) this).fd = fileDescriptor;
            }

            @Override // java.net.SocketImpl
            public void accept(java.net.SocketImpl socketImpl) {
                throw new java.lang.RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketImpl
            public int available() {
                throw new java.lang.RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketImpl
            public void bind(java.net.InetAddress inetAddress, int i17) {
                throw new java.lang.RuntimeException("accept not implemented");
            }

            @Override // java.net.SocketImpl
            public void close() {
            }

            @Override // java.net.SocketImpl
            public void connect(java.net.InetAddress inetAddress, int i17) {
                throw new java.lang.RuntimeException("connect not implemented");
            }

            @Override // java.net.SocketImpl
            public void create(boolean z17) {
            }

            @Override // java.net.SocketImpl
            public java.io.InputStream getInputStream() {
                throw new java.lang.RuntimeException("getInputStream not implemented");
            }

            @Override // java.net.SocketOptions
            public java.lang.Object getOption(int i17) {
                throw new java.lang.RuntimeException("getOption not implemented");
            }

            @Override // java.net.SocketImpl
            public java.io.OutputStream getOutputStream() {
                throw new java.lang.RuntimeException("getOutputStream not implemented");
            }

            @Override // java.net.SocketImpl
            public void listen(int i17) {
                throw new java.lang.RuntimeException("listen not implemented");
            }

            @Override // java.net.SocketImpl
            public void sendUrgentData(int i17) {
                throw new java.lang.RuntimeException("sendUrgentData not implemented");
            }

            @Override // java.net.SocketOptions
            public void setOption(int i17, java.lang.Object obj) {
                throw new java.lang.RuntimeException("setOption not implemented");
            }

            @Override // java.net.SocketImpl
            public void connect(java.net.SocketAddress socketAddress, int i17) {
                throw new java.lang.RuntimeException("connect not implemented");
            }

            @Override // java.net.SocketImpl
            public void connect(java.lang.String str, int i17) {
                throw new java.lang.RuntimeException("connect not implemented");
            }
        }

        public SocketFd(java.io.FileDescriptor fileDescriptor) {
            super(new org.chromium.net.AndroidNetworkLibrary.SocketFd.SocketImplFd(fileDescriptor));
        }
    }

    public static void addTestRootCertificate(byte[] bArr) {
        org.chromium.net.X509Util.addTestRootCertificate(bArr);
    }

    public static void clearTestRootCertificates() {
        org.chromium.net.X509Util.clearTestRootCertificates();
    }

    public static org.chromium.net.DnsStatus getCurrentDnsStatus() {
        return getDnsStatus(null);
    }

    public static org.chromium.net.DnsStatus getDnsStatus(android.net.Network network) {
        android.net.ConnectivityManager connectivityManager;
        if (!haveAccessNetworkState() || (connectivityManager = (android.net.ConnectivityManager) org.chromium.base.ContextUtils.getApplicationContext().getSystemService("connectivity")) == null) {
            return null;
        }
        if (network == null) {
            network = org.chromium.base.compat.ApiHelperForM.getActiveNetwork(connectivityManager);
        }
        if (network == null) {
            return null;
        }
        try {
            android.net.LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties == null) {
                return null;
            }
            java.util.List<java.net.InetAddress> dnsServers = linkProperties.getDnsServers();
            java.lang.String domains = linkProperties.getDomains();
            return android.os.Build.VERSION.SDK_INT >= 28 ? new org.chromium.net.DnsStatus(dnsServers, org.chromium.base.compat.ApiHelperForP.isPrivateDnsActive(linkProperties), org.chromium.base.compat.ApiHelperForP.getPrivateDnsServerName(linkProperties), domains) : new org.chromium.net.DnsStatus(dnsServers, false, "", domains);
        } catch (java.lang.RuntimeException unused) {
            return null;
        }
    }

    public static org.chromium.net.DnsStatus getDnsStatusForNetwork(long j17) {
        try {
            return getDnsStatus(android.net.Network.fromNetworkHandle(j17));
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    private static boolean getIsCaptivePortal() {
        android.net.Network activeNetwork;
        android.net.NetworkCapabilities networkCapabilities;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) org.chromium.base.ContextUtils.getApplicationContext().getSystemService("connectivity");
        return (connectivityManager == null || (activeNetwork = org.chromium.base.compat.ApiHelperForM.getActiveNetwork(connectivityManager)) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(17)) ? false : true;
    }

    private static boolean getIsRoaming() {
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) org.chromium.base.ContextUtils.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isRoaming();
    }

    public static java.lang.String getMimeTypeFromExtension(java.lang.String str) {
        return java.net.URLConnection.guessContentTypeFromName("foo." + str);
    }

    private static java.lang.String getNetworkOperator() {
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) org.chromium.base.ContextUtils.getApplicationContext().getSystemService("phone");
        return telephonyManager == null ? "" : telephonyManager.getNetworkOperator();
    }

    public static byte[][] getUserAddedRoots() {
        return org.chromium.net.X509Util.getUserAddedRoots();
    }

    private static android.net.wifi.WifiInfo getWifiInfo() {
        android.net.TransportInfo transportInfo;
        if (!haveAccessWifiState()) {
            android.content.Intent registerProtectedBroadcastReceiver = org.chromium.base.ContextUtils.registerProtectedBroadcastReceiver(org.chromium.base.ContextUtils.getApplicationContext(), null, new android.content.IntentFilter("android.net.wifi.STATE_CHANGE"));
            if (registerProtectedBroadcastReceiver != null) {
                return (android.net.wifi.WifiInfo) registerProtectedBroadcastReceiver.getParcelableExtra("wifiInfo");
            }
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return (android.net.wifi.WifiInfo) yj0.a.j((android.net.wifi.WifiManager) org.chromium.base.ContextUtils.getApplicationContext().getSystemService("wifi"), "org/chromium/net/AndroidNetworkLibrary", "getWifiInfo", "()Landroid/net/wifi/WifiInfo;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
        }
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) org.chromium.base.ContextUtils.getApplicationContext().getSystemService("connectivity");
        for (android.net.Network network : connectivityManager.getAllNetworks()) {
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasTransport(1) && (transportInfo = org.chromium.base.compat.ApiHelperForQ.getTransportInfo(networkCapabilities)) != null && (transportInfo instanceof android.net.wifi.WifiInfo)) {
                return (android.net.wifi.WifiInfo) transportInfo;
            }
        }
        return null;
    }

    public static java.lang.String getWifiSSID() {
        java.lang.String ssid;
        android.net.wifi.WifiInfo wifiInfo = getWifiInfo();
        return (wifiInfo == null || (ssid = wifiInfo.getSSID()) == null || ssid.equals("<unknown ssid>")) ? "" : ssid;
    }

    public static int getWifiSignalLevel(int i17) {
        int intExtra;
        int calculateSignalLevel;
        if (org.chromium.base.ContextUtils.getApplicationContext() == null || org.chromium.base.ContextUtils.getApplicationContext().getContentResolver() == null) {
            return -1;
        }
        if (haveAccessWifiState()) {
            android.net.wifi.WifiInfo wifiInfo = getWifiInfo();
            if (wifiInfo == null) {
                return -1;
            }
            intExtra = wifiInfo.getRssi();
        } else {
            try {
                android.content.Intent registerProtectedBroadcastReceiver = org.chromium.base.ContextUtils.registerProtectedBroadcastReceiver(org.chromium.base.ContextUtils.getApplicationContext(), null, new android.content.IntentFilter("android.net.wifi.RSSI_CHANGED"));
                if (registerProtectedBroadcastReceiver == null) {
                    return -1;
                }
                intExtra = registerProtectedBroadcastReceiver.getIntExtra("newRssi", Integer.MIN_VALUE);
            } catch (java.lang.IllegalArgumentException unused) {
            }
        }
        if (intExtra != Integer.MIN_VALUE && (calculateSignalLevel = android.net.wifi.WifiManager.calculateSignalLevel(intExtra, i17)) >= 0 && calculateSignalLevel < i17) {
            return calculateSignalLevel;
        }
        return -1;
    }

    private static boolean haveAccessNetworkState() {
        if (sHaveAccessNetworkState == null) {
            sHaveAccessNetworkState = java.lang.Boolean.valueOf(org.chromium.base.ApiCompatibilityUtils.checkPermission(org.chromium.base.ContextUtils.getApplicationContext(), "android.permission.ACCESS_NETWORK_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0);
        }
        return sHaveAccessNetworkState.booleanValue();
    }

    private static boolean haveAccessWifiState() {
        if (sHaveAccessWifiState == null) {
            sHaveAccessWifiState = java.lang.Boolean.valueOf(org.chromium.base.ApiCompatibilityUtils.checkPermission(org.chromium.base.ContextUtils.getApplicationContext(), "android.permission.ACCESS_WIFI_STATE", android.os.Process.myPid(), android.os.Process.myUid()) == 0);
        }
        return sHaveAccessWifiState.booleanValue();
    }

    public static boolean haveOnlyLoopbackAddresses() {
        try {
            java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            while (networkInterfaces.hasMoreElements()) {
                java.net.NetworkInterface nextElement = networkInterfaces.nextElement();
                try {
                    if (nextElement.isUp() && !nextElement.isLoopback()) {
                        return false;
                    }
                } catch (java.net.SocketException unused) {
                }
            }
            return true;
        } catch (java.lang.Exception e17) {
            e17.toString();
            return false;
        }
    }

    private static boolean isCleartextPermitted(java.lang.String str) {
        try {
            return org.chromium.net.AndroidNetworkLibrary.NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted(str);
        } catch (java.lang.IllegalArgumentException unused) {
            return org.chromium.net.AndroidNetworkLibrary.NetworkSecurityPolicyProxy.getInstance().isCleartextTrafficPermitted();
        }
    }

    private static boolean reportBadDefaultNetwork() {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) org.chromium.base.ContextUtils.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        org.chromium.base.compat.ApiHelperForM.reportNetworkConnectivity(connectivityManager, null, false);
        return true;
    }

    public static void setWifiEnabledForTesting(boolean z17) {
        final android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) org.chromium.base.ContextUtils.getApplicationContext().getSystemService("wifi");
        final boolean isWifiEnabled = wifiManager.isWifiEnabled();
        wifiManager.setWifiEnabled(z17);
        org.chromium.base.ResettersForTesting.register(new java.lang.Runnable() { // from class: org.chromium.net.AndroidNetworkLibrary$$a
            @Override // java.lang.Runnable
            public final void run() {
                wifiManager.setWifiEnabled(isWifiEnabled);
            }
        });
    }

    private static void tagSocket(int i17, int i18, int i19) {
        int threadStatsTag = android.net.TrafficStats.getThreadStatsTag();
        if (i19 != threadStatsTag) {
            android.net.TrafficStats.setThreadStatsTag(i19);
        }
        if (i18 != -1) {
            org.chromium.net.ThreadStatsUid.set(i18);
        }
        android.os.ParcelFileDescriptor adoptFd = android.os.ParcelFileDescriptor.adoptFd(i17);
        org.chromium.net.AndroidNetworkLibrary.SocketFd socketFd = new org.chromium.net.AndroidNetworkLibrary.SocketFd(adoptFd.getFileDescriptor());
        android.net.TrafficStats.tagSocket(socketFd);
        socketFd.close();
        adoptFd.detachFd();
        if (i19 != threadStatsTag) {
            android.net.TrafficStats.setThreadStatsTag(threadStatsTag);
        }
        if (i18 != -1) {
            org.chromium.net.ThreadStatsUid.clear();
        }
    }

    public static org.chromium.net.AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, java.lang.String str, java.lang.String str2, boolean z17) {
        try {
            return org.chromium.net.X509Util.verifyServerCertificates(bArr, str, str2, z17);
        } catch (java.lang.IllegalArgumentException unused) {
            return new org.chromium.net.AndroidCertVerifyResult(-1);
        } catch (java.security.KeyStoreException unused2) {
            return new org.chromium.net.AndroidCertVerifyResult(-1);
        } catch (java.security.NoSuchAlgorithmException unused3) {
            return new org.chromium.net.AndroidCertVerifyResult(-1);
        }
    }
}
