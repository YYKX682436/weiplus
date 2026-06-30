package dk5;

/* loaded from: classes9.dex */
public class g4 implements com.tencent.mm.ui.contact.item.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234637a;

    public g4(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI) {
        this.f234637a = selectConversationUI;
    }

    @Override // com.tencent.mm.ui.contact.item.e1
    public void a() {
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234637a;
        if (selectConversationUI.E1) {
            selectConversationUI.E7();
        } else {
            selectConversationUI.D7();
        }
    }

    @Override // com.tencent.mm.ui.contact.item.e1
    public void b() {
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234637a;
        if (selectConversationUI.f210999p2) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SelectConversationUI", "onClickForwardToWeWork:isForbidSendToWeWork ");
            return;
        }
        boolean z17 = selectConversationUI.f211006w2;
        if (z17 && selectConversationUI.f211009x2) {
            selectConversationUI.getClass();
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) selectConversationUI, 1, false);
            k0Var.f211872n = new dk5.a4(selectConversationUI);
            k0Var.f211881s = new dk5.b4(selectConversationUI);
            k0Var.v();
            return;
        }
        if (z17) {
            com.tencent.mm.ui.transmit.SelectConversationUI.w7(selectConversationUI, com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeWxwork);
        } else if (selectConversationUI.f211009x2) {
            com.tencent.mm.ui.transmit.SelectConversationUI.w7(selectConversationUI, com.tencent.wework.api.IWWAPI.WWAppType.WwAppTypeLocal);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.SelectConversationUI", "onClickForwardToWeWork: don't support");
        }
    }
}
