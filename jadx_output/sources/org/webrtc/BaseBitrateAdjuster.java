package org.webrtc;

/* loaded from: classes15.dex */
class BaseBitrateAdjuster implements org.webrtc.BitrateAdjuster {
    protected int targetBitrateBps;
    protected double targetFramerateFps;

    @Override // org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return this.targetBitrateBps;
    }

    @Override // org.webrtc.BitrateAdjuster
    public double getAdjustedFramerateFps() {
        return this.targetFramerateFps;
    }

    @Override // org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i17) {
    }

    @Override // org.webrtc.BitrateAdjuster
    public void setTargets(int i17, double d17) {
        this.targetBitrateBps = i17;
        this.targetFramerateFps = d17;
    }
}
