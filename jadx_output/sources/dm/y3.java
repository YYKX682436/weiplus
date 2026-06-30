package dm;

/* loaded from: classes4.dex */
public class y3 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f241176m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f241177n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f241178o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f241179p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f241180q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f241181r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f241182s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f241183t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f241184u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f241185v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f241186w;
    public long field_createTime;
    public java.lang.String field_localId;
    public int field_pendingReason;
    public java.lang.String field_subType;
    public int field_type;
    public java.lang.String field_valuesJSON;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241187d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241188e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241189f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241190g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241191h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241192i = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderConsumeNewXmlData");
        f241176m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241177n = new java.lang.String[0];
        f241178o = 338409958;
        f241179p = -1868521062;
        f241180q = 2060525834;
        f241181r = 377305787;
        f241182s = 1369213417;
        f241183t = 3575610;
        f241184u = 108705909;
        f241185v = initAutoDBInfo(dm.y3.class);
        f241186w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_LOCALID;
        e0Var.f316955d.put(dm.i4.COL_LOCALID, "TEXT");
        e0Var.f316954c[1] = "subType";
        e0Var.f316955d.put("subType", "TEXT default '' ");
        e0Var.f316954c[2] = "valuesJSON";
        e0Var.f316955d.put("valuesJSON", "TEXT default '[object Object]' ");
        e0Var.f316954c[3] = "pendingReason";
        e0Var.f316955d.put("pendingReason", "INTEGER");
        e0Var.f316954c[4] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[5] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " localId TEXT,  subType TEXT default '' ,  valuesJSON TEXT default '[object Object]' ,  pendingReason INTEGER,  createTime LONG,  type INTEGER";
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
            if (f241178o == hashCode) {
                try {
                    this.field_localId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241179p == hashCode) {
                try {
                    this.field_subType = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241180q == hashCode) {
                try {
                    this.field_valuesJSON = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241181r == hashCode) {
                try {
                    this.field_pendingReason = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241182s == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241183t == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderConsumeNewXmlData", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241184u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241187d) {
            contentValues.put(dm.i4.COL_LOCALID, this.field_localId);
        }
        if (this.field_subType == null) {
            this.field_subType = "";
        }
        if (this.f241188e) {
            contentValues.put("subType", this.field_subType);
        }
        if (this.field_valuesJSON == null) {
            this.field_valuesJSON = "[object Object]";
        }
        if (this.f241189f) {
            contentValues.put("valuesJSON", this.field_valuesJSON);
        }
        if (this.f241190g) {
            contentValues.put("pendingReason", java.lang.Integer.valueOf(this.field_pendingReason));
        }
        if (this.f241191h) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f241192i) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderConsumeNewXmlData", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderConsumeNewXmlData ( ");
        l75.e0 e0Var = f241185v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241177n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderConsumeNewXmlData", "createTableSql %s", str2);
            k0Var.A("FinderConsumeNewXmlData", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderConsumeNewXmlData", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderConsumeNewXmlData", "updateTableSql %s", str3);
            k0Var.A("FinderConsumeNewXmlData", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderConsumeNewXmlData", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241185v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241186w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241176m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241176m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_LOCALID)) {
            this.field_localId = contentValues.getAsString(dm.i4.COL_LOCALID);
            if (z17) {
                this.f241187d = true;
            }
        }
        if (contentValues.containsKey("subType")) {
            this.field_subType = contentValues.getAsString("subType");
            if (z17) {
                this.f241188e = true;
            }
        }
        if (contentValues.containsKey("valuesJSON")) {
            this.field_valuesJSON = contentValues.getAsString("valuesJSON");
            if (z17) {
                this.f241189f = true;
            }
        }
        if (contentValues.containsKey("pendingReason")) {
            this.field_pendingReason = contentValues.getAsInteger("pendingReason").intValue();
            if (z17) {
                this.f241190g = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f241191h = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f241192i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
