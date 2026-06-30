package dm;

/* loaded from: classes4.dex */
public class h3 extends l75.f0 {
    public static final l75.e0 A;
    public static final o75.e B;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f237332n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f237333o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f237334p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f237335q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f237336r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f237337s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f237338t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f237339u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f237340v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f237341w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f237342x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f237343y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f237344z;
    private java.lang.String field_auxIndex;
    private long field_docId;
    private long field_entityId;
    private int field_status;
    private int field_subType;
    private long field_timestamp;
    private int field_type;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237345d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237346e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237347f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237348g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237349h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237350i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237351m = false;

    static {
        p75.n0 n0Var = new p75.n0("FTS5MetaMessage");
        f237332n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237333o = new p75.d("entity_id", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237334p = new p75.d(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "long", tableName, "");
        f237335q = new p75.d("status", "int", tableName, "");
        f237336r = new java.lang.String[0];
        f237337s = 95757395;
        f237338t = 3575610;
        f237339u = -1867567750;
        f237340v = -740565257;
        f237341w = 467329943;
        f237342x = 55126294;
        f237343y = -892481550;
        f237344z = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "docid";
        ((java.util.HashMap) e0Var.f316955d).put("docid", "LONG default '0'  PRIMARY KEY ");
        e0Var.f316953b = "docid";
        e0Var.f316954c[1] = "type";
        ((java.util.HashMap) e0Var.f316955d).put("type", "INTEGER default '0' ");
        e0Var.f316954c[2] = "subtype";
        ((java.util.HashMap) e0Var.f316955d).put("subtype", "INTEGER default '0' ");
        e0Var.f316954c[3] = "entity_id";
        ((java.util.HashMap) e0Var.f316955d).put("entity_id", "LONG default '0' ");
        e0Var.f316954c[4] = "aux_index";
        ((java.util.HashMap) e0Var.f316955d).put("aux_index", "TEXT default '' ");
        e0Var.f316954c[5] = com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP;
        ((java.util.HashMap) e0Var.f316955d).put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "LONG default '0' ");
        e0Var.f316954c[6] = "status";
        ((java.util.HashMap) e0Var.f316955d).put("status", "INTEGER default '0' ");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " docid LONG default '0'  PRIMARY KEY ,  type INTEGER default '0' ,  subtype INTEGER default '0' ,  entity_id LONG default '0' ,  aux_index TEXT default '' ,  timestamp LONG default '0' ,  status INTEGER default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        A = e0Var;
        B = new o75.e();
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
            if (f237337s == hashCode) {
                try {
                    this.field_docId = cursor.getLong(i17);
                    this.f237345d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaMessage", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237338t == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaMessage", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237339u == hashCode) {
                try {
                    this.field_subType = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaMessage", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237340v == hashCode) {
                try {
                    this.field_entityId = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaMessage", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237341w == hashCode) {
                try {
                    this.field_auxIndex = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaMessage", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237342x == hashCode) {
                try {
                    this.field_timestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaMessage", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237343y == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaMessage", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237344z == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237345d) {
            contentValues.put("docid", java.lang.Long.valueOf(this.field_docId));
        }
        if (this.f237346e) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f237347f) {
            contentValues.put("subtype", java.lang.Integer.valueOf(this.field_subType));
        }
        if (this.f237348g) {
            contentValues.put("entity_id", java.lang.Long.valueOf(this.field_entityId));
        }
        if (this.field_auxIndex == null) {
            this.field_auxIndex = "";
        }
        if (this.f237349h) {
            contentValues.put("aux_index", this.field_auxIndex);
        }
        if (this.f237350i) {
            contentValues.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(this.field_timestamp));
        }
        if (this.f237351m) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFTS5MetaMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FTS5MetaMessage ( ");
        l75.e0 e0Var = A;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237336r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFTS5MetaMessage", "createTableSql %s", str2);
            k0Var.A("FTS5MetaMessage", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FTS5MetaMessage", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFTS5MetaMessage", "updateTableSql %s", str3);
            k0Var.A("FTS5MetaMessage", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFTS5MetaMessage", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return A;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return B;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_docId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237332n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237332n.f352676a;
    }

    public long t0() {
        return this.field_entityId;
    }

    public long u0() {
        return this.field_timestamp;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("docid")) {
            this.field_docId = contentValues.getAsLong("docid").longValue();
            if (z17) {
                this.f237345d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f237346e = true;
            }
        }
        if (contentValues.containsKey("subtype")) {
            this.field_subType = contentValues.getAsInteger("subtype").intValue();
            if (z17) {
                this.f237347f = true;
            }
        }
        if (contentValues.containsKey("entity_id")) {
            this.field_entityId = contentValues.getAsLong("entity_id").longValue();
            if (z17) {
                this.f237348g = true;
            }
        }
        if (contentValues.containsKey("aux_index")) {
            this.field_auxIndex = contentValues.getAsString("aux_index");
            if (z17) {
                this.f237349h = true;
            }
        }
        if (contentValues.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP).longValue();
            if (z17) {
                this.f237350i = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f237351m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
