package dm;

/* loaded from: classes9.dex */
public class p8 extends l75.f0 {
    public static final int A;
    public static final l75.e0 B;
    public static final o75.e C;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f239198p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f239199q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239200r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239201s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f239202t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239203u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f239204v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f239205w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f239206x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f239207y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f239208z;
    public int field_addState;
    public java.lang.String field_encryptUsername;
    public java.lang.String field_nickname;
    public java.lang.String field_oldUsername;
    public java.lang.String field_pinyinName;
    public int field_seq;
    public int field_showHead;
    public java.lang.String field_ticket;
    public java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239209d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239210e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239211f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239212g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239213h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239214i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239215m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239216n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f239217o = true;

    static {
        p75.n0 n0Var = new p75.n0("OldAccountFriend");
        f239198p = n0Var;
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
        f239199q = new java.lang.String[0];
        f239200r = -1914377637;
        f239201s = 2095350813;
        f239202t = -873960692;
        f239203u = 70690926;
        f239204v = -1246914448;
        f239205w = -339192195;
        f239206x = 220606420;
        f239207y = -265713450;
        f239208z = 113759;
        A = 108705909;
        B = initAutoDBInfo(dm.p8.class);
        C = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "encryptUsername";
        e0Var.f316955d.put("encryptUsername", "TEXT");
        e0Var.f316954c[1] = "oldUsername";
        e0Var.f316955d.put("oldUsername", "TEXT");
        e0Var.f316954c[2] = "ticket";
        e0Var.f316955d.put("ticket", "TEXT");
        e0Var.f316954c[3] = "nickname";
        e0Var.f316955d.put("nickname", "TEXT");
        e0Var.f316954c[4] = "addState";
        e0Var.f316955d.put("addState", "INTEGER");
        e0Var.f316954c[5] = "showHead";
        e0Var.f316955d.put("showHead", "INTEGER");
        e0Var.f316954c[6] = "pinyinName";
        e0Var.f316955d.put("pinyinName", "TEXT");
        e0Var.f316954c[7] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[8] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ, "INTEGER");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " encryptUsername TEXT,  oldUsername TEXT,  ticket TEXT,  nickname TEXT,  addState INTEGER,  showHead INTEGER,  pinyinName TEXT,  username TEXT,  seq INTEGER";
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
            if (f239200r == hashCode) {
                try {
                    this.field_encryptUsername = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239201s == hashCode) {
                try {
                    this.field_oldUsername = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239202t == hashCode) {
                try {
                    this.field_ticket = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239203u == hashCode) {
                try {
                    this.field_nickname = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239204v == hashCode) {
                try {
                    this.field_addState = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239205w == hashCode) {
                try {
                    this.field_showHead = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239206x == hashCode) {
                try {
                    this.field_pinyinName = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239207y == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239208z == hashCode) {
                try {
                    this.field_seq = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseOldAccountFriend", th14, "convertFrom %s", columnNames[i17]);
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
        if (this.f239209d) {
            contentValues.put("encryptUsername", this.field_encryptUsername);
        }
        if (this.f239210e) {
            contentValues.put("oldUsername", this.field_oldUsername);
        }
        if (this.f239211f) {
            contentValues.put("ticket", this.field_ticket);
        }
        if (this.f239212g) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.f239213h) {
            contentValues.put("addState", java.lang.Integer.valueOf(this.field_addState));
        }
        if (this.f239214i) {
            contentValues.put("showHead", java.lang.Integer.valueOf(this.field_showHead));
        }
        if (this.f239215m) {
            contentValues.put("pinyinName", this.field_pinyinName);
        }
        if (this.f239216n) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f239217o) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ, java.lang.Integer.valueOf(this.field_seq));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseOldAccountFriend", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS OldAccountFriend ( ");
        l75.e0 e0Var = B;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239199q) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOldAccountFriend", "createTableSql %s", str2);
            k0Var.A("OldAccountFriend", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "OldAccountFriend", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOldAccountFriend", "updateTableSql %s", str3);
            k0Var.A("OldAccountFriend", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseOldAccountFriend", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239198p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239198p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("encryptUsername")) {
            this.field_encryptUsername = contentValues.getAsString("encryptUsername");
            if (z17) {
                this.f239209d = true;
            }
        }
        if (contentValues.containsKey("oldUsername")) {
            this.field_oldUsername = contentValues.getAsString("oldUsername");
            if (z17) {
                this.f239210e = true;
            }
        }
        if (contentValues.containsKey("ticket")) {
            this.field_ticket = contentValues.getAsString("ticket");
            if (z17) {
                this.f239211f = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z17) {
                this.f239212g = true;
            }
        }
        if (contentValues.containsKey("addState")) {
            this.field_addState = contentValues.getAsInteger("addState").intValue();
            if (z17) {
                this.f239213h = true;
            }
        }
        if (contentValues.containsKey("showHead")) {
            this.field_showHead = contentValues.getAsInteger("showHead").intValue();
            if (z17) {
                this.f239214i = true;
            }
        }
        if (contentValues.containsKey("pinyinName")) {
            this.field_pinyinName = contentValues.getAsString("pinyinName");
            if (z17) {
                this.f239215m = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f239216n = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ)) {
            this.field_seq = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ).intValue();
            if (z17) {
                this.f239217o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
