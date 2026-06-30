package dm;

/* loaded from: classes4.dex */
public class h2 extends l75.f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p75.n0 f237323f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f237324g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f237325h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f237326i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f237327m;

    /* renamed from: n, reason: collision with root package name */
    public static final l75.e0 f237328n;

    /* renamed from: o, reason: collision with root package name */
    public static final o75.e f237329o;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237330d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237331e = true;
    public java.lang.String field_contactName;
    public java.lang.String field_labelId;

    static {
        p75.n0 n0Var = new p75.n0("ContactLabelCache");
        f237323f = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237324g = new java.lang.String[0];
        f237325h = -63202513;
        f237326i = 40698571;
        f237327m = 108705909;
        f237328n = initAutoDBInfo(dm.h2.class);
        f237329o = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[2];
        java.lang.String[] strArr = new java.lang.String[3];
        e0Var.f316954c = strArr;
        strArr[0] = "labelId";
        e0Var.f316955d.put("labelId", "TEXT");
        e0Var.f316954c[1] = "contactName";
        e0Var.f316955d.put("contactName", "TEXT");
        e0Var.f316954c[2] = "rowid";
        e0Var.f316956e = " labelId TEXT,  contactName TEXT";
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
            if (f237325h == hashCode) {
                try {
                    this.field_labelId = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseContactLabelCache", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237326i == hashCode) {
                try {
                    this.field_contactName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseContactLabelCache", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237327m == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237330d) {
            contentValues.put("labelId", this.field_labelId);
        }
        if (this.f237331e) {
            contentValues.put("contactName", this.field_contactName);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseContactLabelCache", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ContactLabelCache ( ");
        l75.e0 e0Var = f237328n;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237324g) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseContactLabelCache", "createTableSql %s", str2);
            k0Var.A("ContactLabelCache", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ContactLabelCache", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseContactLabelCache", "updateTableSql %s", str3);
            k0Var.A("ContactLabelCache", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseContactLabelCache", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237328n;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237329o;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237323f;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237323f.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("labelId")) {
            this.field_labelId = contentValues.getAsString("labelId");
            if (z17) {
                this.f237330d = true;
            }
        }
        if (contentValues.containsKey("contactName")) {
            this.field_contactName = contentValues.getAsString("contactName");
            if (z17) {
                this.f237331e = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
