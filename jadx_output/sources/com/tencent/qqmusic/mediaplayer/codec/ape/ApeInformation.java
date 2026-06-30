package com.tencent.qqmusic.mediaplayer.codec.ape;

/* loaded from: classes13.dex */
public class ApeInformation extends com.tencent.qqmusic.mediaplayer.AudioInformation {
    private java.lang.String album;
    private int apeFileVersion;
    private java.lang.String artist;
    private long blocks;
    private int compressionLevel;
    private int frames;
    private java.lang.String title;
    private java.lang.String writer;

    public java.lang.String getAlbum() {
        return this.album;
    }

    public java.lang.String getArtist() {
        return this.artist;
    }

    public long getBlocks() {
        return this.blocks;
    }

    public int getCompressionLevel() {
        return this.compressionLevel;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public java.lang.String getWriter() {
        return this.writer;
    }

    public void setAlbum(java.lang.String str) {
        this.album = str;
    }

    public void setArtist(java.lang.String str) {
        this.artist = str;
    }

    public void setBlocks(long j17) {
        this.blocks = j17;
    }

    public void setTitle(java.lang.String str) {
        this.title = str;
    }

    public void setWriter(java.lang.String str) {
        this.writer = str;
    }
}
