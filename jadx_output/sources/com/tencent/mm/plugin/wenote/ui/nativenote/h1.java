package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes4.dex */
public class h1 implements q80.f0 {
    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "OpenLiteApp fail");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("showShare", false);
        intent.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.ui.n2.f209398a, 57));
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteEditorUI", "OpenLiteApp success");
    }
}
