package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class m1 extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f152673d;

    public m1() {
        super(0);
        this.f152673d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.SyncOfflineTokenEvent syncOfflineTokenEvent = (com.tencent.mm.autogen.events.SyncOfflineTokenEvent) iEvent;
        if (gm0.j1.a() && (syncOfflineTokenEvent instanceof com.tencent.mm.autogen.events.SyncOfflineTokenEvent)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SyncOfflineTokenListener", "SyncOfflineTokenListener -> updateToken()");
            am.gy gyVar = syncOfflineTokenEvent.f54875g;
            boolean z17 = gyVar.f6798a;
            boolean z18 = gyVar.f6799b == 1;
            if (z18) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(135L, 25L, 1L, true);
            }
            if (z17) {
                this.f152673d.postDelayed(new com.tencent.mm.plugin.offline.ui.k1(this, syncOfflineTokenEvent, z18), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            } else {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.offline.ui.l1(this, syncOfflineTokenEvent, z18));
            }
        }
        return false;
    }
}
