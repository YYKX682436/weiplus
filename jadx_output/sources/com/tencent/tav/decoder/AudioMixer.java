package com.tencent.tav.decoder;

/* loaded from: classes15.dex */
public class AudioMixer {
    public static final int OUTPUT_CHANNEL_COUNT = 1;
    public static final int OUTPUT_SAMPLE_RATE = 44100;
    private static final int SIGNED_SHORT_LIMIT = 32768;
    private static final java.lang.String TAG = "AudioMixer";
    private static final int UNSIGNED_SHORT_MAX = 65535;
    private byte _hellAccFlag_;
    private java.nio.ByteBuffer cachedByteBuffer;
    private java.nio.ByteBuffer cachedMergedBuffer;
    private short[] cachedMergedBytes;
    private int destAudioChannelCount;
    private int destAudioSampleRate;
    private java.nio.ByteBuffer emptyAudioBuffer;
    private long nativeContext;
    private int pcmEncoding;
    private short[] resampleBuffer;
    private short[] sampleBuffer;
    private float sampleFactor;
    private boolean singleChannel;
    private int srcNumChannels;
    private int srcSampleRate;

    static {
        if (com.tencent.tav.ResourceLoadUtil.isLoaded()) {
            return;
        }
        try {
            java.lang.System.out.println("loadlibrary : tav start");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("tav");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/tav/decoder/AudioMixer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/tav/decoder/AudioMixer", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.tav.ResourceLoadUtil.setLoaded(true);
            java.lang.System.out.println("loadlibrary : tav end");
        } catch (java.lang.Throwable unused) {
        }
    }

    public AudioMixer() {
        this(44100, 1);
    }

    private short[] downRemix(short[] sArr) {
        java.nio.ShortBuffer wrap = java.nio.ShortBuffer.wrap(sArr);
        java.nio.ShortBuffer allocate = java.nio.ShortBuffer.allocate(sArr.length);
        downRemix(wrap, allocate);
        return allocate.array();
    }

    private short[] getCachedSampleBuffer(int i17) {
        short[] sArr = this.sampleBuffer;
        if (sArr != null && sArr.length >= i17) {
            return sArr;
        }
        short[] sArr2 = new short[i17];
        this.sampleBuffer = sArr2;
        return sArr2;
    }

    private int getResampleLength(int i17) {
        int i18 = (int) (i17 * this.sampleFactor);
        return i18 % 2 == 1 ? i18 - 1 : i18;
    }

    private native void nativeRelease(long j17);

    private native long nativeSetup(int i17, int i18);

    private native void readShortFromStream(long j17, short[] sArr);

    private short[] resample(short[] sArr, int i17) {
        float f17 = this.sampleFactor;
        if (f17 == 1.0f) {
            return sArr;
        }
        if (java.lang.Float.compare(f17, 0.5f) == 0) {
            return downRemix(sArr);
        }
        int resampleLength = getResampleLength(i17);
        short[] sArr2 = this.resampleBuffer;
        if (sArr2 == null || sArr2.length < resampleLength) {
            sArr2 = new short[resampleLength];
            this.resampleBuffer = sArr2;
        }
        float f18 = 1.0f / this.sampleFactor;
        int i18 = 0;
        if (this.singleChannel) {
            while (i18 < resampleLength) {
                short s17 = sArr[(int) (i18 * f18)];
                sArr2[i18 + 1] = s17;
                sArr2[i18] = s17;
                i18 += 2;
            }
        } else {
            while (i18 < resampleLength) {
                int i19 = ((int) (i18 * 0.5d * f18)) * 2;
                sArr2[i18] = sArr[i19];
                sArr2[i18 + 1] = sArr[i19 + 1];
                i18 += 2;
            }
        }
        return sArr2;
    }

    private native int writeShortToStream(long j17, short[] sArr, int i17, float f17, float f18, float f19);

    public void finalize() {
        release();
    }

    public int getDestAudioChannelCount() {
        return this.destAudioChannelCount;
    }

