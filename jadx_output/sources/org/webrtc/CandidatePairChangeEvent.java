package org.webrtc;

/* loaded from: classes6.dex */
public final class CandidatePairChangeEvent {
    public final int estimatedDisconnectedTimeMs;
    public final int lastDataReceivedMs;
    public final org.webrtc.IceCandidate local;
    public final java.lang.String reason;
    public final org.webrtc.IceCandidate remote;

    public CandidatePairChangeEvent(org.webrtc.IceCandidate iceCandidate, org.webrtc.IceCandidate iceCandidate2, int i17, java.lang.String str, int i18) {
        this.local = iceCandidate;
        this.remote = iceCandidate2;
        this.lastDataReceivedMs = i17;
        this.reason = str;
        this.estimatedDisconnectedTimeMs = i18;
    }
}
