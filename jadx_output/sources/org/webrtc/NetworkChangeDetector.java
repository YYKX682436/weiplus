package org.webrtc;

/* loaded from: classes13.dex */
public interface NetworkChangeDetector {

    /* loaded from: classes13.dex */
    public enum ConnectionType {
        CONNECTION_UNKNOWN,
        CONNECTION_ETHERNET,
        CONNECTION_WIFI,
        CONNECTION_5G,
        CONNECTION_4G,
        CONNECTION_3G,
        CONNECTION_2G,
        CONNECTION_UNKNOWN_CELLULAR,
        CONNECTION_BLUETOOTH,
        CONNECTION_VPN,
        CONNECTION_NONE
    }

    /* loaded from: classes13.dex */
    public static class IPAddress {
        public final byte[] address;

        public IPAddress(byte[] bArr) {
            this.address = bArr;
        }

        private byte[] getAddress() {
            return this.address;
        }
    }

    /* loaded from: classes13.dex */
    public static class NetworkInformation {
        public final long handle;
        public final org.webrtc.NetworkChangeDetector.IPAddress[] ipAddresses;
        public final java.lang.String name;
        public final org.webrtc.NetworkChangeDetector.ConnectionType type;
        public final org.webrtc.NetworkChangeDetector.ConnectionType underlyingTypeForVpn;

        public NetworkInformation(java.lang.String str, org.webrtc.NetworkChangeDetector.ConnectionType connectionType, org.webrtc.NetworkChangeDetector.ConnectionType connectionType2, long j17, org.webrtc.NetworkChangeDetector.IPAddress[] iPAddressArr) {
            this.name = str;
            this.type = connectionType;
            this.underlyingTypeForVpn = connectionType2;
            this.handle = j17;
            this.ipAddresses = iPAddressArr;
        }

        private org.webrtc.NetworkChangeDetector.ConnectionType getConnectionType() {
            return this.type;
        }

        private long getHandle() {
            return this.handle;
        }

        private org.webrtc.NetworkChangeDetector.IPAddress[] getIpAddresses() {
            return this.ipAddresses;
        }

        private java.lang.String getName() {
            return this.name;
        }

        private org.webrtc.NetworkChangeDetector.ConnectionType getUnderlyingConnectionTypeForVpn() {
            return this.underlyingTypeForVpn;
        }
    }

    /* loaded from: classes13.dex */
    public interface Observer {
        void onConnectionTypeChanged(org.webrtc.NetworkChangeDetector.ConnectionType connectionType);

        void onNetworkConnect(org.webrtc.NetworkChangeDetector.NetworkInformation networkInformation);

        void onNetworkDisconnect(long j17);

        void onNetworkPreference(java.util.List<org.webrtc.NetworkChangeDetector.ConnectionType> list, int i17);
    }

    void destroy();

    java.util.List<org.webrtc.NetworkChangeDetector.NetworkInformation> getActiveNetworkList();

    org.webrtc.NetworkChangeDetector.ConnectionType getCurrentConnectionType();

    boolean supportNetworkCallback();
}
