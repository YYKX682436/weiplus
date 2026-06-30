package dk5;

/* loaded from: classes9.dex */
public class l4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234724d;

    public l4(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI) {
        this.f234724d = selectConversationUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234724d;
        super/*com.tencent.mm.ui.contact.MMBaseSelectContactUI*/.p7();
        selectConversationUI.hideVKB();
    }
}
