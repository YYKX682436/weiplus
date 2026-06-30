package dm;

/* loaded from: classes4.dex */
public class f2 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f236795g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f236796h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f236797i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f236798m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f236799n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f236800o;

    /* renamed from: p, reason: collision with root package name */
    public static final l75.e0 f236801p;

    /* renamed from: q, reason: collision with root package name */
    public static final o75.e f236802q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236803d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236804e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236805f = true;
    public byte[] field_cmdbuf;
    public r45.hs0 field_fieldUpdateCtrlInfoList;
    public java.lang.String field_username;

    static {
        p75.n0 n0Var = new p75.n0("ContactCmdBuf");
        f236795g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236796h = new java.lang.String[0];
        f236797i = -265713450;
        f236798m = -1356940551;
        f236799n = -855734278;
        f236800o = 108705909;
        f236801p = initAutoDBInfo(dm.f2.class);
        f236802q = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_USERNAME;
        e0Var.f316954c[1] = "cmdbuf";
        e0Var.f316955d.put("cmdbuf", "BLOB default '' ");
        e0Var.f316954c[2] = "fieldUpdateCtrlInfoList";
        e0Var.f316955d.put("fieldUpdateCtrlInfoList", "BLOB");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " username TEXT default ''  PRIMARY KEY ,  cmdbuf BLOB default '' ,  fieldUpdateCtrlInfoList BLOB";
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
            if (f236797i == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                    this.f236803d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseContactCmdBuf", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236798m == hashCode) {
                try {
                    this.field_cmdbuf = cursor.getBlob(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseContactCmdBuf", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236799n == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_fieldUpdateCtrlInfoList = (r45.hs0) new r45.hs0().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseContactCmdBuf", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236800o == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_username == null) {
            this.field_username = "";
        }
        if (this.f236803d) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f236804e) {
            contentValues.put("cmdbuf", this.field_cmdbuf);
        }
        if (this.f236805f) {
            r45.hs0 hs0Var = this.field_fieldUpdateCtrlInfoList;
            if (hs0Var != null) {
                try {
                    contentValues.put("fieldUpdateCtrlInfoList", hs0Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseContactCmdBuf", e17.getMessage());
                }
            } else {
                contentValues.put("fieldUpdateCtrlInfoList", (byte[]) null);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseContactCmdBuf", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ContactCmdBuf ( ");
        l75.e0 e0Var = f236801p;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236796h) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseContactCmdBuf", "createTableSql %s", str2);
            k0Var.A("ContactCmdBuf", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ContactCmdBuf", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseContactCmdBuf", "updateTableSql %s", str3);
            k0Var.A("ContactCmdBuf", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseContactCmdBuf", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f236801p;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f236802q;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_username;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236795g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236795g.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, dm.i4.COL_USERNAME, this.field_username);
            n51.f.b(jSONObject, "cmdbuf", this.field_cmdbuf);
            n51.f.b(jSONObject, "fieldUpdateCtrlInfoList", this.field_fieldUpdateCtrlInfoList);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f236803d = true;
            }
        }
        if (contentValues.containsKey("cmdbuf")) {
            this.field_cmdbuf = contentValues.getAsByteArray("cmdbuf");
            if (z17) {
                this.f236804e = true;
            }
        }
        if (contentValues.containsKey("fieldUpdateCtrlInfoList")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("fieldUpdateCtrlInfoList");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_fieldUpdateCtrlInfoList = (r45.hs0) new r45.hs0().parseFrom(asByteArray);
                    if (z17) {
                        this.f236805f = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseContactCmdBuf", e17.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
