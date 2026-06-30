package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes13.dex */
public class WaveWriter {
    private static final int OUTPUT_STREAM_BUFFER = 16384;
    private static final java.lang.String TAG = "WaveWriter";
    private int mBytesWritten = 0;
    private int mChannels;
    private java.io.File mOutFile;
    private java.io.BufferedOutputStream mOutStream;
    private int mSampleBits;
    private int mSampleRate;
    private java.io.ByteArrayOutputStream mTmpStream;

    public WaveWriter(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        this.mOutFile = new java.io.File(str + java.io.File.separator + str2);
        this.mSampleRate = i17;
        this.mChannels = i18;
        this.mSampleBits = i19;
    }

    private short[] interpolate(int i17, int i18, short[] sArr) {
        if (i17 == i18) {
            return sArr;
        }
        int round = java.lang.Math.round((sArr.length / i17) * i18);
        float length = round / sArr.length;
        short[] sArr2 = new short[round];
        for (int i19 = 0; i19 < round; i19++) {
            int i27 = (int) (i19 / length);
            int i28 = i27 + 1;
            if (i28 >= sArr.length) {
                i28 = sArr.length - 1;
            }
            short s17 = sArr[i28];
            short s18 = sArr[i27];
            sArr2[i19] = (short) (((s17 - s18) * (r2 - i27)) + s18);
        }
        return sArr2;
    }

    private byte[] reSample(byte[] bArr, int i17, int i18, int i19) {
        byte[] bArr2;
        int i27 = i17 / 8;
        if (i27 <= 0) {
            return null;
        }
        int length = bArr.length / i27;
        short[] sArr = new short[length];
        int i28 = 0;
        int i29 = 0;
        for (int i37 = 0; i37 < length; i37++) {
            int i38 = 0;
            short s17 = 0;
            while (i38 < i27) {
                s17 = (short) (((short) ((bArr[i29] & 255) << (i38 * 8))) | s17);
                i38++;
                i29++;
            }
            sArr[i37] = s17;
        }
        short[] interpolate = interpolate(i18, i19, sArr);
        int length2 = interpolate.length;
        if (i27 == 1) {
            bArr2 = new byte[length2];
            while (i28 < length2) {
                bArr2[i28] = (byte) interpolate[i28];
                i28++;
            }
        } else {
            bArr2 = new byte[length2 * 2];
            while (i28 < interpolate.length) {
                int i39 = i28 * 2;
                short s18 = interpolate[i28];
                bArr2[i39] = (byte) (s18 & 255);
                bArr2[i39 + 1] = (byte) ((s18 >> 8) & 255);
                i28++;
            }
        }
        this.mSampleRate = i19;
        return bArr2;
    }

    private static void writeUnsignedShortLE(java.io.ByteArrayOutputStream byteArrayOutputStream, short s17) {
        byteArrayOutputStream.write(s17);
        byteArrayOutputStream.write(s17 >> 8);
    }

