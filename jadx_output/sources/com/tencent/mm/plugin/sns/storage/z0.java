package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class z0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f166182e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.sns.storage.AdSnsInfo.info, "adsnsinfo")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f166183f = {"CREATE INDEX IF NOT EXISTS serverAdSnsNameIndex ON AdSnsInfo ( snsId )", "CREATE INDEX IF NOT EXISTS serverAdSnsTimeHeadIndex ON AdSnsInfo ( head )", "DROP INDEX IF EXISTS serverAdSnsTimeIndex", "DROP INDEX IF EXISTS serverAdSnsTimeSourceTypeIndex", "CREATE INDEX IF NOT EXISTS adsnsMultiIndex1 ON AdSnsInfo ( createTime,snsId,sourceType,type)", "CREATE INDEX IF NOT EXISTS adsnsMultiIndex2 ON AdSnsInfo ( sourceType,type,userName)"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f166184d;

    static {
        java.lang.String.format("select  %s %s,rowid from AdSnsInfo ", "snsId", "createTime");
    }

    public z0(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.sns.storage.AdSnsInfo.info, "adsnsinfo", f166183f);
        this.f166184d = k0Var;
    }

    public android.database.Cursor D0(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInTime", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        android.database.Cursor f17 = this.f166184d.f(("select *,rowid from AdSnsInfo  where createTime > " + i18 + " and createTime <= " + i17 + " and " + com.tencent.mm.plugin.sns.storage.f2.f165993z) + " order by  createTime desc", null, 2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInTime", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return f17;
    }

    public android.database.Cursor J0(int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdInTimeWithLimit", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        android.database.Cursor f17 = this.f166184d.f(("select *,rowid from AdSnsInfo  where createTime > " + i18 + " and createTime <= " + i17 + " and " + com.tencent.mm.plugin.sns.storage.f2.f165993z) + " order by  createTime desc limit " + i19, null, 2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdInTimeWithLimit", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return f17;
    }

    public com.tencent.mm.plugin.sns.storage.AdSnsInfo L0(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo = new com.tencent.mm.plugin.sns.storage.AdSnsInfo();
        android.database.Cursor f17 = this.f166184d.f("select *,rowid from AdSnsInfo  where AdSnsInfo.rowid=" + i17, null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
            return null;
        }
        adSnsInfo.convertFrom(f17);
        f17.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByLocalId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return adSnsInfo;
    }

    public boolean P0(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsIdExist", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        android.database.Cursor f17 = this.f166184d.f("select *,rowid from AdSnsInfo  where AdSnsInfo.snsId=" + j17, null, 2);
        boolean moveToFirst = f17.moveToFirst();
        f17.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsIdExist", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return moveToFirst;
    }

    public boolean W0(long j17, com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo) {
        int l17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replaceUserBySnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        if (P0(j17)) {
            boolean b17 = b1(j17, adSnsInfo);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceUserBySnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
            return b17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorage", "added SnsId " + j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("set", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        if (adSnsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("set", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
            l17 = -1;
        } else {
            l17 = (int) this.f166184d.l(dm.n.TABLE_NAME, "", adSnsInfo.convertTo());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("set", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        }
        boolean z17 = l17 != -1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceUserBySnsId", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return z17;
    }

    public boolean b1(long j17, com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        android.content.ContentValues convertTo = adSnsInfo.convertTo();
        convertTo.remove("rowid");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        boolean z17 = this.f166184d.p(dm.n.TABLE_NAME, convertTo, "snsId=?", new java.lang.String[]{sb6.toString()}) > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return z17;
    }

    /* JADX WARN: Finally extract failed */
    @Override // l75.n0
    public boolean delete(long j17) {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delete", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        java.lang.String t07 = ca4.z0.t0(j17);
        java.util.HashMap hashMap = p34.o.f351686a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delAd", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (!android.text.TextUtils.isEmpty(t07)) {
                java.util.HashMap hashMap2 = p34.o.f351686a;
                synchronized (hashMap2) {
                    try {
                        hashMap2.remove(t07);
                        p34.o.f351687b.remove(t07);
                        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("sns_ad_mmkv");
                        M.getClass();
                        M.remove(t07);
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delAd", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
                        throw th6;
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("SnsAdLocalStoreage", "delAd, snsId=" + t07 + ", cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("SnsAdLocalStoreage", "delAd, exp=" + th7.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delAd", "com.tencent.mm.plugin.sns.ad.SnsAdLocalStoreage");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
        }
        ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).e7(j17, o75.b.f343584e);
        int delete = this.f166184d.delete(dm.n.TABLE_NAME, "snsId=?", new java.lang.String[]{"" + j17});
        com.tencent.mars.xlog.Log.i("MicroMsg.AdSnsInfoStorage", "del msg " + j17 + " res " + delete);
        boolean z17 = delete > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delete", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return z17;
    }

    @Override // l75.n0
    public /* bridge */ /* synthetic */ boolean update(long j17, l75.f0 f0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        boolean b17 = b1(j17, (com.tencent.mm.plugin.sns.storage.AdSnsInfo) f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return b17;
    }

    public com.tencent.mm.plugin.sns.storage.AdSnsInfo y0(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo = new com.tencent.mm.plugin.sns.storage.AdSnsInfo();
        android.database.Cursor f17 = this.f166184d.f("select *,rowid from AdSnsInfo  where AdSnsInfo.snsId=" + j17, null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
            return null;
        }
        adSnsInfo.convertFrom(f17);
        f17.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage");
        return adSnsInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r5 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int z0() {
        /*
            r8 = this;
            java.lang.String r0 = "getAdCount, exp="
            java.lang.String r1 = "select count(*) from AdSnsInfo where "
            java.lang.String r2 = "getAdCount"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdSnsInfoStorage"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r4 = 0
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            java.lang.String r1 = com.tencent.mm.plugin.sns.storage.f2.f165993z     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r6.append(r1)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            l75.k0 r6 = r8.f166184d     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r7 = 2
            android.database.Cursor r5 = r6.f(r1, r5, r7)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r5 == 0) goto L30
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            if (r1 == 0) goto L30
            int r0 = r5.getInt(r4)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L38
            r4 = r0
        L30:
            if (r5 == 0) goto L4d
        L32:
            r5.close()
            goto L4d
        L36:
            r0 = move-exception
            goto L51
        L38:
            r1 = move-exception
            java.lang.String r6 = "MicroMsg.AdSnsInfoStorage"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L36
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L36
            r7.append(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L36
            com.tencent.mars.xlog.Log.e(r6, r0)     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L4d
            goto L32
        L4d:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L51:
            if (r5 == 0) goto L56
            r5.close()
        L56:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.storage.z0.z0():int");
    }
}
