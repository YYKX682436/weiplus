package com.tencent.thumbplayer.api;

/* loaded from: classes16.dex */
public class TPJitterBufferConfig {
    private long mAdjustIntervalThresholdMs;
    private long mFrozenThresholdMs;
    private long mMaxIncreaseDurationMs;
    private long mMinDecreaseDurationMs;
    private long mPerDecreaseDurationMs;
    private long mPerIncreaseDurationMs;

    /* loaded from: classes16.dex */
    public static final class Builder {
        public static final long DEFAULT_ADJUST_INTERVAL_THRESHOLD_MS = 60000;
        public static final long DEFAULT_FROZEN_THRESHOLD_MS = 800;
        public static final long DEFAULT_MAX_DECREASE_DURATION_MS = 8000;
        public static final long DEFAULT_MIN_DECREASE_DURATION_MS = 2000;
        public static final long DEFAULT_PER_DECREASE_DURATION_MS = 500;
        public static final long DEFAULT_PER_INCREASE_DURATION_MS = 1000;
        private long mMinDecreaseDurationMs = 2000;
        private long mMaxIncreaseDurationMs = 8000;
        private long mPerIncreaseDurationMs = 1000;
        private long mPerDecreaseDurationMs = 500;
        private long mAdjustIntervalThresholdMs = 60000;
        private long mFrozenThresholdMs = 800;

        public com.tencent.thumbplayer.api.TPJitterBufferConfig build() {
            return new com.tencent.thumbplayer.api.TPJitterBufferConfig(this.mMinDecreaseDurationMs, this.mMaxIncreaseDurationMs, this.mPerIncreaseDurationMs, this.mPerDecreaseDurationMs, this.mAdjustIntervalThresholdMs, this.mFrozenThresholdMs);
        }

        public com.tencent.thumbplayer.api.TPJitterBufferConfig.Builder setAdjustIntervalThresholdMs(long j17) {
            this.mAdjustIntervalThresholdMs = j17;
            return this;
        }

        public com.tencent.thumbplayer.api.TPJitterBufferConfig.Builder setFrozenThresholdMs(long j17) {
            this.mFrozenThresholdMs = j17;
            return this;
        }

        public com.tencent.thumbplayer.api.TPJitterBufferConfig.Builder setMaxIncreaseDurationMs(long j17) {
            this.mMaxIncreaseDurationMs = j17;
            return this;
        }

        public com.tencent.thumbplayer.api.TPJitterBufferConfig.Builder setMinDecreaseDurationMs(long j17) {
            this.mMinDecreaseDurationMs = j17;
            return this;
        }

        public com.tencent.thumbplayer.api.TPJitterBufferConfig.Builder setPerDecreaseDurationMs(long j17) {
            this.mPerDecreaseDurationMs = j17;
            return this;
        }

        public com.tencent.thumbplayer.api.TPJitterBufferConfig.Builder setPerIncreaseDurationMs(long j17) {
            this.mPerIncreaseDurationMs = j17;
            return this;
        }
    }

    public TPJitterBufferConfig(long j17, long j18, long j19, long j27, long j28, long j29) {
        this.mMinDecreaseDurationMs = j17;
        this.mMaxIncreaseDurationMs = j18;
        this.mPerIncreaseDurationMs = j19;
        this.mPerDecreaseDurationMs = j27;
        this.mAdjustIntervalThresholdMs = j28;
        this.mFrozenThresholdMs = j29;
    }

    public long getAdjustIntervalThresholdMs() {
        return this.mAdjustIntervalThresholdMs;
    }

    public long getFrozenThresholdMs() {
        return this.mFrozenThresholdMs;
    }

    public long getMaxIncreaseDurationMs() {
        return this.mMaxIncreaseDurationMs;
    }

    public long getMinDecreaseDurationMs() {
        return this.mMinDecreaseDurationMs;
    }

    public long getPerDecreaseDurationMs() {
        return this.mPerDecreaseDurationMs;
    }

    public long getPerIncreaseDurationMs() {
        return this.mPerIncreaseDurationMs;
    }
}
