package ub4;

/* loaded from: classes4.dex */
public class s implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI f426197d;

    public s(com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI snsAlbumUI) {
        this.f426197d = snsAlbumUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$2");
        com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI snsAlbumUI = this.f426197d;
        if (snsAlbumUI.getActivity() != null) {
            snsAlbumUI.getActivity().finish();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$2");
        return true;
    }
}
