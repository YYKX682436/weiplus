package dm;

/* loaded from: classes4.dex */
public class y8 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f241220i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f241221m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f241222n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f241223o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f241224p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f241225q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f241226r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f241227s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f241228t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f241229u;
    public java.lang.String field_appId;
    public long field_updateTime;
    public java.lang.String field_voipExtraData;
    public java.lang.String field_voipRecordPath;
    public java.lang.String field_voipRoomId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241230d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241231e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241232f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241233g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241234h = true;

    static {
        p75.n0 n0Var = new p75.n0("OpenVoiceServiceVoipRecord");
        f241220i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241221m = new java.lang.String[0];
        f241222n = 903431446;
        f241223o = 93028124;
        f241224p = 1972591062;
        f241225q = -295931082;
        f241226r = -1599335910;
        f241227s = 108705909;
        f241228t = initAutoDBInfo(dm.y8.class);
        f241229u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "voipRoomId";
        e0Var.f316955d.put("voipRoomId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "voipRoomId";
        e0Var.f316954c[1] = "appId";
        e0Var.f316955d.put("appId", "TEXT");
        e0Var.f316954c[2] = "voipRecordPath";
        e0Var.f316955d.put("voipRecordPath", "TEXT");
        e0Var.f316954c[3] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[4] = "voipExtraData";
        e0Var.f316955d.put("voipExtraData", "TEXT");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " voipRoomId TEXT PRIMARY KEY ,  appId TEXT,  voipRecordPath TEXT,  updateTime LONG,  voipExtraData TEXT";
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
            if (f241222n == hashCode) {
                try {
                    this.field_voipRoomId = cursor.getString(i17);
                    this.f241230d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241223o == hashCode) {
                try {
                    this.field_appId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241224p == hashCode) {
                try {
                    this.field_voipRecordPath = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241225q == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241226r == hashCode) {
                try {
                    this.field_voipExtraData = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241227s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241230d) {
            contentValues.put("voipRoomId", this.field_voipRoomId);
        }
        if (this.f241231e) {
            contentValues.put("appId", this.field_appId);
        }
        if (this.f241232f) {
            contentValues.put("voipRecordPath", this.field_voipRecordPath);
        }
        if (this.f241233g) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
        }
        if (this.f241234h) {
            contentValues.put("voipExtraData", this.field_voipExtraData);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OpenVoiceServiceVoipRecord ( ");
        l75.e0 e0Var = f241228t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241221m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", "createTableSql %s", str2);
            k0Var.A("OpenVoiceServiceVoipRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "OpenVoiceServiceVoipRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", "updateTableSql %s", str3);
            k0Var.A("OpenVoiceServiceVoipRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOpenVoiceServiceVoipRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241228t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241229u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_voipRoomId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241220i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241220i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("voipRoomId")) {
            this.field_voipRoomId = contentValues.getAsString("voipRoomId");
            if (z17) {
                this.f241230d = true;
            }
        }
        if (contentValues.containsKey("appId")) {
            this.field_appId = contentValues.getAsString("appId");
            if (z17) {
                this.f241231e = true;
            }
        }
        if (contentValues.containsKey("voipRecordPath")) {
            this.field_voipRecordPath = contentValues.getAsString("voipRecordPath");
            if (z17) {
                this.f241232f = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f241233g = true;
            }
        }
        if (contentValues.containsKey("voipExtraData")) {
            this.field_voipExtraData = contentValues.getAsString("voipExtraData");
            if (z17) {
                this.f241234h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
