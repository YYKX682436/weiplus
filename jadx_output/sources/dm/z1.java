package dm;

/* loaded from: classes8.dex */
public class z1 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f241366m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f241367n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f241368o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f241369p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f241370q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f241371r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f241372s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f241373t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f241374u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f241375v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f241376w;
    public long field_lastLocalCreateTime;
    public long field_lastLocalSeq;
    public long field_lastPushCreateTime;
    public long field_lastPushSeq;
    public mo.d field_seqBlockInfo;
    public java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241377d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241378e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241379f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241380g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241381h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241382i = true;

    static {
        p75.n0 n0Var = new p75.n0("ChatroomMsgSeq");
        f241366m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241367n = new java.lang.String[0];
        f241368o = -265713450;
        f241369p = 1664358255;
        f241370q = 180332970;
        f241371r = -617571111;
        f241372s = 230826558;
        f241373t = -1293914820;
        f241374u = 108705909;
        f241375v = initAutoDBInfo(dm.z1.class);
        f241376w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_USERNAME;
        e0Var.f316954c[1] = "lastPushSeq";
        e0Var.f316955d.put("lastPushSeq", "LONG");
        e0Var.f316954c[2] = "lastLocalSeq";
        e0Var.f316955d.put("lastLocalSeq", "LONG");
        e0Var.f316954c[3] = "lastPushCreateTime";
        e0Var.f316955d.put("lastPushCreateTime", "LONG");
        e0Var.f316954c[4] = "lastLocalCreateTime";
        e0Var.f316955d.put("lastLocalCreateTime", "LONG");
        e0Var.f316954c[5] = "seqBlockInfo";
        e0Var.f316955d.put("seqBlockInfo", "BLOB");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " username TEXT default ''  PRIMARY KEY ,  lastPushSeq LONG,  lastLocalSeq LONG,  lastPushCreateTime LONG,  lastLocalCreateTime LONG,  seqBlockInfo BLOB";
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
            if (f241368o == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                    this.f241377d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomMsgSeq", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241369p == hashCode) {
                try {
                    this.field_lastPushSeq = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomMsgSeq", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241370q == hashCode) {
                try {
                    this.field_lastLocalSeq = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomMsgSeq", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241371r == hashCode) {
                try {
                    this.field_lastPushCreateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomMsgSeq", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241372s == hashCode) {
                try {
                    this.field_lastLocalCreateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomMsgSeq", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241373t == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_seqBlockInfo = (mo.d) new mo.d().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomMsgSeq", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241374u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f241377d) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f241378e) {
            contentValues.put("lastPushSeq", java.lang.Long.valueOf(this.field_lastPushSeq));
        }
        if (this.f241379f) {
            contentValues.put("lastLocalSeq", java.lang.Long.valueOf(this.field_lastLocalSeq));
        }
        if (this.f241380g) {
            contentValues.put("lastPushCreateTime", java.lang.Long.valueOf(this.field_lastPushCreateTime));
        }
        if (this.f241381h) {
            contentValues.put("lastLocalCreateTime", java.lang.Long.valueOf(this.field_lastLocalCreateTime));
        }
        if (this.f241382i) {
            mo.d dVar = this.field_seqBlockInfo;
            if (dVar != null) {
                try {
                    contentValues.put("seqBlockInfo", dVar.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseChatroomMsgSeq", e17.getMessage());
                }
            } else {
                contentValues.put("seqBlockInfo", (byte[]) null);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseChatroomMsgSeq", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ChatroomMsgSeq ( ");
        l75.e0 e0Var = f241375v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241367n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseChatroomMsgSeq", "createTableSql %s", str2);
            k0Var.A("ChatroomMsgSeq", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ChatroomMsgSeq", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseChatroomMsgSeq", "updateTableSql %s", str3);
            k0Var.A("ChatroomMsgSeq", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseChatroomMsgSeq", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241375v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241376w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_username;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241366m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241366m.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, dm.i4.COL_USERNAME, this.field_username);
            n51.f.b(jSONObject, "lastPushSeq", java.lang.Long.valueOf(this.field_lastPushSeq));
            n51.f.b(jSONObject, "lastLocalSeq", java.lang.Long.valueOf(this.field_lastLocalSeq));
            n51.f.b(jSONObject, "lastPushCreateTime", java.lang.Long.valueOf(this.field_lastPushCreateTime));
            n51.f.b(jSONObject, "lastLocalCreateTime", java.lang.Long.valueOf(this.field_lastLocalCreateTime));
            n51.f.b(jSONObject, "seqBlockInfo", this.field_seqBlockInfo);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f241377d = true;
            }
        }
        if (contentValues.containsKey("lastPushSeq")) {
            this.field_lastPushSeq = contentValues.getAsLong("lastPushSeq").longValue();
            if (z17) {
                this.f241378e = true;
            }
        }
        if (contentValues.containsKey("lastLocalSeq")) {
            this.field_lastLocalSeq = contentValues.getAsLong("lastLocalSeq").longValue();
            if (z17) {
                this.f241379f = true;
            }
        }
        if (contentValues.containsKey("lastPushCreateTime")) {
            this.field_lastPushCreateTime = contentValues.getAsLong("lastPushCreateTime").longValue();
            if (z17) {
                this.f241380g = true;
            }
        }
        if (contentValues.containsKey("lastLocalCreateTime")) {
            this.field_lastLocalCreateTime = contentValues.getAsLong("lastLocalCreateTime").longValue();
            if (z17) {
                this.f241381h = true;
            }
        }
        if (contentValues.containsKey("seqBlockInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("seqBlockInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_seqBlockInfo = (mo.d) new mo.d().parseFrom(asByteArray);
                    if (z17) {
                        this.f241382i = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseChatroomMsgSeq", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
