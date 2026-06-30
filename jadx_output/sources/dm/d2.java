package dm;

/* loaded from: classes4.dex */
public class d2 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final l75.e0 C;
    public static final o75.e D;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f236309p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f236310q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String[] f236311r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f236312s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236313t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236314u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236315v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236316w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f236317x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f236318y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f236319z;
    public java.lang.String field_chat_room_id;
    public java.lang.String field_crop_label_id;
    public java.lang.String field_hd_image_path;
    public java.lang.String field_is_recognize;
    public java.lang.String field_label_id;
    public long field_msg_id;
    public java.lang.String field_ocr_result;
    public java.lang.String field_origin_image_path;
    public long field_timestamp;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236320d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236321e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236322f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236323g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236324h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236325i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236326m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236327n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236328o = true;

    static {
        p75.n0 n0Var = new p75.n0("ClsLabelInfo");
        f236309p = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236310q = new p75.d(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236311r = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS ClsLabelInfo_Room_Id ON ClsLabelInfo(chat_room_id)", "CREATE INDEX IF NOT EXISTS ClsLabelInfo_Is_Rec ON ClsLabelInfo(is_recognize)"};
        f236312s = 339796248;
        f236313t = -1065021799;
        f236314u = -1959256506;
        f236315v = -1448118507;
        f236316w = -296568226;
        f236317x = 55126294;
        f236318y = -780359764;
        f236319z = 885450562;
        A = -327408711;
        B = 108705909;
        C = initAutoDBInfo(dm.d2.class);
        D = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = "chat_room_id";
        e0Var.f316955d.put("chat_room_id", "TEXT");
        e0Var.f316954c[1] = "msg_id";
        e0Var.f316955d.put("msg_id", "LONG");
        e0Var.f316954c[2] = "label_id";
        e0Var.f316955d.put("label_id", "TEXT default '' ");
        e0Var.f316954c[3] = "crop_label_id";
        e0Var.f316955d.put("crop_label_id", "TEXT default '' ");
        e0Var.f316954c[4] = "ocr_result";
        e0Var.f316955d.put("ocr_result", "TEXT default '' ");
        e0Var.f316954c[5] = com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP;
        e0Var.f316955d.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "LONG");
        e0Var.f316954c[6] = "hd_image_path";
        e0Var.f316955d.put("hd_image_path", "TEXT");
        e0Var.f316954c[7] = "origin_image_path";
        e0Var.f316955d.put("origin_image_path", "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = "origin_image_path";
        e0Var.f316954c[8] = "is_recognize";
        e0Var.f316955d.put("is_recognize", "TEXT");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " chat_room_id TEXT,  msg_id LONG,  label_id TEXT default '' ,  crop_label_id TEXT default '' ,  ocr_result TEXT default '' ,  timestamp LONG,  hd_image_path TEXT,  origin_image_path TEXT default ''  PRIMARY KEY ,  is_recognize TEXT";
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
            if (f236312s == hashCode) {
                try {
                    this.field_chat_room_id = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236313t == hashCode) {
                try {
                    this.field_msg_id = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236314u == hashCode) {
                try {
                    this.field_label_id = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236315v == hashCode) {
                try {
                    this.field_crop_label_id = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236316w == hashCode) {
                try {
                    this.field_ocr_result = cursor.getString(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236317x == hashCode) {
                try {
                    this.field_timestamp = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236318y == hashCode) {
                try {
                    this.field_hd_image_path = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236319z == hashCode) {
                try {
                    this.field_origin_image_path = cursor.getString(i17);
                    this.f236327n = true;
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_is_recognize = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseClsLabelInfo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236320d) {
            contentValues.put("chat_room_id", this.field_chat_room_id);
        }
        if (this.f236321e) {
            contentValues.put("msg_id", java.lang.Long.valueOf(this.field_msg_id));
        }
        if (this.field_label_id == null) {
            this.field_label_id = "";
        }
        if (this.f236322f) {
            contentValues.put("label_id", this.field_label_id);
        }
        if (this.field_crop_label_id == null) {
            this.field_crop_label_id = "";
        }
        if (this.f236323g) {
            contentValues.put("crop_label_id", this.field_crop_label_id);
        }
        if (this.field_ocr_result == null) {
            this.field_ocr_result = "";
        }
        if (this.f236324h) {
            contentValues.put("ocr_result", this.field_ocr_result);
        }
        if (this.f236325i) {
            contentValues.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(this.field_timestamp));
        }
        if (this.f236326m) {
            contentValues.put("hd_image_path", this.field_hd_image_path);
        }
        if (this.field_origin_image_path == null) {
            this.field_origin_image_path = "";
        }
        if (this.f236327n) {
            contentValues.put("origin_image_path", this.field_origin_image_path);
        }
        if (this.f236328o) {
            contentValues.put("is_recognize", this.field_is_recognize);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseClsLabelInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ClsLabelInfo ( ");
        l75.e0 e0Var = C;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236311r) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseClsLabelInfo", "createTableSql %s", str2);
            k0Var.A("ClsLabelInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ClsLabelInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseClsLabelInfo", "updateTableSql %s", str3);
            k0Var.A("ClsLabelInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseClsLabelInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return C;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return D;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_origin_image_path;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236309p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236309p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("chat_room_id")) {
            this.field_chat_room_id = contentValues.getAsString("chat_room_id");
            if (z17) {
                this.f236320d = true;
            }
        }
        if (contentValues.containsKey("msg_id")) {
            this.field_msg_id = contentValues.getAsLong("msg_id").longValue();
            if (z17) {
                this.f236321e = true;
            }
        }
        if (contentValues.containsKey("label_id")) {
            this.field_label_id = contentValues.getAsString("label_id");
            if (z17) {
                this.f236322f = true;
            }
        }
        if (contentValues.containsKey("crop_label_id")) {
            this.field_crop_label_id = contentValues.getAsString("crop_label_id");
            if (z17) {
                this.f236323g = true;
            }
        }
        if (contentValues.containsKey("ocr_result")) {
            this.field_ocr_result = contentValues.getAsString("ocr_result");
            if (z17) {
                this.f236324h = true;
            }
        }
        if (contentValues.containsKey(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP)) {
            this.field_timestamp = contentValues.getAsLong(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP).longValue();
            if (z17) {
                this.f236325i = true;
            }
        }
        if (contentValues.containsKey("hd_image_path")) {
            this.field_hd_image_path = contentValues.getAsString("hd_image_path");
            if (z17) {
                this.f236326m = true;
            }
        }
        if (contentValues.containsKey("origin_image_path")) {
            this.field_origin_image_path = contentValues.getAsString("origin_image_path");
            if (z17) {
                this.f236327n = true;
            }
        }
        if (contentValues.containsKey("is_recognize")) {
            this.field_is_recognize = contentValues.getAsString("is_recognize");
            if (z17) {
                this.f236328o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
