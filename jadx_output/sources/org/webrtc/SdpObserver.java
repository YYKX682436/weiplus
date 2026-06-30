package org.webrtc;

/* loaded from: classes6.dex */
public interface SdpObserver {
    void onCreateFailure(java.lang.String str);

    void onCreateSuccess(org.webrtc.SessionDescription sessionDescription);

    void onSetFailure(java.lang.String str);

    void onSetSuccess();
}
