package dm;

/* loaded from: classes13.dex */
public class d6 extends l75.f0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;

    /* renamed from: J, reason: collision with root package name */
    public static final int f236378J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final l75.e0 Q;
    public static final o75.e R;

    /* renamed from: w, reason: collision with root package name */
    public static final p75.n0 f236379w;

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String[] f236380x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f236381y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f236382z;
    public long field_createtime;
    public java.lang.String field_creator;
    public java.lang.String field_custominfo;
    public java.lang.String field_manager;
    public int field_netSceneState;
    public int field_nreply;
    public java.lang.String field_path;
    public java.lang.String field_related_msgids;
    public java.lang.String field_roomname;
    public java.lang.String field_shareKey;
    public java.lang.String field_shareName;
    public int field_state;
    public java.lang.String field_title;
    public java.lang.String field_todoid;
    public long field_updatetime;
    public java.lang.String field_username;

    /* renamed from: d, reason: collision with root package name */
    public boolean f236383d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f236384e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f236385f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f236386g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f236387h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236388i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f236389m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f236390n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f236391o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f236392p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f236393q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f236394r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f236395s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f236396t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f236397u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f236398v = true;

    static {
        p75.n0 n0Var = new p75.n0("GroupTodo");
        f236379w = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f236380x = new java.lang.String[0];
        f236381y = -868385823;
        f236382z = -172550682;
        A = -265713450;
        B = 3433509;
        C = 1370166729;
        D = -294977770;
        E = -1581068385;
        F = 110371416;
        G = 1028554796;
        H = 2118164011;
        I = 835260333;
        f236378J = -1037359300;
        K = 109757585;
        L = -282060574;
        M = -743778816;
        N = -1582221558;
        P = 108705909;
        Q = initAutoDBInfo(dm.d6.class);
        R = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[16];
        java.lang.String[] strArr = new java.lang.String[17];
        e0Var.f316954c = strArr;
        strArr[0] = "todoid";
        e0Var.f316955d.put("todoid", "TEXT");
        e0Var.f316954c[1] = "roomname";
        e0Var.f316955d.put("roomname", "TEXT");
        e0Var.f316954c[2] = dm.i4.COL_USERNAME;
        e0Var.f316955d.put(dm.i4.COL_USERNAME, "TEXT");
        e0Var.f316954c[3] = com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH;
        e0Var.f316955d.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "TEXT");
        e0Var.f316954c[4] = "createtime";
        e0Var.f316955d.put("createtime", "LONG");
        e0Var.f316954c[5] = "updatetime";
        e0Var.f316955d.put("updatetime", "LONG");
        e0Var.f316954c[6] = "custominfo";
        e0Var.f316955d.put("custominfo", "TEXT default '' ");
        e0Var.f316954c[7] = com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE;
        e0Var.f316955d.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "TEXT default '' ");
        e0Var.f316954c[8] = "creator";
        e0Var.f316955d.put("creator", "TEXT");
        e0Var.f316954c[9] = "related_msgids";
        e0Var.f316955d.put("related_msgids", "TEXT");
        e0Var.f316954c[10] = com.tencent.shadow.core.common.HostConstants.MANAGER_APPID;
        e0Var.f316955d.put(com.tencent.shadow.core.common.HostConstants.MANAGER_APPID, "TEXT");
        e0Var.f316954c[11] = "nreply";
        e0Var.f316955d.put("nreply", "INTEGER");
        e0Var.f316954c[12] = "state";
        e0Var.f316955d.put("state", "INTEGER");
        e0Var.f316954c[13] = "netSceneState";
        e0Var.f316955d.put("netSceneState", "INTEGER");
        e0Var.f316954c[14] = "shareKey";
        e0Var.f316955d.put("shareKey", "TEXT");
        e0Var.f316954c[15] = "shareName";
        e0Var.f316955d.put("shareName", "TEXT");
        e0Var.f316954c[16] = "rowid";
        e0Var.f316956e = " todoid TEXT,  roomname TEXT,  username TEXT,  path TEXT,  createtime LONG,  updatetime LONG,  custominfo TEXT default '' ,  title TEXT default '' ,  creator TEXT,  related_msgids TEXT,  manager TEXT,  nreply INTEGER,  state INTEGER,  netSceneState INTEGER,  shareKey TEXT,  shareName TEXT";
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
            if (f236381y == hashCode) {
                try {
                    this.field_todoid = cursor.getString(i17);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236382z == hashCode) {
                try {
                    this.field_roomname = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (A == hashCode) {
                try {
                    this.field_username = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_path = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_createtime = cursor.getLong(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_updatetime = cursor.getLong(i17);
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_custominfo = cursor.getString(i17);
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    this.field_title = cursor.getString(i17);
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    this.field_creator = cursor.getString(i17);
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    this.field_related_msgids = cursor.getString(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    this.field_manager = cursor.getString(i17);
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f236378J == hashCode) {
                try {
                    this.field_nreply = cursor.getInt(i17);
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    this.field_state = cursor.getInt(i17);
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    this.field_netSceneState = cursor.getInt(i17);
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    this.field_shareKey = cursor.getString(i17);
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    this.field_shareName = cursor.getString(i17);
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGroupTodo", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.f236383d) {
            contentValues.put("todoid", this.field_todoid);
        }
        if (this.f236384e) {
            contentValues.put("roomname", this.field_roomname);
        }
        if (this.f236385f) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if (this.f236386g) {
            contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.field_path);
        }
        if (this.f236387h) {
            contentValues.put("createtime", java.lang.Long.valueOf(this.field_createtime));
        }
        if (this.f236388i) {
            contentValues.put("updatetime", java.lang.Long.valueOf(this.field_updatetime));
        }
        if (this.field_custominfo == null) {
            this.field_custominfo = "";
        }
        if (this.f236389m) {
            contentValues.put("custominfo", this.field_custominfo);
        }
        if (this.field_title == null) {
            this.field_title = "";
        }
        if (this.f236390n) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.field_title);
        }
        if (this.f236391o) {
            contentValues.put("creator", this.field_creator);
        }
        if (this.f236392p) {
            contentValues.put("related_msgids", this.field_related_msgids);
        }
        if (this.f236393q) {
            contentValues.put(com.tencent.shadow.core.common.HostConstants.MANAGER_APPID, this.field_manager);
        }
        if (this.f236394r) {
            contentValues.put("nreply", java.lang.Integer.valueOf(this.field_nreply));
        }
        if (this.f236395s) {
            contentValues.put("state", java.lang.Integer.valueOf(this.field_state));
        }
        if (this.f236396t) {
            contentValues.put("netSceneState", java.lang.Integer.valueOf(this.field_netSceneState));
        }
        if (this.f236397u) {
            contentValues.put("shareKey", this.field_shareKey);
        }
        if (this.f236398v) {
            contentValues.put("shareName", this.field_shareName);
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGroupTodo", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GroupTodo ( ");
        l75.e0 e0Var = Q;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f236380x) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGroupTodo", "createTableSql %s", str2);
            k0Var.A("GroupTodo", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GroupTodo", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGroupTodo", "updateTableSql %s", str3);
            k0Var.A("GroupTodo", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGroupTodo", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return Q;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return R;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return java.lang.Long.valueOf(this.systemRowid);
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f236379w;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f236379w.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("todoid")) {
            this.field_todoid = contentValues.getAsString("todoid");
            if (z17) {
                this.f236383d = true;
            }
        }
        if (contentValues.containsKey("roomname")) {
            this.field_roomname = contentValues.getAsString("roomname");
            if (z17) {
                this.f236384e = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_USERNAME)) {
            this.field_username = contentValues.getAsString(dm.i4.COL_USERNAME);
            if (z17) {
                this.f236385f = true;
            }
        }
        if (contentValues.containsKey(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) {
            this.field_path = contentValues.getAsString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            if (z17) {
                this.f236386g = true;
            }
        }
        if (contentValues.containsKey("createtime")) {
            this.field_createtime = contentValues.getAsLong("createtime").longValue();
            if (z17) {
                this.f236387h = true;
            }
        }
        if (contentValues.containsKey("updatetime")) {
            this.field_updatetime = contentValues.getAsLong("updatetime").longValue();
            if (z17) {
                this.f236388i = true;
            }
        }
        if (contentValues.containsKey("custominfo")) {
            this.field_custominfo = contentValues.getAsString("custominfo");
            if (z17) {
                this.f236389m = true;
            }
        }
        if (contentValues.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
            this.field_title = contentValues.getAsString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (z17) {
                this.f236390n = true;
            }
        }
        if (contentValues.containsKey("creator")) {
            this.field_creator = contentValues.getAsString("creator");
            if (z17) {
                this.f236391o = true;
            }
        }
        if (contentValues.containsKey("related_msgids")) {
            this.field_related_msgids = contentValues.getAsString("related_msgids");
            if (z17) {
                this.f236392p = true;
            }
        }
        if (contentValues.containsKey(com.tencent.shadow.core.common.HostConstants.MANAGER_APPID)) {
            this.field_manager = contentValues.getAsString(com.tencent.shadow.core.common.HostConstants.MANAGER_APPID);
            if (z17) {
                this.f236393q = true;
            }
        }
        if (contentValues.containsKey("nreply")) {
            this.field_nreply = contentValues.getAsInteger("nreply").intValue();
            if (z17) {
                this.f236394r = true;
            }
        }
        if (contentValues.containsKey("state")) {
            this.field_state = contentValues.getAsInteger("state").intValue();
            if (z17) {
                this.f236395s = true;
            }
        }
        if (contentValues.containsKey("netSceneState")) {
            this.field_netSceneState = contentValues.getAsInteger("netSceneState").intValue();
            if (z17) {
                this.f236396t = true;
            }
        }
        if (contentValues.containsKey("shareKey")) {
            this.field_shareKey = contentValues.getAsString("shareKey");
            if (z17) {
                this.f236397u = true;
            }
        }
        if (contentValues.containsKey("shareName")) {
            this.field_shareName = contentValues.getAsString("shareName");
            if (z17) {
                this.f236398v = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
