package dm;

/* loaded from: classes7.dex */
public class c6 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final l75.e0 F;
    public static final o75.e G;

    /* renamed from: p, reason: collision with root package name */
    public static final p75.n0 f236130p;

    /* renamed from: q, reason: collision with root package name */
    public static final p75.d f236131q;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.d f236132r;

    /* renamed from: s, reason: collision with root package name */
    public static final p75.d f236133s;

    /* renamed from: t, reason: collision with root package name */
    public static final p75.d f236134t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f236135u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236136v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236137w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f236138x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f236139y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f236140z;
    public int field_active;
    public java.lang.String field_content;
    public java.lang.String field_creator;
    public long field_firstMsgId;
    public java.lang.String field_key;
    public long field_lastActiveTime;
    public long field_msgSvrId;
    public int field_num;
    public java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236141d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236142e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236143f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236144g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236145h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236146i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236147m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236148n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236149o = true;

    static {
        p75.n0 n0Var = new p75.n0("GroupSolitatire");
        f236130p = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236131q = new p75.d(dm.i4.COL_USERNAME, "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236132r = new p75.d("creator", "string", tableName, "");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236133s = new p75.d("active", "int", tableName, "");
        f236134t = new p75.d("lastActiveTime", "long", tableName, "");
        f236135u = new java.lang.String[0];
        f236136v = -265713450;
        f236137w = 106079;
        f236138x = 951530617;
        f236139y = 1028554796;
        f236140z = 109446;
        A = -177455188;
        B = -1294411543;
        C = -1422950650;
        D = -2041905623;
        E = 108705909;
        F = initAutoDBInfo(dm.c6.class);
        G = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[9];
        java.lang.String[] strArr = new java.lang.String[10];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[1] = "key";
        e0Var.f316955d.put("key", "TEXT");
        e0Var.f316954c[2] = "content";
        e0Var.f316955d.put("content", "TEXT");
        e0Var.f316954c[3] = "creator";
        e0Var.f316955d.put("creator", "TEXT");
        e0Var.f316954c[4] = "num";
        e0Var.f316955d.put("num", "INTEGER");
        e0Var.f316954c[5] = "firstMsgId";
        e0Var.f316955d.put("firstMsgId", "LONG");
        e0Var.f316954c[6] = "msgSvrId";
        e0Var.f316955d.put("msgSvrId", "LONG");
        e0Var.f316954c[7] = "active";
        e0Var.f316955d.put("active", "INTEGER default '-1' ");
        e0Var.f316954c[8] = "lastActiveTime";
        e0Var.f316955d.put("lastActiveTime", "LONG");
        e0Var.f316954c[9] = "rowid";
        e0Var.f316956e = " username TEXT,  key TEXT,  content TEXT,  creator TEXT,  num INTEGER,  firstMsgId LONG,  msgSvrId LONG,  active INTEGER default '-1' ,  lastActiveTime LONG";
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
            if (f236136v == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236137w == hashCode) {
                try {
                    this.field_key = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236138x == hashCode) {
                try {
                    this.field_content = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236139y == hashCode) {
                try {
                    this.field_creator = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236140z == hashCode) {
                try {
                    this.field_num = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_firstMsgId = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_msgSvrId = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_active = cursor.getInt(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_lastActiveTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupSolitatire", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236141d) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f236142e) {
            contentValues.put("key", this.field_key);
        }
        if (this.f236143f) {
            contentValues.put("content", this.field_content);
        }
        if (this.f236144g) {
            contentValues.put("creator", this.field_creator);
        }
        if (this.f236145h) {
            contentValues.put("num", java.lang.Integer.valueOf(this.field_num));
        }
        if (this.f236146i) {
            contentValues.put("firstMsgId", java.lang.Long.valueOf(this.field_firstMsgId));
        }
        if (this.f236147m) {
            contentValues.put("msgSvrId", java.lang.Long.valueOf(this.field_msgSvrId));
        }
        if (this.f236148n) {
            contentValues.put("active", java.lang.Integer.valueOf(this.field_active));
        }
        if (this.f236149o) {
            contentValues.put("lastActiveTime", java.lang.Long.valueOf(this.field_lastActiveTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGroupSolitatire", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GroupSolitatire ( ");
        l75.e0 e0Var = F;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236135u) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGroupSolitatire", "createTableSql %s", str2);
            k0Var.A("GroupSolitatire", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GroupSolitatire", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGroupSolitatire", "updateTableSql %s", str3);
            k0Var.A("GroupSolitatire", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGroupSolitatire", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return F;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return G;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236130p;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236130p.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f236141d = true;
            }
        }
        if (contentValues.containsKey("key")) {
            this.field_key = contentValues.getAsString("key");
            if (z17) {
                this.f236142e = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z17) {
                this.f236143f = true;
            }
        }
        if (contentValues.containsKey("creator")) {
            this.field_creator = contentValues.getAsString("creator");
            if (z17) {
                this.f236144g = true;
            }
        }
        if (contentValues.containsKey("num")) {
            this.field_num = contentValues.getAsInteger("num").intValue();
            if (z17) {
                this.f236145h = true;
            }
        }
        if (contentValues.containsKey("firstMsgId")) {
            this.field_firstMsgId = contentValues.getAsLong("firstMsgId").longValue();
            if (z17) {
                this.f236146i = true;
            }
        }
        if (contentValues.containsKey("msgSvrId")) {
            this.field_msgSvrId = contentValues.getAsLong("msgSvrId").longValue();
            if (z17) {
                this.f236147m = true;
            }
        }
        if (contentValues.containsKey("active")) {
            this.field_active = contentValues.getAsInteger("active").intValue();
            if (z17) {
                this.f236148n = true;
            }
        }
        if (contentValues.containsKey("lastActiveTime")) {
            this.field_lastActiveTime = contentValues.getAsLong("lastActiveTime").longValue();
            if (z17) {
                this.f236149o = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
