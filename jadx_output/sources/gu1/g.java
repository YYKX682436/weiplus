package gu1;

/* loaded from: classes15.dex */
public class g implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI f275888d;

    public g(com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI cardConsumeSuccessUI) {
        this.f275888d = cardConsumeSuccessUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI cardConsumeSuccessUI = this.f275888d;
        cardConsumeSuccessUI.finish();
        int i17 = com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI.F;
        cardConsumeSuccessUI.V6(0);
        return true;
    }
}
