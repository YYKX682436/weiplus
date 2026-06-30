package dm;

/* loaded from: classes4.dex */
public class qb extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f239487o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f239488p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239489q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239490r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239491s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f239492t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239493u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f239494v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f239495w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f239496x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f239497y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f239498z;
    public java.lang.String field_content;
    public long field_createTime;
    public int field_direction;
    public java.lang.String field_encryptTalker;
    public long field_msgSvrId;
    public int field_status;
    public java.lang.String field_talker;
    public long field_version;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239499d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239500e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239501f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239502g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239503h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239504i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239505m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239506n = true;

    static {
        p75.n0 n0Var = new p75.n0("VerifyRecordMsgInfo");
        f239487o = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239488p = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS VerifyRecordMsgInfo_encryptTalker_index ON VerifyRecordMsgInfo(encryptTalker)"};
        f239489q = -1294411543;
        f239490r = -962590849;
        f239491s = 1369213417;
        f239492t = -892481550;
        f239493u = 351608024;
        f239494v = -881080743;
        f239495w = -650394338;
        f239496x = 951530617;
        f239497y = 108705909;
        f239498z = initAutoDBInfo(dm.qb.class);
        A = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f316954c = strArr;
        strArr[0] = "msgSvrId";
        e0Var.f316955d.put("msgSvrId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "msgSvrId";
        e0Var.f316954c[1] = com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION;
        e0Var.f316955d.put(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION, "INTEGER");
        e0Var.f316954c[2] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[3] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[4] = "version";
        e0Var.f316955d.put("version", "LONG");
        e0Var.f316954c[5] = "talker";
        e0Var.f316955d.put("talker", "TEXT default '' ");
        e0Var.f316954c[6] = "encryptTalker";
        e0Var.f316955d.put("encryptTalker", "TEXT default '' ");
        e0Var.f316954c[7] = "content";
        e0Var.f316955d.put("content", "TEXT default '' ");
        e0Var.f316954c[8] = "rowid";
        e0Var.f316956e = " msgSvrId LONG PRIMARY KEY ,  direction INTEGER,  createTime LONG,  status INTEGER,  version LONG,  talker TEXT default '' ,  encryptTalker TEXT default '' ,  content TEXT default '' ";
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
            if (f239489q == hashCode) {
                try {
                    this.field_msgSvrId = cursor.getLong(i17);
                    this.f239499d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVerifyRecordMsgInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239490r == hashCode) {
                try {
                    this.field_direction = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVerifyRecordMsgInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239491s == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVerifyRecordMsgInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239492t == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVerifyRecordMsgInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239493u == hashCode) {
                try {
                    this.field_version = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVerifyRecordMsgInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239494v == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVerifyRecordMsgInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239495w == hashCode) {
                try {
                    this.field_encryptTalker = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVerifyRecordMsgInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239496x == hashCode) {
                try {
                    this.field_content = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVerifyRecordMsgInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239497y == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239499d) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.field_msgSvrId));
        }
        if (this.f239500e) {
            contentValues.put(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION, java.lang.Integer.valueOf(this.field_direction));
        }
        if (this.f239501f) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f239502g) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f239503h) {
            contentValues.put("version", java.lang.Long.valueOf(this.field_version));
        }
        if (this.field_talker == null) {
            this.field_talker = "";
        }
        if (this.f239504i) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.field_encryptTalker == null) {
            this.field_encryptTalker = "";
        }
        if (this.f239505m) {
            contentValues.put("encryptTalker", this.field_encryptTalker);
        }
        if (this.field_content == null) {
            this.field_content = "";
        }
        if (this.f239506n) {
            contentValues.put("content", this.field_content);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseVerifyRecordMsgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS VerifyRecordMsgInfo ( ");
        l75.e0 e0Var = f239498z;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239488p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseVerifyRecordMsgInfo", "createTableSql %s", str2);
            k0Var.A("VerifyRecordMsgInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "VerifyRecordMsgInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseVerifyRecordMsgInfo", "updateTableSql %s", str3);
            k0Var.A("VerifyRecordMsgInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseVerifyRecordMsgInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239498z;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return A;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_msgSvrId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239487o;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239487o.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "msgSvrId", java.lang.Long.valueOf(this.field_msgSvrId));
            n51.f.b(jSONObject, com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION, java.lang.Integer.valueOf(this.field_direction));
            n51.f.b(jSONObject, "createTime", java.lang.Long.valueOf(this.field_createTime));
            n51.f.b(jSONObject, "status", java.lang.Integer.valueOf(this.field_status));
            n51.f.b(jSONObject, "version", java.lang.Long.valueOf(this.field_version));
            n51.f.b(jSONObject, "talker", this.field_talker);
            n51.f.b(jSONObject, "encryptTalker", this.field_encryptTalker);
            n51.f.b(jSONObject, "content", this.field_content);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z17) {
                this.f239499d = true;
            }
        }
        if (contentValues.containsKey(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION)) {
            this.field_direction = contentValues.getAsInteger(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION).intValue();
            if (z17) {
                this.f239500e = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f239501f = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f239502g = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.field_version = contentValues.getAsLong("version").longValue();
            if (z17) {
                this.f239503h = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f239504i = true;
            }
        }
        if (contentValues.containsKey("encryptTalker")) {
            this.field_encryptTalker = contentValues.getAsString("encryptTalker");
            if (z17) {
                this.f239505m = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z17) {
                this.f239506n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
