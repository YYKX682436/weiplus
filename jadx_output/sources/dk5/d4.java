package dk5;

/* loaded from: classes9.dex */
public class d4 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f234590a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234591b;

    public d4(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, android.content.Intent intent) {
        this.f234591b = selectConversationUI;
        this.f234590a = intent;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234591b;
        selectConversationUI.hideVKB();
        if (!z17) {
            int i18 = selectConversationUI.L1;
            if ((10 == i18 || 13 == i18) && selectConversationUI.H1) {
                com.tencent.mm.modelstat.b.b(selectConversationUI.S1, 10);
                return;
            }
            return;
        }
        selectConversationUI.f211012y2 = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectConversationUI", "MicroMsg.SelectConversationUI", "onDialogClick: multiselect forward click ok ");
        selectConversationUI.W7();
        android.content.Intent intent = this.f234590a;
        intent.putExtra("custom_send_text", str);
        selectConversationUI.a8(-1, intent);
        selectConversationUI.finish();
        int i19 = selectConversationUI.L1;
        if ((10 == i19 || 13 == i19) && selectConversationUI.H1) {
            com.tencent.mm.modelstat.b.b(selectConversationUI.S1, 9);
        }
    }
}
