package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class f1 extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f137528e;

    /* renamed from: f, reason: collision with root package name */
    public o13.y f137529f;

    /* renamed from: g, reason: collision with root package name */
    public w13.f f137530g;

    /* renamed from: h, reason: collision with root package name */
    public w13.b f137531h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137532i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f137533m;

    public f1() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f137532i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UpdateLanguageEvent>(a0Var) { // from class: com.tencent.mm.plugin.fts.logic.FTS5SearchFeatureLogic$1
            {
                this.__eventId = -1874260055;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UpdateLanguageEvent updateLanguageEvent) {
                com.tencent.mm.plugin.fts.logic.f1 f1Var = com.tencent.mm.plugin.fts.logic.f1.this;
                ((com.tencent.mm.plugin.fts.t) f1Var.f137528e).b(65596, new com.tencent.mm.plugin.fts.logic.d1(f1Var, true));
                return true;
            }
        };
        this.f137533m = new com.tencent.mm.plugin.fts.logic.FTS5SearchFeatureLogic$2(this, a0Var);
    }

    public static java.util.List j(com.tencent.mm.plugin.fts.logic.f1 f1Var, java.lang.String str) {
        boolean z17;
        int indexOf;
        f1Var.getClass();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        objArr[1] = f17.equalsIgnoreCase("zh_CN") ? "zh_CN".toLowerCase() : (f17.equalsIgnoreCase("zh_TW") || f17.equalsIgnoreCase("zh_HK")) ? "zh_TW".toLowerCase() : "en".toLowerCase();
        java.lang.String format = java.lang.String.format("%s/feature_%s.conf", objArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "decodeToFeatureList %s", format);
        long l17 = com.tencent.mm.vfs.w6.l(format);
        int k17 = (int) com.tencent.mm.vfs.w6.k(format);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (k17 == 0) {
            throw new p13.a0("data file no exist error");
        }
        p13.f fVar = null;
        for (java.lang.String str2 : new java.lang.String(com.tencent.mm.vfs.w6.N(format, 0, k17)).split("\n")) {
            if (str2 != null) {
                java.lang.String trim = str2.trim();
                if (trim.length() != 0 && (indexOf = trim.indexOf("=")) >= 0) {
                    java.lang.String substring = trim.substring(0, indexOf);
                    java.lang.String substring2 = trim.substring(indexOf + 1);
                    if (substring.equals("FeatureID")) {
                        if (fVar != null) {
                            fVar.field_iconPath = str + "/icon/" + fVar.field_featureId + ".png";
                            arrayList.add(fVar);
                        }
                        fVar = new p13.f();
                        fVar.field_featureId = com.tencent.mm.sdk.platformtools.t8.P(substring2, 0);
                        fVar.field_timestamp = l17;
                    }
                    if (fVar != null) {
                        if (substring.equals("Title")) {
                            fVar.field_title = com.tencent.mm.sdk.platformtools.p9.e(substring2);
                        } else if (substring.equals("TitlePY")) {
                            fVar.field_titlePY = substring2;
                        } else if (substring.equals("TitleShortPY")) {
                            fVar.field_titleShortPY = substring2;
                        } else if (substring.equals("Tag")) {
                            fVar.field_tag = com.tencent.mm.sdk.platformtools.p9.e(substring2);
                        } else if (substring.equals("ActionType")) {
                            if (substring2.equals("H5")) {
                                fVar.field_actionType = 2;
                            } else if (substring2.equals("Native")) {
                                fVar.field_actionType = 1;
                            }
                        } else if (substring.equals("Url")) {
                            fVar.field_url = com.tencent.mm.sdk.platformtools.p9.e(substring2);
                        } else if (substring.equals("HelpUrl")) {
                            fVar.field_helpUrl = com.tencent.mm.sdk.platformtools.p9.e(substring2);
                        } else {
                            if (substring.equals("UpdateUrl")) {
                                java.lang.String str3 = com.tencent.mm.sdk.platformtools.a9.f192463a;
                                z17 = true;
                                if (!(!yp5.a.f464409a.a())) {
                                    fVar.field_updateUrl = com.tencent.mm.sdk.platformtools.p9.e(substring2);
                                }
                            } else {
                                z17 = true;
                                if (substring.equals("AndroidUrl")) {
                                    fVar.field_androidUrl = com.tencent.mm.sdk.platformtools.p9.e(substring2);
                                }
                            }
                        }
                    }
                }
            }
            z17 = true;
        }
        if (fVar != null) {
            fVar.field_iconPath = str + "/icon/" + fVar.field_featureId + ".png";
            fVar.field_timestamp = l17;
            arrayList.add(fVar);
        }
        if (arrayList.size() == 0) {
            throw new p13.a0("no data error");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "decodeToFeatureList resultSize:%d", java.lang.Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public static com.tencent.mm.vfs.r6 k() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(lp0.b.h(), "fts"), "feature");
        if (!r6Var.m()) {
            r6Var.J();
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, "fts_feature");
        if (!r6Var2.m()) {
            r6Var2.J();
        }
        return r6Var2;
    }

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        com.tencent.mm.plugin.fts.logic.e1 e1Var = new com.tencent.mm.plugin.fts.logic.e1(this, uVar, null);
        ((com.tencent.mm.plugin.fts.t) this.f137529f).b(-65536, e1Var);
        return e1Var;
    }

    @Override // o13.w
    public java.lang.String getName() {
        return "FTS5SearchFeatureLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "Create Fail!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "Create Success!");
        this.f137528e = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137379d;
        this.f137529f = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137380e;
        this.f137530g = (w13.f) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(17);
        this.f137531h = (w13.b) ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(3);
        this.f137532i.alive();
        this.f137533m.alive();
        ((com.tencent.mm.plugin.fts.t) this.f137528e).b(131132, new com.tencent.mm.plugin.fts.logic.d1(this, false));
        return true;
    }

    @Override // o13.b
    public boolean i() {
        this.f137532i.dead();
        this.f137533m.dead();
        this.f137530g = null;
        this.f137531h = null;
        this.f137528e = null;
        this.f137529f = null;
        return true;
    }

    public final int l(com.tencent.mm.vfs.r6 r6Var) {
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var, "version.info");
        int i17 = 0;
        int i18 = -1;
        try {
            if (r6Var2.m()) {
                i17 = java.lang.Integer.parseInt(com.tencent.mm.vfs.w6.M(r6Var2.o()), 10);
                i18 = i17;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "version file %s not exist", r6Var2.o());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchFeatureLogic", e17, "getFeatureVersion", new java.lang.Object[i17]);
        }
        return i18;
    }

    public final boolean m(java.lang.String str) {
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6 h07 = lp0.b.h0("fts/feature/temp");
        com.tencent.mm.vfs.w6.f(h07.o());
        com.tencent.mm.vfs.w6.u(h07.o());
        try {
            int Q = com.tencent.mm.vfs.w6.Q(str, h07.o());
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "unzip %s %d", str, java.lang.Integer.valueOf(Q));
            if (Q >= 0) {
                com.tencent.mm.vfs.r6 k17 = k();
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(h07, "fts_feature");
                int l17 = l(r6Var);
                int l18 = l(k17);
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "updateFeatureList: updateVersion %d currentVersion %d", java.lang.Integer.valueOf(l17), java.lang.Integer.valueOf(l18));
                if (l17 > l18) {
                    com.tencent.mm.vfs.w6.f(k17.o());
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "updateFeatureList rename ret=%b, currentVersion=%s", java.lang.Boolean.valueOf(r6Var.L(k17)), java.lang.Integer.valueOf(l(k17)));
                    return true;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchFeatureLogic", e17, "updateFeatureList", new java.lang.Object[0]);
        }
        return false;
    }
}
