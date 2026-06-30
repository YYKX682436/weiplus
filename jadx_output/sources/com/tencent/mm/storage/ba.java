package com.tencent.mm.storage;

/* loaded from: classes7.dex */
public class ba extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f193794e = {l75.n0.getCreateSQLs(com.tencent.mm.storage.aa.f193748x, "OpenMsgListener")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f193795d;

    public ba(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.aa.f193748x, "OpenMsgListener", null);
        this.f193795d = k0Var;
        k0Var.A("OpenMsgListener", "CREATE INDEX IF NOT EXISTS openMsgListenerAppIdIndex ON OpenMsgListener ( appId )");
        k0Var.A("OpenMsgListener", "CREATE INDEX IF NOT EXISTS openMsgListenerStatusIndex ON OpenMsgListener ( status )");
    }

    @Override // l75.n0
    public boolean replace(l75.f0 f0Var) {
        com.tencent.mm.storage.aa aaVar = (com.tencent.mm.storage.aa) f0Var;
        if (aaVar == null || com.tencent.mm.sdk.platformtools.t8.K0(aaVar.field_appId)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenMsgListenerStorage", "wrong argument");
            return false;
        }
        return this.f193795d.m("OpenMsgListener", com.tencent.mm.storage.aa.f193748x.f316953b, aaVar.convertTo()) > 0;
    }

    public com.tencent.mm.storage.aa y0(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        l75.k0 k0Var = this.f193795d;
        com.tencent.mm.sdk.platformtools.t8.n(str);
        android.database.Cursor D = k0Var.D("OpenMsgListener", null, "appId=?", new java.lang.String[]{str}, null, null, null, 2);
        if (!D.moveToFirst()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenMsgListenerStorage", "get null with appId:".concat(str));
            D.close();
            return null;
        }
        com.tencent.mm.storage.aa aaVar = new com.tencent.mm.storage.aa();
        aaVar.convertFrom(D);
        D.close();
        return aaVar;
    }

    public int z0(java.lang.String str, com.tencent.mm.storage.aa aaVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || aaVar == null || com.tencent.mm.sdk.platformtools.t8.K0(aaVar.field_appId)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenMsgListenerStorage", "wrong argument");
            return 0;
        }
        android.content.ContentValues convertTo = aaVar.convertTo();
        if (convertTo.size() <= 0) {
            return 0;
        }
        com.tencent.mm.sdk.platformtools.t8.n(str);
        return this.f193795d.p("OpenMsgListener", convertTo, "appId=?", new java.lang.String[]{str});
    }
}
