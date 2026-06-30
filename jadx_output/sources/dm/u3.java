package dm;

/* loaded from: classes4.dex */
public class u3 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f240269i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f240270m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f240271n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f240272o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f240273p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f240274q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f240275r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f240276s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f240277t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f240278u;
    public java.lang.String field_aeskey;
    public java.lang.String field_cgi;
    public java.lang.String field_filePath;
    public long field_msgSvrId;
    public long field_overwriteNewMsgId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240279d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240280e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240281f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240282g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240283h = true;

    static {
        p75.n0 n0Var = new p75.n0("FileMsgInfo");
        f240269i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240270m = new java.lang.String[0];
        f240271n = -1294411543;
        f240272o = -565909657;
        f240273p = 98437;
        f240274q = -1421131984;
        f240275r = -735662143;
        f240276s = 108705909;
        f240277t = initAutoDBInfo(dm.u3.class);
        f240278u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "msgSvrId";
        e0Var.f316955d.put("msgSvrId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "msgSvrId";
        e0Var.f316954c[1] = "overwriteNewMsgId";
        e0Var.f316955d.put("overwriteNewMsgId", "LONG");
        e0Var.f316954c[2] = "cgi";
        e0Var.f316955d.put("cgi", "TEXT default '' ");
        e0Var.f316954c[3] = "aeskey";
        e0Var.f316955d.put("aeskey", "TEXT default '' ");
        e0Var.f316954c[4] = com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH;
        e0Var.f316955d.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "TEXT default '' ");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " msgSvrId LONG PRIMARY KEY ,  overwriteNewMsgId LONG,  cgi TEXT default '' ,  aeskey TEXT default '' ,  filePath TEXT default '' ";
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
            if (f240271n == hashCode) {
                try {
                    this.field_msgSvrId = cursor.getLong(i17);
                    this.f240279d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFileMsgInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240272o == hashCode) {
                try {
                    this.field_overwriteNewMsgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFileMsgInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240273p == hashCode) {
                try {
                    this.field_cgi = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFileMsgInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240274q == hashCode) {
                try {
                    this.field_aeskey = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFileMsgInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240275r == hashCode) {
                try {
                    this.field_filePath = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFileMsgInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240276s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240279d) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.field_msgSvrId));
        }
        if (this.f240280e) {
            contentValues.put("overwriteNewMsgId", java.lang.Long.valueOf(this.field_overwriteNewMsgId));
        }
        if (this.field_cgi == null) {
            this.field_cgi = "";
        }
        if (this.f240281f) {
            contentValues.put("cgi", this.field_cgi);
        }
        if (this.field_aeskey == null) {
            this.field_aeskey = "";
        }
        if (this.f240282g) {
            contentValues.put("aeskey", this.field_aeskey);
        }
        if (this.field_filePath == null) {
            this.field_filePath = "";
        }
        if (this.f240283h) {
            contentValues.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.field_filePath);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFileMsgInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FileMsgInfo ( ");
        l75.e0 e0Var = f240277t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240270m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFileMsgInfo", "createTableSql %s", str2);
            k0Var.A("FileMsgInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FileMsgInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFileMsgInfo", "updateTableSql %s", str3);
            k0Var.A("FileMsgInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFileMsgInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240277t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240278u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_msgSvrId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240269i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240269i.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "msgSvrId", java.lang.Long.valueOf(this.field_msgSvrId));
            n51.f.b(jSONObject, "overwriteNewMsgId", java.lang.Long.valueOf(this.field_overwriteNewMsgId));
            n51.f.b(jSONObject, "cgi", this.field_cgi);
            n51.f.b(jSONObject, "aeskey", this.field_aeskey);
            n51.f.b(jSONObject, com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, this.field_filePath);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z17) {
                this.f240279d = true;
            }
        }
        if (contentValues.containsKey("overwriteNewMsgId")) {
            this.field_overwriteNewMsgId = contentValues.getAsLong("overwriteNewMsgId").longValue();
            if (z17) {
                this.f240280e = true;
            }
        }
        if (contentValues.containsKey("cgi")) {
            this.field_cgi = contentValues.getAsString("cgi");
            if (z17) {
                this.f240281f = true;
            }
        }
        if (contentValues.containsKey("aeskey")) {
            this.field_aeskey = contentValues.getAsString("aeskey");
            if (z17) {
                this.f240282g = true;
            }
        }
        if (contentValues.containsKey(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH)) {
            this.field_filePath = contentValues.getAsString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            if (z17) {
                this.f240283h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
