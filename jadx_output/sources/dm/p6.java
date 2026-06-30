package dm;

/* loaded from: classes4.dex */
public class p6 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f239160n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f239161o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f239162p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239163q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239164r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239165s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f239166t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239167u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f239168v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f239169w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f239170x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f239171y;
    public java.lang.String field_content;
    public java.lang.String field_descUrl;
    public short field_isRead;
    public int field_msgType;
    public long field_pushTime;
    public long field_svrId;
    public java.lang.String field_title;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239172d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239173e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239174f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239175g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239176h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239177i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239178m = true;

    static {
        p75.n0 n0Var = new p75.n0("IPCallMsg");
        f239160n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239161o = new java.lang.String[0];
        f239162p = 109832170;
        f239163q = -1180158496;
        f239164r = 110371416;
        f239165s = 951530617;
        f239166t = 1775982855;
        f239167u = 1343750747;
        f239168v = 1556838686;
        f239169w = 108705909;
        f239170x = initAutoDBInfo(dm.p6.class);
        f239171y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "svrId";
        e0Var.f316955d.put("svrId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "svrId";
        e0Var.f316954c[1] = "isRead";
        e0Var.f316955d.put("isRead", "SHORT default '0' ");
        e0Var.f316954c[2] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        e0Var.f316955d.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        e0Var.f316954c[3] = "content";
        e0Var.f316955d.put("content", "TEXT");
        e0Var.f316954c[4] = "pushTime";
        e0Var.f316955d.put("pushTime", "LONG");
        e0Var.f316954c[5] = "msgType";
        e0Var.f316955d.put("msgType", "INTEGER");
        e0Var.f316954c[6] = "descUrl";
        e0Var.f316955d.put("descUrl", "TEXT");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " svrId LONG PRIMARY KEY ,  isRead SHORT default '0' ,  title TEXT,  content TEXT,  pushTime LONG,  msgType INTEGER,  descUrl TEXT";
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
            if (f239162p == hashCode) {
                try {
                    this.field_svrId = cursor.getLong(i17);
                    this.f239172d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallMsg", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239163q == hashCode) {
                try {
                    this.field_isRead = cursor.getShort(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallMsg", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239164r == hashCode) {
                try {
                    this.field_title = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallMsg", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239165s == hashCode) {
                try {
                    this.field_content = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallMsg", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239166t == hashCode) {
                try {
                    this.field_pushTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallMsg", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239167u == hashCode) {
                try {
                    this.field_msgType = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallMsg", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239168v == hashCode) {
                try {
                    this.field_descUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseIPCallMsg", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239169w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239172d) {
            contentValues.put("svrId", java.lang.Long.valueOf(this.field_svrId));
        }
        if (this.f239173e) {
            contentValues.put("isRead", java.lang.Short.valueOf(this.field_isRead));
        }
        if (this.f239174f) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f239175g) {
            contentValues.put("content", this.field_content);
        }
        if (this.f239176h) {
            contentValues.put("pushTime", java.lang.Long.valueOf(this.field_pushTime));
        }
        if (this.f239177i) {
            contentValues.put("msgType", java.lang.Integer.valueOf(this.field_msgType));
        }
        if (this.f239178m) {
            contentValues.put("descUrl", this.field_descUrl);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseIPCallMsg", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS IPCallMsg ( ");
        l75.e0 e0Var = f239170x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239161o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseIPCallMsg", "createTableSql %s", str2);
            k0Var.A("IPCallMsg", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "IPCallMsg", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseIPCallMsg", "updateTableSql %s", str3);
            k0Var.A("IPCallMsg", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseIPCallMsg", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239170x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239171y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_svrId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239160n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239160n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("svrId")) {
            this.field_svrId = contentValues.getAsLong("svrId").longValue();
            if (z17) {
                this.f239172d = true;
            }
        }
        if (contentValues.containsKey("isRead")) {
            this.field_isRead = contentValues.getAsShort("isRead").shortValue();
            if (z17) {
                this.f239173e = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z17) {
                this.f239174f = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z17) {
                this.f239175g = true;
            }
        }
        if (contentValues.containsKey("pushTime")) {
            this.field_pushTime = contentValues.getAsLong("pushTime").longValue();
            if (z17) {
                this.f239176h = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.field_msgType = contentValues.getAsInteger("msgType").intValue();
            if (z17) {
                this.f239177i = true;
            }
        }
        if (contentValues.containsKey("descUrl")) {
            this.field_descUrl = contentValues.getAsString("descUrl");
            if (z17) {
                this.f239178m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
