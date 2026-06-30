package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class f6 extends com.tencent.mm.ui.chatting.b6 {
    @Override // com.tencent.mm.ui.chatting.b6
    public void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("geta8key_username", dVar.x());
        intent.putExtra("rawUrl", erVar.f203926v);
        j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
