package com.tencent.mm.ui.chatting;

/* loaded from: classes4.dex */
public class i4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f201829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f201831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201832g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f201833h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.h4 f201834i;

    public i4(com.tencent.mm.ui.chatting.h4 h4Var, boolean z17, java.lang.String str, int i17, java.lang.String str2, boolean z18) {
        this.f201834i = h4Var;
        this.f201829d = z17;
        this.f201830e = str;
        this.f201831f = i17;
        this.f201832g = str2;
        this.f201833h = z18;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        pt3.b bVar = com.tencent.mm.plugin.recordvideo.background.provider.WeSeeProvider.f155649g;
        bVar.a();
        boolean z17 = this.f201829d;
        int i18 = this.f201831f;
        java.lang.String str = this.f201830e;
        com.tencent.mm.ui.chatting.h4 h4Var = this.f201834i;
        if (!z17) {
            bVar.b(str, java.lang.System.currentTimeMillis());
            android.content.Intent intent = new android.content.Intent();
            if (!this.f201833h) {
                intent.putExtra("KRightBtn", true);
            }
            intent.putExtra("rawUrl", this.f201832g);
            j45.l.j(h4Var.f201645j.g(), "webview", ".ui.tools.WebViewUI", intent, null);
            com.tencent.mm.ui.chatting.h4.O(8, i18, h4Var.f201647l);
            return;
        }
        com.tencent.mm.ui.chatting.h4.O(11, i18, h4Var.f201647l);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setAction("android.intent.action.VIEW");
        intent2.setData(android.net.Uri.parse(str));
        intent2.setPackage("com.tencent.weishi");
        intent2.setFlags(268435456);
        android.app.Activity g17 = h4Var.f201645j.g();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingFooterEventImpl$10", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        g17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(g17, "com/tencent/mm/ui/chatting/ChattingFooterEventImpl$10", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
