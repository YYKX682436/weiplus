package dm;

/* loaded from: classes15.dex */
public class i5 extends l75.f0 {
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
    public static final int f237569J;
    public static final int K;
    public static final int L;
    public static final int M;
    public static final int N;
    public static final int P;
    public static final int Q;
    public static final int R;
    public static final int S;
    public static final int T;
    public static final l75.e0 U;
    public static final o75.e V;

    /* renamed from: y, reason: collision with root package name */
    public static final p75.n0 f237570y;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String[] f237571z;
    public java.lang.String field_avatarURL;
    public boolean field_canAtAll;
    public boolean field_canBeAt;
    public boolean field_canBeKicked;
    public boolean field_canKickMember;
    public boolean field_isAuthorized;
    public boolean field_isRobot;
    public com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo field_jumpInfo;
    public com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo field_lbsInfo;
    public java.lang.String field_nickName;
    public byte[] field_rawPbData;
    public int field_role;
    public java.lang.String field_roomName;
    public int field_sex;
    public com.tencent.mm.plugin.game.autogen.chatroom.TagInfo field_tagInfo;
    public long field_updateTime;
    public java.lang.String field_userName;
    public com.tencent.mm.plugin.game.autogen.chatroom.UserRole field_userRole;

    /* renamed from: d, reason: collision with root package name */
    public boolean f237572d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f237573e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f237574f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237575g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f237576h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f237577i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f237578m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f237579n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237580o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f237581p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f237582q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f237583r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f237584s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f237585t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f237586u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f237587v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f237588w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f237589x = true;

    static {
        p75.n0 n0Var = new p75.n0("GameChatRoomContact");
        f237570y = n0Var;
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
        kotlin.jvm.internal.o.g(tableName, "tableName");
        kotlin.jvm.internal.o.g(tableName, "tableName");
        f237571z = new java.lang.String[0];
        A = -266666762;
        B = -173503994;
        C = 69737614;
        D = -428647082;
        E = 113766;
        F = -255654404;
        G = 670560869;
        H = -1549321368;
        I = -19704821;
        f237569J = 3506294;
        K = 549231558;
        L = 2070091616;
        M = 1414282352;
        N = -266534175;
        P = 109140856;
        Q = -154167682;
        R = -2015752444;
        S = -295931082;
        T = 108705909;
        U = initAutoDBInfo(dm.i5.class);
        V = new o75.e();
    }

