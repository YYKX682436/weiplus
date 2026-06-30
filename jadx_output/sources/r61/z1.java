package r61;

/* loaded from: classes9.dex */
public abstract class z1 {
    public static r61.x0 a(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = "SELECT *,rowid FROM OldAccountFriend  WHERE encryptUsername = " + d95.b0.O(str2) + " AND oldUsername = " + d95.b0.O(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendLogic", "get old acct friend, sql %s", str3);
        android.database.Cursor rawQuery = ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).wi().rawQuery(str3, new java.lang.String[0]);
        if (rawQuery == null) {
            return null;
        }
        try {
            if (!rawQuery.moveToFirst()) {
                return null;
            }
            r61.x0 x0Var = new r61.x0();
            x0Var.convertFrom(rawQuery);
            return x0Var;
        } finally {
            rawQuery.close();
        }
    }

    public static java.util.List b(java.lang.String str, int i17) {
        java.lang.String str2;
        if (i17 > 0) {
            str2 = "SELECT *,rowid FROM OldAccountFriend  WHERE showHead = " + i17 + " AND oldUsername = " + d95.b0.O(str) + " ORDER BY pinyinName";
        } else {
            str2 = "SELECT *,rowid FROM OldAccountFriend  WHERE oldUsername = " + d95.b0.O(str) + " ORDER BY showHead,pinyinName";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor rawQuery = ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).wi().rawQuery(str2, new java.lang.String[0]);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                try {
                    r61.x0 x0Var = new r61.x0();
                    x0Var.convertFrom(rawQuery);
                    com.tencent.mm.storage.p7 W0 = ((com.tencent.mm.storage.q7) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ui()).W0(x0Var.field_encryptUsername);
                    if (W0 == null || !x0Var.field_encryptUsername.equals(W0.field_talker)) {
                        arrayList.add(new r61.y1(x0Var));
                    } else {
                        arrayList.add(new r61.y1(x0Var, W0));
                    }
                } finally {
                    rawQuery.close();
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendLogic", "get recover friend, sql %s, get %d data", str2, java.lang.Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public static void c(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.String str2 = "SELECT *,rowid FROM OldAccountFriend  WHERE encryptUsername = " + d95.b0.O(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecoverFriendLogic", "update old acct friend add state, sql %s", str2);
        android.database.Cursor rawQuery = ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).wi().rawQuery(str2, new java.lang.String[0]);
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToFirst()) {
                    r61.x0 x0Var = new r61.x0();
                    x0Var.convertFrom(rawQuery);
                    x0Var.field_addState = i17;
                    ((r61.u1) ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).wi()).replace(x0Var);
                }
            } finally {
                rawQuery.close();
            }
        }
    }
}
