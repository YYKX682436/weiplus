package org.webrtc;

/* loaded from: classes15.dex */
public class PeerConnection {
    private final java.util.List<org.webrtc.MediaStream> localStreams;
    private final long nativePeerConnection;
    private java.util.List<org.webrtc.RtpReceiver> receivers;
    private java.util.List<org.webrtc.RtpSender> senders;
    private java.util.List<org.webrtc.RtpTransceiver> transceivers;

    /* loaded from: classes11.dex */
    public enum AdapterType {
        UNKNOWN(0),
        ETHERNET(1),
        WIFI(2),
        CELLULAR(4),
        VPN(8),
        LOOPBACK(16),
        ADAPTER_TYPE_ANY(32),
        CELLULAR_2G(64),
        CELLULAR_3G(128),
        CELLULAR_4G(256),
        CELLULAR_5G(512);

        private static final java.util.Map<java.lang.Integer, org.webrtc.PeerConnection.AdapterType> BY_BITMASK = new java.util.HashMap();
        public final java.lang.Integer bitMask;

        static {
            for (org.webrtc.PeerConnection.AdapterType adapterType : values()) {
                BY_BITMASK.put(adapterType.bitMask, adapterType);
            }
        }

        AdapterType(java.lang.Integer num) {
            this.bitMask = num;
        }

        public static org.webrtc.PeerConnection.AdapterType fromNativeIndex(int i17) {
            return BY_BITMASK.get(java.lang.Integer.valueOf(i17));
        }
    }

    /* loaded from: classes6.dex */
    public enum BundlePolicy {
        BALANCED,
        MAXBUNDLE,
        MAXCOMPAT
    }

    /* loaded from: classes6.dex */
    public enum CandidateNetworkPolicy {
        ALL,
        LOW_COST
    }

    /* loaded from: classes6.dex */
    public enum ContinualGatheringPolicy {
        GATHER_ONCE,
        GATHER_CONTINUALLY
    }

    /* loaded from: classes6.dex */
    public enum IceConnectionState {
        NEW,
        CHECKING,
        CONNECTED,
        COMPLETED,
        FAILED,
        DISCONNECTED,
        CLOSED;

        public static org.webrtc.PeerConnection.IceConnectionState fromNativeIndex(int i17) {
            return values()[i17];
        }
    }

    /* loaded from: classes6.dex */
    public enum IceGatheringState {
        NEW,
        GATHERING,
        COMPLETE;

        public static org.webrtc.PeerConnection.IceGatheringState fromNativeIndex(int i17) {
            return values()[i17];
        }
    }

    /* loaded from: classes15.dex */
    public static class IceServer {
        public final java.lang.String hostname;
        public final java.lang.String password;
        public final java.util.List<java.lang.String> tlsAlpnProtocols;
        public final org.webrtc.PeerConnection.TlsCertPolicy tlsCertPolicy;
        public final java.util.List<java.lang.String> tlsEllipticCurves;

        @java.lang.Deprecated
        public final java.lang.String uri;
        public final java.util.List<java.lang.String> urls;
        public final java.lang.String username;

        /* loaded from: classes15.dex */
        public static class Builder {
            private java.lang.String hostname;
            private java.lang.String password;
            private java.util.List<java.lang.String> tlsAlpnProtocols;
            private org.webrtc.PeerConnection.TlsCertPolicy tlsCertPolicy;
            private java.util.List<java.lang.String> tlsEllipticCurves;
            private final java.util.List<java.lang.String> urls;
            private java.lang.String username;

            public org.webrtc.PeerConnection.IceServer createIceServer() {
                return new org.webrtc.PeerConnection.IceServer(this.urls.get(0), this.urls, this.username, this.password, this.tlsCertPolicy, this.hostname, this.tlsAlpnProtocols, this.tlsEllipticCurves);
            }

            public org.webrtc.PeerConnection.IceServer.Builder setHostname(java.lang.String str) {
                this.hostname = str;
                return this;
            }

            public org.webrtc.PeerConnection.IceServer.Builder setPassword(java.lang.String str) {
                this.password = str;
                return this;
            }

            public org.webrtc.PeerConnection.IceServer.Builder setTlsAlpnProtocols(java.util.List<java.lang.String> list) {
                this.tlsAlpnProtocols = list;
                return this;
            }

            public org.webrtc.PeerConnection.IceServer.Builder setTlsCertPolicy(org.webrtc.PeerConnection.TlsCertPolicy tlsCertPolicy) {
                this.tlsCertPolicy = tlsCertPolicy;
                return this;
            }

