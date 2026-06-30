package qr1;

/* loaded from: classes.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.chatting.component.ChattingBizFansComponent f366061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f366062e;

    public d(com.tencent.mm.plugin.brandservice.ui.chatting.component.ChattingBizFansComponent chattingBizFansComponent, android.app.Activity activity) {
        this.f366061d = chattingBizFansComponent;
        this.f366062e = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/chatting/component/ChattingBizFansComponent$showPrivacyDialogIfNeed$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f366061d.n0() == 5 ? "https://mp.weixin.qq.com/cgi-bin/announce?action=getannouncement&key=11768825268OP3rA&version=1&lang=zh_CN&platform=2" : "https://mp.weixin.qq.com/cgi-bin/announce?action=getannouncement&key=11761223096wMxxn&version=1&lang=zh_CN&platform=2");
        intent.putExtra("KRightBtn", true);
        j45.l.j(this.f366062e, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/chatting/component/ChattingBizFansComponent$showPrivacyDialogIfNeed$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
