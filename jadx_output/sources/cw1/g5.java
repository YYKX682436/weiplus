package cw1;

/* loaded from: classes11.dex */
public final class g5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI f222950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingTabsUI f222951e;

    public g5(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI, com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingTabsUI cleanChattingTabsUI) {
        this.f222950d = cleanChattingBaseUI;
        this.f222951e = cleanChattingTabsUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent resultData;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = this.f222950d;
        if (cleanChattingBaseUI.getResultCode() == -1 && (resultData = cleanChattingBaseUI.getResultData()) != null) {
            long longExtra = resultData.getLongExtra("tds", 0L);
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingTabsUI cleanChattingTabsUI = this.f222951e;
            cleanChattingTabsUI.f95759d += longExtra;
            cleanChattingTabsUI.setResult(-1, new android.content.Intent().putExtra("tds", cleanChattingTabsUI.f95759d));
        }
    }
}
