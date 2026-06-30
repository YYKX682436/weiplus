package td4;

/* loaded from: classes4.dex */
public final class g1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI f417682d;

    public g1(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f417682d = snsAlbumPickerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initActionBar$1");
        kotlin.jvm.internal.o.g(it, "it");
        this.f417682d.onBackPressed();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initActionBar$1");
        return true;
    }
}
