package com.tencent.tav.decoder;

/* loaded from: classes14.dex */
public class VideoCropInfo {
    public int width = -1;
    public int height = -1;
    public int cropLeft = -1;
    public int cropTop = -1;
    public int cropRight = -1;
    public int cropBottom = -1;

    public boolean hasCrop() {
        return this.cropLeft >= 0 && this.cropTop >= 0 && this.cropRight >= 0 && this.cropBottom >= 0;
    }

    public java.lang.String toString() {
        return "VideoCropInfo{width=" + this.width + ", height=" + this.height + ", cropLeft=" + this.cropLeft + ", cropTop=" + this.cropTop + ", cropRight=" + this.cropRight + ", cropBottom=" + this.cropBottom + '}';
    }
}
