package dm;

/* loaded from: classes8.dex */
public class k5 extends l75.f0 {
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
    public static final l75.e0 f238004J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f238005t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f238006u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238007v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238008w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f238009x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238010y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f238011z;
    public java.lang.String field_BusinessData;
    public java.lang.String field_bgMixTaskId;
    public boolean field_compressImg;
    public long field_createTime;
    public java.lang.String field_localIdList;
    public java.lang.String field_mediaList;
    public int field_mediaType;
    public int field_mixState;
    public int field_publishSource;
    public int field_publishState;
    public int field_sourceSceneId;
    public java.lang.String field_taskId;
    public int field_uploadState;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238012d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238013e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238014f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238015g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238016h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238017i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238018m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238019n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f238020o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f238021p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f238022q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f238023r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f238024s = true;

    static {
        p75.n0 n0Var = new p75.n0("GameHaowanPublishEdition");
        f238005t = n0Var;
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
        f238006u = new java.lang.String[0];
        f238007v = -880873088;
        f238008w = 1369213417;
        f238009x = 2009180682;
        f238010y = 2140463422;
        f238011z = 1114930084;
        A = 2140209826;
        B = -508913750;
        C = 1053908752;
        D = -1874720574;
        E = 1431953665;
        F = -1092892779;
        G = -572956617;
        H = 2009209388;
        I = 108705909;
        f238004J = initAutoDBInfo(dm.k5.class);
        K = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f316954c = strArr;
        strArr[0] = "taskId";
        e0Var.f316955d.put("taskId", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "taskId";
        e0Var.f316954c[1] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[2] = "publishSource";
        e0Var.f316955d.put("publishSource", "INTEGER");
        e0Var.f316954c[3] = "mediaType";
        e0Var.f316955d.put("mediaType", "INTEGER");
        e0Var.f316954c[4] = "localIdList";
        e0Var.f316955d.put("localIdList", "TEXT");
        e0Var.f316954c[5] = "mediaList";
        e0Var.f316955d.put("mediaList", "TEXT");
        e0Var.f316954c[6] = "BusinessData";
        e0Var.f316955d.put("BusinessData", "TEXT");
        e0Var.f316954c[7] = "uploadState";
        e0Var.f316955d.put("uploadState", "INTEGER default '0' ");
        e0Var.f316954c[8] = "publishState";
        e0Var.f316955d.put("publishState", "INTEGER default '0' ");
        e0Var.f316954c[9] = "compressImg";
        e0Var.f316955d.put("compressImg", "INTEGER default 'true' ");
        e0Var.f316954c[10] = "mixState";
        e0Var.f316955d.put("mixState", "INTEGER default '0' ");
        e0Var.f316954c[11] = "bgMixTaskId";
        e0Var.f316955d.put("bgMixTaskId", "TEXT");
        e0Var.f316954c[12] = "sourceSceneId";
        e0Var.f316955d.put("sourceSceneId", "INTEGER default '0' ");
        e0Var.f316954c[13] = "rowid";
        e0Var.f316956e = " taskId TEXT PRIMARY KEY ,  createTime LONG,  publishSource INTEGER,  mediaType INTEGER,  localIdList TEXT,  mediaList TEXT,  BusinessData TEXT,  uploadState INTEGER default '0' ,  publishState INTEGER default '0' ,  compressImg INTEGER default 'true' ,  mixState INTEGER default '0' ,  bgMixTaskId TEXT,  sourceSceneId INTEGER default '0' ";
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
            boolean z17 = true;
            if (f238007v == hashCode) {
                try {
                    this.field_taskId = cursor.getString(i17);
                    this.f238012d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238008w == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238009x == hashCode) {
                try {
                    this.field_publishSource = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238010y == hashCode) {
                try {
                    this.field_mediaType = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238011z == hashCode) {
                try {
                    this.field_localIdList = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_mediaList = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_BusinessData = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_uploadState = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_publishState = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_compressImg = z17;
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_mixState = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_bgMixTaskId = cursor.getString(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_sourceSceneId = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameHaowanPublishEdition", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238012d) {
            contentValues.put("taskId", this.field_taskId);
        }
        if (this.f238013e) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
        }
        if (this.f238014f) {
            contentValues.put("publishSource", java.lang.Integer.valueOf(this.field_publishSource));
        }
        if (this.f238015g) {
            contentValues.put("mediaType", java.lang.Integer.valueOf(this.field_mediaType));
        }
        if (this.f238016h) {
            contentValues.put("localIdList", this.field_localIdList);
        }
        if (this.f238017i) {
            contentValues.put("mediaList", this.field_mediaList);
        }
        if (this.f238018m) {
            contentValues.put("BusinessData", this.field_BusinessData);
        }
        if (this.f238019n) {
            contentValues.put("uploadState", java.lang.Integer.valueOf(this.field_uploadState));
        }
        if (this.f238020o) {
            contentValues.put("publishState", java.lang.Integer.valueOf(this.field_publishState));
        }
        if (this.f238021p) {
            if (this.field_compressImg) {
                contentValues.put("compressImg", (java.lang.Integer) 1);
            } else {
                contentValues.put("compressImg", (java.lang.Integer) 0);
            }
        }
        if (this.f238022q) {
            contentValues.put("mixState", java.lang.Integer.valueOf(this.field_mixState));
        }
        if (this.f238023r) {
            contentValues.put("bgMixTaskId", this.field_bgMixTaskId);
        }
        if (this.f238024s) {
            contentValues.put("sourceSceneId", java.lang.Integer.valueOf(this.field_sourceSceneId));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameHaowanPublishEdition", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameHaowanPublishEdition ( ");
        l75.e0 e0Var = f238004J;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238006u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameHaowanPublishEdition", "createTableSql %s", str2);
            k0Var.A("GameHaowanPublishEdition", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GameHaowanPublishEdition", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameHaowanPublishEdition", "updateTableSql %s", str3);
            k0Var.A("GameHaowanPublishEdition", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameHaowanPublishEdition", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238004J;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return K;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_taskId;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238005t;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238005t.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("taskId")) {
            this.field_taskId = contentValues.getAsString("taskId");
            if (z17) {
                this.f238012d = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f238013e = true;
            }
        }
        if (contentValues.containsKey("publishSource")) {
            this.field_publishSource = contentValues.getAsInteger("publishSource").intValue();
            if (z17) {
                this.f238014f = true;
            }
        }
        if (contentValues.containsKey("mediaType")) {
            this.field_mediaType = contentValues.getAsInteger("mediaType").intValue();
            if (z17) {
                this.f238015g = true;
            }
        }
        if (contentValues.containsKey("localIdList")) {
            this.field_localIdList = contentValues.getAsString("localIdList");
            if (z17) {
                this.f238016h = true;
            }
        }
        if (contentValues.containsKey("mediaList")) {
            this.field_mediaList = contentValues.getAsString("mediaList");
            if (z17) {
                this.f238017i = true;
            }
        }
        if (contentValues.containsKey("BusinessData")) {
            this.field_BusinessData = contentValues.getAsString("BusinessData");
            if (z17) {
                this.f238018m = true;
            }
        }
        if (contentValues.containsKey("uploadState")) {
            this.field_uploadState = contentValues.getAsInteger("uploadState").intValue();
            if (z17) {
                this.f238019n = true;
            }
        }
        if (contentValues.containsKey("publishState")) {
            this.field_publishState = contentValues.getAsInteger("publishState").intValue();
            if (z17) {
                this.f238020o = true;
            }
        }
        if (contentValues.containsKey("compressImg")) {
            this.field_compressImg = contentValues.getAsInteger("compressImg").intValue() != 0;
            if (z17) {
                this.f238021p = true;
            }
        }
        if (contentValues.containsKey("mixState")) {
            this.field_mixState = contentValues.getAsInteger("mixState").intValue();
            if (z17) {
                this.f238022q = true;
            }
        }
        if (contentValues.containsKey("bgMixTaskId")) {
            this.field_bgMixTaskId = contentValues.getAsString("bgMixTaskId");
            if (z17) {
                this.f238023r = true;
            }
        }
        if (contentValues.containsKey("sourceSceneId")) {
            this.field_sourceSceneId = contentValues.getAsInteger("sourceSceneId").intValue();
            if (z17) {
                this.f238024s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
