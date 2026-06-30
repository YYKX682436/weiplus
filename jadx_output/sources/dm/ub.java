package dm;

/* loaded from: classes4.dex */
public class ub extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f240402g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f240403h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f240404i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f240405m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f240406n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f240407o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f240408p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f240409q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240410d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240411e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240412f = true;
    public java.lang.String field_cmsgId;
    public java.lang.String field_content;
    public long field_msgId;

    static {
        p75.n0 n0Var = new p75.n0("VoiceTransText");
        f240402g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240403h = new java.lang.String[0];
        f240404i = 104191100;
        f240405m = -1356490247;
        f240406n = 951530617;
        f240407o = 108705909;
        f240408p = initAutoDBInfo(dm.ub.class);
        f240409q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "msgId";
        e0Var.f316955d.put("msgId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "msgId";
        e0Var.f316954c[1] = "cmsgId";
        e0Var.f316955d.put("cmsgId", "TEXT");
        e0Var.f316954c[2] = "content";
        e0Var.f316955d.put("content", "TEXT default '' ");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " msgId LONG PRIMARY KEY ,  cmsgId TEXT,  content TEXT default '' ";
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
            if (f240404i == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                    this.f240410d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceTransText", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240405m == hashCode) {
                try {
                    this.field_cmsgId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceTransText", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240406n == hashCode) {
                try {
                    this.field_content = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseVoiceTransText", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240407o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240410d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
        }
        if (this.f240411e) {
            contentValues.put("cmsgId", this.field_cmsgId);
        }
        if (this.field_content == null) {
            this.field_content = "";
        }
        if (this.f240412f) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseVoiceTransText", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS VoiceTransText ( ");
        l75.e0 e0Var = f240408p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240403h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseVoiceTransText", "createTableSql %s", str2);
            k0Var.A("VoiceTransText", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "VoiceTransText", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseVoiceTransText", "updateTableSql %s", str3);
            k0Var.A("VoiceTransText", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseVoiceTransText", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240408p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240409q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_msgId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240402g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240402g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f240410d = true;
            }
        }
        if (contentValues.containsKey("cmsgId")) {
            this.field_cmsgId = contentValues.getAsString("cmsgId");
            if (z17) {
                this.f240411e = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z17) {
                this.f240412f = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