    public java.nio.ByteBuffer mergeSamples(java.nio.ShortBuffer shortBuffer, java.nio.ShortBuffer shortBuffer2) {
        java.nio.ByteBuffer byteBuffer = this.cachedMergedBuffer;
        if (byteBuffer == null || byteBuffer.capacity() < shortBuffer.limit() * 2) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(shortBuffer.limit() * 2);
            this.cachedMergedBuffer = allocate;
            allocate.order(shortBuffer.order());
        } else {
            this.cachedMergedBuffer.clear();
        }
        short[] sArr = this.cachedMergedBytes;
        if (sArr == null || sArr.length < shortBuffer.limit() * 2) {
            this.cachedMergedBytes = new short[shortBuffer.limit() * 2];
        }
        java.nio.ShortBuffer asShortBuffer = this.cachedMergedBuffer.asShortBuffer();
        short[] sArr2 = this.cachedMergedBytes;
        int min = java.lang.Math.min(shortBuffer.limit(), shortBuffer2.limit());
        for (int i17 = 0; i17 < min; i17++) {
            int i18 = shortBuffer.get(i17) + shortBuffer2.get(i17);
            int i19 = -32768;
            if (i18 >= -32768) {
                i19 = 32767;
                if (i18 <= 32767) {
                    sArr2[i17] = (short) i18;
                }
            }
            i18 = i19;
            sArr2[i17] = (short) i18;
        }
        asShortBuffer.put(sArr2, 0, min);
        if (min < shortBuffer.limit()) {
            shortBuffer.position(min);
            asShortBuffer.put(shortBuffer);
        }
        this.cachedMergedBuffer.position(0);
        this.cachedMergedBuffer.limit(shortBuffer.limit() * 2);
        return this.cachedMergedBuffer;
    }

    public java.nio.ByteBuffer processBytes(java.nio.ByteBuffer byteBuffer, float f17, float f18, float f19) {
        int limit;
        short[] cachedSampleBuffer;
        java.nio.ByteBuffer allocate;
        if (f17 == 1.0f && f18 == 1.0f && f19 == 1.0f && this.sampleFactor == 1.0f) {
            return byteBuffer;
        }
        int i17 = this.pcmEncoding;
        if (i17 == 2) {
            java.nio.ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            limit = asShortBuffer.limit();
            cachedSampleBuffer = getCachedSampleBuffer(limit);
            asShortBuffer.get(cachedSampleBuffer, 0, limit);
        } else {
            if (i17 != 3) {
                return byteBuffer;
            }
            limit = byteBuffer.limit();
            byteBuffer.get(new byte[limit], 0, limit);
            cachedSampleBuffer = getCachedSampleBuffer(limit);
            for (int i18 = 0; i18 < limit; i18++) {
                cachedSampleBuffer[i18] = r2[i18];
            }
        }
        short[] resample = resample(cachedSampleBuffer, limit);
        int resampleLength = getResampleLength(limit);
        if (f18 == 0.0f) {
            resampleLength = (int) (resampleLength / f17);
        } else if (f17 != 1.0f || f18 != 1.0f || f19 != 1.0f) {
            resampleLength = writeShortToStream(this.nativeContext, resample, resampleLength / this.destAudioChannelCount, f17, f18, f19) * this.destAudioChannelCount;
            resample = getCachedSampleBuffer(resampleLength);
            readShortFromStream(this.nativeContext, resample);
        }
        if (f18 == 0.0f) {
            java.nio.ByteBuffer byteBuffer2 = this.emptyAudioBuffer;
            if (byteBuffer2 == null || byteBuffer2.limit() < resampleLength * 2) {
                int i19 = resampleLength * 2;
                java.nio.ByteBuffer allocate2 = java.nio.ByteBuffer.allocate(i19);
                this.emptyAudioBuffer = allocate2;
                allocate2.order(byteBuffer.order());
                this.emptyAudioBuffer.put(new byte[i19]);
            }
            allocate = this.emptyAudioBuffer;
        } else {
            java.nio.ByteBuffer byteBuffer3 = this.cachedByteBuffer;
            if (byteBuffer3 == null || byteBuffer3.capacity() < resampleLength * 2) {
                allocate = java.nio.ByteBuffer.allocate(resampleLength * 2);
                this.cachedByteBuffer = allocate;
                allocate.order(byteBuffer.order());
            } else {
                allocate = this.cachedByteBuffer;
                allocate.clear();
            }
            allocate.asShortBuffer().put(resample, 0, resampleLength);
        }
        allocate.position(0);
        allocate.limit(resampleLength * 2);
        return allocate;
    }

    public final void release() {
        nativeRelease(this.nativeContext);
        this.nativeContext = 0L;
    }

    public void setAudioInfo(int i17, int i18, int i19) {
        this.srcSampleRate = i17;
        this.srcNumChannels = i18;
        this.sampleFactor = (this.destAudioSampleRate * this.destAudioChannelCount) / ((i17 * i18) * 1.0f);
        this.singleChannel = i18 == 1;
        this.pcmEncoding = i19;
    }

    public AudioMixer(int i17, int i18) {
        this.srcSampleRate = 44100;
        this.srcNumChannels = 1;
        this.destAudioSampleRate = i17;
        this.destAudioChannelCount = i18;
        this.nativeContext = nativeSetup(i17, i18);
        this.sampleFactor = 1.0f;
        this.singleChannel = i18 == 1;
        this.pcmEncoding = 2;
    }

    public void downRemix(java.nio.ShortBuffer shortBuffer, java.nio.ShortBuffer shortBuffer2) {
        int min = java.lang.Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i17 = 0; i17 < min; i17++) {
            int i18 = ((shortBuffer.get() + 32768) + (shortBuffer.get() + 32768)) / 2;
            if (i18 >= 65536) {
                i18 = -1;
            }
            shortBuffer2.put((short) (i18 - 32768));
        }
    }
}
