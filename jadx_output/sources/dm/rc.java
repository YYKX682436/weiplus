package dm;

/* loaded from: classes12.dex */
public class rc extends l75.f0 {
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
    public static final int f239728J;
    public static final int K;
    public static final int L;
    public static final l75.e0 M;
    public static final o75.e N;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f239729t;

    /* renamed from: u, reason: collision with root package name */
    public static final p75.d f239730u;

    /* renamed from: v, reason: collision with root package name */
    public static final p75.d f239731v;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.d f239732w;

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String[] f239733x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f239734y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f239735z;
    public java.lang.String field_detail;
    public long field_diskSpace;
    public long field_flags;
    public byte[] field_hash;
    public byte[] field_linkUUID;
    public long field_msgId;
    public int field_msgSubType;
    public int field_msgType;
    public long field_msgtime;
    public java.lang.String field_path;
    public long field_size;
    public int field_subIdx;
    public java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239736d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239737e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239738f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239739g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239740h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239741i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239742m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f239743n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f239744o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f239745p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f239746q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f239747r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f239748s = true;

    static {
        p75.n0 n0Var = new p75.n0("WxFileIndex3");
        f239729t = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239730u = new p75.d("msgId", "long", tableName, "");
        f239731v = new p75.d(dm.i4.COL_USERNAME, "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239732w = new p75.d("msgSubType", "int", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239733x = new java.lang.String[0];
        f239734y = 104191100;
        f239735z = -265713450;
        A = 1343750747;
        B = 1567968985;
        C = 3433509;
        D = 3530753;
        E = 1344688590;
        F = 3195150;
        G = 81784169;
        H = 1194200757;
        I = -891570083;
        f239728J = -1335224239;
        K = 97513095;
        L = 108705909;
        M = initAutoDBInfo(dm.rc.class);
        N = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f316954c = strArr;
        strArr[0] = "msgId";
        e0Var.f316955d.put("msgId", "LONG");
        e0Var.f316954c[1] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[2] = "msgType";
        e0Var.f316955d.put("msgType", "INTEGER");
        e0Var.f316954c[3] = "msgSubType";
        e0Var.f316955d.put("msgSubType", "INTEGER");
        e0Var.f316954c[4] = com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH;
        e0Var.f316955d.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "TEXT");
        e0Var.f316954c[5] = "size";
        e0Var.f316955d.put("size", "LONG");
        e0Var.f316954c[6] = "msgtime";
        e0Var.f316955d.put("msgtime", "LONG");
        e0Var.f316954c[7] = "hash";
        e0Var.f316955d.put("hash", "BLOB");
        e0Var.f316954c[8] = "diskSpace";
        e0Var.f316955d.put("diskSpace", "LONG");
        e0Var.f316954c[9] = "linkUUID";
        e0Var.f316955d.put("linkUUID", "BLOB");
        e0Var.f316954c[10] = "subIdx";
        e0Var.f316955d.put("subIdx", "INTEGER");
        e0Var.f316954c[11] = "detail";
        e0Var.f316955d.put("detail", "TEXT");
        e0Var.f316954c[12] = "flags";
        e0Var.f316955d.put("flags", "LONG");
        e0Var.f316954c[13] = "rowid";
        e0Var.f316956e = " msgId LONG,  username TEXT,  msgType INTEGER,  msgSubType INTEGER,  path TEXT,  size LONG,  msgtime LONG,  hash BLOB,  diskSpace LONG,  linkUUID BLOB,  subIdx INTEGER,  detail TEXT,  flags LONG";
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
            if (f239734y == hashCode) {
                try {
                    this.field_msgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239735z == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_msgType = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_msgSubType = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_path = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_size = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_msgtime = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_hash = cursor.getBlob(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_diskSpace = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_linkUUID = cursor.getBlob(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_subIdx = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239728J == hashCode) {
                try {
                    this.field_detail = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_flags = cursor.getLong(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseWxFileIndex3", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239736d) {
            contentValues.put("msgId", java.lang.Long.valueOf(this.field_msgId));
        }
        if (this.f239737e) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f239738f) {
            contentValues.put("msgType", java.lang.Integer.valueOf(this.field_msgType));
        }
        if (this.f239739g) {
            contentValues.put("msgSubType", java.lang.Integer.valueOf(this.field_msgSubType));
        }
        if (this.f239740h) {
            contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.field_path);
        }
        if (this.f239741i) {
            contentValues.put("size", java.lang.Long.valueOf(this.field_size));
        }
        if (this.f239742m) {
            contentValues.put("msgtime", java.lang.Long.valueOf(this.field_msgtime));
        }
        if (this.f239743n) {
            contentValues.put("hash", this.field_hash);
        }
        if (this.f239744o) {
            contentValues.put("diskSpace", java.lang.Long.valueOf(this.field_diskSpace));
        }
        if (this.f239745p) {
            contentValues.put("linkUUID", this.field_linkUUID);
        }
        if (this.f239746q) {
            contentValues.put("subIdx", java.lang.Integer.valueOf(this.field_subIdx));
        }
        if (this.f239747r) {
            contentValues.put("detail", this.field_detail);
        }
        if (this.f239748s) {
            contentValues.put("flags", java.lang.Long.valueOf(this.field_flags));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseWxFileIndex3", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS WxFileIndex3 ( ");
        l75.e0 e0Var = M;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239733x) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxFileIndex3", "createTableSql %s", str2);
            k0Var.A("WxFileIndex3", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "WxFileIndex3", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxFileIndex3", "updateTableSql %s", str3);
            k0Var.A("WxFileIndex3", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseWxFileIndex3", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return M;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return N;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239729t;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239729t.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("msgId")) {
            this.field_msgId = contentValues.getAsLong("msgId").longValue();
            if (z17) {
                this.f239736d = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f239737e = true;
            }
        }
        if (contentValues.containsKey("msgType")) {
            this.field_msgType = contentValues.getAsInteger("msgType").intValue();
            if (z17) {
                this.f239738f = true;
            }
        }
        if (contentValues.containsKey("msgSubType")) {
            this.field_msgSubType = contentValues.getAsInteger("msgSubType").intValue();
            if (z17) {
                this.f239739g = true;
            }
        }
        if (contentValues.containsKey(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) {
            this.field_path = contentValues.getAsString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            if (z17) {
                this.f239740h = true;
            }
        }
        if (contentValues.containsKey("size")) {
            this.field_size = contentValues.getAsLong("size").longValue();
            if (z17) {
                this.f239741i = true;
            }
        }
        if (contentValues.containsKey("msgtime")) {
            this.field_msgtime = contentValues.getAsLong("msgtime").longValue();
            if (z17) {
                this.f239742m = true;
            }
        }
        if (contentValues.containsKey("hash")) {
            this.field_hash = contentValues.getAsByteArray("hash");
            if (z17) {
                this.f239743n = true;
            }
        }
        if (contentValues.containsKey("diskSpace")) {
            this.field_diskSpace = contentValues.getAsLong("diskSpace").longValue();
            if (z17) {
                this.f239744o = true;
            }
        }
        if (contentValues.containsKey("linkUUID")) {
            this.field_linkUUID = contentValues.getAsByteArray("linkUUID");
            if (z17) {
                this.f239745p = true;
            }
        }
        if (contentValues.containsKey("subIdx")) {
            this.field_subIdx = contentValues.getAsInteger("subIdx").intValue();
            if (z17) {
                this.f239746q = true;
            }
        }
        if (contentValues.containsKey("detail")) {
            this.field_detail = contentValues.getAsString("detail");
            if (z17) {
                this.f239747r = true;
            }
        }
        if (contentValues.containsKey("flags")) {
            this.field_flags = contentValues.getAsLong("flags").longValue();
            if (z17) {
                this.f239748s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
