package ub4;

/* loaded from: classes4.dex */
public class v extends ub4.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI f426200d;

    public v(com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI snsAlbumUI) {
        this.f426200d = snsAlbumUI;
    }

    @Override // ub4.q
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoadMore", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$5");
        int i17 = com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI.f167760t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI snsAlbumUI = this.f426200d;
        com.tencent.mm.plugin.sns.model.d6 d6Var = snsAlbumUI.f167771q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        java.lang.String l07 = com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI.l0(snsAlbumUI);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        int i18 = snsAlbumUI.f167769o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        d6Var.f(10, l07, false, true, i18);
        com.tencent.mm.sdk.platformtools.n3 Tj = com.tencent.mm.plugin.sns.model.l4.Tj();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        java.lang.Runnable runnable = snsAlbumUI.f167773s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI");
        Tj.postDelayed(runnable, 3000L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoadMore", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$5");
    }
}
