package dm;

/* loaded from: classes8.dex */
public class m5 extends l75.f0 {
    public static final o75.e A;

    /* renamed from: o, reason: collision with root package name */
    public static final p75.n0 f238457o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f238458p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f238459q;

    /* renamed from: r, reason: collision with root package name */
    public static final int f238460r;

    /* renamed from: s, reason: collision with root package name */
    public static final int f238461s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f238462t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f238463u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f238464v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f238465w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f238466x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f238467y;

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f238468z;
    public int field_accountType;
    public java.lang.String field_avatarURL;
    public v53.l field_jumpInfo;
    public java.lang.String field_nickname;
    public int field_sex;
    public java.lang.String field_tag;
    public long field_updateTime;
    public java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f238469d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238470e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f238471f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f238472g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f238473h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f238474i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f238475m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f238476n = true;

    static {
        p75.n0 n0Var = new p75.n0("GameLifeContact");
        f238457o = n0Var;
        java.lang.String tableName = n0Var.f352676a;
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f238458p = new java.lang.String[0];
        f238459q = -265713450;
        f238460r = 866168583;
        f238461s = 70690926;
        f238462t = -428647082;
        f238463u = 113766;
        f238464v = 114586;
        f238465w = -255654404;
        f238466x = -295931082;
        f238467y = 108705909;
        f238468z = initAutoDBInfo(dm.m5.class);
        A = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[8];
        java.lang.String[] strArr = new java.lang.String[9];
        e0Var.f316954c = strArr;
        strArr[0] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = dm.i4.COL_USERNAME;
        e0Var.f316954c[1] = "accountType";
        e0Var.f316955d.put("accountType", "INTEGER default '0' ");
        e0Var.f316954c[2] = "nickname";
        e0Var.f316955d.put("nickname", "TEXT default '' ");
        e0Var.f316954c[3] = "avatarURL";
        e0Var.f316955d.put("avatarURL", "TEXT default '' ");
        e0Var.f316954c[4] = "sex";
        e0Var.f316955d.put("sex", "INTEGER default '0' ");
        e0Var.f316954c[5] = "tag";
        e0Var.f316955d.put("tag", "TEXT default '' ");
        e0Var.f316954c[6] = "jumpInfo";
        e0Var.f316955d.put("jumpInfo", "BLOB");
        e0Var.f316954c[7] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[8] = "rowid";
        e0Var.f316956e = " username TEXT default ''  PRIMARY KEY ,  accountType INTEGER default '0' ,  nickname TEXT default '' ,  avatarURL TEXT default '' ,  sex INTEGER default '0' ,  tag TEXT default '' ,  jumpInfo BLOB,  updateTime LONG";
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
            if (f238459q == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                    this.f238469d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeContact", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238460r == hashCode) {
                try {
                    this.field_accountType = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeContact", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238461s == hashCode) {
                try {
                    this.field_nickname = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeContact", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238462t == hashCode) {
                try {
                    this.field_avatarURL = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeContact", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238463u == hashCode) {
                try {
                    this.field_sex = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeContact", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238464v == hashCode) {
                try {
                    this.field_tag = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeContact", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238465w == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_jumpInfo = (v53.l) new v53.l().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeContact", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238466x == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameLifeContact", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f238467y == hashCode) {
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
        if (this.f238469d) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f238470e) {
            contentValues.put("accountType", java.lang.Integer.valueOf(this.field_accountType));
        }
        if (this.field_nickname == null) {
            this.field_nickname = "";
        }
        if (this.f238471f) {
            contentValues.put("nickname", this.field_nickname);
        }
        if (this.field_avatarURL == null) {
            this.field_avatarURL = "";
        }
        if (this.f238472g) {
            contentValues.put("avatarURL", this.field_avatarURL);
        }
        if (this.f238473h) {
            contentValues.put("sex", java.lang.Integer.valueOf(this.field_sex));
        }
        if (this.field_tag == null) {
            this.field_tag = "";
        }
        if (this.f238474i) {
            contentValues.put("tag", this.field_tag);
        }
        if (this.f238475m) {
            v53.l lVar = this.field_jumpInfo;
            if (lVar != null) {
                try {
                    contentValues.put("jumpInfo", lVar.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameLifeContact", e17.getMessage());
                }
            } else {
                contentValues.put("jumpInfo", (byte[]) null);
            }
        }
        if (this.f238476n) {
            contentValues.put(dm.i4.COL_UPDATETIME, java.lang.Long.valueOf(this.field_updateTime));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameLifeContact", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameLifeContact ( ");
        l75.e0 e0Var = f238468z;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f238458p) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameLifeContact", "createTableSql %s", str2);
            k0Var.A("GameLifeContact", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GameLifeContact", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameLifeContact", "updateTableSql %s", str3);
            k0Var.A("GameLifeContact", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameLifeContact", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f238468z;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return A;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_username;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f238457o;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f238457o.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f238469d = true;
            }
        }
        if (contentValues.containsKey("accountType")) {
            this.field_accountType = contentValues.getAsInteger("accountType").intValue();
            if (z17) {
                this.f238470e = true;
            }
        }
        if (contentValues.containsKey("nickname")) {
            this.field_nickname = contentValues.getAsString("nickname");
            if (z17) {
                this.f238471f = true;
            }
        }
        if (contentValues.containsKey("avatarURL")) {
            this.field_avatarURL = contentValues.getAsString("avatarURL");
            if (z17) {
                this.f238472g = true;
            }
        }
        if (contentValues.containsKey("sex")) {
            this.field_sex = contentValues.getAsInteger("sex").intValue();
            if (z17) {
                this.f238473h = true;
            }
        }
        if (contentValues.containsKey("tag")) {
            this.field_tag = contentValues.getAsString("tag");
            if (z17) {
                this.f238474i = true;
            }
        }
        if (contentValues.containsKey("jumpInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("jumpInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_jumpInfo = (v53.l) new v53.l().parseFrom(asByteArray);
                    if (z17) {
                        this.f238475m = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameLifeContact", e17.getMessage());
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f238476n = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
