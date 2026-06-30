package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes10.dex */
public final class dj0 extends l75.n0 implements zy2.cb {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f126657g = {l75.n0.getCreateSQLs(qb2.x1.K, "FinderSessionInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f126658d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f126659e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f126660f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj0(l75.k0 db6) {
        super(db6, qb2.x1.K, "FinderSessionInfo", dm.b5.f235853u);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = qb2.x1.K;
        this.f126658d = db6;
        this.f126659e = new java.util.concurrent.ConcurrentHashMap();
        this.f126660f = new java.util.concurrent.ConcurrentHashMap();
    }

    public java.util.LinkedList D0(java.lang.String senderUserName) {
        kotlin.jvm.internal.o.g(senderUserName, "senderUserName");
        if (senderUserName.length() == 0) {
            return null;
        }
        java.lang.String sql = "select * , rowid from FinderSessionInfo where senderUserName = '" + senderUserName + "' ";
        java.util.LinkedList linkedList = new java.util.LinkedList();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.database.Cursor B = this.f126658d.B(sql, null);
        try {
            java.lang.String name = java.lang.Thread.currentThread().getName();
            kotlin.jvm.internal.o.f(name, "getName(...)");
            kotlin.jvm.internal.o.g(sql, "sql");
            new qb2.r("FinderSessionInfoStorage.getSessionInfoBySenderUserName", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
            while (B.moveToNext()) {
                qb2.x1 x1Var = new qb2.x1();
                x1Var.convertFrom(B);
                linkedList.add(x1Var);
            }
            vz5.b.a(B, null);
            return linkedList;
        } finally {
        }
    }

    public qb2.x1 J0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return new qb2.x1();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f126660f;
        qb2.x1 x1Var = (qb2.x1) concurrentHashMap.get(str);
        if (x1Var == null) {
            java.lang.String sql = "select * , rowid from FinderSessionInfo where sessionId = '" + str + "' ";
            x1Var = new qb2.x1();
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            android.database.Cursor B = this.f126658d.B(sql, null);
            try {
                java.lang.String name = java.lang.Thread.currentThread().getName();
                kotlin.jvm.internal.o.f(name, "getName(...)");
                kotlin.jvm.internal.o.g(sql, "sql");
                new qb2.r("FinderSessionInfoStorage.getSessionInfoBySessionId", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
                if (B.moveToFirst()) {
                    x1Var.convertFrom(B);
                }
                vz5.b.a(B, null);
                if (x1Var.systemRowid > 0) {
                    concurrentHashMap.put(str, x1Var);
                    this.f126659e.put(x1Var.field_talker + '_' + x1Var.field_senderUserName, x1Var);
                }
            } finally {
            }
        }
        return x1Var;
    }

    public void L0(java.lang.String sessionId, java.lang.String talker, int i17, int i18, zy2.bb source, int i19, int i27, java.lang.String senderUserName, int i28, boolean z17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(senderUserName, "senderUserName");
        qb2.x1 x1Var = new qb2.x1();
        x1Var.field_sessionId = sessionId;
        x1Var.field_talker = talker;
        x1Var.field_type = i17;
        x1Var.field_updateTime = c01.id.c();
        x1Var.field_selfUsername = g92.b.f269769e.U();
        x1Var.field_actionPermission = i18;
        x1Var.field_rejectMsg = i19;
        x1Var.field_disableSendMsg = i27;
        x1Var.field_senderUserName = senderUserName;
        x1Var.field_senderRoleType = com.tencent.mm.storage.z3.S3(senderUserName) ? 3 : com.tencent.mm.storage.z3.T3(senderUserName) ? 2 : 1;
        x1Var.field_followFlag = i28;
        x1Var.field_disableSendmsgNeedFollow = z17;
        if (com.tencent.mm.storage.z3.V3(talker)) {
            throw new java.lang.RuntimeException(talker.concat(" is invalid"));
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        boolean replace = replace(x1Var, false);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        new qb2.r("FinderSessionInfoStorage.replaceSessionInfo", r26.i0.u("replace", ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        if (replace) {
            this.f126659e.remove(x1Var.field_talker + '_' + x1Var.field_senderUserName);
            this.f126660f.remove(sessionId);
            doNotify(x1Var.field_sessionId);
        }
        if (source == zy2.bb.f477357g) {
            com.tencent.mm.plugin.finder.storage.t80 Kj = ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
            qb2.t D0 = Kj.D0(sessionId);
            D0.field_talker = talker;
            D0.field_actionPermission = i18;
            D0.field_type = i17;
            if (!Kj.replace(D0, false)) {
                com.tencent.mars.xlog.Log.e("Finder.SessionStorage", "[replaceSessionInfo] fail! sessionId=".concat(sessionId));
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.SessionStorage", "[replaceSessionInfo] source=" + source + ", ret=" + replace + ", sessionId=" + sessionId + ", talker=" + talker + ", actionPermission=" + i18 + ", type=" + i17 + ", followType=" + i28);
    }

    public void P0(java.lang.String sessionId, int i17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        qb2.x1 J0 = J0(sessionId);
        J0.field_rejectMsg = i17;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        boolean updateNotify = updateNotify(J0, false, new java.lang.String[0]);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        new qb2.r("FinderSessionInfoStorage.updateOpType", r26.i0.u("updateNotify", ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        if (updateNotify) {
            this.f126659e.remove(J0.field_talker + '_' + J0.field_senderUserName);
            this.f126660f.remove(J0.field_sessionId);
            doNotify(J0.field_sessionId);
        }
    }

    public void W0(java.lang.String sessionId, int i17, int i18, int i19, boolean z17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        qb2.x1 J0 = J0(sessionId);
        J0.field_rejectMsg = i17;
        J0.field_actionPermission = i18;
        J0.field_followFlag = i19;
        J0.field_disableSendmsgNeedFollow = z17;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        updateNotify(J0, false, new java.lang.String[0]);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        new qb2.r("FinderSessionInfoStorage.updateOpTypeAndAction", r26.i0.u("updateNotify", ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        if (updateNotify(J0, false, new java.lang.String[0])) {
            this.f126659e.remove(J0.field_talker + '_' + J0.field_senderUserName);
            this.f126660f.remove(J0.field_sessionId);
            doNotify(J0.field_sessionId);
        }
    }

    public boolean y0(java.lang.String sessionId, boolean z17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        qb2.x1 J0 = J0(sessionId);
        this.f126660f.remove(sessionId);
        this.f126659e.remove(J0.field_talker + '_' + J0.field_senderUserName);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        boolean delete = delete(J0, z17, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        new qb2.r("FinderSessionInfoStorage.deleteSession", r26.i0.u("updateNotify", ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        return delete;
    }

    public java.lang.String z0(java.lang.String str, int i17) {
        qb2.x1 x1Var;
        if (str == null || str.length() == 0) {
            x1Var = new qb2.x1();
        } else {
            java.lang.String U = i17 != 1 ? i17 != 2 ? i17 != 3 ? "" : g92.b.f269769e.U() : c01.z1.k() : c01.z1.r();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f126659e;
            qb2.x1 x1Var2 = (qb2.x1) concurrentHashMap.get(str + '_' + U);
            if (x1Var2 == null) {
                long uptimeMillis = android.os.SystemClock.uptimeMillis();
                java.lang.String sql = "select * , rowid from FinderSessionInfo  where talker = '" + str + "' and senderUserName = '" + U + '\'';
                android.database.Cursor B = this.f126658d.B(sql, null);
                try {
                    java.lang.String name = java.lang.Thread.currentThread().getName();
                    kotlin.jvm.internal.o.f(name, "getName(...)");
                    kotlin.jvm.internal.o.g(sql, "sql");
                    new qb2.r("FinderSessionInfoStorage.getSessionInfoByTalker", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
                    if (B.moveToFirst()) {
                        qb2.x1 x1Var3 = new qb2.x1();
                        x1Var3.convertFrom(B);
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f126660f;
                        java.lang.String field_sessionId = x1Var3.field_sessionId;
                        kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
                        concurrentHashMap2.put(field_sessionId, x1Var3);
                        concurrentHashMap.put(str + '_' + U, x1Var3);
                        vz5.b.a(B, null);
                        x1Var = x1Var3;
                    } else {
                        vz5.b.a(B, null);
                        x1Var = null;
                    }
                } catch (java.lang.Throwable th6) {
                    try {
                        throw th6;
                    } catch (java.lang.Throwable th7) {
                        vz5.b.a(B, th6);
                        throw th7;
                    }
                }
            } else {
                x1Var = x1Var2;
            }
        }
        java.lang.String str2 = x1Var != null ? x1Var.field_sessionId : null;
        return str2 == null ? "" : str2;
    }
}
