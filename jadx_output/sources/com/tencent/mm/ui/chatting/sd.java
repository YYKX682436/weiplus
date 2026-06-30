package com.tencent.mm.ui.chatting;

/* loaded from: classes3.dex */
public class sd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.TextPreviewUI f202672d;

    public sd(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI) {
        this.f202672d = textPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/TextPreviewUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI = this.f202672d;
        android.content.Intent intent = new android.content.Intent(textPreviewUI, (java.lang.Class<?>) com.tencent.mm.plugin.webview.ui.tools.WebViewUI.class);
        intent.putExtra("rawUrl", c01.ia.u(textPreviewUI.f198339u));
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI2 = this.f202672d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(textPreviewUI2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/TextPreviewUI$11", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        textPreviewUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(textPreviewUI2, "com/tencent/mm/ui/chatting/TextPreviewUI$11", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/ui/chatting/TextPreviewUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
