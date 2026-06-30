package dm;

/* loaded from: classes8.dex */
public class m3 extends l75.f0 {

    /* renamed from: i, reason: collision with root package name */
    public static final p75.n0 f238433i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f238434m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f238435n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238436o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238437p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238438q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f238439r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238440s;

    /* renamed from: t, reason: collision with root package name */
    public static final l75.e0 f238441t;

    /* renamed from: u, reason: collision with root package name */
    public static final o75.e f238442u;
    public long field_localId;
    public r45.kp0 field_modItem;
    public int field_scene;
    public long field_time;
    public int field_type;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238443d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238444e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238445f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238446g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238447h = true;

    static {
        p75.n0 n0Var = new p75.n0("FavEditInfo");
        f238433i = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238434m = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FavModInfo_LocalId_Index ON FavEditInfo(localId)"};
        f238435n = 338409958;
        f238436o = 1226130741;
        f238437p = 3560141;
        f238438q = 3575610;
        f238439r = 109254796;
        f238440s = 108705909;
        f238441t = initAutoDBInfo(dm.m3.class);
        f238442u = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[5];
        java.lang.String[] strArr = new java.lang.String[6];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_LOCALID;
        e0Var.f316955d.put(dm.i4.COL_LOCALID, "LONG");
        e0Var.f316954c[1] = "modItem";
        e0Var.f316955d.put("modItem", "BLOB");
        e0Var.f316954c[2] = "time";
        e0Var.f316955d.put("time", "LONG");
        e0Var.f316954c[3] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[4] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER default '1' ");
        e0Var.f316954c[5] = "rowid";
        e0Var.f316956e = " localId LONG,  modItem BLOB,  time LONG,  type INTEGER,  scene INTEGER default '1' ";
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
            if (f238435n == hashCode) {
                try {
                    this.field_localId = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavEditInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238436o == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_modItem = (r45.kp0) new r45.kp0().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavEditInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238437p == hashCode) {
                try {
                    this.field_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavEditInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238438q == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavEditInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238439r == hashCode) {
                try {
                    this.field_scene = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFavEditInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238440s == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238443d) {
            contentValues.put(dm.i4.COL_LOCALID, java.lang.Long.valueOf(this.field_localId));
        }
        if (this.f238444e) {
            r45.kp0 kp0Var = this.field_modItem;
            if (kp0Var != null) {
                try {
                    contentValues.put("modItem", kp0Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFavEditInfo", e17.getMessage());
                }
            } else {
                contentValues.put("modItem", (byte[]) null);
            }
        }
        if (this.f238445f) {
            contentValues.put("time", java.lang.Long.valueOf(this.field_time));
        }
        if (this.f238446g) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f238447h) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFavEditInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FavEditInfo ( ");
        l75.e0 e0Var = f238441t;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238434m) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavEditInfo", "createTableSql %s", str2);
            k0Var.A("FavEditInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FavEditInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavEditInfo", "updateTableSql %s", str3);
            k0Var.A("FavEditInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFavEditInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238441t;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238442u;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238433i;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238433i.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, dm.i4.COL_LOCALID, java.lang.Long.valueOf(this.field_localId));
            n51.f.b(jSONObject, "modItem", this.field_modItem);
            n51.f.b(jSONObject, "time", java.lang.Long.valueOf(this.field_time));
            n51.f.b(jSONObject, "type", java.lang.Integer.valueOf(this.field_type));
            n51.f.b(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_LOCALID)) {
            this.field_localId = contentValues.getAsLong(dm.i4.COL_LOCALID).longValue();
            if (z17) {
                this.f238443d = true;
            }
        }
        if (contentValues.containsKey("modItem")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("modItem");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_modItem = (r45.kp0) new r45.kp0().parseFrom(asByteArray);
                    if (z17) {
                        this.f238444e = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFavEditInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("time")) {
            this.field_time = contentValues.getAsLong("time").longValue();
            if (z17) {
                this.f238445f = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f238446g = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z17) {
                this.f238447h = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
