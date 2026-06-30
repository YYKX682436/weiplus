package dm;

/* loaded from: classes8.dex */
public class m8 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f238509i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.d f238510m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f238511n;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.d f238512o;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.d f238513p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f238514q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f238515r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238516s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238517t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238518u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238519v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238520w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f238521x;

    /* renamed from: y, reason: collision with root package name */
    public static final l75.e0 f238522y;

    /* renamed from: z, reason: collision with root package name */
    public static final o75.e f238523z;
    public long field_createTime;
    public java.lang.String field_digest;
    public int field_is_special_talker;
    public long field_msgId;
    public java.lang.String field_talker;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238524d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238525e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238526f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238527g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238528h = true;

    static {
        p75.n0 n0Var = new p75.n0("NotifyMessageRecord");
        f238509i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238510m = new p75.d("msgId", "long", tableName, "");
        f238511n = new p75.d("talker", "string", tableName, "");
        f238512o = new p75.d("createTime", "long", tableName, "");
        f238513p = new p75.d("digest", "string", tableName, "");
        f238514q = new p75.d("is_special_talker", "int", tableName, "");
        f238515r = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS notifymessagerecordTalkerIndex ON NotifyMessageRecord(talker)"};
        f238516s = 104191100;
        f238517t = -881080743;
        f238518u = 1369213417;
        f238519v = -1331913276;
        f238520w = -804054956;
        f238521x = 108705909;
        f238522y = initAutoDBInfo(dm.m8.class);
        f238523z = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "msgId";
        e0Var.f316955d.put("msgId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "msgId";
        e0Var.f316954c[1] = "talker";
        e0Var.f316955d.put("talker", "TEXT");
        e0Var.f316954c[2] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[3] = "digest";
        e0Var.f316955d.put("digest", "TEXT");
        e0Var.f316954c[4] = "is_special_talker";
        e0Var.f316955d.put("is_special_talker", "INTEGER");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " msgId LONG PRIMARY KEY ,  talker TEXT,  createTime LONG,  digest TEXT,  is_special_talker INTEGER";
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
            if (f238516s == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                    this.f238524d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNotifyMessageRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238517t == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNotifyMessageRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238518u == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNotifyMessageRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238519v == hashCode) {
                try {
                    this.field_digest = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNotifyMessageRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238520w == hashCode) {
                try {
                    this.field_is_special_talker = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseNotifyMessageRecord", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238521x == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238524d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
        }
        if (this.f238525e) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f238526f) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f238527g) {
            contentValues.put("digest", this.field_digest);
        }
        if (this.f238528h) {
            contentValues.put("is_special_talker", java.lang.Integer.valueOf(this.field_is_special_talker));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseNotifyMessageRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS NotifyMessageRecord ( ");
        l75.e0 e0Var = f238522y;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238515r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseNotifyMessageRecord", "createTableSql %s", str2);
            k0Var.A("NotifyMessageRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "NotifyMessageRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseNotifyMessageRecord", "updateTableSql %s", str3);
            k0Var.A("NotifyMessageRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseNotifyMessageRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238522y;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238523z;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_msgId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238509i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238509i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f238524d = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f238525e = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f238526f = true;
            }
        }
        if (contentValues.containsKey("digest")) {
            this.field_digest = contentValues.getAsString("digest");
            if (z17) {
                this.f238527g = true;
            }
        }
        if (contentValues.containsKey("is_special_talker")) {
            this.field_is_special_talker = contentValues.getAsInteger("is_special_talker").intValue();
            if (z17) {
                this.f238528h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
