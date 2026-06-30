package com.tencent.mm.plugin.game.model.silent_download;

/* loaded from: classes8.dex */
public class o extends com.tencent.mm.app.s2 {
    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent gameSilentDownloadNotifyEvent = new com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent();
            gameSilentDownloadNotifyEvent.f54371g.f8454a = 1;
            gameSilentDownloadNotifyEvent.e();
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent gameSilentDownloadNotifyEvent = new com.tencent.mm.autogen.events.GameSilentDownloadNotifyEvent();
            gameSilentDownloadNotifyEvent.f54371g.f8454a = 2;
            gameSilentDownloadNotifyEvent.e();
        }
    }
}
