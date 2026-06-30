package dm;

/* loaded from: classes8.dex */
public class a5 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final l75.e0 I;

    /* renamed from: J, reason: collision with root package name */
    public static final o75.e f235621J;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.n0 f235622s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f235623t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f235624u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f235625v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f235626w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f235627x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f235628y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f235629z;
    public long field_aiScene;
    public int field_businessType;
    public r45.vs2 field_ctrInfo;
    public int field_ctrType;
    public long field_expiredTime;
    public r45.g03 field_exposeInfo;
    public java.lang.String field_revokeId;
    public long field_time;
    public java.lang.String field_tipsId;
    public com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo field_tipsShowEntranceExtInfo;
    public java.lang.String field_tips_uuid;
    public java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235630d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235631e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235632f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235633g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f235634h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f235635i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f235636m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f235637n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f235638o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f235639p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f235640q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f235641r = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderRedDotInfo2");
        f235622s = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235623t = new p75.d("tips_uuid", "string", tableName, "");
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
        f235624u = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS Finder_RedDot_tips_uuid ON FinderRedDotInfo2(tips_uuid)", "CREATE INDEX IF NOT EXISTS Finder_RedDot_tips_id ON FinderRedDotInfo2(tipsId)", "CREATE INDEX IF NOT EXISTS Finder_RedDot_revoke_id ON FinderRedDotInfo2(revokeId)", "CREATE INDEX IF NOT EXISTS Finder_RedDot_ctrType ON FinderRedDotInfo2(ctrType)", "CREATE INDEX IF NOT EXISTS Finder_RedDot_expiredTime ON FinderRedDotInfo2(expiredTime)", "CREATE INDEX IF NOT EXISTS Finder_RedDot_ai_scene ON FinderRedDotInfo2(aiScene)"};
        f235625v = -1194943390;
        f235626w = -873566605;
        f235627x = 1097097839;
        f235628y = 3560141;
        f235629z = -255488447;
        A = 1236302788;
        B = 1097436411;
        C = -92515438;
        D = -1020693180;
        E = -265713450;
        F = -672734438;
        G = 223636114;
        H = 108705909;
        I = initAutoDBInfo(dm.a5.class);
        f235621J = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[12];
        java.lang.String[] strArr = new java.lang.String[13];
        e0Var.f316954c = strArr;
        strArr[0] = "tips_uuid";
        e0Var.f316955d.put("tips_uuid", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "tips_uuid";
        e0Var.f316954c[1] = "tipsId";
        e0Var.f316955d.put("tipsId", "TEXT");
        e0Var.f316954c[2] = "ctrInfo";
        e0Var.f316955d.put("ctrInfo", "BLOB");
        e0Var.f316954c[3] = "time";
        e0Var.f316955d.put("time", "LONG");
        e0Var.f316954c[4] = "revokeId";
        e0Var.f316955d.put("revokeId", "TEXT");
        e0Var.f316954c[5] = "tipsShowEntranceExtInfo";
        e0Var.f316955d.put("tipsShowEntranceExtInfo", "BLOB");
        e0Var.f316954c[6] = "ctrType";
        e0Var.f316955d.put("ctrType", "INTEGER");
        e0Var.f316954c[7] = "expiredTime";
        e0Var.f316955d.put("expiredTime", "LONG");
        e0Var.f316954c[8] = "aiScene";
        e0Var.f316955d.put("aiScene", "LONG");
        e0Var.f316954c[9] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT default '' ");
        e0Var.f316954c[10] = "businessType";
        e0Var.f316955d.put("businessType", "INTEGER default '0' ");
        e0Var.f316954c[11] = "exposeInfo";
        e0Var.f316955d.put("exposeInfo", "BLOB");
        e0Var.f316954c[12] = "rowid";
        e0Var.f316956e = " tips_uuid TEXT PRIMARY KEY ,  tipsId TEXT,  ctrInfo BLOB,  time LONG,  revokeId TEXT,  tipsShowEntranceExtInfo BLOB,  ctrType INTEGER,  expiredTime LONG,  aiScene LONG,  username TEXT default '' ,  businessType INTEGER default '0' ,  exposeInfo BLOB";
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
            if (f235625v == hashCode) {
                try {
                    this.field_tips_uuid = cursor.getString(i17);
                    this.f235630d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235626w == hashCode) {
                try {
                    this.field_tipsId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235627x == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_ctrInfo = (r45.vs2) new r45.vs2().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235628y == hashCode) {
                try {
                    this.field_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235629z == hashCode) {
                try {
                    this.field_revokeId = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    byte[] blob2 = cursor.getBlob(i17);
                    if (blob2 != null && blob2.length > 0) {
                        this.field_tipsShowEntranceExtInfo = (com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo) new com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo().parseFrom(blob2);
                    }
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_ctrType = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_expiredTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_aiScene = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_businessType = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    byte[] blob3 = cursor.getBlob(i17);
                    if (blob3 != null && blob3.length > 0) {
                        this.field_exposeInfo = (r45.g03) new r45.g03().parseFrom(blob3);
                    }
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderRedDotInfo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235630d) {
            contentValues.put("tips_uuid", this.field_tips_uuid);
        }
        if (this.f235631e) {
            contentValues.put("tipsId", this.field_tipsId);
        }
        if (this.f235632f) {
            r45.vs2 vs2Var = this.field_ctrInfo;
            if (vs2Var != null) {
                try {
                    contentValues.put("ctrInfo", vs2Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderRedDotInfo", e17.getMessage());
                }
            } else {
                contentValues.put("ctrInfo", (byte[]) null);
            }
        }
        if (this.f235633g) {
            contentValues.put("time", java.lang.Long.valueOf(this.field_time));
        }
        if (this.f235634h) {
            contentValues.put("revokeId", this.field_revokeId);
        }
        if (this.f235635i) {
            com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = this.field_tipsShowEntranceExtInfo;
            if (finderTipsShowEntranceExtInfo != null) {
                try {
                    contentValues.put("tipsShowEntranceExtInfo", finderTipsShowEntranceExtInfo.toByteArray());
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderRedDotInfo", e18.getMessage());
                }
            } else {
                contentValues.put("tipsShowEntranceExtInfo", (byte[]) null);
            }
        }
        if (this.f235636m) {
            contentValues.put("ctrType", java.lang.Integer.valueOf(this.field_ctrType));
        }
        if (this.f235637n) {
            contentValues.put("expiredTime", java.lang.Long.valueOf(this.field_expiredTime));
        }
        if (this.f235638o) {
            contentValues.put("aiScene", java.lang.Long.valueOf(this.field_aiScene));
        }
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f235639p) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f235640q) {
            contentValues.put("businessType", java.lang.Integer.valueOf(this.field_businessType));
        }
        if (this.f235641r) {
            r45.g03 g03Var = this.field_exposeInfo;
            if (g03Var != null) {
                try {
                    contentValues.put("exposeInfo", g03Var.toByteArray());
                } catch (java.io.IOException e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderRedDotInfo", e19.getMessage());
                }
            } else {
                contentValues.put("exposeInfo", (byte[]) null);
            }
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderRedDotInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderRedDotInfo2 ( ");
        l75.e0 e0Var = I;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235624u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderRedDotInfo", "createTableSql %s", str2);
            k0Var.A("FinderRedDotInfo2", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderRedDotInfo2", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderRedDotInfo", "updateTableSql %s", str3);
            k0Var.A("FinderRedDotInfo2", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderRedDotInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return I;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235621J;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_tips_uuid;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235622s;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235622s.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("tips_uuid")) {
            this.field_tips_uuid = contentValues.getAsString("tips_uuid");
            if (z17) {
                this.f235630d = true;
            }
        }
        if (contentValues.containsKey("tipsId")) {
            this.field_tipsId = contentValues.getAsString("tipsId");
            if (z17) {
                this.f235631e = true;
            }
        }
        if (contentValues.containsKey("ctrInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("ctrInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_ctrInfo = (r45.vs2) new r45.vs2().parseFrom(asByteArray);
                    if (z17) {
                        this.f235632f = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderRedDotInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("time")) {
            this.field_time = contentValues.getAsLong("time").longValue();
            if (z17) {
                this.f235633g = true;
            }
        }
        if (contentValues.containsKey("revokeId")) {
            this.field_revokeId = contentValues.getAsString("revokeId");
            if (z17) {
                this.f235634h = true;
            }
        }
        if (contentValues.containsKey("tipsShowEntranceExtInfo")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("tipsShowEntranceExtInfo");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_tipsShowEntranceExtInfo = (com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo) new com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo().parseFrom(asByteArray2);
                    if (z17) {
                        this.f235635i = true;
                    }
                }
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderRedDotInfo", e18.getMessage());
            }
        }
        if (contentValues.containsKey("ctrType")) {
            this.field_ctrType = contentValues.getAsInteger("ctrType").intValue();
            if (z17) {
                this.f235636m = true;
            }
        }
        if (contentValues.containsKey("expiredTime")) {
            this.field_expiredTime = contentValues.getAsLong("expiredTime").longValue();
            if (z17) {
                this.f235637n = true;
            }
        }
        if (contentValues.containsKey("aiScene")) {
            this.field_aiScene = contentValues.getAsLong("aiScene").longValue();
            if (z17) {
                this.f235638o = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f235639p = true;
            }
        }
        if (contentValues.containsKey("businessType")) {
            this.field_businessType = contentValues.getAsInteger("businessType").intValue();
            if (z17) {
                this.f235640q = true;
            }
        }
        if (contentValues.containsKey("exposeInfo")) {
            try {
                byte[] asByteArray3 = contentValues.getAsByteArray("exposeInfo");
                if (asByteArray3 != null && asByteArray3.length > 0) {
                    this.field_exposeInfo = (r45.g03) new r45.g03().parseFrom(asByteArray3);
                    if (z17) {
                        this.f235641r = true;
                    }
                }
            } catch (java.io.IOException e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderRedDotInfo", e19.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
