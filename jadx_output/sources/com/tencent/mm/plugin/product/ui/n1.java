package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class n1 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.o1 f153319a;

    public n1(com.tencent.mm.plugin.product.ui.o1 o1Var) {
        this.f153319a = o1Var;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.tencent.mm.plugin.product.ui.o1 o1Var = this.f153319a;
        if (i17 == 0) {
            com.tencent.mm.plugin.product.ui.w wVar = o1Var.f153323d.f153262w;
            wq3.j jVar = wVar.f153367g;
            java.lang.String p17 = jVar.p();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_content", p17);
            intent.putExtra("Retr_Msg_Type", 2);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(jVar.f448549b.a())) {
                intent.putExtra("Retr_Msg_thumb_path", jVar.k());
            }
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("Retr_Msg_Type", 2);
            j45.l.u(wVar.f153364d, ".ui.transmit.MsgRetransmitUI", intent, null);
            if (com.tencent.mm.plugin.product.ui.w.f153363m == 4) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10651, 11, 1, 0);
                return;
            }
            return;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.product.ui.w wVar2 = o1Var.f153323d.f153262w;
            wq3.j jVar2 = wVar2.f153367g;
            wq3.t tVar = jVar2.f448549b;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("KContentObjDesc", jVar2.q());
            intent2.putExtra("Ksnsupload_title", tVar.f448599e.f456059d);
            intent2.putExtra("Ksnsupload_link", jVar2.l());
            intent2.putExtra("Ksnsupload_imgurl", jVar2.f448549b.a());
            if (!com.tencent.mm.sdk.platformtools.t8.K0(jVar2.f448549b.a())) {
                intent2.putExtra("KsnsUpload_imgPath", jVar2.k());
            }
            intent2.putExtra("Ksnsupload_type", 6);
            intent2.putExtra("KUploadProduct_UserData", jVar2.r(tVar));
            intent2.putExtra("KUploadProduct_subType", tVar.f448596b);
            java.lang.String a17 = c01.n2.a("scan_product");
            c01.n2.d().c(a17, true).i("prePublishId", "scan_product");
            intent2.putExtra("reportSessionId", a17);
            j45.l.j(wVar2.f153364d, "sns", ".ui.SnsUploadUI", intent2, null);
            if (com.tencent.mm.plugin.product.ui.w.f153363m == 4) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10651, 11, 0, 0);
                return;
            }
            return;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            com.tencent.mm.plugin.product.ui.w wVar3 = o1Var.f153323d.f153262w;
            com.tencent.mm.wallet_core.ui.r1.a0(wVar3.f153364d, wVar3.f153367g.j());
            return;
        }
        com.tencent.mm.plugin.product.ui.w wVar4 = o1Var.f153323d.f153262w;
        wq3.j jVar3 = wVar4.f153367g;
        wq3.t tVar2 = jVar3.f448549b;
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.aq0 aq0Var = new r45.aq0();
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(11);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        aq0Var.g(tVar2.f448599e.f456059d);
        aq0Var.d(jVar3.q());
        aq0Var.i(tVar2.f448596b);
        aq0Var.e(jVar3.r(tVar2));
        aq0Var.f(tVar2.a());
        java.lang.String str = tVar2.f448599e.f456059d;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6318d = str;
        c4Var.f6319e = jVar3.q();
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 11;
        bq0Var.o(jq0Var);
        bq0Var.n(aq0Var);
        c4Var.f6323i = wVar4.f153364d;
        c4Var.f6327m = 5;
        doFavoriteEvent.e();
    }
}
