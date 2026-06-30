package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes7.dex */
public final class y extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f187948d;

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        pm0.v.V(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, new com.tencent.mm.plugin.webview.webcompt.w(this));
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        pm0.v.X(new com.tencent.mm.plugin.webview.webcompt.x(this));
    }
}
