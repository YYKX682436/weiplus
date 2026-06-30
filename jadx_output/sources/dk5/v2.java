package dk5;

/* loaded from: classes9.dex */
public class v2 implements dk5.o7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f234957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234958b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234959c;

    public v2(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, android.content.Intent intent, java.lang.String str) {
        this.f234959c = selectConversationUI;
        this.f234957a = intent;
        this.f234958b = str;
    }

    @Override // dk5.o7
    public void a(boolean z17, java.lang.String str, int i17, boolean z18) {
        android.content.Intent intent = this.f234957a;
        intent.putExtra("KSendGroupToDo", z18);
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234959c;
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
        java.lang.String str2 = this.f234958b;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            selectConversationUI.W7();
        } else {
            selectConversationUI.X7(str2);
        }
        intent.putExtra("custom_send_text", str);
        selectConversationUI.a8(-1, intent);
        selectConversationUI.finish();
    }
}
