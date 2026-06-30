package dm;

/* loaded from: classes8.dex */
public class ac extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f235736p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f235737q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f235738r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f235739s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f235740t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f235741u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f235742v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f235743w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f235744x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f235745y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f235746z;
    public java.lang.String field_bulletin_content;
    public java.lang.String field_bulletin_scene;
    public java.lang.String field_bulletin_url;
    public int field_is_show_notice;
    public java.lang.String field_jump_url;
    public java.lang.String field_left_icon;
    public java.lang.String field_notice_id;
    public int field_type;
    public java.lang.String field_wording;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235747d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235748e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235749f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235750g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235751h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235752i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235753m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f235754n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f235755o = true;

    static {
        p75.n0 n0Var = new p75.n0("WalletBulletin");
        f235736p = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235737q = new java.lang.String[0];
        f235738r = 387619828;
        f235739s = -2122613279;
        f235740t = 1207108311;
        f235741u = -1155412283;
        f235742v = 1524956312;
        f235743w = 1741636017;
        f235744x = -254991906;
        f235745y = 1898728418;
        f235746z = 3575610;
        A = 108705909;
        B = initAutoDBInfo(dm.ac.class);
        C = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "bulletin_scene";
        e0Var.f316955d.put("bulletin_scene", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "bulletin_scene";
        e0Var.f316954c[1] = "bulletin_content";
        e0Var.f316955d.put("bulletin_content", "TEXT");
        e0Var.f316954c[2] = "bulletin_url";
        e0Var.f316955d.put("bulletin_url", "TEXT");
        e0Var.f316954c[3] = "is_show_notice";
        e0Var.f316955d.put("is_show_notice", "INTEGER");
        e0Var.f316954c[4] = "wording";
        e0Var.f316955d.put("wording", "TEXT");
        e0Var.f316954c[5] = "left_icon";
        e0Var.f316955d.put("left_icon", "TEXT");
        e0Var.f316954c[6] = "jump_url";
        e0Var.f316955d.put("jump_url", "TEXT");
        e0Var.f316954c[7] = "notice_id";
        e0Var.f316955d.put("notice_id", "TEXT");
        e0Var.f316954c[8] = "type";
        e0Var.f316955d.put("type", "INTEGER default '1' ");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " bulletin_scene TEXT PRIMARY KEY ,  bulletin_content TEXT,  bulletin_url TEXT,  is_show_notice INTEGER,  wording TEXT,  left_icon TEXT,  jump_url TEXT,  notice_id TEXT,  type INTEGER default '1' ";
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
            if (f235738r == hashCode) {
                try {
                    this.field_bulletin_scene = cursor.getString(i17);
                    this.f235747d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235739s == hashCode) {
                try {
                    this.field_bulletin_content = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235740t == hashCode) {
                try {
                    this.field_bulletin_url = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235741u == hashCode) {
                try {
                    this.field_is_show_notice = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235742v == hashCode) {
                try {
                    this.field_wording = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235743w == hashCode) {
                try {
                    this.field_left_icon = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235744x == hashCode) {
                try {
                    this.field_jump_url = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235745y == hashCode) {
                try {
                    this.field_notice_id = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235746z == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWalletBulletin", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235747d) {
            contentValues.put("bulletin_scene", this.field_bulletin_scene);
        }
        if (this.f235748e) {
            contentValues.put("bulletin_content", this.field_bulletin_content);
        }
        if (this.f235749f) {
            contentValues.put("bulletin_url", this.field_bulletin_url);
        }
        if (this.f235750g) {
            contentValues.put("is_show_notice", java.lang.Integer.valueOf(this.field_is_show_notice));
        }
        if (this.f235751h) {
            contentValues.put("wording", this.field_wording);
        }
        if (this.f235752i) {
            contentValues.put("left_icon", this.field_left_icon);
        }
        if (this.f235753m) {
            contentValues.put("jump_url", this.field_jump_url);
        }
        if (this.f235754n) {
            contentValues.put("notice_id", this.field_notice_id);
        }
        if (this.f235755o) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWalletBulletin", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WalletBulletin ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235737q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletBulletin", "createTableSql %s", str2);
            k0Var.A("WalletBulletin", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WalletBulletin", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletBulletin", "updateTableSql %s", str3);
            k0Var.A("WalletBulletin", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWalletBulletin", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return B;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return C;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_bulletin_scene;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235736p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235736p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("bulletin_scene")) {
            this.field_bulletin_scene = contentValues.getAsString("bulletin_scene");
            if (z17) {
                this.f235747d = true;
            }
        }
        if (contentValues.containsKey("bulletin_content")) {
            this.field_bulletin_content = contentValues.getAsString("bulletin_content");
            if (z17) {
                this.f235748e = true;
            }
        }
        if (contentValues.containsKey("bulletin_url")) {
            this.field_bulletin_url = contentValues.getAsString("bulletin_url");
            if (z17) {
                this.f235749f = true;
            }
        }
        if (contentValues.containsKey("is_show_notice")) {
            this.field_is_show_notice = contentValues.getAsInteger("is_show_notice").intValue();
            if (z17) {
                this.f235750g = true;
            }
        }
        if (contentValues.containsKey("wording")) {
            this.field_wording = contentValues.getAsString("wording");
            if (z17) {
                this.f235751h = true;
            }
        }
        if (contentValues.containsKey("left_icon")) {
            this.field_left_icon = contentValues.getAsString("left_icon");
            if (z17) {
                this.f235752i = true;
            }
        }
        if (contentValues.containsKey("jump_url")) {
            this.field_jump_url = contentValues.getAsString("jump_url");
            if (z17) {
                this.f235753m = true;
            }
        }
        if (contentValues.containsKey("notice_id")) {
            this.field_notice_id = contentValues.getAsString("notice_id");
            if (z17) {
                this.f235754n = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f235755o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
