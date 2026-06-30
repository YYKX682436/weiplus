package com.tencent.thumbplayer.tmediacodec.reuse;

/* loaded from: classes14.dex */
public final class ReusePolicy {
    public static final com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy DEFAULT = new com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy(1920, 1920);
    public static final int DEFAULT_INIT_HEIGHT = 1920;
    public static final int DEFAULT_INIT_WIDTH = 1920;
    public int initHeight;
    public int initWidth;
    public boolean reConfigByRealFormat = true;
    public com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy.EraseType eraseType = com.tencent.thumbplayer.tmediacodec.reuse.ReusePolicy.EraseType.First;

    /* loaded from: classes6.dex */
    public enum EraseType {
        First,
        SAME
    }

    public ReusePolicy(int i17, int i18) {
        this.initWidth = i17;
        this.initHeight = i18;
    }

    public java.lang.String toString() {
        return "[initWidth:" + this.initWidth + ", initHeight:" + this.initHeight + ", reConfigByRealFormat:" + this.reConfigByRealFormat + ']';
    }
}
