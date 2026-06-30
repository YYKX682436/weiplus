package dm;

/* loaded from: classes8.dex */
public class d5 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f236359n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f236360o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f236361p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236362q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f236363r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f236364s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236365t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236366u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236367v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236368w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f236369x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f236370y;
    public int field_endTime;
    public int field_jumpDest;
    public int field_jumpScene;
    public java.lang.String field_keyWord;
    public long field_localId;
    public java.lang.String field_passByInfo;
    public int field_startTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236371d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236372e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236373f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236374g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236375h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236376i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236377m = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderSnsKeyWordsJumpConfig");
        f236359n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236360o = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderSnsKeyWordsJumpInfo_local_index ON FinderSnsKeyWordsJumpConfig(localId)"};
        f236361p = 338409958;
        f236362q = 673554686;
        f236363r = -255811600;
        f236364s = -2129294769;
        f236365t = -1607243192;
        f236366u = -815361527;
        f236367v = -217112298;
        f236368w = 108705909;
        f236369x = initAutoDBInfo(dm.d5.class);
        f236370y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_LOCALID;
        e0Var.f316955d.put(dm.i4.COL_LOCALID, "LONG PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_LOCALID;
        e0Var.f316954c[1] = "jumpScene";
        e0Var.f316955d.put("jumpScene", "INTEGER default '-1' ");
        e0Var.f316954c[2] = "jumpDest";
        e0Var.f316955d.put("jumpDest", "INTEGER default '-1' ");
        e0Var.f316954c[3] = "startTime";
        e0Var.f316955d.put("startTime", "INTEGER default '0' ");
        e0Var.f316954c[4] = "endTime";
        e0Var.f316955d.put("endTime", "INTEGER default '0' ");
        e0Var.f316954c[5] = "keyWord";
        e0Var.f316955d.put("keyWord", "TEXT");
        e0Var.f316954c[6] = "passByInfo";
        e0Var.f316955d.put("passByInfo", "TEXT");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " localId LONG PRIMARY KEY ,  jumpScene INTEGER default '-1' ,  jumpDest INTEGER default '-1' ,  startTime INTEGER default '0' ,  endTime INTEGER default '0' ,  keyWord TEXT,  passByInfo TEXT";
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
            if (f236361p == hashCode) {
                try {
                    this.field_localId = cursor.getLong(i17);
                    this.f236371d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236362q == hashCode) {
                try {
                    this.field_jumpScene = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236363r == hashCode) {
                try {
                    this.field_jumpDest = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236364s == hashCode) {
                try {
                    this.field_startTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236365t == hashCode) {
                try {
                    this.field_endTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236366u == hashCode) {
                try {
                    this.field_keyWord = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236367v == hashCode) {
                try {
                    this.field_passByInfo = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236368w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236371d) {
            contentValues.put(dm.i4.COL_LOCALID, java.lang.Long.valueOf(this.field_localId));
        }
        if (this.f236372e) {
            contentValues.put("jumpScene", java.lang.Integer.valueOf(this.field_jumpScene));
        }
        if (this.f236373f) {
            contentValues.put("jumpDest", java.lang.Integer.valueOf(this.field_jumpDest));
        }
        if (this.f236374g) {
            contentValues.put("startTime", java.lang.Integer.valueOf(this.field_startTime));
        }
        if (this.f236375h) {
            contentValues.put("endTime", java.lang.Integer.valueOf(this.field_endTime));
        }
        if (this.f236376i) {
            contentValues.put("keyWord", this.field_keyWord);
        }
        if (this.f236377m) {
            contentValues.put("passByInfo", this.field_passByInfo);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderSnsKeyWordsJumpConfig ( ");
        l75.e0 e0Var = f236369x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236360o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", "createTableSql %s", str2);
            k0Var.A("FinderSnsKeyWordsJumpConfig", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderSnsKeyWordsJumpConfig", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", "updateTableSql %s", str3);
            k0Var.A("FinderSnsKeyWordsJumpConfig", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderSnsKeyWordsJumpConfig", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236369x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236370y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_localId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236359n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236359n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_LOCALID)) {
            this.field_localId = contentValues.getAsLong(dm.i4.COL_LOCALID).longValue();
            if (z17) {
                this.f236371d = true;
            }
        }
        if (contentValues.containsKey("jumpScene")) {
            this.field_jumpScene = contentValues.getAsInteger("jumpScene").intValue();
            if (z17) {
                this.f236372e = true;
            }
        }
        if (contentValues.containsKey("jumpDest")) {
            this.field_jumpDest = contentValues.getAsInteger("jumpDest").intValue();
            if (z17) {
                this.f236373f = true;
            }
        }
        if (contentValues.containsKey("startTime")) {
            this.field_startTime = contentValues.getAsInteger("startTime").intValue();
            if (z17) {
                this.f236374g = true;
            }
        }
        if (contentValues.containsKey("endTime")) {
            this.field_endTime = contentValues.getAsInteger("endTime").intValue();
            if (z17) {
                this.f236375h = true;
            }
        }
        if (contentValues.containsKey("keyWord")) {
            this.field_keyWord = contentValues.getAsString("keyWord");
            if (z17) {
                this.f236376i = true;
            }
        }
        if (contentValues.containsKey("passByInfo")) {
            this.field_passByInfo = contentValues.getAsString("passByInfo");
            if (z17) {
                this.f236377m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
