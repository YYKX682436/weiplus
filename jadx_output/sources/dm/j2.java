package dm;

/* loaded from: classes4.dex */
public class j2 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f237743h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f237744i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237745m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f237746n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f237747o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237748p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237749q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f237750r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f237751s;
    public java.lang.String field_chat_room_id;
    public java.lang.String field_crop_image_path;
    public java.lang.String field_label_id;
    public java.lang.String field_origin_image_path;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237752d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237753e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237754f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237755g = true;

    static {
        p75.n0 n0Var = new p75.n0("CropCenterLabelInfo");
        f237743h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237744i = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS CropCenterLabelInfo_Room_Id ON CropCenterLabelInfo(chat_room_id)"};
        f237745m = 339796248;
        f237746n = -1959256506;
        f237747o = 134444440;
        f237748p = 885450562;
        f237749q = 108705909;
        f237750r = initAutoDBInfo(dm.j2.class);
        f237751s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "chat_room_id";
        e0Var.f316955d.put("chat_room_id", "TEXT");
        e0Var.f316954c[1] = "label_id";
        e0Var.f316955d.put("label_id", "TEXT");
        e0Var.f316954c[2] = "crop_image_path";
        e0Var.f316955d.put("crop_image_path", "TEXT");
        e0Var.f316954c[3] = "origin_image_path";
        e0Var.f316955d.put("origin_image_path", "TEXT");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " chat_room_id TEXT,  label_id TEXT,  crop_image_path TEXT,  origin_image_path TEXT";
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
            if (f237745m == hashCode) {
                try {
                    this.field_chat_room_id = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCropCenterLabelInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237746n == hashCode) {
                try {
                    this.field_label_id = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCropCenterLabelInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237747o == hashCode) {
                try {
                    this.field_crop_image_path = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCropCenterLabelInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237748p == hashCode) {
                try {
                    this.field_origin_image_path = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseCropCenterLabelInfo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237749q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237752d) {
            contentValues.put("chat_room_id", this.field_chat_room_id);
        }
        if (this.f237753e) {
            contentValues.put("label_id", this.field_label_id);
        }
        if (this.f237754f) {
            contentValues.put("crop_image_path", this.field_crop_image_path);
        }
        if (this.f237755g) {
            contentValues.put("origin_image_path", this.field_origin_image_path);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseCropCenterLabelInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS CropCenterLabelInfo ( ");
        l75.e0 e0Var = f237750r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237744i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCropCenterLabelInfo", "createTableSql %s", str2);
            k0Var.A("CropCenterLabelInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "CropCenterLabelInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCropCenterLabelInfo", "updateTableSql %s", str3);
            k0Var.A("CropCenterLabelInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseCropCenterLabelInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237750r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237751s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237743h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237743h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("chat_room_id")) {
            this.field_chat_room_id = contentValues.getAsString("chat_room_id");
            if (z17) {
                this.f237752d = true;
            }
        }
        if (contentValues.containsKey("label_id")) {
            this.field_label_id = contentValues.getAsString("label_id");
            if (z17) {
                this.f237753e = true;
            }
        }
        if (contentValues.containsKey("crop_image_path")) {
            this.field_crop_image_path = contentValues.getAsString("crop_image_path");
            if (z17) {
                this.f237754f = true;
            }
        }
        if (contentValues.containsKey("origin_image_path")) {
            this.field_origin_image_path = contentValues.getAsString("origin_image_path");
            if (z17) {
                this.f237755g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
