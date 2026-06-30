package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes13.dex */
public class FloatBufferInfo {
    public int bufferSize;
    public float[] floatBuffer;
    public float[] tempFloatBuffer;

    public void appendFloat(float[] fArr, int i17, int i18) {
        if (fArr == null || i17 < 0 || i18 <= 0 || i17 + i18 > fArr.length) {
            return;
        }
        setFloatBufferCapacity(this.bufferSize + i18);
        java.lang.System.arraycopy(fArr, i17, this.floatBuffer, this.bufferSize, i18);
    }

    public com.tencent.qqmusic.mediaplayer.FloatBufferInfo copy(com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo) {
        floatBufferInfo.bufferSize = this.bufferSize;
        floatBufferInfo.floatBuffer = this.floatBuffer;
        floatBufferInfo.tempFloatBuffer = this.tempFloatBuffer;
        return floatBufferInfo;
    }

    public void fillFloat(float[] fArr, int i17) {
        if (fArr == null || i17 <= 0 || i17 > fArr.length) {
            return;
        }
        this.floatBuffer = fArr;
        this.bufferSize = i17;
    }

    public void setFloatBufferCapacity(int i17) {
        float[] fArr = this.floatBuffer;
        if (fArr == null || fArr.length < i17) {
            this.floatBuffer = new float[i17];
        }
    }

    public void setTempFloatBufferCapacity(int i17) {
        float[] fArr = this.tempFloatBuffer;
        if (fArr == null || fArr.length < i17) {
            this.tempFloatBuffer = new float[i17];
        }
    }
}
