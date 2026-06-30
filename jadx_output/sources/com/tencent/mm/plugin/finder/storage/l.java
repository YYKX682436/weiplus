package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes10.dex */
public final class l extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f127095f = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.finder.storage.wj0.N, "FinderAction")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f127096g;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f127097d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f127098e;

    static {
        java.lang.String[] INDEX_CREATE = dm.w3.f240759v;
        kotlin.jvm.internal.o.f(INDEX_CREATE, "INDEX_CREATE");
        java.util.ArrayList arrayList = (java.util.ArrayList) kz5.z.C0(INDEX_CREATE);
        arrayList.add("CREATE INDEX IF NOT EXISTS " + com.tencent.mm.plugin.finder.storage.wj0.P + " ON FinderAction ( actionType,state,postTime )");
        arrayList.add("CREATE INDEX IF NOT EXISTS " + com.tencent.mm.plugin.finder.storage.wj0.Q + " ON FinderAction (actionType,feedId, postTime)");
        f127096g = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(l75.k0 db6) {
        super(db6, com.tencent.mm.plugin.finder.storage.wj0.N, "FinderAction", f127096g);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = com.tencent.mm.plugin.finder.storage.wj0.N;
        this.f127097d = db6;
        this.f127098e = "SELECT * FROM FinderAction";
    }

    public final void D0(long j17, long j18, long j19, int i17, com.tencent.mm.plugin.finder.storage.yj0 yj0Var) {
        com.tencent.mm.autogen.events.FinderCommentChangeEvent finderCommentChangeEvent = new com.tencent.mm.autogen.events.FinderCommentChangeEvent();
        am.ta taVar = finderCommentChangeEvent.f54263g;
        taVar.f7993a = j17;
        taVar.f7994b = j18;
        taVar.getClass();
        taVar.f7995c = i17;
        taVar.f7996d = yj0Var;
        com.tencent.mars.xlog.Log.i("Finder.FinderActionStorage", "postEvent, feedId:" + j17 + ", commentId:" + j18 + ", localId:" + j19 + ", opType:" + i17);
        finderCommentChangeEvent.e();
    }

    public final boolean J0(long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        boolean z17 = this.f127097d.delete("FinderAction", "localCommentId=?", new java.lang.String[]{sb6.toString()}) > 0;
        com.tencent.mars.xlog.Log.i("Finder.FinderActionStorage", "removeUnsentComment " + j17 + " ret:" + z17);
        return z17;
    }

    public final boolean L0(long j17, com.tencent.mm.plugin.finder.storage.yj0 comment, boolean z17) {
        kotlin.jvm.internal.o.g(comment, "comment");
        android.content.ContentValues convertTo = comment.convertTo();
        convertTo.remove("rowid");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        boolean z18 = this.f127097d.p("FinderAction", convertTo, "localCommentId=?", new java.lang.String[]{sb6.toString()}) > 0;
        l75.e0 e0Var = com.tencent.mm.plugin.finder.storage.wj0.N;
        int i17 = com.tencent.mm.plugin.finder.storage.wj0.S;
        if (z17) {
            D0(comment.field_feedId, comment.t0(), comment.field_localCommentId, i17, comment);
        }
        return z18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        vz5.b.a(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0047, code lost:
    
        if (r1.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0049, code lost:
    
        r7 = new com.tencent.mm.plugin.finder.storage.yj0();
        r7.convertFrom(r1);
        r6.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0058, code lost:
    
        if (r1.moveToNext() != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List y0(long r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.f127098e
            r0.append(r1)
            java.lang.String r1 = " WHERE actionType = 1 and feedId = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " ORDER BY postTime DESC"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 2
            l75.k0 r2 = r5.f127097d
            r3 = 0
            android.database.Cursor r1 = r2.f(r0, r3, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "getAllUnsentCommentsByFeedId "
            r2.<init>(r4)
            r2.append(r6)
            r6 = 32
            r2.append(r6)
            r2.append(r0)
            java.lang.String r6 = r2.toString()
            java.lang.String r7 = "Finder.FinderActionStorage"
            com.tencent.mars.xlog.Log.i(r7, r6)
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            boolean r7 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L5e
            if (r7 == 0) goto L5a
        L49:
            com.tencent.mm.plugin.finder.storage.yj0 r7 = new com.tencent.mm.plugin.finder.storage.yj0     // Catch: java.lang.Throwable -> L5e
            r7.<init>()     // Catch: java.lang.Throwable -> L5e
            r7.convertFrom(r1)     // Catch: java.lang.Throwable -> L5e
            r6.add(r7)     // Catch: java.lang.Throwable -> L5e
            boolean r7 = r1.moveToNext()     // Catch: java.lang.Throwable -> L5e
            if (r7 != 0) goto L49
        L5a:
            vz5.b.a(r1, r3)
            return r6
        L5e:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L60
        L60:
            r7 = move-exception
            vz5.b.a(r1, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.storage.l.y0(long):java.util.List");
    }

    public final long z0(com.tencent.mm.plugin.finder.storage.yj0 action) {
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_FINDACTION_MAXID_LONG_SYNC;
        long t17 = c17.t(u3Var, 1L);
        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(1 + t17));
        action.field_localCommentId = t17;
        com.tencent.mars.xlog.Log.i("Finder.FinderActionStorage", "new feed action rowId " + this.f127097d.l("FinderAction", "localCommentId", action.convertTo()) + ' ' + pm0.b0.g(action) + " localID: " + t17);
        long j17 = action.field_feedId;
        long t07 = action.t0();
        long j18 = action.field_localCommentId;
        l75.e0 e0Var = com.tencent.mm.plugin.finder.storage.wj0.N;
        D0(j17, t07, j18, com.tencent.mm.plugin.finder.storage.wj0.S, action);
        return t17;
    }
}
