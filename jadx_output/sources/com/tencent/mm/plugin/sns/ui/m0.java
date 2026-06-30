package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ArtistUI f169884d;

    public m0(com.tencent.mm.plugin.sns.ui.ArtistUI artistUI) {
        this.f169884d = artistUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.ArtistUI$2");
        com.tencent.mm.plugin.sns.ui.ArtistUI artistUI = this.f169884d;
        if (com.tencent.mm.plugin.sns.ui.ArtistUI.T6(artistUI) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.ArtistUI$2");
            return;
        }
        com.tencent.mm.plugin.sns.model.l4.hj().m0();
        com.tencent.mm.plugin.sns.ui.ArtistUI.T6(artistUI).notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.ArtistUI$2");
    }
}
