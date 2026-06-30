package dm;

/* loaded from: classes8.dex */
public class b4 extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f235838g;

    /* renamed from: h, reason: collision with root package name */
    public static final p75.d f235839h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f235840i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f235841m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f235842n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f235843o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f235844p;

    /* renamed from: q, reason: collision with root package name */
    public static final l75.e0 f235845q;

    /* renamed from: r, reason: collision with root package name */
    public static final o75.e f235846r;

    /* renamed from: d, reason: collision with root package name */
    public boolean f235847d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f235848e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f235849f = true;
    public r45.uz0 field_courseInfo;
    public r45.n11 field_dramaInfo;
    public long field_topic_id;

    static {
        p75.n0 n0Var = new p75.n0("FinderCourseInfo");
        f235838g = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235839h = new p75.d("topic_id", "long", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f235840i = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS FinderCourseInfo_index ON FinderCourseInfo(topic_id)"};
        f235841m = -957291989;
        f235842n = -1804455063;
        f235843o = -138950731;
        f235844p = 108705909;
        f235845q = initAutoDBInfo(dm.b4.class);
        f235846r = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[3];
        java.lang.String[] strArr = new java.lang.String[4];
        e0Var.f316954c = strArr;
        strArr[0] = "topic_id";
        e0Var.f316955d.put("topic_id", "LONG PRIMARY KEY ");
        e0Var.f316953b = "topic_id";
        e0Var.f316954c[1] = "courseInfo";
        e0Var.f316955d.put("courseInfo", "BLOB");
        e0Var.f316954c[2] = "dramaInfo";
        e0Var.f316955d.put("dramaInfo", "BLOB");
        e0Var.f316954c[3] = "rowid";
        e0Var.f316956e = " topic_id LONG PRIMARY KEY ,  courseInfo BLOB,  dramaInfo BLOB";
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
            if (f235841m == hashCode) {
                try {
                    this.field_topic_id = cursor.getLong(i17);
                    this.f235847d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderCourseInfo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235842n == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_courseInfo = (r45.uz0) new r45.uz0().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderCourseInfo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235843o == hashCode) {
                try {
                    byte[] blob2 = cursor.getBlob(i17);
                    if (blob2 != null && blob2.length > 0) {
                        this.field_dramaInfo = (r45.n11) new r45.n11().parseFrom(blob2);
                    }
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseFinderCourseInfo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f235844p == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f235847d) {
            contentValues.put("topic_id", java.lang.Long.valueOf(this.field_topic_id));
        }
        if (this.f235848e) {
            r45.uz0 uz0Var = this.field_courseInfo;
            if (uz0Var != null) {
                try {
                    contentValues.put("courseInfo", uz0Var.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderCourseInfo", e17.getMessage());
                }
            } else {
                contentValues.put("courseInfo", (byte[]) null);
            }
        }
        if (this.f235849f) {
            r45.n11 n11Var = this.field_dramaInfo;
            if (n11Var != null) {
                try {
                    contentValues.put("dramaInfo", n11Var.toByteArray());
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderCourseInfo", e18.getMessage());
                }
            } else {
                contentValues.put("dramaInfo", (byte[]) null);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderCourseInfo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS FinderCourseInfo ( ");
        l75.e0 e0Var = f235845q;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f235840i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderCourseInfo", "createTableSql %s", str2);
            k0Var.A("FinderCourseInfo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "FinderCourseInfo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderCourseInfo", "updateTableSql %s", str3);
            k0Var.A("FinderCourseInfo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseFinderCourseInfo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f235845q;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f235846r;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.field_topic_id);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f235838g;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f235838g.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("topic_id")) {
            this.field_topic_id = contentValues.getAsLong("topic_id").longValue();
            if (z17) {
                this.f235847d = true;
            }
        }
        if (contentValues.containsKey("courseInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("courseInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_courseInfo = (r45.uz0) new r45.uz0().parseFrom(asByteArray);
                    if (z17) {
                        this.f235848e = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderCourseInfo", e17.getMessage());
            }
        }
        if (contentValues.containsKey("dramaInfo")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("dramaInfo");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_dramaInfo = (r45.n11) new r45.n11().parseFrom(asByteArray2);
                    if (z17) {
                        this.f235849f = true;
                    }
                }
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseFinderCourseInfo", e18.getMessage());
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
