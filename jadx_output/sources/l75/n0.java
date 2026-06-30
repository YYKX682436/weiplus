package l75;

/* loaded from: classes4.dex */
public abstract class n0 extends l75.s0 implements l75.g0 {
    private static final java.lang.String TAG = "MicroMsg.SDK.MAutoStorage";

    /* renamed from: db, reason: collision with root package name */
    private final l75.k0 f316961db;
    private final l75.e0 dbInfo;
    public int field_MARK_CURSOR_CHECK_IGNORE = 1;
    private final java.lang.String table;

    public n0(l75.k0 k0Var, l75.e0 e0Var, java.lang.String str, java.lang.String[] strArr) {
        this.f316961db = k0Var;
        this.dbInfo = e0Var;
        e0Var.f316953b = com.tencent.mm.sdk.platformtools.t8.K0(e0Var.f316953b) ? "rowid" : e0Var.f316953b;
        this.table = str;
        if (k0Var == null) {
            return;
        }
        k0Var.A(str, getCreateSQLs(e0Var, str));
        java.util.List<java.lang.String> updateSQLs = getUpdateSQLs(e0Var, getTableName(), k0Var);
        for (int i17 = 0; i17 < updateSQLs.size(); i17++) {
            if (!this.f316961db.A(this.table, updateSQLs.get(i17))) {
                com.tencent.mars.xlog.Log.i(TAG, "updateColumnSQLs table failed %s, sql %s", this.table, updateSQLs.get(i17));
            }
        }
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        for (java.lang.String str2 : strArr) {
            this.f316961db.A(this.table, str2);
        }
    }

    public static java.lang.String getCreateSQLs(l75.e0 e0Var, java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("CREATE TABLE IF NOT EXISTS " + str + " ( ");
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        return sb6.toString();
    }

    public static java.util.List<java.lang.String> getUpdateSQLs(l75.e0 e0Var, java.lang.String str, l75.k0 k0Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (k0Var == null || str == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(k0Var == null);
            objArr[1] = str;
            com.tencent.mars.xlog.Log.e(TAG, "dk getUpdateSQLs db==null :%b  table:%s", objArr);
            return arrayList;
        }
        android.database.Cursor f17 = k0Var.f("PRAGMA table_info( " + str + " )", new java.lang.String[0], 2);
        if (f17 == null) {
            return arrayList;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        int columnIndex = f17.getColumnIndex(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        int columnIndex2 = f17.getColumnIndex("type");
        while (f17.moveToNext()) {
            hashMap.put(f17.getString(columnIndex), f17.getString(columnIndex2));
        }
        f17.close();
        for (java.util.Map.Entry entry : ((java.util.HashMap) e0Var.f316955d).entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getValue();
            java.lang.String str3 = (java.lang.String) entry.getKey();
            if (str2 != null && str2.length() > 0) {
                java.lang.String str4 = (java.lang.String) hashMap.get(str3);
                if (str4 == null) {
                    arrayList.add("ALTER TABLE " + str + " ADD COLUMN " + str3 + " " + str2 + ";");
                    hashMap.remove(str3);
                } else if (!str2.toLowerCase().startsWith(str4.toLowerCase())) {
                    com.tencent.mars.xlog.Log.e(TAG, "conflicting alter table on column: " + str3 + ", " + str4 + "<o-n>" + str2);
                    hashMap.remove(str3);
                }
            }
        }
        return arrayList;
    }

    public static java.lang.StringBuilder n0(android.content.ContentValues contentValues, java.lang.String... strArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.String str : strArr) {
            sb6.append(str + " = ? AND ");
            if (contentValues.get(str) == null) {
                return null;
            }
        }
        sb6.append(" 1=1");
        return sb6;
    }

    public static java.lang.String[] u0(java.lang.String[] strArr, android.content.ContentValues contentValues) {
        int length = strArr.length;
        java.lang.String[] strArr2 = new java.lang.String[length];
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String asString = contentValues.getAsString(strArr[i17]);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (asString == null) {
                asString = "";
            }
            strArr2[i17] = asString;
        }
        return strArr2;
    }

    public boolean delete(l75.f0 f0Var, boolean z17, java.lang.String... strArr) {
        android.content.ContentValues convertTo = f0Var.convertTo();
        if (convertTo != null && convertTo.size() > 0) {
            if (strArr != null && strArr.length > 0) {
                java.lang.StringBuilder n07 = n0(convertTo, strArr);
                if (n07 == null) {
                    m0("delete failed, check keys failed");
                    return false;
                }
                if (this.f316961db.delete(getTableName(), n07.toString(), u0(strArr, convertTo)) > 0 && z17) {
                    doNotify(convertTo.getAsString(this.dbInfo.f316953b), 5, f0Var);
                    return true;
                }
                m0("delete failed");
                return false;
            }
            getTableName();
            l75.k0 k0Var = this.f316961db;
            java.lang.String tableName = getTableName();
            java.lang.String str = this.dbInfo.f316953b + " = ?";
            java.lang.String[] strArr2 = new java.lang.String[1];
            java.lang.String asString = convertTo.getAsString(this.dbInfo.f316953b);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (asString == null) {
                asString = "";
            }
            strArr2[0] = asString;
            boolean z19 = k0Var.delete(tableName, str, strArr2) > 0;
            if (z19 && z17) {
                doNotify(convertTo.getAsString(this.dbInfo.f316953b), 5, f0Var);
            }
            return z19;
        }
        m0("delete failed, value.size <= 0");
        return false;
    }

