package ze5;

/* loaded from: classes9.dex */
public final class r7 {
    public r7(kotlin.jvm.internal.i iVar) {
    }

    public static final z01.s a(ze5.r7 r7Var, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        r7Var.getClass();
        z01.s sVar = new z01.s();
        sVar.f469156d = java.lang.Long.valueOf(f9Var.getMsgId());
        sVar.f469157e = f9Var.Q0();
        o15.a aVar = new o15.a();
        java.lang.String j17 = f9Var.j();
        kotlin.jvm.internal.o.f(j17, "getContent(...)");
        aVar.fromXml(j17);
        sVar.f469158f = aVar;
        return sVar;
    }

    public static final void b(ze5.r7 r7Var, com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        int t17;
        r7Var.getClass();
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        java.lang.String j17 = f9Var.j();
        boolean z17 = f9Var.A0() == 0;
        java.lang.String Q0 = z17 ? f9Var.Q0() : "";
        if (com.tencent.mm.storage.z3.R4(f9Var.Q0()) && z17 && !((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).f198753r && (t17 = c01.w9.t(j17)) != -1) {
            kotlin.jvm.internal.o.d(j17);
            java.lang.String substring = j17.substring(0, t17);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            int length = substring.length() - 1;
            int i17 = 0;
            boolean z18 = false;
            while (i17 <= length) {
                boolean z19 = kotlin.jvm.internal.o.i(substring.charAt(!z18 ? i17 : length), 32) <= 0;
                if (z18) {
                    if (!z19) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z19) {
                    i17++;
                } else {
                    z18 = true;
                }
            }
            Q0 = substring.subSequence(i17, length + 1).toString();
            java.lang.String substring2 = j17.substring(t17 + 1);
            kotlin.jvm.internal.o.f(substring2, "substring(...)");
            int length2 = substring2.length() - 1;
            int i18 = 0;
            boolean z27 = false;
            while (i18 <= length2) {
                boolean z28 = kotlin.jvm.internal.o.i(substring2.charAt(!z27 ? i18 : length2), 32) <= 0;
                if (z27) {
                    if (!z28) {
                        break;
                    } else {
                        length2--;
                    }
                } else if (z28) {
                    i18++;
                } else {
                    z27 = true;
                }
            }
            j17 = substring2.subSequence(i18, length2 + 1).toString();
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
        java.lang.String str = locationServerEvent.f54482h.f6680a;
        if (x51.t1.b(H6.f193780f) && !H6.c()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemLocationCardMvvm", "invalid poi: %s, %s", H6.f193780f, java.lang.Boolean.valueOf(H6.c()));
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
        j45.l.r(dVar.f460709d, ya.b.LOCATION, ".ui.RedirectUI", intent, 2002, new ze5.q7(dVar));
    }

    public static final boolean c(ze5.r7 r7Var, yb5.d dVar, db5.g4 g4Var, android.view.View view, com.tencent.mm.storage.f9 f9Var) {
        r7Var.getClass();
        java.lang.Object tag = view.getTag();
        com.tencent.mm.ui.chatting.viewitems.er erVar = tag instanceof com.tencent.mm.ui.chatting.viewitems.er ? (com.tencent.mm.ui.chatting.viewitems.er) tag : null;
        if (erVar == null) {
            return false;
        }
        int d17 = erVar.d();
        if (f9Var.P0() == 5) {
            g4Var.c(d17, 103, 0, view.getContext().getString(com.tencent.mm.R.string.b5i), com.tencent.mm.R.raw.icons_filled_refresh);
        }
        g4Var.c(d17, 127, 0, view.getContext().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        if ((r01.q3.cj().u1(16) > 0) && !dVar.F()) {
            g4Var.add(d17, 114, 0, view.getContext().getString(com.tencent.mm.R.string.b3l));
        }
        j45.l.g("favorite");
        g4Var.c(d17, 116, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
        com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
        long msgId = f9Var.getMsgId();
        am.b6 b6Var = exDeviceHaveBindNetworkDeviceEvent.f54141g;
        b6Var.f6219a = msgId;
        b6Var.f6220b = f9Var.Q0();
        exDeviceHaveBindNetworkDeviceEvent.e();
        if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
            g4Var.c(d17, 129, 0, view.getContext().getString(com.tencent.mm.R.string.b3x), com.tencent.mm.R.raw.icons_filled_open);
        }
        if (!f9Var.t2() && f9Var.L2() && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, dVar) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()))) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
        }
        if (!dVar.F()) {
            g4Var.c(d17, 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    public static final boolean d(ze5.r7 r7Var, android.view.MenuItem menuItem, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        r7Var.getClass();
        if (menuItem.getItemId() != 127) {
            return false;
        }
        if (f9Var.L2()) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(f9Var);
            com.tencent.mm.ui.chatting.x3.d(dVar.g(), linkedList, dVar.D(), dVar.u().d1(), null);
        }
        return true;
    }
}
