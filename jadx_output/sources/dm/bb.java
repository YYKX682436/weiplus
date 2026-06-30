package dm;

/* loaded from: classes4.dex */
public class bb extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f235928m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f235929n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f235930o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f235931p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f235932q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f235933r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f235934s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f235935t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f235936u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f235937v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f235938w;
    public int field_commentFlag;
    public int field_readCommentId;
    public int field_readCommentTime;
    public long field_storyId;
    public int field_syncCommentId;
    public int field_syncCommentTime;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235939d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235940e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235941f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235942g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235943h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235944i = true;

    static {
        p75.n0 n0Var = new p75.n0("StoryCommentSync");
        f235928m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235929n = new java.lang.String[0];
        f235930o = -1884251920;
        f235931p = 891095780;
        f235932q = 1490329471;
        f235933r = 1644888662;
        f235934s = 1982848049;
        f235935t = 2103122539;
        f235936u = 108705909;
        f235937v = initAutoDBInfo(dm.bb.class);
        f235938w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = "storyId";
        e0Var.f316955d.put("storyId", "LONG PRIMARY KEY ");
        e0Var.f316953b = "storyId";
        e0Var.f316954c[1] = "readCommentId";
        e0Var.f316955d.put("readCommentId", "INTEGER");
        e0Var.f316954c[2] = "syncCommentId";
        e0Var.f316955d.put("syncCommentId", "INTEGER");
        e0Var.f316954c[3] = "readCommentTime";
        e0Var.f316955d.put("readCommentTime", "INTEGER");
        e0Var.f316954c[4] = "syncCommentTime";
        e0Var.f316955d.put("syncCommentTime", "INTEGER");
        e0Var.f316954c[5] = "commentFlag";
        e0Var.f316955d.put("commentFlag", "INTEGER");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " storyId LONG PRIMARY KEY ,  readCommentId INTEGER,  syncCommentId INTEGER,  readCommentTime INTEGER,  syncCommentTime INTEGER,  commentFlag INTEGER";
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
            if (f235930o == hashCode) {
                try {
                    this.field_storyId = cursor.getLong(i17);
                    this.f235939d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryCommentSync", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235931p == hashCode) {
                try {
                    this.field_readCommentId = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryCommentSync", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235932q == hashCode) {
                try {
                    this.field_syncCommentId = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryCommentSync", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235933r == hashCode) {
                try {
                    this.field_readCommentTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryCommentSync", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235934s == hashCode) {
                try {
                    this.field_syncCommentTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryCommentSync", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235935t == hashCode) {
                try {
                    this.field_commentFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseStoryCommentSync", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235936u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235939d) {
            contentValues.put("storyId", java.lang.Long.valueOf(this.field_storyId));
        }
        if (this.f235940e) {
            contentValues.put("readCommentId", java.lang.Integer.valueOf(this.field_readCommentId));
        }
        if (this.f235941f) {
            contentValues.put("syncCommentId", java.lang.Integer.valueOf(this.field_syncCommentId));
        }
        if (this.f235942g) {
            contentValues.put("readCommentTime", java.lang.Integer.valueOf(this.field_readCommentTime));
        }
        if (this.f235943h) {
            contentValues.put("syncCommentTime", java.lang.Integer.valueOf(this.field_syncCommentTime));
        }
        if (this.f235944i) {
            contentValues.put("commentFlag", java.lang.Integer.valueOf(this.field_commentFlag));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseStoryCommentSync", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS StoryCommentSync ( ");
        l75.e0 e0Var = f235937v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235929n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStoryCommentSync", "createTableSql %s", str2);
            k0Var.A("StoryCommentSync", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "StoryCommentSync", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStoryCommentSync", "updateTableSql %s", str3);
            k0Var.A("StoryCommentSync", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseStoryCommentSync", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235937v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235938w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_storyId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235928m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235928m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("storyId")) {
            this.field_storyId = contentValues.getAsLong("storyId").longValue();
            if (z17) {
                this.f235939d = true;
            }
        }
        if (contentValues.containsKey("readCommentId")) {
            this.field_readCommentId = contentValues.getAsInteger("readCommentId").intValue();
            if (z17) {
                this.f235940e = true;
            }
        }
        if (contentValues.containsKey("syncCommentId")) {
            this.field_syncCommentId = contentValues.getAsInteger("syncCommentId").intValue();
            if (z17) {
                this.f235941f = true;
            }
        }
        if (contentValues.containsKey("readCommentTime")) {
            this.field_readCommentTime = contentValues.getAsInteger("readCommentTime").intValue();
            if (z17) {
                this.f235942g = true;
            }
        }
        if (contentValues.containsKey("syncCommentTime")) {
            this.field_syncCommentTime = contentValues.getAsInteger("syncCommentTime").intValue();
            if (z17) {
                this.f235943h = true;
            }
        }
        if (contentValues.containsKey("commentFlag")) {
            this.field_commentFlag = contentValues.getAsInteger("commentFlag").intValue();
            if (z17) {
                this.f235944i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
