package com.tencent.tav.decoder.decodecache;

/* loaded from: classes16.dex */
class DecoderFrameMsg {
    final java.util.concurrent.CountDownLatch finishWait;
    final com.tencent.tav.coremedia.CMTime time;

    public DecoderFrameMsg(com.tencent.tav.coremedia.CMTime cMTime, java.util.concurrent.CountDownLatch countDownLatch) {
        this.time = cMTime;
        this.finishWait = countDownLatch;
    }
}
