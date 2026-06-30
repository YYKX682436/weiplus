package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class dm extends com.tencent.mm.ui.chatting.b6 {
    public dm(yb5.d dVar, int i17, com.tencent.mm.storage.f9 f9Var, android.view.View view) {
        super(dVar);
        if (i17 == 1) {
            b(f9Var);
        }
    }

    @Override // com.tencent.mm.ui.chatting.b6
    public void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (com.tencent.mm.sdk.platformtools.f9.SessionLocation.k(view.getContext(), null)) {
            b(((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).c());
        }
    }

    public final void b(com.tencent.mm.storage.f9 f9Var) {
        int t17;
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        java.lang.String j17 = f9Var.j();
        boolean z17 = f9Var.A0() == 0;
        java.lang.String Q0 = z17 ? f9Var.Q0() : "";
        boolean R4 = com.tencent.mm.storage.z3.R4(f9Var.Q0());
        yb5.d dVar = this.f198492d;
        if (R4 && z17 && !((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).f198753r && (t17 = c01.w9.t(j17)) != -1) {
            Q0 = j17.substring(0, t17).trim();
            j17 = j17.substring(t17 + 1).trim();
        }
        com.tencent.mm.storage.b9 H6 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).H6(j17);
        if (!x51.t1.b(Q0) && com.tencent.mm.storage.z3.R4(Q0)) {
            Q0 = "";
        }
        com.tencent.mm.autogen.events.LocationServerEvent locationServerEvent = new com.tencent.mm.autogen.events.LocationServerEvent();
        am.ej ejVar = locationServerEvent.f54481g;
        ejVar.f6559a = 1;
        ejVar.f6561c = f9Var;
        locationServerEvent.e();
        am.fj fjVar = locationServerEvent.f54482h;
        java.lang.String str = fjVar.f6680a;
        java.lang.String str2 = fjVar.f6681b;
        if (x51.t1.b(H6.f193780f) && !H6.c()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LocationClickListener", "invalid poi: %s, %s", H6.f193780f, java.lang.Boolean.valueOf(H6.c()));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("kMsgId", f9Var.getMsgId());
        intent.putExtra("map_view_type", 1);
        intent.putExtra("map_indoor_support", 1);
        intent.putExtra("kwebmap_slat", H6.f193776b);
        intent.putExtra("kwebmap_lng", H6.f193777c);
        intent.putExtra("kwebmap_scale", H6.f193778d);
        intent.putExtra("kPoiName", H6.f193780f);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        intent.putExtra("kisUsername", c01.a2.e(Q0));
        intent.putExtra("Kwebmap_locaion", str);
        intent.putExtra("kimg_path", g83.a.a());
        intent.putExtra("map_talker_name", f9Var.Q0());
        intent.putExtra("view_type_key", 0);
        intent.putExtra("kwebmap_from_to", true);
        intent.putExtra("kPoi_url", H6.f193785k);
        intent.putExtra("kPoiid", H6.f193786l);
        intent.putExtra("KIsFromPoiList", H6.f193787m);
        intent.putExtra("KPoiCategoryTips", H6.f193788n);
        intent.putExtra("kPoiBusinessHour", H6.f193789o);
        intent.putExtra("KPoiPhone", H6.f193790p);
        intent.putExtra("KPoiPriceTips", H6.f193791q);
        intent.putExtra("kBuildingID", H6.f193792r);
        intent.putExtra("kFloorName", H6.f193793s);
        intent.putExtra("key_drawer_allow_no_poiid", true);
        java.lang.String J0 = f9Var.J0();
        if (J0 == null) {
            J0 = "";
        }
        intent.putExtra("soso_street_view_url", J0);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 2, "");
        if (dVar.D()) {
            intent.putExtra("type_tag", 2);
        } else {
            intent.putExtra("type_tag", 1);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("poi_from_chat_type", dVar.D() ? 2 : 1);
        bundle.putInt("poi_from_user_type", z17 ? 1 : 2);
        bundle.putString("poi_from_chat_name", z17 ? f9Var.Q0() : gm0.j1.b().k());
        intent.putExtra("poi_from_chat_report_bundle", bundle);
        j45.l.r(dVar.f460709d, ya.b.LOCATION, ".ui.RedirectUI", intent, 2002, new com.tencent.mm.ui.chatting.viewitems.cm(this));
    }
}
