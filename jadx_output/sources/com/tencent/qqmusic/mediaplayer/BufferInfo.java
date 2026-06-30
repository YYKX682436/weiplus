package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes16.dex */
public class BufferInfo {
    public int bufferSize;
    public byte[] byteBuffer;
    public byte[] tempByteBuffer;

    public void appendByte(byte[] bArr, int i17, int i18) {
        if (bArr == null || i17 < 0 || i18 <= 0 || i17 + i18 > bArr.length) {
            return;
        }
        setByteBufferCapacity(this.bufferSize + i18);
        java.lang.System.arraycopy(bArr, i17, this.byteBuffer, this.bufferSize, i18);
    }

    public void fillByte(byte[] bArr, int i17) {
        if (bArr == null || i17 <= 0 || i17 > bArr.length) {
            return;
        }
        this.byteBuffer = bArr;
        this.bufferSize = i17;
    }

    public com.tencent.qqmusic.mediaplayer.BufferInfo fillInto(com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo) {
        bufferInfo.bufferSize = this.bufferSize;
        bufferInfo.byteBuffer = this.byteBuffer;
        bufferInfo.tempByteBuffer = this.tempByteBuffer;
        return bufferInfo;
    }

    public void setByteBufferCapacity(int i17) {
        byte[] bArr = this.byteBuffer;
        if (bArr == null || bArr.length < i17) {
            this.byteBuffer = new byte[i17];
        }
    }

    public void setTempByteBufferCapacity(int i17) {
        byte[] bArr = this.tempByteBuffer;
        if (bArr == null || bArr.length < i17) {
            this.tempByteBuffer = new byte[i17];
        }
    }
}
