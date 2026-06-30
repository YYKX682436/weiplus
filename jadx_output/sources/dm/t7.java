package dm;

/* loaded from: classes8.dex */
public class t7 extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f240129o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f240130p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f240131q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f240132r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f240133s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f240134t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f240135u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f240136v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f240137w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f240138x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f240139y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f240140z;
    public int field_height;
    public java.lang.String field_media_fuzzy_thumbnail_md5;
    public java.lang.String field_media_fuzzy_thumbnail_url;
    public java.lang.String field_media_md5;
    public int field_media_type;
    public java.lang.String field_media_url;
    public java.lang.String field_packet_id;
    public int field_width;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240141d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240142e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240143f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240144g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240145h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240146i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240147m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f240148n = true;

    static {
        p75.n0 n0Var = new p75.n0("LocalStoryDetail");
        f240129o = n0Var;
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
        f240130p = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS LocalStoryDetailPacketIdIndex ON LocalStoryDetail(packet_id)"};
        f240131q = 1939875509;
        f240132r = 2140787348;
        f240133s = 2140779171;
        f240134t = -1221029593;
        f240135u = 113126854;
        f240136v = 1806137394;
        f240137w = 138801484;
        f240138x = 138793307;
        f240139y = 108705909;
        f240140z = initAutoDBInfo(dm.t7.class);
        A = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f316954c = strArr;
        strArr[0] = "media_type";
        e0Var.f316955d.put("media_type", "INTEGER");
        e0Var.f316954c[1] = "media_url";
        e0Var.f316955d.put("media_url", "TEXT");
        e0Var.f316954c[2] = "media_md5";
        e0Var.f316955d.put("media_md5", "TEXT");
        e0Var.f316954c[3] = "height";
        e0Var.f316955d.put("height", "INTEGER");
        e0Var.f316954c[4] = "width";
        e0Var.f316955d.put("width", "INTEGER");
        e0Var.f316954c[5] = "packet_id";
        e0Var.f316955d.put("packet_id", "TEXT");
        e0Var.f316954c[6] = "media_fuzzy_thumbnail_url";
        e0Var.f316955d.put("media_fuzzy_thumbnail_url", "TEXT");
        e0Var.f316954c[7] = "media_fuzzy_thumbnail_md5";
        e0Var.f316955d.put("media_fuzzy_thumbnail_md5", "TEXT");
        e0Var.f316954c[8] = "rowid";
        e0Var.f316956e = " media_type INTEGER,  media_url TEXT,  media_md5 TEXT,  height INTEGER,  width INTEGER,  packet_id TEXT,  media_fuzzy_thumbnail_url TEXT,  media_fuzzy_thumbnail_md5 TEXT";
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
            if (f240131q == hashCode) {
                try {
                    this.field_media_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalStoryDetail", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240132r == hashCode) {
                try {
                    this.field_media_url = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalStoryDetail", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240133s == hashCode) {
                try {
                    this.field_media_md5 = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalStoryDetail", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240134t == hashCode) {
                try {
                    this.field_height = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalStoryDetail", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240135u == hashCode) {
                try {
                    this.field_width = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalStoryDetail", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240136v == hashCode) {
                try {
                    this.field_packet_id = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalStoryDetail", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240137w == hashCode) {
                try {
                    this.field_media_fuzzy_thumbnail_url = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalStoryDetail", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240138x == hashCode) {
                try {
                    this.field_media_fuzzy_thumbnail_md5 = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLocalStoryDetail", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240139y == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240141d) {
            contentValues.put("media_type", java.lang.Integer.valueOf(this.field_media_type));
        }
        if (this.f240142e) {
            contentValues.put("media_url", this.field_media_url);
        }
        if (this.f240143f) {
            contentValues.put("media_md5", this.field_media_md5);
        }
        if (this.f240144g) {
            contentValues.put("height", java.lang.Integer.valueOf(this.field_height));
        }
        if (this.f240145h) {
            contentValues.put("width", java.lang.Integer.valueOf(this.field_width));
        }
        if (this.f240146i) {
            contentValues.put("packet_id", this.field_packet_id);
        }
        if (this.f240147m) {
            contentValues.put("media_fuzzy_thumbnail_url", this.field_media_fuzzy_thumbnail_url);
        }
        if (this.f240148n) {
            contentValues.put("media_fuzzy_thumbnail_md5", this.field_media_fuzzy_thumbnail_md5);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLocalStoryDetail", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LocalStoryDetail ( ");
        l75.e0 e0Var = f240140z;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240130p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLocalStoryDetail", "createTableSql %s", str2);
            k0Var.A("LocalStoryDetail", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "LocalStoryDetail", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLocalStoryDetail", "updateTableSql %s", str3);
            k0Var.A("LocalStoryDetail", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLocalStoryDetail", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240140z;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return A;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240129o;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240129o.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("media_type")) {
            this.field_media_type = contentValues.getAsInteger("media_type").intValue();
            if (z17) {
                this.f240141d = true;
            }
        }
        if (contentValues.containsKey("media_url")) {
            this.field_media_url = contentValues.getAsString("media_url");
            if (z17) {
                this.f240142e = true;
            }
        }
        if (contentValues.containsKey("media_md5")) {
            this.field_media_md5 = contentValues.getAsString("media_md5");
            if (z17) {
                this.f240143f = true;
            }
        }
        if (contentValues.containsKey("height")) {
            this.field_height = contentValues.getAsInteger("height").intValue();
            if (z17) {
                this.f240144g = true;
            }
        }
        if (contentValues.containsKey("width")) {
            this.field_width = contentValues.getAsInteger("width").intValue();
            if (z17) {
                this.f240145h = true;
            }
        }
        if (contentValues.containsKey("packet_id")) {
            this.field_packet_id = contentValues.getAsString("packet_id");
            if (z17) {
                this.f240146i = true;
            }
        }
        if (contentValues.containsKey("media_fuzzy_thumbnail_url")) {
            this.field_media_fuzzy_thumbnail_url = contentValues.getAsString("media_fuzzy_thumbnail_url");
            if (z17) {
                this.f240147m = true;
            }
        }
        if (contentValues.containsKey("media_fuzzy_thumbnail_md5")) {
            this.field_media_fuzzy_thumbnail_md5 = contentValues.getAsString("media_fuzzy_thumbnail_md5");
            if (z17) {
                this.f240148n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
