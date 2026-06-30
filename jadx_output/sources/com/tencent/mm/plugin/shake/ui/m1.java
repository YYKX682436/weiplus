package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes9.dex */
public class m1 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.TVInfoUI f162309a;

    public m1(com.tencent.mm.plugin.shake.ui.TVInfoUI tVInfoUI) {
        this.f162309a = tVInfoUI;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        com.tencent.mm.plugin.shake.ui.TVInfoUI tVInfoUI = this.f162309a;
        if (i18 == -1) {
            db5.e1.b(tVInfoUI.getContext(), tVInfoUI.getContext().getString(com.tencent.mm.R.string.f490369t2), null, null, tVInfoUI.getContext().getString(com.tencent.mm.R.string.f490367t0), new com.tencent.mm.plugin.shake.ui.l1(this));
            return;
        }
        if (i18 == 0) {
            if (tVInfoUI.f162229i == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.TVInfoUI", "shareToFriend, but tv is null");
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10987, 4, "", "", "");
            java.lang.String c17 = j34.j.c(tVInfoUI.getContext(), tVInfoUI.f162229i);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_content", c17);
            intent.putExtra("Retr_Msg_Type", 2);
            j34.h hVar = tVInfoUI.f162232o;
            if (hVar != null && tVInfoUI.f162233p) {
                intent.putExtra("Retr_Msg_thumb_path", hVar.k());
            }
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.v(intent, tVInfoUI);
            return;
        }
        if (i18 == 1) {
            if (tVInfoUI.f162229i == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.TVInfoUI", "shareToTimeLine, but tv is null");
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10987, 3, "", "", "");
            android.content.Intent intent2 = new android.content.Intent();
            if (com.tencent.mm.sdk.platformtools.t8.K0(tVInfoUI.f162229i.field_topic)) {
                intent2.putExtra("KContentObjDesc", tVInfoUI.f162229i.field_subtitle);
            } else {
                intent2.putExtra("KContentObjDesc", tVInfoUI.f162229i.field_topic);
            }
            intent2.putExtra("Ksnsupload_title", tVInfoUI.f162229i.field_title);
            intent2.putExtra("Ksnsupload_link", tVInfoUI.f162229i.field_shareurl);
            intent2.putExtra("Ksnsupload_appname", tVInfoUI.getString(com.tencent.mm.R.string.f492933ib3));
            if (h34.z.e()) {
                intent2.putExtra("Ksnsupload_appid", "wxaf060266bfa9a35c");
            }
            intent2.putExtra("Ksnsupload_imgurl", tVInfoUI.f162229i.field_thumburl);
            j34.h hVar2 = tVInfoUI.f162232o;
            if (hVar2 != null && tVInfoUI.f162233p) {
                intent2.putExtra("KsnsUpload_imgPath", hVar2.k());
            }
            intent2.putExtra("Ksnsupload_type", 5);
            intent2.putExtra("KUploadProduct_UserData", j34.j.a(tVInfoUI.f162229i));
            java.lang.String a17 = c01.n2.a("shake_tv");
            c01.n2.d().c(a17, true).i("prePublishId", "shake_tv");
            intent2.putExtra("reportSessionId", a17);
            j45.l.j(tVInfoUI, "sns", ".ui.SnsUploadUI", intent2, null);
            return;
        }
        if (i18 != 2) {
            return;
        }
        if (tVInfoUI.f162229i == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TVInfoUI", "do favorite, but tv is null");
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10987, 5, "", "", "");
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.mq0 mq0Var = new r45.mq0();
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(8);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        if (h34.z.e()) {
            jq0Var.b("wxaf060266bfa9a35c");
        }
        mq0Var.g(tVInfoUI.f162229i.field_title);
        if (com.tencent.mm.sdk.platformtools.t8.K0(tVInfoUI.f162229i.field_topic)) {
            mq0Var.d(tVInfoUI.f162229i.field_subtitle);
        } else {
            mq0Var.d(tVInfoUI.f162229i.field_topic);
        }
        mq0Var.e(j34.j.a(tVInfoUI.f162229i));
        mq0Var.f(tVInfoUI.f162229i.field_thumburl);
        j34.i iVar = tVInfoUI.f162229i;
        java.lang.String str = iVar.field_title;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6318d = str;
        c4Var.f6319e = iVar.field_topic;
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 15;
        bq0Var.o(jq0Var);
        bq0Var.q(mq0Var);
        c4Var.f6327m = 12;
        c4Var.f6323i = tVInfoUI;
        doFavoriteEvent.e();
    }
}
