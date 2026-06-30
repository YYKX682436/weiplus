package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class m3 implements com.tencent.mm.plugin.mmsight.ui.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149369a;

    public m3(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149369a = sightCaptureUI;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.j0
    public void a() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149369a;
        ei3.m mVar = sightCaptureUI.f149235m;
        if (mVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SightCaptureUI", "onSimpleTap, mediaRecorder.status: %s", mVar.t());
            sightCaptureUI.f149235m.cancel();
        }
        ai3.d.x("TIME_RECODER_2_PLAY");
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI.T6(sightCaptureUI);
    }
}
