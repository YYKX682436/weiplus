package com.tencent.mm.plugin.voip.model;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class NewVoipMgr$13 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ShortcutVoipControllerEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.d0 f176300d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewVoipMgr$13(com.tencent.mm.plugin.voip.model.d0 d0Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f176300d = d0Var;
        this.__eventId = 635809864;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.ShortcutVoipControllerEvent shortcutVoipControllerEvent) {
        final com.tencent.mm.autogen.events.ShortcutVoipControllerEvent shortcutVoipControllerEvent2 = shortcutVoipControllerEvent;
        if (shortcutVoipControllerEvent2 == null) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.voip.model.NewVoipMgr$13$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.voip.model.NewVoipMgr$13 newVoipMgr$13 = com.tencent.mm.plugin.voip.model.NewVoipMgr$13.this;
                com.tencent.mm.autogen.events.ShortcutVoipControllerEvent shortcutVoipControllerEvent3 = shortcutVoipControllerEvent2;
                newVoipMgr$13.getClass();
                int i17 = shortcutVoipControllerEvent3.f54778g.f7366a;
                if (i17 == 1) {
                    if (vq4.n0.g(newVoipMgr$13.f176300d.f176374e.f439369a)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipMgr", "video mode not allow ti response accept");
                        return;
                    }
                    nq4.f fVar = nq4.f.f339014a;
                    if (!nq4.f.f339019f) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipMgr", "current has not broadcast coming message,not allow to response accept");
                        return;
                    }
                    jq4.c1 c1Var = gq4.v.Bi().f176581x;
                    if (c1Var.f301233b) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipService", "recalledVoipResumeByShortCut ");
                        com.tencent.mars.xlog.Log.i("MircoMsg.VoipFloatCardManager", "AcceptByShortCut " + c1Var.f301237f);
                        android.content.Intent intent = c1Var.f301237f;
                        if (intent != null) {
                            c1Var.k(intent);
                        }
                    }
                    com.tencent.mm.plugin.voip.model.d0 d0Var = newVoipMgr$13.f176300d;
                    int i18 = d0Var.f176389t;
                    long j17 = d0Var.f176390u;
                    long j18 = d0Var.f176391v;
                    boolean a17 = fVar.a();
                    com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct voIPShortcutAnswerReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct();
                    voIPShortcutAnswerReportStruct.f61673d = i18;
                    voIPShortcutAnswerReportStruct.f61674e = j17;
                    voIPShortcutAnswerReportStruct.f61675f = (int) j18;
                    voIPShortcutAnswerReportStruct.f61676g = a17 ? 1 : 0;
                    voIPShortcutAnswerReportStruct.f61677h = 1;
                    voIPShortcutAnswerReportStruct.f61678i = 0;
                    voIPShortcutAnswerReportStruct.o();
                    voIPShortcutAnswerReportStruct.k();
                    d0Var.g0();
                    return;
                }
                if (i17 != 2) {
                    return;
                }
                if (vq4.n0.e(newVoipMgr$13.f176300d.c0())) {
                    nq4.f fVar2 = nq4.f.f339014a;
                    if (!nq4.f.f339019f) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipMgr", "current has not broadcast coming message,not allow to response reject ");
                        return;
                    }
                    com.tencent.mm.plugin.voip.model.d0 d0Var2 = newVoipMgr$13.f176300d;
                    boolean g17 = vq4.n0.g(d0Var2.f176374e.f439369a);
                    int i19 = d0Var2.f176389t;
                    long j19 = d0Var2.f176390u;
                    long j27 = d0Var2.f176391v;
                    boolean a18 = fVar2.a();
                    com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct voIPShortcutAnswerReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct();
                    voIPShortcutAnswerReportStruct2.f61673d = i19;
                    voIPShortcutAnswerReportStruct2.f61674e = j19;
                    voIPShortcutAnswerReportStruct2.f61675f = (int) j27;
                    voIPShortcutAnswerReportStruct2.f61676g = a18 ? 1 : 0;
                    voIPShortcutAnswerReportStruct2.f61677h = 1;
                    voIPShortcutAnswerReportStruct2.f61678i = 2;
                    voIPShortcutAnswerReportStruct2.o();
                    voIPShortcutAnswerReportStruct2.k();
                    d0Var2.y0(g17);
                    return;
                }
                if (vq4.n0.f(newVoipMgr$13.f176300d.c0())) {
                    com.tencent.mm.plugin.voip.model.d0 d0Var3 = newVoipMgr$13.f176300d;
                    boolean z17 = d0Var3.f176388s;
                    int i27 = d0Var3.f176389t;
                    long j28 = d0Var3.f176390u;
                    long j29 = d0Var3.f176391v;
                    boolean a19 = nq4.f.f339014a.a();
                    com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct voIPShortcutAnswerReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct();
                    voIPShortcutAnswerReportStruct3.f61673d = i27;
                    voIPShortcutAnswerReportStruct3.f61674e = j28;
                    voIPShortcutAnswerReportStruct3.f61675f = (int) j29;
                    voIPShortcutAnswerReportStruct3.f61676g = a19 ? 1 : 0;
                    voIPShortcutAnswerReportStruct3.f61677h = 1;
                    voIPShortcutAnswerReportStruct3.f61678i = 5;
                    voIPShortcutAnswerReportStruct3.o();
                    voIPShortcutAnswerReportStruct3.k();
                    d0Var3.j0(z17);
                    return;
                }
                com.tencent.mm.plugin.voip.model.d0 d0Var4 = newVoipMgr$13.f176300d;
                int i28 = d0Var4.f176389t;
                long j37 = d0Var4.f176390u;
                long j38 = d0Var4.f176391v;
                boolean a27 = nq4.f.f339014a.a();
                boolean z18 = d0Var4.f176387r;
                com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct voIPShortcutAnswerReportStruct4 = new com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct();
                voIPShortcutAnswerReportStruct4.f61673d = i28;
                voIPShortcutAnswerReportStruct4.f61674e = j37;
                voIPShortcutAnswerReportStruct4.f61675f = (int) j38;
                voIPShortcutAnswerReportStruct4.f61676g = a27 ? 1 : 0;
                voIPShortcutAnswerReportStruct4.f61677h = 1;
                voIPShortcutAnswerReportStruct4.f61678i = z18 ? 6 : 1;
                voIPShortcutAnswerReportStruct4.o();
                voIPShortcutAnswerReportStruct4.k();
                d0Var4.s0();
            }
        });
        return false;
    }
}
