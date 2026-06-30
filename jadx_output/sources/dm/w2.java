package dm;

/* loaded from: classes8.dex */
public class w2 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f240738n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f240739o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f240740p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f240741q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f240742r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f240743s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f240744t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f240745u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f240746v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f240747w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f240748x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f240749y;
    public int field_click_flag;
    public java.lang.String field_desc;
    public int field_download_flag;
    public java.lang.String field_groupId;
    public java.lang.String field_lang;
    public java.lang.String field_md5;
    public java.lang.String field_md5_lang;

    /* renamed from: d, reason: collision with root package name */
    public boolean f240750d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240751e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f240752f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f240753g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f240754h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f240755i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f240756m = true;

    static {
        p75.n0 n0Var = new p75.n0("EmojiInfoDesc");
        f240738n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f240739o = new java.lang.String[0];
        f240740p = 1152214031;
        f240741q = 107902;
        f240742r = 3314158;
        f240743s = 3079825;
        f240744t = 293428218;
        f240745u = -777312317;
        f240746v = 31458499;
        f240747w = 108705909;
        f240748x = initAutoDBInfo(dm.w2.class);
        f240749y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "md5_lang";
        e0Var.f316955d.put("md5_lang", "TEXT PRIMARY KEY  COLLATE NOCASE ");
        e0Var.f316953b = "md5_lang";
        e0Var.f316954c[1] = "md5";
        e0Var.f316955d.put("md5", "TEXT COLLATE NOCASE ");
        e0Var.f316954c[2] = "lang";
        e0Var.f316955d.put("lang", "TEXT COLLATE NOCASE ");
        e0Var.f316954c[3] = "desc";
        e0Var.f316955d.put("desc", "TEXT");
        e0Var.f316954c[4] = "groupId";
        e0Var.f316955d.put("groupId", "TEXT default '' ");
        e0Var.f316954c[5] = "click_flag";
        e0Var.f316955d.put("click_flag", "INTEGER");
        e0Var.f316954c[6] = "download_flag";
        e0Var.f316955d.put("download_flag", "INTEGER");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " md5_lang TEXT PRIMARY KEY  COLLATE NOCASE ,  md5 TEXT COLLATE NOCASE ,  lang TEXT COLLATE NOCASE ,  desc TEXT,  groupId TEXT default '' ,  click_flag INTEGER,  download_flag INTEGER";
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
            if (f240740p == hashCode) {
                try {
                    this.field_md5_lang = cursor.getString(i17);
                    this.f240750d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfoDesc", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240741q == hashCode) {
                try {
                    this.field_md5 = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfoDesc", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240742r == hashCode) {
                try {
                    this.field_lang = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfoDesc", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240743s == hashCode) {
                try {
                    this.field_desc = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfoDesc", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240744t == hashCode) {
                try {
                    this.field_groupId = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfoDesc", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240745u == hashCode) {
                try {
                    this.field_click_flag = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfoDesc", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240746v == hashCode) {
                try {
                    this.field_download_flag = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEmojiInfoDesc", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f240747w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f240750d) {
            contentValues.put("md5_lang", this.field_md5_lang);
        }
        if (this.f240751e) {
            contentValues.put("md5", this.field_md5);
        }
        if (this.f240752f) {
            contentValues.put("lang", this.field_lang);
        }
        if (this.f240753g) {
            contentValues.put("desc", this.field_desc);
        }
        if (this.field_groupId == null) {
            this.field_groupId = "";
        }
        if (this.f240754h) {
            contentValues.put("groupId", this.field_groupId);
        }
        if (this.f240755i) {
            contentValues.put("click_flag", java.lang.Integer.valueOf(this.field_click_flag));
        }
        if (this.f240756m) {
            contentValues.put("download_flag", java.lang.Integer.valueOf(this.field_download_flag));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseEmojiInfoDesc", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EmojiInfoDesc ( ");
        l75.e0 e0Var = f240748x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f240739o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmojiInfoDesc", "createTableSql %s", str2);
            k0Var.A("EmojiInfoDesc", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "EmojiInfoDesc", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmojiInfoDesc", "updateTableSql %s", str3);
            k0Var.A("EmojiInfoDesc", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEmojiInfoDesc", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f240748x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f240749y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_md5_lang;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f240738n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f240738n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("md5_lang")) {
            this.field_md5_lang = contentValues.getAsString("md5_lang");
            if (z17) {
                this.f240750d = true;
            }
        }
        if (contentValues.containsKey("md5")) {
            this.field_md5 = contentValues.getAsString("md5");
            if (z17) {
                this.f240751e = true;
            }
        }
        if (contentValues.containsKey("lang")) {
            this.field_lang = contentValues.getAsString("lang");
            if (z17) {
                this.f240752f = true;
            }
        }
        if (contentValues.containsKey("desc")) {
            this.field_desc = contentValues.getAsString("desc");
            if (z17) {
                this.f240753g = true;
            }
        }
        if (contentValues.containsKey("groupId")) {
            this.field_groupId = contentValues.getAsString("groupId");
            if (z17) {
                this.f240754h = true;
            }
        }
        if (contentValues.containsKey("click_flag")) {
            this.field_click_flag = contentValues.getAsInteger("click_flag").intValue();
            if (z17) {
                this.f240755i = true;
            }
        }
        if (contentValues.containsKey("download_flag")) {
            this.field_download_flag = contentValues.getAsInteger("download_flag").intValue();
            if (z17) {
                this.f240756m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
