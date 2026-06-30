package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes7.dex */
public final class v extends com.tencent.matrix.lifecycle.h {
    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mm.plugin.webview.webcompt.f1.f187804l.removeMessages(1);
        pm0.v.X(com.tencent.mm.plugin.webview.webcompt.u.f187934d);
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mm.plugin.webview.webcompt.f1.f187804l.sendEmptyMessageDelayed(1, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }
}
