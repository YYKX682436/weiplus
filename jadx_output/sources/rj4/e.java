package rj4;

/* loaded from: classes11.dex */
public class e extends l75.f0 {
    public static final p75.d A;
    public static final java.lang.String[] B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f396289J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final l75.e0 T;
    public static final o75.e U;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.n0 f396290v;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.d f396291w;

    /* renamed from: x, reason: collision with root package name */
    public static final p75.d f396292x;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.d f396293y;

    /* renamed from: z, reason: collision with root package name */
    public static final p75.d f396294z;
    public int field_CreateTime;
    public int field_DeleteInMsgList;
    public java.lang.String field_Description;
    public java.lang.String field_DisplayName;
    public java.lang.String field_HashUserName;
    public java.lang.String field_HeadImgUrl;
    public java.lang.String field_LikeId;
    public int field_Notify;
    public long field_Option;
    public int field_Read;
    public java.lang.String field_TextStatusId;
    public byte[] field_TopicInfo;
    public int field_Type;
    public int field_Version;
    public java.lang.String field_thumbUrl;

    /* renamed from: d, reason: collision with root package name */
    public boolean f396295d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f396296e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f396297f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f396298g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f396299h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f396300i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f396301m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f396302n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f396303o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f396304p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f396305q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f396306r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f396307s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f396308t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f396309u = true;

