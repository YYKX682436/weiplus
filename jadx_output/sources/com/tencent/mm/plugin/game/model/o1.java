package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class o1 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f140391d = {"CREATE INDEX IF NOT EXISTS game_msg_reappear_index ON GameRawMessage ( reappearable,entranceExposure,isRead,isHidden )", "CREATE  INDEX IF NOT EXISTS  game_create_time_index ON GameRawMessage ( createTime ) ", "CREATE  INDEX IF NOT EXISTS  game_red_dot_expire_time_index ON GameRawMessage ( redDotExpireTime ) ", "CREATE  INDEX IF NOT EXISTS  game_expire_time_index ON GameRawMessage ( expireTime ) ", "CREATE  INDEX IF NOT EXISTS  game_show_type_index ON GameRawMessage ( showType ) ", "CREATE  INDEX IF NOT EXISTS  game_game_msg_id_index ON GameRawMessage ( gameMsgId ) ", "CREATE  INDEX IF NOT EXISTS  game_interactive_merge_id_index ON GameRawMessage ( interactiveMergeId ) "};

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f140392e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.game.model.e1.f140272d3, "GameRawMessage")};

    public o1(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.game.model.e1.f140272d3, "GameRawMessage", f140391d);
    }

    public void C1() {
        int[] iArr = {10000, 100, 100};
        for (int i17 = 0; i17 < 3; i17++) {
            android.database.Cursor rawQuery = rawQuery("select * from GameRawMessage where showType= " + i17 + " limit 1", new java.lang.String[0]);
            if (rawQuery == null) {
                return;
            }
            if (rawQuery.moveToFirst()) {
                com.tencent.mm.plugin.game.model.e1 e1Var = new com.tencent.mm.plugin.game.model.e1();
                e1Var.convertFrom(rawQuery);
                for (int i18 = 0; i18 < iArr[i17]; i18++) {
                    e1Var.systemRowid = java.lang.System.currentTimeMillis();
                    e1Var.field_msgId = java.lang.System.currentTimeMillis();
                    insert(e1Var);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageStorage", "insert success");
            }
            rawQuery.close();
        }
    }

    public boolean D0(int i17) {
        return execSQL("GameRawMessage", "delete from GameRawMessage where showType = " + i17);
    }

    public final java.lang.String J0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            return "1=1";
        }
        java.lang.String str = "(";
        for (int i17 = 0; i17 < iArr.length - 1; i17++) {
            str = str + "msgType=" + iArr[i17] + " or ";
        }
        return (str + "msgType=" + iArr[iArr.length - 1]) + ")";
    }

    public void K1(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.game.model.e1 b17 = b1(str);
        if (b17 != null) {
            b17.field_redDotExpireTime = 0L;
            update(b17, new java.lang.String[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageStorage", "removeTabRedDot gameMsgId:%s", str);
    }

    public com.tencent.mm.plugin.game.model.e1 L0(long j17) {
        com.tencent.mm.plugin.game.model.e1 e1Var = new com.tencent.mm.plugin.game.model.e1();
        e1Var.field_msgId = j17;
        if (get(e1Var, new java.lang.String[0])) {
            return e1Var;
        }
        return null;
    }

    public int P0(int i17) {
        java.lang.String str;
        if (i17 != 65536) {
            str = "select count(msgId) from GameRawMessage where showType = " + i17;
        } else {
            str = "select count(msgId) from GameRawMessage";
        }
        android.database.Cursor rawQuery = rawQuery(str, new java.lang.String[0]);
        if (rawQuery == null) {
            return 0;
        }
        int i18 = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
        rawQuery.close();
        return i18;
    }

    public boolean P1(long j17) {
        return execSQL("GameRawMessage", "update GameRawMessage set entranceExposure=1 where msgId=" + j17);
    }

    public boolean S1(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("msgId in (");
        for (int i17 = 0; i17 < jArr.length; i17++) {
            sb6.append(jArr[i17]);
            if (i17 != jArr.length - 1) {
                sb6.append(",");
            }
        }
        sb6.append(")");
        return execSQL("GameRawMessage", java.lang.String.format("update GameRawMessage set isRead=1 where %s", sb6.toString()));
    }

    public void T1() {
        execSQL("GameRawMessage", "update GameRawMessage set isRead=1 where isRead=0 and " + J0(2, 5, 6, 10, 11, 100) + " and isHidden = 0");
    }

    public com.tencent.mm.plugin.game.model.e1 W0(int i17) {
        android.database.Cursor rawQuery = rawQuery("select * from GameRawMessage where showType = " + i17 + " and isRead=0 and showInMsgList = 1 and isHidden = 0 order by isRead, createTime desc", new java.lang.String[0]);
        com.tencent.mm.plugin.game.model.e1 e1Var = null;
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            e1Var = new com.tencent.mm.plugin.game.model.e1();
            e1Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        return e1Var;
    }

    public void X1(int i17) {
        execSQL("GameRawMessage", "update GameRawMessage set isRead=1 where showType=" + i17);
    }

    public com.tencent.mm.plugin.game.model.e1 b1(java.lang.String str) {
        android.database.Cursor rawQuery = rawQuery("select * from GameRawMessage where gameMsgId = \"" + str + "\"", new java.lang.String[0]);
        if (rawQuery == null) {
            return null;
        }
        com.tencent.mm.plugin.game.model.e1 e1Var = new com.tencent.mm.plugin.game.model.e1();
        if (rawQuery.moveToFirst()) {
            e1Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        return e1Var;
    }

    public int d1() {
        android.database.Cursor rawQuery = rawQuery("select count(*) from GameRawMessage where " + J0(2, 5, 6, 10, 11, 100) + " and isRead=0 and showInMsgList = 1 and isHidden = 0", new java.lang.String[0]);
        if (rawQuery == null) {
            return 0;
        }
        int i17 = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
        rawQuery.close();
        return i17;
    }

    public int f1(int i17) {
        android.database.Cursor i18 = i1(i17);
        if (i18 == null) {
            return 0;
        }
        int i19 = i18.moveToFirst() ? i18.getInt(0) : 0;
        i18.close();
        return i19;
    }

    public android.database.Cursor i1(int i17) {
        return rawQuery("select * from GameRawMessage where showType = " + i17 + " and showInMsgList = 1 and isHidden = 0 order by isRead, createTime desc", new java.lang.String[0]);
    }

    public android.database.Cursor k1(int i17, int i18, int i19) {
        return rawQuery("select * from GameRawMessage where showType = " + i17 + " and showInMsgList = 1 and isHidden = 0 order by isRead, createTime desc limit " + i18 + ", " + i19, new java.lang.String[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0096, code lost:
    
        if (r4.moveToFirst() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0098, code lost:
    
        r6 = new com.tencent.mm.plugin.game.model.e1();
        r6.convertFrom(r4);
        r5.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        if (r4.moveToNext() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedList n1(int r4, int r5, long r6, int r8, int r9) {
        /*
            r3 = this;
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            java.lang.String r1 = ""
            if (r0 != 0) goto Lb
            java.lang.String r6 = "9223372036854775807"
            goto L17
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
        L17:
            if (r8 != 0) goto L1c
            java.lang.String r7 = "(isRead=1 or isRead=0) "
            goto L27
        L1c:
            r7 = 1
            if (r8 != r7) goto L22
            java.lang.String r7 = "isRead=0 "
            goto L27
        L22:
            r7 = 2
            if (r8 != r7) goto Lad
            java.lang.String r7 = "isRead=1 "
        L27:
            r8 = 65536(0x10000, float:9.1835E-41)
            java.lang.String r0 = " and "
            if (r4 == r8) goto L3f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "msgType="
            r8.<init>(r2)
            r8.append(r4)
            r8.append(r0)
            java.lang.String r4 = r8.toString()
            goto L40
        L3f:
            r4 = r1
        L40:
            r8 = -1
            if (r5 == r8) goto L54
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "reportType="
            r4.<init>(r8)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
        L54:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "select * from GameRawMessage where "
            r8.<init>(r9)
            r8.append(r4)
            java.lang.String r4 = "msgId<%s and "
            r8.append(r4)
            r8.append(r7)
            java.lang.String r4 = "order by createTime desc limit %s"
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r5}
            java.lang.String r4 = java.lang.String.format(r4, r5)
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r6 = 0
            java.lang.String[] r6 = new java.lang.String[r6]
            android.database.Cursor r4 = r3.rawQuery(r4, r6)
            if (r4 != 0) goto L92
            return r5
        L92:
            boolean r6 = r4.moveToFirst()
            if (r6 == 0) goto La9
        L98:
            com.tencent.mm.plugin.game.model.e1 r6 = new com.tencent.mm.plugin.game.model.e1
            r6.<init>()
            r6.convertFrom(r4)
            r5.add(r6)
            boolean r6 = r4.moveToNext()
            if (r6 != 0) goto L98
        La9:
            r4.close()
            return r5
        Lad:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.model.o1.n1(int, int, long, int, int):java.util.LinkedList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r1.field_msgId == r7.field_msgId) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r0.moveToNext() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (r0.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        r1 = new com.tencent.mm.plugin.game.model.e1();
        r1.convertFrom(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r7 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.game.model.e1 o1(com.tencent.mm.plugin.game.model.e1 r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "select * from GameRawMessage where redDotExpireTime>"
            r0.<init>(r1)
            long r1 = com.tencent.mm.sdk.platformtools.t8.i1()
            r0.append(r1)
            java.lang.String r1 = " and isRead=0 and isHidden=0 order by redDotExpireTime desc"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "getTabRedDotMsg sql:%s"
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r3 = "MicroMsg.GameMessageStorage"
            com.tencent.mars.xlog.Log.i(r3, r1, r2)
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            android.database.Cursor r0 = r6.rawQuery(r0, r1)
            r1 = 0
            if (r0 != 0) goto L2d
            return r1
        L2d:
            boolean r2 = r0.moveToFirst()
            if (r2 == 0) goto L4d
        L33:
            com.tencent.mm.plugin.game.model.e1 r1 = new com.tencent.mm.plugin.game.model.e1
            r1.<init>()
            r1.convertFrom(r0)
            if (r7 != 0) goto L3e
            goto L4d
        L3e:
            long r2 = r1.field_msgId
            long r4 = r7.field_msgId
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L47
            goto L4d
        L47:
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L33
        L4d:
            r0.close()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.model.o1.o1(com.tencent.mm.plugin.game.model.e1):com.tencent.mm.plugin.game.model.e1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r1.field_gameMsgId.equals(r5) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r0.moveToNext() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (r0.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        r1 = new com.tencent.mm.plugin.game.model.e1();
        r1.convertFrom(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r5) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.game.model.e1 p1(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "select * from GameRawMessage where redDotExpireTime>"
            r0.<init>(r1)
            long r1 = com.tencent.mm.sdk.platformtools.t8.i1()
            r0.append(r1)
            java.lang.String r1 = " and isRead=0 and isHidden=0 order by redDotExpireTime desc"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "getTabRedDotMsg sql:%s"
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r3 = "MicroMsg.GameMessageStorage"
            com.tencent.mars.xlog.Log.i(r3, r1, r2)
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            android.database.Cursor r0 = r4.rawQuery(r0, r1)
            r1 = 0
            if (r0 != 0) goto L2d
            return r1
        L2d:
            boolean r2 = r0.moveToFirst()
            if (r2 == 0) goto L51
        L33:
            com.tencent.mm.plugin.game.model.e1 r1 = new com.tencent.mm.plugin.game.model.e1
            r1.<init>()
            r1.convertFrom(r0)
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r5)
            if (r2 == 0) goto L42
            goto L51
        L42:
            java.lang.String r2 = r1.field_gameMsgId
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L4b
            goto L51
        L4b:
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L33
        L51:
            r0.close()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.model.o1.p1(java.lang.String):com.tencent.mm.plugin.game.model.e1");
    }

    public int u1(int i17) {
        android.database.Cursor rawQuery = rawQuery("select sum(hasMergedCount) from GameRawMessage where showType = " + i17 + " and isRead=0 and showInMsgList = 1 and isHidden = 0", new java.lang.String[0]);
        if (rawQuery == null) {
            return 0;
        }
        int i18 = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
        rawQuery.close();
        return i18;
    }

    public void y0(int i17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameMessageStorage", "delMessageByMsgTypeAndTimeStamp  ret:%s", java.lang.Boolean.valueOf(execSQL("GameRawMessage", "delete from GameRawMessage where msgId < (" + j17 + ") and showType = " + i17)));
    }

    public boolean z0(long[] jArr) {
        if (jArr == null || jArr.length == 0) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("msgId in (");
        for (int i17 = 0; i17 < jArr.length; i17++) {
            sb6.append(jArr[i17]);
            if (i17 != jArr.length - 1) {
                sb6.append(",");
            }
        }
        sb6.append(")");
        return execSQL("GameRawMessage", java.lang.String.format("delete from GameRawMessage where %s", sb6.toString()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r0.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        r2 = new com.tencent.mm.plugin.game.model.e1();
        r2.convertFrom(r0);
        r1.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r0.moveToNext() != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List z1() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "select * from GameRawMessage where isRead=0 and isHidden=0 and expireTime>"
            r0.<init>(r1)
            long r1 = com.tencent.mm.sdk.platformtools.t8.i1()
            r0.append(r1)
            java.lang.String r1 = " and channel=2 and entranceExposure=0 order by createTime desc limit 36"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            android.database.Cursor r0 = r3.rawQuery(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 != 0) goto L26
            return r1
        L26:
            boolean r2 = r0.moveToFirst()
            if (r2 == 0) goto L3d
        L2c:
            com.tencent.mm.plugin.game.model.e1 r2 = new com.tencent.mm.plugin.game.model.e1
            r2.<init>()
            r2.convertFrom(r0)
            r1.add(r2)
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L2c
        L3d:
            r0.close()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.model.o1.z1():java.util.List");
    }
}
