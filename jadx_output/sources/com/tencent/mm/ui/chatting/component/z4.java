package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public abstract class z4 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f200360a = new com.tencent.mm.ui.chatting.component.a5();

    public static void a(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, android.content.Intent intent) {
        if (dVar == null || f9Var == null || intent == null) {
            return;
        }
        java.lang.String x17 = dVar.x();
        java.lang.String d17 = dVar.u().d1();
        boolean z17 = ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar.f460708c.a(sb5.f.class))).f198753r;
        if (dVar.C() || z17) {
            if (dVar.C()) {
                java.lang.String s17 = c01.w9.s(f9Var.j());
                if (d17 != null && s17 != null && s17.length() > 0) {
                    d17 = s17;
                }
            } else {
                d17 = f9Var.u0();
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (dVar.C()) {
            bundle.putInt("stat_scene", 2);
        } else {
            bundle.putInt("stat_scene", c01.e2.G(x17) ? 7 : 1);
        }
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(f9Var.I0()));
        bundle.putString("stat_chat_talker_username", x17);
        bundle.putString("stat_send_msg_user", d17);
        intent.putExtra("_stat_obj", bundle);
    }

    public static boolean b(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String j17 = f9Var.j();
        m11.b0 b0Var = null;
        ot0.q v17 = !com.tencent.mm.sdk.platformtools.t8.K0(j17) ? ot0.q.v(j17) : null;
        if (f9Var.J2()) {
            if (f9Var.getMsgId() > 0) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                b0Var = m11.b1.Di().T1(f9Var.Q0(), f9Var.getMsgId());
            }
            if ((b0Var == null || b0Var.f322633a <= 0) && f9Var.I0() > 0) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                b0Var = m11.b1.Di().b2(f9Var.Q0(), f9Var.I0());
            }
            if (b0Var == null) {
                return false;
            }
            boolean f17 = f(f9Var, m11.c0.c(f9Var, b0Var));
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingLogic", "checkFavMsgExpired image:" + f17);
            return f17;
        }
        if (f9Var.isVideo() || f9Var.Y2()) {
            boolean f18 = f(f9Var, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22571s, f9Var.z0(), false));
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingLogic", "checkFavMsgExpired video:" + f18);
            return f18;
        }
        if (f9Var.k2() && v17 != null && v17.f348666i == 6) {
            boolean c17 = ez.v0.f257777a.c(f9Var, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingLogic", "checkFavMsgExpired file:" + c17);
            return c17;
        }
        if (f9Var.k2() && v17 != null && v17.f348666i == 24) {
            boolean g17 = g(f9Var, v17);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingLogic", "checkFavMsgExpired note:" + g17);
            return g17;
        }
        if (!f9Var.k2() || v17 == null || v17.f348666i != 19) {
            return false;
        }
        boolean g18 = g(f9Var, v17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingLogic", "checkFavMsgExpired record:" + g18);
        return g18;
    }

    public static boolean c(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        return !f9Var.n2() ? f(f9Var, str) : d(f9Var, str, new com.tencent.mm.ui.chatting.component.z4$$b());
    }

    public static boolean d(java.lang.Object obj, java.lang.String str, java.util.function.Function function) {
        java.lang.Long valueOf;
        java.lang.String string;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.vfs.w6.j(str)) {
            return false;
        }
        long a17 = c01.id.a();
        boolean z17 = obj instanceof com.tencent.mm.storage.f9;
        if (z17) {
            valueOf = java.lang.Long.valueOf(((com.tencent.mm.storage.f9) obj).getCreateTime());
        } else {
            if (!(obj instanceof oi3.g)) {
                throw new java.lang.IllegalArgumentException("Unsupported message type");
            }
            oi3.g gVar = (oi3.g) obj;
            valueOf = java.lang.Long.valueOf(gVar.getLong(gVar.f345617d + 2));
        }
        long longValue = valueOf.longValue();
        long j17 = a17 - longValue;
        l15.c cVar = new l15.c();
        if (z17) {
            string = ((com.tencent.mm.storage.f9) obj).j();
        } else {
            if (!(obj instanceof oi3.g)) {
                throw new java.lang.IllegalArgumentException("Unsupported message type");
            }
            oi3.g gVar2 = (oi3.g) obj;
            string = gVar2.getString(gVar2.f345617d + 13);
        }
        cVar.fromXml(string);
        return (cVar.l() == null || cVar.l().l() <= longValue / 1000) ? j17 > ((java.lang.Long) function.apply(obj)).longValue() : a17 / 1000 > cVar.l().l();
    }

    public static boolean e(com.tencent.mm.storage.f9 f9Var) {
        return c01.id.a() - f9Var.getCreateTime() > h(f9Var);
    }

    public static boolean f(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        long a17 = c01.id.a();
        long createTime = f9Var.getCreateTime();
        if (a17 - createTime <= h(f9Var)) {
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.vfs.w6.j(str)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingLogic", "cur time: %s, msg time: %s, path: %s.", java.lang.Long.valueOf(a17), java.lang.Long.valueOf(createTime), str);
        return true;
    }

    public static boolean g(com.tencent.mm.storage.f9 f9Var, ot0.q qVar) {
        java.lang.String str;
        boolean f17 = f(f9Var, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingLogic", "checkRecordOrNoteExpired msgTimeExpired:" + f17);
        if (f17 && (str = qVar.f348663h0) != null) {
            r45.ul5 c17 = com.tencent.mm.pluginsdk.model.x1.c(str);
            java.lang.String Q0 = f9Var.Q0();
            long msgId = f9Var.getMsgId();
            if (c17 != null) {
                java.util.Iterator it = c17.f387465f.iterator();
                while (it.hasNext()) {
                    r45.gp0 dataItem = (r45.gp0) it.next();
                    ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
                    kotlin.jvm.internal.o.g(dataItem, "dataItem");
                    java.lang.String H = bt3.g2.H(dataItem, Q0, msgId, 1);
                    kotlin.jvm.internal.o.f(H, "getThumbPath(...)");
                    ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
                    java.lang.String t17 = bt3.g2.t(dataItem, Q0, msgId, 1);
                    kotlin.jvm.internal.o.f(t17, "getDataPath(...)");
                    boolean z17 = dataItem.f375418l1 == 0;
                    boolean z18 = dataItem.R == 0;
                    int i17 = dataItem.I;
                    if (i17 == 2 || i17 == 4 || i17 == 15) {
                        z18 = false;
                    }
                    if (!z18 && !com.tencent.mm.vfs.w6.j(t17)) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkData not exist, dataId:");
                        java.lang.String str2 = dataItem.T;
                        sb6.append(str2 != null ? str2 : "");
                        sb6.append(", orgnPath:");
                        sb6.append(t17);
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingLogic", sb6.toString());
                        return true;
                    }
                    if (!z17 && !com.tencent.mm.vfs.w6.j(H)) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkThumb not exist, dataId:");
                        java.lang.String str3 = dataItem.T;
                        sb7.append(str3 != null ? str3 : "");
                        sb7.append(", orgnThumbPath:");
                        sb7.append(H);
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingLogic", sb7.toString());
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static long h(com.tencent.mm.storage.f9 f9Var) {
        return i(f9Var, new com.tencent.mm.ui.chatting.component.z4$$c());
    }

    public static long i(java.lang.Object obj, java.util.function.Function function) {
        if (obj == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.ChattingLogic", "getMsgExpireIntervalTime, msg is null.");
            return ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MsgCommonMediaExpiredInterval", 1209600) * 1000;
        }
        java.lang.String str = (java.lang.String) function.apply(obj);
        long b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b(r7, 1209600) * 1000;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingLogic", "getMsgExpireIntervalTime, type=%s, configKey=%s, interval=%d", str, (java.lang.String) ((java.util.HashMap) f200360a).getOrDefault(str, "MsgCommonMediaExpiredInterval"), java.lang.Long.valueOf(b17));
        return b17;
    }

    public static android.view.ViewStub j(com.tencent.mm.ui.MMFragment mMFragment, int i17) {
        android.view.ViewStub viewStub = (android.view.ViewStub) mMFragment.findViewById(i17);
        if (viewStub != null) {
            viewStub.inflate();
        }
        return viewStub;
    }

    public static boolean k(java.lang.String str) {
        int i17;
        if (!c01.e2.J(str)) {
            if ((com.tencent.mm.storage.z3.O4(str) || com.tencent.mm.storage.z3.m4(str)) && !c01.z1.J(str)) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
                if (n17 != null) {
                    int type = n17.getType();
                    com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(n17.J0(), true);
                    i17 = n18 != null ? n18.getType() : -1;
                    r1 = type;
                } else {
                    i17 = -1;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.ChattingLogic", "isStranger:%s type:%d etype:%d", str, java.lang.Integer.valueOf(r1), java.lang.Integer.valueOf(i17));
                return true;
            }
        }
        return false;
    }
}
