package com.tencent.qqmusic.mediaplayer.audioplaylist;

/* loaded from: classes13.dex */
public abstract class AudioPlayListItemInfo implements android.os.Parcelable {
    public static int TYPE_CUE = 1;
    public static int TYPE_M3U = 2;
    public static int TYPE_NONE;
    protected int mType = TYPE_NONE;
    protected java.lang.String mUri;

    public int getType() {
        return this.mType;
    }
}