    public static l75.e0 initAutoDBInfo(java.lang.Class cls) {
        l75.e0 e0Var = new l75.e0();
        e0Var.f316952a = new java.lang.reflect.Field[18];
        java.lang.String[] strArr = new java.lang.String[19];
        e0Var.f316954c = strArr;
        strArr[0] = "userName";
        e0Var.f316955d.put("userName", "TEXT default ''  PRIMARY KEY ");
        e0Var.f316953b = "userName";
        e0Var.f316954c[1] = "roomName";
        e0Var.f316955d.put("roomName", "TEXT default '' ");
        e0Var.f316954c[2] = "nickName";
        e0Var.f316955d.put("nickName", "TEXT default '' ");
        e0Var.f316954c[3] = "avatarURL";
        e0Var.f316955d.put("avatarURL", "TEXT default '' ");
        e0Var.f316954c[4] = "sex";
        e0Var.f316955d.put("sex", "INTEGER default '0' ");
        e0Var.f316954c[5] = "jumpInfo";
        e0Var.f316955d.put("jumpInfo", "BLOB");
        e0Var.f316954c[6] = "isAuthorized";
        e0Var.f316955d.put("isAuthorized", "INTEGER default 'true' ");
        e0Var.f316954c[7] = "tagInfo";
        e0Var.f316955d.put("tagInfo", "BLOB");
        e0Var.f316954c[8] = "lbsInfo";
        e0Var.f316955d.put("lbsInfo", "BLOB");
        e0Var.f316954c[9] = "role";
        e0Var.f316955d.put("role", "INTEGER default '0' ");
        e0Var.f316954c[10] = "canBeAt";
        e0Var.f316955d.put("canBeAt", "INTEGER default 'true' ");
        e0Var.f316954c[11] = "isRobot";
        e0Var.f316955d.put("isRobot", "INTEGER default 'false' ");
        e0Var.f316954c[12] = "canKickMember";
        e0Var.f316955d.put("canKickMember", "INTEGER default 'false' ");
        e0Var.f316954c[13] = "userRole";
        e0Var.f316955d.put("userRole", "BLOB");
        e0Var.f316954c[14] = "canBeKicked";
        e0Var.f316955d.put("canBeKicked", "INTEGER default 'true' ");
        e0Var.f316954c[15] = "canAtAll";
        e0Var.f316955d.put("canAtAll", "INTEGER default 'false' ");
        e0Var.f316954c[16] = "rawPbData";
        e0Var.f316955d.put("rawPbData", "BLOB");
        e0Var.f316954c[17] = dm.i4.COL_UPDATETIME;
        e0Var.f316955d.put(dm.i4.COL_UPDATETIME, "LONG");
        e0Var.f316954c[18] = "rowid";
        e0Var.f316956e = " userName TEXT default ''  PRIMARY KEY ,  roomName TEXT default '' ,  nickName TEXT default '' ,  avatarURL TEXT default '' ,  sex INTEGER default '0' ,  jumpInfo BLOB,  isAuthorized INTEGER default 'true' ,  tagInfo BLOB,  lbsInfo BLOB,  role INTEGER default '0' ,  canBeAt INTEGER default 'true' ,  isRobot INTEGER default 'false' ,  canKickMember INTEGER default 'false' ,  userRole BLOB,  canBeKicked INTEGER default 'true' ,  canAtAll INTEGER default 'false' ,  rawPbData BLOB,  updateTime LONG";
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
            boolean z17 = true;
            if (A == hashCode) {
                try {
                    this.field_userName = cursor.getString(i17);
                    this.f237572d = true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th6, "convertFrom %s", columnNames[i17]);
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (B == hashCode) {
                try {
                    this.field_roomName = cursor.getString(i17);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th7, "convertFrom %s", columnNames[i17]);
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (C == hashCode) {
                try {
                    this.field_nickName = cursor.getString(i17);
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th8, "convertFrom %s", columnNames[i17]);
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (D == hashCode) {
                try {
                    this.field_avatarURL = cursor.getString(i17);
                } catch (java.lang.Throwable th9) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th9, "convertFrom %s", columnNames[i17]);
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (E == hashCode) {
                try {
                    this.field_sex = cursor.getInt(i17);
                } catch (java.lang.Throwable th10) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th10, "convertFrom %s", columnNames[i17]);
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (F == hashCode) {
                try {
                    byte[] blob = cursor.getBlob(i17);
                    if (blob != null && blob.length > 0) {
                        this.field_jumpInfo = (com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo) new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo().parseFrom(blob);
                    }
                } catch (java.lang.Throwable th11) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th11, "convertFrom %s", columnNames[i17]);
                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (G == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isAuthorized = z17;
                } catch (java.lang.Throwable th12) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th12, "convertFrom %s", columnNames[i17]);
                    java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (H == hashCode) {
                try {
                    byte[] blob2 = cursor.getBlob(i17);
                    if (blob2 != null && blob2.length > 0) {
                        this.field_tagInfo = (com.tencent.mm.plugin.game.autogen.chatroom.TagInfo) new com.tencent.mm.plugin.game.autogen.chatroom.TagInfo().parseFrom(blob2);
                    }
                } catch (java.lang.Throwable th13) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th13, "convertFrom %s", columnNames[i17]);
                    java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (I == hashCode) {
                try {
                    byte[] blob3 = cursor.getBlob(i17);
                    if (blob3 != null && blob3.length > 0) {
                        this.field_lbsInfo = (com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo) new com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo().parseFrom(blob3);
                    }
                } catch (java.lang.Throwable th14) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th14, "convertFrom %s", columnNames[i17]);
                    java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (f237569J == hashCode) {
                try {
                    this.field_role = cursor.getInt(i17);
                } catch (java.lang.Throwable th15) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th15, "convertFrom %s", columnNames[i17]);
                    java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (K == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_canBeAt = z17;
                } catch (java.lang.Throwable th16) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th16, "convertFrom %s", columnNames[i17]);
                    java.lang.String str11 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (L == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_isRobot = z17;
                } catch (java.lang.Throwable th17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th17, "convertFrom %s", columnNames[i17]);
                    java.lang.String str12 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (M == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_canKickMember = z17;
                } catch (java.lang.Throwable th18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th18, "convertFrom %s", columnNames[i17]);
                    java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (N == hashCode) {
                try {
                    byte[] blob4 = cursor.getBlob(i17);
                    if (blob4 != null && blob4.length > 0) {
                        this.field_userRole = (com.tencent.mm.plugin.game.autogen.chatroom.UserRole) new com.tencent.mm.plugin.game.autogen.chatroom.UserRole().parseFrom(blob4);
                    }
                } catch (java.lang.Throwable th19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th19, "convertFrom %s", columnNames[i17]);
                    java.lang.String str14 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (P == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_canBeKicked = z17;
                } catch (java.lang.Throwable th20) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th20, "convertFrom %s", columnNames[i17]);
                    java.lang.String str15 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (Q == hashCode) {
                try {
                    if (cursor.getInt(i17) == 0) {
                        z17 = false;
                    }
                    this.field_canAtAll = z17;
                } catch (java.lang.Throwable th21) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th21, "convertFrom %s", columnNames[i17]);
                    java.lang.String str16 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (R == hashCode) {
                try {
                    this.field_rawPbData = cursor.getBlob(i17);
                } catch (java.lang.Throwable th22) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th22, "convertFrom %s", columnNames[i17]);
                    java.lang.String str17 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (S == hashCode) {
                try {
                    this.field_updateTime = cursor.getLong(i17);
                } catch (java.lang.Throwable th23) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.BaseGameChatRoomContact", th23, "convertFrom %s", columnNames[i17]);
                    java.lang.String str18 = com.tencent.mm.sdk.platformtools.z.f193105a;
                }
            } else if (T == hashCode) {
                this.systemRowid = cursor.getLong(i17);
            }
        }
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if (this.field_userName == null) {
            this.field_userName = "";
        }
        if (this.f237572d) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.field_roomName == null) {
            this.field_roomName = "";
        }
        if (this.f237573e) {
            contentValues.put("roomName", this.field_roomName);
        }
        if (this.field_nickName == null) {
            this.field_nickName = "";
        }
        if (this.f237574f) {
            contentValues.put("nickName", this.field_nickName);
        }
        if (this.field_avatarURL == null) {
            this.field_avatarURL = "";
        }
        if (this.f237575g) {
            contentValues.put("avatarURL", this.field_avatarURL);
        }
        if (this.f237576h) {
            contentValues.put("sex", java.lang.Integer.valueOf(this.field_sex));
        }
        if (this.f237577i) {
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo jumpInfo = this.field_jumpInfo;
            if (jumpInfo != null) {
                try {
                    contentValues.put("jumpInfo", jumpInfo.toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameChatRoomContact", e17.getMessage());
                }
            } else {
                contentValues.put("jumpInfo", (byte[]) null);
            }
        }
        if (this.f237578m) {
            if (this.field_isAuthorized) {
                contentValues.put("isAuthorized", (java.lang.Integer) 1);
            } else {
                contentValues.put("isAuthorized", (java.lang.Integer) 0);
            }
        }
        if (this.f237579n) {
            com.tencent.mm.plugin.game.autogen.chatroom.TagInfo tagInfo = this.field_tagInfo;
            if (tagInfo != null) {
                try {
                    contentValues.put("tagInfo", tagInfo.toByteArray());
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameChatRoomContact", e18.getMessage());
                }
            } else {
                contentValues.put("tagInfo", (byte[]) null);
            }
        }
        if (this.f237580o) {
            com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo lbsInfo = this.field_lbsInfo;
            if (lbsInfo != null) {
                try {
                    contentValues.put("lbsInfo", lbsInfo.toByteArray());
                } catch (java.io.IOException e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameChatRoomContact", e19.getMessage());
                }
            } else {
                contentValues.put("lbsInfo", (byte[]) null);
            }
        }
        if (this.f237581p) {
            contentValues.put("role", java.lang.Integer.valueOf(this.field_role));
        }
        if (this.f237582q) {
            if (this.field_canBeAt) {
                contentValues.put("canBeAt", (java.lang.Integer) 1);
            } else {
                contentValues.put("canBeAt", (java.lang.Integer) 0);
            }
        }
        if (this.f237583r) {
            if (this.field_isRobot) {
                contentValues.put("isRobot", (java.lang.Integer) 1);
            } else {
                contentValues.put("isRobot", (java.lang.Integer) 0);
            }
        }
        if (this.f237584s) {
            if (this.field_canKickMember) {
                contentValues.put("canKickMember", (java.lang.Integer) 1);
            } else {
                contentValues.put("canKickMember", (java.lang.Integer) 0);
            }
        }
        if (this.f237585t) {
            com.tencent.mm.plugin.game.autogen.chatroom.UserRole userRole = this.field_userRole;
            if (userRole != null) {
                try {
                    contentValues.put("userRole", userRole.toByteArray());
                } catch (java.io.IOException e27) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameChatRoomContact", e27.getMessage());
                }
            } else {
                contentValues.put("userRole", (byte[]) null);
            }
        }
        if (this.f237586u) {
            if (this.field_canBeKicked) {
                contentValues.put("canBeKicked", (java.lang.Integer) 1);
            } else {
                contentValues.put("canBeKicked", (java.lang.Integer) 0);
            }
        }
        if (this.f237587v) {
            if (this.field_canAtAll) {
                contentValues.put("canAtAll", (java.lang.Integer) 1);
            } else {
                contentValues.put("canAtAll", (java.lang.Integer) 0);
            }
        }
        if (this.f237588w) {
            contentValues.put("rawPbData", this.field_rawPbData);
        }
        if (this.f237589x) {
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
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameChatRoomContact", "createTable db is null");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CREATE TABLE IF NOT EXISTS GameChatRoomContact ( ");
        l75.e0 e0Var = U;
        sb6.append(e0Var.f316956e);
        sb6.append(");");
        linkedList.add(sb6.toString());
        for (java.lang.String str : f237571z) {
            linkedList.add(str);
        }
        for (java.lang.String str2 : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameChatRoomContact", "createTableSql %s", str2);
            k0Var.A("GameChatRoomContact", str2);
        }
        for (java.lang.String str3 : l75.n0.getUpdateSQLs(e0Var, "GameChatRoomContact", k0Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameChatRoomContact", "updateTableSql %s", str3);
            k0Var.A("GameChatRoomContact", str3);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDK.BaseGameChatRoomContact", "createTable cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return U;
    }

    @Override // l75.f0
    public o75.e getObserverOwner() {
        return V;
    }

    @Override // l75.f0
    public java.lang.Object getPrimaryKeyValue() {
        return this.field_userName;
    }

    @Override // l75.f0
    public p75.n0 getTable() {
        return f237570y;
    }

    @Override // l75.f0
    public java.lang.String getTableName() {
        return f237570y.f352676a;
    }

    @Override // l75.f0
    public void convertFrom(android.content.ContentValues contentValues, boolean z17) {
        if (contentValues.containsKey("userName")) {
            this.field_userName = contentValues.getAsString("userName");
            if (z17) {
                this.f237572d = true;
            }
        }
        if (contentValues.containsKey("roomName")) {
            this.field_roomName = contentValues.getAsString("roomName");
            if (z17) {
                this.f237573e = true;
            }
        }
        if (contentValues.containsKey("nickName")) {
            this.field_nickName = contentValues.getAsString("nickName");
            if (z17) {
                this.f237574f = true;
            }
        }
        if (contentValues.containsKey("avatarURL")) {
            this.field_avatarURL = contentValues.getAsString("avatarURL");
            if (z17) {
                this.f237575g = true;
            }
        }
        if (contentValues.containsKey("sex")) {
            this.field_sex = contentValues.getAsInteger("sex").intValue();
            if (z17) {
                this.f237576h = true;
            }
        }
        if (contentValues.containsKey("jumpInfo")) {
            try {
                byte[] asByteArray = contentValues.getAsByteArray("jumpInfo");
                if (asByteArray != null && asByteArray.length > 0) {
                    this.field_jumpInfo = (com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo) new com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo().parseFrom(asByteArray);
                    if (z17) {
                        this.f237577i = true;
                    }
                }
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameChatRoomContact", e17.getMessage());
            }
        }
        if (contentValues.containsKey("isAuthorized")) {
            this.field_isAuthorized = contentValues.getAsInteger("isAuthorized").intValue() != 0;
            if (z17) {
                this.f237578m = true;
            }
        }
        if (contentValues.containsKey("tagInfo")) {
            try {
                byte[] asByteArray2 = contentValues.getAsByteArray("tagInfo");
                if (asByteArray2 != null && asByteArray2.length > 0) {
                    this.field_tagInfo = (com.tencent.mm.plugin.game.autogen.chatroom.TagInfo) new com.tencent.mm.plugin.game.autogen.chatroom.TagInfo().parseFrom(asByteArray2);
                    if (z17) {
                        this.f237579n = true;
                    }
                }
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameChatRoomContact", e18.getMessage());
            }
        }
        if (contentValues.containsKey("lbsInfo")) {
            try {
                byte[] asByteArray3 = contentValues.getAsByteArray("lbsInfo");
                if (asByteArray3 != null && asByteArray3.length > 0) {
                    this.field_lbsInfo = (com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo) new com.tencent.mm.plugin.game.autogen.chatroom.LbsInfo().parseFrom(asByteArray3);
                    if (z17) {
                        this.f237580o = true;
                    }
                }
            } catch (java.io.IOException e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameChatRoomContact", e19.getMessage());
            }
        }
        if (contentValues.containsKey("role")) {
            this.field_role = contentValues.getAsInteger("role").intValue();
            if (z17) {
                this.f237581p = true;
            }
        }
        if (contentValues.containsKey("canBeAt")) {
            this.field_canBeAt = contentValues.getAsInteger("canBeAt").intValue() != 0;
            if (z17) {
                this.f237582q = true;
            }
        }
        if (contentValues.containsKey("isRobot")) {
            this.field_isRobot = contentValues.getAsInteger("isRobot").intValue() != 0;
            if (z17) {
                this.f237583r = true;
            }
        }
        if (contentValues.containsKey("canKickMember")) {
            this.field_canKickMember = contentValues.getAsInteger("canKickMember").intValue() != 0;
            if (z17) {
                this.f237584s = true;
            }
        }
        if (contentValues.containsKey("userRole")) {
            try {
                byte[] asByteArray4 = contentValues.getAsByteArray("userRole");
                if (asByteArray4 != null && asByteArray4.length > 0) {
                    this.field_userRole = (com.tencent.mm.plugin.game.autogen.chatroom.UserRole) new com.tencent.mm.plugin.game.autogen.chatroom.UserRole().parseFrom(asByteArray4);
                    if (z17) {
                        this.f237585t = true;
                    }
                }
            } catch (java.io.IOException e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SDK.BaseGameChatRoomContact", e27.getMessage());
            }
        }
        if (contentValues.containsKey("canBeKicked")) {
            this.field_canBeKicked = contentValues.getAsInteger("canBeKicked").intValue() != 0;
            if (z17) {
                this.f237586u = true;
            }
        }
        if (contentValues.containsKey("canAtAll")) {
            this.field_canAtAll = contentValues.getAsInteger("canAtAll").intValue() != 0;
            if (z17) {
                this.f237587v = true;
            }
        }
        if (contentValues.containsKey("rawPbData")) {
            this.field_rawPbData = contentValues.getAsByteArray("rawPbData");
            if (z17) {
                this.f237588w = true;
            }
        }
        if (contentValues.containsKey(dm.i4.COL_UPDATETIME)) {
            this.field_updateTime = contentValues.getAsLong(dm.i4.COL_UPDATETIME).longValue();
            if (z17) {
                this.f237589x = true;
            }
        }
        if (contentValues.containsKey("rowid")) {
            this.systemRowid = contentValues.getAsLong("rowid").longValue();
        }
    }
}
