package com.tencent.mm.plugin.game.model;

/* loaded from: classes4.dex */
public class p1 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f140403d = {l75.n0.getCreateSQLs(dm.r5.f239632n, "GameMsgRelativeContent")};

    public p1(l75.k0 k0Var) {
        super(k0Var, dm.r5.f239632n, "GameMsgRelativeContent", null);
    }

    public dm.r5 y0(java.lang.String str) {
        dm.r5 r5Var = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        android.database.Cursor rawQuery = rawQuery("select * from GameMsgRelativeContent where contentId = \"" + str + "\"", new java.lang.String[0]);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            r5Var = new dm.r5();
            r5Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        return r5Var;
    }
}
