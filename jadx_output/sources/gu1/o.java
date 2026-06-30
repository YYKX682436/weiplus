package gu1;

/* loaded from: classes15.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI f275909d;

    public o(com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI shareCardListUI) {
        this.f275909d = shareCardListUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI.T;
        com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI shareCardListUI = this.f275909d;
        shareCardListUI.W6();
        if (shareCardListUI.f94641q == null) {
            shareCardListUI.W6();
        }
        i11.e eVar = shareCardListUI.f94641q;
        if (eVar != null) {
            ((i11.h) eVar).k(shareCardListUI.f94645u, true);
            com.tencent.mm.plugin.report.service.b1.f(22, 10);
        }
        shareCardListUI.P = true;
    }
}
