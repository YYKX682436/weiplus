package h61;

/* loaded from: classes9.dex */
public abstract class o {
    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(str2);
        boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(str);
        if (z17) {
            sb6.append(str2);
        }
        if (z17 && z18) {
            sb6.append("\n");
        }
        if (z18) {
            sb6.append(str);
        }
        return sb6.toString();
    }

    public static void b(java.lang.String str) {
        gm0.j1.i();
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_RECENT_LAUNCH_AA_GROUP_STRING_SYNC, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(",");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            int i17 = 1;
            for (java.lang.String str3 : str2.split(",")) {
                if (!str3.equals(str) && i17 < 5) {
                    sb6.append(str3);
                    sb6.append(",");
                    i17++;
                }
            }
        }
        sb6.deleteCharAt(sb6.length() - 1);
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_RECENT_LAUNCH_AA_GROUP_STRING_SYNC, sb6.toString());
    }

    public static synchronized void c(java.lang.String str, java.lang.String str2, com.tencent.mm.autogen.events.ReceiveAANewXmlEvent receiveAANewXmlEvent) {
        j61.c z07;
        synchronized (h61.o.class) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                ot0.q v17 = ot0.q.v(str);
                str.trim().replace(" ", "");
                if (v17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(v17.f348736z1)) {
                    java.lang.String str3 = v17.f348736z1;
                    j61.c z08 = e61.e.wi().z0(str3);
                    java.lang.Object[] objArr = new java.lang.Object[5];
                    boolean z17 = true;
                    objArr[0] = java.lang.Boolean.valueOf(z08 == null);
                    objArr[1] = str3;
                    if (z08 == null || !z08.field_insertmsg) {
                        z17 = false;
                    }
                    objArr[2] = java.lang.Boolean.valueOf(z17);
                    objArr[3] = str2;
                    objArr[4] = java.lang.Long.valueOf(z08 != null ? z08.field_localMsgId : 0L);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "checkIfInsertAAMsg, record==null: %s, billNo: %s, insertMsg: %s, chatroom: %s, localMsgId: %s", objArr);
                    if (z08 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AAUtil", "checkIfInsertAAMsg, record is null, ignore");
                        m(str3, false, 0L);
                    }
                    if (z08 != null && z08.field_insertmsg) {
                        long j17 = z08.field_localMsgId;
                        if (j17 > 0 && pt0.f0.Li(str2, j17).getMsgId() <= 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "checkIfInsertAAMsg, the oldMsgInfo has deleted, ignore this");
                            e61.e.wi().delete(z08, new java.lang.String[0]);
                            return;
                        }
                    }
                    if (z08 != null && z08.field_insertmsg && z08.field_localMsgId > 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "checkIfInsertAAMsg, update aa msg");
                        s(str2, z08.field_localMsgId, str);
                        if (receiveAANewXmlEvent != null) {
                            long j18 = z08.field_localMsgId;
                            long j19 = receiveAANewXmlEvent.f54651g.f7925f;
                            synchronized (h61.o.class) {
                                com.tencent.mm.storage.f9 Li = pt0.f0.Li(str2, j18);
                                Li.o1(j19);
                                pt0.f0.f358209b1.s(Li.Q0(), Li.getMsgId(), Li);
                            }
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "checkIfInsertAAMsg, insert new aa msg");
                    l(str, str2);
                    if (receiveAANewXmlEvent != null && (z07 = e61.e.wi().z0(str3)) != null) {
                        long j27 = z07.field_localMsgId;
                        long j28 = receiveAANewXmlEvent.f54651g.f7925f;
                        synchronized (h61.o.class) {
                            com.tencent.mm.storage.f9 Li2 = pt0.f0.Li(str2, j27);
                            Li2.o1(j28);
                            pt0.f0.f358209b1.s(Li2.Q0(), Li2.getMsgId(), Li2);
                        }
                    }
                }
            }
        }
    }

    public static double d(java.lang.String str, java.lang.String str2, int i17, int i18) {
        try {
            return new java.math.BigDecimal(com.tencent.mm.sdk.platformtools.t8.F(str.trim(), 0.0d) == 0.0d ? "0" : str.trim()).divide(new java.math.BigDecimal(str2.trim()), i17, i18).doubleValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AAUtil", e17, "", new java.lang.Object[0]);
            return 0.0d;
        }
    }

    public static boolean e(android.app.Activity activity, r45.g0 g0Var) {
        int i17 = g0Var.f374759d;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "need realname verify");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".ui.LaunchAAUI");
            bundle.putString("realname_verify_process_jump_plugin", "aa");
            return zs4.q.g(activity, g0Var.f374760e, 0, g0Var.f374761f, g0Var.f374762g, bundle, false, null, null, 0, 2);
        }
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "need upload credit");
            zs4.q.h(activity, g0Var.f374760e, g0Var.f374763h, g0Var.f374761f, g0Var.f374762g, false, null);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "realnameGuideFlag =  " + g0Var.f374759d);
        return false;
    }

    public static r45.a0 f(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.a0 a0Var = (r45.a0) it.next();
            if (a0Var.f369572d.equals(c01.z1.r())) {
                return a0Var;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "not contains self");
        return null;
    }

    public static java.util.ArrayList g(y63.a aVar, java.util.List list) {
        y63.b bVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        for (int i17 = 1; i17 <= aVar.N.size(); i17++) {
            y63.b bVar2 = (y63.b) aVar.N.get(java.lang.Integer.valueOf(i17));
            if (bVar2 != null) {
                if (hashMap2.containsKey(bVar2.f459652a)) {
                    y63.b bVar3 = (y63.b) hashMap2.get(bVar2.f459652a);
                    java.lang.Integer num = (java.lang.Integer) hashMap3.get(bVar2.f459652a);
                    if (bVar3 != null) {
                        java.lang.String str = bVar3.f459656e;
                        java.lang.String str2 = i17 + bVar2.f459654c + bVar2.f459656e;
                        y63.b bVar4 = new y63.b();
                        bVar4.f459652a = bVar3.f459652a;
                        bVar4.f459654c = bVar3.f459654c;
                        bVar4.f459655d = bVar3.f459655d;
                        bVar4.f459656e = a(str2, str);
                        hashMap2.put(bVar4.f459652a, bVar4);
                        hashMap3.put(bVar4.f459652a, num);
                        hashMap.put(num, bVar4);
                    }
                } else {
                    int size = hashMap3.size() + 1;
                    y63.b bVar5 = new y63.b();
                    bVar5.f459652a = bVar2.f459652a;
                    bVar5.f459654c = bVar2.f459654c;
                    bVar5.f459655d = bVar2.f459655d;
                    bVar5.f459656e = i17 + bVar2.f459654c + bVar2.f459656e;
                    hashMap2.put(bVar5.f459652a, bVar5);
                    hashMap3.put(bVar5.f459652a, java.lang.Integer.valueOf(size));
                    hashMap.put(java.lang.Integer.valueOf(size), bVar5);
                }
            }
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            if (hashMap2.containsKey(str3) && (bVar = (y63.b) hashMap2.get(str3)) != null) {
                r45.bc6 bc6Var = new r45.bc6();
                bc6Var.f370667d = bVar.f459652a;
                bc6Var.f370668e = bVar.f459656e;
                arrayList.add(bc6Var);
            }
        }
        return arrayList;
    }

    public static java.util.HashMap h(y63.a aVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        for (int i17 = 1; i17 <= aVar.N.size(); i17++) {
            y63.b bVar = (y63.b) aVar.N.get(java.lang.Integer.valueOf(i17));
            if (bVar != null) {
                if (hashMap2.containsKey(bVar.f459652a)) {
                    y63.b bVar2 = (y63.b) hashMap2.get(bVar.f459652a);
                    java.lang.Integer num = (java.lang.Integer) hashMap3.get(bVar.f459652a);
                    if (bVar2 != null) {
                        java.lang.String str = bVar2.f459656e;
                        java.lang.String str2 = i17 + bVar.f459654c + bVar.f459656e;
                        y63.b bVar3 = new y63.b();
                        bVar3.f459652a = bVar2.f459652a;
                        bVar3.f459654c = bVar2.f459654c;
                        bVar3.f459655d = bVar2.f459655d;
                        bVar3.f459656e = a(str2, str);
                        hashMap2.put(bVar3.f459652a, bVar3);
                        hashMap3.put(bVar3.f459652a, num);
                        hashMap.put(num, bVar3);
                    }
                } else {
                    int size = hashMap3.size() + 1;
                    y63.b bVar4 = new y63.b();
                    bVar4.f459652a = bVar.f459652a;
                    bVar4.f459654c = bVar.f459654c;
                    bVar4.f459655d = bVar.f459655d;
                    bVar4.f459656e = i17 + bVar.f459654c + bVar.f459656e;
                    hashMap2.put(bVar4.f459652a, bVar4);
                    hashMap3.put(bVar4.f459652a, java.lang.Integer.valueOf(size));
                    hashMap.put(java.lang.Integer.valueOf(size), bVar4);
                }
            }
        }
        return hashMap;
    }

    public static java.util.List i(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "illegal chatroomName");
            return new java.util.ArrayList();
        }
        if (!com.tencent.mm.storage.z3.R4(str)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(c01.z1.r());
            arrayList.add(str);
            return arrayList;
        }
        try {
            java.util.List L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(str);
            return L0 == null ? new java.util.ArrayList() : L0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AAUtil", "getChatroomMemberList error! %s", e17.getMessage());
            return new java.util.ArrayList();
        }
    }

    public static java.lang.String j(int i17, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        int length = (str.length() - str.replaceAll("\n", "").length()) + i17;
        int c17 = com.tencent.mm.ui.tools.v4.c(length, str);
        if (c17 <= 0 || c17 >= length || c17 >= str.length()) {
            return str;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(str.substring(0, c17 + 1));
        stringBuffer.append("...");
        return stringBuffer.toString();
    }

    public static java.util.ArrayList k(java.util.List list, java.lang.String str, boolean z17, boolean z18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (!z17 || !str2.equals(c01.z1.r())) {
                if (!z18 || o(str, str2)) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    public static synchronized void l(java.lang.String str, java.lang.String str2) {
        ot0.q v17;
        synchronized (h61.o.class) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (v17 = ot0.q.v(str)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(v17.f348736z1)) {
                j61.c z07 = e61.e.wi().z0(v17.f348736z1);
                java.lang.Object[] objArr = new java.lang.Object[5];
                boolean z17 = false;
                objArr[0] = v17.f348736z1;
                objArr[1] = str2;
                objArr[2] = z07;
                if (z07 != null && z07.field_insertmsg) {
                    z17 = true;
                }
                objArr[3] = java.lang.Boolean.valueOf(z17);
                objArr[4] = java.lang.Long.valueOf(z07 != null ? z07.field_localMsgId : 0L);
                com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "insertAAMsg, billNo: %s, chatroom: %s, oldRecord: %s, insertMsg: %s, localMsgId: %s", objArr);
                if (z07 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AAUtil", "insertAAMsg, record is null!!");
                    return;
                }
                if (!z07.field_insertmsg || z07.field_localMsgId <= 0) {
                    com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                    f9Var.e1(c01.w9.o(str2));
                    f9Var.setType(436207665);
                    f9Var.d1(c01.z1.r() + ":\n" + str);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
                    sb6.append(java.lang.System.currentTimeMillis());
                    java.lang.String g17 = kk.k.g(sb6.toString().getBytes());
                    ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).getClass();
                    f9Var.i1("THUMBNAIL_DIRPATH://th_" + g17);
                    f9Var.j1(1);
                    f9Var.u1(str2);
                    f9Var.r1(3);
                    f9Var.setMsgId(c01.w9.x(f9Var));
                    com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "finish insert aa msg");
                    java.lang.String cj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).cj(f9Var, bm5.f0.f22564i, g17, null, true);
                    n11.a b17 = n11.a.b();
                    java.lang.String str3 = v17.f348672j1;
                    o11.f fVar = new o11.f();
                    fVar.f342082f = cj6;
                    fVar.f342078b = true;
                    b17.h(str3, null, fVar.a());
                    m(v17.f348736z1, true, f9Var.getMsgId());
                    ot0.t tVar = new ot0.t();
                    v17.j(tVar);
                    tVar.field_msgId = f9Var.getMsgId();
                    tVar.field_msgTalker = f9Var.Q0();
                    tVar.field_msgSvrId = f9Var.I0();
                    ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).D0(tVar);
                }
            }
        }
    }

    public static synchronized void m(java.lang.String str, boolean z17, long j17) {
        synchronized (h61.o.class) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "insertOrUpdateAARecord, billNo: %s, insertMsg: %s", str, java.lang.Boolean.valueOf(z17));
                j61.c cVar = new j61.c();
                cVar.field_billNo = str;
                cVar.field_insertmsg = z17;
                cVar.field_localMsgId = j17;
                e61.e.wi().replace(cVar);
            }
        }
    }

    public static synchronized void n(java.lang.String str, java.lang.String str2, j61.a aVar, java.lang.String str3, boolean z17) {
        synchronized (h61.o.class) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.j1(0);
            f9Var.u1(str2);
            f9Var.r1(3);
            f9Var.d1(str);
            f9Var.e1(c01.w9.m(str2, java.lang.System.currentTimeMillis() / 1000));
            f9Var.setType(10000);
            if (z17) {
                f9Var.f1(f9Var.w0() | 8);
            }
            long M9 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "insertPaySysMsg, inserted msgId: %s", java.lang.Long.valueOf(M9));
            if (aVar == null) {
                aVar = new j61.a();
            }
            if (M9 > 0) {
                aVar.field_payMsgId = str3;
                aVar.field_chatroom = str2;
                aVar.field_insertmsg = true;
                aVar.field_msgId = M9;
                e61.e.Bi().replace(aVar);
            }
        }
    }

    public static boolean o(java.lang.String str, java.lang.String str2) {
        if (!com.tencent.mm.storage.z3.R4(str)) {
            return true;
        }
        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
        java.util.List m17 = c01.v1.m(str);
        if (m17 == null || ((java.util.LinkedList) m17).size() <= 0) {
            return true;
        }
        java.util.Iterator it = m17.iterator();
        while (it.hasNext()) {
            if (str2.equals((java.lang.String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static synchronized void p(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        synchronized (h61.o.class) {
            j61.c z07 = e61.e.wi().z0(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "setAARecordAfterLaunchAA, billNo: %s, chatroom: %s, msgContent==null:%s, oldRecord: %s", str, str2, java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str3)), z07);
            if (z07 == null) {
                m(str, false, 0L);
            }
            c(str3, str2, null);
        }
    }

    public static void q(android.content.Context context, java.lang.String str, boolean z17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17) {
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = new com.tencent.mm.pluginsdk.wallet.PayInfo();
        payInfo.f192114m = str;
        payInfo.f192109e = 42;
        if (z17) {
            payInfo.f192111g = 14;
        } else {
            payInfo.f192111g = 1;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("extinfo_key_1", str3);
        com.tencent.mm.plugin.wallet_core.utils.n0 a17 = com.tencent.mm.plugin.wallet_core.utils.n0.f180939e.a(str4);
        com.tencent.mm.plugin.wallet_core.utils.s0 a18 = com.tencent.mm.plugin.wallet_core.utils.s0.f180980e.a(str3);
        bundle.putInt("chat_type", a17.f180949d);
        bundle.putInt("send_type", a18.f180985d);
        payInfo.f192122u = bundle;
        com.tencent.mm.wallet_core.b.a().getClass();
        payInfo.f192122u.putString("extinfo_key_2", str2);
        ((h45.q) i95.n0.c(h45.q.class)).startSNSPay(context, payInfo);
    }

    public static double r(double d17) {
        return d("" + d17, "100", 2, 4);
    }

    public static synchronized void s(java.lang.String str, long j17, java.lang.String str2) {
        synchronized (h61.o.class) {
            if (j17 > 0) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    ot0.q v17 = ot0.q.v(str2);
                    if (v17 == null || com.tencent.mm.sdk.platformtools.t8.K0(v17.f348736z1)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, parse app msg failed, msgId: %s", java.lang.Long.valueOf(j17));
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, msgId: %s, billNo: %s", java.lang.Long.valueOf(j17), v17.f348736z1);
                        j61.c z07 = e61.e.wi().z0(v17.f348736z1);
                        if (z07 != null) {
                            long j18 = z07.field_localMsgId;
                            com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j18);
                            if (Li.getMsgId() > 0) {
                                Li.d1(c01.w9.s(Li.j()) + ":\n" + str2);
                                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j18, Li, true);
                                com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, update success, oldMsgId: %s, billNo: %s", java.lang.Long.valueOf(j18), z07.field_billNo);
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, cannot find old msg, insert new one, billNo: %s, oldMsgId: %s, newMsgId: %s, needUpdateInfo.msgId: %s", z07.field_billNo, java.lang.Long.valueOf(z07.field_localMsgId), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(Li.getMsgId()));
                            }
                        } else {
                            j61.c cVar = new j61.c();
                            cVar.field_localMsgId = j17;
                            cVar.field_billNo = v17.f348736z1;
                            cVar.field_insertmsg = true;
                            e61.e.wi().insert(cVar);
                            com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, insert new aa record, msgId: %s, billNo: %s", java.lang.Long.valueOf(j17), v17.f348736z1);
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, msgContent is null or msgId invalid, msgId: %s, %s", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str2)));
        }
    }

    public static void t(java.lang.String str, long j17, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "do update sys msg, %s, %s", java.lang.Long.valueOf(j17), str2);
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str2, "sysmsg", null);
        java.lang.String str3 = "";
        if (d17 != null) {
            java.lang.String str4 = (java.lang.String) d17.get(".sysmsg.paymsg.appmsgcontent");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AAUtil", "empty appmsgcontent!");
            } else {
                try {
                    str3 = java.net.URLDecoder.decode(str4, com.tencent.mapsdk.internal.rv.f51270c);
                } catch (java.io.UnsupportedEncodingException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AAUtil", e17.getMessage());
                }
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            Li.d1(str3);
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, Li, true);
    }
}
