package dk5;

/* loaded from: classes9.dex */
public class e4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234606d;

    public e4(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI) {
        this.f234606d = selectConversationUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234606d;
        if (selectConversationUI.f211001r2 && selectConversationUI.E1) {
            return true;
        }
        selectConversationUI.E1 = !selectConversationUI.E1;
        selectConversationUI.b7().q(selectConversationUI.E1);
        selectConversationUI.f206449g.q(selectConversationUI.E1);
        selectConversationUI.e8();
        if (selectConversationUI.E1) {
            selectConversationUI.setMMTitle(selectConversationUI.getString(com.tencent.mm.R.string.ig6));
        } else {
            selectConversationUI.setMMTitle(selectConversationUI.getString(com.tencent.mm.R.string.ig9));
        }
        selectConversationUI.d8();
        selectConversationUI.getClass();
        if (selectConversationUI.E1 && selectConversationUI.H1) {
            com.tencent.mm.modelstat.b.b(selectConversationUI.S1, 7);
        }
        return true;
    }
}
