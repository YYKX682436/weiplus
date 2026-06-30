package org.webrtc.audio;

/* loaded from: classes14.dex */
class LowLatencyAudioBufferManager {
    private static final java.lang.String TAG = "LowLatencyAudioBufferManager";
    private int prevUnderrunCount = 0;
    private int ticksUntilNextDecrease = 10;
    private boolean keepLoweringBufferSize = true;
    private int bufferIncreaseCounter = 0;

    public void maybeAdjustBufferSize(android.media.AudioTrack audioTrack) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            int underrunCount = audioTrack.getUnderrunCount();
            if (underrunCount > this.prevUnderrunCount) {
                if (this.bufferIncreaseCounter < 5) {
                    int bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
                    int playbackRate = (audioTrack.getPlaybackRate() / 100) + bufferSizeInFrames;
                    org.webrtc.Logging.d(TAG, "Underrun detected! Increasing AudioTrack buffer size from " + bufferSizeInFrames + " to " + playbackRate);
                    audioTrack.setBufferSizeInFrames(playbackRate);
                    this.bufferIncreaseCounter = this.bufferIncreaseCounter + 1;
                }
                this.keepLoweringBufferSize = false;
                this.prevUnderrunCount = underrunCount;
                this.ticksUntilNextDecrease = 10;
                return;
            }
            if (this.keepLoweringBufferSize) {
                int i17 = this.ticksUntilNextDecrease - 1;
                this.ticksUntilNextDecrease = i17;
                if (i17 <= 0) {
                    int playbackRate2 = audioTrack.getPlaybackRate() / 100;
                    int bufferSizeInFrames2 = audioTrack.getBufferSizeInFrames();
                    int max = java.lang.Math.max(playbackRate2, bufferSizeInFrames2 - playbackRate2);
                    if (max != bufferSizeInFrames2) {
                        org.webrtc.Logging.d(TAG, "Lowering AudioTrack buffer size from " + bufferSizeInFrames2 + " to " + max);
                        audioTrack.setBufferSizeInFrames(max);
                    }
                    this.ticksUntilNextDecrease = 10;
                }
            }
        }
    }
}
