package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public abstract class s2 {

    /* renamed from: a, reason: collision with root package name */
    public static long f195289a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f195290b;

    /* renamed from: c, reason: collision with root package name */
    public static long f195291c;

    /* renamed from: d, reason: collision with root package name */
    public static java.util.Map f195292d;

    /* renamed from: e, reason: collision with root package name */
    public static long f195293e;

    /* renamed from: f, reason: collision with root package name */
    public static java.util.Map f195294f;

    public static final boolean a(com.tencent.mm.storage.s1 info, int i17) {
        java.util.Map l17;
        kotlin.jvm.internal.o.g(info, "info");
        if (!info.w0() || (l17 = l(info)) == null) {
            return false;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) l17.get(".msg.appmsg.mmreader." + g(i17) + ".act"))) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "checkNewDyeingTemplate false, serviceType:" + i17);
        return false;
    }

    public static final boolean b() {
        com.tencent.mm.storage.s1 J0;
        java.util.Map l17;
        long p17 = com.tencent.mm.sdk.platformtools.o4.R("brandService").p("BizLastMsgId");
        return p17 >= 0 || (J0 = r01.q3.oj().J0(p17, "msgId")) == null || !J0.w0() || (l17 = l(J0)) == null || com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) l17.get(".msg.appmsg.mmreader.notify_msg.is_show_msg_count"), 1) == 1;
    }

    public static final java.lang.String c(com.tencent.mm.storage.s1 info) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(info, "info");
        if (info.field_msgId == f195289a && (str = f195290b) != null) {
            kotlin.jvm.internal.o.d(str);
            return str;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(info.field_content, "avatar_url", null);
        if (d17 == null) {
            return "";
        }
        java.lang.String str2 = (java.lang.String) d17.get(".avatar_url");
        java.lang.String str3 = str2 != null ? str2 : "";
        f195290b = str3;
        f195289a = info.field_msgId;
        return str3;
    }

    public static final java.lang.String d(com.tencent.mm.storage.s1 info) {
        java.util.Map d17;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.storage.n2 n2Var = new com.tencent.mm.storage.n2(info);
        java.lang.String str3 = "";
        java.util.Map map = null;
        if (info.D0() || info.y0()) {
            long j17 = info.field_msgId;
            if (j17 != f195293e || (d17 = f195294f) == null) {
                f195293e = j17;
                d17 = com.tencent.mm.sdk.platformtools.aa.d(info.M, "msgsource", null);
                f195294f = d17;
            }
            map = d17;
            str = ".msgsource.notify_msg.";
        } else if (info.w0()) {
            map = l(info);
            str = ".msg.appmsg.mmreader.notify_msg.";
        } else {
            str = "";
        }
        if (map != null && (str2 = (java.lang.String) map.get(str.concat("box_digest"))) != null) {
            str3 = str2;
        }
        return (com.tencent.mm.sdk.platformtools.t8.K0(str3) && info.w0()) ? (java.lang.String) n2Var.invoke() : str3;
    }

    public static final java.lang.String e(com.tencent.mm.storage.s1 info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(info.field_content, "msg", null);
        if (d17 == null) {
            return "";
        }
        java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.mmreader." + g(i17) + ".notifymsg_key");
        return str == null ? "" : str;
    }

    public static final int f(com.tencent.mm.storage.s1 info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        java.util.Map l17 = l(info);
        if (l17 == null) {
            return 0;
        }
        return com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) l17.get(".msg.appmsg.mmreader." + g(i17) + ".scene"), 0);
    }

    public static final java.lang.String g(int i17) {
        return i17 == 5 ? "photo_notify_msg" : "notify_msg";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int h(com.tencent.mm.storage.s1 r6, int r7) {
        /*
            java.lang.String r0 = "info"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = r6.field_content
            java.lang.String r1 = "msg"
            r2 = 0
            java.util.Map r0 = com.tencent.mm.sdk.platformtools.aa.d(r0, r1, r2)
            r3 = 0
            if (r0 != 0) goto L12
            return r3
        L12:
            java.lang.String r6 = r6.field_content
            java.util.Map r6 = com.tencent.mm.sdk.platformtools.aa.d(r6, r1, r2)
            java.lang.String r1 = ".msg.appmsg.mmreader."
            r2 = 1
            if (r6 != 0) goto L1e
            goto L41
        L1e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r5 = g(r7)
            r4.append(r5)
            java.lang.String r5 = ".hide_redcount"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.tencent.mm.sdk.platformtools.t8.P(r6, r3)
            if (r6 != r2) goto L41
            r6 = r2
            goto L42
        L41:
            r6 = r3
        L42:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r7 = g(r7)
            r4.append(r7)
            java.lang.String r7 = ".notifymsg_shield"
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            java.lang.Object r7 = r0.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            int r7 = com.tencent.mm.sdk.platformtools.t8.P(r7, r3)
            if (r7 != r2) goto L64
            r3 = r2
        L64:
            if (r3 == 0) goto L68
            r6 = r6 | 2
        L68:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.s2.h(com.tencent.mm.storage.s1, int):int");
    }

    public static final int i() {
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        com.tencent.mm.storage.l4 p17 = Di != null ? Di.p("officialaccounts") : null;
        if (p17 != null && p17.d2(128)) {
            return p17.d2(256) ? 2 : 3;
        }
        return 0;
    }

    public static final int j() {
        return r01.q3.oj().f();
    }

    public static final java.lang.String k(com.tencent.mm.storage.s1 info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        java.util.Map l17 = l(info);
        if (l17 == null) {
            return "";
        }
        java.lang.String str = (java.lang.String) l17.get(".msg.appmsg.mmreader." + g(i17) + ".publisher_username");
        return str == null ? "" : str;
    }

    public static final java.util.Map l(com.tencent.mm.storage.s1 s1Var) {
        java.util.Map map;
        long j17 = s1Var.field_msgId;
        if (j17 == f195291c && (map = f195292d) != null) {
            return map;
        }
        f195291c = j17;
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(s1Var.field_content, "msg", null);
        f195292d = d17;
        return d17;
    }

    public static final int m() {
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        com.tencent.mm.storage.l4 p17 = Di != null ? Di.p("officialaccounts") : null;
        if (p17 == null) {
            return 0;
        }
        if (p17.d1() <= 0) {
            if ((!p17.d2(8388608) && !p17.d2(2097152)) || p17.f1() <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "hasOfficialAccountRedDot#2 return 0. unreadCount:" + p17.d1());
                return 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "hasOfficialAccountRedDot#1 return 1. conv.unReadMuteCount:" + p17.f1() + ", conv.unReadCount:" + p17.d1());
            return 1;
        }
        if (!p17.d2(16) && !p17.d2(64)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "hasOfficialAccountRedDot#3 return 0. unreadCount:" + p17.d1());
            return 0;
        }
        if (p17.d2(64) && p17.d2(2048)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "hasOfficialAccountRedDot#4 return 0. unreadCount:" + p17.d1());
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "hasOfficialAccountRedDot#5 return 1. unreadCount:" + p17.d1());
        return 1;
    }

    public static final boolean n(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        if (f9Var == null) {
            return false;
        }
        if (!(f9Var.a3())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToBizPhoto isTemplateMsg false");
            return false;
        }
        if (!com.tencent.mm.storage.z3.g4(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToBizPhoto isMsgClusterNotifyMessage = false");
            return false;
        }
        if (!((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Bi()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToBizPhoto canCreateBizPhoto = false");
            return false;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.j(), "msg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToBizPhoto false");
            return false;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.mmreader.photo_notify_msg.act");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToBizPhoto notifyMsg = %s", java.lang.Boolean.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(str2)));
        return !com.tencent.mm.sdk.platformtools.t8.K0(str2);
    }

    public static final boolean o(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        if (f9Var == null) {
            return false;
        }
        if (!(f9Var.a3())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToTimeline isTemplateMsg false");
            return false;
        }
        if (!com.tencent.mm.storage.z3.g4(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToTimeline isMsgClusterNotifyMessage = false");
            return false;
        }
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (!(e0Var != null && ((h62.d) e0Var).Ni(e42.d0.clicfg_open_dyeing_template_to_timeline, 1) == 1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToTimeline open = false");
            return false;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.j(), "msg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToTimeline false");
            return false;
        }
        java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.mmreader.notify_msg.act");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizTimeLineStorageLogicExKt", "isDyeingTemplateToTimeline notifyMsg = %s", java.lang.Boolean.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(str2)));
        return !com.tencent.mm.sdk.platformtools.t8.K0(str2);
    }

    public static final boolean p(java.lang.String str, com.tencent.mm.storage.s1 s1Var, int i17) {
        int O;
        kotlin.jvm.internal.o.d(s1Var);
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(s1Var.field_content, "msg", null);
        if (d17 == null) {
            O = 0;
        } else {
            java.lang.Object obj = (java.lang.String) d17.get(".msg.appmsg.mmreader." + g(i17) + ".publisher_info.head_type");
            if (obj == null) {
                obj = 0;
            }
            O = com.tencent.mm.sdk.platformtools.t8.O(obj, 0);
        }
        if (c01.e2.G(str)) {
            if (O != 0 && O != 1) {
                return false;
            }
        } else if (O != 1) {
            return false;
        }
        return true;
    }
}
