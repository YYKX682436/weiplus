package dm;

/* loaded from: classes7.dex */
public class u2 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f240254i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f240255m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f240256n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f240257o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f240258p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f240259q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f240260r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f240261s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f240262t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f240263u;
    public java.lang.String field_desc;
    public java.lang.String field_iconUrl;
    public java.lang.String field_key;
    public java.lang.String field_panelUrl;
    public java.lang.String field_title;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240264d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240265e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240266f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240267g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240268h = true;

    static {
        p75.n0 n0Var = new p75.n0("EmojiIPSetInfo");
        f240254i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240255m = new java.lang.String[0];
        f240256n = 106079;
        f240257o = 110371416;
        f240258p = 3079825;
        f240259q = 1638765110;
        f240260r = 1060558027;
        f240261s = 108705909;
        f240262t = initAutoDBInfo(dm.u2.class);
        f240263u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = "key";
        e0Var.f316955d.put("key", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "key";
        e0Var.f316954c[1] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        e0Var.f316955d.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT");
        e0Var.f316954c[2] = "desc";
        e0Var.f316955d.put("desc", "TEXT");
        e0Var.f316954c[3] = "iconUrl";
        e0Var.f316955d.put("iconUrl", "TEXT");
        e0Var.f316954c[4] = "panelUrl";
        e0Var.f316955d.put("panelUrl", "TEXT");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " key TEXT PRIMARY KEY ,  title TEXT,  desc TEXT,  iconUrl TEXT,  panelUrl TEXT";
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
            if (f240256n == hashCode) {
                try {
                    this.field_key = cursor.getString(i17);
                    this.f240264d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiIPSetInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240257o == hashCode) {
                try {
                    this.field_title = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiIPSetInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240258p == hashCode) {
                try {
                    this.field_desc = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiIPSetInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240259q == hashCode) {
                try {
                    this.field_iconUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiIPSetInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240260r == hashCode) {
                try {
                    this.field_panelUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiIPSetInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240261s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240264d) {
            contentValues.put("key", this.field_key);
        }
        if (this.f240265e) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f240266f) {
            contentValues.put("desc", this.field_desc);
        }
        if (this.f240267g) {
            contentValues.put("iconUrl", this.field_iconUrl);
        }
        if (this.f240268h) {
            contentValues.put("panelUrl", this.field_panelUrl);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseEmojiIPSetInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EmojiIPSetInfo ( ");
        l75.e0 e0Var = f240262t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240255m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmojiIPSetInfo", "createTableSql %s", str2);
            k0Var.A("EmojiIPSetInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "EmojiIPSetInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmojiIPSetInfo", "updateTableSql %s", str3);
            k0Var.A("EmojiIPSetInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmojiIPSetInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240262t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240263u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_key;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240254i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240254i.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z17) {
                this.f240264d = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z17) {
                this.f240265e = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.field_desc = contentValues.getAsString("desc");
            if (z17) {
                this.f240266f = true;
            }
        }
        if (contentValues.containsKey("iconUrl")) {
            this.field_iconUrl = contentValues.getAsString("iconUrl");
            if (z17) {
                this.f240267g = true;
            }
        }
        if (contentValues.containsKey("panelUrl")) {
            this.field_panelUrl = contentValues.getAsString("panelUrl");
            if (z17) {
                this.f240268h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
