package dk5;

/* loaded from: classes9.dex */
public class r2 implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234847b;

    public r2(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, java.lang.String str) {
        this.f234847b = selectConversationUI;
        this.f234846a = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234847b;
        if (selectConversationUI.L1 == 4) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f234846a);
        intent.putExtra("hide_option_menu", true);
        j45.l.j(selectConversationUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
