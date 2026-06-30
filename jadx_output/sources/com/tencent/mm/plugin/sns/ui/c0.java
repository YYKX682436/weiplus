package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class c0 implements com.tencent.mm.plugin.sns.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ArtistBrowseUI f168066a;

    public c0(com.tencent.mm.plugin.sns.ui.ArtistBrowseUI artistBrowseUI) {
        this.f168066a = artistBrowseUI;
    }

    @Override // com.tencent.mm.plugin.sns.ui.a4
    public void a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClickDetail", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClickDetail", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
    }

    @Override // com.tencent.mm.plugin.sns.ui.a4
    public void b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRemoveItem", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRemoveItem", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
    }

    @Override // com.tencent.mm.plugin.sns.ui.a4
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
        com.tencent.mm.plugin.sns.ui.ArtistBrowseUI artistBrowseUI = this.f168066a;
        r45.jj4 cntMedia = artistBrowseUI.f166810o.getCntMedia();
        if (cntMedia == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ArtistBrowseUI", "set bg the meida id " + cntMedia.f377855d + " path:");
        m21.w.d(723);
        if (!com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), cntMedia.f377855d) + ca4.z0.J(cntMedia))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
            return;
        }
        com.tencent.mm.plugin.sns.model.l4.Nj().p(cntMedia);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(artistBrowseUI, com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI.class);
        intent.setFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        intent.addFlags(67108864);
        com.tencent.mm.plugin.sns.ui.ArtistBrowseUI artistBrowseUI2 = this.f168066a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(artistBrowseUI2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistBrowseUI$2", "onSetBgFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        artistBrowseUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(artistBrowseUI2, "com/tencent/mm/plugin/sns/ui/ArtistBrowseUI$2", "onSetBgFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        artistBrowseUI.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
    }
}
