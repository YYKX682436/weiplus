package dk5;

/* loaded from: classes9.dex */
public class p2 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234796b;

    public p2(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, java.lang.String str) {
        this.f234796b = selectConversationUI;
        this.f234795a = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234796b;
        selectConversationUI.hideVKB();
        if (z17) {
            selectConversationUI.f211012y2 = str;
            android.content.Intent intent = new android.content.Intent();
            java.lang.String str2 = this.f234795a;
            if (com.tencent.mm.storage.z3.R4(str2)) {
                java.lang.String str3 = selectConversationUI.A1;
                iz5.a.g("cardNameToSend is null", str3 != null);
                intent.putExtra("be_send_card_name", str3);
                intent.putExtra("received_card_name", str2);
                intent.putExtra("Is_Chatroom", true);
            } else {
                java.lang.String str4 = selectConversationUI.A1;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(str2);
                selectConversationUI.Z7(intent, str4, linkedList);
            }
            intent.putExtra("custom_send_text", str);
            selectConversationUI.X7(str2);
            selectConversationUI.a8(-1, intent);
            selectConversationUI.finish();
        }
    }
}
