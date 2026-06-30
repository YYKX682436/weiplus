package sl2;

/* loaded from: classes10.dex */
public final class c extends uh4.c {
    public static final void f(sl2.c cVar, uh4.a aVar, r45.g92 g92Var) {
        java.lang.String string;
        cVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAuthorizationFiller", "handleCellClick");
        android.content.Context context = aVar.f427963g.getContext();
        long Z = pm0.v.Z(g92Var.getString(2));
        long Z2 = pm0.v.Z(g92Var.getString(0));
        java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(3, 2, 65);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CURRENT_FEED_ID", Z);
        java.lang.String str = p52.h.f352021f;
        if (str == null) {
            str = "";
        }
        intent.putExtra("key_enter_live_param_share_username", str);
        intent.putExtra("key_enter_live_param_from_share_scene", 0);
        intent.putExtra("key_enter_live_param_from_share_scene_new", 1);
        intent.putExtra("key_enter_live_param_visitor_enter_scene", 1);
        intent.putExtra("key_enter_live_param_bind_type", g92Var.getInteger(19));
        java.lang.String string2 = g92Var.getString(20);
        if (string2 == null) {
            string2 = "";
        }
        intent.putExtra("key_enter_live_param_by_biz_username", string2);
        java.lang.String string3 = g92Var.getString(21);
        if (string3 == null) {
            string3 = "";
        }
        intent.putExtra("key_enter_live_param_by_biz_nickname", string3);
        java.lang.String string4 = g92Var.getString(45);
        if (string4 == null) {
            string4 = "";
        }
        intent.putExtra("key_enter_live_param_by_biz_headurl", string4);
        java.lang.String string5 = g92Var.getString(5);
        if (string5 == null || string5.length() == 0) {
            java.lang.String string6 = g92Var.getString(11);
            string = !(string6 == null || string6.length() == 0) ? g92Var.getString(11) : "";
        } else {
            string = g92Var.getString(5);
        }
        intent.putExtra("key_enter_live_cover_url", string);
        int i17 = qs5.z.f366478a;
        intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 7);
        java.lang.String string7 = g92Var.getString(28);
        if (!(string7 == null || string7.length() == 0)) {
            java.lang.String string8 = g92Var.getString(31);
            if (!(string8 == null || string8.length() == 0) && kotlin.jvm.internal.o.b(g92Var.getString(31), "1")) {
                r45.nn2 nn2Var = new r45.nn2();
                nn2Var.f381525e = g92Var.getString(28);
                nn2Var.f381524d = g92Var.getString(27);
                nn2Var.f381527g = g92Var.getString(30);
                nn2Var.f381526f = g92Var.getString(29);
                intent.putExtra("KEY_ENTER_LIVE_PARAM_OLYMPIC_FIRE_AUTHOR_INFO", nn2Var.toByteArray());
            }
        }
        if (((r45.nw1) g92Var.getCustom(24)) != null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1552L, 93L, 1L);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1552L, 94L, 1L);
        }
        r45.m84 m84Var = new r45.m84();
        m84Var.set(0, java.lang.Long.valueOf(Z));
        m84Var.set(1, java.lang.Long.valueOf(Z2));
        java.lang.String string9 = g92Var.getString(12);
        if (string9 == null) {
            string9 = "";
        }
        m84Var.set(2, string9);
        java.lang.String string10 = g92Var.getString(1);
        if (string10 == null) {
            string10 = "";
        }
        m84Var.set(3, string10);
        m84Var.set(4, "");
        m84Var.set(5, g92Var.getString(4));
        m84Var.set(6, (r45.nw1) g92Var.getCustom(24));
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, Gj);
        wk0Var.set(1, "");
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        kotlin.jvm.internal.o.d(context);
        ((vd2.f1) e0Var).Ri(context, intent, m84Var, false, wk0Var, null);
    }

    @Override // uh4.c
    public java.lang.String b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String string = context.getString(com.tencent.mm.R.string.egj);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // uh4.c
    public void c(android.content.Context context, uh4.b state, uh4.a aVar) {
        java.lang.String str;
        ot0.q v17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(state, "state");
        if (aVar == null) {
            return;
        }
        rt0.e eVar = (rt0.e) aVar.f427957a.y(rt0.e.class);
        boolean equals = c01.z1.r().equals(aVar.f427962f);
        if (eVar != null) {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(eVar.f399380e, "content", null);
            if (d17 == null || (str = (java.lang.String) d17.get(".content")) == null || (v17 = ot0.q.v(str)) == null) {
                return;
            }
            zy2.c cVar = (zy2.c) v17.y(zy2.c.class);
            r45.g92 g92Var = cVar != null ? cVar.f477359b : null;
            com.tencent.mars.xlog.Log.i("FinderAuthorizationFiller", "onFill, state:" + state + ", isWard:" + equals + ", piece.referMsg:" + eVar.f399380e);
            if (equals) {
                android.content.Context context2 = aVar.f427963g.getContext();
                int ordinal = state.ordinal();
                if (ordinal == 0) {
                    aVar.f427964h.setText(context2.getResources().getString(com.tencent.mm.R.string.f7e));
                    h(aVar, g92Var, false);
                    return;
                }
                if (ordinal == 1) {
                    aVar.f427964h.setText(context2.getResources().getString(com.tencent.mm.R.string.f76));
                    h(aVar, g92Var, false);
                    return;
                } else if (ordinal == 2) {
                    aVar.f427964h.setText(context2.getResources().getString(com.tencent.mm.R.string.f7a));
                    h(aVar, g92Var, true);
                    return;
                } else {
                    if (ordinal != 3) {
                        return;
                    }
                    aVar.f427964h.setText(context2.getResources().getString(com.tencent.mm.R.string.f79));
                    h(aVar, g92Var, false);
                    return;
                }
            }
            android.content.Context context3 = aVar.f427963g.getContext();
            int ordinal2 = state.ordinal();
            if (ordinal2 == 0) {
                aVar.f427963g.setText(context3.getResources().getString(com.tencent.mm.R.string.egc));
                aVar.f427964h.setText(context3.getResources().getString(com.tencent.mm.R.string.f7c));
            } else if (ordinal2 == 1) {
                aVar.f427964h.setText(context3.getResources().getString(com.tencent.mm.R.string.f76));
            } else if (ordinal2 == 2) {
                aVar.f427964h.setText(context3.getResources().getString(com.tencent.mm.R.string.f7_));
            } else if (ordinal2 == 3) {
                aVar.f427964h.setText(context3.getResources().getString(com.tencent.mm.R.string.f78));
            }
            if (g92Var != null) {
                n11.a b17 = n11.a.b();
                java.lang.String string = g92Var.getString(11);
                if (string == null) {
                    string = "";
                }
                b17.g(string, aVar.f427966j);
                aVar.f427968l.setText(g92Var.getString(4));
                aVar.f427965i.setOnClickListener(new sl2.a(this, aVar, g92Var));
                aVar.f427967k.setVisibility(8);
            }
        }
    }

    public final void h(uh4.a aVar, r45.g92 g92Var, boolean z17) {
        if (g92Var != null) {
            n11.a b17 = n11.a.b();
            java.lang.String string = g92Var.getString(11);
            if (string == null) {
                string = "";
            }
            b17.g(string, aVar.f427966j);
            aVar.f427968l.setText(g92Var.getString(4));
            aVar.f427967k.setVisibility(8);
            if (z17) {
                aVar.f427965i.setOnClickListener(new sl2.b(this, aVar, g92Var));
            }
        }
    }
}
