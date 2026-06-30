package org.webrtc;

/* loaded from: classes6.dex */
public class RtpParameters {
    public final java.util.List<org.webrtc.RtpParameters.Codec> codecs;
    public org.webrtc.RtpParameters.DegradationPreference degradationPreference;
    public final java.util.List<org.webrtc.RtpParameters.Encoding> encodings;
    private final java.util.List<org.webrtc.RtpParameters.HeaderExtension> headerExtensions;
    private final org.webrtc.RtpParameters.Rtcp rtcp;
    public final java.lang.String transactionId;

    /* loaded from: classes6.dex */
    public static class Codec {
        public java.lang.Integer clockRate;
        org.webrtc.MediaStreamTrack.MediaType kind;
        public java.lang.String name;
        public java.lang.Integer numChannels;
        public java.util.Map<java.lang.String, java.lang.String> parameters;
        public int payloadType;

        public Codec(int i17, java.lang.String str, org.webrtc.MediaStreamTrack.MediaType mediaType, java.lang.Integer num, java.lang.Integer num2, java.util.Map<java.lang.String, java.lang.String> map) {
            this.payloadType = i17;
            this.name = str;
            this.kind = mediaType;
            this.clockRate = num;
            this.numChannels = num2;
            this.parameters = map;
        }

        public java.lang.Integer getClockRate() {
            return this.clockRate;
        }

        public org.webrtc.MediaStreamTrack.MediaType getKind() {
            return this.kind;
        }

        public java.lang.String getName() {
            return this.name;
        }

        public java.lang.Integer getNumChannels() {
            return this.numChannels;
        }

        public java.util.Map getParameters() {
            return this.parameters;
        }

        public int getPayloadType() {
            return this.payloadType;
        }
    }

    /* loaded from: classes6.dex */
    public enum DegradationPreference {
        DISABLED,
        MAINTAIN_FRAMERATE,
        MAINTAIN_RESOLUTION,
        BALANCED;

        public static org.webrtc.RtpParameters.DegradationPreference fromNativeIndex(int i17) {
            return values()[i17];
        }
    }

    /* loaded from: classes6.dex */
    public static class HeaderExtension {
        private final boolean encrypted;

        /* renamed from: id, reason: collision with root package name */
        private final int f347920id;
        private final java.lang.String uri;

        public HeaderExtension(java.lang.String str, int i17, boolean z17) {
            this.uri = str;
            this.f347920id = i17;
            this.encrypted = z17;
        }

        public boolean getEncrypted() {
            return this.encrypted;
        }

        public int getId() {
            return this.f347920id;
        }

        public java.lang.String getUri() {
            return this.uri;
        }
    }

    /* loaded from: classes6.dex */
    public static class Rtcp {
        private final java.lang.String cname;
        private final boolean reducedSize;

        public Rtcp(java.lang.String str, boolean z17) {
            this.cname = str;
            this.reducedSize = z17;
        }

        public java.lang.String getCname() {
            return this.cname;
        }

        public boolean getReducedSize() {
            return this.reducedSize;
        }
    }

    public RtpParameters(java.lang.String str, org.webrtc.RtpParameters.DegradationPreference degradationPreference, org.webrtc.RtpParameters.Rtcp rtcp, java.util.List<org.webrtc.RtpParameters.HeaderExtension> list, java.util.List<org.webrtc.RtpParameters.Encoding> list2, java.util.List<org.webrtc.RtpParameters.Codec> list3) {
        this.transactionId = str;
        this.degradationPreference = degradationPreference;
        this.rtcp = rtcp;
        this.headerExtensions = list;
        this.encodings = list2;
        this.codecs = list3;
    }

    public java.util.List<org.webrtc.RtpParameters.Codec> getCodecs() {
        return this.codecs;
    }

    public org.webrtc.RtpParameters.DegradationPreference getDegradationPreference() {
        return this.degradationPreference;
    }

    public java.util.List<org.webrtc.RtpParameters.Encoding> getEncodings() {
        return this.encodings;
    }

    public java.util.List<org.webrtc.RtpParameters.HeaderExtension> getHeaderExtensions() {
        return this.headerExtensions;
    }

    public org.webrtc.RtpParameters.Rtcp getRtcp() {
        return this.rtcp;
    }

    public java.lang.String getTransactionId() {
        return this.transactionId;
    }

    /* loaded from: classes6.dex */
    public static class Encoding {
        public boolean active;
        public boolean adaptiveAudioPacketTime;
        public double bitratePriority;
        public java.lang.Integer maxBitrateBps;
        public java.lang.Integer maxFramerate;
        public java.lang.Integer minBitrateBps;
        public int networkPriority;
        public java.lang.Integer numTemporalLayers;
        public java.lang.String rid;
        public java.lang.Double scaleResolutionDownBy;
        public java.lang.Long ssrc;

        public Encoding(java.lang.String str, boolean z17, java.lang.Double d17) {
            this.bitratePriority = 1.0d;
            this.networkPriority = 1;
            this.rid = str;
            this.active = z17;
            this.scaleResolutionDownBy = d17;
        }

        public boolean getActive() {
            return this.active;
        }

        public boolean getAdaptivePTime() {
            return this.adaptiveAudioPacketTime;
        }

        public double getBitratePriority() {
            return this.bitratePriority;
        }

        public java.lang.Integer getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        public java.lang.Integer getMaxFramerate() {
            return this.maxFramerate;
        }

        public java.lang.Integer getMinBitrateBps() {
            return this.minBitrateBps;
        }

        public int getNetworkPriority() {
            return this.networkPriority;
        }

        public java.lang.Integer getNumTemporalLayers() {
            return this.numTemporalLayers;
        }

        public java.lang.String getRid() {
            return this.rid;
        }

        public java.lang.Double getScaleResolutionDownBy() {
            return this.scaleResolutionDownBy;
        }

        public java.lang.Long getSsrc() {
            return this.ssrc;
        }

        public Encoding(java.lang.String str, boolean z17, double d17, int i17, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.lang.Double d18, java.lang.Long l17, boolean z18) {
            this.rid = str;
            this.active = z17;
            this.bitratePriority = d17;
            this.networkPriority = i17;
            this.maxBitrateBps = num;
            this.minBitrateBps = num2;
            this.maxFramerate = num3;
            this.numTemporalLayers = num4;
            this.scaleResolutionDownBy = d18;
            this.ssrc = l17;
            this.adaptiveAudioPacketTime = z18;
        }
    }
}
