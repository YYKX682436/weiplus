package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class m4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI f142942d;

    public m4(com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI iPCallShareCouponCardUI) {
        this.f142942d = iPCallShareCouponCardUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        int i18 = com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI.F;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI iPCallShareCouponCardUI = this.f142942d;
        sb6.append(iPCallShareCouponCardUI.f142689z);
        sb6.append(" ");
        sb6.append(iPCallShareCouponCardUI.C);
        sb6.append(java.lang.String.format("&rt=%s", java.lang.Integer.valueOf(itemId)));
        java.lang.String sb7 = sb6.toString();
        q83.d dVar = iPCallShareCouponCardUI.f142683t;
        switch (itemId) {
            case 0:
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallShareCouponCardUI", "onShare2Friends>title:%s,onShare2Friends>url:%s,onShare2Friends>desc:%s,onShare2Friends>imgPath:%s", iPCallShareCouponCardUI.f142687x, iPCallShareCouponCardUI.f142688y + java.lang.String.format("&rt=%s", java.lang.Integer.valueOf(itemId)), iPCallShareCouponCardUI.f142685v, iPCallShareCouponCardUI.f142686w);
                dVar.f360755c = (long) 0;
                dVar.b();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 20L, 1L, true);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Select_Conv_Type", com.tencent.mars.cdn.proto.AppType.APPTYPE_259_VALUE);
                intent.putExtra("select_is_ret", true);
                j45.l.v(iPCallShareCouponCardUI, ".ui.transmit.SelectConversationUI", intent, 1);
                break;
            case 1:
                java.lang.String str = iPCallShareCouponCardUI.f142687x;
                java.lang.String str2 = iPCallShareCouponCardUI.f142688y + java.lang.String.format("&rt=%s", java.lang.Integer.valueOf(itemId));
                java.lang.String str3 = iPCallShareCouponCardUI.f142685v;
                java.lang.String str4 = iPCallShareCouponCardUI.f142686w;
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallShareCouponCardUI", "onShareSnsEvent>title:%s,onShareSnsEvent>url:%s,onShareSnsEvent>content:%s,onShareSnsEvent>content:%s", str, str2, str3, str4);
                dVar.f360755c = 1;
                dVar.b();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(257L, 21L, 1L, true);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Ksnsupload_type", 1);
                intent2.putExtra("need_result", false);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                intent2.putExtra("Ksnsupload_title", str != null ? str : "");
                intent2.putExtra("Ksnsupload_imgurl", str4);
                intent2.putExtra("Ksnsupload_link", str2);
                java.lang.String a17 = c01.n2.a("wechat_out");
                c01.n2.d().c(a17, true).i("prePublishId", "wechat_out");
                intent2.putExtra("reportSessionId", a17);
                j45.l.n(iPCallShareCouponCardUI, "sns", ".ui.SnsUploadUI", intent2, 1);
                break;
            case 2:
                android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW");
                intent3.putExtra("sms_body", sb7);
                intent3.setType("vnd.android-dir/mms-sms");
                if (!com.tencent.mm.sdk.platformtools.t8.I0(iPCallShareCouponCardUI, intent3, true, false)) {
                    dp.a.makeText(iPCallShareCouponCardUI, com.tencent.mm.R.string.igz, 1).show();
                    break;
                } else {
                    try {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent3);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(iPCallShareCouponCardUI, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        iPCallShareCouponCardUI.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(iPCallShareCouponCardUI, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        break;
                    } catch (android.content.ActivityNotFoundException e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.IPCallShareCouponCardUI", "ActivityNotFoundException:" + e17);
                        dp.a.makeText(iPCallShareCouponCardUI, com.tencent.mm.R.string.igz, 1).show();
                        break;
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.IPCallShareCouponCardUI", e18, "", new java.lang.Object[0]);
                        break;
                    }
                }
            case 3:
                android.content.Intent intent4 = new android.content.Intent("android.intent.action.SEND");
                intent4.putExtra("android.intent.extra.SUBJECT", java.lang.String.format(iPCallShareCouponCardUI.getString(com.tencent.mm.R.string.g6_), c01.z1.l()));
                intent4.putExtra("android.intent.extra.TEXT", sb7);
                intent4.setType("plain/text");
                android.content.Intent createChooser = android.content.Intent.createChooser(intent4, iPCallShareCouponCardUI.getString(com.tencent.mm.R.string.g1v));
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(createChooser);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(iPCallShareCouponCardUI, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                iPCallShareCouponCardUI.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(iPCallShareCouponCardUI, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                break;
            case 4:
                try {
                    android.content.Intent intent5 = new android.content.Intent();
                    intent5.setAction("android.intent.action.SEND");
                    intent5.putExtra("android.intent.extra.TEXT", sb7);
                    intent5.setType("text/plain");
                    intent5.setPackage("com.whatsapp");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(intent5);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(iPCallShareCouponCardUI, arrayList3.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    iPCallShareCouponCardUI.startActivity((android.content.Intent) arrayList3.get(0));
                    yj0.a.f(iPCallShareCouponCardUI, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    break;
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallShareCouponCardUI", "go whatsapp error" + e19.getMessage());
                    break;
                }
            case 5:
                if (!(iPCallShareCouponCardUI.f142677n.f300169b != null)) {
                    db5.e1.n(iPCallShareCouponCardUI.getContext(), com.tencent.mm.R.string.j0_, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.ipcall.ui.q4(iPCallShareCouponCardUI), new com.tencent.mm.plugin.ipcall.ui.z3(iPCallShareCouponCardUI));
                    break;
                } else {
                    iPCallShareCouponCardUI.U6(16, sb7, iPCallShareCouponCardUI.getString(com.tencent.mm.R.string.g1x));
                    break;
                }
            case 6:
                if (!c01.z1.u()) {
                    db5.e1.n(iPCallShareCouponCardUI.getContext(), com.tencent.mm.R.string.iqx, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.ipcall.ui.a4(iPCallShareCouponCardUI), new com.tencent.mm.plugin.ipcall.ui.b4(iPCallShareCouponCardUI));
                    break;
                } else {
                    iPCallShareCouponCardUI.U6(8, sb7, iPCallShareCouponCardUI.getString(com.tencent.mm.R.string.g1t));
                    break;
                }
            case 7:
                try {
                    android.content.Intent intent6 = new android.content.Intent();
                    intent6.setAction("android.intent.action.SEND");
                    intent6.putExtra("android.intent.extra.TEXT", sb7);
                    intent6.setType("text/plain");
                    intent6.setPackage("com.facebook.orca");
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(intent6);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(iPCallShareCouponCardUI, arrayList4.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    iPCallShareCouponCardUI.startActivity((android.content.Intent) arrayList4.get(0));
                    yj0.a.f(iPCallShareCouponCardUI, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI", "handleShareId", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    break;
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallShareCouponCardUI", "go facebook msger error" + e27.getMessage());
                    break;
                }
            case 8:
                com.tencent.mm.sdk.platformtools.b0.d(com.tencent.mm.sdk.platformtools.x2.f193071a, null, sb7, null);
                dp.a.makeText(iPCallShareCouponCardUI, com.tencent.mm.R.string.g4k, 0).show();
                break;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13340, -1, 1, java.lang.Integer.valueOf(itemId), -1, -1);
    }
}
