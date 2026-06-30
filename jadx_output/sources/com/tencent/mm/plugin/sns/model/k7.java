package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public final class k7 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.model.k7 f164367a = new com.tencent.mm.plugin.sns.model.k7();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f164368b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f164369c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f164370d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f164371e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f164372f;

    static {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("SnsWsFoldManager");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        f164368b = M;
        f164369c = 2;
        f164370d = 604800000L;
        f164371e = 604800000L;
        f164372f = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public final void a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        java.lang.String str;
        com.tencent.mm.sdk.platformtools.o4 o4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickWsFriendDetails", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        if (e(snsInfo, "clickWsFriendDetails")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickWsFriendDetails", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            return;
        }
        java.lang.String userName = snsInfo.getUserName();
        kotlin.jvm.internal.o.d(userName);
        java.lang.String d17 = d(userName);
        com.tencent.mm.sdk.platformtools.o4 o4Var2 = f164368b;
        java.lang.String string = o4Var2.getString(d17, "");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (android.text.TextUtils.isEmpty(string)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", "userName=" + userName + ", first clickWsFriendDetails and record, now = " + currentTimeMillis);
            long j17 = snsInfo.field_snsId;
            java.lang.String h17 = ca4.z0.h(c01.id.c());
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", "[clickWsFriendDetails] report27795 feedId = " + snsInfo.field_snsId + ", userName = " + userName + ", scene = " + i17 + ", session = " + h17);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27795, 2, java.lang.Long.valueOf(snsInfo.field_snsId), userName, h17, java.lang.Integer.valueOf(i17), 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            o4Var2.D(d17, userName + ',' + currentTimeMillis + ",-1,0," + j17 + ",2");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", "userName=" + userName + ", second clickWsFriendDetails and record, now = " + currentTimeMillis);
            com.tencent.mm.plugin.sns.model.b8 a17 = com.tencent.mm.plugin.sns.model.b8.f164102g.a(string);
            if (currentTimeMillis - a17.b() > f164371e) {
                java.lang.String h18 = ca4.z0.h(c01.id.c());
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[clickWsFriendDetails] report27795 feedId = ");
                str = d17;
                o4Var = o4Var2;
                sb6.append(snsInfo.field_snsId);
                sb6.append(", userName = ");
                sb6.append(userName);
                sb6.append(", scene = ");
                sb6.append(i17);
                sb6.append(", session = ");
                sb6.append(h18);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", sb6.toString());
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27795, 2, java.lang.Long.valueOf(snsInfo.field_snsId), userName, h18, java.lang.Integer.valueOf(i17), 1);
            } else {
                str = d17;
                o4Var = o4Var2;
            }
            a17.c(currentTimeMillis);
            a17.e(snsInfo.field_snsId);
            a17.d(2);
            o4Var.D(str, a17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickWsFriendDetails", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
    }

    public final void b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        java.lang.String str;
        com.tencent.mm.sdk.platformtools.o4 o4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doWsFriendInteractive", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        if (e(snsInfo, "doWsFriendInteractive")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWsFriendInteractive", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            return;
        }
        java.lang.String userName = snsInfo.getUserName();
        kotlin.jvm.internal.o.d(userName);
        java.lang.String d17 = d(userName);
        com.tencent.mm.sdk.platformtools.o4 o4Var2 = f164368b;
        java.lang.String string = o4Var2.getString(d17, "");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (android.text.TextUtils.isEmpty(string)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", "userName=" + userName + ", first doWsFriendInteractive and record, now = " + currentTimeMillis);
            long j17 = snsInfo.field_snsId;
            java.lang.String h17 = ca4.z0.h(c01.id.c());
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", "[doWsFriendInteractive] report27795 feedId = " + snsInfo.field_snsId + ", userName = " + userName + ", scene = " + i17 + ", session = " + h17);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27795, 3, java.lang.Long.valueOf(snsInfo.field_snsId), userName, h17, java.lang.Integer.valueOf(i17), 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            o4Var2.D(d17, userName + ',' + currentTimeMillis + ",-1,0," + j17 + ",3");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", "userName=" + userName + ", second doWsFriendInteractive and record, now = " + currentTimeMillis);
            com.tencent.mm.plugin.sns.model.b8 a17 = com.tencent.mm.plugin.sns.model.b8.f164102g.a(string);
            if (currentTimeMillis - a17.b() > f164371e) {
                java.lang.String h18 = ca4.z0.h(c01.id.c());
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doWsFriendInteractive] report27795 feedId = ");
                str = d17;
                o4Var = o4Var2;
                sb6.append(snsInfo.field_snsId);
                sb6.append(", userName = ");
                sb6.append(userName);
                sb6.append(", scene = ");
                sb6.append(i17);
                sb6.append(", session = ");
                sb6.append(h18);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", sb6.toString());
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27795, 3, java.lang.Long.valueOf(snsInfo.field_snsId), userName, h18, java.lang.Integer.valueOf(i17), 1);
            } else {
                str = d17;
                o4Var = o4Var2;
            }
            a17.c(currentTimeMillis);
            a17.e(snsInfo.field_snsId);
            a17.d(3);
            o4Var.D(str, a17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doWsFriendInteractive", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
    }

    public final void c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.model.b8 b8Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("forwardWsFriendContent", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        if (e(snsInfo, "forwardWsFriendContent")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("forwardWsFriendContent", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            return;
        }
        java.lang.String userName = snsInfo.getUserName();
        kotlin.jvm.internal.o.d(userName);
        java.lang.String d17 = d(userName);
        com.tencent.mm.sdk.platformtools.o4 o4Var = f164368b;
        java.lang.String string = o4Var.getString(d17, "");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (android.text.TextUtils.isEmpty(string)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", "userName=" + userName + ", first forwardWsFriendContent and record, now = " + currentTimeMillis);
            long j17 = snsInfo.field_snsId;
            java.lang.String h17 = ca4.z0.h(c01.id.c());
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", "[doWsFriendInteractive] report27795 feedId = " + snsInfo.field_snsId + ", userName = " + userName + ", scene = " + i17 + ", session = " + h17);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27795, 4, java.lang.Long.valueOf(snsInfo.field_snsId), userName, h17, java.lang.Integer.valueOf(i17), 1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.model.WsFoldData");
            o4Var.D(d17, userName + ',' + currentTimeMillis + ",-1,0," + j17 + ",4");
        } else {
            com.tencent.mm.plugin.sns.model.b8 a17 = com.tencent.mm.plugin.sns.model.b8.f164102g.a(string);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", "userName=" + userName + ", first forwardWsFriendContent and record, now = " + currentTimeMillis);
            if (currentTimeMillis - a17.b() > f164371e) {
                java.lang.String h18 = ca4.z0.h(c01.id.c());
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldManager", "[doWsFriendInteractive] report27795 feedId = " + snsInfo.field_snsId + ", userName = " + userName + ", scene = " + i17 + ", session = " + h18);
                b8Var = a17;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27795, 4, java.lang.Long.valueOf(snsInfo.field_snsId), userName, h18, java.lang.Integer.valueOf(i17), 1);
            } else {
                b8Var = a17;
            }
            b8Var.c(currentTimeMillis);
            b8Var.e(snsInfo.field_snsId);
            b8Var.d(4);
            o4Var.D(d17, b8Var.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("forwardWsFriendContent", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
    }

    public final java.lang.String d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("generateMMKVKey", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        java.lang.String str2 = "key_prefix_username_" + str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateMMKVKey", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        return str2;
    }

    public final boolean e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsInfoInValid", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        if (snsInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsWsFoldManager", "[" + str + "] snsInfo empty and return function");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsInfoInValid", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            return true;
        }
        if (!snsInfo.isWsFeedType()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsWsFoldManager", "[" + str + "] snsInfo is not wsFeedType and return function");
        }
        if (!android.text.TextUtils.isEmpty(snsInfo.getUserName())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsInfoInValid", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsWsFoldManager", "[" + str + "] userName empty and return function");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsInfoInValid", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        return true;
    }
}
