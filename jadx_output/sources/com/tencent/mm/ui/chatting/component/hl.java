package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class hl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f199172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f199173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.SilenceMsgComponent$1 f199175g;

    public hl(com.tencent.mm.ui.chatting.component.SilenceMsgComponent$1 silenceMsgComponent$1, int i17, int i18, java.lang.String str) {
        this.f199175g = silenceMsgComponent$1;
        this.f199172d = i17;
        this.f199173e = i18;
        this.f199174f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        int i17 = this.f199172d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = this.f199173e;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr SilenceNotifyEvent in chatting lastSeq[%d], undeliverCount[%d]", valueOf, java.lang.Integer.valueOf(i18));
        long j18 = i17;
        long j19 = i18;
        long V5 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().V5(this.f199174f);
        if (V5 <= 0 || V5 >= j18) {
            j17 = j18;
        } else {
            j19 = (V5 - V5) - 1;
            j17 = V5;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SilenceMsgComponent", "summerbadcr SilenceNotifyEvent in chatting down [%d, %d, %d, %d]", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(V5), java.lang.Long.valueOf(j19 > 0 ? j19 : 1L));
        this.f199175g.f198567d.getClass();
    }
}
