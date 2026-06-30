package gu1;

/* loaded from: classes15.dex */
public class e implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.sharecard.ui.CardConsumeCodeUI f275886d;

    public e(com.tencent.mm.plugin.card.sharecard.ui.CardConsumeCodeUI cardConsumeCodeUI) {
        this.f275886d = cardConsumeCodeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.card.sharecard.ui.CardConsumeCodeUI cardConsumeCodeUI = this.f275886d;
        cardConsumeCodeUI.setResult(-1);
        cardConsumeCodeUI.finish();
        return true;
    }
}
