package dm;

/* loaded from: classes4.dex */
public class oa extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f239009h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f239010i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f239011m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f239012n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f239013o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f239014p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239015q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f239016r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f239017s;
    public byte[] field_draft;
    public int field_extFlag;
    public java.lang.String field_key;
    public long field_timestamp;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239018d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239019e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239020f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239021g = true;

    static {
        p75.n0 n0Var = new p75.n0("SnsDraft");
        f239009h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239010i = new java.lang.String[0];
        f239011m = 106079;
        f239012n = 55126294;
        f239013o = -1306589907;
        f239014p = 95844769;
        f239015q = 108705909;
        f239016r = initAutoDBInfo(dm.oa.class);
        f239017s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "key";
        e0Var.f316955d.put("key", "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = "key";
        e0Var.f316954c[1] = com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP;
        e0Var.f316955d.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "LONG default '0' ");
        e0Var.f316954c[2] = "extFlag";
        e0Var.f316955d.put("extFlag", "INTEGER default '0' ");
        e0Var.f316954c[3] = "draft";
        e0Var.f316955d.put("draft", "BLOB");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " key TEXT default ''  PRIMARY KEY ,  timestamp LONG default '0' ,  extFlag INTEGER default '0' ,  draft BLOB";
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
            if (f239011m == hashCode) {
                try {
                    this.field_key = cursor.getString(i17);
                    this.f239018d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsDraft", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239012n == hashCode) {
                try {
                    this.field_timestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsDraft", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239013o == hashCode) {
                try {
                    this.field_extFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsDraft", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239014p == hashCode) {
                try {
                    this.field_draft = cursor.getBlob(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSnsDraft", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239015q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_key == null) {
            this.field_key = "";
        }
        if (this.f239018d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f239019e) {
            contentValues.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(this.field_timestamp));
        }
        if (this.f239020f) {
            contentValues.put("extFlag", java.lang.Integer.valueOf(this.field_extFlag));
        }
        if (this.f239021g) {
            contentValues.put("draft", this.field_draft);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseSnsDraft", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SnsDraft ( ");
        l75.e0 e0Var = f239016r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239010i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsDraft", "createTableSql %s", str2);
            k0Var.A("SnsDraft", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "SnsDraft", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsDraft", "updateTableSql %s", str3);
            k0Var.A("SnsDraft", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSnsDraft", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239016r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239017s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_key;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239009h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239009h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z17) {
                this.f239018d = true;
            }
        }
        if (contentValues.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP).longValue();
            if (z17) {
                this.f239019e = true;
            }
        }
        if (contentValues.containsKey("extFlag")) {
            this.field_extFlag = contentValues.getAsInteger("extFlag").intValue();
            if (z17) {
                this.f239020f = true;
            }
        }
        if (contentValues.containsKey("draft")) {
            this.field_draft = contentValues.getAsByteArray("draft");
            if (z17) {
                this.f239021g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
