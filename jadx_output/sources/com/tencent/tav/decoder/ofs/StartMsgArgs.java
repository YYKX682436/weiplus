package com.tencent.tav.decoder.ofs;

/* loaded from: classes16.dex */
class StartMsgArgs {
    public final com.tencent.tav.decoder.ofs.MessageCompletionCallback callback;
    public final com.tencent.tav.coremedia.CMTime start;
    public final com.tencent.tav.coremedia.CMTimeRange timeRange;

    public StartMsgArgs(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.decoder.ofs.MessageCompletionCallback messageCompletionCallback) {
        this.timeRange = cMTimeRange;
        this.start = cMTime;
        this.callback = messageCompletionCallback;
    }
}
