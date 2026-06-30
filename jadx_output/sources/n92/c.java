package n92;

/* loaded from: classes8.dex */
public final class c extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f335909t;

    /* renamed from: u, reason: collision with root package name */
    public cz2.f f335910u;

    /* renamed from: v, reason: collision with root package name */
    public final org.json.JSONObject f335911v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String source) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(source, "source");
        java.lang.String str = "Cgi.FinderInit#" + source + '@' + hashCode();
        this.f335909t = str;
        this.f335910u = cz2.f.f225004f;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.wb1 wb1Var = new r45.wb1();
        wb1Var.set(2, db2.t4.f228171a.a(3930));
        g92.b bVar = g92.b.f269769e;
        r45.cu5 cu5Var = (r45.cu5) bVar.k2().d().getCustom(1);
        wb1Var.set(1, cu5Var == null ? new r45.cu5() : cu5Var);
        com.tencent.mm.protobuf.g byteString = bVar.k2().d().getByteString(29);
        wb1Var.set(3, byteString == null ? new com.tencent.mm.protobuf.g(new byte[0], 0, 0) : byteString);
        wb1Var.set(5, java.lang.Integer.valueOf(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().W0()));
        jz5.l ck6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ck(true);
        wb1Var.set(6, java.lang.Float.valueOf(((java.lang.Number) ck6.f302833d).floatValue()));
        wb1Var.set(7, java.lang.Float.valueOf(((java.lang.Number) ck6.f302834e).floatValue()));
        lVar.f70664a = wb1Var;
        r45.xb1 xb1Var = new r45.xb1();
        xb1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) xb1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = xb1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderinit";
        lVar.f70667d = 3930;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i(str, "[CgiFinderInit]");
        this.f335911v = new org.json.JSONObject();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v95 */
    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        int i19;
        boolean z17;
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i27;
        int i28;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        r45.id1 id1Var;
        r45.id1 id1Var2;
        r45.en enVar;
        r45.sl0 sl0Var;
        r45.sl0 sl0Var2;
        java.util.LinkedList<r45.gk> list;
        r45.ng7 ng7Var;
        java.util.LinkedList<r45.f90> list2;
        r45.l21 l21Var;
        java.lang.Object obj4;
        r45.xb1 resp = (r45.xb1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.String str2 = this.f335909t;
        com.tencent.mars.xlog.Log.i(str2, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
        if (i17 >= 4) {
            this.f335910u = cz2.f.f225002d;
        }
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = g92.b.f269769e.h6().f324986i;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next instanceof l92.a) {
                arrayList3.add(next);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList3.iterator();
        while (true) {
            z17 = false;
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next2 = it6.next();
            if ((((l92.a) next2).b() != this.f70646f.f70713d ? 0 : 1) != 0) {
                arrayList4.add(next2);
            }
        }
        java.util.Iterator it7 = arrayList4.iterator();
        while (true) {
            boolean hasNext = it7.hasNext();
            jSONObject = this.f335911v;
            if (!hasNext) {
                break;
            }
            ((l92.a) it7.next()).a(i17, i18, str, resp, jSONObject);
            i19 = i19;
            arrayList4 = arrayList4;
            z17 = false;
        }
        int i29 = i19;
        java.util.ArrayList arrayList5 = arrayList4;
        if (i17 == 0 && i18 == 0) {
            g92.b bVar = g92.b.f269769e;
            com.tencent.mm.protobuf.g byteString = bVar.k2().d().getByteString(30);
            m92.f fVar2 = new m92.f();
            fVar2.d().set(i29, (r45.cu5) resp.getCustom(2));
            fVar2.d().set(29, resp.getByteString(37));
            fVar2.set(0, resp.getString(22));
            r45.lb4 lb4Var = new r45.lb4();
            lb4Var.parseFrom(resp.toByteArray());
            lb4Var.set(31, java.lang.Boolean.TRUE);
            fVar2.set(3, lb4Var);
            if (fVar2.d().getByteString(30) == null) {
                com.tencent.mars.xlog.Log.i(str2, "finder_shop_init_buffer null, don't replace");
                fVar2.d().set(30, byteString);
            }
            fVar2.set(4, java.lang.Integer.valueOf(resp.getInteger(11)));
            fVar2.set(5, java.lang.Long.valueOf(resp.getLong(12)));
            com.tencent.mars.xlog.Log.i(str2, "[successful] current_alias_role_type:" + fVar2.getInteger(4) + ", next_alias_mod_available_time:" + fVar2.getLong(5));
            bVar.S1(fVar2, m92.j.f324994i);
            java.util.LinkedList<r45.qz0> list3 = resp.getList(23);
            kotlin.jvm.internal.o.f(list3, "getContacts(...)");
            for (r45.qz0 qz0Var : list3) {
                kotlin.jvm.internal.o.d(qz0Var);
                g92.b.f269769e.C(m92.d.b(qz0Var), m92.j.f324994i);
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) qz0Var.getCustom(0);
                if (finderContact != null) {
                    ya2.h.f460484a.j(finderContact);
                }
            }
            r45.l21 l21Var2 = null;
            if (resp.getInteger(8) > 0) {
                g92.b.f269769e.m5(m92.j.f324994i);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1279L, 26L, 1L);
            } else {
                java.util.LinkedList list4 = resp.getList(23);
                kotlin.jvm.internal.o.f(list4, "getContacts(...)");
                if (((list4.isEmpty() ? 1 : 0) ^ i29) != 0) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList(g92.a.K6(g92.b.f269769e, false, i29, null));
                    pm0.v.b0(arrayList6, new n92.b(resp));
                    java.util.Iterator it8 = arrayList6.iterator();
                    while (it8.hasNext()) {
                        m92.b bVar2 = (m92.b) it8.next();
                        g92.b bVar3 = g92.b.f269769e;
                        java.lang.String field_username = bVar2.field_username;
                        kotlin.jvm.internal.o.f(field_username, "field_username");
                        bVar3.V4(field_username, m92.j.f324994i);
                    }
                }
            }
            g92.b bVar4 = g92.b.f269769e;
            java.lang.String string = resp.getString(22);
            if (string == null) {
                string = "";
            }
            bVar4.A1(string);
            java.util.LinkedList list5 = resp.getList(30);
            kotlin.jvm.internal.o.f(list5, "getFinder_config_item(...)");
            java.util.Iterator it9 = list5.iterator();
            while (true) {
                if (it9.hasNext()) {
                    obj = it9.next();
                    if (kotlin.jvm.internal.o.b(((r45.yy0) obj).getString(0), "usefindergetcommentlist")) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            r45.yy0 yy0Var = (r45.yy0) obj;
            if (yy0Var != null) {
                g92.b bVar5 = g92.b.f269769e;
                com.tencent.mm.protobuf.g byteString2 = yy0Var.getByteString(i29);
                bVar5.p2(kotlin.jvm.internal.o.b(byteString2 != null ? byteString2.i() : null, "1"));
            }
            java.util.LinkedList list6 = resp.getList(30);
            kotlin.jvm.internal.o.f(list6, "getFinder_config_item(...)");
            java.util.Iterator it10 = list6.iterator();
            while (true) {
                if (it10.hasNext()) {
                    obj2 = it10.next();
                    if (kotlin.jvm.internal.o.b(((r45.yy0) obj2).getString(0), "use_new_notice_icon_style_in_feed")) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            r45.yy0 yy0Var2 = (r45.yy0) obj2;
            if (yy0Var2 != null) {
                c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
                com.tencent.mm.protobuf.g byteString3 = yy0Var2.getByteString(i29);
                boolean b17 = kotlin.jvm.internal.o.b(byteString3 != null ? byteString3.i() : null, "1");
                b92.d1 d1Var = (b92.d1) zbVar;
                d1Var.getClass();
                com.tencent.mars.xlog.Log.i("FinderCommonLiveService", "set isLiveNoticeFeedJumperEnable " + b17);
                d1Var.f18412d = b17;
            }
            java.util.LinkedList list7 = resp.getList(30);
            kotlin.jvm.internal.o.f(list7, "getFinder_config_item(...)");
            java.util.Iterator it11 = list7.iterator();
            while (true) {
                if (it11.hasNext()) {
                    obj3 = it11.next();
                    if (kotlin.jvm.internal.o.b(((r45.yy0) obj3).getString(0), "finder_live_mention_reddot_switch")) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            r45.yy0 yy0Var3 = (r45.yy0) obj3;
            if (yy0Var3 != null) {
                ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).wj(yy0Var3.getByteString(i29));
            }
            r45.zy0 zy0Var = new r45.zy0();
            zy0Var.set(0, resp.getList(30));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_INIT_CONF_LIST_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(zy0Var.toByteArray()));
            pf5.u uVar = pf5.u.f353936a;
            ((ey2.j) ((xy2.e) uVar.e(zy2.b6.class).c(xy2.e.class))).Q6(resp);
            ((ey2.g1) ((xy2.j) uVar.e(zy2.b6.class).c(xy2.j.class))).O6(resp);
            com.tencent.mm.plugin.finder.assist.i2.f102246a.a(resp);
            ((ey2.l1) ((xy2.l) uVar.e(zy2.b6.class).c(xy2.l.class))).N6(resp);
            ((ey2.c2) ((xy2.n) uVar.e(zy2.b6.class).c(xy2.n.class))).P6(resp);
            ((ey2.w) ((xy2.f) uVar.e(zy2.b6.class).c(xy2.f.class))).N6(resp);
            ((ey2.c0) ((xy2.g) uVar.e(zy2.b6.class).c(xy2.g.class))).N6(resp);
            ((ey2.u0) ((xy2.h) uVar.e(zy2.b6.class).c(xy2.h.class))).N6(resp);
            ((ey2.b2) ((xy2.m) uVar.e(zy2.b6.class).c(xy2.m.class))).N6(resp);
            ((ey2.v0) ((xy2.i) uVar.e(zy2.b6.class).c(xy2.i.class))).N6(resp);
            ((ey2.h1) ((xy2.k) uVar.e(zy2.b6.class).c(xy2.k.class))).N6(resp);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().u(resp);
            java.util.LinkedList list8 = resp.getList(31);
            kotlin.jvm.internal.o.f(list8, "getExpt_buffers(...)");
            java.util.Iterator it12 = list8.iterator();
            while (true) {
                if (!it12.hasNext()) {
                    break;
                }
                com.tencent.mm.protobuf.g gVar = (com.tencent.mm.protobuf.g) it12.next();
                try {
                    l21Var = new r45.l21();
                    l21Var.parseFrom(gVar.g());
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e(str2, java.lang.String.valueOf(th6.getMessage()));
                    l21Var = l21Var2;
                }
                if (l21Var != null) {
                    int i37 = 0;
                    java.util.LinkedList list9 = l21Var.getList(0);
                    if (list9 != null) {
                        java.util.Iterator it13 = list9.iterator();
                        while (true) {
                            if (!it13.hasNext()) {
                                obj4 = l21Var2;
                                break;
                            }
                            obj4 = it13.next();
                            if (kotlin.jvm.internal.o.b(((r45.k21) obj4).getString(i37), "finder_getrelatedlist_support_backup_scenes")) {
                                break;
                            } else {
                                i37 = 0;
                            }
                        }
                        r45.k21 k21Var = (r45.k21) obj4;
                        if (k21Var != null) {
                            java.lang.String string2 = k21Var.getString(i29);
                            if (string2 != null) {
                                com.tencent.mars.xlog.Log.i(str2, "finderGetRelatedlistSupportBackupScenes:".concat(string2));
                                java.util.ArrayList g47 = g92.b.f269769e.g4();
                                g47.clear();
                                for (java.lang.String str3 : (java.lang.String[]) r26.n0.f0(string2, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0])) {
                                    try {
                                        g47.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str3)));
                                    } catch (java.lang.NumberFormatException unused) {
                                        com.tencent.mars.xlog.Log.e(str2, "finderGetRelatedlistSupportBackupScenes 跳过非数字字符: " + str3);
                                    }
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
                l21Var2 = null;
                i29 = 1;
            }
            iz2.c cVar = (iz2.c) uVar.e(zy2.b6.class).c(iz2.c.class);
            r45.kz2 kz2Var = (r45.kz2) resp.getCustom(34);
            if (kz2Var == null) {
                kz2Var = new r45.kz2();
            }
            ((com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) cVar).W6(kz2Var, "FinderInit");
            com.tencent.mars.xlog.Log.i(str2, "[successful] resp.teenager_info=" + ((r45.kz2) resp.getCustom(34)));
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_NEGATIVE_FEED_BACK_CONF_STRING_SYNC;
            r45.hk2 hk2Var = (r45.hk2) resp.getCustom(41);
            c17.x(u3Var, com.tencent.mm.sdk.platformtools.t8.l(hk2Var != null ? hk2Var.toByteArray() : null));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[successful] negative_feedback_conf=");
            r45.hk2 hk2Var2 = (r45.hk2) resp.getCustom(41);
            ?? r27 = hk2Var2 != null ? (r45.dt4) hk2Var2.getCustom(0) : null;
            sb6.append(pm0.b0.g(r27 != null ? r27 : ""));
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINDER_GET_MENTION_CONFIG_INT_SYNC;
            r45.sg2 sg2Var = (r45.sg2) resp.getCustom(39);
            if (sg2Var != null) {
                i27 = 0;
                i28 = sg2Var.getInteger(0);
            } else {
                i27 = 0;
                i28 = 0;
            }
            c18.x(u3Var2, java.lang.Integer.valueOf(i28));
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[successful] mention_config=");
            r45.sg2 sg2Var2 = (r45.sg2) resp.getCustom(39);
            sb7.append(sg2Var2 != null ? java.lang.Integer.valueOf(sg2Var2.getInteger(i27)) : null);
            com.tencent.mars.xlog.Log.i(str2, sb7.toString());
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().U((r45.at2) resp.getCustom(40));
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[successful] finder_reddot_freq_config=");
            r45.at2 at2Var = (r45.at2) resp.getCustom(40);
            int i38 = 10;
            if (at2Var == null || (list2 = at2Var.getList(0)) == null) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
                for (r45.f90 f90Var : list2) {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                    sb9.append(f90Var.getInteger(0));
                    sb9.append('_');
                    sb9.append(f90Var.getInteger(1));
                    arrayList.add(sb9.toString());
                }
            }
            sb8.append(arrayList);
            sb8.append(",stay_entry_min_duration=");
            r45.at2 at2Var2 = (r45.at2) resp.getCustom(40);
            sb8.append(at2Var2 != null ? java.lang.Integer.valueOf(at2Var2.getInteger(1)) : null);
            sb8.append(",simul_expose_max_count_limit=");
            r45.at2 at2Var3 = (r45.at2) resp.getCustom(40);
            sb8.append(at2Var3 != null ? java.lang.Integer.valueOf(at2Var3.getInteger(2)) : null);
            sb8.append(",x_strategy=");
            r45.at2 at2Var4 = (r45.at2) resp.getCustom(40);
            sb8.append((at2Var4 == null || (ng7Var = (r45.ng7) at2Var4.getCustom(3)) == null) ? null : ng7Var.getList(1));
            sb8.append(",biz_control_items=");
            r45.at2 at2Var5 = (r45.at2) resp.getCustom(40);
            if (at2Var5 == null || (list = at2Var5.getList(4)) == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (r45.gk gkVar : list) {
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                    sb10.append(gkVar.getInteger(2));
                    sb10.append(",n_m=");
                    java.util.LinkedList<r45.f90> list10 = gkVar.getList(1);
                    kotlin.jvm.internal.o.f(list10, "getControl_items(...)");
                    java.util.ArrayList arrayList7 = new java.util.ArrayList(kz5.d0.q(list10, i38));
                    for (r45.f90 f90Var2 : list10) {
                        java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                        sb11.append(f90Var2.getInteger(0));
                        sb11.append('_');
                        sb11.append(f90Var2.getInteger(1));
                        arrayList7.add(sb11.toString());
                    }
                    sb10.append(arrayList7);
                    arrayList2.add(sb10.toString());
                    i38 = 10;
                }
            }
            sb8.append(arrayList2);
            sb8.append(",exempt_strategy=");
            r45.at2 at2Var6 = (r45.at2) resp.getCustom(40);
            sb8.append((at2Var6 == null || (sl0Var2 = (r45.sl0) at2Var6.getCustom(5)) == null) ? null : sl0Var2.getList(0));
            sb8.append(",is_count_with_x=");
            r45.at2 at2Var7 = (r45.at2) resp.getCustom(40);
            sb8.append((at2Var7 == null || (sl0Var = (r45.sl0) at2Var7.getCustom(5)) == null) ? null : java.lang.Boolean.valueOf(sl0Var.getBoolean(1)));
            sb8.append(",biz_x_strategy=");
            r45.at2 at2Var8 = (r45.at2) resp.getCustom(40);
            sb8.append((at2Var8 == null || (enVar = (r45.en) at2Var8.getCustom(6)) == null) ? null : enVar.getList(0));
            com.tencent.mars.xlog.Log.i(str2, sb8.toString());
            r45.ls2 ls2Var = (r45.ls2) resp.getCustom(32);
            java.lang.Integer valueOf = (ls2Var == null || (id1Var2 = (r45.id1) ls2Var.getCustom(3)) == null) ? null : java.lang.Integer.valueOf(id1Var2.getInteger(0));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LBS_SAMECITY_SWITCH_CONFIG_INT_SYNC, java.lang.Integer.valueOf(valueOf != null ? valueOf.intValue() : 0));
            com.tencent.mars.xlog.Log.i(str2, "[successful] cityConfig=" + valueOf);
            r45.ls2 ls2Var2 = (r45.ls2) resp.getCustom(32);
            if (ls2Var2 != null && (id1Var = (r45.id1) ls2Var2.getCustom(3)) != null) {
                int integer = id1Var.getInteger(1);
                i95.m c19 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                ((cq.k) c19).f221228i = java.lang.Integer.valueOf(integer);
            }
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder("[successful] resp.my_finder_tab_show_info_list=");
            java.util.LinkedList<r45.ct4> list11 = resp.getList(36);
            kotlin.jvm.internal.o.f(list11, "getMy_finder_tab_show_info_list(...)");
            java.util.ArrayList arrayList8 = new java.util.ArrayList(kz5.d0.q(list11, 10));
            for (r45.ct4 ct4Var : list11) {
                arrayList8.add(ct4Var.getString(1) + '#' + ct4Var.getInteger(3) + '#' + ct4Var.getLong(2) + '#' + ct4Var.getString(0));
            }
            sb12.append(arrayList8);
            com.tencent.mars.xlog.Log.i(str2, sb12.toString());
            jSONObject2 = jSONObject;
        } else {
            com.tencent.mars.xlog.Log.e(str2, "[failure] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
            jSONObject2 = jSONObject;
            jSONObject2.put("failure", "errType=" + i17 + " errType=" + i17 + " errMsg=" + str);
        }
        java.util.Iterator it14 = arrayList5.iterator();
        while (it14.hasNext()) {
            ((l92.a) it14.next()).c(i17, i18, str, resp, jSONObject2);
        }
    }

    @Override // az2.j, com.tencent.mm.modelbase.i
    public pq5.g l() {
        com.tencent.mars.xlog.Log.i(this.f335909t, "[run]... ");
        return super.l();
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return this.f335910u;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f335911v;
    }
}
