package com.tencent.tav.decoder.decodecache;

/* loaded from: classes16.dex */
class CacheSegment {
    public volatile java.util.List<com.tencent.tav.decoder.decodecache.CacheFrame> cacheFrameList = new java.util.ArrayList();
    public volatile com.tencent.tav.coremedia.CMTimeRange segmentTimeRange;

    public CacheSegment(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.segmentTimeRange = null;
        this.segmentTimeRange = cMTimeRange;
    }

    private boolean isCacheFrameUsable(com.tencent.tav.decoder.decodecache.CacheFrame cacheFrame) {
        com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer = cacheFrame.sampleBuffer;
        return (cMSampleBuffer == null || cMSampleBuffer.getTextureInfo() == null) ? false : true;
    }

    public void clear() {
        for (com.tencent.tav.decoder.decodecache.CacheFrame cacheFrame : this.cacheFrameList) {
            if (isCacheFrameUsable(cacheFrame)) {
                cacheFrame.texturePool.pushTexture(cacheFrame.sampleBuffer.getTextureInfo());
                cacheFrame.sampleBuffer = null;
            }
        }
        this.cacheFrameList.clear();
    }

    public com.tencent.tav.coremedia.CMTime getLastFrameTime() {
        return this.cacheFrameList.size() > 0 ? this.cacheFrameList.get(this.cacheFrameList.size() - 1).frameTime : this.segmentTimeRange.getEnd();
    }

    public com.tencent.tav.decoder.decodecache.CacheFrame popFrame(com.tencent.tav.coremedia.CMTime cMTime) {
        while (this.cacheFrameList.size() > 0) {
            com.tencent.tav.decoder.decodecache.CacheFrame cacheFrame = this.cacheFrameList.get(0);
            if (!cacheFrame.frameTime.smallThan(cMTime)) {
                return this.cacheFrameList.get(0);
            }
            if (isCacheFrameUsable(cacheFrame)) {
                com.tencent.tav.decoder.ITexturePool iTexturePool = cacheFrame.texturePool;
                if (iTexturePool == null) {
                    cacheFrame.sampleBuffer.getTextureInfo().release();
                } else {
                    iTexturePool.pushTexture(cacheFrame.sampleBuffer.getTextureInfo());
                }
                cacheFrame.sampleBuffer = null;
            }
            this.cacheFrameList.remove(0);
        }
        return null;
    }

    public void pushFrame(com.tencent.tav.decoder.decodecache.CacheFrame cacheFrame) {
        for (int i17 = 0; i17 < this.cacheFrameList.size(); i17++) {
            if (this.cacheFrameList.get(i17).frameTime.bigThan(cacheFrame.frameTime)) {
                this.cacheFrameList.add(i17, cacheFrame);
                return;
            }
        }
        this.cacheFrameList.add(cacheFrame);
    }
}
