package dm;

/* loaded from: classes11.dex */
public class fa extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final l75.e0 F;
    public static final o75.e G;

    /* renamed from: r, reason: collision with root package name */
    public static final p75.n0 f236917r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String[] f236918s;

    /* renamed from: t, reason: collision with root package name */
    public static final int f236919t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f236920u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f236921v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f236922w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f236923x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f236924y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f236925z;
    public java.lang.String field_content;
    public long field_createtime;
    public java.lang.String field_imgpath;
    public int field_isSend;
    public java.lang.String field_sayhicontent;
    public java.lang.String field_sayhiuser;
    public int field_scene;
    public int field_status;
    public long field_svrid;
    public java.lang.String field_talker;
    public int field_type;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236926d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236927e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236928f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236929g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236930h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236931i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236932m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236933n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236934o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f236935p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f236936q = true;

    static {
        p75.n0 n0Var = new p75.n0("ShakeVerifyMessage");
        f236917r = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236918s = new java.lang.String[0];
        f236919t = 109833162;
        f236920u = -892481550;
        f236921v = 3575610;
        f236922w = 109254796;
        f236923x = 1370166729;
        f236924y = -881080743;
        f236925z = 951530617;
        A = -1353158665;
        B = 1712009421;
        C = 1917739624;
        D = -1180128302;
        E = 108705909;
        F = initAutoDBInfo(dm.fa.class);
        G = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[11];
        java.lang.String[] strArr = new java.lang.String[12];
        e0Var.f316954c = strArr;
        strArr[0] = "svrid";
        e0Var.f316955d.put("svrid", "LONG default '0'  PRIMARY KEY ");
        e0Var.f316953b = "svrid";
        e0Var.f316954c[1] = "status";
        e0Var.f316955d.put("status", "INTEGER");
        e0Var.f316954c[2] = "type";
        e0Var.f316955d.put("type", "INTEGER");
        e0Var.f316954c[3] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE;
        e0Var.f316955d.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "INTEGER");
        e0Var.f316954c[4] = "createtime";
        e0Var.f316955d.put("createtime", "LONG");
        e0Var.f316954c[5] = "talker";
        e0Var.f316955d.put("talker", "TEXT");
        e0Var.f316954c[6] = "content";
        e0Var.f316955d.put("content", "TEXT");
        e0Var.f316954c[7] = "sayhiuser";
        e0Var.f316955d.put("sayhiuser", "TEXT");
        e0Var.f316954c[8] = "sayhicontent";
        e0Var.f316955d.put("sayhicontent", "TEXT");
        e0Var.f316954c[9] = "imgpath";
        e0Var.f316955d.put("imgpath", "TEXT");
        e0Var.f316954c[10] = "isSend";
        e0Var.f316955d.put("isSend", "INTEGER");
        e0Var.f316954c[11] = "rowid";
        e0Var.f316956e = " svrid LONG default '0'  PRIMARY KEY ,  status INTEGER,  type INTEGER,  scene INTEGER,  createtime LONG,  talker TEXT,  content TEXT,  sayhiuser TEXT,  sayhicontent TEXT,  imgpath TEXT,  isSend INTEGER";
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
            if (f236919t == hashCode) {
                try {
                    this.field_svrid = cursor.getLong(i17);
                    this.f236926d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236920u == hashCode) {
                try {
                    this.field_status = cursor.getInt(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236921v == hashCode) {
                try {
                    this.field_type = cursor.getInt(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236922w == hashCode) {
                try {
                    this.field_scene = cursor.getInt(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236923x == hashCode) {
                try {
                    this.field_createtime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236924y == hashCode) {
                try {
                    this.field_talker = cursor.getString(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236925z == hashCode) {
                try {
                    this.field_content = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_sayhiuser = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_sayhicontent = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_imgpath = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_isSend = cursor.getInt(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseShakeVerifyMessage", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236926d) {
            contentValues.put("svrid", java.lang.Long.valueOf(this.field_svrid));
        }
        if (this.f236927e) {
            contentValues.put("status", java.lang.Integer.valueOf(this.field_status));
        }
        if (this.f236928f) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if (this.f236929g) {
            contentValues.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
        }
        if (this.f236930h) {
            contentValues.put("createtime", java.lang.Long.valueOf(this.field_createtime));
        }
        if (this.f236931i) {
            contentValues.put("talker", this.field_talker);
        }
        if (this.f236932m) {
            contentValues.put("content", this.field_content);
        }
        if (this.f236933n) {
            contentValues.put("sayhiuser", this.field_sayhiuser);
        }
        if (this.f236934o) {
            contentValues.put("sayhicontent", this.field_sayhicontent);
        }
        if (this.f236935p) {
            contentValues.put("imgpath", this.field_imgpath);
        }
        if (this.f236936q) {
            contentValues.put("isSend", java.lang.Integer.valueOf(this.field_isSend));
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseShakeVerifyMessage", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS ShakeVerifyMessage ( ");
        l75.e0 e0Var = F;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236918s) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShakeVerifyMessage", "createTableSql %s", str2);
            k0Var.A("ShakeVerifyMessage", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "ShakeVerifyMessage", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShakeVerifyMessage", "updateTableSql %s", str3);
            k0Var.A("ShakeVerifyMessage", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseShakeVerifyMessage", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
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
        return java.lang.Long.valueOf(this.field_svrid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236917r;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236917r.f352676a;
    }

    @Override // l75.f0
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.b(jSONObject, "svrid", java.lang.Long.valueOf(this.field_svrid));
            n51.f.b(jSONObject, "status", java.lang.Integer.valueOf(this.field_status));
            n51.f.b(jSONObject, "type", java.lang.Integer.valueOf(this.field_type));
            n51.f.b(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.field_scene));
            n51.f.b(jSONObject, "createtime", java.lang.Long.valueOf(this.field_createtime));
            n51.f.b(jSONObject, "talker", this.field_talker);
            n51.f.b(jSONObject, "content", this.field_content);
            n51.f.b(jSONObject, "sayhiuser", this.field_sayhiuser);
            n51.f.b(jSONObject, "sayhicontent", this.field_sayhicontent);
            n51.f.b(jSONObject, "imgpath", this.field_imgpath);
            n51.f.b(jSONObject, "isSend", java.lang.Integer.valueOf(this.field_isSend));
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("svrid")) {
            this.field_svrid = contentValues.getAsLong("svrid").longValue();
            if (z17) {
                this.f236926d = true;
            }
        }
        if (contentValues.containsKey("status")) {
            this.field_status = contentValues.getAsInteger("status").intValue();
            if (z17) {
                this.f236927e = true;
            }
        }
        if (contentValues.containsKey("type")) {
            this.field_type = contentValues.getAsInteger("type").intValue();
            if (z17) {
                this.f236928f = true;
            }
        }
        if (contentValues.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
            this.field_scene = contentValues.getAsInteger(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE).intValue();
            if (z17) {
                this.f236929g = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.field_createtime = contentValues.getAsLong("createtime").longValue();
            if (z17) {
                this.f236930h = true;
            }
        }
        if (contentValues.containsKey("talker")) {
            this.field_talker = contentValues.getAsString("talker");
            if (z17) {
                this.f236931i = true;
            }
        }
        if (contentValues.containsKey("content")) {
            this.field_content = contentValues.getAsString("content");
            if (z17) {
                this.f236932m = true;
            }
        }
        if (contentValues.containsKey("sayhiuser")) {
            this.field_sayhiuser = contentValues.getAsString("sayhiuser");
            if (z17) {
                this.f236933n = true;
            }
        }
        if (contentValues.containsKey("sayhicontent")) {
            this.field_sayhicontent = contentValues.getAsString("sayhicontent");
            if (z17) {
                this.f236934o = true;
            }
        }
        if (contentValues.containsKey("imgpath")) {
            this.field_imgpath = contentValues.getAsString("imgpath");
            if (z17) {
                this.f236935p = true;
            }
        }
        if (contentValues.containsKey("isSend")) {
            this.field_isSend = contentValues.getAsInteger("isSend").intValue();
            if (z17) {
                this.f236936q = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
