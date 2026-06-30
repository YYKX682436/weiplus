package org.webrtc;

/* loaded from: classes11.dex */
public class IceCandidate {
    public final org.webrtc.PeerConnection.AdapterType adapterType;
    public final java.lang.String sdp;
    public final int sdpMLineIndex;
    public final java.lang.String sdpMid;
    public final java.lang.String serverUrl;

    public IceCandidate(java.lang.String str, int i17, java.lang.String str2) {
        this.sdpMid = str;
        this.sdpMLineIndex = i17;
        this.sdp = str2;
        this.serverUrl = "";
        this.adapterType = org.webrtc.PeerConnection.AdapterType.UNKNOWN;
    }

    private static boolean objectEquals(java.lang.Object obj, java.lang.Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.webrtc.IceCandidate)) {
            return false;
        }
        org.webrtc.IceCandidate iceCandidate = (org.webrtc.IceCandidate) obj;
        return objectEquals(this.sdpMid, iceCandidate.sdpMid) && this.sdpMLineIndex == iceCandidate.sdpMLineIndex && objectEquals(this.sdp, iceCandidate.sdp);
    }

    public java.lang.String getSdp() {
        return this.sdp;
    }

    public java.lang.String getSdpMid() {
        return this.sdpMid;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.sdpMid, java.lang.Integer.valueOf(this.sdpMLineIndex), this.sdp});
    }

    public java.lang.String toString() {
        return this.sdpMid + ":" + this.sdpMLineIndex + ":" + this.sdp + ":" + this.serverUrl + ":" + this.adapterType.toString();
    }

    public IceCandidate(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, org.webrtc.PeerConnection.AdapterType adapterType) {
        this.sdpMid = str;
        this.sdpMLineIndex = i17;
        this.sdp = str2;
        this.serverUrl = str3;
        this.adapterType = adapterType;
    }
}
