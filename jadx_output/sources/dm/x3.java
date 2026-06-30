package dm;

/* loaded from: classes7.dex */
public class x3 extends l75.f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final p75.n0 f241009m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String[] f241010n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f241011o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f241012p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f241013q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f241014r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f241015s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f241016t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f241017u;

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f241018v;

    /* renamed from: w, reason: collision with root package name */
    public static final o75.e f241019w;
    public int field_biz_type;
    public java.lang.String field_bypass_buffer;
    public r45.bf0 field_display_info;
    public long field_end_ts;
    public boolean field_report_only;
    public long field_start_ts;

    /* renamed from: d, reason: collision with root package name */
    public boolean f241020d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241021e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f241022f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f241023g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241024h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241025i = true;

    static {
        p75.n0 n0Var = new p75.n0("FinderCommEducationInfoItem");
        f241009m = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f241010n = new java.lang.String[0];
        f241011o = 1279393510;
        f241012p = 1316797308;
        f241013q = -1298761629;
        f241014r = -246701097;
        f241015s = 1614949899;
        f241016t = 959598455;
        f241017u = 108705909;
        f241018v = initAutoDBInfo(dm.x3.class);
        f241019w = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[6];
        java.lang.String[] strArr = new java.lang.String[7];
        e0Var.f316954c = strArr;
        strArr[0] = "biz_type";
        e0Var.f316955d.put("biz_type", "INTEGER PRIMARY KEY ");
        e0Var.f316953b = "biz_type";
        e0Var.f316954c[1] = "start_ts";
        e0Var.f316955d.put("start_ts", "LONG");
        e0Var.f316954c[2] = "end_ts";
        e0Var.f316955d.put("end_ts", "LONG");
        e0Var.f316954c[3] = "report_only";
        e0Var.f316955d.put("report_only", "INTEGER");
        e0Var.f316954c[4] = "display_info";
        e0Var.f316955d.put("display_info", "BLOB");
        e0Var.f316954c[5] = "bypass_buffer";
        e0Var.f316955d.put("bypass_buffer", "TEXT");
        e0Var.f316954c[6] = "rowid";
        e0Var.f316956e = " biz_type INTEGER PRIMARY KEY ,  start_ts LONG,  end_ts LONG,  report_only INTEGER,  display_info BLOB,  bypass_buffer TEXT";
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
            if (f241011o == hashCode) {
                try {
                    this.field_biz_type = cursor.getInt(i17);
                    this.f241020d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderCommEducationInfoItem", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241012p == hashCode) {
                try {
                    this.field_start_ts = cursor.getLong(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderCommEducationInfoItem", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241013q == hashCode) {
                try {
                    this.field_end_ts = cursor.getLong(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderCommEducationInfoItem", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241014r == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_report_only = z17;
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderCommEducationInfoItem", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241015s == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_display_info = (r45.bf0) new r45.bf0().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderCommEducationInfoItem", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241016t == hashCode) {
                try {
                    this.field_bypass_buffer = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderCommEducationInfoItem", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f241017u == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f241020d) {
            contentValues.put("biz_type", java.lang.Integer.valueOf(this.field_biz_type));
        }
        if (this.f241021e) {
            contentValues.put("start_ts", java.lang.Long.valueOf(this.field_start_ts));
        }
        if (this.f241022f) {
            contentValues.put("end_ts", java.lang.Long.valueOf(this.field_end_ts));
        }
        if (this.f241023g) {
            if (this.field_report_only) {
                contentValues.put("report_only", (java.lang.Integer) 1);
            } else {
                contentValues.put("report_only", (java.lang.Integer) 0);
            }
        }
        if (this.f241024h) {
            r45.bf0 bf0Var = this.field_display_info;
            if (bf0Var != null) {
                try {
                    contentValues.put("display_info", bf0Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderCommEducationInfoItem", e17.getMessage());
                }
            } else {
                contentValues.put("display_info", (byte[]) null);
            }
        }
        if (this.f241025i) {
            contentValues.put("bypass_buffer", this.field_bypass_buffer);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderCommEducationInfoItem", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderCommEducationInfoItem ( ");
        l75.e0 e0Var = f241018v;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f241010n) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderCommEducationInfoItem", "createTableSql %s", str2);
            k0Var.A("FinderCommEducationInfoItem", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderCommEducationInfoItem", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderCommEducationInfoItem", "updateTableSql %s", str3);
            k0Var.A("FinderCommEducationInfoItem", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderCommEducationInfoItem", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f241018v;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f241019w;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Integer.valueOf(this.field_biz_type);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f241009m;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f241009m.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("biz_type")) {
            this.field_biz_type = contentValues.getAsInteger("biz_type").intValue();
            if (z17) {
                this.f241020d = true;
            }
        }
        if (contentValues.containsKey("start_ts")) {
            this.field_start_ts = contentValues.getAsLong("start_ts").longValue();
            if (z17) {
                this.f241021e = true;
            }
        }
        if (contentValues.containsKey("end_ts")) {
            this.field_end_ts = contentValues.getAsLong("end_ts").longValue();
            if (z17) {
                this.f241022f = true;
            }
        }
        if (contentValues.containsKey("report_only")) {
            this.field_report_only = contentValues.getAsInteger("report_only").intValue() != 0;
            if (z17) {
                this.f241023g = true;
            }
        }
        if (contentValues.containsKey("display_info")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("display_info");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_display_info = (r45.bf0) new r45.bf0().parseFrom(asByteArray);
                    if (z17) {
                        this.f241024h = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderCommEducationInfoItem", e17.getMessage());
            }
        }
        if (contentValues.containsKey("bypass_buffer")) {
            this.field_bypass_buffer = contentValues.getAsString("bypass_buffer");
            if (z17) {
                this.f241025i = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
