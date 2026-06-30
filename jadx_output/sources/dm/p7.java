package dm;

/* loaded from: classes8.dex */
public class p7 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f239179n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f239180o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f239181p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239182q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239183r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239184s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f239185t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239186u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f239187v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f239188w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f239189x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f239190y;
    public java.lang.String field_available_otb;
    public int field_is_overdue;
    public int field_is_show_entry;
    public java.lang.String field_loan_jump_url;
    public int field_red_dot_index;
    public java.lang.String field_tips;
    public java.lang.String field_title;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239191d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239192e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239193f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239194g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239195h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239196i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239197m = true;

    static {
        p75.n0 n0Var = new p75.n0("LoanEntryInfo");
        f239179n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239180o = new java.lang.String[0];
        f239181p = 110371416;
        f239182q = 1303780429;
        f239183r = -1513215954;
        f239184s = -876896539;
        f239185t = 3560248;
        f239186u = 409014923;
        f239187v = 1873403047;
        f239188w = 108705909;
        f239189x = initAutoDBInfo(dm.p7.class);
        f239190y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        e0Var.f316955d.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT PRIMARY KEY ");
        e0Var.f316953b = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        e0Var.f316954c[1] = "loan_jump_url";
        e0Var.f316955d.put("loan_jump_url", "TEXT");
        e0Var.f316954c[2] = "red_dot_index";
        e0Var.f316955d.put("red_dot_index", "INTEGER");
        e0Var.f316954c[3] = "is_show_entry";
        e0Var.f316955d.put("is_show_entry", "INTEGER");
        e0Var.f316954c[4] = "tips";
        e0Var.f316955d.put("tips", "TEXT");
        e0Var.f316954c[5] = "is_overdue";
        e0Var.f316955d.put("is_overdue", "INTEGER");
        e0Var.f316954c[6] = "available_otb";
        e0Var.f316955d.put("available_otb", "TEXT");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " title TEXT PRIMARY KEY ,  loan_jump_url TEXT,  red_dot_index INTEGER,  is_show_entry INTEGER,  tips TEXT,  is_overdue INTEGER,  available_otb TEXT";
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
            if (f239181p == hashCode) {
                try {
                    this.field_title = cursor.getString(i17);
                    this.f239191d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLoanEntryInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239182q == hashCode) {
                try {
                    this.field_loan_jump_url = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLoanEntryInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239183r == hashCode) {
                try {
                    this.field_red_dot_index = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLoanEntryInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239184s == hashCode) {
                try {
                    this.field_is_show_entry = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLoanEntryInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239185t == hashCode) {
                try {
                    this.field_tips = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLoanEntryInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239186u == hashCode) {
                try {
                    this.field_is_overdue = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLoanEntryInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239187v == hashCode) {
                try {
                    this.field_available_otb = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseLoanEntryInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239188w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239191d) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f239192e) {
            contentValues.put("loan_jump_url", this.field_loan_jump_url);
        }
        if (this.f239193f) {
            contentValues.put("red_dot_index", java.lang.Integer.valueOf(this.field_red_dot_index));
        }
        if (this.f239194g) {
            contentValues.put("is_show_entry", java.lang.Integer.valueOf(this.field_is_show_entry));
        }
        if (this.f239195h) {
            contentValues.put("tips", this.field_tips);
        }
        if (this.f239196i) {
            contentValues.put("is_overdue", java.lang.Integer.valueOf(this.field_is_overdue));
        }
        if (this.f239197m) {
            contentValues.put("available_otb", this.field_available_otb);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseLoanEntryInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS LoanEntryInfo ( ");
        l75.e0 e0Var = f239189x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239180o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLoanEntryInfo", "createTableSql %s", str2);
            k0Var.A("LoanEntryInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "LoanEntryInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLoanEntryInfo", "updateTableSql %s", str3);
            k0Var.A("LoanEntryInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseLoanEntryInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239189x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239190y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_title;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239179n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239179n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z17) {
                this.f239191d = true;
            }
        }
        if (contentValues.containsKey("loan_jump_url")) {
            this.field_loan_jump_url = contentValues.getAsString("loan_jump_url");
            if (z17) {
                this.f239192e = true;
            }
        }
        if (contentValues.containsKey("red_dot_index")) {
            this.field_red_dot_index = contentValues.getAsInteger("red_dot_index").intValue();
            if (z17) {
                this.f239193f = true;
            }
        }
        if (contentValues.containsKey("is_show_entry")) {
            this.field_is_show_entry = contentValues.getAsInteger("is_show_entry").intValue();
            if (z17) {
                this.f239194g = true;
            }
        }
        if (contentValues.containsKey("tips")) {
            this.field_tips = contentValues.getAsString("tips");
            if (z17) {
                this.f239195h = true;
            }
        }
        if (contentValues.containsKey("is_overdue")) {
            this.field_is_overdue = contentValues.getAsInteger("is_overdue").intValue();
            if (z17) {
                this.f239196i = true;
            }
        }
        if (contentValues.containsKey("available_otb")) {
            this.field_available_otb = contentValues.getAsString("available_otb");
            if (z17) {
                this.f239197m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
