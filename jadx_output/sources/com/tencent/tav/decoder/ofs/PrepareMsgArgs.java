package com.tencent.tav.decoder.ofs;

/* loaded from: classes16.dex */
class PrepareMsgArgs {
    public final com.tencent.tav.decoder.ofs.MessageCompletionCallback callback;
    public final java.lang.String sourcePath;
    public final com.tencent.tav.core.composition.VideoComposition videoComposition;

    public PrepareMsgArgs(java.lang.String str, com.tencent.tav.core.composition.VideoComposition videoComposition, com.tencent.tav.decoder.ofs.MessageCompletionCallback messageCompletionCallback) {
        this.sourcePath = str;
        this.videoComposition = videoComposition;
        this.callback = messageCompletionCallback;
    }
}
