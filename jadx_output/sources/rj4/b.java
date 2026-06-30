package rj4;

/* loaded from: classes11.dex */
public class b extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f396224J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final l75.e0 N;
    public static final o75.e P;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.n0 f396225v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String[] f396226w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f396227x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f396228y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f396229z;
    public java.lang.String field_CommentContent;
    public int field_CommentCount;
    public java.lang.String field_CommentId;
    public int field_CreateTime;
    public int field_DeleteInMsgList;
    public java.lang.String field_Description;
    public java.lang.String field_FromUserName;
    public int field_HasBeenDeleted;
    public long field_Option;
    public int field_Read;
    public java.lang.String field_RootCommentId;
    public java.lang.String field_TextStatusId;
    public java.lang.String field_TextStatusOwnerUserName;
    public byte[] field_TopicInfo;
    public java.lang.String field_thumbUrl;

    /* renamed from: d, reason: collision with root package name */
    public boolean f396230d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f396231e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f396232f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f396233g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f396234h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f396235i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f396236m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f396237n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f396238o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f396239p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f396240q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f396241r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f396242s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f396243t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f396244u = true;

    static {
        p75.n0 n0Var = new p75.n0("TextStatusComment");
        f396225v = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f396226w = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TextStatusComment_CommentId_index ON TextStatusComment(CommentId)"};
        f396227x = 508951482;
        f396228y = 1767604960;
        f396229z = 1214784794;
        A = 449153272;
        B = -130510534;
        C = 933947920;
        D = -932289015;
        E = -629656726;
        F = 2543030;
        G = 424807759;
        H = 1566917561;
        I = -1902930339;
        f396224J = -56677412;
        K = 2557811;
        L = -1926269803;
        M = 108705909;
        N = initAutoDBInfo(rj4.b.class);
        P = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[15];
        java.lang.String[] strArr = new java.lang.String[16];
        e0Var.f316954c = strArr;
        strArr[0] = "CommentId";
        e0Var.f316955d.put("CommentId", "TEXT");
        e0Var.f316954c[1] = "FromUserName";
        e0Var.f316955d.put("FromUserName", "TEXT");
        e0Var.f316954c[2] = "TextStatusId";
        e0Var.f316955d.put("TextStatusId", "TEXT");
        e0Var.f316954c[3] = "RootCommentId";
        e0Var.f316955d.put("RootCommentId", "TEXT");
        e0Var.f316954c[4] = "CommentContent";
        e0Var.f316955d.put("CommentContent", "TEXT");
        e0Var.f316954c[5] = "CommentCount";
        e0Var.f316955d.put("CommentCount", "INTEGER");
        e0Var.f316954c[6] = "CreateTime";
        e0Var.f316955d.put("CreateTime", "INTEGER");
        e0Var.f316954c[7] = "TextStatusOwnerUserName";
        e0Var.f316955d.put("TextStatusOwnerUserName", "TEXT");
        e0Var.f316954c[8] = "Read";
        e0Var.f316955d.put("Read", "INTEGER");
        e0Var.f316954c[9] = "DeleteInMsgList";
        e0Var.f316955d.put("DeleteInMsgList", "INTEGER");
        e0Var.f316954c[10] = "thumbUrl";
        e0Var.f316955d.put("thumbUrl", "TEXT");
        e0Var.f316954c[11] = "TopicInfo";
        e0Var.f316955d.put("TopicInfo", "BLOB");
        e0Var.f316954c[12] = "Description";
        e0Var.f316955d.put("Description", "TEXT");
        e0Var.f316954c[13] = "HasBeenDeleted";
        e0Var.f316955d.put("HasBeenDeleted", "INTEGER");
        e0Var.f316954c[14] = "Option";
        e0Var.f316955d.put("Option", "LONG");
        e0Var.f316954c[15] = "rowid";
        e0Var.f316956e = " CommentId TEXT,  FromUserName TEXT,  TextStatusId TEXT,  RootCommentId TEXT,  CommentContent TEXT,  CommentCount INTEGER,  CreateTime INTEGER,  TextStatusOwnerUserName TEXT,  Read INTEGER,  DeleteInMsgList INTEGER,  thumbUrl TEXT,  TopicInfo BLOB,  Description TEXT,  HasBeenDeleted INTEGER,  Option LONG";
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
            if (f396227x == hashCode) {
                try {
                    this.field_CommentId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusComment", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396228y == hashCode) {
                try {
                    this.field_FromUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusComment", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396229z == hashCode) {
                try {
                    this.field_TextStatusId = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusComment", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_RootCommentId = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusComment", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_CommentContent = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusComment", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_CommentCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusComment", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_CreateTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusComment", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_TextStatusOwnerUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusComment", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_Read = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusComment", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_DeleteInMsgList = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusComment", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_thumbUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusComment", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_TopicInfo = cursor.getBlob(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusComment", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396224J == hashCode) {
                try {
                    this.field_Description = cursor.getString(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusComment", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_HasBeenDeleted = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusComment", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_Option = cursor.getLong(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusComment", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f396230d) {
            contentValues.put("CommentId", this.field_CommentId);
        }
        if (this.f396231e) {
            contentValues.put("FromUserName", this.field_FromUserName);
        }
        if (this.f396232f) {
            contentValues.put("TextStatusId", this.field_TextStatusId);
        }
        if (this.f396233g) {
            contentValues.put("RootCommentId", this.field_RootCommentId);
        }
        if (this.f396234h) {
            contentValues.put("CommentContent", this.field_CommentContent);
        }
        if (this.f396235i) {
            contentValues.put("CommentCount", java.lang.Integer.valueOf(this.field_CommentCount));
        }
        if (this.f396236m) {
            contentValues.put("CreateTime", java.lang.Integer.valueOf(this.field_CreateTime));
        }
        if (this.f396237n) {
            contentValues.put("TextStatusOwnerUserName", this.field_TextStatusOwnerUserName);
        }
        if (this.f396238o) {
            contentValues.put("Read", java.lang.Integer.valueOf(this.field_Read));
        }
        if (this.f396239p) {
            contentValues.put("DeleteInMsgList", java.lang.Integer.valueOf(this.field_DeleteInMsgList));
        }
        if (this.f396240q) {
            contentValues.put("thumbUrl", this.field_thumbUrl);
        }
        if (this.f396241r) {
            contentValues.put("TopicInfo", this.field_TopicInfo);
        }
        if (this.f396242s) {
            contentValues.put("Description", this.field_Description);
        }
        if (this.f396243t) {
            contentValues.put("HasBeenDeleted", java.lang.Integer.valueOf(this.field_HasBeenDeleted));
        }
        if (this.f396244u) {
            contentValues.put("Option", java.lang.Long.valueOf(this.field_Option));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseTextStatusComment", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TextStatusComment ( ");
        l75.e0 e0Var = N;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f396226w) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusComment", "createTableSql %s", str2);
            k0Var.A("TextStatusComment", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "TextStatusComment", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusComment", "updateTableSql %s", str3);
            k0Var.A("TextStatusComment", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusComment", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return N;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return P;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f396225v;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f396225v.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("CommentId")) {
            this.field_CommentId = contentValues.getAsString("CommentId");
            if (z17) {
                this.f396230d = true;
            }
        }
        if (contentValues.containsKey("FromUserName")) {
            this.field_FromUserName = contentValues.getAsString("FromUserName");
            if (z17) {
                this.f396231e = true;
            }
        }
        if (contentValues.containsKey("TextStatusId")) {
            this.field_TextStatusId = contentValues.getAsString("TextStatusId");
            if (z17) {
                this.f396232f = true;
            }
        }
        if (contentValues.containsKey("RootCommentId")) {
            this.field_RootCommentId = contentValues.getAsString("RootCommentId");
            if (z17) {
                this.f396233g = true;
            }
        }
        if (contentValues.containsKey("CommentContent")) {
            this.field_CommentContent = contentValues.getAsString("CommentContent");
            if (z17) {
                this.f396234h = true;
            }
        }
        if (contentValues.containsKey("CommentCount")) {
            this.field_CommentCount = contentValues.getAsInteger("CommentCount").intValue();
            if (z17) {
                this.f396235i = true;
            }
        }
        if (contentValues.containsKey("CreateTime")) {
            this.field_CreateTime = contentValues.getAsInteger("CreateTime").intValue();
            if (z17) {
                this.f396236m = true;
            }
        }
        if (contentValues.containsKey("TextStatusOwnerUserName")) {
            this.field_TextStatusOwnerUserName = contentValues.getAsString("TextStatusOwnerUserName");
            if (z17) {
                this.f396237n = true;
            }
        }
        if (contentValues.containsKey("Read")) {
            this.field_Read = contentValues.getAsInteger("Read").intValue();
            if (z17) {
                this.f396238o = true;
            }
        }
        if (contentValues.containsKey("DeleteInMsgList")) {
            this.field_DeleteInMsgList = contentValues.getAsInteger("DeleteInMsgList").intValue();
            if (z17) {
                this.f396239p = true;
            }
        }
        if (contentValues.containsKey("thumbUrl")) {
            this.field_thumbUrl = contentValues.getAsString("thumbUrl");
            if (z17) {
                this.f396240q = true;
            }
        }
        if (contentValues.containsKey("TopicInfo")) {
            this.field_TopicInfo = contentValues.getAsByteArray("TopicInfo");
            if (z17) {
                this.f396241r = true;
            }
        }
        if (contentValues.containsKey("Description")) {
            this.field_Description = contentValues.getAsString("Description");
            if (z17) {
                this.f396242s = true;
            }
        }
        if (contentValues.containsKey("HasBeenDeleted")) {
            this.field_HasBeenDeleted = contentValues.getAsInteger("HasBeenDeleted").intValue();
            if (z17) {
                this.f396243t = true;
            }
        }
        if (contentValues.containsKey("Option")) {
            this.field_Option = contentValues.getAsLong("Option").longValue();
            if (z17) {
                this.f396244u = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
