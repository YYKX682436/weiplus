package com.tencent.tav.decoder.ofs;

/* loaded from: classes16.dex */
class SeekToMsgArgs {
    public final com.tencent.tav.decoder.ofs.MessageCompletionCallback callback;
    public final boolean quickSeek;
    public final com.tencent.tav.coremedia.CMTime targetTimeInClip;

    public SeekToMsgArgs(com.tencent.tav.coremedia.CMTime cMTime, boolean z17, com.tencent.tav.decoder.ofs.MessageCompletionCallback messageCompletionCallback) {
        this.targetTimeInClip = cMTime;
        this.quickSeek = z17;
        this.callback = messageCompletionCallback;
    }
}
