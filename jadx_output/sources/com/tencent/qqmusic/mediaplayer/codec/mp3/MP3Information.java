package com.tencent.qqmusic.mediaplayer.codec.mp3;

/* loaded from: classes13.dex */
public class MP3Information extends com.tencent.qqmusic.mediaplayer.AudioInformation {
    private int bitratemode;
    private int encoding;
    private java.lang.String error;
    private long fileLengthInBytes;
    private long firstFramePos;
    private long firstFrameSize;
    private long id3v2Size;
    private int layer;
    private long[] mTocTable;
    private int mpeg_version;
    private boolean success = false;

    public int getBitratemode() {
        return this.bitratemode;
    }

    public int getEncoding() {
        return this.encoding;
    }

    public java.lang.String getError() {
        return this.error;
    }

    public long getFileLengthInBytes() {
        return this.fileLengthInBytes;
    }

    public long getFirstFramePos() {
        return this.firstFramePos;
    }

    public long getFirstFrameSize() {
        return this.firstFrameSize;
    }

    public long getId3v2Size() {
        return this.id3v2Size;
    }

    public int getLayer() {
        return this.layer;
    }

    public int getMpeg_version() {
        return this.mpeg_version;
    }

    public long[] getTocTable() {
        return this.mTocTable;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setBitratemode(int i17) {
        this.bitratemode = i17;
    }

    public void setEncoding(int i17) {
        this.encoding = i17;
    }

    public void setError(java.lang.String str) {
        this.error = str;
    }

    public void setSuccess(boolean z17) {
        this.success = z17;
    }

    public void setTocTable(long[] jArr) {
        this.mTocTable = jArr;
    }
}
