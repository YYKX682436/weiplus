package dm;

/* loaded from: classes4.dex */
public class ca extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f236197h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f236198i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f236199m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f236200n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f236201o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f236202p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236203q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f236204r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f236205s;
    public r45.ty field_chatHistoryItem;
    public java.lang.String field_historyId;
    public long field_msgId;
    public java.lang.String field_talker;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236206d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236207e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236208f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236209g = true;

    static {
        p75.n0 n0Var = new p75.n0("SelectRecord");
        f236197h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236198i = new java.lang.String[0];
        f236199m = 1725503695;
        f236200n = 104191100;
        f236201o = -881080743;
        f236202p = -696748209;
        f236203q = 108705909;
        f236204r = initAutoDBInfo(dm.ca.class);
        f236205s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "historyId";
        e0Var.f316955d.put("historyId", "TEXT");
        e0Var.f316954c[1] = "msgId";
        e0Var.f316955d.put("msgId", "LONG");
        e0Var.f316954c[2] = "talker";
        e0Var.f316955d.put("talker", "TEXT");
        e0Var.f316954c[3] = "chatHistoryItem";
        e0Var.f316955d.put("chatHistoryItem", "BLOB");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " historyId TEXT,  msgId LONG,  talker TEXT,  chatHistoryItem BLOB";
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
            if (f236199m == hashCode) {
                try {
                    this.field_historyId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSelectRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236200n == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSelectRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236201o == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSelectRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236202p == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_chatHistoryItem = (r45.ty) new r45.ty().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseSelectRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236203q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236206d) {
            contentValues.put("historyId", this.field_historyId);
        }
        if (this.f236207e) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
        }
        if (this.f236208f) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f236209g) {
            r45.ty tyVar = this.field_chatHistoryItem;
            if (tyVar != null) {
                try {
                    contentValues.put("chatHistoryItem", tyVar.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseSelectRecord", e17.getMessage());
                }
            } else {
                contentValues.put("chatHistoryItem", (byte[]) null);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseSelectRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS SelectRecord ( ");
        l75.e0 e0Var = f236204r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236198i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSelectRecord", "createTableSql %s", str2);
            k0Var.A("SelectRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "SelectRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSelectRecord", "updateTableSql %s", str3);
            k0Var.A("SelectRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseSelectRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236204r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236205s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236197h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236197h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("historyId")) {
            this.field_historyId = contentValues.getAsString("historyId");
            if (z17) {
                this.f236206d = true;
            }
        }
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f236207e = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f236208f = true;
            }
        }
        if (contentValues.containsKey("chatHistoryItem")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("chatHistoryItem");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_chatHistoryItem = (r45.ty) new r45.ty().parseFrom(asByteArray);
                    if (z17) {
                        this.f236209g = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseSelectRecord", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
