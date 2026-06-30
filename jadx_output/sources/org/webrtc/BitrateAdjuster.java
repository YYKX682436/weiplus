package org.webrtc;

/* loaded from: classes16.dex */
interface BitrateAdjuster {
    int getAdjustedBitrateBps();

    double getAdjustedFramerateFps();

    void reportEncodedFrame(int i17);

    void setTargets(int i17, double d17);
}
