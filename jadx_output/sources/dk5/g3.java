package dk5;

/* loaded from: classes9.dex */
public class g3 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f234635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234636b;

    public g3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, android.content.Intent intent) {
        this.f234636b = selectConversationUI;
        this.f234635a = intent;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234636b;
        selectConversationUI.hideVKB();
        android.content.Intent intent = this.f234635a;
        if (!z17) {
            int i18 = com.tencent.mm.ui.transmit.SelectConversationUI.B2;
            selectConversationUI.a8(0, intent);
            if (selectConversationUI.f210991k2) {
                selectConversationUI.finish();
                return;
            }
            return;
        }
        selectConversationUI.f211012y2 = str;
        intent.putExtra("custom_send_text", str);
        intent.putExtra("KSendGroupToDo", selectConversationUI.f210990j2);
        intent.putExtra("KShowTodoIntroduceView", selectConversationUI.f210989i2);
        selectConversationUI.a8(-1, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "onDialogClick: native game card forward click ok.");
        selectConversationUI.finish();
    }
}
