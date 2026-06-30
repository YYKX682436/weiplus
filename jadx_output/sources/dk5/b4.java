package dk5;

/* loaded from: classes9.dex */
public class b4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234528d;

    public b4(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI) {
        this.f234528d = selectConversationUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234528d;
        if (itemId == 1) {
            com.tencent.mm.ui.transmit.SelectConversationUI.w7(selectConversationUI, com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeWxwork);
        } else {
            if (itemId != 2) {
                return;
            }
            com.tencent.mm.ui.transmit.SelectConversationUI.w7(selectConversationUI, com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeLocal);
        }
    }
}
