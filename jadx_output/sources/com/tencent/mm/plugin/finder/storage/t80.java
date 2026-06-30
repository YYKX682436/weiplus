package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes10.dex */
public final class t80 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.q80 f128066e = new com.tencent.mm.plugin.finder.storage.q80(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f128067f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.p80 f128068g;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f128069d;

    static {
        l75.e0 e0Var = qb2.t.H1;
        f128067f = new java.lang.String[]{l75.n0.getCreateSQLs(qb2.t.H1, "FinderConversation")};
        f128068g = new com.tencent.mm.plugin.finder.storage.p80();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t80(l75.k0 db6) {
        super(db6, qb2.t.H1, "FinderConversation", dm.a4.K);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = qb2.t.H1;
        this.f128069d = db6;
        db6.A("FinderConversation", "CREATE INDEX IF NOT EXISTS FinderConversation_scene_type_senderUserName_index ON FinderConversation(scene,type,senderUserName)");
        db6.A("FinderConversation", "CREATE INDEX IF NOT EXISTS FinderConversation_scene_type_senderUserNameVersion_index ON FinderConversation(scene,type,senderUserNameVersion)");
        db6.A("FinderConversation", "CREATE INDEX IF NOT EXISTS FinderConversation_scene_type_talker_index ON FinderConversation(scene,type,talker)");
    }

    public qb2.t D0(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.lang.String sql = "select *, rowid from FinderConversation where sessionId = '" + sessionId + "' ";
        android.database.Cursor B = this.f128069d.B(sql, null);
        qb2.t tVar = new qb2.t(f128068g);
        tVar.field_sessionId = sessionId;
        if (B != null) {
            if (B.moveToFirst()) {
                tVar.convertFrom(B);
            }
            B.close();
        }
        java.lang.String name = java.lang.Thread.currentThread().getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        kotlin.jvm.internal.o.g(sql, "sql");
        new qb2.r("FinderConversationStorage.get", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        return tVar;
    }

    public int J0(int i17, java.lang.String finderUsername) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        m92.b b17 = g92.b.f269769e.b1(finderUsername, true);
        if (b17 == null) {
            return 0;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        p75.n0 n0Var = dm.a4.B;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.m c17 = dm.a4.H.i(java.lang.Integer.valueOf(i17)).c(dm.a4.G.i(1));
        p75.d dVar = dm.a4.I;
        java.lang.String field_finder_version_username_history = b17.field_finder_version_username_history;
        kotlin.jvm.internal.o.f(field_finder_version_username_history, "field_finder_version_username_history");
        p75.y yVar = (p75.y) c17;
        yVar.f(dVar.l(kz5.n0.S0(r26.n0.f0(field_finder_version_username_history, new java.lang.String[]{";"}, false, 0, 6, null))));
        p75.i0 g17 = dm.a4.B.g(linkedList);
        g17.f352657d = yVar;
        g17.d(linkedList2);
        g17.b(linkedList3);
        p75.l0 a17 = g17.a();
        java.util.List k17 = a17.k(this.f128069d, qb2.t.class);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        java.lang.String sql = a17.f352636a;
        kotlin.jvm.internal.o.g(sql, "sql");
        new qb2.r("FinderConversationStorage.getGreetConvCount", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        return ((java.util.ArrayList) k17).size();
    }

    public int L0(int i17, int i18, java.lang.String finderUsername) {
        p75.l0 a17;
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        if (i17 != 1) {
            m92.b b17 = g92.b.f269769e.b1(finderUsername, true);
            if (b17 == null) {
                return 0;
            }
            if (i18 >= 0) {
                p75.i0 h17 = dm.a4.B.h(dm.a4.D.y());
                p75.d dVar = dm.a4.I;
                java.lang.String field_finder_version_username_history = b17.field_finder_version_username_history;
                kotlin.jvm.internal.o.f(field_finder_version_username_history, "field_finder_version_username_history");
                h17.f352657d = dVar.l(r26.n0.f0(field_finder_version_username_history, new java.lang.String[]{";"}, false, 0, 6, null)).c(dm.a4.G.i(java.lang.Integer.valueOf(i18)).c(dm.a4.H.i(java.lang.Integer.valueOf(i17))));
                h17.f352656c = "Finder.ConversationStorage";
                a17 = h17.a();
            } else {
                p75.i0 h18 = dm.a4.B.h(dm.a4.D.y());
                p75.d dVar2 = dm.a4.I;
                java.lang.String field_finder_version_username_history2 = b17.field_finder_version_username_history;
                kotlin.jvm.internal.o.f(field_finder_version_username_history2, "field_finder_version_username_history");
                h18.f352657d = dVar2.l(r26.n0.f0(field_finder_version_username_history2, new java.lang.String[]{";"}, false, 0, 6, null)).c(dm.a4.H.i(java.lang.Integer.valueOf(i17)));
                h18.f352656c = "Finder.ConversationStorage";
                a17 = h18.a();
            }
        } else if (i18 >= 0) {
            p75.i0 h19 = dm.a4.B.h(dm.a4.D.y());
            h19.f352657d = dm.a4.G.i(java.lang.Integer.valueOf(i18)).c(dm.a4.H.i(java.lang.Integer.valueOf(i17)));
            h19.f352656c = "Finder.ConversationStorage";
            a17 = h19.a();
        } else {
            p75.i0 h27 = dm.a4.B.h(dm.a4.D.y());
            h27.f352657d = dm.a4.G.i(java.lang.Integer.valueOf(i18)).c(dm.a4.H.i(java.lang.Integer.valueOf(i17)));
            h27.f352656c = "Finder.ConversationStorage";
            a17 = h27.a();
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        int m17 = a17.m(this.f128069d);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        java.lang.String sql = a17.f352636a;
        kotlin.jvm.internal.o.g(sql, "sql");
        new qb2.r("FinderConversationStorage.getUnreadCount", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        com.tencent.mars.xlog.Log.i("Finder.ConversationStorage", "[getUnreadCount] type=" + i18 + " count=" + m17);
        return m17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [p75.d] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, kz5.p0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.ArrayList] */
    public java.util.List P0(java.lang.String finderUsername, int i17, int i18, int[] iArr, int i19) {
        java.util.List S0;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        ?? r66 = kz5.p0.f313996d;
        if (i19 == 1) {
            S0 = kz5.c0.i(c01.z1.r(), c01.z1.k());
        } else {
            m92.b b17 = g92.b.f269769e.b1(finderUsername, true);
            if (b17 == null) {
                return r66;
            }
            java.lang.String field_finder_version_username_history = b17.field_finder_version_username_history;
            kotlin.jvm.internal.o.f(field_finder_version_username_history, "field_finder_version_username_history");
            S0 = kz5.n0.S0(r26.n0.f0(field_finder_version_username_history, new java.lang.String[]{";"}, false, 0, 6, null));
        }
        if (iArr != null) {
            arrayList = new java.util.ArrayList();
            int length = iArr.length;
            for (int i27 = 0; i27 < length; i27++) {
                int i28 = iArr[i27];
                if (i28 >= 100) {
                    arrayList.add(java.lang.Integer.valueOf(i28));
                }
            }
        } else {
            arrayList = r66;
        }
        if (iArr != null) {
            r66 = new java.util.ArrayList();
            int length2 = iArr.length;
            for (int i29 = 0; i29 < length2; i29++) {
                int i37 = iArr[i29];
                if (i37 < 100) {
                    r66.add(java.lang.Integer.valueOf(i37));
                }
            }
        }
        p75.n0 n0Var = dm.a4.B;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        p75.m0 i38 = dm.a4.H.i(java.lang.Integer.valueOf(i19));
        p75.m0 l17 = dm.a4.I.l(S0);
        ?? r142 = dm.a4.G;
        p75.y yVar = (p75.y) i38.c(l17.c(r142.k(r66)));
        yVar.g(r142.k(arrayList), p75.o.f352678e);
        linkedList3.add(dm.a4.F.u());
        linkedList3.add(dm.a4.E.u());
        p75.i0 g17 = dm.a4.B.g(linkedList2);
        g17.f352657d = yVar;
        g17.f352659f = linkedList3;
        g17.f352660g = linkedList4;
        g17.c(i18, i17);
        p75.l0 a17 = g17.a();
        java.util.Iterator it = ((java.util.ArrayList) a17.k(this.f128069d, qb2.t.class)).iterator();
        while (it.hasNext()) {
            qb2.t tVar = (qb2.t) it.next();
            tVar.C1 = f128068g;
            tVar.u0();
            linkedList.add(tVar);
        }
        com.tencent.mars.xlog.Log.i("Finder.ConversationStorage", "SQL=" + a17);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.lang.String name = java.lang.Thread.currentThread().getName();
        kotlin.jvm.internal.o.f(name, "getName(...)");
        java.lang.String sql = a17.toString();
        kotlin.jvm.internal.o.g(sql, "sql");
        new qb2.r("FinderConversationStorage.queryLimit", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[query] finderUsername=");
        sb6.append(finderUsername);
        sb6.append(" offset=");
        sb6.append(i17);
        sb6.append(" pageCount=");
        sb6.append(i18);
        sb6.append(" type=");
        if (iArr != null) {
            arrayList2 = new java.util.ArrayList(iArr.length);
            for (int i39 : iArr) {
                arrayList2.add(java.lang.Integer.valueOf(i39));
            }
        } else {
            arrayList2 = null;
        }
        sb6.append(arrayList2);
        sb6.append(" list size=");
        sb6.append(linkedList.size());
        sb6.append(", scene=");
        sb6.append(i19);
        com.tencent.mars.xlog.Log.i("Finder.ConversationStorage", sb6.toString());
        return linkedList;
    }

    @Override // l75.n0
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public boolean replace(qb2.t tVar, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[replace] ");
        sb6.append(tVar != null ? com.tencent.mm.plugin.finder.storage.u80.a(tVar) : null);
        com.tencent.mars.xlog.Log.i("Finder.ConversationStorage", sb6.toString());
        boolean z18 = false;
        if (tVar == null) {
            return false;
        }
        android.content.ContentValues convertTo = tVar.convertTo();
        java.lang.String field_sessionId = tVar.field_sessionId;
        kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.lang.String sql = "select *, rowid from FinderConversation where sessionId = '" + field_sessionId + "' ";
        l75.k0 k0Var = this.f128069d;
        android.database.Cursor B = k0Var.B(sql, null);
        try {
            java.lang.String name = java.lang.Thread.currentThread().getName();
            kotlin.jvm.internal.o.f(name, "getName(...)");
            kotlin.jvm.internal.o.g(sql, "sql");
            new qb2.r("FinderConversationStorage.isExit", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
            boolean z19 = B.getCount() > 0;
            vz5.b.a(B, null);
            if (z19) {
                if (k0Var.p(getTableName(), convertTo, "sessionId = ?", new java.lang.String[]{"" + tVar.field_sessionId}) > 0) {
                    z18 = true;
                }
            } else {
                z18 = super.insertNotify(tVar, false);
            }
            if (z18 && z17) {
                doNotify(tVar.field_sessionId);
            }
            return z18;
        } finally {
        }
    }

    @Override // l75.n0
    public boolean deleteNotify(long j17, boolean z17) {
        qb2.t tVar = new qb2.t(f128068g);
        if (get(j17, tVar)) {
            tVar.u0();
        }
        com.tencent.mars.xlog.Log.i("Finder.ConversationStorage", "[delete] rowId=" + j17 + " isNotify=" + z17 + ' ' + com.tencent.mm.plugin.finder.storage.u80.a(tVar));
        return super.deleteNotify(j17, z17);
    }

    public boolean y0(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        boolean z17 = false;
        if (sessionId.length() == 0) {
            return false;
        }
        qb2.t D0 = D0(sessionId);
        int i17 = D0.field_unReadCount;
        D0.field_unReadCount = 0;
        D0.field_readStatus = 1;
        if (i17 != 0) {
            z17 = update(D0.systemRowid, D0, false);
            doNotify(D0.field_sessionId, 5, D0);
        }
        com.tencent.mars.xlog.Log.i("Finder.ConversationStorage", "[clearUnreadCount] ret=" + z17 + ' ' + i17 + " => " + D0.field_unReadCount + " sessionId=" + sessionId);
        return z17;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean delete(qb2.t tVar, boolean z17, java.lang.String... keys) {
        kotlin.jvm.internal.o.g(keys, "keys");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[delete] ");
        sb6.append(tVar != null ? com.tencent.mm.plugin.finder.storage.u80.a(tVar) : null);
        com.tencent.mars.xlog.Log.i("Finder.ConversationStorage", sb6.toString());
        return super.delete(tVar, z17, (java.lang.String[]) java.util.Arrays.copyOf(keys, keys.length));
    }

    @Override // l75.n0
    public boolean delete(l75.f0 f0Var, java.lang.String[] keys) {
        qb2.t tVar = (qb2.t) f0Var;
        kotlin.jvm.internal.o.g(keys, "keys");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[delete] ");
        sb6.append(tVar != null ? com.tencent.mm.plugin.finder.storage.u80.a(tVar) : null);
        com.tencent.mars.xlog.Log.i("Finder.ConversationStorage", sb6.toString());
        return super.delete(tVar, (java.lang.String[]) java.util.Arrays.copyOf(keys, keys.length));
    }
}
