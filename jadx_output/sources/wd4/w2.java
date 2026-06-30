package wd4;

/* loaded from: classes4.dex */
public final class w2 implements wd4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity f445054a;

    public w2(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f445054a = snsOnlineVideoActivity;
    }

    @Override // wd4.b
    public final com.tencent.mm.ui.widget.dialog.k0 provide() {
        com.tencent.mm.ui.widget.dialog.k0 d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$1");
        com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity = this.f445054a;
        snsOnlineVideoActivity.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        wd4.l1 l1Var = snsOnlineVideoActivity.f167328u;
        if (l1Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineVideoActivity", "getBottomSheet, mShareSheet is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            d17 = null;
        } else {
            d17 = l1Var.d();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$1");
        return d17;
    }
}
