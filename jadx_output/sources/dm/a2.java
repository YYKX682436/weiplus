package dm;

/* loaded from: classes8.dex */
public class a2 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f235564i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.d f235565m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f235566n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f235567o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f235568p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f235569q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f235570r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f235571s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f235572t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f235573u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f235574v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f235575w;
    public java.lang.String field_dataId;
    public java.lang.String field_dataPath;
    public long field_msgId;
    public long field_size;
    public java.lang.String field_thumbPath;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235576d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235577e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235578f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235579g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235580h = true;

    static {
        p75.n0 n0Var = new p75.n0("ChatroomNoticeAttachIndex");
        f235564i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235565m = new p75.d("msgId", "long", tableName, "");
        f235566n = new p75.d("dataId", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235567o = new java.lang.String[0];
        f235568p = 104191100;
        f235569q = -1338919323;
        f235570r = 1788928751;
        f235571s = 1329639195;
        f235572t = 3530753;
        f235573u = 108705909;
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "msgId";
        ((java.util.HashMap) e0Var.f316955d).put("msgId", "LONG");
        e0Var.f316954c[1] = "dataId";
        ((java.util.HashMap) e0Var.f316955d).put("dataId", "TEXT");
        e0Var.f316954c[2] = "dataPath";
        ((java.util.HashMap) e0Var.f316955d).put("dataPath", "TEXT");
        e0Var.f316954c[3] = "thumbPath";
        ((java.util.HashMap) e0Var.f316955d).put("thumbPath", "TEXT");
        e0Var.f316954c[4] = "size";
        ((java.util.HashMap) e0Var.f316955d).put("size", "LONG");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " msgId LONG,  dataId TEXT,  dataPath TEXT,  thumbPath TEXT,  size LONG";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        f235574v = e0Var;
        f235575w = new o75.e();
    }

    public static void createTable(l75.k0 k0Var) {
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ChatroomNoticeAttachIndex ( ");
        l75.e0 e0Var = f235574v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235567o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", "createTableSql %s", str2);
            k0Var.A("ChatroomNoticeAttachIndex", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ChatroomNoticeAttachIndex", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", "updateTableSql %s", str3);
            k0Var.A("ChatroomNoticeAttachIndex", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
            if (f235568p == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235569q == hashCode) {
                try {
                    this.field_dataId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235570r == hashCode) {
                try {
                    this.field_dataPath = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235571s == hashCode) {
                try {
                    this.field_thumbPath = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235572t == hashCode) {
                try {
                    this.field_size = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseChatroomNoticeAttachIndex", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235573u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235576d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
        }
        if (this.f235577e) {
            contentValues.put("dataId", this.field_dataId);
        }
        if (this.f235578f) {
            contentValues.put("dataPath", this.field_dataPath);
        }
        if (this.f235579g) {
            contentValues.put("thumbPath", this.field_thumbPath);
        }
        if (this.f235580h) {
            contentValues.put("size", java.lang.Long.valueOf(this.field_size));
        }
        long j17 = this.systemRowid;
        if (j17 > 0) {
            contentValues.put("rowid", java.lang.Long.valueOf(j17));
        }
        return contentValues;
    }

    @Override // l75.f0
    public void createMyTable(l75.k0 k0Var) {
        createTable(k0Var);
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235574v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235575w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235564i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235564i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f235576d = true;
            }
        }
        if (contentValues.containsKey("dataId")) {
            this.field_dataId = contentValues.getAsString("dataId");
            if (z17) {
                this.f235577e = true;
            }
        }
        if (contentValues.containsKey("dataPath")) {
            this.field_dataPath = contentValues.getAsString("dataPath");
            if (z17) {
                this.f235578f = true;
            }
        }
        if (contentValues.containsKey("thumbPath")) {
            this.field_thumbPath = contentValues.getAsString("thumbPath");
            if (z17) {
                this.f235579g = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsLong("size").longValue();
            if (z17) {
                this.f235580h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
