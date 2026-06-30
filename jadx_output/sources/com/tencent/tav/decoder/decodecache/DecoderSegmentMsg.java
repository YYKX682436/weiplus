package com.tencent.tav.decoder.decodecache;

/* loaded from: classes16.dex */
class DecoderSegmentMsg {
    final com.tencent.tav.decoder.decodecache.RequestStatus callbackObject;
    final com.tencent.tav.decoder.decodecache.CacheSegment segment;

    public DecoderSegmentMsg(com.tencent.tav.decoder.decodecache.CacheSegment cacheSegment, com.tencent.tav.decoder.decodecache.RequestStatus requestStatus) {
        this.segment = cacheSegment;
        this.callbackObject = requestStatus;
    }
}
