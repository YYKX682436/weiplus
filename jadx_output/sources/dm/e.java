package dm;

/* loaded from: classes4.dex */
public class e extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f236488n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f236489o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f236490p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236491q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f236492r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f236493s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236494t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236495u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236496v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236497w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f236498x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f236499y;
    public java.lang.String field_boxFTS;
    public java.lang.String field_boxJSON;
    public java.lang.String field_chatId;
    public java.lang.String field_extInfo;
    public java.lang.String field_query;
    public java.lang.String field_searchId;
    public long field_timeStamp;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236500d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236501e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236502f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236503g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236504h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236505i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236506m = true;

    static {
        p75.n0 n0Var = new p75.n0("AIHistoryMessage");
        f236488n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236489o = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS AIHistoryMessage_chatId_index ON AIHistoryMessage(chatId)", "CREATE INDEX IF NOT EXISTS AIHistoryMessage_timeStamp_index ON AIHistoryMessage(timeStamp)"};
        f236490p = 888644835;
        f236491q = -1361631597;
        f236492r = 25573622;
        f236493s = 107944136;
        f236494t = 71992627;
        f236495u = -1383154790;
        f236496v = -1306498449;
        f236497w = 108705909;
        f236498x = initAutoDBInfo(dm.e.class);
        f236499y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "searchId";
        e0Var.f316955d.put("searchId", "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = "searchId";
        e0Var.f316954c[1] = "chatId";
        e0Var.f316955d.put("chatId", "TEXT default '' ");
        e0Var.f316954c[2] = "timeStamp";
        e0Var.f316955d.put("timeStamp", "LONG default '0' ");
        e0Var.f316954c[3] = "query";
        e0Var.f316955d.put("query", "TEXT default '' ");
        e0Var.f316954c[4] = "boxJSON";
        e0Var.f316955d.put("boxJSON", "TEXT default '' ");
        e0Var.f316954c[5] = "boxFTS";
        e0Var.f316955d.put("boxFTS", "TEXT default '' ");
        e0Var.f316954c[6] = "extInfo";
        e0Var.f316955d.put("extInfo", "TEXT default '' ");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " searchId TEXT default ''  PRIMARY KEY ,  chatId TEXT default '' ,  timeStamp LONG default '0' ,  query TEXT default '' ,  boxJSON TEXT default '' ,  boxFTS TEXT default '' ,  extInfo TEXT default '' ";
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
            if (f236490p == hashCode) {
                try {
                    this.field_searchId = cursor.getString(i17);
                    this.f236500d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAIHistoryMessage", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236491q == hashCode) {
                try {
                    this.field_chatId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAIHistoryMessage", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236492r == hashCode) {
                try {
                    this.field_timeStamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAIHistoryMessage", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236493s == hashCode) {
                try {
                    this.field_query = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAIHistoryMessage", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236494t == hashCode) {
                try {
                    this.field_boxJSON = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAIHistoryMessage", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236495u == hashCode) {
                try {
                    this.field_boxFTS = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAIHistoryMessage", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236496v == hashCode) {
                try {
                    this.field_extInfo = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAIHistoryMessage", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236497w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_searchId == null) {
            this.field_searchId = "";
        }
        if (this.f236500d) {
            contentValues.put("searchId", this.field_searchId);
        }
        if (this.field_chatId == null) {
            this.field_chatId = "";
        }
        if (this.f236501e) {
            contentValues.put("chatId", this.field_chatId);
        }
        if (this.f236502f) {
            contentValues.put("timeStamp", java.lang.Long.valueOf(this.field_timeStamp));
        }
        if (this.field_query == null) {
            this.field_query = "";
        }
        if (this.f236503g) {
            contentValues.put("query", this.field_query);
        }
        if (this.field_boxJSON == null) {
            this.field_boxJSON = "";
        }
        if (this.f236504h) {
            contentValues.put("boxJSON", this.field_boxJSON);
        }
        if (this.field_boxFTS == null) {
            this.field_boxFTS = "";
        }
        if (this.f236505i) {
            contentValues.put("boxFTS", this.field_boxFTS);
        }
        if (this.field_extInfo == null) {
            this.field_extInfo = "";
        }
        if (this.f236506m) {
            contentValues.put("extInfo", this.field_extInfo);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAIHistoryMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AIHistoryMessage ( ");
        l75.e0 e0Var = f236498x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236489o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAIHistoryMessage", "createTableSql %s", str2);
            k0Var.A("AIHistoryMessage", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AIHistoryMessage", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAIHistoryMessage", "updateTableSql %s", str3);
            k0Var.A("AIHistoryMessage", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAIHistoryMessage", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236498x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236499y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_searchId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236488n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236488n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("searchId")) {
            this.field_searchId = contentValues.getAsString("searchId");
            if (z17) {
                this.f236500d = true;
            }
        }
        if (contentValues.containsKey("chatId")) {
            this.field_chatId = contentValues.getAsString("chatId");
            if (z17) {
                this.f236501e = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.field_timeStamp = contentValues.getAsLong("timeStamp").longValue();
            if (z17) {
                this.f236502f = true;
            }
        }
        if (contentValues.containsKey("query")) {
            this.field_query = contentValues.getAsString("query");
            if (z17) {
                this.f236503g = true;
            }
        }
        if (contentValues.containsKey("boxJSON")) {
            this.field_boxJSON = contentValues.getAsString("boxJSON");
            if (z17) {
                this.f236504h = true;
            }
        }
        if (contentValues.containsKey("boxFTS")) {
            this.field_boxFTS = contentValues.getAsString("boxFTS");
            if (z17) {
                this.f236505i = true;
            }
        }
        if (contentValues.containsKey("extInfo")) {
            this.field_extInfo = contentValues.getAsString("extInfo");
            if (z17) {
                this.f236506m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
