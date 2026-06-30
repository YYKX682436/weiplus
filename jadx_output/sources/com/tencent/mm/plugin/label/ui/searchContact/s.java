package com.tencent.mm.plugin.label.ui.searchContact;

/* loaded from: classes.dex */
public final class s implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI f143381a;

    public s(com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI) {
        this.f143381a = contactManagerUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI = this.f143381a;
        contactManagerUI.hideVKB();
        if (z17) {
            return;
        }
        java.lang.String str2 = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/newreadtemplate?t=contact/faq1&wechat_real_lang=" + com.tencent.mm.sdk.platformtools.m2.f(contactManagerUI.getContext());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str2);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        j45.l.j(contactManagerUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
