package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

/* loaded from: classes16.dex */
public class Ftyp extends com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box {
    int[] compatibleBrands;
    int majorBrand;
    int minorVersion;

    @Override // com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box
    public void parse(com.tencent.qqmusic.mediaplayer.seektable.Parsable parsable, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box box) {
        super.parse(parsable, box);
        this.majorBrand = parsable.readInt();
        this.minorVersion = parsable.readInt();
        int available = ((int) parsable.available()) / 4;
        if (available > 0) {
            this.compatibleBrands = parsable.readIntArray(available);
        }
    }
}
