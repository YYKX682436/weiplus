package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class se implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.te f199937d;

    public se(com.tencent.mm.ui.chatting.component.te teVar) {
        this.f199937d = teVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.ui.chatting.component.te teVar = this.f199937d;
        teVar.getClass();
        if (itemId == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("k_username", teVar.f199994e.f198580d.x());
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.ui.n2.f209398a, 36));
            j45.l.j(teVar.f199994e.f198580d.g(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
