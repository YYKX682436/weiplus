package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

/* loaded from: classes16.dex */
public interface IMpeg4Box {
    long getSize();

    java.lang.String getType();

    void parse(com.tencent.qqmusic.mediaplayer.seektable.Parsable parsable, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box box);
}
