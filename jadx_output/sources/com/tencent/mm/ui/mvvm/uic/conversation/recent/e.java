package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f209295b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f209296c = "";

    /* renamed from: d, reason: collision with root package name */
    public static int f209297d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f209298e = "";

    /* renamed from: f, reason: collision with root package name */
    public static int f209299f;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.mvvm.uic.conversation.recent.e f209294a = new com.tencent.mm.ui.mvvm.uic.conversation.recent.e();

    /* renamed from: g, reason: collision with root package name */
    public static volatile java.util.Map f209300g = kz5.q0.f314001d;

    public static final int b(java.lang.String str) {
        return kotlin.jvm.internal.o.b(str, "filehelper") ? 10 : 1;
    }

    public static final int d(int i17, java.lang.String str) {
        if (i17 == 7) {
            return 3;
        }
        switch (i17) {
            case 11:
                return 4;
            case 12:
                return 5;
            case 13:
                return 6;
            default:
                return ((str == null || str.length() == 0) || !com.tencent.mm.storage.z3.R4(str)) ? 1 : 2;
        }
    }

    public static final int k(int i17) {
        switch (i17) {
            case 0:
            case 2:
            default:
                return 1;
            case 1:
                return 9;
            case 3:
                return 10;
            case 4:
                return 11;
            case 5:
                return 4;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 3;
            case 10:
                return 12;
            case 11:
                return 14;
            case 12:
                return 15;
            case 13:
                return 16;
        }
    }

    public static final void l(java.lang.Long l17, java.lang.Long l18, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool) {
        com.tencent.mm.autogen.mmdata.rpt.ForwardReportStruct forwardReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ForwardReportStruct();
        forwardReportStruct.f58231e = l18 != null ? l18.longValue() : 0L;
        forwardReportStruct.f58230d = l17 != null ? l17.longValue() : 0L;
        forwardReportStruct.f58232f = num != null ? num.intValue() : 0;
        forwardReportStruct.f58233g = num2 != null ? num2.intValue() : 0L;
        forwardReportStruct.f58234h = num3 != null ? num3.intValue() : 0L;
        forwardReportStruct.f58235i = kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE) ? 1 : 0;
        forwardReportStruct.k();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(forwardReportStruct.g());
        java.lang.String n17 = forwardReportStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardReportHelper", "report%s %s", valueOf, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
    }

    public static final void m(co.a aVar, int i17, int i18, int i19) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("app_jump_wegov_popup", "view_clk", kz5.c1.m(f209294a.a(aVar, i17, i19), kz5.c1.k(new jz5.l("popup_action_type", java.lang.Integer.valueOf(i18)), new jz5.l("share_type", 15))), 32337);
    }

    public static final void n(co.a aVar, int i17, int i18, int i19) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("app_jump_wecom_popup", "view_clk", kz5.c1.m(f209294a.a(aVar, i17, i19), kz5.c1.k(new jz5.l("popup_action_type", java.lang.Integer.valueOf(i18)), new jz5.l("share_type", 14))), 32337);
    }

    public static final void p(int i17, java.lang.String str) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("forward_recent_order", java.lang.Integer.valueOf(i17));
        lVarArr[1] = new jz5.l("forward_sid", f209295b);
        if (str == null) {
            str = "";
        }
        lVarArr[2] = new jz5.l("click_username", str);
        ((cy1.a) rVar).Hj("remove_recent_frowrad_chats", "view_clk", kz5.c1.k(lVarArr), 32337);
    }

    public static final void q(int i17, java.lang.String str) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("forward_recent_order", java.lang.Integer.valueOf(i17));
        lVarArr[1] = new jz5.l("forward_sid", f209295b);
        if (str == null) {
            str = "";
        }
        lVarArr[2] = new jz5.l("click_username", str);
        ((cy1.a) rVar).Hj("remove_recent_frowrad_chats", "view_exp", kz5.c1.k(lVarArr), 32337);
    }

    public static final void r(int i17, java.lang.String str) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("forward_sid", f209295b);
        lVarArr[1] = new jz5.l("forward_del_sid", f209296c);
        if (str == null) {
            str = "";
        }
        lVarArr[2] = new jz5.l("click_username", str);
        ((cy1.a) rVar).Hj("forward_real_del", "view_clk", kz5.c1.k(lVarArr), 32337);
    }

    public static final void s() {
        f209295b = com.tencent.mm.sdk.platformtools.w2.a(gm0.j1.b().j()) + c01.id.c();
    }

    public static final void t() {
        f209296c = com.tencent.mm.sdk.platformtools.w2.a(gm0.j1.b().j()) + c01.id.c();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_del_bnt", "view_clk", kz5.c1.k(new jz5.l("forward_sid", f209295b), new jz5.l("forward_del_sid", f209296c)), 32337);
    }

    public final java.util.Map a(co.a aVar, int i17, int i18) {
        java.lang.String str;
        int c17 = c(aVar, i18);
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("forward_sid", f209295b);
        lVarArr[1] = new jz5.l("forwarding_lists_state", java.lang.Integer.valueOf(e()));
        lVarArr[2] = new jz5.l("selected_msg_list", h(aVar));
        lVarArr[3] = new jz5.l("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(g(aVar)));
        if (aVar == null || (str = aVar.getString(aVar.f43702d + 1)) == null) {
            str = "";
        }
        lVarArr[4] = new jz5.l("chat_username", str);
        lVarArr[5] = new jz5.l("forward_msgtype", java.lang.Integer.valueOf(c17));
        lVarArr[6] = new jz5.l("forward_from_scene", java.lang.Integer.valueOf(k(i17)));
        lVarArr[7] = new jz5.l("forward_source_scene", java.lang.Integer.valueOf(d(i17, aVar != null ? aVar.getString(aVar.f43702d + 1) : null)));
        return kz5.c1.k(lVarArr);
    }

    public final int c(co.a aVar, int i17) {
        if (aVar instanceof ld5.b) {
            return 2;
        }
        if (aVar instanceof ld5.a) {
            return 3;
        }
        if ((aVar instanceof ne5.a) && ((ne5.a) aVar).k()) {
            return 5;
        }
        if (i17 > 0) {
            return i17;
        }
        return 1;
    }

    public final int e() {
        if (com.tencent.mm.sdk.platformtools.o4.M("message_fold_config2").o("fold_button_status_int_sync", 65536) != 65536) {
            return com.tencent.mm.sdk.platformtools.o4.R("message_fold_config2").o("fold_button_status_int_sync", 65536) == 131072 ? 2 : 3;
        }
        return 1;
    }

    public final java.lang.String f(com.tencent.mm.storage.f9 f9Var, java.util.List list, long j17) {
        if (f9Var == null || list.isEmpty()) {
            return "{\"msg_type\": 0; \"inner_msg_type\": 0; \"send_time\": " + j17 + "; \"toUserid\": 0}";
        }
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = f9Var.getType();
        kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        if (f9Var.k2()) {
            f0Var.f310116d = 49;
            r05.k kVar = new r05.k();
            java.lang.String j18 = f9Var.j();
            if (j18 == null) {
                j18 = "";
            }
            kVar.fromXml(j18);
            f0Var2.f310116d = kVar.getInteger(kVar.f368365d + 6);
        }
        return kz5.n0.g0(list, "#", null, null, 0, null, new com.tencent.mm.ui.mvvm.uic.conversation.recent.c(f0Var, f0Var2, j17), 30, null);
    }

    public final int g(co.a aVar) {
        if (aVar == null) {
            return 0;
        }
        if (aVar instanceof ld5.b) {
            java.util.LinkedList k17 = ((ld5.b) aVar).k();
            if (k17 != null) {
                return k17.size();
            }
            return 0;
        }
        if (!(aVar instanceof ld5.a)) {
            return aVar.getLong(aVar.f43702d + 0) > 0 ? 1 : 0;
        }
        java.util.LinkedList j17 = ((ld5.a) aVar).j();
        if (j17 != null) {
            return j17.size();
        }
        return 0;
    }

    public final java.lang.String h(co.a aVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (aVar instanceof ld5.b) {
            ld5.b bVar = (ld5.b) aVar;
            java.util.LinkedList k17 = bVar.k();
            if (k17 != null) {
                java.util.Iterator it = k17.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.storage.f9 k18 = pt0.f0.f358209b1.k(bVar.getString(bVar.f43702d + 1), ((java.lang.Number) it.next()).longValue());
                    if (k18 != null) {
                        arrayList.add(k18);
                    }
                }
            }
        } else if (aVar instanceof ld5.a) {
            ld5.a aVar2 = (ld5.a) aVar;
            java.util.LinkedList j17 = aVar2.j();
            if (j17 != null) {
                java.util.Iterator it6 = j17.iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.storage.f9 k19 = pt0.f0.f358209b1.k(aVar2.getString(aVar2.f43702d + 1), ((java.lang.Number) it6.next()).longValue());
                    if (k19 != null) {
                        arrayList.add(k19);
                    }
                }
            }
        } else {
            com.tencent.mm.storage.f9 k27 = pt0.f0.f358209b1.k(aVar != null ? aVar.getString(aVar.f43702d + 1) : null, aVar != null ? aVar.getLong(aVar.f43702d + 0) : 0L);
            if (k27 != null) {
                arrayList.add(k27);
            }
        }
        return kz5.n0.g0(arrayList, "#", null, null, 0, null, com.tencent.mm.ui.mvvm.uic.conversation.recent.d.f209283d, 30, null);
    }

    public final java.lang.String i() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            return c01.z1.r();
        }
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.ui.mvvm.uic.conversation.recent.a.class);
        java.lang.String str = iPCString != null ? iPCString.f68406d : null;
        return str == null ? "" : str;
    }

    public final int j(java.lang.String toUser, java.lang.String str) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (com.tencent.mm.storage.z3.R4(toUser)) {
            return 4;
        }
        if (kotlin.jvm.internal.o.b(toUser, str)) {
            return 1;
        }
        return kotlin.jvm.internal.o.b(toUser, "filehelper") ? 2 : 3;
    }

    public final void o(java.lang.String str, int i17) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_profile", "view_clk", kz5.c1.m(f209300g, kz5.c1.k(new jz5.l("forward_sid", f209295b), new jz5.l("forw_confirm_screen_from", java.lang.Integer.valueOf(f209297d)), new jz5.l("forward_ack_profile_clk_type", java.lang.Integer.valueOf(i17)), new jz5.l("forward_obj_list", f209298e))), 32337);
    }
}