    private void writeWaveHeader() {
        java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(this.mOutFile, "rw");
        randomAccessFile.seek(0L);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
        int i17 = (this.mSampleBits + 7) / 8;
        try {
            dataOutputStream.writeBytes("RIFF");
            dataOutputStream.writeInt(java.lang.Integer.reverseBytes(this.mBytesWritten + 36));
            dataOutputStream.writeBytes("WAVE");
            dataOutputStream.writeBytes("fmt ");
            dataOutputStream.writeInt(java.lang.Integer.reverseBytes(16));
            dataOutputStream.writeShort(java.lang.Short.reverseBytes((short) 1));
            dataOutputStream.writeShort(java.lang.Short.reverseBytes((short) this.mChannels));
            dataOutputStream.writeInt(java.lang.Integer.reverseBytes(this.mSampleRate));
            dataOutputStream.writeInt(java.lang.Integer.reverseBytes(this.mSampleRate * this.mChannels * i17));
            dataOutputStream.writeShort(java.lang.Short.reverseBytes((short) (this.mChannels * i17)));
            dataOutputStream.writeShort(java.lang.Short.reverseBytes((short) this.mSampleBits));
            dataOutputStream.writeBytes(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            dataOutputStream.writeInt(java.lang.Integer.reverseBytes(this.mBytesWritten));
            byteArrayOutputStream.flush();
            randomAccessFile.write(byteArrayOutputStream.toByteArray());
        } finally {
            byteArrayOutputStream.close();
            dataOutputStream.close();
            randomAccessFile.close();
        }
    }

    public byte[] changeStereoToMono(byte[] bArr) {
        int i17 = this.mChannels;
        if (i17 != 2) {
            return bArr;
        }
        int i18 = this.mSampleBits / 8;
        long length = (bArr.length / i17) / i18;
        byte[] bArr2 = new byte[(int) (i18 * length)];
        for (int i19 = 0; i19 < length; i19++) {
            for (int i27 = 0; i27 < i18; i27++) {
                int i28 = this.mChannels;
                bArr2[(i19 * i18) + i27] = (byte) ((bArr[((i19 * i28) * i18) + i27] + bArr[(((i28 * i19) + 1) * i18) + i27]) / 2);
            }
        }
        this.mChannels = 1;
        return bArr2;
    }

    public void closeWaveFile() {
        java.io.BufferedOutputStream bufferedOutputStream = this.mOutStream;
        if (bufferedOutputStream != null) {
            bufferedOutputStream.flush();
            this.mOutStream.close();
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = this.mTmpStream;
        if (byteArrayOutputStream != null) {
            byteArrayOutputStream.flush();
            this.mTmpStream.close();
        }
        writeWaveHeader();
    }

    public boolean createWaveFile() {
        if (this.mOutFile.exists()) {
            this.mOutFile.delete();
        }
        this.mOutFile.getParentFile().mkdirs();
        if (!this.mOutFile.createNewFile()) {
            return false;
        }
        this.mOutStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(this.mOutFile), 16384);
        this.mTmpStream = new java.io.ByteArrayOutputStream();
        this.mOutStream.write(new byte[44]);
        return true;
    }

    public int getChannels() {
        return this.mChannels;
    }

    public boolean reSampler() {
        try {
            byte[] reSample = reSample(this.mTmpStream.toByteArray(), this.mSampleBits, this.mSampleRate, 8000);
            if (reSample == null) {
                return false;
            }
            com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "mTmpStream length = " + this.mTmpStream.toByteArray().length);
            byte[] changeStereoToMono = changeStereoToMono(reSample);
            com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "monoData length = " + changeStereoToMono.length);
            byte[] reSample2 = reSample(changeStereoToMono, this.mSampleBits, 8000, 4000);
            if (reSample2 == null) {
                return false;
            }
            com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "resultData length = " + reSample2.length);
            this.mBytesWritten = reSample2.length;
            this.mOutStream.write(reSample2);
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th6);
            return false;
        }
    }

    public boolean reSamplerTo8K() {
        try {
            byte[] reSample = reSample(this.mTmpStream.toByteArray(), this.mSampleBits, this.mSampleRate, 8000);
            if (reSample == null) {
                return false;
            }
            com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "mTmpStream length = " + this.mTmpStream.toByteArray().length);
            byte[] changeStereoToMono = changeStereoToMono(reSample);
            com.tencent.qqmusic.mediaplayer.util.Logger.d(TAG, "resultData length = " + changeStereoToMono.length);
            this.mBytesWritten = changeStereoToMono.length;
            this.mOutStream.write(changeStereoToMono);
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th6);
            return false;
        }
    }

    public void setSampleByte(int i17) {
        this.mSampleBits = i17;
    }

    public void write(short[] sArr, int i17, int i18) {
        if (i17 > i18) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("offset %d is greater than length %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
        }
        while (i17 < i18) {
            writeUnsignedShortLE(this.mTmpStream, sArr[i17]);
            this.mBytesWritten += 2;
            i17++;
        }
    }

    public void writeDone() {
        try {
            this.mOutStream.write(this.mTmpStream.toByteArray());
        } catch (java.io.IOException e17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
        }
    }

    public void write(short[] sArr, short[] sArr2, int i17, int i18) {
        if (this.mChannels != 2) {
            return;
        }
        if (i17 > i18) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("offset %d is greater than length %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
        }
        while (i17 < i18) {
            writeUnsignedShortLE(this.mTmpStream, sArr[i17]);
            writeUnsignedShortLE(this.mTmpStream, sArr2[i17]);
            this.mBytesWritten += 4;
            i17++;
        }
    }

    public WaveWriter(java.io.File file, int i17, int i18, int i19) {
        this.mOutFile = file;
        this.mSampleRate = i17;
        this.mChannels = i18;
        this.mSampleBits = i19;
    }
}