    static {
        p75.n0 n0Var = new p75.n0("TextStatusLike");
        f396290v = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f396291w = new p75.d("TextStatusId", "string", tableName, "");
        f396292x = new p75.d("HashUserName", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f396293y = new p75.d("CreateTime", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f396294z = new p75.d("DeleteInMsgList", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        A = new p75.d("LikeId", "string", tableName, "");
        B = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TextStatusLike_TextStatusId_index ON TextStatusLike(TextStatusId)"};
        C = 1214784794;
        D = -2124511164;
        E = -912949683;
        F = -1129666356;
        G = -56677412;
        H = 2622298;
        I = -932289015;
        f396289J = -1955822743;
        K = 2543030;
        L = 1566917561;
        M = -1902930339;
        N = 424807759;
        P = 2016261304;
        Q = -1926269803;
        R = -2018895054;
        S = 108705909;
        T = initAutoDBInfo(rj4.e.class);
        U = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[15];
        java.lang.String[] strArr = new java.lang.String[16];
        e0Var.f316954c = strArr;
        strArr[0] = "TextStatusId";
        e0Var.f316955d.put("TextStatusId", "TEXT");
        e0Var.f316954c[1] = "HashUserName";
        e0Var.f316955d.put("HashUserName", "TEXT");
        e0Var.f316954c[2] = "DisplayName";
        e0Var.f316955d.put("DisplayName", "TEXT");
        e0Var.f316954c[3] = "HeadImgUrl";
        e0Var.f316955d.put("HeadImgUrl", "TEXT");
        e0Var.f316954c[4] = "Description";
        e0Var.f316955d.put("Description", "TEXT");
        e0Var.f316954c[5] = "Type";
        e0Var.f316955d.put("Type", "INTEGER");
        e0Var.f316954c[6] = "CreateTime";
        e0Var.f316955d.put("CreateTime", "INTEGER");
        e0Var.f316954c[7] = "Notify";
        e0Var.f316955d.put("Notify", "INTEGER");
        e0Var.f316954c[8] = "Read";
        e0Var.f316955d.put("Read", "INTEGER");
        e0Var.f316954c[9] = "thumbUrl";
        e0Var.f316955d.put("thumbUrl", "TEXT");
        e0Var.f316954c[10] = "TopicInfo";
        e0Var.f316955d.put("TopicInfo", "BLOB");
        e0Var.f316954c[11] = "DeleteInMsgList";
        e0Var.f316955d.put("DeleteInMsgList", "INTEGER");
        e0Var.f316954c[12] = "Version";
        e0Var.f316955d.put("Version", "INTEGER");
        e0Var.f316954c[13] = "Option";
        e0Var.f316955d.put("Option", "LONG");
        e0Var.f316954c[14] = "LikeId";
        e0Var.f316955d.put("LikeId", "TEXT");
        e0Var.f316954c[15] = "rowid";
        e0Var.f316956e = " TextStatusId TEXT,  HashUserName TEXT,  DisplayName TEXT,  HeadImgUrl TEXT,  Description TEXT,  Type INTEGER,  CreateTime INTEGER,  Notify INTEGER,  Read INTEGER,  thumbUrl TEXT,  TopicInfo BLOB,  DeleteInMsgList INTEGER,  Version INTEGER,  Option LONG,  LikeId TEXT";
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
            if (C == hashCode) {
                try {
                    this.field_TextStatusId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_HashUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_DisplayName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_HeadImgUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_Description = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_Type = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_CreateTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f396289J == hashCode) {
                try {
                    this.field_Notify = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_Read = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_thumbUrl = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_TopicInfo = cursor.getBlob(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_DeleteInMsgList = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    this.field_Version = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    this.field_Option = cursor.getLong(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_LikeId = cursor.getString(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseTextStatusLike", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f396295d) {
            contentValues.put("TextStatusId", this.field_TextStatusId);
        }
        if (this.f396296e) {
            contentValues.put("HashUserName", this.field_HashUserName);
        }
        if (this.f396297f) {
            contentValues.put("DisplayName", this.field_DisplayName);
        }
        if (this.f396298g) {
            contentValues.put("HeadImgUrl", this.field_HeadImgUrl);
        }
        if (this.f396299h) {
            contentValues.put("Description", this.field_Description);
        }
        if (this.f396300i) {
            contentValues.put("Type", java.lang.Integer.valueOf(this.field_Type));
        }
        if (this.f396301m) {
            contentValues.put("CreateTime", java.lang.Integer.valueOf(this.field_CreateTime));
        }
        if (this.f396302n) {
            contentValues.put("Notify", java.lang.Integer.valueOf(this.field_Notify));
        }
        if (this.f396303o) {
            contentValues.put("Read", java.lang.Integer.valueOf(this.field_Read));
        }
        if (this.f396304p) {
            contentValues.put("thumbUrl", this.field_thumbUrl);
        }
        if (this.f396305q) {
            contentValues.put("TopicInfo", this.field_TopicInfo);
        }
        if (this.f396306r) {
            contentValues.put("DeleteInMsgList", java.lang.Integer.valueOf(this.field_DeleteInMsgList));
        }
        if (this.f396307s) {
            contentValues.put("Version", java.lang.Integer.valueOf(this.field_Version));
        }
        if (this.f396308t) {
            contentValues.put("Option", java.lang.Long.valueOf(this.field_Option));
        }
        if (this.f396309u) {
            contentValues.put("LikeId", this.field_LikeId);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseTextStatusLike", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS TextStatusLike ( ");
        l75.e0 e0Var = T;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : B) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusLike", "createTableSql %s", str2);
            k0Var.A("TextStatusLike", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "TextStatusLike", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusLike", "updateTableSql %s", str3);
            k0Var.A("TextStatusLike", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseTextStatusLike", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return T;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return U;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f396290v;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f396290v.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("TextStatusId")) {
            this.field_TextStatusId = contentValues.getAsString("TextStatusId");
            if (z17) {
                this.f396295d = true;
            }
        }
        if (contentValues.containsKey("HashUserName")) {
            this.field_HashUserName = contentValues.getAsString("HashUserName");
            if (z17) {
                this.f396296e = true;
            }
        }
        if (contentValues.containsKey("DisplayName")) {
            this.field_DisplayName = contentValues.getAsString("DisplayName");
            if (z17) {
                this.f396297f = true;
            }
        }
        if (contentValues.containsKey("HeadImgUrl")) {
            this.field_HeadImgUrl = contentValues.getAsString("HeadImgUrl");
            if (z17) {
                this.f396298g = true;
            }
        }
        if (contentValues.containsKey("Description")) {
            this.field_Description = contentValues.getAsString("Description");
            if (z17) {
                this.f396299h = true;
            }
        }
        if (contentValues.containsKey("Type")) {
            this.field_Type = contentValues.getAsInteger("Type").intValue();
            if (z17) {
                this.f396300i = true;
            }
        }
        if (contentValues.containsKey("CreateTime")) {
            this.field_CreateTime = contentValues.getAsInteger("CreateTime").intValue();
            if (z17) {
                this.f396301m = true;
            }
        }
        if (contentValues.containsKey("Notify")) {
            this.field_Notify = contentValues.getAsInteger("Notify").intValue();
            if (z17) {
                this.f396302n = true;
            }
        }
        if (contentValues.containsKey("Read")) {
            this.field_Read = contentValues.getAsInteger("Read").intValue();
            if (z17) {
                this.f396303o = true;
            }
        }
        if (contentValues.containsKey("thumbUrl")) {
            this.field_thumbUrl = contentValues.getAsString("thumbUrl");
            if (z17) {
                this.f396304p = true;
            }
        }
        if (contentValues.containsKey("TopicInfo")) {
            this.field_TopicInfo = contentValues.getAsByteArray("TopicInfo");
            if (z17) {
                this.f396305q = true;
            }
        }
        if (contentValues.containsKey("DeleteInMsgList")) {
            this.field_DeleteInMsgList = contentValues.getAsInteger("DeleteInMsgList").intValue();
            if (z17) {
                this.f396306r = true;
            }
        }
        if (contentValues.containsKey("Version")) {
            this.field_Version = contentValues.getAsInteger("Version").intValue();
            if (z17) {
                this.f396307s = true;
            }
        }
        if (contentValues.containsKey("Option")) {
            this.field_Option = contentValues.getAsLong("Option").longValue();
            if (z17) {
                this.f396308t = true;
            }
        }
        if (contentValues.containsKey("LikeId")) {
            this.field_LikeId = contentValues.getAsString("LikeId");
            if (z17) {
                this.f396309u = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
