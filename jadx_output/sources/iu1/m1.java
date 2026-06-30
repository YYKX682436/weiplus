package iu1;

/* loaded from: classes.dex */
public final class m1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardTicketListUI f294922d;

    public m1(com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI) {
        this.f294922d = cardTicketListUI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "click history wording");
            android.content.Intent intent = new android.content.Intent(this.f294922d, (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI.class);
            com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI = this.f294922d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(cardTicketListUI, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v2/CardTicketListUI$updateTextMenu$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            cardTicketListUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(cardTicketListUI, "com/tencent/mm/plugin/card/ui/v2/CardTicketListUI$updateTextMenu$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 8);
        }
    }
}
