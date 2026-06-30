package p14;

/* loaded from: classes5.dex */
public class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI f351238d;

    public n0(com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI showQRCodeStep1UI) {
        this.f351238d = showQRCodeStep1UI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI showQRCodeStep1UI = this.f351238d;
        int i17 = showQRCodeStep1UI.f160122f;
        if (i17 == 3) {
            byte[] c17 = gm0.j1.n().c(1);
            java.lang.String r17 = c01.z1.r();
            int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(66561, null));
            com.tencent.mm.sdk.platformtools.t8.G1(com.tencent.mm.sdk.platformtools.t8.l(c17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("https://");
            sb6.append(com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyt));
            sb6.append("/cgi-bin/rweibourl?sid=");
            sb6.append(kk.k.g(c17));
            sb6.append("&u=");
            sb6.append(r17);
            sb6.append("&qr=");
            sb6.append(q17);
            sb6.append("&device=");
            int i18 = o45.wf.f343023a;
            sb6.append(wo.q.f447780a);
            sb6.append("&version=");
            sb6.append(o45.wf.f343029g);
            java.lang.String sb7 = sb6.toString();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", sb7);
            intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, showQRCodeStep1UI.getString(com.tencent.mm.R.string.ihh));
            j45.l.j(showQRCodeStep1UI, "webview", ".ui.tools.WebViewUI", intent, null);
            showQRCodeStep1UI.finish();
        } else if (i17 == 4) {
            if (c01.z1.u()) {
                android.content.Intent intent2 = new android.content.Intent(showQRCodeStep1UI, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI.class);
                intent2.putExtra("show_to", 4);
                com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI showQRCodeStep1UI2 = this.f351238d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(showQRCodeStep1UI2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                showQRCodeStep1UI2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(showQRCodeStep1UI2, "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                showQRCodeStep1UI.startActivity(com.tencent.mm.plugin.account.ui.MMFBAuthUI.class);
            }
            showQRCodeStep1UI.finish();
        } else if (i17 == 2) {
            android.content.Intent intent3 = new android.content.Intent(showQRCodeStep1UI, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI.class);
            intent3.putExtra("show_to", 2);
            com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI showQRCodeStep1UI3 = this.f351238d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent3);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(showQRCodeStep1UI3, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            showQRCodeStep1UI3.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(showQRCodeStep1UI3, "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            showQRCodeStep1UI.finish();
        } else {
            android.content.Intent intent4 = new android.content.Intent(showQRCodeStep1UI, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.qrcode.ShareToQQUI.class);
            intent4.putExtra("show_to", 1);
            com.tencent.mm.plugin.setting.ui.qrcode.ShowQRCodeStep1UI showQRCodeStep1UI4 = this.f351238d;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(intent4);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(showQRCodeStep1UI4, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            showQRCodeStep1UI4.startActivity((android.content.Intent) arrayList4.get(0));
            yj0.a.f(showQRCodeStep1UI4, "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            showQRCodeStep1UI.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
