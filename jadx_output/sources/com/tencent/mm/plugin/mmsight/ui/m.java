package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public final class m implements com.tencent.mm.plugin.mmsight.ui.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton f149365a;

    public m(com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton improveMMSightRecordButton) {
        this.f149365a = improveMMSightRecordButton;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.b2
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMMSightRecordButton", "onProgressFinish >> progress is reach maxProgress");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.mmsight.ui.ImproveMMSightRecordButton improveMMSightRecordButton = this.f149365a;
        improveMMSightRecordButton.H = currentTimeMillis;
        if (!(improveMMSightRecordButton.f149162u && currentTimeMillis - improveMMSightRecordButton.G >= 1500)) {
            improveMMSightRecordButton.d(new com.tencent.mm.plugin.mmsight.ui.l(improveMMSightRecordButton, z17));
            return;
        }
        improveMMSightRecordButton.f();
        com.tencent.mm.plugin.mmsight.ui.b2 b2Var = improveMMSightRecordButton.F;
        if (b2Var != null) {
            b2Var.a(z17);
        }
    }
}
