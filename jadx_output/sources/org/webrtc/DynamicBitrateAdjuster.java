package org.webrtc;

/* loaded from: classes15.dex */
class DynamicBitrateAdjuster extends org.webrtc.BaseBitrateAdjuster {
    private static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    private static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    private static final int BITRATE_ADJUSTMENT_STEPS = 20;
    private static final double BITS_PER_BYTE = 8.0d;
    private int bitrateAdjustmentScaleExp;
    private double deviationBytes;
    private double timeSinceLastAdjustmentMs;

    private double getBitrateAdjustmentScale() {
        return java.lang.Math.pow(BITRATE_ADJUSTMENT_MAX_SCALE, this.bitrateAdjustmentScaleExp / 20.0d);
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
        return (int) (this.targetBitrateBps * getBitrateAdjustmentScale());
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int i17) {
        double d17 = this.targetFramerateFps;
        if (d17 == 0.0d) {
            return;
        }
        int i18 = this.targetBitrateBps;
        double d18 = this.deviationBytes + (i17 - ((i18 / BITS_PER_BYTE) / d17));
        this.deviationBytes = d18;
        this.timeSinceLastAdjustmentMs += 1000.0d / d17;
        double d19 = i18 / BITS_PER_BYTE;
        double d27 = BITRATE_ADJUSTMENT_SEC * d19;
        double min = java.lang.Math.min(d18, d27);
        this.deviationBytes = min;
        double max = java.lang.Math.max(min, -d27);
        this.deviationBytes = max;
        if (this.timeSinceLastAdjustmentMs <= 3000.0d) {
            return;
        }
        if (max > d19) {
            int i19 = this.bitrateAdjustmentScaleExp - ((int) ((max / d19) + 0.5d));
            this.bitrateAdjustmentScaleExp = i19;
            this.bitrateAdjustmentScaleExp = java.lang.Math.max(i19, -20);
            this.deviationBytes = d19;
        } else {
            double d28 = -d19;
            if (max < d28) {
                int i27 = this.bitrateAdjustmentScaleExp + ((int) (((-max) / d19) + 0.5d));
                this.bitrateAdjustmentScaleExp = i27;
                this.bitrateAdjustmentScaleExp = java.lang.Math.min(i27, 20);
                this.deviationBytes = d28;
            }
        }
        this.timeSinceLastAdjustmentMs = 0.0d;
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int i17, double d17) {
        int i18 = this.targetBitrateBps;
        if (i18 > 0 && i17 < i18) {
            this.deviationBytes = (this.deviationBytes * i17) / i18;
        }
        super.setTargets(i17, d17);
    }
}
