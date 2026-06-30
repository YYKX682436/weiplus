package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class w1 extends l75.n0 implements p94.h0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f166155f = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.sns.storage.v1.T, "SnsComment")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f166156d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f166157e;

    public w1(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.sns.storage.v1.T, "SnsComment", dm.ma.f238550x);
        this.f166157e = false;
        this.f166156d = k0Var;
    }

    public com.tencent.mm.plugin.sns.storage.v1 D0(long j17, long j18, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getByCommentId", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        java.lang.String str = i17 == 9 ? "(2)" : "";
        if (i17 == 10) {
            str = str + "(8,16)";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *, rowid from SnsComment where snsID = ");
        P0();
        sb6.append(j17);
        sb6.append(" and commentSvrID = ");
        sb6.append(j18);
        sb6.append(" and type in ");
        sb6.append(str);
        android.database.Cursor rawQuery = rawQuery(sb6.toString(), new java.lang.String[0]);
        com.tencent.mm.plugin.sns.storage.v1 v1Var = null;
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                v1Var = new com.tencent.mm.plugin.sns.storage.v1();
                v1Var.convertFrom(rawQuery);
            }
            rawQuery.close();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByCommentId", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return v1Var;
    }

    public int J0(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        android.database.Cursor rawQuery = rawQuery("select count(*) from SnsComment where isSend = " + (z17 ? 1 : 0) + "", new java.lang.String[0]);
        if (rawQuery == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            return 0;
        }
        rawQuery.moveToFirst();
        int i17 = rawQuery.getInt(0);
        rawQuery.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return i17;
    }

    public int L0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNotifyCount", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        if (com.tencent.mm.plugin.sns.ui.SnsMsgInteractionMgr.X6().booleanValue()) {
            int k17 = k1(1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNotifyCount", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            return k17;
        }
        int f17 = f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNotifyCount", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return f17;
    }

    public final java.lang.String P0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectBegin", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return "select *, rowid from SnsComment";
    }

    public android.database.Cursor W0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUnReadCursor", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        P0();
        android.database.Cursor B = this.f166156d.B("select *, rowid from SnsComment where isRead = ?  and isSilence != ?  order by createTime desc", new java.lang.String[]{"0", "1"});
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUnReadCursor", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return B;
    }

    public android.database.Cursor b1(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUnReadCursorWithRelevanceType", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        P0();
        android.database.Cursor B = this.f166156d.B("select *, rowid from SnsComment where isRead = ? and ( isSilence != ? or isReminding = ? ) and msgRelevanceType = ?  order by createTime desc", new java.lang.String[]{"0", "1", "1", "" + i17});
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUnReadCursorWithRelevanceType", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return B;
    }

    public android.database.Cursor d1(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUnReadUnSilenceCursorWithRelevanceType", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        P0();
        android.database.Cursor B = this.f166156d.B("select *, rowid from SnsComment where isRead = ?  and isSilence != ?  and msgRelevanceType = ?  order by createTime desc", new java.lang.String[]{"0", "1", "" + i17});
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUnReadUnSilenceCursorWithRelevanceType", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return B;
    }

    public int f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUnreadCount", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        android.database.Cursor f17 = this.f166156d.f(" select count(*) from SnsComment where isRead = ? and isSilence != ? ", new java.lang.String[]{"0", "1"}, 2);
        if (f17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUnreadCount", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            return 0;
        }
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUnreadCount", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (0 == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int f1() {
        /*
            r9 = this;
            java.lang.String r0 = "1"
            java.lang.String r1 = "getUnreadCountWithAll"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.SnsCommentStorage"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = " select count(*) from SnsComment where isRead = ? and ( isSilence != ? or isReminding = ? )"
            r4 = 0
            r5 = 0
            l75.k0 r6 = r9.f166156d     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r7 = 3
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            java.lang.String r8 = "0"
            r7[r5] = r8     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r8 = 1
            r7[r8] = r0     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r8 = 2
            r7[r8] = r0     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            android.database.Cursor r4 = r6.f(r3, r7, r8)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            if (r4 != 0) goto L2b
            if (r4 == 0) goto L27
            r4.close()
        L27:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r5
        L2b:
            boolean r0 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            if (r0 == 0) goto L36
            int r0 = r4.getInt(r5)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L3c
            r5 = r0
        L36:
            r4.close()
            goto L49
        L3a:
            r0 = move-exception
            goto L4d
        L3c:
            r0 = move-exception
            java.lang.String r3 = "MicroMsg.SnsCommentStorage"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3a
            com.tencent.mars.xlog.Log.e(r3, r0)     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L49
            goto L36
        L49:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r5
        L4d:
            if (r4 == 0) goto L52
            r4.close()
        L52:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.w1.f1():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (0 == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int i1(int r11) {
        /*
            r10 = this;
            java.lang.String r0 = "1"
            java.lang.String r1 = ""
            java.lang.String r2 = "getUnreadCountWithRelevanceType"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.SnsCommentStorage"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = " select count(*) from SnsComment where isRead = ? and ( isSilence != ? or isReminding = ? ) and msgRelevanceType = ?"
            r5 = 0
            r6 = 0
            l75.k0 r7 = r10.f166156d     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r8 = 4
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.lang.String r9 = "0"
            r8[r5] = r9     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r9 = 1
            r8[r9] = r0     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r9 = 2
            r8[r9] = r0     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r0.append(r11)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r0 = 3
            r8[r0] = r11     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            android.database.Cursor r6 = r7.f(r4, r8, r9)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            if (r6 != 0) goto L3c
            if (r6 == 0) goto L38
            r6.close()
        L38:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r5
        L3c:
            boolean r11 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            if (r11 == 0) goto L47
            int r11 = r6.getInt(r5)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r5 = r11
        L47:
            r6.close()
            goto L5a
        L4b:
            r11 = move-exception
            goto L5e
        L4d:
            r11 = move-exception
            java.lang.String r0 = "MicroMsg.SnsCommentStorage"
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L4b
            com.tencent.mars.xlog.Log.e(r0, r11)     // Catch: java.lang.Throwable -> L4b
            if (r6 == 0) goto L5a
            goto L47
        L5a:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r5
        L5e:
            if (r6 == 0) goto L63
            r6.close()
        L63:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.w1.i1(int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (0 == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int k1(int r11) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "getUnreadUnSilenceCountWithRelevanceType"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.SnsCommentStorage"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = " select count(*) from SnsComment where isRead = ? and isSilence != ? and msgRelevanceType = ?"
            r4 = 0
            r5 = 0
            l75.k0 r6 = r10.f166156d     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r7 = 3
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            java.lang.String r8 = "0"
            r7[r5] = r8     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            java.lang.String r8 = "1"
            r9 = 1
            r7[r9] = r8     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r8.append(r11)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            java.lang.String r11 = r8.toString()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r0 = 2
            r7[r0] = r11     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            android.database.Cursor r4 = r6.f(r3, r7, r0)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            if (r4 != 0) goto L39
            if (r4 == 0) goto L35
            r4.close()
        L35:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r5
        L39:
            boolean r11 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            if (r11 == 0) goto L44
            int r11 = r4.getInt(r5)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r5 = r11
        L44:
            r4.close()
            goto L57
        L48:
            r11 = move-exception
            goto L5b
        L4a:
            r11 = move-exception
            java.lang.String r0 = "MicroMsg.SnsCommentStorage"
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L48
            com.tencent.mars.xlog.Log.e(r0, r11)     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L57
            goto L44
        L57:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r5
        L5b:
            if (r4 == 0) goto L60
            r4.close()
        L60:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.w1.k1(int):int");
    }

    public boolean n1(long j17, java.lang.String str, int i17, java.lang.String str2) {
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExistComment", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str3 = "select count(*) from SnsComment where snsID = " + j17 + " and createTime = " + i17 + " and talker = '" + str + "'";
        } else {
            str3 = "select count(*) from SnsComment where snsID = " + j17 + " and clientId = '" + str2 + "'";
        }
        android.database.Cursor rawQuery = rawQuery(str3, new java.lang.String[0]);
        if (rawQuery == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExistComment", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            return false;
        }
        rawQuery.moveToFirst();
        int i18 = rawQuery.getInt(0);
        rawQuery.close();
        boolean z17 = i18 > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExistComment", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return z17;
    }

    public boolean o1(long j17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateIsSilence", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        java.lang.String str = " update SnsComment set isSilence = " + (z17 ? 1 : 0) + ", isReminding = 1 where isSilence != " + (z17 ? 1 : 0) + " and  snsID = " + j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentStorage", "updateIsSilence " + str);
        boolean A = this.f166156d.A("SnsComment", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateIsSilence", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return A;
    }

    public boolean p1() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateToRead", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        boolean A = this.f166156d.A("SnsComment", " update SnsComment set isRead = 1, isReminding = 0 where isRead = 0");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateToRead", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return A;
    }

    public boolean y0(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteBySnsId", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        boolean A = this.f166156d.A("SnsComment", "delete from SnsComment where snsID = " + j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteBySnsId", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return A;
    }

    public boolean z0(long j17, long j18, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteComment", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        java.lang.String str = i17 == 9 ? "(2)" : "";
        if (i17 == 10) {
            str = str + "(8,16)";
        }
        boolean A = this.f166156d.A("SnsComment", "delete from SnsComment where snsID = " + j17 + " and commentSvrID = " + j18 + " and type in " + str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteComment", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        return A;
    }
}