            public org.webrtc.PeerConnection.IceServer.Builder setTlsEllipticCurves(java.util.List<java.lang.String> list) {
                this.tlsEllipticCurves = list;
                return this;
            }

            public org.webrtc.PeerConnection.IceServer.Builder setUsername(java.lang.String str) {
                this.username = str;
                return this;
            }

            private Builder(java.util.List<java.lang.String> list) {
                this.username = "";
                this.password = "";
                this.tlsCertPolicy = org.webrtc.PeerConnection.TlsCertPolicy.TLS_CERT_POLICY_SECURE;
                this.hostname = "";
                if (list != null && !list.isEmpty()) {
                    this.urls = list;
                } else {
                    throw new java.lang.IllegalArgumentException("urls == null || urls.isEmpty(): " + list);
                }
            }
        }

        public static org.webrtc.PeerConnection.IceServer.Builder builder(java.lang.String str) {
            return new org.webrtc.PeerConnection.IceServer.Builder(java.util.Collections.singletonList(str));
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof org.webrtc.PeerConnection.IceServer)) {
                return false;
            }
            org.webrtc.PeerConnection.IceServer iceServer = (org.webrtc.PeerConnection.IceServer) obj;
            return this.uri.equals(iceServer.uri) && this.urls.equals(iceServer.urls) && this.username.equals(iceServer.username) && this.password.equals(iceServer.password) && this.tlsCertPolicy.equals(iceServer.tlsCertPolicy) && this.hostname.equals(iceServer.hostname) && this.tlsAlpnProtocols.equals(iceServer.tlsAlpnProtocols) && this.tlsEllipticCurves.equals(iceServer.tlsEllipticCurves);
        }

        public java.lang.String getHostname() {
            return this.hostname;
        }

        public java.lang.String getPassword() {
            return this.password;
        }

        public java.util.List<java.lang.String> getTlsAlpnProtocols() {
            return this.tlsAlpnProtocols;
        }

        public org.webrtc.PeerConnection.TlsCertPolicy getTlsCertPolicy() {
            return this.tlsCertPolicy;
        }

        public java.util.List<java.lang.String> getTlsEllipticCurves() {
            return this.tlsEllipticCurves;
        }

        public java.util.List<java.lang.String> getUrls() {
            return this.urls;
        }

        public java.lang.String getUsername() {
            return this.username;
        }

        public int hashCode() {
            return java.util.Arrays.hashCode(new java.lang.Object[]{this.uri, this.urls, this.username, this.password, this.tlsCertPolicy, this.hostname, this.tlsAlpnProtocols, this.tlsEllipticCurves});
        }

        public java.lang.String toString() {
            return this.urls + " [" + this.username + ":" + this.password + "] [" + this.tlsCertPolicy + "] [" + this.hostname + "] [" + this.tlsAlpnProtocols + "] [" + this.tlsEllipticCurves + "]";
        }

        @java.lang.Deprecated
        public IceServer(java.lang.String str) {
            this(str, "", "");
        }

        public static org.webrtc.PeerConnection.IceServer.Builder builder(java.util.List<java.lang.String> list) {
            return new org.webrtc.PeerConnection.IceServer.Builder(list);
        }

        @java.lang.Deprecated
        public IceServer(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this(str, str2, str3, org.webrtc.PeerConnection.TlsCertPolicy.TLS_CERT_POLICY_SECURE);
        }

        @java.lang.Deprecated
        public IceServer(java.lang.String str, java.lang.String str2, java.lang.String str3, org.webrtc.PeerConnection.TlsCertPolicy tlsCertPolicy) {
            this(str, str2, str3, tlsCertPolicy, "");
        }

        @java.lang.Deprecated
        public IceServer(java.lang.String str, java.lang.String str2, java.lang.String str3, org.webrtc.PeerConnection.TlsCertPolicy tlsCertPolicy, java.lang.String str4) {
            this(str, java.util.Collections.singletonList(str), str2, str3, tlsCertPolicy, str4, null, null);
        }

        private IceServer(java.lang.String str, java.util.List<java.lang.String> list, java.lang.String str2, java.lang.String str3, org.webrtc.PeerConnection.TlsCertPolicy tlsCertPolicy, java.lang.String str4, java.util.List<java.lang.String> list2, java.util.List<java.lang.String> list3) {
            if (str != null && list != null && !list.isEmpty()) {
                java.util.Iterator<java.lang.String> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next() == null) {
                        throw new java.lang.IllegalArgumentException("urls element is null: " + list);
                    }
                }
                if (str2 == null) {
                    throw new java.lang.IllegalArgumentException("username == null");
                }
                if (str3 == null) {
                    throw new java.lang.IllegalArgumentException("password == null");
                }
                if (str4 != null) {
                    this.uri = str;
                    this.urls = list;
                    this.username = str2;
                    this.password = str3;
                    this.tlsCertPolicy = tlsCertPolicy;
                    this.hostname = str4;
                    this.tlsAlpnProtocols = list2;
                    this.tlsEllipticCurves = list3;
                    return;
                }
                throw new java.lang.IllegalArgumentException("hostname == null");
            }
            throw new java.lang.IllegalArgumentException("uri == null || urls == null || urls.isEmpty()");
        }
    }

    /* loaded from: classes6.dex */
    public enum IceTransportsType {
        NONE,
        RELAY,
        NOHOST,
        ALL
    }

    /* loaded from: classes6.dex */
    public enum KeyType {
        RSA,
        ECDSA
    }

    /* loaded from: classes6.dex */
    public interface Observer {
        void onAddStream(org.webrtc.MediaStream mediaStream);

        default void onAddTrack(org.webrtc.RtpReceiver rtpReceiver, org.webrtc.MediaStream[] mediaStreamArr) {
        }

        default void onConnectionChange(org.webrtc.PeerConnection.PeerConnectionState peerConnectionState) {
        }

        void onDataChannel(org.webrtc.DataChannel dataChannel);

        void onIceCandidate(org.webrtc.IceCandidate iceCandidate);

        void onIceCandidatesRemoved(org.webrtc.IceCandidate[] iceCandidateArr);

        void onIceConnectionChange(org.webrtc.PeerConnection.IceConnectionState iceConnectionState);

        void onIceConnectionReceivingChange(boolean z17);

        void onIceGatheringChange(org.webrtc.PeerConnection.IceGatheringState iceGatheringState);

        void onRemoveStream(org.webrtc.MediaStream mediaStream);

        default void onRemoveTrack(org.webrtc.RtpReceiver rtpReceiver) {
        }

        void onRenegotiationNeeded();

        default void onSelectedCandidatePairChanged(org.webrtc.CandidatePairChangeEvent candidatePairChangeEvent) {
        }

        void onSignalingChange(org.webrtc.PeerConnection.SignalingState signalingState);

        default void onStandardizedIceConnectionChange(org.webrtc.PeerConnection.IceConnectionState iceConnectionState) {
        }

        default void onTrack(org.webrtc.RtpTransceiver rtpTransceiver) {
        }
    }

    /* loaded from: classes6.dex */
    public enum PeerConnectionState {
        NEW,
        CONNECTING,
        CONNECTED,
        DISCONNECTED,
        FAILED,
        CLOSED;

        public static org.webrtc.PeerConnection.PeerConnectionState fromNativeIndex(int i17) {
            return values()[i17];
        }
    }

    /* loaded from: classes6.dex */
    public enum PortPrunePolicy {
        NO_PRUNE,
        PRUNE_BASED_ON_PRIORITY,
        KEEP_FIRST_READY
    }

    /* loaded from: classes6.dex */
    public static class RTCConfiguration {
        public org.webrtc.RtcCertificatePem certificate;
        public java.util.List<org.webrtc.PeerConnection.IceServer> iceServers;
        public org.webrtc.TurnCustomizer turnCustomizer;
        public org.webrtc.PeerConnection.IceTransportsType iceTransportsType = org.webrtc.PeerConnection.IceTransportsType.ALL;
        public org.webrtc.PeerConnection.BundlePolicy bundlePolicy = org.webrtc.PeerConnection.BundlePolicy.BALANCED;
        public org.webrtc.PeerConnection.RtcpMuxPolicy rtcpMuxPolicy = org.webrtc.PeerConnection.RtcpMuxPolicy.REQUIRE;
        public org.webrtc.PeerConnection.TcpCandidatePolicy tcpCandidatePolicy = org.webrtc.PeerConnection.TcpCandidatePolicy.ENABLED;
        public org.webrtc.PeerConnection.CandidateNetworkPolicy candidateNetworkPolicy = org.webrtc.PeerConnection.CandidateNetworkPolicy.ALL;
        public int audioJitterBufferMaxPackets = 50;
        public boolean audioJitterBufferFastAccelerate = false;
        public int iceConnectionReceivingTimeout = -1;
        public int iceBackupCandidatePairPingInterval = -1;
        public org.webrtc.PeerConnection.KeyType keyType = org.webrtc.PeerConnection.KeyType.ECDSA;
        public org.webrtc.PeerConnection.ContinualGatheringPolicy continualGatheringPolicy = org.webrtc.PeerConnection.ContinualGatheringPolicy.GATHER_ONCE;
        public int iceCandidatePoolSize = 0;

        @java.lang.Deprecated
        public boolean pruneTurnPorts = false;
        public org.webrtc.PeerConnection.PortPrunePolicy turnPortPrunePolicy = org.webrtc.PeerConnection.PortPrunePolicy.NO_PRUNE;
        public boolean presumeWritableWhenFullyRelayed = false;
        public boolean surfaceIceCandidatesOnIceTransportTypeChanged = false;
        public java.lang.Integer iceCheckIntervalStrongConnectivityMs = null;
        public java.lang.Integer iceCheckIntervalWeakConnectivityMs = null;
        public java.lang.Integer iceCheckMinInterval = null;
        public java.lang.Integer iceUnwritableTimeMs = null;
        public java.lang.Integer iceUnwritableMinChecks = null;
        public java.lang.Integer stunCandidateKeepaliveIntervalMs = null;
        public java.lang.Integer stableWritableConnectionPingIntervalMs = null;
        public boolean disableIPv6OnWifi = false;
        public int maxIPv6Networks = 5;
        public boolean disableIpv6 = false;
        public boolean enableDscp = false;
        public boolean enableCpuOveruseDetection = true;
        public boolean suspendBelowMinBitrate = false;
        public java.lang.Integer screencastMinBitrate = null;
        public java.lang.Boolean combinedAudioVideoBwe = null;
        public java.lang.Boolean enableDtlsSrtp = null;
        public org.webrtc.PeerConnection.AdapterType networkPreference = org.webrtc.PeerConnection.AdapterType.UNKNOWN;
        public org.webrtc.PeerConnection.SdpSemantics sdpSemantics = org.webrtc.PeerConnection.SdpSemantics.PLAN_B;
        public boolean activeResetSrtpParams = false;
        public org.webrtc.CryptoOptions cryptoOptions = null;
        public java.lang.String turnLoggingId = null;
        public java.lang.Boolean allowCodecSwitching = null;
        public boolean enableImplicitRollback = false;
        public boolean offerExtmapAllowMixed = true;

        public RTCConfiguration(java.util.List<org.webrtc.PeerConnection.IceServer> list) {
            this.iceServers = list;
        }

        public boolean getActiveResetSrtpParams() {
            return this.activeResetSrtpParams;
        }

        public java.lang.Boolean getAllowCodecSwitching() {
            return this.allowCodecSwitching;
        }

        public boolean getAudioJitterBufferFastAccelerate() {
            return this.audioJitterBufferFastAccelerate;
        }

        public int getAudioJitterBufferMaxPackets() {
            return this.audioJitterBufferMaxPackets;
        }

        public org.webrtc.PeerConnection.BundlePolicy getBundlePolicy() {
            return this.bundlePolicy;
        }

        public org.webrtc.PeerConnection.CandidateNetworkPolicy getCandidateNetworkPolicy() {
            return this.candidateNetworkPolicy;
        }

        public org.webrtc.RtcCertificatePem getCertificate() {
            return this.certificate;
        }

        public java.lang.Boolean getCombinedAudioVideoBwe() {
            return this.combinedAudioVideoBwe;
        }

        public org.webrtc.PeerConnection.ContinualGatheringPolicy getContinualGatheringPolicy() {
            return this.continualGatheringPolicy;
        }

        public org.webrtc.CryptoOptions getCryptoOptions() {
            return this.cryptoOptions;
        }

        public boolean getDisableIPv6OnWifi() {
            return this.disableIPv6OnWifi;
        }

        public boolean getDisableIpv6() {
            return this.disableIpv6;
        }

        public boolean getEnableCpuOveruseDetection() {
            return this.enableCpuOveruseDetection;
        }

        public boolean getEnableDscp() {
            return this.enableDscp;
        }

        public java.lang.Boolean getEnableDtlsSrtp() {
            return this.enableDtlsSrtp;
        }

        public boolean getEnableImplicitRollback() {
            return this.enableImplicitRollback;
        }

        public int getIceBackupCandidatePairPingInterval() {
            return this.iceBackupCandidatePairPingInterval;
        }

        public int getIceCandidatePoolSize() {
            return this.iceCandidatePoolSize;
        }

        public java.lang.Integer getIceCheckIntervalStrongConnectivity() {
            return this.iceCheckIntervalStrongConnectivityMs;
        }

        public java.lang.Integer getIceCheckIntervalWeakConnectivity() {
            return this.iceCheckIntervalWeakConnectivityMs;
        }

        public java.lang.Integer getIceCheckMinInterval() {
            return this.iceCheckMinInterval;
        }

        public int getIceConnectionReceivingTimeout() {
            return this.iceConnectionReceivingTimeout;
        }

        public java.util.List<org.webrtc.PeerConnection.IceServer> getIceServers() {
            return this.iceServers;
        }

        public org.webrtc.PeerConnection.IceTransportsType getIceTransportsType() {
            return this.iceTransportsType;
        }

        public java.lang.Integer getIceUnwritableMinChecks() {
            return this.iceUnwritableMinChecks;
        }

        public java.lang.Integer getIceUnwritableTimeout() {
            return this.iceUnwritableTimeMs;
        }

        public org.webrtc.PeerConnection.KeyType getKeyType() {
            return this.keyType;
        }

        public int getMaxIPv6Networks() {
            return this.maxIPv6Networks;
        }

        public org.webrtc.PeerConnection.AdapterType getNetworkPreference() {
            return this.networkPreference;
        }

        public boolean getOfferExtmapAllowMixed() {
            return this.offerExtmapAllowMixed;
        }

        public boolean getPresumeWritableWhenFullyRelayed() {
            return this.presumeWritableWhenFullyRelayed;
        }

        public boolean getPruneTurnPorts() {
            return this.pruneTurnPorts;
        }

        public org.webrtc.PeerConnection.RtcpMuxPolicy getRtcpMuxPolicy() {
            return this.rtcpMuxPolicy;
        }

        public java.lang.Integer getScreencastMinBitrate() {
            return this.screencastMinBitrate;
        }

        public org.webrtc.PeerConnection.SdpSemantics getSdpSemantics() {
            return this.sdpSemantics;
        }

        public java.lang.Integer getStableWritableConnectionPingIntervalMs() {
            return this.stableWritableConnectionPingIntervalMs;
        }

        public java.lang.Integer getStunCandidateKeepaliveInterval() {
            return this.stunCandidateKeepaliveIntervalMs;
        }

        public boolean getSurfaceIceCandidatesOnIceTransportTypeChanged() {
            return this.surfaceIceCandidatesOnIceTransportTypeChanged;
        }

        public boolean getSuspendBelowMinBitrate() {
            return this.suspendBelowMinBitrate;
        }

        public org.webrtc.PeerConnection.TcpCandidatePolicy getTcpCandidatePolicy() {
            return this.tcpCandidatePolicy;
        }

        public org.webrtc.TurnCustomizer getTurnCustomizer() {
            return this.turnCustomizer;
        }

        public java.lang.String getTurnLoggingId() {
            return this.turnLoggingId;
        }

        public org.webrtc.PeerConnection.PortPrunePolicy getTurnPortPrunePolicy() {
            return this.turnPortPrunePolicy;
        }
    }

    /* loaded from: classes6.dex */
    public enum RtcpMuxPolicy {
        NEGOTIATE,
        REQUIRE
    }

    /* loaded from: classes6.dex */
    public enum SdpSemantics {
        PLAN_B,
        UNIFIED_PLAN
    }

    /* loaded from: classes6.dex */
    public enum SignalingState {
        STABLE,
        HAVE_LOCAL_OFFER,
        HAVE_LOCAL_PRANSWER,
        HAVE_REMOTE_OFFER,
        HAVE_REMOTE_PRANSWER,
        CLOSED;

        public static org.webrtc.PeerConnection.SignalingState fromNativeIndex(int i17) {
            return values()[i17];
        }
    }

    /* loaded from: classes6.dex */
    public enum TcpCandidatePolicy {
        ENABLED,
        DISABLED
    }

    /* loaded from: classes6.dex */
    public enum TlsCertPolicy {
        TLS_CERT_POLICY_SECURE,
        TLS_CERT_POLICY_INSECURE_NO_CHECK
    }

    public PeerConnection(org.webrtc.NativePeerConnectionFactory nativePeerConnectionFactory) {
        this(nativePeerConnectionFactory.createNativePeerConnection());
    }

    public static long createNativePeerConnectionObserver(org.webrtc.PeerConnection.Observer observer) {
        return nativeCreatePeerConnectionObserver(observer);
    }

    private native boolean nativeAddIceCandidate(java.lang.String str, int i17, java.lang.String str2);

    private native void nativeAddIceCandidateWithObserver(java.lang.String str, int i17, java.lang.String str2, org.webrtc.AddIceObserver addIceObserver);

    private native boolean nativeAddLocalStream(long j17);

    private native org.webrtc.RtpSender nativeAddTrack(long j17, java.util.List<java.lang.String> list);

    private native org.webrtc.RtpTransceiver nativeAddTransceiverOfType(org.webrtc.MediaStreamTrack.MediaType mediaType, org.webrtc.RtpTransceiver.RtpTransceiverInit rtpTransceiverInit);

    private native org.webrtc.RtpTransceiver nativeAddTransceiverWithTrack(long j17, org.webrtc.RtpTransceiver.RtpTransceiverInit rtpTransceiverInit);

    private native void nativeClose();

    private native org.webrtc.PeerConnection.PeerConnectionState nativeConnectionState();

    private native void nativeCreateAnswer(org.webrtc.SdpObserver sdpObserver, org.webrtc.MediaConstraints mediaConstraints);

    private native org.webrtc.DataChannel nativeCreateDataChannel(java.lang.String str, org.webrtc.DataChannel.Init init);

    private native void nativeCreateOffer(org.webrtc.SdpObserver sdpObserver, org.webrtc.MediaConstraints mediaConstraints);

    private static native long nativeCreatePeerConnectionObserver(org.webrtc.PeerConnection.Observer observer);

    private native org.webrtc.RtpSender nativeCreateSender(java.lang.String str, java.lang.String str2);

    private static native void nativeFreeOwnedPeerConnection(long j17);

    private native org.webrtc.RtcCertificatePem nativeGetCertificate();

    private native org.webrtc.SessionDescription nativeGetLocalDescription();

    private native long nativeGetNativePeerConnection();

    private native java.util.List<org.webrtc.RtpReceiver> nativeGetReceivers();

    private native org.webrtc.SessionDescription nativeGetRemoteDescription();

    private native java.util.List<org.webrtc.RtpSender> nativeGetSenders();

    private native java.util.List<org.webrtc.RtpTransceiver> nativeGetTransceivers();

    private native org.webrtc.PeerConnection.IceConnectionState nativeIceConnectionState();

    private native org.webrtc.PeerConnection.IceGatheringState nativeIceGatheringState();

    private native void nativeNewGetStats(org.webrtc.RTCStatsCollectorCallback rTCStatsCollectorCallback);

    private native boolean nativeOldGetStats(org.webrtc.StatsObserver statsObserver, long j17);

    private native boolean nativeRemoveIceCandidates(org.webrtc.IceCandidate[] iceCandidateArr);

    private native void nativeRemoveLocalStream(long j17);

    private native boolean nativeRemoveTrack(long j17);

    private native void nativeRestartIce();

    private native void nativeSetAudioPlayout(boolean z17);

    private native void nativeSetAudioRecording(boolean z17);

    private native boolean nativeSetBitrate(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3);

    private native boolean nativeSetConfiguration(org.webrtc.PeerConnection.RTCConfiguration rTCConfiguration);

    private native void nativeSetLocalDescription(org.webrtc.SdpObserver sdpObserver, org.webrtc.SessionDescription sessionDescription);

    private native void nativeSetLocalDescriptionAutomatically(org.webrtc.SdpObserver sdpObserver);

    private native void nativeSetRemoteDescription(org.webrtc.SdpObserver sdpObserver, org.webrtc.SessionDescription sessionDescription);

    private native org.webrtc.PeerConnection.SignalingState nativeSignalingState();

    private native boolean nativeStartRtcEventLog(int i17, int i18);

    private native void nativeStopRtcEventLog();

    public boolean addIceCandidate(org.webrtc.IceCandidate iceCandidate) {
        return nativeAddIceCandidate(iceCandidate.sdpMid, iceCandidate.sdpMLineIndex, iceCandidate.sdp);
    }

    public boolean addStream(org.webrtc.MediaStream mediaStream) {
        if (!nativeAddLocalStream(mediaStream.getNativeMediaStream())) {
            return false;
        }
        this.localStreams.add(mediaStream);
        return true;
    }

    public org.webrtc.RtpSender addTrack(org.webrtc.MediaStreamTrack mediaStreamTrack) {
        return addTrack(mediaStreamTrack, java.util.Collections.emptyList());
    }

    public org.webrtc.RtpTransceiver addTransceiver(org.webrtc.MediaStreamTrack mediaStreamTrack) {
        return addTransceiver(mediaStreamTrack, new org.webrtc.RtpTransceiver.RtpTransceiverInit());
    }

    public void close() {
        nativeClose();
    }

    public org.webrtc.PeerConnection.PeerConnectionState connectionState() {
        return nativeConnectionState();
    }

    public void createAnswer(org.webrtc.SdpObserver sdpObserver, org.webrtc.MediaConstraints mediaConstraints) {
        nativeCreateAnswer(sdpObserver, mediaConstraints);
    }

    public org.webrtc.DataChannel createDataChannel(java.lang.String str, org.webrtc.DataChannel.Init init) {
        return nativeCreateDataChannel(str, init);
    }

    public void createOffer(org.webrtc.SdpObserver sdpObserver, org.webrtc.MediaConstraints mediaConstraints) {
        nativeCreateOffer(sdpObserver, mediaConstraints);
    }

    public org.webrtc.RtpSender createSender(java.lang.String str, java.lang.String str2) {
        org.webrtc.RtpSender nativeCreateSender = nativeCreateSender(str, str2);
        if (nativeCreateSender != null) {
            this.senders.add(nativeCreateSender);
        }
        return nativeCreateSender;
    }

    public void dispose() {
        close();
        for (org.webrtc.MediaStream mediaStream : this.localStreams) {
            nativeRemoveLocalStream(mediaStream.getNativeMediaStream());
            mediaStream.dispose();
        }
        this.localStreams.clear();
        java.util.Iterator<org.webrtc.RtpSender> it = this.senders.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.senders.clear();
        java.util.Iterator<org.webrtc.RtpReceiver> it6 = this.receivers.iterator();
        while (it6.hasNext()) {
            it6.next().dispose();
        }
        java.util.Iterator<org.webrtc.RtpTransceiver> it7 = this.transceivers.iterator();
        while (it7.hasNext()) {
            it7.next().dispose();
        }
        this.transceivers.clear();
        this.receivers.clear();
        nativeFreeOwnedPeerConnection(this.nativePeerConnection);
    }

    public org.webrtc.RtcCertificatePem getCertificate() {
        return nativeGetCertificate();
    }

    public org.webrtc.SessionDescription getLocalDescription() {
        return nativeGetLocalDescription();
    }

    public long getNativeOwnedPeerConnection() {
        return this.nativePeerConnection;
    }

    public long getNativePeerConnection() {
        return nativeGetNativePeerConnection();
    }

    public java.util.List<org.webrtc.RtpReceiver> getReceivers() {
        java.util.Iterator<org.webrtc.RtpReceiver> it = this.receivers.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        java.util.List<org.webrtc.RtpReceiver> nativeGetReceivers = nativeGetReceivers();
        this.receivers = nativeGetReceivers;
        return java.util.Collections.unmodifiableList(nativeGetReceivers);
    }

    public org.webrtc.SessionDescription getRemoteDescription() {
        return nativeGetRemoteDescription();
    }

    public java.util.List<org.webrtc.RtpSender> getSenders() {
        java.util.Iterator<org.webrtc.RtpSender> it = this.senders.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        java.util.List<org.webrtc.RtpSender> nativeGetSenders = nativeGetSenders();
        this.senders = nativeGetSenders;
        return java.util.Collections.unmodifiableList(nativeGetSenders);
    }

    @java.lang.Deprecated
    public boolean getStats(org.webrtc.StatsObserver statsObserver, org.webrtc.MediaStreamTrack mediaStreamTrack) {
        return nativeOldGetStats(statsObserver, mediaStreamTrack == null ? 0L : mediaStreamTrack.getNativeMediaStreamTrack());
    }

    public java.util.List<org.webrtc.RtpTransceiver> getTransceivers() {
        java.util.Iterator<org.webrtc.RtpTransceiver> it = this.transceivers.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        java.util.List<org.webrtc.RtpTransceiver> nativeGetTransceivers = nativeGetTransceivers();
        this.transceivers = nativeGetTransceivers;
        return java.util.Collections.unmodifiableList(nativeGetTransceivers);
    }

    public org.webrtc.PeerConnection.IceConnectionState iceConnectionState() {
        return nativeIceConnectionState();
    }

    public org.webrtc.PeerConnection.IceGatheringState iceGatheringState() {
        return nativeIceGatheringState();
    }

    public boolean removeIceCandidates(org.webrtc.IceCandidate[] iceCandidateArr) {
        return nativeRemoveIceCandidates(iceCandidateArr);
    }

    public void removeStream(org.webrtc.MediaStream mediaStream) {
        nativeRemoveLocalStream(mediaStream.getNativeMediaStream());
        this.localStreams.remove(mediaStream);
    }

    public boolean removeTrack(org.webrtc.RtpSender rtpSender) {
        if (rtpSender != null) {
            return nativeRemoveTrack(rtpSender.getNativeRtpSender());
        }
        throw new java.lang.NullPointerException("No RtpSender specified for removeTrack.");
    }

    public void restartIce() {
        nativeRestartIce();
    }

    public void setAudioPlayout(boolean z17) {
        nativeSetAudioPlayout(z17);
    }

    public void setAudioRecording(boolean z17) {
        nativeSetAudioRecording(z17);
    }

    public boolean setBitrate(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        return nativeSetBitrate(num, num2, num3);
    }

    public boolean setConfiguration(org.webrtc.PeerConnection.RTCConfiguration rTCConfiguration) {
        return nativeSetConfiguration(rTCConfiguration);
    }

    public void setLocalDescription(org.webrtc.SdpObserver sdpObserver) {
        nativeSetLocalDescriptionAutomatically(sdpObserver);
    }

    public void setRemoteDescription(org.webrtc.SdpObserver sdpObserver, org.webrtc.SessionDescription sessionDescription) {
        nativeSetRemoteDescription(sdpObserver, sessionDescription);
    }

    public org.webrtc.PeerConnection.SignalingState signalingState() {
        return nativeSignalingState();
    }

    public boolean startRtcEventLog(int i17, int i18) {
        return nativeStartRtcEventLog(i17, i18);
    }

    public void stopRtcEventLog() {
        nativeStopRtcEventLog();
    }

    public PeerConnection(long j17) {
        this.localStreams = new java.util.ArrayList();
        this.senders = new java.util.ArrayList();
        this.receivers = new java.util.ArrayList();
        this.transceivers = new java.util.ArrayList();
        this.nativePeerConnection = j17;
    }

    public void addIceCandidate(org.webrtc.IceCandidate iceCandidate, org.webrtc.AddIceObserver addIceObserver) {
        nativeAddIceCandidateWithObserver(iceCandidate.sdpMid, iceCandidate.sdpMLineIndex, iceCandidate.sdp, addIceObserver);
    }

    public org.webrtc.RtpSender addTrack(org.webrtc.MediaStreamTrack mediaStreamTrack, java.util.List<java.lang.String> list) {
        if (mediaStreamTrack != null && list != null) {
            org.webrtc.RtpSender nativeAddTrack = nativeAddTrack(mediaStreamTrack.getNativeMediaStreamTrack(), list);
            if (nativeAddTrack != null) {
                this.senders.add(nativeAddTrack);
                return nativeAddTrack;
            }
            throw new java.lang.IllegalStateException("C++ addTrack failed.");
        }
        throw new java.lang.NullPointerException("No MediaStreamTrack specified in addTrack.");
    }

    public org.webrtc.RtpTransceiver addTransceiver(org.webrtc.MediaStreamTrack mediaStreamTrack, org.webrtc.RtpTransceiver.RtpTransceiverInit rtpTransceiverInit) {
        if (mediaStreamTrack != null) {
            if (rtpTransceiverInit == null) {
                rtpTransceiverInit = new org.webrtc.RtpTransceiver.RtpTransceiverInit();
            }
            org.webrtc.RtpTransceiver nativeAddTransceiverWithTrack = nativeAddTransceiverWithTrack(mediaStreamTrack.getNativeMediaStreamTrack(), rtpTransceiverInit);
            if (nativeAddTransceiverWithTrack != null) {
                this.transceivers.add(nativeAddTransceiverWithTrack);
                return nativeAddTransceiverWithTrack;
            }
            throw new java.lang.IllegalStateException("C++ addTransceiver failed.");
        }
        throw new java.lang.NullPointerException("No MediaStreamTrack specified for addTransceiver.");
    }

    public void getStats(org.webrtc.RTCStatsCollectorCallback rTCStatsCollectorCallback) {
        nativeNewGetStats(rTCStatsCollectorCallback);
    }

    public void setLocalDescription(org.webrtc.SdpObserver sdpObserver, org.webrtc.SessionDescription sessionDescription) {
        nativeSetLocalDescription(sdpObserver, sessionDescription);
    }

    public org.webrtc.RtpTransceiver addTransceiver(org.webrtc.MediaStreamTrack.MediaType mediaType) {
        return addTransceiver(mediaType, new org.webrtc.RtpTransceiver.RtpTransceiverInit());
    }

    public org.webrtc.RtpTransceiver addTransceiver(org.webrtc.MediaStreamTrack.MediaType mediaType, org.webrtc.RtpTransceiver.RtpTransceiverInit rtpTransceiverInit) {
        if (mediaType != null) {
            if (rtpTransceiverInit == null) {
                rtpTransceiverInit = new org.webrtc.RtpTransceiver.RtpTransceiverInit();
            }
            org.webrtc.RtpTransceiver nativeAddTransceiverOfType = nativeAddTransceiverOfType(mediaType, rtpTransceiverInit);
            if (nativeAddTransceiverOfType != null) {
                this.transceivers.add(nativeAddTransceiverOfType);
                return nativeAddTransceiverOfType;
            }
            throw new java.lang.IllegalStateException("C++ addTransceiver failed.");
        }
        throw new java.lang.NullPointerException("No MediaType specified for addTransceiver.");
    }
}
