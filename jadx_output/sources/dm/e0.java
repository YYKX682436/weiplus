package dm;

/* loaded from: classes4.dex */
public class e0 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f236507f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f236508g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f236509h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f236510i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f236511m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f236512n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f236513o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236514d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236515e = true;
    public java.lang.String field_appId;
    public r45.tk5 field_recommendCard;

    static {
        p75.n0 n0Var = new p75.n0("AppBrandRecommendCard");
        f236507f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236508g = new java.lang.String[0];
        f236509h = 93028124;
        f236510i = -1142472212;
        f236511m = 108705909;
        f236512n = initAutoDBInfo(dm.e0.class);
        f236513o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "appId";
        e0Var.f316954c[1] = "recommendCard";
        e0Var.f316955d.put("recommendCard", "BLOB");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " appId TEXT PRIMARY KEY ,  recommendCard BLOB";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
    }

    @Override // l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        java.lang.String[] columnNames = cursor.getColumnNames();
        if (columnNames == null) {
            return;
        }
        int length = columnNames.length;
        for (int i17 = 0; i17 < length; i17++) {
            int hashCode = columnNames[i17].hashCode();
            if (f236509h == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                    this.f236514d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandRecommendCard", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236510i == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_recommendCard = (r45.tk5) new r45.tk5().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAppBrandRecommendCard", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236511m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236514d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f236515e) {
            r45.tk5 tk5Var = this.field_recommendCard;
            if (tk5Var != null) {
                try {
                    contentValues.put("recommendCard", tk5Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandRecommendCard", e17.getMessage());
                }
            } else {
                contentValues.put("recommendCard", (byte[]) null);
            }
        }
        long j17 = this.systemRowid;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    @Override // l75.f0
    public void createMyTable(l75.k0 k0Var) {
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandRecommendCard", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AppBrandRecommendCard ( ");
        l75.e0 e0Var = f236512n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236508g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandRecommendCard", "createTableSql %s", str2);
            k0Var.A("AppBrandRecommendCard", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AppBrandRecommendCard", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandRecommendCard", "updateTableSql %s", str3);
            k0Var.A("AppBrandRecommendCard", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAppBrandRecommendCard", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236512n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236513o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_appId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236507f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236507f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f236514d = true;
            }
        }
        if (contentValues.containsKey("recommendCard")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("recommendCard");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_recommendCard = (r45.tk5) new r45.tk5().parseFrom(asByteArray);
                    if (z17) {
                        this.f236515e = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAppBrandRecommendCard", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