    public boolean deleteNotify(long j17, boolean z17) {
        l75.k0 k0Var = this.f316961db;
        java.lang.String tableName = getTableName();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        boolean z18 = k0Var.delete(tableName, "rowid = ?", new java.lang.String[]{sb6.toString()}) > 0;
        if (z18 && z17) {
            doNotify("*", 5, null);
        }
        return z18;
    }

    public boolean execSQL(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            m0("null or nill table");
            return false;
        }
        if (str2 != null && str2.length() != 0) {
            return this.f316961db.A(str, str2);
        }
        m0("null or nill sql");
        return false;
    }

    public boolean get(long j17, l75.f0 f0Var) {
        android.database.Cursor D = this.f316961db.D(getTableName(), this.dbInfo.f316954c, "rowid = ?", new java.lang.String[]{"" + j17}, null, null, null, 2);
        if (D.moveToFirst()) {
            f0Var.convertFrom(D);
            D.close();
            return true;
        }
        D.close();
        return false;
    }

    public android.database.Cursor getAll() {
        return this.f316961db.E(getTableName(), this.dbInfo.f316954c, null, null, null, null, null);
    }

    public int getCount() {
        android.database.Cursor rawQuery = rawQuery("select count(*) from " + getTableName(), new java.lang.String[0]);
        if (rawQuery == null) {
            return 0;
        }
        rawQuery.moveToFirst();
        int i17 = rawQuery.getInt(0);
        rawQuery.close();
        return i17;
    }

    public java.lang.String getPrimaryKey() {
        return this.dbInfo.f316953b;
    }

    public java.lang.String getTableName() {
        return this.table;
    }

    public boolean insert(l75.f0 f0Var) {
        return insertNotify(f0Var, true);
    }

    public boolean insertNotify(l75.f0 f0Var, boolean z17) {
        android.content.ContentValues convertTo = f0Var.convertTo();
        if (convertTo == null || convertTo.size() <= 0) {
            m0("insert failed, value.size <= 0");
            return false;
        }
        long l17 = this.f316961db.l(getTableName(), this.dbInfo.f316953b, convertTo);
        f0Var.systemRowid = l17;
        if (l17 <= 0 && (!(f0Var.getPrimaryKeyValue() instanceof java.lang.Integer) || f0Var.systemRowid != ((java.lang.Integer) f0Var.getPrimaryKeyValue()).intValue())) {
            m0("insert failed");
            return false;
        }
        convertTo.put("rowid", java.lang.Long.valueOf(f0Var.systemRowid));
        if (!z17) {
            return true;
        }
        doNotify(convertTo.getAsString(this.dbInfo.f316953b), 2, f0Var);
        return true;
    }

    public final void m0(java.lang.String str) {
        com.tencent.mars.xlog.Log.e(TAG, getTableName() + ":" + str);
    }

    public android.database.Cursor rawQuery(java.lang.String str, java.lang.String... strArr) {
        return this.f316961db.B(str, strArr);
    }

    public boolean replace(l75.f0 f0Var) {
        return replace(f0Var, true);
    }

    public final boolean s0(android.content.ContentValues contentValues) {
        l75.k0 k0Var = this.f316961db;
        java.lang.String tableName = getTableName();
        java.lang.String[] strArr = this.dbInfo.f316954c;
        java.lang.String str = this.dbInfo.f316953b + " = ?";
        java.lang.String[] strArr2 = new java.lang.String[1];
        java.lang.String asString = contentValues.getAsString(this.dbInfo.f316953b);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (asString == null) {
            asString = "";
        }
        strArr2[0] = asString;
        android.database.Cursor E = k0Var.E(tableName, strArr, str, strArr2, null, null, null);
        boolean checkIOEqual = l75.f0.checkIOEqual(contentValues, E);
        E.close();
        return checkIOEqual;
    }

    public int update(java.lang.String str, android.content.ContentValues contentValues, java.lang.String str2, java.lang.String[] strArr) {
        return this.f316961db.p(str, contentValues, str2, strArr);
    }

    public boolean updateNotify(l75.f0 f0Var, boolean z17, java.lang.String... strArr) {
        android.content.ContentValues convertTo = f0Var.convertTo();
        if (convertTo == null || convertTo.size() <= 0) {
            m0("update failed, value.size <= 0");
            return false;
        }
        if (strArr != null && strArr.length > 0) {
            java.lang.StringBuilder n07 = n0(convertTo, strArr);
            if (n07 == null) {
                m0("update failed, check keys failed");
                return false;
            }
            if (this.f316961db.p(getTableName(), convertTo, n07.toString(), u0(strArr, convertTo)) <= 0) {
                m0("update failed");
                return false;
            }
            if (z17) {
                doNotify(convertTo.getAsString(this.dbInfo.f316953b), 3, f0Var);
            }
            return true;
        }
        getTableName();
        if (s0(convertTo)) {
            getTableName();
            return true;
        }
        l75.k0 k0Var = this.f316961db;
        java.lang.String tableName = getTableName();
        java.lang.String str = this.dbInfo.f316953b + " = ?";
        java.lang.String[] strArr2 = new java.lang.String[1];
        java.lang.String asString = convertTo.getAsString(this.dbInfo.f316953b);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (asString == null) {
            asString = "";
        }
        strArr2[0] = asString;
        boolean z19 = k0Var.p(tableName, convertTo, str, strArr2) > 0;
        if (z19 && z17) {
            doNotify(convertTo.getAsString(this.dbInfo.f316953b), 3, f0Var);
        }
        return z19;
    }

    public boolean replace(l75.f0 f0Var, boolean z17) {
        iz5.a.g("replace primaryKey == null", !com.tencent.mm.sdk.platformtools.t8.K0(this.dbInfo.f316953b));
        android.content.ContentValues convertTo = f0Var.convertTo();
        if (convertTo != null && convertTo.size() == f0Var.getDBInfo().f316952a.length + (convertTo.containsKey("rowid") ? 1 : 0)) {
            if (s0(convertTo)) {
                getTableName();
                return true;
            }
            long m17 = this.f316961db.m(getTableName(), this.dbInfo.f316953b, convertTo);
            f0Var.systemRowid = m17;
            boolean z18 = m17 > 0;
            if (z18 && z17) {
                doNotify(this.dbInfo.f316953b, 4, f0Var);
                return true;
            }
            if (!z18) {
                m0("replace failed");
            }
            return z18;
        }
        m0("replace failed, cv.size() != item.fields().length");
        return false;
    }

    public boolean update(long j17, l75.f0 f0Var, boolean z17) {
        android.content.ContentValues convertTo = f0Var.convertTo();
        if (convertTo != null && convertTo.size() > 0) {
            android.database.Cursor E = this.f316961db.E(getTableName(), this.dbInfo.f316954c, "rowid = ?", new java.lang.String[]{"" + j17}, null, null, null);
            if (l75.f0.checkIOEqual(convertTo, E)) {
                E.close();
                getTableName();
                return true;
            }
            E.close();
            l75.k0 k0Var = this.f316961db;
            java.lang.String tableName = getTableName();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            sb6.append(j17);
            boolean z18 = k0Var.p(tableName, convertTo, "rowid = ?", new java.lang.String[]{sb6.toString()}) > 0;
            if (z18 && z17) {
                doNotify("*", 3, f0Var);
            }
            return z18;
        }
        m0("update failed, value.size <= 0");
        return false;
    }

    public boolean get(l75.f0 f0Var, java.lang.String... strArr) {
        android.content.ContentValues convertTo = f0Var.convertTo();
        if (convertTo != null && convertTo.size() > 0) {
            if (strArr != null && strArr.length > 0) {
                java.lang.StringBuilder n07 = n0(convertTo, strArr);
                if (n07 == null) {
                    m0("get failed, check keys failed");
                    return false;
                }
                android.database.Cursor D = this.f316961db.D(getTableName(), this.dbInfo.f316954c, n07.toString(), u0(strArr, convertTo), null, null, null, 2);
                if (D.moveToFirst()) {
                    f0Var.convertFrom(D);
                    D.close();
                    return true;
                }
                D.close();
                getTableName();
                return false;
            }
            l75.k0 k0Var = this.f316961db;
            java.lang.String tableName = getTableName();
            java.lang.String[] strArr2 = this.dbInfo.f316954c;
            java.lang.String str = this.dbInfo.f316953b + " = ?";
            java.lang.String[] strArr3 = new java.lang.String[1];
            java.lang.String asString = convertTo.getAsString(this.dbInfo.f316953b);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (asString == null) {
                asString = "";
            }
            strArr3[0] = asString;
            android.database.Cursor D2 = k0Var.D(tableName, strArr2, str, strArr3, null, null, null, 2);
            if (D2.moveToFirst()) {
                f0Var.convertFrom(D2);
                D2.close();
                return true;
            }
            D2.close();
            return false;
        }
        m0("get failed, value.size <= 0");
        return false;
    }

    public boolean update(long j17, l75.f0 f0Var) {
        return update(j17, f0Var, true);
    }

    public boolean delete(l75.f0 f0Var, java.lang.String... strArr) {
        return delete(f0Var, true, strArr);
    }

    public boolean update(l75.f0 f0Var, java.lang.String... strArr) {
        return updateNotify(f0Var, true, strArr);
    }

    public int delete(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        return this.f316961db.delete(str, str2, strArr);
    }

    public boolean delete(long j17) {
        return deleteNotify(j17, true);
    }
}
