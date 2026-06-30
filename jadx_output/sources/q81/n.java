package q81;

/* loaded from: classes4.dex */
public class n extends q81.a {
    public static boolean g(com.tencent.mm.plugin.appbrand.appcache.m6 m6Var, java.lang.String str, java.lang.String str2, int i17, q81.m mVar) {
        int i18 = mVar.ordinal() != 0 ? 127 : 131;
        r81.f fVar = r81.f.INSTANCE;
        fVar.b(i17, i18);
        java.lang.String f17 = com.tencent.mm.plugin.appbrand.appcache.e9.f(m6Var.field_appId, m6Var.field_version);
        int aesDecryptFile = com.tencent.mm.protocal.MMProtocalJni.aesDecryptFile(m6Var.field_pkgPath, f17, str.getBytes());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "decryptPkgAndSave, appId(%s), version(%d), ret %d", m6Var.field_appId, java.lang.Integer.valueOf(m6Var.field_version), java.lang.Integer.valueOf(aesDecryptFile));
        boolean z17 = false;
        if (aesDecryptFile != 0) {
            fVar.b(i17, mVar.ordinal() != 0 ? 129 : 133);
            return false;
        }
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(f17);
        if (!p17.equals(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "decryptPkgAndSave, file_md5(%s) expect_md5(%s) mismatch", p17, str2);
            fVar.b(i17, mVar.ordinal() != 0 ? 130 : 134);
            return false;
        }
        com.tencent.mm.plugin.appbrand.app.r9.Di().l(m6Var.field_appId, 0, m6Var.field_version, str2, null);
        boolean F = com.tencent.mm.plugin.appbrand.app.r9.Di().F(m6Var.field_appId, 0, m6Var.field_version, f17);
        fVar.b(i17, mVar.ordinal() != 0 ? F ? com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER : 144 : F ? 147 : 148);
        com.tencent.mm.vfs.w6.h(m6Var.field_pkgPath);
        fVar.b(i17, ((com.tencent.mm.plugin.appbrand.appcache.n6) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.n6.class)).delete(m6Var, new java.lang.String[0]) ? 139 : 140);
        if (mVar != q81.m.ISSUE_DECRYPT) {
            com.tencent.mm.plugin.appbrand.appcache.p6 p6Var = (com.tencent.mm.plugin.appbrand.appcache.p6) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.p6.class);
            java.lang.String str3 = m6Var.field_appId;
            int i19 = m6Var.field_version;
            p6Var.getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mm.plugin.appbrand.appcache.o6 o6Var = new com.tencent.mm.plugin.appbrand.appcache.o6();
                o6Var.field_appId = str3;
                o6Var.field_appVersion = i19;
                z17 = p6Var.delete(o6Var, new java.lang.String[0]);
            }
            fVar.b(i17, z17 ? 141 : com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS);
        }
        fVar.b(i17, mVar.ordinal() != 0 ? 128 : 132);
        return true;
    }

    public static boolean h(com.tencent.mm.plugin.appbrand.appcache.m6 m6Var, q81.m mVar) {
        com.tencent.mm.plugin.appbrand.appcache.p6 p6Var = (com.tencent.mm.plugin.appbrand.appcache.p6) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.p6.class);
        java.lang.String str = m6Var.field_appId;
        int i17 = m6Var.field_version;
        p6Var.getClass();
        com.tencent.mm.plugin.appbrand.appcache.o6 o6Var = new com.tencent.mm.plugin.appbrand.appcache.o6();
        o6Var.field_appId = str;
        o6Var.field_appVersion = i17;
        if (!p6Var.get(o6Var, new java.lang.String[0])) {
            o6Var = null;
        }
        if (o6Var != null) {
            return g(m6Var, o6Var.field_decryptKey, o6Var.field_pkgMd5, o6Var.field_reportId, mVar);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "decryptPkgAndSave get null key with %s", m6Var.t0());
        return false;
    }

    @Override // q81.a
    public java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        r45.lf7 lf7Var = (r45.lf7) obj;
        int i17 = lf7Var.f379439f;
        java.lang.String str3 = lf7Var.f379438e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "call appId(%s) version(%d) key nil", str2, java.lang.Integer.valueOf(i17));
            r81.f.INSTANCE.b(lf7Var.f379437d.f371531f, 124);
            return java.lang.Boolean.FALSE;
        }
        boolean z17 = false;
        if (com.tencent.mm.plugin.appbrand.appcache.WxaPkgIntegrityChecker.b(str2, 0, i17, null).first == com.tencent.mm.plugin.appbrand.appcache.l9.APP_READY) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "call, normal pkg ok appId(%s), version(%d)", str2, java.lang.Integer.valueOf(i17));
            r81.f.INSTANCE.b(lf7Var.f379437d.f371531f, 125);
            return java.lang.Boolean.FALSE;
        }
        boolean z18 = true;
        com.tencent.mm.plugin.appbrand.appcache.m6 D0 = ((com.tencent.mm.plugin.appbrand.appcache.n6) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.n6.class)).D0(str2, 1, i17);
        if (D0 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.CmdIssueDecryptKey", "call, null encrypt pkg info with %s, %d", str2, java.lang.Integer.valueOf(i17));
            r81.f.INSTANCE.b(lf7Var.f379437d.f371531f, 126);
        } else {
            z18 = true ^ g(D0, lf7Var.f379438e, lf7Var.f379440g, lf7Var.f379437d.f371531f, q81.m.ISSUE_DECRYPT);
        }
        if (z18) {
            com.tencent.mm.plugin.appbrand.appcache.p6 p6Var = (com.tencent.mm.plugin.appbrand.appcache.p6) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.p6.class);
            java.lang.String str4 = lf7Var.f379440g;
            int i18 = lf7Var.f379437d.f371531f;
            p6Var.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Predownload.PushWxaPkgDecryptKeyStorage", "setDecryptKey, invalid appId[%s], decryptKey[%s]", str2, str3);
            } else {
                com.tencent.mm.plugin.appbrand.appcache.o6 o6Var = new com.tencent.mm.plugin.appbrand.appcache.o6();
                o6Var.field_appId = str2;
                o6Var.field_appVersion = i17;
                boolean z19 = p6Var.get(o6Var, new java.lang.String[0]);
                o6Var.field_decryptKey = str3;
                o6Var.field_reportId = i18;
                o6Var.field_pkgMd5 = str4;
                z17 = z19 ? p6Var.update(o6Var, new java.lang.String[0]) : p6Var.insert(o6Var);
            }
            r81.f.INSTANCE.b(lf7Var.f379437d.f371531f, z17 ? 135 : 136);
        }
        return java.lang.Boolean.TRUE;
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        return ((r45.lf7) obj).f379437d;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdIssueDecryptKey";
    }
}
