package dm;

/* loaded from: classes4.dex */
public class g3 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f237047n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f237048o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f237049p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f237050q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f237051r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f237052s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f237053t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f237054u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f237055v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f237056w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f237057x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f237058y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f237059z;
    private java.lang.String field_auxIndex;
    private int field_docId;
    private long field_entityId;
    private int field_status;
    private int field_subType;
    private long field_timestamp;
    private int field_type;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237060d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237061e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237062f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237063g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237064h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237065i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237066m = false;

    static {
        p75.n0 n0Var = new p75.n0("FTS5MetaContact");
        f237047n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237048o = new p75.d("type", "int", tableName, "");
        f237049p = new p75.d("subtype", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237050q = new p75.d("aux_index", "string", tableName, "");
        f237051r = new p75.d(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237052s = new java.lang.String[0];
        f237053t = 95757395;
        f237054u = 3575610;
        f237055v = -1867567750;
        f237056w = -740565257;
        f237057x = 467329943;
        f237058y = 55126294;
        f237059z = -892481550;
        A = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "docid";
        ((java.util.HashMap) e0Var.f316955d).put("docid", "INTEGER default '0'  PRIMARY KEY ");
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
        e0Var.f316956e = " docid INTEGER default '0'  PRIMARY KEY ,  type INTEGER default '0' ,  subtype INTEGER default '0' ,  entity_id LONG default '0' ,  aux_index TEXT default '' ,  timestamp LONG default '0' ,  status INTEGER default '0' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        B = e0Var;
        C = new o75.e();
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
            if (f237053t == hashCode) {
                try {
                    this.field_docId = cursor.getInt(i17);
                    this.f237060d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaContact", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237054u == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaContact", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237055v == hashCode) {
                try {
                    this.field_subType = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaContact", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237056w == hashCode) {
                try {
                    this.field_entityId = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaContact", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237057x == hashCode) {
                try {
                    this.field_auxIndex = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaContact", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237058y == hashCode) {
                try {
                    this.field_timestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaContact", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237059z == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFTS5MetaContact", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237060d) {
            contentValues.put("docid", java.lang.Integer.valueOf(this.field_docId));
        }
        if (this.f237061e) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f237062f) {
            contentValues.put("subtype", java.lang.Integer.valueOf(this.field_subType));
        }
        if (this.f237063g) {
            contentValues.put("entity_id", java.lang.Long.valueOf(this.field_entityId));
        }
        if (this.field_auxIndex == null) {
            this.field_auxIndex = "";
        }
        if (this.f237064h) {
            contentValues.put("aux_index", this.field_auxIndex);
        }
        if (this.f237065i) {
            contentValues.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(this.field_timestamp));
        }
        if (this.f237066m) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFTS5MetaContact", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FTS5MetaContact ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237052s) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFTS5MetaContact", "createTableSql %s", str2);
            k0Var.A("FTS5MetaContact", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FTS5MetaContact", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFTS5MetaContact", "updateTableSql %s", str3);
            k0Var.A("FTS5MetaContact", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFTS5MetaContact", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return B;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return C;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_docId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237047n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237047n.f352676a;
    }

    public java.lang.String t0() {
        return this.field_auxIndex;
    }

    public long u0() {
        return this.field_timestamp;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("docid")) {
            this.field_docId = contentValues.getAsInteger("docid").intValue();
            if (z17) {
                this.f237060d = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f237061e = true;
            }
        }
        if (contentValues.containsKey("subtype")) {
            this.field_subType = contentValues.getAsInteger("subtype").intValue();
            if (z17) {
                this.f237062f = true;
            }
        }
        if (contentValues.containsKey("entity_id")) {
            this.field_entityId = contentValues.getAsLong("entity_id").longValue();
            if (z17) {
                this.f237063g = true;
            }
        }
        if (contentValues.containsKey("aux_index")) {
            this.field_auxIndex = contentValues.getAsString("aux_index");
            if (z17) {
                this.f237064h = true;
            }
        }
        if (contentValues.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP).longValue();
            if (z17) {
                this.f237065i = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f237066m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
