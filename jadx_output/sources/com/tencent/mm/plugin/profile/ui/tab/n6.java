package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class n6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f154492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.biz.b f154493e;

    public n6(java.lang.ref.WeakReference weakReference, com.tencent.wechat.mm.biz.b bVar) {
        this.f154492d = weakReference;
        this.f154493e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = (com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo) this.f154492d.get();
        if (contactWidgetTabBizInfo == null) {
            return;
        }
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = contactWidgetTabBizInfo.f154198d;
        if (contactInfoUI.isFinishing() || contactInfoUI.isDestroyed() || !contactWidgetTabBizInfo.K) {
            return;
        }
        com.tencent.wechat.mm.biz.b bVar = this.f154493e;
        java.lang.String str = bVar != null ? bVar.f217891g : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = bVar != null ? bVar.f217892h : null;
        java.lang.String str3 = str2 != null ? str2 : "";
        if (!(contactInfoUI instanceof android.app.Activity)) {
            contactInfoUI = null;
        }
        if (contactInfoUI == null || contactInfoUI.isFinishing() || contactInfoUI.isDestroyed()) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.c cVar = new com.tencent.mm.ui.widget.dialog.c(contactInfoUI);
        android.view.View inflate = android.view.View.inflate(contactInfoUI, com.tencent.mm.R.layout.dzx, null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f486305uq3);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.uq6);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f486306uq4);
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(new com.tencent.mm.plugin.profile.ui.tab.t5());
        if (str3.length() > 0) {
            n11.a.b().g(str3, imageView);
        }
        textView.setText(str);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.profile.ui.tab.u5(cVar));
        contactWidgetTabBizInfo.K = false;
        cVar.setContentView(inflate);
        cVar.show();
    }
}
