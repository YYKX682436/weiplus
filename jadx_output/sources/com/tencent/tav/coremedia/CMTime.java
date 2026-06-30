package com.tencent.tav.coremedia;

/* loaded from: classes16.dex */
public class CMTime implements java.lang.Cloneable {
    public static final int DEFAULT_TIME_SCALE = 600;
    private static final long SECONDS_MS = 1000;
    private static final long SECONDS_US = 1000000;
    private final float time;
    public final int timeScale;
    private final long timeUs;
    public final long value;
    public static final com.tencent.tav.coremedia.CMTime CMTimeZero = new com.tencent.tav.coremedia.CMTime(0, 600);
    public static final com.tencent.tav.coremedia.CMTime CMTimeOne = new com.tencent.tav.coremedia.CMTime(600, 600);
    public static final com.tencent.tav.coremedia.CMTime CMTimeInvalid = new com.tencent.tav.coremedia.CMTime(Long.MIN_VALUE, 600, -1.0f, -1);

    public CMTime() {
        this(0L, 600);
    }

    public static int GCD(int i17, int i18) {
        return i17 == 0 ? i18 : GCD(i18 % i17, i17);
    }

    public static int LCM(int i17, int i18) {
        return (i17 / GCD(i17, i18)) * i18;
    }

    public static com.tencent.tav.coremedia.CMTime add(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMTime cMTime2) {
        com.tencent.tav.coremedia.CMTime cMTime3 = CMTimeInvalid;
        if (cMTime == cMTime3) {
            return cMTime2.m413clone();
        }
        if (cMTime2 == cMTime3) {
            return cMTime.m413clone();
        }
        int LCM = LCM(cMTime.timeScale, cMTime2.timeScale);
        com.tencent.tav.coremedia.CMTime convertTimeScale = convertTimeScale(cMTime, LCM);
        return new com.tencent.tav.coremedia.CMTime(convertTimeScale.getValue() + convertTimeScale(cMTime2, LCM).getValue(), convertTimeScale.timeScale);
    }

    public static com.tencent.tav.coremedia.CMTime convertTimeScale(com.tencent.tav.coremedia.CMTime cMTime, int i17) {
        com.tencent.tav.coremedia.CMTime cMTime2 = CMTimeInvalid;
        return cMTime == cMTime2 ? cMTime2 : cMTime == CMTimeZero ? new com.tencent.tav.coremedia.CMTime(0L, i17) : new com.tencent.tav.coremedia.CMTime((cMTime.getValue() * i17) / cMTime.getTimeScale(), i17);
    }

    public static com.tencent.tav.coremedia.CMTime fromMs(long j17) {
        return new com.tencent.tav.coremedia.CMTime((((float) j17) * 1.0f) / 1000.0f);
    }

    public static com.tencent.tav.coremedia.CMTime fromSeconds(float f17) {
        return new com.tencent.tav.coremedia.CMTime(f17);
    }

    public static com.tencent.tav.coremedia.CMTime fromUs(long j17) {
        return new com.tencent.tav.coremedia.CMTime((((float) j17) * 1.0f) / 1000000.0f);
    }

    public static com.tencent.tav.coremedia.CMTime max(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMTime cMTime2) {
        return cMTime.bigThan(cMTime2) ? cMTime : cMTime2;
    }

    public static com.tencent.tav.coremedia.CMTime min(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMTime cMTime2) {
        return cMTime.smallThan(cMTime2) ? cMTime : cMTime2;
    }

    public static com.tencent.tav.coremedia.CMTime sub(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMTime cMTime2) {
        com.tencent.tav.coremedia.CMTime cMTime3 = CMTimeInvalid;
        if (cMTime == cMTime3) {
            return new com.tencent.tav.coremedia.CMTime(-cMTime2.getValue());
        }
        if (cMTime2 == cMTime3) {
            return cMTime.m413clone();
        }
        int LCM = LCM(cMTime.timeScale, cMTime2.timeScale);
        com.tencent.tav.coremedia.CMTime convertTimeScale = convertTimeScale(cMTime, LCM);
        return new com.tencent.tav.coremedia.CMTime(convertTimeScale.getValue() - convertTimeScale(cMTime2, LCM).getValue(), convertTimeScale.timeScale);
    }

    public boolean bigThan(com.tencent.tav.coremedia.CMTime cMTime) {
        return getTimeUs() > cMTime.getTimeUs();
    }

