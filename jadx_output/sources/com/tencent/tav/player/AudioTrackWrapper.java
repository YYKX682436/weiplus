package com.tencent.tav.player;

/* loaded from: classes15.dex */
public class AudioTrackWrapper {
    private static final java.lang.String TAG = "AudioTrackWrapper";
    private android.media.AudioTrack mAudioTrack;

    /* loaded from: classes15.dex */
    public static class AudioTrackConfig {
        int sampleRateInHz;
        int streamType = 3;
        int channelConfig = 12;
        int audioFormat = 2;
        int mode = 1;
        int bufferSizeInBytes = 8192;

        public AudioTrackConfig(int i17, int i18) {
            this.sampleRateInHz = getSampleRateInHz(i17, i18);
        }

        private int getSampleRateInHz(int i17, int i18) {
            return i18 == 1 ? i17 / 2 : i17;
        }

        public java.lang.String toString() {
            return "AudioTrackConfig{streamType=" + this.streamType + ", sampleRateInHz=" + this.sampleRateInHz + ", channelConfig=" + this.channelConfig + ", audioFormat=" + this.audioFormat + ", bufferSizeInBytes=" + this.bufferSizeInBytes + ", mode=" + this.mode + '}';
        }
    }

    public AudioTrackWrapper(android.media.MediaFormat mediaFormat) {
        try {
            init(mediaFormat.getInteger("sample-rate"), mediaFormat.getInteger("channel-count"));
        } catch (java.lang.Exception unused) {
        }
    }

    private void init(int i17, int i18) {
        if (i17 <= 0) {
            return;
        }
        com.tencent.tav.player.AudioTrackWrapper.AudioTrackConfig audioTrackConfig = new com.tencent.tav.player.AudioTrackWrapper.AudioTrackConfig(i17, i18);
        com.tencent.tav.decoder.logger.Logger.d(TAG, "init:--> " + this);
        try {
            this.mAudioTrack = new android.media.AudioTrack(audioTrackConfig.streamType, audioTrackConfig.sampleRateInHz, audioTrackConfig.channelConfig, audioTrackConfig.audioFormat, audioTrackConfig.bufferSizeInBytes, audioTrackConfig.mode);
        } catch (java.lang.IllegalArgumentException unused) {
            this.mAudioTrack = null;
        }
        android.media.AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            audioTrack.play();
        }
    }

    public boolean allow() {
        return this.mAudioTrack != null;
    }

    public void flush() {
        if (allow()) {
            try {
                android.media.AudioTrack audioTrack = this.mAudioTrack;
                if (audioTrack != null) {
                    audioTrack.flush();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.tav.decoder.logger.Logger.e(TAG, "flush: ", e17);
            }
        }
    }

    public void parse() {
        android.media.AudioTrack audioTrack;
        if (allow() && (audioTrack = this.mAudioTrack) != null && audioTrack.getPlayState() == 3) {
            this.mAudioTrack.pause();
        }
    }

    public void release() {
        if (allow()) {
            stop();
            this.mAudioTrack.release();
            com.tencent.tav.decoder.logger.Logger.d(TAG, "release:--> " + this);
        }
    }

    public void setVolume(float f17) {
        if (allow()) {
            this.mAudioTrack.setVolume(f17);
        }
    }

    public void stop() {
        if (allow()) {
            if (this.mAudioTrack.getState() == 3 || this.mAudioTrack.getState() == 2) {
                this.mAudioTrack.stop();
            }
        }
    }

    public void writeData(byte[] bArr, int i17, int i18) {
        android.media.AudioTrack audioTrack;
        if (allow() && (audioTrack = this.mAudioTrack) != null) {
            try {
                audioTrack.write(bArr, i17, i18);
                if (this.mAudioTrack.getPlayState() != 3) {
                    this.mAudioTrack.play();
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public AudioTrackWrapper(int i17, int i18) {
        try {
            init(i17, i18);
        } catch (java.lang.Exception unused) {
        }
    }
}
