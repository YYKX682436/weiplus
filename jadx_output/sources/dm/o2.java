package dm;

/* loaded from: classes4.dex */
public class o2 extends l75.f0 {

    /* renamed from: h, reason: collision with root package name */
    public static final p75.n0 f238874h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f238875i;

    /* renamed from: m, reason: collision with root package name */
    public static final int f238876m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f238877n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f238878o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f238879p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238880q;

    /* renamed from: r, reason: collision with root package name */
    public static final l75.e0 f238881r;

    /* renamed from: s, reason: collision with root package name */
    public static final o75.e f238882s;
    public int field_ecsGiftRedLabelType;
    public int field_ecsUnhandledGiftCount;
    public long field_lastHandleEcsGiftTimeStampMs;
    public java.lang.String field_talker;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238883d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238884e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238885f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238886g = true;

    static {
        p75.n0 n0Var = new p75.n0("EcsConversationRecord");
        f238874h = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238875i = new java.lang.String[0];
        f238876m = -881080743;
        f238877n = -963934479;
        f238878o = -701703742;
        f238879p = 1336850069;
        f238880q = 108705909;
        f238881r = initAutoDBInfo(dm.o2.class);
        f238882s = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[4];
        java.lang.String[] strArr = new java.lang.String[5];
        e0Var.f316954c = strArr;
        strArr[0] = "talker";
        e0Var.f316955d.put("talker", "TEXT PRIMARY KEY ");
        e0Var.f316953b = "talker";
        e0Var.f316954c[1] = "ecsUnhandledGiftCount";
        e0Var.f316955d.put("ecsUnhandledGiftCount", "INTEGER");
        e0Var.f316954c[2] = "ecsGiftRedLabelType";
        e0Var.f316955d.put("ecsGiftRedLabelType", "INTEGER");
        e0Var.f316954c[3] = "lastHandleEcsGiftTimeStampMs";
        e0Var.f316955d.put("lastHandleEcsGiftTimeStampMs", "LONG");
        e0Var.f316954c[4] = "rowid";
        e0Var.f316956e = " talker TEXT PRIMARY KEY ,  ecsUnhandledGiftCount INTEGER,  ecsGiftRedLabelType INTEGER,  lastHandleEcsGiftTimeStampMs LONG";
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
            if (f238876m == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                    this.f238883d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEcsConversationRecord", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238877n == hashCode) {
                try {
                    this.field_ecsUnhandledGiftCount = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEcsConversationRecord", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238878o == hashCode) {
                try {
                    this.field_ecsGiftRedLabelType = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEcsConversationRecord", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238879p == hashCode) {
                try {
                    this.field_lastHandleEcsGiftTimeStampMs = cursor.getLong(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseEcsConversationRecord", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238880q == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f238883d) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f238884e) {
            contentValues.put("ecsUnhandledGiftCount", java.lang.Integer.valueOf(this.field_ecsUnhandledGiftCount));
        }
        if (this.f238885f) {
            contentValues.put("ecsGiftRedLabelType", java.lang.Integer.valueOf(this.field_ecsGiftRedLabelType));
        }
        if (this.f238886g) {
            contentValues.put("lastHandleEcsGiftTimeStampMs", java.lang.Long.valueOf(this.field_lastHandleEcsGiftTimeStampMs));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseEcsConversationRecord", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS EcsConversationRecord ( ");
        l75.e0 e0Var = f238881r;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238875i) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEcsConversationRecord", "createTableSql %s", str2);
            k0Var.A("EcsConversationRecord", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "EcsConversationRecord", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEcsConversationRecord", "updateTableSql %s", str3);
            k0Var.A("EcsConversationRecord", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseEcsConversationRecord", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238881r;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f238882s;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_talker;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238874h;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238874h.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f238883d = true;
            }
        }
        if (contentValues.containsKey("ecsUnhandledGiftCount")) {
            this.field_ecsUnhandledGiftCount = contentValues.getAsInteger("ecsUnhandledGiftCount").intValue();
            if (z17) {
                this.f238884e = true;
            }
        }
        if (contentValues.containsKey("ecsGiftRedLabelType")) {
            this.field_ecsGiftRedLabelType = contentValues.getAsInteger("ecsGiftRedLabelType").intValue();
            if (z17) {
                this.f238885f = true;
            }
        }
        if (contentValues.containsKey("lastHandleEcsGiftTimeStampMs")) {
            this.field_lastHandleEcsGiftTimeStampMs = contentValues.getAsLong("lastHandleEcsGiftTimeStampMs").longValue();
            if (z17) {
                this.f238886g = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
