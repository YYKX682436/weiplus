package gu1;

/* loaded from: classes15.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI f275912d;

    public r(com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI shareCardListUI) {
        this.f275912d = shareCardListUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI shareCardListUI = this.f275912d;
        shareCardListUI.R = false;
        if (shareCardListUI.isFinishing()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ShareCardListUI", "Activity is finished!!!");
        } else {
            shareCardListUI.p7();
        }
    }
}
