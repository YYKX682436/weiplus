package dm;

/* loaded from: classes7.dex */
public class g8 extends l75.f0 {

    /* renamed from: n, reason: collision with root package name */
    public static final p75.n0 f237155n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String[] f237156o;

    /* renamed from: p, reason: collision with root package name */
    public static final int f237157p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f237158q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f237159r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f237160s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f237161t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f237162u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f237163v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f237164w;

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f237165x;

    /* renamed from: y, reason: collision with root package name */
    public static final o75.e f237166y;
    public long field_createTime;
    public java.lang.String field_inviteUserName;
    public long field_memberId;
    public long field_memberUuid;
    public int field_status;
    public java.lang.String field_userName;
    public java.lang.String field_wxGroupId;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237167d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237168e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237169f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237170g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237171h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237172i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237173m = true;

    static {
        p75.n0 n0Var = new p75.n0("MultiTalkMember");
        f237155n = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237156o = new java.lang.String[0];
        f237157p = -1341123211;
        f237158q = 303207897;
        f237159r = -266666762;
        f237160s = -500140257;
        f237161t = -649439915;
        f237162u = -892481550;
        f237163v = 1369213417;
        f237164w = 108705909;
        f237165x = initAutoDBInfo(dm.g8.class);
        f237166y = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[7];
        java.lang.String[] strArr = new java.lang.String[8];
        e0Var.f316954c = strArr;
        strArr[0] = "memberUuid";
        e0Var.f316955d.put("memberUuid", "LONG");
        e0Var.f316954c[1] = "wxGroupId";
        e0Var.f316955d.put("wxGroupId", "TEXT");
        e0Var.f316954c[2] = "userName";
        e0Var.f316955d.put("userName", "TEXT");
        e0Var.f316954c[3] = "inviteUserName";
        e0Var.f316955d.put("inviteUserName", "TEXT");
        e0Var.f316954c[4] = "memberId";
        e0Var.f316955d.put("memberId", "LONG");
        e0Var.f316954c[5] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[6] = "createTime";
        e0Var.f316955d.put("createTime", "LONG");
        e0Var.f316954c[7] = "rowid";
        e0Var.f316956e = " memberUuid LONG,  wxGroupId TEXT,  userName TEXT,  inviteUserName TEXT,  memberId LONG,  status INTEGER,  createTime LONG";
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
            if (f237157p == hashCode) {
                try {
                    this.field_memberUuid = cursor.getLong(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkMember", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237158q == hashCode) {
                try {
                    this.field_wxGroupId = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkMember", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237159r == hashCode) {
                try {
                    this.field_userName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkMember", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237160s == hashCode) {
                try {
                    this.field_inviteUserName = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkMember", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237161t == hashCode) {
                try {
                    this.field_memberId = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkMember", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237162u == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkMember", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237163v == hashCode) {
                try {
                    this.field_createTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseMultiTalkMember", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237164w == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f237167d) {
            contentValues.put("memberUuid", java.lang.Long.valueOf(this.field_memberUuid));
        }
        if (this.f237168e) {
            contentValues.put("wxGroupId", this.field_wxGroupId);
        }
        if (this.f237169f) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.f237170g) {
            contentValues.put("inviteUserName", this.field_inviteUserName);
        }
        if (this.f237171h) {
            contentValues.put("memberId", java.lang.Long.valueOf(this.field_memberId));
        }
        if (this.f237172i) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f237173m) {
            contentValues.put("createTime", java.lang.Long.valueOf(this.field_createTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseMultiTalkMember", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS MultiTalkMember ( ");
        l75.e0 e0Var = f237165x;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237156o) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMultiTalkMember", "createTableSql %s", str2);
            k0Var.A("MultiTalkMember", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "MultiTalkMember", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMultiTalkMember", "updateTableSql %s", str3);
            k0Var.A("MultiTalkMember", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseMultiTalkMember", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f237165x;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return f237166y;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237155n;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237155n.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("memberUuid")) {
            this.field_memberUuid = contentValues.getAsLong("memberUuid").longValue();
            if (z17) {
                this.f237167d = true;
            }
        }
        if (contentValues.containsKey("wxGroupId")) {
            this.field_wxGroupId = contentValues.getAsString("wxGroupId");
            if (z17) {
                this.f237168e = true;
            }
        }
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z17) {
                this.f237169f = true;
            }
        }
        if (contentValues.containsKey("inviteUserName")) {
            this.field_inviteUserName = contentValues.getAsString("inviteUserName");
            if (z17) {
                this.f237170g = true;
            }
        }
        if (contentValues.containsKey("memberId")) {
            this.field_memberId = contentValues.getAsLong("memberId").longValue();
            if (z17) {
                this.f237171h = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f237172i = true;
            }
        }
        if (contentValues.containsKey("createTime")) {
            this.field_createTime = contentValues.getAsLong("createTime").longValue();
            if (z17) {
                this.f237173m = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
