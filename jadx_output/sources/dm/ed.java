package dm;

/* loaded from: classes4.dex */
public class ed extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f236733g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f236734h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f236735i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f236736m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f236737n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f236738o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f236739p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f236740q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236741d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236742e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236743f = true;
    public java.lang.String field_appId;
    public int field_appVersion;
    public long field_templateId;

    static {
        p75.n0 n0Var = new p75.n0("WxaVersionTemplateIdMapping");
        f236733g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236734h = new java.lang.String[0];
        f236735i = 93028124;
        f236736m = 1484112759;
        f236737n = 1304010549;
        f236738o = 108705909;
        f236739p = initAutoDBInfo(dm.ed.class);
        f236740q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[1] = "appVersion";
        e0Var.f316955d.put("appVersion", "INTEGER");
        e0Var.f316954c[2] = "templateId";
        e0Var.f316955d.put("templateId", "LONG");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " appId TEXT,  appVersion INTEGER,  templateId LONG";
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
            if (f236735i == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaVersionTemplateIdMapping", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236736m == hashCode) {
                try {
                    this.field_appVersion = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaVersionTemplateIdMapping", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236737n == hashCode) {
                try {
                    this.field_templateId = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxaVersionTemplateIdMapping", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236738o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236741d) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f236742e) {
            contentValues.put("appVersion", java.lang.Integer.valueOf(this.field_appVersion));
        }
        if (this.f236743f) {
            contentValues.put("templateId", java.lang.Long.valueOf(this.field_templateId));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWxaVersionTemplateIdMapping", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxaVersionTemplateIdMapping ( ");
        l75.e0 e0Var = f236739p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236734h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaVersionTemplateIdMapping", "createTableSql %s", str2);
            k0Var.A("WxaVersionTemplateIdMapping", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WxaVersionTemplateIdMapping", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaVersionTemplateIdMapping", "updateTableSql %s", str3);
            k0Var.A("WxaVersionTemplateIdMapping", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxaVersionTemplateIdMapping", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236739p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236740q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236733g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236733g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f236741d = true;
            }
        }
        if (contentValues.containsKey("appVersion")) {
            this.field_appVersion = contentValues.getAsInteger("appVersion").intValue();
            if (z17) {
                this.f236742e = true;
            }
        }
        if (contentValues.containsKey("templateId")) {
            this.field_templateId = contentValues.getAsLong("templateId").longValue();
            if (z17) {
                this.f236743f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
