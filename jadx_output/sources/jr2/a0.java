package jr2;

/* loaded from: classes8.dex */
public final class a0 implements vg3.q4 {
    public final java.util.ArrayList b(r45.or2 or2Var, int[] iArr) {
        java.lang.String str;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedList<r45.o55> list = or2Var.getList(7);
        kotlin.jvm.internal.o.f(list, "getPath_infos(...)");
        for (r45.o55 o55Var : list) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(o55Var.getInteger(0));
            r45.kb7 kb7Var = (r45.kb7) o55Var.getCustom(1);
            if (kb7Var == null) {
                kb7Var = new r45.kb7();
            }
            hashMap.put(valueOf, kb7Var);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 : iArr) {
            r45.kb7 kb7Var2 = (r45.kb7) hashMap.get(java.lang.Integer.valueOf(i17));
            if (kb7Var2 != null) {
                str = com.tencent.mm.sdk.platformtools.m2.m() ? kb7Var2.getString(0) : com.tencent.mm.sdk.platformtools.m2.n() ? kb7Var2.getString(1) : !com.tencent.mm.sdk.platformtools.m2.j() ? kb7Var2.getString(2) : kb7Var2.getString(0);
                if (str != null) {
                    arrayList.add(str);
                }
            }
            str = "";
            arrayList.add(str);
        }
        return arrayList;
    }

    public final r45.or2 c(java.util.Map map) {
        r45.or2 or2Var = new r45.or2();
        or2Var.set(0, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.msg.priority"), 0)));
        or2Var.set(1, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.msg.msg_action"), 0)));
        or2Var.set(2, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.msg.start_time"), 0)));
        or2Var.set(3, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.msg.end_time"), 0)));
        or2Var.set(4, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.msg.msg_type"), 0)));
        or2Var.set(5, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.msg.msg_ext"), 0)));
        r45.um4 um4Var = new r45.um4();
        um4Var.set(0, (java.lang.String) map.get(".sysmsg.msg.miniapp_msg.miniapp_name"));
        um4Var.set(1, (java.lang.String) map.get(".sysmsg.msg.miniapp_msg.miniapp_path"));
        um4Var.set(2, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.msg.miniapp_msg.miniapp_scene"), 0)));
        or2Var.set(6, um4Var);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i17 = 1;
        java.lang.String str = ".sysmsg.msg.path_info";
        while (map.containsKey(str)) {
            r45.kb7 kb7Var = new r45.kb7();
            kb7Var.set(0, (java.lang.String) map.get(str + ".wording.zh_cn"));
            kb7Var.set(1, (java.lang.String) map.get(str + ".wording.zh_tw"));
            kb7Var.set(2, (java.lang.String) map.get(str + ".wording.en"));
            r45.o55 o55Var = new r45.o55();
            o55Var.set(1, kb7Var);
            o55Var.set(0, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(str + ".msg_position"), 0)));
            linkedList.add(o55Var);
            str = ".sysmsg.msg.path_info" + i17;
            i17++;
        }
        or2Var.set(7, linkedList);
        return or2Var;
    }

    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map values, com.tencent.mm.modelbase.p0 p27) {
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(p27, "p2");
        if (!kotlin.jvm.internal.o.b(str, "FinderPromotion")) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderPromotionConsumer", "[FinderPromotionConsumer]");
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(".sysmsg.msg.msg_type"), 0);
        if (D1 != 1) {
            if (D1 != 2) {
                return null;
            }
            int D12 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(".sysmsg.msg.msg_action"), 0);
            com.tencent.mars.xlog.Log.i("Finder.FinderPromotionConsumer", "[dealWithRedPackWx] msgAction:" + D12);
            if (D12 != 1) {
                if (D12 != 2) {
                    return null;
                }
                zy2.fa.y0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), 1016, null, null, 6, null);
                return null;
            }
            r45.or2 c17 = c(values);
            java.util.ArrayList b17 = b(c17, new int[]{1});
            zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
            r45.vs2 vs2Var = new r45.vs2();
            vs2Var.f388490h = java.lang.String.valueOf(c01.id.c());
            vs2Var.f388486d = c17.getInteger(0);
            vs2Var.f388487e = 1016;
            r45.xs2 xs2Var = new r45.xs2();
            xs2Var.set(10, 1);
            r45.um4 um4Var = (r45.um4) c17.getCustom(6);
            xs2Var.set(11, new com.tencent.mm.protobuf.g(um4Var != null ? um4Var.toByteArray() : null));
            vs2Var.f388488f = new com.tencent.mm.protobuf.g(xs2Var.toByteArray());
            vs2Var.f388492m = c17.getInteger(2);
            int integer = c17.getInteger(3) - c01.id.e();
            if (integer < 0) {
                integer = 0;
            }
            vs2Var.f388491i = integer;
            r45.f03 f03Var = new r45.f03();
            f03Var.f373887d = 20;
            java.lang.String str2 = (java.lang.String) kz5.n0.a0(b17, 0);
            f03Var.f373889f = str2 != null ? str2 : "";
            f03Var.f373891h = 1;
            f03Var.f373892i = "CreateFinderEntrance";
            vs2Var.f388489g.add(f03Var);
            zy2.fa.D(nk6, vs2Var, "checkFinderRedPackRedDot", null, true, null, 20, null);
            com.tencent.mars.xlog.Log.i("Finder.FinderPromotionConsumer", "[dealWithRedPackFinder] starttime" + vs2Var.f388492m + ", endtime" + c17.getInteger(3) + ", title:" + f03Var.f373889f + ", expire_time" + vs2Var.f388491i);
            return null;
        }
        int D13 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(".sysmsg.msg.msg_action"), 0);
        com.tencent.mars.xlog.Log.i("Finder.FinderPromotionConsumer", "[dealWithRedPackFinder] msgAction:" + D13);
        if (D13 != 1) {
            if (D13 != 2) {
                return null;
            }
            zy2.fa.y0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), 1015, null, null, 6, null);
            return null;
        }
        r45.or2 c18 = c(values);
        java.util.ArrayList b18 = b(c18, new int[]{2, 3});
        zy2.fa nk7 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        r45.vs2 vs2Var2 = new r45.vs2();
        vs2Var2.f388490h = java.lang.String.valueOf(c01.id.c());
        vs2Var2.f388486d = 0;
        vs2Var2.f388487e = 1015;
        r45.xs2 xs2Var2 = new r45.xs2();
        xs2Var2.set(10, 1);
        r45.um4 um4Var2 = (r45.um4) c18.getCustom(6);
        xs2Var2.set(11, new com.tencent.mm.protobuf.g(um4Var2 != null ? um4Var2.toByteArray() : null));
        vs2Var2.f388488f = new com.tencent.mm.protobuf.g(xs2Var2.toByteArray());
        vs2Var2.f388492m = c18.getInteger(2);
        int integer2 = c18.getInteger(3) - c01.id.e();
        if (integer2 < 0) {
            integer2 = 0;
        }
        vs2Var2.f388491i = integer2;
        r45.f03 f03Var2 = new r45.f03();
        f03Var2.f373887d = 3;
        java.lang.String str3 = (java.lang.String) kz5.n0.a0(b18, 0);
        if (str3 == null) {
            str3 = "";
        }
        f03Var2.f373889f = str3;
        f03Var2.f373891h = 1;
        f03Var2.f373892i = "ProfileEntrance";
        vs2Var2.f388489g.add(f03Var2);
        r45.f03 f03Var3 = new r45.f03();
        f03Var3.f373887d = 20;
        java.lang.String str4 = (java.lang.String) kz5.n0.a0(b18, 1);
        f03Var3.f373889f = str4 != null ? str4 : "";
        f03Var3.f373891h = 1;
        f03Var3.f373892i = "FinderProfileBanner";
        f03Var3.f373893m = "ProfileEntrance";
        vs2Var2.f388489g.add(f03Var3);
        zy2.fa.D(nk7, vs2Var2, "checkFinderRedPackRedDot", null, true, null, 20, null);
        com.tencent.mars.xlog.Log.i("Finder.FinderPromotionConsumer", "[dealWithRedPackFinder] starttime" + vs2Var2.f388492m + ", endtime" + c18.getInteger(3) + ", title1:" + f03Var2.f373889f + " ,title2:" + f03Var3.f373889f + ", expire_time" + vs2Var2.f388491i);
        return null;
    }
}
