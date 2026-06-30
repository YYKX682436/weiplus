package com.tencent.tav.decoder.ofs;

/* loaded from: classes16.dex */
class DecodingFrameSequence implements java.lang.Comparable<com.tencent.tav.decoder.ofs.DecodingFrameSequence> {
    private boolean firstFrameDecoded = false;
    public final com.tencent.tav.coremedia.CMTime ptsInMedia;

    public DecodingFrameSequence(com.tencent.tav.coremedia.CMTime cMTime) {
        this.ptsInMedia = cMTime;
    }

    public boolean isFirstFrameDecoded() {
        return this.firstFrameDecoded;
    }

    public void markFirstFrameDecoded() {
        this.firstFrameDecoded = true;
    }

    @Override // java.lang.Comparable
    public int compareTo(com.tencent.tav.decoder.ofs.DecodingFrameSequence decodingFrameSequence) {
        if (decodingFrameSequence == null) {
            return -1;
        }
        return this.ptsInMedia.compare(decodingFrameSequence.ptsInMedia);
    }
}
