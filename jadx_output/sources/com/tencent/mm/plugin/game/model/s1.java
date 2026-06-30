package com.tencent.mm.plugin.game.model;

/* loaded from: classes4.dex */
public class s1 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f140437d = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.game.model.r1.f140431p, "GamePBCache")};

    public s1(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.game.model.r1.f140431p, "GamePBCache", null);
    }

    public byte[] D0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.sdk.platformtools.m2.d().equals(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("game_center_pref", 0).getString("game_center_pref_lang", com.tencent.mm.sdk.platformtools.m2.d()))) {
            return null;
        }
        com.tencent.mm.plugin.game.model.r1 r1Var = new com.tencent.mm.plugin.game.model.r1();
        r1Var.field_key = str;
        if (super.get(r1Var, new java.lang.String[0])) {
            return r1Var.field_value;
        }
        return null;
    }

    public boolean J0(java.lang.String str, com.tencent.mm.protobuf.f fVar) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && fVar != null) {
            try {
                return L0(str, fVar.toByteArray());
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GamePBCacheStorage", "Saving Failed: %s", e17.getMessage());
            }
        }
        return false;
    }

    public boolean L0(java.lang.String str, byte[] bArr) {
        boolean insert;
        if (bArr == null) {
            return false;
        }
        com.tencent.mm.plugin.game.model.r1 r1Var = new com.tencent.mm.plugin.game.model.r1();
        r1Var.field_key = str;
        if (super.get(r1Var, new java.lang.String[0])) {
            r1Var.field_value = bArr;
            insert = super.update(r1Var, new java.lang.String[0]);
        } else {
            r1Var.field_value = bArr;
            insert = super.insert(r1Var);
        }
        if (!insert) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GamePBCacheStorage", "Saving cache failed (update or insert)");
        }
        return insert;
    }

    public void y0(java.lang.String str) {
        java.lang.String str2 = "delete from GamePBCache where key like '%" + str + "'";
        com.tencent.mars.xlog.Log.i("MicroMsg.GamePBCacheStorage", "deleteDataWithSuffix, ret:%b, sql: %s", java.lang.Boolean.valueOf(execSQL("GameHaowanMedia", str2)), str2);
    }

    public boolean z0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mm.plugin.game.model.r1 r1Var = new com.tencent.mm.plugin.game.model.r1();
        r1Var.field_key = str;
        return super.delete(r1Var, new java.lang.String[0]);
    }
}
