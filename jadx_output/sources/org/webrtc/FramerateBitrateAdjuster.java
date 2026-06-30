package org.webrtc;

/* loaded from: classes15.dex */
class FramerateBitrateAdjuster extends org.webrtc.BaseBitrateAdjuster {
    private static final int DEFAULT_FRAMERATE_FPS = 30;

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i17, double d17) {
        this.targetFramerateFps = 30.0d;
        this.targetBitrateBps = (int) ((i17 * 30) / d17);
    }
}
