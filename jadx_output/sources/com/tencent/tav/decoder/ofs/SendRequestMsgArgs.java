package com.tencent.tav.decoder.ofs;

/* loaded from: classes16.dex */
class SendRequestMsgArgs {
    public final com.tencent.tav.decoder.ofs.DecodeCallback callback;
    public final com.tencent.tav.coremedia.CMTime targetTimeInClip;

    public SendRequestMsgArgs(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.decoder.ofs.DecodeCallback decodeCallback) {
        this.targetTimeInClip = cMTime;
        this.callback = decodeCallback;
    }
}
