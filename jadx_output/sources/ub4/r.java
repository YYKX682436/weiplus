package ub4;

/* loaded from: classes4.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI f426196d;

    public r(com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI snsAlbumUI) {
        this.f426196d = snsAlbumUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$1");
        int i17 = com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI.f167760t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI snsAlbumUI = this.f426196d;
        ub4.i iVar = snsAlbumUI.f167764g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        if (iVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
            ub4.i iVar2 = snsAlbumUI.f167764g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
            iVar2.z();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
            ub4.i iVar3 = snsAlbumUI.f167764g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
            iVar3.B("");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$1");
    }
}
