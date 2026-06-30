package rj4;

/* loaded from: classes8.dex */
public class f extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f396310p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f396311q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f396312r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f396313s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f396314t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f396315u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f396316v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f396317w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f396318x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f396319y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f396320z;
    public int field_CreateTime;
    public int field_DeleteInMsgList;
    public java.lang.String field_Description;
    public int field_Read;
    public int field_ShowType;
    public java.lang.String field_TextStatusId;
    public byte[] field_TopicInfo;
    public java.lang.String field_UserName;
    public java.lang.String field_thumbUrl;

    /* renamed from: d, reason: collision with root package name */
    public boolean f396321d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f396322e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f396323f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f396324g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f396325h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f396326i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f396327m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f396328n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f396329o = true;

    static {
        p75.n0 n0Var = new p75.n0("TextStatusReference");
        f396310p = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f396311q = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TextStatusReference_TextStatusId_index ON TextStatusReference(TextStatusId)"};
        f396312r = 1214784794;
        f396313s = -202022634;
        f396314t = -932289015;
        f396315u = 1566917561;
        f396316v = 2543030;
        f396317w = -1902930339;
        f396318x = 424807759;
        f396319y = -274170889;
        f396320z = -56677412;
        A = 108705909;
        B = initAutoDBInfo(rj4.f.class);
        C = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "TextStatusId";
        e0Var.f316955d.put("TextStatusId", "TEXT");
        e0Var.f316954c[1] = "UserName";
        e0Var.f316955d.put("UserName", "TEXT");
        e0Var.f316954c[2] = "CreateTime";
        e0Var.f316955d.put("CreateTime", "INTEGER");
        e0Var.f316954c[3] = "thumbUrl";
        e0Var.f316955d.put("thumbUrl", "TEXT");
        e0Var.f316954c[4] = "Read";
        e0Var.f316955d.put("Read", "INTEGER");
        e0Var.f316954c[5] = "TopicInfo";
        e0Var.f316955d.put("TopicInfo", "BLOB");
        e0Var.f316954c[6] = "DeleteInMsgList";
        e0Var.f316955d.put("DeleteInMsgList", "INTEGER");
        e0Var.f316954c[7] = "ShowType";
        e0Var.f316955d.put("ShowType", "INTEGER");
        e0Var.f316954c[8] = "Description";
        e0Var.f316955d.put("Description", "TEXT");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " TextStatusId TEXT,  UserName TEXT,  CreateTime INTEGER,  thumbUrl TEXT,  Read INTEGER,  TopicInfo BLOB,  DeleteInMsgList INTEGER,  ShowType INTEGER,  Description TEXT";
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
            if (f396312r == hashCode) {
                try {
                    this.field_TextStatusId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396313s == hashCode) {
                try {
                    this.field_UserName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396314t == hashCode) {
                try {
                    this.field_CreateTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396315u == hashCode) {
                try {
                    this.field_thumbUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396316v == hashCode) {
                try {
                    this.field_Read = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396317w == hashCode) {
                try {
                    this.field_TopicInfo = cursor.getBlob(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396318x == hashCode) {
                try {
                    this.field_DeleteInMsgList = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396319y == hashCode) {
                try {
                    this.field_ShowType = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396320z == hashCode) {
                try {
                    this.field_Description = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusReference", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f396321d) {
            contentValues.put("TextStatusId", this.field_TextStatusId);
        }
        if (this.f396322e) {
            contentValues.put("UserName", this.field_UserName);
        }
        if (this.f396323f) {
            contentValues.put("CreateTime", java.lang.Integer.valueOf(this.field_CreateTime));
        }
        if (this.f396324g) {
            contentValues.put("thumbUrl", this.field_thumbUrl);
        }
        if (this.f396325h) {
            contentValues.put("Read", java.lang.Integer.valueOf(this.field_Read));
        }
        if (this.f396326i) {
            contentValues.put("TopicInfo", this.field_TopicInfo);
        }
        if (this.f396327m) {
            contentValues.put("DeleteInMsgList", java.lang.Integer.valueOf(this.field_DeleteInMsgList));
        }
        if (this.f396328n) {
            contentValues.put("ShowType", java.lang.Integer.valueOf(this.field_ShowType));
        }
        if (this.f396329o) {
            contentValues.put("Description", this.field_Description);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseTextStatusReference", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TextStatusReference ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f396311q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusReference", "createTableSql %s", str2);
            k0Var.A("TextStatusReference", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "TextStatusReference", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusReference", "updateTableSql %s", str3);
            k0Var.A("TextStatusReference", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusReference", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f396310p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f396310p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("TextStatusId")) {
            this.field_TextStatusId = contentValues.getAsString("TextStatusId");
            if (z17) {
                this.f396321d = true;
            }
        }
        if (contentValues.containsKey("UserName")) {
            this.field_UserName = contentValues.getAsString("UserName");
            if (z17) {
                this.f396322e = true;
            }
        }
        if (contentValues.containsKey("CreateTime")) {
            this.field_CreateTime = contentValues.getAsInteger("CreateTime").intValue();
            if (z17) {
                this.f396323f = true;
            }
        }
        if (contentValues.containsKey("thumbUrl")) {
            this.field_thumbUrl = contentValues.getAsString("thumbUrl");
            if (z17) {
                this.f396324g = true;
            }
        }
        if (contentValues.containsKey("Read")) {
            this.field_Read = contentValues.getAsInteger("Read").intValue();
            if (z17) {
                this.f396325h = true;
            }
        }
        if (contentValues.containsKey("TopicInfo")) {
            this.field_TopicInfo = contentValues.getAsByteArray("TopicInfo");
            if (z17) {
                this.f396326i = true;
            }
        }
        if (contentValues.containsKey("DeleteInMsgList")) {
            this.field_DeleteInMsgList = contentValues.getAsInteger("DeleteInMsgList").intValue();
            if (z17) {
                this.f396327m = true;
            }
        }
        if (contentValues.containsKey("ShowType")) {
            this.field_ShowType = contentValues.getAsInteger("ShowType").intValue();
            if (z17) {
                this.f396328n = true;
            }
        }
        if (contentValues.containsKey("Description")) {
            this.field_Description = contentValues.getAsString("Description");
            if (z17) {
                this.f396329o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
