package dm;

/* loaded from: classes12.dex */
public class k6 extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f238025o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f238026p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238027q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f238028r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238029s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238030t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238031u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238032v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238033w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f238034x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238035y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f238036z;
    public java.lang.String field_appusername;
    public int field_likecount;
    public java.lang.String field_rankID;
    public int field_ranknum;
    public int field_score;
    public int field_selfLikeState;
    public r45.ed6 field_sportRecord;
    public java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238037d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238038e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238039f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238040g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238041h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238042i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238043m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238044n = true;

    static {
        p75.n0 n0Var = new p75.n0("HardDeviceRankInfo");
        f238025o = n0Var;
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
        f238026p = new java.lang.String[0];
        f238027q = -938280377;
        f238028r = 417550839;
        f238029s = -265713450;
        f238030t = 978116570;
        f238031u = 109264530;
        f238032v = -160053288;
        f238033w = -1061613234;
        f238034x = -657581851;
        f238035y = 108705909;
        f238036z = initAutoDBInfo(dm.k6.class);
        A = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f316954c = strArr;
        strArr[0] = "rankID";
        e0Var.f316955d.put("rankID", "TEXT");
        e0Var.f316954c[1] = "appusername";
        e0Var.f316955d.put("appusername", "TEXT");
        e0Var.f316954c[2] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[3] = "ranknum";
        e0Var.f316955d.put("ranknum", "INTEGER");
        e0Var.f316954c[4] = ya.b.SCORE;
        e0Var.f316955d.put(ya.b.SCORE, "INTEGER");
        e0Var.f316954c[5] = "likecount";
        e0Var.f316955d.put("likecount", "INTEGER default '0' ");
        e0Var.f316954c[6] = "selfLikeState";
        e0Var.f316955d.put("selfLikeState", "INTEGER default '3' ");
        e0Var.f316954c[7] = "sportRecord";
        e0Var.f316955d.put("sportRecord", "BLOB");
        e0Var.f316954c[8] = "rowid";
        e0Var.f316956e = " rankID TEXT,  appusername TEXT,  username TEXT,  ranknum INTEGER,  score INTEGER,  likecount INTEGER default '0' ,  selfLikeState INTEGER default '3' ,  sportRecord BLOB";
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
            if (f238027q == hashCode) {
                try {
                    this.field_rankID = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238028r == hashCode) {
                try {
                    this.field_appusername = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238029s == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238030t == hashCode) {
                try {
                    this.field_ranknum = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238031u == hashCode) {
                try {
                    this.field_score = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238032v == hashCode) {
                try {
                    this.field_likecount = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238033w == hashCode) {
                try {
                    this.field_selfLikeState = cursor.getInt(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238034x == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_sportRecord = (r45.ed6) new r45.ed6().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseHardDeviceRankInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238035y == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238037d) {
            contentValues.put("rankID", this.field_rankID);
        }
        if (this.f238038e) {
            contentValues.put("appusername", this.field_appusername);
        }
        if (this.f238039f) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f238040g) {
            contentValues.put("ranknum", java.lang.Integer.valueOf(this.field_ranknum));
        }
        if (this.f238041h) {
            contentValues.put(ya.b.SCORE, java.lang.Integer.valueOf(this.field_score));
        }
        if (this.f238042i) {
            contentValues.put("likecount", java.lang.Integer.valueOf(this.field_likecount));
        }
        if (this.f238043m) {
            contentValues.put("selfLikeState", java.lang.Integer.valueOf(this.field_selfLikeState));
        }
        if (this.f238044n) {
            r45.ed6 ed6Var = this.field_sportRecord;
            if (ed6Var != null) {
                try {
                    contentValues.put("sportRecord", ed6Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseHardDeviceRankInfo", e17.getMessage());
                }
            } else {
                contentValues.put("sportRecord", (byte[]) null);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseHardDeviceRankInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS HardDeviceRankInfo ( ");
        l75.e0 e0Var = f238036z;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238026p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceRankInfo", "createTableSql %s", str2);
            k0Var.A("HardDeviceRankInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "HardDeviceRankInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceRankInfo", "updateTableSql %s", str3);
            k0Var.A("HardDeviceRankInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseHardDeviceRankInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238036z;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return A;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238025o;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238025o.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("rankID")) {
            this.field_rankID = contentValues.getAsString("rankID");
            if (z17) {
                this.f238037d = true;
            }
        }
        if (contentValues.containsKey("appusername")) {
            this.field_appusername = contentValues.getAsString("appusername");
            if (z17) {
                this.f238038e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f238039f = true;
            }
        }
        if (contentValues.containsKey("ranknum")) {
            this.field_ranknum = contentValues.getAsInteger("ranknum").intValue();
            if (z17) {
                this.f238040g = true;
            }
        }
        if (contentValues.containsKey(ya.b.SCORE)) {
            this.field_score = contentValues.getAsInteger(ya.b.SCORE).intValue();
            if (z17) {
                this.f238041h = true;
            }
        }
        if (contentValues.containsKey("likecount")) {
            this.field_likecount = contentValues.getAsInteger("likecount").intValue();
            if (z17) {
                this.f238042i = true;
            }
        }
        if (contentValues.containsKey("selfLikeState")) {
            this.field_selfLikeState = contentValues.getAsInteger("selfLikeState").intValue();
            if (z17) {
                this.f238043m = true;
            }
        }
        if (contentValues.containsKey("sportRecord")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("sportRecord");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_sportRecord = (r45.ed6) new r45.ed6().parseFrom(asByteArray);
                    if (z17) {
                        this.f238044n = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseHardDeviceRankInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
