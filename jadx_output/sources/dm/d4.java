package dm;

/* loaded from: classes10.dex */
public class d4 extends l75.f0 {
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
    public static final l75.e0 f236338J;
    public static final o75.e K;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.n0 f236339t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f236340u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236341v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236342w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f236343x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f236344y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f236345z;
    public int field_createTime;
    public int field_dbversion;
    public long field_extraInfoFlag;
    public r45.ec1 field_finderItem;
    public int field_localFlag;
    public long field_localId;
    public int field_markDeleted;
    public long field_objectId;
    public int field_objectType;
    public r45.ef2 field_originMvInfo;
    public java.lang.String field_postIntent;
    public int field_version;
    public int field_watermarkFlag;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236346d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236347e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236348f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236349g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236350h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236351i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236352m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236353n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236354o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f236355p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f236356q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f236357r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f236358s = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderDraftItem");
        f236339t = n0Var;
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
        f236340u = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderDraftItem_local_index ON FinderDraftItem(localId)", "CREATE INDEX IF NOT EXISTS FinderDraftItem_create_time ON FinderDraftItem(createTime)", "CREATE INDEX IF NOT EXISTS FinderDraftItem__Local_Flag ON FinderDraftItem(localFlag)", "CREATE INDEX IF NOT EXISTS FinderDraftItem__Object_Type ON FinderDraftItem(objectType)", "CREATE INDEX IF NOT EXISTS FinderDraftItem_svr_index ON FinderDraftItem(objectId)"};
        f236341v = 338409958;
        f236342w = 1369213417;
        f236343x = -1205623433;
        f236344y = 617079897;
        f236345z = 1066856217;
        A = 1327350620;
        B = 1574310077;
        C = 90495162;
        D = 644739212;
        E = 833206634;
        F = 351608024;
        G = -1008490854;
        H = -1225389584;
        I = 108705909;
        f236338J = initAutoDBInfo(dm.d4.class);
        K = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[13];
        java.lang.String[] strArr = new java.lang.String[14];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_LOCALID;
        e0Var.f316955d.put(dm.i4.COL_LOCALID, "LONG PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_LOCALID;
        e0Var.f316954c[1] = "createTime";
        e0Var.f316955d.put("createTime", "INTEGER");
        e0Var.f316954c[2] = "localFlag";
        e0Var.f316955d.put("localFlag", "INTEGER");
        e0Var.f316954c[3] = "finderItem";
        e0Var.f316955d.put("finderItem", "BLOB");
        e0Var.f316954c[4] = "objectType";
        e0Var.f316955d.put("objectType", "INTEGER");
        e0Var.f316954c[5] = "postIntent";
        e0Var.f316955d.put("postIntent", "TEXT");
        e0Var.f316954c[6] = "originMvInfo";
        e0Var.f316955d.put("originMvInfo", "BLOB");
        e0Var.f316954c[7] = "objectId";
        e0Var.f316955d.put("objectId", "LONG default '0' ");
        e0Var.f316954c[8] = "markDeleted";
        e0Var.f316955d.put("markDeleted", "INTEGER default '0' ");
        e0Var.f316954c[9] = "extraInfoFlag";
        e0Var.f316955d.put("extraInfoFlag", "LONG default '0' ");
        e0Var.f316954c[10] = "version";
        e0Var.f316955d.put("version", "INTEGER default '0' ");
        e0Var.f316954c[11] = "dbversion";
        e0Var.f316955d.put("dbversion", "INTEGER default '0' ");
        e0Var.f316954c[12] = dm.i4.COL_WATERMARKFLAG;
        e0Var.f316955d.put(dm.i4.COL_WATERMARKFLAG, "INTEGER");
        e0Var.f316954c[13] = "rowid";
        e0Var.f316956e = " localId LONG PRIMARY KEY ,  createTime INTEGER,  localFlag INTEGER,  finderItem BLOB,  objectType INTEGER,  postIntent TEXT,  originMvInfo BLOB,  objectId LONG default '0' ,  markDeleted INTEGER default '0' ,  extraInfoFlag LONG default '0' ,  version INTEGER default '0' ,  dbversion INTEGER default '0' ,  watermarkFlag INTEGER";
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
            if (f236341v == hashCode) {
                try {
                    this.field_localId = cursor.getLong(i17);
                    this.f236346d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236342w == hashCode) {
                try {
                    this.field_createTime = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236343x == hashCode) {
                try {
                    this.field_localFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236344y == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_finderItem = (r45.ec1) new r45.ec1().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236345z == hashCode) {
                try {
                    this.field_objectType = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_postIntent = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    byte[] blob2 = cursor.getBlob(i17);
                    if (blob2 != null && blob2.length > 0) {
                        this.field_originMvInfo = (r45.ef2) new r45.ef2().parseFrom(blob2);
                    }
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_objectId = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_markDeleted = cursor.getInt(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_extraInfoFlag = cursor.getLong(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_version = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_dbversion = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_watermarkFlag = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderDraftItem", th18, "convertFrom %s", columnNames[i17]);
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
        if (this.f236346d) {
            contentValues.put(dm.i4.COL_LOCALID, java.lang.Long.valueOf(this.field_localId));
        }
        if (this.f236347e) {
            contentValues.put("createTime", java.lang.Integer.valueOf(this.field_createTime));
        }
        if (this.f236348f) {
            contentValues.put("localFlag", java.lang.Integer.valueOf(this.field_localFlag));
        }
        if (this.f236349g) {
            r45.ec1 ec1Var = this.field_finderItem;
            if (ec1Var != null) {
                try {
                    contentValues.put("finderItem", ec1Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderDraftItem", e17.getMessage());
                }
            } else {
                contentValues.put("finderItem", (byte[]) null);
            }
        }
        if (this.f236350h) {
            contentValues.put("objectType", java.lang.Integer.valueOf(this.field_objectType));
        }
        if (this.f236351i) {
            contentValues.put("postIntent", this.field_postIntent);
        }
        if (this.f236352m) {
            r45.ef2 ef2Var = this.field_originMvInfo;
            if (ef2Var != null) {
                try {
                    contentValues.put("originMvInfo", ef2Var.toByteArray());
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderDraftItem", e18.getMessage());
                }
            } else {
                contentValues.put("originMvInfo", (byte[]) null);
            }
        }
        if (this.f236353n) {
            contentValues.put("objectId", java.lang.Long.valueOf(this.field_objectId));
        }
        if (this.f236354o) {
            contentValues.put("markDeleted", java.lang.Integer.valueOf(this.field_markDeleted));
        }
        if (this.f236355p) {
            contentValues.put("extraInfoFlag", java.lang.Long.valueOf(this.field_extraInfoFlag));
        }
        if (this.f236356q) {
            contentValues.put("version", java.lang.Integer.valueOf(this.field_version));
        }
        if (this.f236357r) {
            contentValues.put("dbversion", java.lang.Integer.valueOf(this.field_dbversion));
        }
        if (this.f236358s) {
            contentValues.put(dm.i4.COL_WATERMARKFLAG, java.lang.Integer.valueOf(this.field_watermarkFlag));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderDraftItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderDraftItem ( ");
        l75.e0 e0Var = f236338J;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236340u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderDraftItem", "createTableSql %s", str2);
            k0Var.A("FinderDraftItem", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderDraftItem", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderDraftItem", "updateTableSql %s", str3);
            k0Var.A("FinderDraftItem", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderDraftItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236338J;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return K;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_localId);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236339t;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236339t.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_LOCALID)) {
            this.field_localId = contentValues.getAsLong(dm.i4.COL_LOCALID).longValue();
            if (z17) {
                this.f236346d = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsInteger("createTime").intValue();
            if (z17) {
                this.f236347e = true;
            }
        }
        if (contentValues.containsKey("localFlag")) {
            this.field_localFlag = contentValues.getAsInteger("localFlag").intValue();
            if (z17) {
                this.f236348f = true;
            }
        }
        if (contentValues.containsKey("finderItem")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("finderItem");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_finderItem = (r45.ec1) new r45.ec1().parseFrom(asByteArray);
                    if (z17) {
                        this.f236349g = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderDraftItem", e17.getMessage());
            }
        }
        if (contentValues.containsKey("objectType")) {
            this.field_objectType = contentValues.getAsInteger("objectType").intValue();
            if (z17) {
                this.f236350h = true;
            }
        }
        if (contentValues.containsKey("postIntent")) {
            this.field_postIntent = contentValues.getAsString("postIntent");
            if (z17) {
                this.f236351i = true;
            }
        }
        if (contentValues.containsKey("originMvInfo")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("originMvInfo");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_originMvInfo = (r45.ef2) new r45.ef2().parseFrom(asByteArray2);
                    if (z17) {
                        this.f236352m = true;
                    }
                }
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderDraftItem", e18.getMessage());
            }
        }
        if (contentValues.containsKey("objectId")) {
            this.field_objectId = contentValues.getAsLong("objectId").longValue();
            if (z17) {
                this.f236353n = true;
            }
        }
        if (contentValues.containsKey("markDeleted")) {
            this.field_markDeleted = contentValues.getAsInteger("markDeleted").intValue();
            if (z17) {
                this.f236354o = true;
            }
        }
        if (contentValues.containsKey("extraInfoFlag")) {
            this.field_extraInfoFlag = contentValues.getAsLong("extraInfoFlag").longValue();
            if (z17) {
                this.f236355p = true;
            }
        }
        if (contentValues.containsKey("version")) {
            this.field_version = contentValues.getAsInteger("version").intValue();
            if (z17) {
                this.f236356q = true;
            }
        }
        if (contentValues.containsKey("dbversion")) {
            this.field_dbversion = contentValues.getAsInteger("dbversion").intValue();
            if (z17) {
                this.f236357r = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_WATERMARKFLAG)) {
            this.field_watermarkFlag = contentValues.getAsInteger(dm.i4.COL_WATERMARKFLAG).intValue();
            if (z17) {
                this.f236358s = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
