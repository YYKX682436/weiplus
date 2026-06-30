package dm;

/* loaded from: classes4.dex */
public class d8 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f236399h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f236400i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f236401m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f236402n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f236403o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f236404p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f236405q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f236406r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f236407s;
    public java.lang.String field_chat_room_id;
    public java.lang.String field_cluster_history_data;
    public java.lang.String field_last_image_path;
    public long field_timestamp;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236408d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236409e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236410f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236411g = true;

    static {
        p75.n0 n0Var = new p75.n0("MsgQueryHistoryInfo");
        f236399h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236400i = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS MsgQueryHistoryInfo_Room_Id ON MsgQueryHistoryInfo(chat_room_id)"};
        f236401m = 339796248;
        f236402n = 164789714;
        f236403o = -1232839014;
        f236404p = 55126294;
        f236405q = 108705909;
        f236406r = initAutoDBInfo(dm.d8.class);
        f236407s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "chat_room_id";
        e0Var.f316955d.put("chat_room_id", "TEXT");
        e0Var.f316954c[1] = "last_image_path";
        e0Var.f316955d.put("last_image_path", "TEXT");
        e0Var.f316954c[2] = "cluster_history_data";
        e0Var.f316955d.put("cluster_history_data", "TEXT");
        e0Var.f316954c[3] = com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP;
        e0Var.f316955d.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "LONG");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " chat_room_id TEXT,  last_image_path TEXT,  cluster_history_data TEXT,  timestamp LONG";
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
            if (f236401m == hashCode) {
                try {
                    this.field_chat_room_id = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQueryHistoryInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236402n == hashCode) {
                try {
                    this.field_last_image_path = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQueryHistoryInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236403o == hashCode) {
                try {
                    this.field_cluster_history_data = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQueryHistoryInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236404p == hashCode) {
                try {
                    this.field_timestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMsgQueryHistoryInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236405q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236408d) {
            contentValues.put("chat_room_id", this.field_chat_room_id);
        }
        if (this.f236409e) {
            contentValues.put("last_image_path", this.field_last_image_path);
        }
        if (this.f236410f) {
            contentValues.put("cluster_history_data", this.field_cluster_history_data);
        }
        if (this.f236411g) {
            contentValues.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(this.field_timestamp));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMsgQueryHistoryInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MsgQueryHistoryInfo ( ");
        l75.e0 e0Var = f236406r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236400i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMsgQueryHistoryInfo", "createTableSql %s", str2);
            k0Var.A("MsgQueryHistoryInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "MsgQueryHistoryInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMsgQueryHistoryInfo", "updateTableSql %s", str3);
            k0Var.A("MsgQueryHistoryInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMsgQueryHistoryInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236406r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236407s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236399h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236399h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("chat_room_id")) {
            this.field_chat_room_id = contentValues.getAsString("chat_room_id");
            if (z17) {
                this.f236408d = true;
            }
        }
        if (contentValues.containsKey("last_image_path")) {
            this.field_last_image_path = contentValues.getAsString("last_image_path");
            if (z17) {
                this.f236409e = true;
            }
        }
        if (contentValues.containsKey("cluster_history_data")) {
            this.field_cluster_history_data = contentValues.getAsString("cluster_history_data");
            if (z17) {
                this.f236410f = true;
            }
        }
        if (contentValues.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP).longValue();
            if (z17) {
                this.f236411g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
