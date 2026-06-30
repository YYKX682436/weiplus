package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes9.dex */
public abstract class m0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final android.util.SparseArray f189622f = new android.util.SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public volatile com.tencent.mm.modelbase.u0 f189623d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f189624e = new java.util.LinkedList();

    public m0() {
        int[] iArr = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.f189560c;
        int length = iArr.length;
        int i17 = 0;
        while (i17 < length) {
            int i18 = iArr[i17];
            if (((m35.a) f189622f.get(i18)) != null) {
                i17 = i18 == 39 && !com.tencent.mm.plugin.ipcall.k.a() ? i17 + 1 : i17;
            }
            r45.fs5 fs5Var = new r45.fs5();
            fs5Var.f374591d = i18;
            this.f189624e.add(fs5Var);
        }
    }

    public abstract com.tencent.mm.network.v0 H();

    public abstract java.lang.String I();

    public abstract r45.d20 J(com.tencent.mm.network.v0 v0Var);

    @Override // com.tencent.mm.modelbase.m1
    public final int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f189623d = u0Var;
        I();
        try {
            for (r45.fs5 fs5Var : this.f189624e) {
                java.util.List<com.tencent.mm.pluginsdk.res.downloader.model.n0> a17 = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.y.a(fs5Var.f374591d);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{ ");
                com.tencent.mars.xlog.Log.i(I(), "before doScene type(%d) subtypeRecordList size=(%d) ", java.lang.Integer.valueOf(fs5Var.f374591d), java.lang.Integer.valueOf(a17.size()));
                for (com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var : a17) {
                    int P = com.tencent.mm.sdk.platformtools.t8.P(n0Var.field_fileVersion, -1);
                    if (P >= 0) {
                        if (37 == n0Var.field_resType && android.text.TextUtils.isEmpty(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().b(n0Var.field_resType, n0Var.field_subType))) {
                            byte[] bArr = com.tencent.mm.pluginsdk.res.downloader.checkresupdate.c0.f189558a;
                            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().d(n0Var.field_resType, n0Var.field_subType, com.tencent.mm.sdk.platformtools.t8.P(n0Var.field_fileVersion, -1), false);
                        } else {
                            if (96 == n0Var.field_resType && android.text.TextUtils.isEmpty(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().b(n0Var.field_resType, n0Var.field_subType))) {
                                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().d(n0Var.field_resType, n0Var.field_subType, com.tencent.mm.sdk.platformtools.t8.P(n0Var.field_fileVersion, -1), false);
                            }
                            if (38 == n0Var.field_resType && n0Var.field_needRetry && android.text.TextUtils.isEmpty(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().b(n0Var.field_resType, n0Var.field_subType))) {
                                com.tencent.mars.xlog.Log.i(I(), "before doScene, res(%d.%d) needRetry and cachedFilePath isEmpty, skip add fileVersion into req", java.lang.Integer.valueOf(n0Var.field_resType), java.lang.Integer.valueOf(n0Var.field_subType));
                            } else if (83 == n0Var.field_resType && android.text.TextUtils.isEmpty(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().b(n0Var.field_resType, n0Var.field_subType))) {
                                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().d(n0Var.field_resType, n0Var.field_subType, com.tencent.mm.sdk.platformtools.t8.P(n0Var.field_fileVersion, -1), false);
                            } else if (103 == n0Var.field_resType && android.text.TextUtils.isEmpty(com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().b(n0Var.field_resType, n0Var.field_subType))) {
                                com.tencent.mars.xlog.Log.i(I(), "before doScene, res(%d.%d) needRetry and cachedFilePath isEmpty, skip add fileVersion(%s) into req", java.lang.Integer.valueOf(n0Var.field_resType), java.lang.Integer.valueOf(n0Var.field_subType), n0Var.field_fileVersion);
                                com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p.c().d(n0Var.field_resType, n0Var.field_subType, com.tencent.mm.sdk.platformtools.t8.P(n0Var.field_fileVersion, -1), false);
                            } else {
                                r45.ds5 ds5Var = new r45.ds5();
                                ds5Var.f372732d = n0Var.field_subType;
                                ds5Var.f372733e = P;
                                ds5Var.f372734f = n0Var.field_keyVersion;
                                ds5Var.f372735g = n0Var.field_EID;
                                fs5Var.f374592e.add(ds5Var);
                                sb6.append(n0Var.field_subType);
                                sb6.append(";");
                                sb6.append(P);
                                sb6.append(", ");
                            }
                        }
                    }
                }
                sb6.append(" }");
                com.tencent.mars.xlog.Log.i(I(), "before doScene, add subtypeList(%s) in type(%d)", sb6.toString(), java.lang.Integer.valueOf(fs5Var.f374591d));
            }
            return dispatch(sVar, H(), this);
        } catch (android.database.SQLException | com.tencent.wcdb.database.SQLiteException e17) {
            com.tencent.mars.xlog.Log.e(I(), "doScene get SQLException(%s), return -1", e17);
            return -1;
        }
    }

    @Override // com.tencent.mm.network.l0
    public final void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(I(), "onGYNetEnd errType(%d), errCode(%d)", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            r45.d20 J2 = J(v0Var);
            java.lang.String I = I();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = com.tencent.mm.sdk.platformtools.t8.L0(J2.f372005d) ? "null" : java.lang.String.valueOf(J2.f372005d.size());
            com.tencent.mars.xlog.Log.i(I, "response.Res.size() = %s", objArr);
            if (!com.tencent.mm.sdk.platformtools.t8.L0(J2.f372005d)) {
                s75.d.b(new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.l0(this, J2.f372005d), "NetSceneCheckResUpdate-ResponseHandlingThread");
            }
        }
        this.f189623d.onSceneEnd(i18, i19, str, this);
    }
}
