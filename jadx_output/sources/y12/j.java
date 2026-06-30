package y12;

/* loaded from: classes12.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    public static int f458868c;

    /* renamed from: d, reason: collision with root package name */
    public static int f458869d;

    /* renamed from: e, reason: collision with root package name */
    public static int f458870e;

    /* renamed from: f, reason: collision with root package name */
    public static int f458871f;

    /* renamed from: g, reason: collision with root package name */
    public static y12.j f458872g;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f458873a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public f21.g f458874b;

    public static java.lang.String c() {
        return rr.s.f399149a.a();
    }

    public static y12.j e() {
        if (f458872g == null) {
            synchronized (y12.j.class) {
                f458872g = new y12.j();
            }
        }
        return f458872g;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0135 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y12.j.a(java.lang.String, java.lang.String):boolean");
    }

    public final int b(y12.i iVar) {
        int ordinal = iVar.ordinal();
        if (ordinal == 0) {
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EMOJI_NEW_EMOJI_INT, 0)).intValue();
            f458868c = intValue;
            return intValue;
        }
        if (ordinal == 1) {
            int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EMOJI_NEW_PANEL_INT, 0)).intValue();
            f458869d = intValue2;
            return intValue2;
        }
        if (ordinal == 2) {
            int intValue3 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EMOJI_NEW_SUGGEST_INT, 0)).intValue();
            f458870e = intValue3;
            return intValue3;
        }
        if (ordinal == 3) {
            return f11.e.f258554a;
        }
        if (ordinal != 4) {
            return -1;
        }
        int intValue4 = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EMOJI_EGG_INT, 0)).intValue();
        f458871f = intValue4;
        return intValue4;
    }

    public f21.g d() {
        f21.g gVar;
        synchronized (this) {
            f21.g gVar2 = this.f458874b;
            if (gVar2 != null) {
                return gVar2;
            }
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(c(), "egg"), "egg.xml");
            if (r6Var.m()) {
                g(r6Var);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiResUpdateMgr", "getEggList: from xml");
            synchronized (this) {
                gVar = this.f458874b;
            }
            return gVar;
        }
    }

    public final nr.g f(y12.i iVar) {
        java.util.HashMap hashMap = this.f458873a;
        nr.g gVar = (nr.g) hashMap.get(iVar);
        if (gVar == null) {
            gVar = new nr.g();
            hashMap.put(iVar, gVar);
        }
        int ordinal = iVar.ordinal();
        com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct emojiResReportStruct = gVar.f339046a;
        if (ordinal == 0) {
            emojiResReportStruct.f56003i = 1;
        } else if (ordinal == 1) {
            emojiResReportStruct.f56003i = 2;
        } else if (ordinal == 2) {
            emojiResReportStruct.f56003i = 3;
        } else if (ordinal == 4) {
            emojiResReportStruct.f56003i = 5;
        } else if (ordinal == 5) {
            emojiResReportStruct.f56003i = 6;
        } else if (ordinal == 6) {
            emojiResReportStruct.f56003i = 7;
        }
        return gVar;
    }

    public final boolean g(com.tencent.mm.vfs.r6 r6Var) {
        com.tencent.mm.vfs.z7 z7Var;
        try {
            f21.g b17 = rr.t.b(r6Var);
            if (b17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiResUpdateMgr", "parserEmojiEggConfig: error null");
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiResUpdateMgr", "parserEmojiEggConfig: %s", java.lang.Integer.valueOf(b17.f258898d.size()));
            synchronized (this) {
                this.f458874b = b17;
            }
            java.lang.String str = c() + "/egg";
            com.tencent.mm.vfs.z7 a17 = str == null ? null : com.tencent.mm.vfs.z7.a(str);
            if (a17 == null) {
                z7Var = new com.tencent.mm.vfs.z7(null, null, com.tencent.mm.vfs.e8.l("config.conf", false, false), null, null);
            } else {
                z7Var = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, com.tencent.mm.vfs.e8.l(a17.f213279f + "/config.conf", false, false), a17.f213280g, a17.f213281h);
            }
            f458871f = rr.t.d(z7Var.toString());
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_EGG_INT, java.lang.Integer.valueOf(f458871f));
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.EmojiResUpdateMgr", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public void h(com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent, boolean z17) {
        com.tencent.mm.vfs.z7 z7Var;
        z85.b0 b0Var;
        com.tencent.mm.vfs.z7 z7Var2;
        y12.i iVar = y12.i.EMOJI;
        int b17 = b(iVar);
        nr.g f17 = f(iVar);
        boolean a17 = a(checkResUpdateCacheFileEvent.f54053g.f7761c, "temp");
        java.lang.String str = c() + "/temp";
        com.tencent.mm.vfs.z7 a18 = str == null ? null : com.tencent.mm.vfs.z7.a(str);
        if (a18 == null) {
            z7Var = new com.tencent.mm.vfs.z7(null, null, com.tencent.mm.vfs.e8.l("config.conf", false, false), null, null);
        } else {
            z7Var = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, com.tencent.mm.vfs.e8.l(a18.f213279f + "/config.conf", false, false), a18.f213280g, a18.f213281h);
        }
        int d17 = rr.t.d(z7Var.toString());
        com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct emojiResReportStruct = f17.f339046a;
        emojiResReportStruct.f56001g = b17;
        emojiResReportStruct.f56002h = d17;
        f17.b(a17);
        com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct emojiResReportStruct2 = f17.f339046a;
        emojiResReportStruct2.f56000f = 0;
        emojiResReportStruct2.k();
        if (!a17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiResUpdateMgr", "updateEmoji unzip file failed.");
            return;
        }
        com.tencent.mm.vfs.w6.f(c() + "/newemoji");
        com.tencent.mm.vfs.w6.v(c() + "/temp", c() + "/newemoji");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(c(), "newemoji"), "newemoji-config.xml");
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiResUpdateMgr", "updateEmoji config don't exist.");
            return;
        }
        java.util.ArrayList c17 = rr.t.c(r6Var);
        nr.g f18 = f(iVar);
        f18.a(!c17.isEmpty());
        int size = c17.size();
        com.tencent.mm.autogen.mmdata.rpt.EmojiResReportStruct emojiResReportStruct3 = f18.f339046a;
        emojiResReportStruct3.f56000f = size;
        emojiResReportStruct3.k();
        if (!c17.isEmpty()) {
            ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5 f19 = com.tencent.mm.storage.n5.f();
            synchronized (f19.f195163a) {
                b0Var = f19.f195173k;
            }
            if (b0Var.y0(c17)) {
                com.tencent.mm.autogen.events.EmojiConfigEvent emojiConfigEvent = new com.tencent.mm.autogen.events.EmojiConfigEvent();
                emojiConfigEvent.f54100g.f7319a = 1;
                emojiConfigEvent.e();
                java.lang.String str2 = c() + "/newemoji";
                com.tencent.mm.vfs.z7 a19 = str2 != null ? com.tencent.mm.vfs.z7.a(str2) : null;
                if (a19 == null) {
                    z7Var2 = new com.tencent.mm.vfs.z7(null, null, com.tencent.mm.vfs.e8.l("config.conf", false, false), null, null);
                } else {
                    z7Var2 = new com.tencent.mm.vfs.z7(a19.f213277d, a19.f213278e, com.tencent.mm.vfs.e8.l(a19.f213279f + "/config.conf", false, false), a19.f213280g, a19.f213281h);
                }
                f458868c = rr.t.d(z7Var2.toString());
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_NEW_EMOJI_INT, java.lang.Integer.valueOf(f458868c));
            }
        }
        zy.r rVar = (zy.r) i95.n0.c(zy.r.class);
        am.r2 r2Var = checkResUpdateCacheFileEvent.f54053g;
        ((yy.a) rVar).Ri(r2Var.f7759a, r2Var.f7760b, r2Var.f7762d);
    }
}