    public int compare(com.tencent.tav.coremedia.CMTime cMTime) {
        long timeUs = getTimeUs() - cMTime.getTimeUs();
        if (timeUs > 0) {
            return 1;
        }
        return timeUs == 0 ? 0 : -1;
    }

    public com.tencent.tav.coremedia.CMTime divide(float f17) {
        com.tencent.tav.coremedia.CMTime cMTime = CMTimeInvalid;
        return this == cMTime ? cMTime : new com.tencent.tav.coremedia.CMTime(((float) getValue()) / f17, this.timeScale);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.tencent.tav.coremedia.CMTime)) {
            return false;
        }
        com.tencent.tav.coremedia.CMTime cMTime = (com.tencent.tav.coremedia.CMTime) obj;
        return this.value == cMTime.value && this.timeScale == cMTime.timeScale;
    }

    public boolean equalsTo(com.tencent.tav.coremedia.CMTime cMTime) {
        return getTimeUs() == cMTime.getTimeUs();
    }

    public int getTimeScale() {
        return this.timeScale;
    }

    public float getTimeSeconds() {
        return this.time;
    }

    public long getTimeUs() {
        return this.timeUs;
    }

    public long getValue() {
        return this.value;
    }

    public com.tencent.tav.coremedia.CMTime limitMax(com.tencent.tav.coremedia.CMTime cMTime) {
        return bigThan(cMTime) ? cMTime : this;
    }

    public com.tencent.tav.coremedia.CMTime limitMin(com.tencent.tav.coremedia.CMTime cMTime) {
        return smallThan(cMTime) ? cMTime : this;
    }

    public com.tencent.tav.coremedia.CMTime multi(float f17) {
        com.tencent.tav.coremedia.CMTime cMTime = CMTimeInvalid;
        return this == cMTime ? cMTime : new com.tencent.tav.coremedia.CMTime(((float) getValue()) * f17, this.timeScale);
    }

    public boolean smallThan(com.tencent.tav.coremedia.CMTime cMTime) {
        return getTimeUs() < cMTime.getTimeUs();
    }

    public java.lang.String toString() {
        return "[value = " + this.value + " timeScale = " + this.timeScale + " timeUs = " + this.timeUs + "]";
    }

    public CMTime(long j17) {
        this(j17, 600);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.tencent.tav.coremedia.CMTime m413clone() {
        return new com.tencent.tav.coremedia.CMTime(this.value, this.timeScale, this.time, this.timeUs);
    }

    public CMTime(float f17) {
        this(f17 * 600.0f, 600);
    }

    public com.tencent.tav.coremedia.CMTime divide(com.tencent.tav.coremedia.CMTime cMTime) {
        int LCM = LCM(this.timeScale, cMTime.timeScale);
        return new com.tencent.tav.coremedia.CMTime(convertTimeScale(this, LCM).value / convertTimeScale(cMTime, LCM).value, LCM);
    }

    public com.tencent.tav.coremedia.CMTime multi(com.tencent.tav.coremedia.CMTime cMTime) {
        int LCM = LCM(this.timeScale, cMTime.timeScale);
        return new com.tencent.tav.coremedia.CMTime(convertTimeScale(this, LCM).value * convertTimeScale(cMTime, LCM).value, LCM);
    }

    public CMTime(long j17, int i17) {
        this.value = j17;
        this.timeScale = i17;
        this.time = (((float) j17) * 1.0f) / i17;
        this.timeUs = (j17 * 1000000) / i17;
    }

    public com.tencent.tav.coremedia.CMTime add(long j17) {
        if (this == CMTimeInvalid) {
            return m413clone();
        }
        return new com.tencent.tav.coremedia.CMTime(getValue() + ((j17 * this.timeScale) / java.util.concurrent.TimeUnit.SECONDS.toMicros(1L)), this.timeScale);
    }

    public com.tencent.tav.coremedia.CMTime sub(com.tencent.tav.coremedia.CMTime cMTime) {
        return sub(this, cMTime);
    }

    private CMTime(long j17, int i17, float f17, long j18) {
        this.value = j17;
        this.timeUs = j18;
        this.time = f17;
        this.timeScale = i17;
    }

    public com.tencent.tav.coremedia.CMTime add(com.tencent.tav.coremedia.CMTime cMTime) {
        return add(this, cMTime);
    }
}
