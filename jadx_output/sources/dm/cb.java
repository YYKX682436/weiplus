package dm;

/* loaded from: classes4.dex */
public class cb extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f236210m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f236211n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f236212o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f236213p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236214q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f236215r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f236216s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236217t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236218u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f236219v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f236220w;
    public int field_available;
    public byte[] field_baseItemData;
    public int field_mixFlag;
    public int field_mixRetryTime;
    public int field_storyLocalId;
    public long field_timeStamp;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236221d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236222e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236223f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236224g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236225h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236226i = true;

    static {
        p75.n0 n0Var = new p75.n0("StoryEditorInfo");
        f236210m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236211n = new java.lang.String[0];
        f236212o = -492230834;
        f236213p = 25573622;
        f236214q = 1871858481;
        f236215r = 1072729064;
        f236216s = 374093465;
        f236217t = -733902135;
        f236218u = 108705909;
        f236219v = initAutoDBInfo(dm.cb.class);
        f236220w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = "baseItemData";
        e0Var.f316955d.put("baseItemData", "BLOB");
        e0Var.f316954c[1] = "timeStamp";
        e0Var.f316955d.put("timeStamp", "LONG");
        e0Var.f316954c[2] = "storyLocalId";
        e0Var.f316955d.put("storyLocalId", "INTEGER");
        e0Var.f316954c[3] = "mixFlag";
        e0Var.f316955d.put("mixFlag", "INTEGER");
        e0Var.f316954c[4] = "mixRetryTime";
        e0Var.f316955d.put("mixRetryTime", "INTEGER");
        e0Var.f316954c[5] = "available";
        e0Var.f316955d.put("available", "INTEGER");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " baseItemData BLOB,  timeStamp LONG,  storyLocalId INTEGER,  mixFlag INTEGER,  mixRetryTime INTEGER,  available INTEGER";
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
            if (f236212o == hashCode) {
                try {
                    this.field_baseItemData = cursor.getBlob(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryEditorInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236213p == hashCode) {
                try {
                    this.field_timeStamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryEditorInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236214q == hashCode) {
                try {
                    this.field_storyLocalId = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryEditorInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236215r == hashCode) {
                try {
                    this.field_mixFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryEditorInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236216s == hashCode) {
                try {
                    this.field_mixRetryTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryEditorInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236217t == hashCode) {
                try {
                    this.field_available = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryEditorInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236218u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236221d) {
            contentValues.put("baseItemData", this.field_baseItemData);
        }
        if (this.f236222e) {
            contentValues.put("timeStamp", java.lang.Long.valueOf(this.field_timeStamp));
        }
        if (this.f236223f) {
            contentValues.put("storyLocalId", java.lang.Integer.valueOf(this.field_storyLocalId));
        }
        if (this.f236224g) {
            contentValues.put("mixFlag", java.lang.Integer.valueOf(this.field_mixFlag));
        }
        if (this.f236225h) {
            contentValues.put("mixRetryTime", java.lang.Integer.valueOf(this.field_mixRetryTime));
        }
        if (this.f236226i) {
            contentValues.put("available", java.lang.Integer.valueOf(this.field_available));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseStoryEditorInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS StoryEditorInfo ( ");
        l75.e0 e0Var = f236219v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236211n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStoryEditorInfo", "createTableSql %s", str2);
            k0Var.A("StoryEditorInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "StoryEditorInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStoryEditorInfo", "updateTableSql %s", str3);
            k0Var.A("StoryEditorInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStoryEditorInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236219v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236220w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236210m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236210m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("baseItemData")) {
            this.field_baseItemData = contentValues.getAsByteArray("baseItemData");
            if (z17) {
                this.f236221d = true;
            }
        }
        if (contentValues.containsKey("timeStamp")) {
            this.field_timeStamp = contentValues.getAsLong("timeStamp").longValue();
            if (z17) {
                this.f236222e = true;
            }
        }
        if (contentValues.containsKey("storyLocalId")) {
            this.field_storyLocalId = contentValues.getAsInteger("storyLocalId").intValue();
            if (z17) {
                this.f236223f = true;
            }
        }
        if (contentValues.containsKey("mixFlag")) {
            this.field_mixFlag = contentValues.getAsInteger("mixFlag").intValue();
            if (z17) {
                this.f236224g = true;
            }
        }
        if (contentValues.containsKey("mixRetryTime")) {
            this.field_mixRetryTime = contentValues.getAsInteger("mixRetryTime").intValue();
            if (z17) {
                this.f236225h = true;
            }
        }
        if (contentValues.containsKey("available")) {
            this.field_available = contentValues.getAsInteger("available").intValue();
            if (z17) {
                this.f236226i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
