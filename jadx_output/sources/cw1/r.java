package cw1;

/* loaded from: classes3.dex */
public final class r implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f223278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI f223279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f223280f;

    public r(java.util.ArrayList arrayList, com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI, yz5.a aVar) {
        this.f223278d = arrayList;
        this.f223279e = cleanAllMessagesUI;
        this.f223280f = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() != 0) {
            this.f223280f.invoke();
            return;
        }
        java.util.ArrayList<java.lang.String> arrayList = this.f223278d;
        int size = arrayList.size();
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI = this.f223279e;
        if (size > 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putStringArrayListExtra("key_conversation_list", arrayList);
            j45.l.u(cleanAllMessagesUI, ".ui.conversation.SettingCheckUnProcessWalletConvUI", intent, null);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Chat_User", arrayList.get(0));
            intent2.addFlags(67108864);
            j45.l.u(cleanAllMessagesUI, ".ui.chatting.ChattingUI", intent2, null);
        }
    }
}
