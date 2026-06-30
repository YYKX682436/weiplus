package com.tencent.mm.storage;

/* loaded from: classes4.dex */
public class i extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f195017f = {l75.n0.getCreateSQLs(dm.o.initAutoDBInfo(null), "AddContactAntispamTicket")};

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f195018d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f195019e;

    public i(l75.k0 k0Var) {
        super(k0Var, dm.o.initAutoDBInfo(null), "AddContactAntispamTicket", null);
        this.f195018d = new java.util.HashMap();
        this.f195019e = k0Var;
    }

    public void D0(java.lang.String str, int i17, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        ((java.util.HashMap) this.f195018d).put(str, str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AntispamTicketStorage", "justAddToCache, username:%s, scene:%d, ticket:%s", str, java.lang.Integer.valueOf(i17), str2);
    }

    public void y0(java.lang.String str, int i17, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.storage.h hVar = new com.tencent.mm.storage.h();
        hVar.field_userName = str;
        hVar.field_scene = i17;
        hVar.field_ticket = str2;
        boolean replace = replace(hVar);
        D0(str, i17, str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AntispamTicketStorage", "addTicket, username:%s, scene:%d, ticket:%s, result: %b", str, java.lang.Integer.valueOf(i17), str2, java.lang.Boolean.valueOf(replace));
    }

    public java.lang.String z0(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) this.f195018d).get(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return str2;
        }
        com.tencent.mm.storage.h hVar = new com.tencent.mm.storage.h();
        hVar.field_userName = str;
        if (!get(hVar, "userName")) {
            return null;
        }
        D0(hVar.field_userName, hVar.field_scene, hVar.field_ticket);
        return hVar.field_ticket;
    }
}
