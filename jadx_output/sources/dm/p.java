package dm;

/* loaded from: classes7.dex */
public class p extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f239056n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f239057o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f239058p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f239059q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f239060r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f239061s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f239062t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f239063u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f239064v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f239065w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f239066x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f239067y;
    private java.lang.String field_id;
    private long field_message_aid;
    private long field_message_op_time;
    private long field_message_slotid;
    private java.lang.String field_message_traceid;
    private int field_op_code;
    private long field_timestamp;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239068d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f239069e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f239070f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f239071g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f239072h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f239073i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f239074m = false;

    static {
        p75.n0 n0Var = new p75.n0("AdvertisePushDBInfo");
        f239056n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f239057o = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS TimestampIndex ON AdvertisePushDBInfo(timestamp)", "CREATE INDEX IF NOT EXISTS AdvertisePushDBInfoSlotId ON AdvertisePushDBInfo(message_slotid)"};
        f239058p = 3355;
        f239059q = 55126294;
        f239060r = -1269047925;
        f239061s = -872788732;
        f239062t = 1001432785;
        f239063u = 1824338483;
        f239064v = 2025484520;
        f239065w = 108705909;
        f239066x = initAutoDBInfo(dm.p.class);
        f239067y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_ID;
        e0Var.f316955d.put(dm.i4.COL_ID, "TEXT PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_ID;
        e0Var.f316954c[1] = com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP;
        e0Var.f316955d.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "LONG default '0' ");
        e0Var.f316954c[2] = "op_code";
        e0Var.f316955d.put("op_code", "INTEGER default '0' ");
        e0Var.f316954c[3] = "message_aid";
        e0Var.f316955d.put("message_aid", "LONG default '0' ");
        e0Var.f316954c[4] = "message_slotid";
        e0Var.f316955d.put("message_slotid", "LONG default '0' ");
        e0Var.f316954c[5] = "message_op_time";
        e0Var.f316955d.put("message_op_time", "LONG default '0' ");
        e0Var.f316954c[6] = "message_traceid";
        e0Var.f316955d.put("message_traceid", "TEXT default '' ");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " id TEXT PRIMARY KEY ,  timestamp LONG default '0' ,  op_code INTEGER default '0' ,  message_aid LONG default '0' ,  message_slotid LONG default '0' ,  message_op_time LONG default '0' ,  message_traceid TEXT default '' ";
        if (e0Var.f316953b == null) {
            e0Var.f316953b = "rowid";
        }
        return e0Var;
    }

    public void A0(java.lang.String str) {
        this.field_id = str;
        this.f239068d = true;
    }

    public void D0(long j17) {
        this.field_message_aid = j17;
        this.f239071g = true;
    }

    public void F0(long j17) {
        this.field_message_op_time = j17;
        this.f239073i = true;
    }

    public void G0(long j17) {
        this.field_message_slotid = j17;
        this.f239072h = true;
    }

    public void I0(java.lang.String str) {
        this.field_message_traceid = str;
        this.f239074m = true;
    }

    public void J0(int i17) {
        this.field_op_code = i17;
        this.f239070f = true;
    }

    public void L0(long j17) {
        this.field_timestamp = j17;
        this.f239069e = true;
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
            if (f239058p == hashCode) {
                try {
                    this.field_id = cursor.getString(i17);
                    this.f239068d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdvertisePushDBInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239059q == hashCode) {
                try {
                    this.field_timestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdvertisePushDBInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239060r == hashCode) {
                try {
                    this.field_op_code = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdvertisePushDBInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239061s == hashCode) {
                try {
                    this.field_message_aid = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdvertisePushDBInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239062t == hashCode) {
                try {
                    this.field_message_slotid = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdvertisePushDBInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239063u == hashCode) {
                try {
                    this.field_message_op_time = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdvertisePushDBInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239064v == hashCode) {
                try {
                    this.field_message_traceid = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseAdvertisePushDBInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f239065w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f239068d) {
            contentValues.put(dm.i4.COL_ID, this.field_id);
        }
        if (this.f239069e) {
            contentValues.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(this.field_timestamp));
        }
        if (this.f239070f) {
            contentValues.put("op_code", java.lang.Integer.valueOf(this.field_op_code));
        }
        if (this.f239071g) {
            contentValues.put("message_aid", java.lang.Long.valueOf(this.field_message_aid));
        }
        if (this.f239072h) {
            contentValues.put("message_slotid", java.lang.Long.valueOf(this.field_message_slotid));
        }
        if (this.f239073i) {
            contentValues.put("message_op_time", java.lang.Long.valueOf(this.field_message_op_time));
        }
        if (this.field_message_traceid == null) {
            this.field_message_traceid = "";
        }
        if (this.f239074m) {
            contentValues.put("message_traceid", this.field_message_traceid);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseAdvertisePushDBInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS AdvertisePushDBInfo ( ");
        l75.e0 e0Var = f239066x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f239057o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAdvertisePushDBInfo", "createTableSql %s", str2);
            k0Var.A("AdvertisePushDBInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "AdvertisePushDBInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAdvertisePushDBInfo", "updateTableSql %s", str3);
            k0Var.A("AdvertisePushDBInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseAdvertisePushDBInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f239066x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f239067y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_id;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f239056n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f239056n.f352676a;
    }

    public long t0() {
        return this.field_message_aid;
    }

    public long u0() {
        return this.field_message_op_time;
    }

    public long v0() {
        return this.field_message_slotid;
    }

    public java.lang.String w0() {
        return this.field_message_traceid;
    }

    public int y0() {
        return this.field_op_code;
    }

    public long z0() {
        return this.field_timestamp;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_ID)) {
            this.field_id = contentValues.getAsString(dm.i4.COL_ID);
            if (z17) {
                this.f239068d = true;
            }
        }
        if (contentValues.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP).longValue();
            if (z17) {
                this.f239069e = true;
            }
        }
        if (contentValues.containsKey("op_code")) {
            this.field_op_code = contentValues.getAsInteger("op_code").intValue();
            if (z17) {
                this.f239070f = true;
            }
        }
        if (contentValues.containsKey("message_aid")) {
            this.field_message_aid = contentValues.getAsLong("message_aid").longValue();
            if (z17) {
                this.f239071g = true;
            }
        }
        if (contentValues.containsKey("message_slotid")) {
            this.field_message_slotid = contentValues.getAsLong("message_slotid").longValue();
            if (z17) {
                this.f239072h = true;
            }
        }
        if (contentValues.containsKey("message_op_time")) {
            this.field_message_op_time = contentValues.getAsLong("message_op_time").longValue();
            if (z17) {
                this.f239073i = true;
            }
        }
        if (contentValues.containsKey("message_traceid")) {
            this.field_message_traceid = contentValues.getAsString("message_traceid");
            if (z17) {
                this.f239074m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
