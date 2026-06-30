package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class f2 extends l75.n0 implements p94.l0 {
    public static final java.lang.String A;
    public static final java.lang.String B;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f165981n;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f165986s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.String f165987t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String f165988u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String f165989v;

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String f165990w;

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String f165991x;

    /* renamed from: y, reason: collision with root package name */
    public static final java.lang.String f165992y;

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String f165993z;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.p2 f165994d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f165995e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f165996f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.wcdb.database.SQLiteTrace f165997g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f165978h = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.sns.storage.SnsInfo.info, dm.va.TABLE_NAME)};

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f165979i = {"snsId", "userName", "localFlag", "createTime", "head", "localPrivate", "type", "sourceType", "likeFlag", "pravited", "stringSeq", "content", "attrBuf", "postBuf", "rowid"};

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f165980m = {"CREATE INDEX IF NOT EXISTS serverSnsNameIndex ON SnsInfo ( snsId )", "CREATE INDEX IF NOT EXISTS serverSnsTimeHeadIndex ON SnsInfo ( head )", "DROP INDEX IF EXISTS serverSnsTimeIndex", "DROP INDEX IF EXISTS serverSnsTimeSourceTypeIndex", "CREATE INDEX IF NOT EXISTS snsMultiIndex1 ON SnsInfo ( createTime,snsId,sourceType,type)", "CREATE INDEX IF NOT EXISTS snsMultiIndex2 ON SnsInfo ( sourceType,type,userName)", "CREATE INDEX IF NOT EXISTS snsMultiIndex3 ON SnsInfo ( userName,sourceType)", "CREATE INDEX IF NOT EXISTS snsLocalflagIndex ON SnsInfo ( localFlag )"};

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.String f165982o = " order by SnsInfo.createTime desc ,snsId desc";

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.String f165983p = " order by SnsInfo.createTime asc ,snsId asc";

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.String f165984q = " order by SnsInfo.head desc ,SnsInfo.createTime desc ";

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.String f165985r = " order by SnsInfo.head desc ,snsId desc";
    public static final java.lang.String C = " (type = 7 ) ";
    public static final int D = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_sql_trace_report_threshold, 10);
    public static final boolean E = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_sql_trace_report_enable, false);
    public static final java.util.ArrayList F = X1(java.util.Arrays.asList(16, 32, 2, 8, 64, 128, 256, 512, 2048));
    public static final java.util.ArrayList G = X1(java.util.Arrays.asList(2, 4, 8, 16, 64, 128, 256));

    static {
        f165981n = "";
        f165991x = null;
        int i17 = 0;
        f165981n = "select ";
        while (true) {
            java.lang.String[] strArr = f165979i;
            if (i17 >= strArr.length) {
                break;
            }
            if (i17 < strArr.length - 1) {
                f165981n += " " + strArr[i17] + ",";
            } else {
                f165981n += " " + strArr[i17] + " ";
            }
            i17++;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorage", "TIMELINE_SELECT_BEGIN " + f165981n);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = F.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if ((intValue & 16) != 0 && (intValue & 32) == 0 && (intValue & 512) == 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue));
            }
        }
        java.lang.String y07 = y0(arrayList, "localFlag");
        f165986s = y07;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", y07);
        arrayList.clear();
        java.util.Iterator it6 = F.iterator();
        while (it6.hasNext()) {
            int intValue2 = ((java.lang.Integer) it6.next()).intValue();
            if ((intValue2 & 32) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue2));
            }
        }
        java.lang.String y08 = y0(arrayList, "localFlag");
        f165988u = y08;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", y08);
        arrayList.clear();
        java.util.Iterator it7 = F.iterator();
        while (it7.hasNext()) {
            int intValue3 = ((java.lang.Integer) it7.next()).intValue();
            if ((intValue3 & 64) == 0 && (intValue3 & 32) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue3));
            }
        }
        f165992y = y0(arrayList, "localFlag");
        arrayList.clear();
        java.util.Iterator it8 = F.iterator();
        while (it8.hasNext()) {
            int intValue4 = ((java.lang.Integer) it8.next()).intValue();
            if ((intValue4 & 2048) != 0 && (intValue4 & 32) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue4));
            }
        }
        B = y0(arrayList, "localFlag");
        arrayList.clear();
        java.util.Iterator it9 = G.iterator();
        while (it9.hasNext()) {
            int intValue5 = ((java.lang.Integer) it9.next()).intValue();
            if ((intValue5 & 8) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue5));
            }
        }
        java.lang.String y09 = y0(arrayList, "sourceType");
        f165990w = y09;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", y09);
        arrayList.clear();
        java.util.Iterator it10 = G.iterator();
        while (it10.hasNext()) {
            int intValue6 = ((java.lang.Integer) it10.next()).intValue();
            if ((intValue6 & 2) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue6));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", y0(arrayList, "sourceType"));
        arrayList.clear();
        java.util.Iterator it11 = G.iterator();
        while (it11.hasNext()) {
            int intValue7 = ((java.lang.Integer) it11.next()).intValue();
            if ((intValue7 & 4) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue7));
            }
        }
        java.lang.String y010 = y0(arrayList, "sourceType");
        f165989v = y010;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorage", "auto optimalize sql %s", y010);
        arrayList.clear();
        java.util.Iterator it12 = F.iterator();
        while (it12.hasNext()) {
            int intValue8 = ((java.lang.Integer) it12.next()).intValue();
            if ((intValue8 & 256) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue8));
            }
        }
        f165993z = z0(arrayList, "localFlag", true);
        arrayList.clear();
        java.util.Iterator it13 = G.iterator();
        while (it13.hasNext()) {
            int intValue9 = ((java.lang.Integer) it13.next()).intValue();
            if ((intValue9 & 16) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue9));
            }
        }
        A = y0(arrayList, "sourceType");
        arrayList.clear();
        java.util.Iterator it14 = G.iterator();
        while (it14.hasNext()) {
            int intValue10 = ((java.lang.Integer) it14.next()).intValue();
            if ((intValue10 & 64) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue10));
            }
        }
        f165991x = y0(arrayList, "sourceType");
        arrayList.clear();
        java.util.Iterator it15 = F.iterator();
        while (it15.hasNext()) {
            int intValue11 = ((java.lang.Integer) it15.next()).intValue();
            if ((intValue11 & 512) != 0) {
                arrayList.add(java.lang.Integer.valueOf(intValue11));
            }
        }
        f165987t = y0(arrayList, "localFlag");
    }

    public f2(com.tencent.mm.plugin.sns.storage.p2 p2Var) {
        super(p2Var, com.tencent.mm.plugin.sns.storage.SnsInfo.info, dm.va.TABLE_NAME, f165980m);
        boolean z17;
        int i17;
        this.f165996f = " from SnsInfo".toLowerCase();
        this.f165997g = new com.tencent.mm.plugin.sns.storage.h2(this);
        this.f165994d = p2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryAddDBCol", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        android.database.Cursor f17 = p2Var.f("PRAGMA table_info( SnsInfo )", null, 2);
        int columnIndex = f17.getColumnIndex(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        boolean z18 = false;
        while (f17.moveToNext()) {
            if (columnIndex >= 0 && dm.va.COL_SERVEREXTFLAG.equalsIgnoreCase(f17.getString(columnIndex))) {
                z18 = true;
            }
        }
        f17.close();
        long F2 = p2Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (!z18) {
            p2Var.A(dm.va.TABLE_NAME, "Alter table SnsInfo add serverExtFlag INT DEFAULT 0");
        }
        p2Var.w(java.lang.Long.valueOf(F2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryAddDBCol", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_init_delete_invalid_snsid, true);
        com.tencent.mm.plugin.sns.storage.p2 p2Var2 = this.f165994d;
        if (fj6) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteInvalidSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorage", "deleteInvalidSnsId result:%d", java.lang.Integer.valueOf(p2Var2.delete(dm.va.TABLE_NAME, "snsId=?", new java.lang.String[]{"9223372036854775807"})));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteInvalidSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        }
        android.database.Cursor f18 = p2Var2.f("select count(*) from SnsInfo where snsId > 0;", null, 2);
        if (!f18.moveToFirst() || (i17 = f18.getInt(0)) <= 0) {
            f18.close();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorage", "exsits snsId > 0  ,count is %d", java.lang.Integer.valueOf(i17));
            f18.close();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            z17 = true;
        }
        boolean z19 = !z17;
        this.f165995e = z19;
        if (z19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorage", "all sndId < 0 ,so optimalizeForSnsId");
        } else {
            f165982o = " order by SnsInfo.createTime desc ,case when snsId < 0 then 0 else 1 end ,  snsId desc";
            f165983p = " order by SnsInfo.createTime asc ,case when snsId < 0 then 0 else 1 end ,  snsId asc";
            f165984q = " order by SnsInfo.head desc ,SnsInfo.createTime desc ";
            f165985r = " order by SnsInfo.head desc ,case when snsId < 0 then 0 else 1 end ,  snsId desc";
        }
        if (com.tencent.mm.sdk.platformtools.t8.P(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_sns_sql_trace_switch, "0", true), 0) > 0) {
            d95.f.f227672r = this.f165997g;
        }
    }

    public static java.lang.String C1() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCON_TIMELINE", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFilterLucky", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.autogen.events.SnsLuckyCheckFilterEvent snsLuckyCheckFilterEvent = new com.tencent.mm.autogen.events.SnsLuckyCheckFilterEvent();
        snsLuckyCheckFilterEvent.e();
        snsLuckyCheckFilterEvent.f54823g.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFilterLucky", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCON_TIMELINE", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return " (sourceType & 2 != 0 ) ";
    }

    public static java.util.ArrayList X1(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getORIntRange", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it6 = hashSet.iterator();
            while (it6.hasNext()) {
                arrayList3.add(java.lang.Integer.valueOf(((java.lang.Integer) it6.next()).intValue() | num.intValue()));
            }
            hashSet.addAll(new java.util.HashSet(arrayList3));
            hashSet.add(num);
        }
        hashSet.add(0);
        arrayList2.addAll(hashSet);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getORIntRange", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return arrayList2;
    }

    public static java.lang.String y0(java.util.List list, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildLimitString", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String z07 = z0(list, str, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildLimitString", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z07;
    }

    public static java.lang.String z0(java.util.List list, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildLimitString", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("(");
        if (z17) {
            sb6.append(str + " not in (");
        } else {
            sb6.append(str + " in (");
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            sb6.append(it.next());
            if (it.hasNext()) {
                sb6.append(",");
            }
        }
        sb6.append("))");
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildLimitString", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return sb7;
    }

    public void D0(long j17, long j18, java.lang.String str, android.os.CancellationSignal cancellationSignal) {
        java.lang.String str2;
        int executeUpdateDelete;
        com.tencent.wcdb.support.CancellationSignal cancellationSignal2;
        int executeUpdateDelete2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanDbExpireExcludeSelf", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (str != null) {
            str2 = "DELETE FROM SnsInfo WHERE rowid IN (SELECT rowid FROM SnsInfo WHERE createTime < " + j17 + " AND userName != '" + str + "' LIMIT " + j18 + " OFFSET 20)";
        } else {
            str2 = "DELETE FROM SnsInfo WHERE rowid IN (SELECT rowid FROM SnsInfo WHERE createTime < " + j17 + " LIMIT " + j18 + ")";
        }
        com.tencent.mm.plugin.sns.storage.p2 p2Var = this.f165994d;
        p2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInnerDB", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInnerDB", "com.tencent.mm.plugin.sns.storage.SnsSqliteDB");
        l75.k0 k0Var = p2Var.f166100a;
        if (k0Var instanceof d95.b0) {
            com.tencent.wcdb.database.SQLiteStatement compileStatement = ((d95.b0) k0Var).P().compileStatement(str2);
            if (cancellationSignal != null) {
                try {
                    cancellationSignal2 = new com.tencent.wcdb.support.CancellationSignal();
                    cancellationSignal.setOnCancelListener(new com.tencent.mm.plugin.sns.storage.f2$$a(cancellationSignal2));
                    cancellationSignal.throwIfCanceled();
                } catch (java.lang.Throwable th6) {
                    if (compileStatement != null) {
                        try {
                            compileStatement.close();
                        } catch (java.lang.Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanDbExpireExcludeSelf", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    throw th6;
                }
            } else {
                cancellationSignal2 = null;
            }
            int i17 = 0;
            do {
                i17++;
                executeUpdateDelete2 = compileStatement.executeUpdateDelete(cancellationSignal2);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorage", "cleanSnsTablesByTimeLimit cleanDbExpire, %s, count:%s, limitCount:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(executeUpdateDelete2), java.lang.Long.valueOf(j18));
            } while (executeUpdateDelete2 > 0);
            compileStatement.close();
        } else if (k0Var instanceof d95.z) {
            com.tencent.wcdb.compat.SQLiteStatement compileStatement2 = ((d95.z) k0Var).f227718a.compileStatement(str2);
            int i18 = 0;
            do {
                i18++;
                try {
                    executeUpdateDelete = compileStatement2.executeUpdateDelete(cancellationSignal);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorage", "cleanSnsTablesByTimeLimit cleanDbExpire, %s, count:%s, limitCount:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(executeUpdateDelete), java.lang.Long.valueOf(j18));
                } catch (java.lang.Throwable th8) {
                    if (compileStatement2 != null) {
                        try {
                            compileStatement2.close();
                        } catch (java.lang.Throwable th9) {
                            th8.addSuppressed(th9);
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanDbExpireExcludeSelf", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                    throw th8;
                }
            } while (executeUpdateDelete > 0);
            compileStatement2.close();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorage", "cleanSnsTablesByTimeLimit cleanDbExpire vacuumResult:" + p2Var.A(dm.va.TABLE_NAME, "VACUUM"));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanDbExpireExcludeSelf", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public final java.lang.String D2(boolean z17, java.lang.String str, boolean z18, boolean z19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserMediaSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *,rowid from SnsInfo ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("conAlbumWhere", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String str2 = " WHERE " + f165991x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("conAlbumWhere", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        sb6.append(str2);
        java.lang.String str3 = sb6.toString() + " AND type in ( 1 , 54 , 15)";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserMediaSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return str3;
    }

    public void D3(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFilterTimeLineAbove", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (!b3(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFilterTimeLineAbove", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return;
        }
        C1();
        z3(" where " + o1(str) + " and  (sourceType & 2 != 0 )  and  (snsId != 0  ) ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFilterTimeLineAbove", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public long F2(long j17, int i17, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        long T1 = T1(G2(false, str, z17, false), j17, i17, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return T1;
    }

    public final java.lang.String G2(boolean z17, java.lang.String str, boolean z18, boolean z19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String str2 = ((z19 ? "select count(*) from SnsInfo " : "select *,rowid from SnsInfo ") + J0(str, z18)) + " AND type in ( 1,2 , 3 , 4 , 18 , 5 , 12 , 9 , 14 , 15 , 13 , 21 , 25 , 26,28,29,30 , 34,45,43,38,53,33,37,36,39,41,42,47,48,44,46,51,52,101,50,54,55,56,59,58)";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return str2;
    }

    public final java.lang.String J0(java.lang.String str, boolean z17) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("conUserWhere", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (z17) {
            str2 = " WHERE " + f165989v;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" WHERE SnsInfo.userName=\"");
            com.tencent.mm.sdk.platformtools.t8.n(str);
            sb6.append(str);
            sb6.append("\"");
            str2 = sb6.toString() + " AND " + f165990w;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("conUserWhere", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return str2;
    }

    public void J3() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFilterTimeLineAll", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        C1();
        z3(" where  (sourceType & 2 != 0 )  AND  (snsId != 0  ) ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFilterTimeLineAll", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public final android.database.Cursor K1(boolean z17, java.lang.String str, int i17, boolean z18, java.lang.String str2, int i18, int i19) {
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String G2 = G2(z17, str, z18, false);
        if (b3(str2)) {
            G2 = G2 + " AND " + p1(str2);
        }
        if (i18 != i19) {
            G2 = (G2 + " AND createTime <=  " + i19) + " AND createTime >=  " + i18;
        }
        if (z18) {
            str3 = G2 + f165984q;
        } else {
            str3 = G2 + f165985r;
        }
        if (i17 > 0) {
            str3 = str3 + " LIMIT " + i17;
        }
        android.database.Cursor B2 = this.f165994d.B(str3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return B2;
    }

    public void K3(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFilterTimeLineBelow", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (!b3(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFilterTimeLineBelow", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return;
        }
        C1();
        z3(" where " + u1(str) + " and  (sourceType & 2 != 0 )  and  (snsId != 0  ) ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFilterTimeLineBelow", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public boolean L0(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsInfoStorage", "deleteByLocalId localId:%s", java.lang.Integer.valueOf(i17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(i17);
        boolean z17 = this.f165994d.delete(dm.va.TABLE_NAME, "rowid=?", new java.lang.String[]{sb6.toString()}) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z17;
    }

    public final void N3(java.lang.String str, boolean z17, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFilterUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        this.f165994d.A(dm.va.TABLE_NAME, "UPDATE SnsInfo SET sourceType = sourceType & " + (~(z17 ? 4 : 8)) + str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFilterUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public boolean O2(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsIdExist", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        android.database.Cursor B2 = this.f165994d.B("select *,rowid from SnsInfo  where SnsInfo.snsId=" + j17, null);
        int count = B2.getCount();
        B2.close();
        boolean z17 = count > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsIdExist", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z17;
    }

    public void O3(java.lang.String str, boolean z17, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFilterUserNameAbove", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String str3 = J0(str, z17) + " AND  (snsId != 0  ) ";
        if (b3(str2)) {
            str3 = str3 + " AND " + o1(str2);
        }
        N3(str, z17, str3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFilterUserNameAbove", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public java.lang.Boolean P0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsInfoStorage", "deleteByUserName userName:%s", str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DELETE FROM SnsInfo where SnsInfo.userName=\"");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("\"");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f165994d.A(dm.va.TABLE_NAME, sb6.toString()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return valueOf;
    }

    public android.database.Cursor P1(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCursorByUserSearch", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String str3 = "select *,rowid from SnsInfo  WHERE " + A;
        if (b3(str)) {
            str3 = str3 + " AND " + z1(str);
        }
        if (b3(str2)) {
            str3 = str3 + " AND " + p1(str2);
        }
        android.database.Cursor B2 = this.f165994d.B(str3 + f165984q, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCursorByUserSearch", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return B2;
    }

    public android.database.Cursor S1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCursorByWsFoldDetailSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFullWsFoldSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFullWsFoldSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str4 = "select *,rowid from SnsInfo  where  (sourceType & 128 != 0 ) ";
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select *,rowid from SnsInfo  where  (sourceType & 128 != 0 )  AND SnsInfo.userName=\"");
            com.tencent.mm.sdk.platformtools.t8.n(str);
            sb6.append(str);
            sb6.append("\"");
            str4 = sb6.toString();
        }
        if (str2 == null || !str2.equals("")) {
            str4 = str4 + " AND " + z1(str2);
        }
        if (b3(str3)) {
            str4 = str4 + " AND " + p1(str3);
        }
        android.database.Cursor B2 = this.f165994d.B(str4 + " " + f165982o, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCursorByWsFoldDetailSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return B2;
    }

    public void S3(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFilterUserNameAll", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        N3(str, z17, J0(str, z17) + " AND  (snsId != 0  ) ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFilterUserNameAll", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public final long T1(java.lang.String str, long j17, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (j17 != 0) {
            str = str + " AND SnsInfo.stringSeq < '" + ca4.z0.A(ca4.z0.t0(j17)) + "'";
        }
        if (z17) {
            str = str + " AND  (snsId != 0 ) ";
        }
        android.database.Cursor B2 = this.f165994d.B((str + f165982o) + " limit " + i17, null);
        if (!B2.moveToLast()) {
            B2.close();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return 0L;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        snsInfo.convertFrom(B2);
        B2.close();
        long j18 = snsInfo.field_snsId;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return j18;
    }

    public boolean V2(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (snsInfo.isAd()) {
            boolean replace = com.tencent.mm.plugin.sns.model.l4.Vi().replace(snsInfo.getAdSnsInfo());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return replace;
        }
        boolean z17 = this.f165994d.m(dm.va.TABLE_NAME, "", snsInfo.convertTo()) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z17;
    }

    public void V3(java.lang.String str, boolean z17, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFilterUserNameBelow", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String str3 = J0(str, z17) + " AND  (snsId != 0  ) ";
        if (b3(str2)) {
            str3 = str3 + " AND " + u1(str2);
        }
        N3(str, z17, str3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFilterUserNameBelow", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }

    public com.tencent.mm.plugin.sns.storage.SnsInfo W0(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        android.database.Cursor f17 = this.f165994d.f("select *,rowid from SnsInfo  where SnsInfo.snsId=" + j17 + " limit 1", null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return null;
        }
        snsInfo.convertFrom(f17);
        f17.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return snsInfo;
    }

    public boolean Y2(long j17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replaceUserBySnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (O2(j17)) {
            boolean v37 = v3(j17, snsInfo);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceUserBySnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return v37;
        }
        boolean z17 = t3(snsInfo) != -1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceUserBySnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z17;
    }

    public com.tencent.mm.plugin.sns.storage.SnsInfo b1(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (com.tencent.mm.plugin.sns.storage.w2.g(str)) {
            com.tencent.mm.plugin.sns.storage.SnsInfo W0 = W0(com.tencent.mm.plugin.sns.storage.w2.n(str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return W0;
        }
        com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(com.tencent.mm.plugin.sns.storage.w2.n(str));
        if (y07 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo convertToSnsInfo = y07.convertToSnsInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return convertToSnsInfo;
    }

    public long b2() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsTableCount", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.database.Cursor f17 = this.f165994d.f("select count(*) from SnsInfo", null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorage", "sns table count %d passed %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        long j17 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTableCount", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return j17;
    }

    public final boolean b3(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seqAvailable", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (str == null || str.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seqAvailable", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seqAvailable", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return true;
    }

    public android.database.Cursor d1(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = f165981n;
        sb6.append(str2);
        sb6.append(" from SnsInfo where ");
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(sb7);
        C1();
        sb8.append(" (sourceType & 2 != 0 ) ");
        java.lang.String sb9 = sb8.toString();
        if (b3(str)) {
            sb9 = sb9 + " AND " + p1(str);
        }
        android.database.Cursor B2 = this.f165994d.B(((((sb9 + " AND createTime >= " + i17) + " UNION ") + str2 + " from AdSnsInfo where createTime > " + i17 + " and " + f165993z) + f165982o) + " limit " + i18, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return B2;
    }

    @Override // l75.n0
    public boolean delete(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delete", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsInfoStorage", "delete snsId:%s", java.lang.Long.valueOf(j17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        boolean z17 = this.f165994d.delete(dm.va.TABLE_NAME, "snsId=?", new java.lang.String[]{sb6.toString()}) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delete", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[Catch: all -> 0x00bc, TryCatch #0 {all -> 0x00bc, blocks: (B:3:0x0046, B:5:0x004c, B:8:0x0059, B:11:0x0067, B:13:0x0074, B:15:0x0078, B:18:0x0080, B:23:0x008c, B:26:0x009a, B:29:0x00a4, B:34:0x009f), top: B:2:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[Catch: all -> 0x00bc, TryCatch #0 {all -> 0x00bc, blocks: (B:3:0x0046, B:5:0x004c, B:8:0x0059, B:11:0x0067, B:13:0x0074, B:15:0x0078, B:18:0x0080, B:23:0x008c, B:26:0x009a, B:29:0x00a4, B:34:0x009f), top: B:2:0x0046 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList f1() {
        /*
            r12 = this;
            java.lang.String r0 = "getAllNeedResendSns"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.tencent.mm.plugin.sns.storage.p2 r3 = r12.f165994d
            java.lang.String r4 = "SnsInfo"
            java.lang.String r5 = "*"
            java.lang.String r6 = "rowid"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "createTime >=? AND "
            r6.<init>(r7)
            java.lang.String r7 = com.tencent.mm.plugin.sns.storage.f2.f165992y
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            int r7 = (int) r7
            r8 = 172800(0x2a300, float:2.42144E-40)
            int r7 = r7 - r8
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String[] r7 = new java.lang.String[]{r7}
            r8 = 0
            r9 = 0
            java.lang.String r10 = "createTime ASC"
            r11 = 2
            android.database.Cursor r3 = r3.D(r4, r5, r6, r7, r8, r9, r10, r11)
        L46:
            boolean r4 = r3.moveToNext()     // Catch: java.lang.Throwable -> Lbc
            if (r4 == 0) goto Lb2
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = new com.tencent.mm.plugin.sns.storage.SnsInfo     // Catch: java.lang.Throwable -> Lbc
            r4.<init>()     // Catch: java.lang.Throwable -> Lbc
            r4.convertFrom(r3)     // Catch: java.lang.Throwable -> Lbc
            int r5 = r4.localid     // Catch: java.lang.Throwable -> Lbc
            r6 = -1
            if (r5 == r6) goto L46
            java.lang.String r5 = r4.getUserName()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r6 = c01.z1.r()     // Catch: java.lang.Throwable -> Lbc
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> Lbc
            if (r5 == 0) goto L46
            java.lang.String r5 = "checkSnsInfoIsFakeVideo"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)     // Catch: java.lang.Throwable -> Lbc
            com.tencent.mm.protocal.protobuf.TimeLineObject r7 = r4.getTimeLine()     // Catch: java.lang.Throwable -> Lbc
            if (r7 == 0) goto L7b
            r45.a90 r7 = r7.ContentObj     // Catch: java.lang.Throwable -> Lbc
            if (r7 == 0) goto L7b
            java.util.LinkedList r7 = r7.f369840h     // Catch: java.lang.Throwable -> Lbc
            goto L7c
        L7b:
            r7 = 0
        L7c:
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L89
            boolean r10 = r7.isEmpty()     // Catch: java.lang.Throwable -> Lbc
            if (r10 == 0) goto L87
            goto L89
        L87:
            r10 = r9
            goto L8a
        L89:
            r10 = r8
        L8a:
            if (r10 != 0) goto L9f
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.Throwable -> Lbc
            r45.jj4 r7 = (r45.jj4) r7     // Catch: java.lang.Throwable -> Lbc
            int r7 = r7.f377856e     // Catch: java.lang.Throwable -> Lbc
            r10 = 8
            if (r7 != r10) goto L99
            goto L9a
        L99:
            r8 = r9
        L9a:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)     // Catch: java.lang.Throwable -> Lbc
            r9 = r8
            goto La2
        L9f:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)     // Catch: java.lang.Throwable -> Lbc
        La2:
            if (r9 != 0) goto L46
            int r5 = r4.localid     // Catch: java.lang.Throwable -> Lbc
            long r5 = (long) r5     // Catch: java.lang.Throwable -> Lbc
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lbc
            r2.add(r5)     // Catch: java.lang.Throwable -> Lbc
            r4.getLocalid()     // Catch: java.lang.Throwable -> Lbc
            goto L46
        Lb2:
            r3.close()
            r2.size()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        Lbc:
            r2 = move-exception
            r3.close()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.f2.f1():java.util.ArrayList");
    }

    public long f3(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seqToSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        long longValue = new java.math.BigInteger(str).longValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorage", "seq %s to snsId %d ", str, java.lang.Long.valueOf(longValue));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seqToSnsId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return longValue;
    }

    public long h2(long j17, int i17, boolean z17) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeLineMaxSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        o2();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaxSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        long j18 = 0;
        if (j17 != 0) {
            str = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 )  AND SnsInfo.stringSeq > '" + ca4.z0.A(ca4.z0.t0(j17)) + "'";
        } else {
            str = "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) ";
        }
        if (z17) {
            str = str + " AND  (snsId != 0 ) ";
        }
        android.database.Cursor B2 = this.f165994d.B((str + f165982o) + " limit " + i17, null);
        if (B2.moveToFirst()) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
            snsInfo.convertFrom(B2);
            B2.close();
            j18 = snsInfo.field_snsId;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaxSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        } else {
            B2.close();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaxSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLineMaxSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return j18;
    }

    public com.tencent.mm.plugin.sns.storage.SnsInfo i1(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        android.database.Cursor f17 = this.f165994d.f("select *,rowid from SnsInfo  where SnsInfo.rowid=" + i17, null, 2);
        if (f17.moveToFirst()) {
            snsInfo.convertFrom(f17);
            f17.close();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return snsInfo;
        }
        f17.close();
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsInfoStorage", "getByLocalId localId:%d find SnsInfo: null ", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return null;
    }

    public com.tencent.mm.plugin.sns.storage.SnsInfo k1(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (com.tencent.mm.plugin.sns.storage.w2.g(str)) {
            com.tencent.mm.plugin.sns.storage.SnsInfo i17 = i1(com.tencent.mm.plugin.sns.storage.w2.m(str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return i17;
        }
        com.tencent.mm.plugin.sns.storage.AdSnsInfo L0 = com.tencent.mm.plugin.sns.model.l4.Vi().L0(com.tencent.mm.plugin.sns.storage.w2.m(str));
        if (L0 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return null;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo convertToSnsInfo = L0.convertToSnsInfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return convertToSnsInfo;
    }

    public long k2(long j17, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeLineMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        o2();
        long T1 = T1("select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) ", j17, i17, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLineMinSeqByLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return T1;
    }

    public com.tencent.mm.plugin.sns.storage.SnsInfo n1(java.lang.String str) {
        android.database.Cursor D2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getByServerStrId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        if (this.f165995e) {
            com.tencent.mm.plugin.sns.storage.p2 p2Var = this.f165994d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(f3("" + str));
            sb6.append("");
            D2 = p2Var.D(dm.va.TABLE_NAME, null, "snsId=?", new java.lang.String[]{sb6.toString()}, null, null, null, 2);
        } else {
            D2 = this.f165994d.D(dm.va.TABLE_NAME, null, "stringSeq=?", new java.lang.String[]{"" + str}, null, null, null, 2);
        }
        if (!D2.moveToFirst()) {
            D2.close();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByServerStrId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return null;
        }
        snsInfo.convertFrom(D2);
        D2.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByServerStrId", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return snsInfo;
    }

    public final java.lang.String o1(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCDAboveExcudeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (str == null || str.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCDAboveExcudeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return " ";
        }
        if (this.f165995e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" (snsId > ");
            com.tencent.mm.sdk.platformtools.t8.n(str);
            sb6.append(f3(str));
            sb6.append(" ) ");
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCDAboveExcudeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return sb7;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(" (stringSeq >\"");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb8.append(str);
        sb8.append("\"  ) ");
        java.lang.String sb9 = sb8.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCDAboveExcudeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return sb9;
    }

    public final java.lang.String o2() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeLineSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        C1();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeLineSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return "select *,rowid from SnsInfo  where  (sourceType & 2 != 0 ) ";
    }

    public final java.lang.String p1(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCDAboveIncludeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (str == null || str.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCDAboveIncludeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return " ";
        }
        if (this.f165995e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" (snsId >= ");
            com.tencent.mm.sdk.platformtools.t8.n(str);
            sb6.append(f3(str));
            sb6.append(" ) ");
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCDAboveIncludeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return sb7;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(" (stringSeq >=\"");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb8.append(str);
        sb8.append("\"  ) ");
        java.lang.String sb9 = sb8.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCDAboveIncludeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return sb9;
    }

    @Override // l75.n0
    public /* bridge */ /* synthetic */ boolean replace(l75.f0 f0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        boolean V2 = V2((com.tencent.mm.plugin.sns.storage.SnsInfo) f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replace", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return V2;
    }

    public int t3(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("set", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("set", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return -1;
        }
        int l17 = (int) this.f165994d.l(dm.va.TABLE_NAME, "", snsInfo.convertTo());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("set", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return l17;
    }

    public final java.lang.String u1(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCDBelowExculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (str == null || str.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCDBelowExculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return " ";
        }
        if (this.f165995e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" (snsId < ");
            com.tencent.mm.sdk.platformtools.t8.n(str);
            sb6.append(f3(str));
            sb6.append(" ) ");
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCDBelowExculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return sb7;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(" (stringSeq <\"");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb8.append(str);
        sb8.append("\"  ) ");
        java.lang.String sb9 = sb8.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCDBelowExculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return sb9;
    }

    @Override // l75.n0
    public /* bridge */ /* synthetic */ boolean update(long j17, l75.f0 f0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        boolean v37 = v3(j17, (com.tencent.mm.plugin.sns.storage.SnsInfo) f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return v37;
    }

    public boolean v3(long j17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        android.content.ContentValues convertTo = snsInfo.convertTo();
        convertTo.remove("rowid");
        int p17 = this.f165994d.p(dm.va.TABLE_NAME, convertTo, "snsId=?", new java.lang.String[]{"" + j17});
        pb4.e.f353196a.k(snsInfo, true);
        boolean z17 = p17 > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return z17;
    }

    public int w3(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateByLocal", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        android.content.ContentValues convertTo = snsInfo.convertTo();
        convertTo.remove("rowid");
        int p17 = this.f165994d.p(dm.va.TABLE_NAME, convertTo, "rowid=?", new java.lang.String[]{"" + i17});
        pb4.e.f353196a.k(snsInfo, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateByLocal", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return p17;
    }

    public int y2(int i17, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserCountWithLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCheckUserDataCountSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String str2 = "select snsId from SnsInfo " + J0(str, z17) + " AND type in ( 1,2 , 3 , 4 , 18 , 5 , 12 , 9 , 14 , 15 , 13 , 21 , 25 , 26,28,29,30 , 34,45,43,38,53,33,37,36,39,41,42,47,48,44,46,51,52,101,50,54,55,56,59,58) and  (snsId != 0  )  limit " + i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCheckUserDataCountSql", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        android.database.Cursor B2 = this.f165994d.B(str2, null);
        int count = B2.getCount();
        B2.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserCountWithLimit", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return count;
    }

    public final java.lang.String z1(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCDBelowInculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        if (str == null || str.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCDBelowInculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return " ";
        }
        if (this.f165995e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" (snsId <= ");
            com.tencent.mm.sdk.platformtools.t8.n(str);
            sb6.append(f3(str));
            sb6.append(" ) ");
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCDBelowInculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            return sb7;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(" (stringSeq <=\"");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb8.append(str);
        sb8.append("\"  ) ");
        java.lang.String sb9 = sb8.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCDBelowInculdeSeq", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        return sb9;
    }

    public final void z3(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateFilterTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        this.f165994d.A(dm.va.TABLE_NAME, "UPDATE SnsInfo SET sourceType = sourceType & -3" + str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateFilterTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
    }
}
