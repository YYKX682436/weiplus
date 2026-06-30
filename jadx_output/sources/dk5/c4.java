package dk5;

/* loaded from: classes9.dex */
public class c4 implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234568b;

    public c4(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, java.lang.String str) {
        this.f234568b = selectConversationUI;
        this.f234567a = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234568b;
        if (selectConversationUI.L1 == 4) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f234567a);
        intent.putExtra("showShare", false);
        j45.l.j(selectConversationUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
