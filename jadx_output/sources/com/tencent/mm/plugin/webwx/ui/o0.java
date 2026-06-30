package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes.dex */
public class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.WebWeiXinIntroductionUI f188054d;

    public o0(com.tencent.mm.plugin.webwx.ui.WebWeiXinIntroductionUI webWeiXinIntroductionUI) {
        this.f188054d = webWeiXinIntroductionUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/WebWeiXinIntroductionUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 1);
        intent.putExtra("BaseScanUI_only_scan_qrcode_with_zbar", true);
        intent.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 2);
        intent.putExtra("from_album", false);
        intent.putExtra("key_scan_report_enter_scene", 23);
        intent.putExtra("show_intro", false);
        intent.setFlags(65536);
        j45.l.j(this.f188054d, "scanner", ".ui.BaseScanUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/WebWeiXinIntroductionUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
