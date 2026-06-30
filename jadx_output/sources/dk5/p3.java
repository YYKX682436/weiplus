package dk5;

/* loaded from: classes.dex */
public class p3 implements com.tencent.mm.ui.widget.dialog.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234798b;

    public p3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, java.lang.String str) {
        this.f234798b = selectConversationUI;
        this.f234797a = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.i
    public void a() {
        java.lang.String str = this.f234797a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        j45.l.j(this.f234798b.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
