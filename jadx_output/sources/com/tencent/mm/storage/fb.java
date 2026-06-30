package com.tencent.mm.storage;

/* loaded from: classes7.dex */
public class fb extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f193940e = {l75.n0.getCreateSQLs(com.tencent.mm.storage.eb.f193890r, "UserOpenIdInApp")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f193941d;

    public fb(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.eb.f193890r, "UserOpenIdInApp", null);
        this.f193941d = k0Var;
        k0Var.A("UserOpenIdInApp", "CREATE INDEX IF NOT EXISTS userOpenIdInAppAppIdUsernameIndex ON UserOpenIdInApp ( appId,username )");
        k0Var.A("UserOpenIdInApp", "CREATE INDEX IF NOT EXISTS userOpenIdInAppOpenIdIndex ON UserOpenIdInApp ( openId )");
    }

    @Override // l75.n0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean replace(com.tencent.mm.storage.eb ebVar) {
        if (ebVar == null || com.tencent.mm.sdk.platformtools.t8.K0(ebVar.field_appId) || com.tencent.mm.sdk.platformtools.t8.K0(ebVar.field_openId) || com.tencent.mm.sdk.platformtools.t8.K0(ebVar.field_username)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.scanner.UserOpenIdInAppStorage", "wrong argument");
            return false;
        }
        return this.f193941d.m("UserOpenIdInApp", com.tencent.mm.storage.eb.f193890r.f316953b, ebVar.convertTo()) > 0;
    }

    public com.tencent.mm.storage.eb y0(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            return null;
        }
        l75.k0 k0Var = this.f193941d;
        com.tencent.mm.sdk.platformtools.t8.n(str);
        com.tencent.mm.sdk.platformtools.t8.n(str2);
        android.database.Cursor D = k0Var.D("UserOpenIdInApp", null, "appId=? and username=? ", new java.lang.String[]{str, str2}, null, null, null, 2);
        if (!D.moveToFirst()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.scanner.UserOpenIdInAppStorage", "get null with appId-%s, username-%s:", str, str2);
            D.close();
            return null;
        }
        com.tencent.mm.storage.eb ebVar = new com.tencent.mm.storage.eb();
        ebVar.convertFrom(D);
        D.close();
        return ebVar;
    }

    public com.tencent.mm.storage.eb z0(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        l75.k0 k0Var = this.f193941d;
        com.tencent.mm.sdk.platformtools.t8.n(str);
        android.database.Cursor D = k0Var.D("UserOpenIdInApp", null, "openId=?", new java.lang.String[]{str}, null, null, null, 2);
        if (!D.moveToFirst()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.scanner.UserOpenIdInAppStorage", "get null with openId:".concat(str));
            D.close();
            return null;
        }
        com.tencent.mm.storage.eb ebVar = new com.tencent.mm.storage.eb();
        ebVar.convertFrom(D);
        D.close();
        return ebVar;
    }
}
