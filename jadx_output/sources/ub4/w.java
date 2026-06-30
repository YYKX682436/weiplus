package ub4;

/* loaded from: classes4.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI f426201d;

    public w(com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI snsAlbumUI) {
        this.f426201d = snsAlbumUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$6");
        int i17 = com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI.f167760t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI snsAlbumUI = this.f426201d;
        boolean z17 = snsAlbumUI.f167770p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsAlbumUI", "too fast that it finish");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$6");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        com.tencent.mm.plugin.sns.model.d6 d6Var = snsAlbumUI.f167771q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        d6Var.w(10, com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI.l0(snsAlbumUI), snsAlbumUI);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        com.tencent.mm.plugin.sns.model.d6 d6Var2 = snsAlbumUI.f167771q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        java.lang.String l07 = com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI.l0(snsAlbumUI);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        int i18 = snsAlbumUI.f167769o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        d6Var2.e(10, l07, false, true, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$6");
    }
}
