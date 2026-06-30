package org.webrtc;

/* loaded from: classes4.dex */
public class TurnCustomizer {
    private long nativeTurnCustomizer;

    public TurnCustomizer(long j17) {
        this.nativeTurnCustomizer = j17;
    }

    private void checkTurnCustomizerExists() {
        if (this.nativeTurnCustomizer == 0) {
            throw new java.lang.IllegalStateException("TurnCustomizer has been disposed.");
        }
    }

    private static native void nativeFreeTurnCustomizer(long j17);

    public void dispose() {
        checkTurnCustomizerExists();
        nativeFreeTurnCustomizer(this.nativeTurnCustomizer);
        this.nativeTurnCustomizer = 0L;
    }

    public long getNativeTurnCustomizer() {
        checkTurnCustomizerExists();
        return this.nativeTurnCustomizer;
    }
}
