package qo2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wcdb.core.Database f365579a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f365580b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.wcdb.core.Table f365581c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.wcdb.core.Table f365582d;

    /* renamed from: e, reason: collision with root package name */
    public final int f365583e;

    /* renamed from: f, reason: collision with root package name */
    public final int f365584f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f365585g;

    public e(com.tencent.wcdb.core.Database db6) {
        kotlin.jvm.internal.o.g(db6, "db");
        this.f365579a = db6;
        this.f365580b = "FinderLiveShopMsgStorage";
        this.f365583e = 604800;
        this.f365584f = 86400;
        this.f365585g = jz5.h.b(qo2.a.f365567d);
        com.tencent.wcdb.core.Table table = db6.getTable("FinderLiveShopSessionInfo", so0.b.f410196b);
        kotlin.jvm.internal.o.f(table, "getTable(...)");
        this.f365581c = table;
        com.tencent.wcdb.core.Table table2 = db6.getTable("FinderLiveShopMsg", so0.a.f410183b);
        kotlin.jvm.internal.o.f(table2, "getTable(...)");
        this.f365582d = table2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(qo2.e r4, r45.w3 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof qo2.b
            if (r0 == 0) goto L16
            r0 = r6
            qo2.b r0 = (qo2.b) r0
            int r1 = r0.f365571g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f365571g = r1
            goto L1b
        L16:
            qo2.b r0 = new qo2.b
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f365569e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f365571g
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f365568d
            qo2.e r4 = (qo2.e) r4
            kotlin.ResultKt.throwOnFailure(r6)
            goto L86
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.String r6 = r5.f388827e
            java.lang.String r2 = "msg_session_id"
            kotlin.jvm.internal.o.f(r6, r2)
            so0.d r6 = r4.c(r6)
            if (r6 != 0) goto Lc1
            r45.au1 r6 = new r45.au1
            r6.<init>()
            java.lang.String r5 = r5.f388827e
            r6.set(r3, r5)
            com.tencent.mm.modelbase.l r5 = new com.tencent.mm.modelbase.l
            r5.<init>()
            r2 = 14005(0x36b5, float:1.9625E-41)
            r5.f70667d = r2
            java.lang.String r2 = "/cgi-bin/micromsg-bin/finderlivegetpersonalmsgsessioninfo"
            r5.f70666c = r2
            r5.f70664a = r6
            r45.bu1 r6 = new r45.bu1
            r6.<init>()
            r5.f70665b = r6
            com.tencent.mm.modelbase.o r5 = r5.a()
            java.lang.Class<zy2.x5> r6 = zy2.x5.class
            i95.m r6 = i95.n0.c(r6)
            zy2.x5 r6 = (zy2.x5) r6
            pc2.e r6 = (pc2.e) r6
            com.tencent.mm.modelbase.i r6 = r6.wi()
            r6.p(r5)
            r0.f365568d = r4
            r0.f365571g = r3
            java.lang.Object r6 = rm0.h.b(r6, r0)
            if (r6 != r1) goto L86
            goto Lc3
        L86:
            com.tencent.mm.modelbase.f r6 = (com.tencent.mm.modelbase.f) r6
            java.lang.String r5 = r4.f365580b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[createSessionOnReceiveNewMsg] cgi errCode ="
            r0.<init>(r1)
            int r1 = r6.f70616b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r5, r0)
            com.tencent.mm.protobuf.f r5 = r6.f70618d
            r45.bu1 r5 = (r45.bu1) r5
            com.tencent.mm.protobuf.f r5 = r5.getCustom(r3)
            r45.w32 r5 = (r45.w32) r5
            if (r5 == 0) goto Lbb
            zl2.r4 r0 = zl2.r4.f473950a
            com.tencent.mm.protobuf.f r6 = r6.f70618d
            r45.bu1 r6 = (r45.bu1) r6
            r1 = 2
            java.lang.String r6 = r6.getString(r1)
            java.lang.String r1 = "createSessionOnReceiveNewMsg"
            so0.d r5 = r0.i3(r1, r5, r6)
            goto Lbc
        Lbb:
            r5 = 0
        Lbc:
            if (r5 == 0) goto Lc1
            r4.d(r5)
        Lc1:
            jz5.f0 r1 = jz5.f0.f302826a
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qo2.e.a(qo2.e, r45.w3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final so0.d b(long j17, java.lang.String myUserName, int i17) {
        kotlin.jvm.internal.o.g(myUserName, "myUserName");
        java.lang.String str = this.f365580b;
        com.tencent.mars.xlog.Log.i(str, "[getSessionInfo] liveId = " + j17 + ", myUserName = " + myUserName + ", roleType = " + i17);
        try {
            com.tencent.wcdb.core.Table table = this.f365581c;
            if (table != null) {
                return (so0.d) table.getFirstObject(so0.b.f410200f.eq(j17).and(so0.b.f410199e.eq(myUserName)).and(so0.b.f410201g.eq(i17)));
            }
            kotlin.jvm.internal.o.o("sessionTable");
            throw null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i(str, "[getSessionInfo] by liveId+toUserName, e:" + e17.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final so0.d c(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        try {
            com.tencent.wcdb.core.Table table = this.f365581c;
            if (table != null) {
                return (so0.d) table.getFirstObject(so0.b.f410197c.eq(sessionId));
            }
            kotlin.jvm.internal.o.o("sessionTable");
            throw null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i(this.f365580b, "[getSessionInfo] by sessionId, e:" + e17.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0048, code lost:
    
        if (r2.longValue() != 0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001b A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:3:0x0009, B:5:0x000f, B:10:0x001b, B:12:0x001f, B:17:0x002b, B:19:0x002f, B:24:0x003b, B:27:0x004a, B:35:0x0040, B:40:0x0059, B:43:0x0069, B:45:0x0073, B:47:0x0077, B:48:0x007d), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:3:0x0009, B:5:0x000f, B:10:0x001b, B:12:0x001f, B:17:0x002b, B:19:0x002f, B:24:0x003b, B:27:0x004a, B:35:0x0040, B:40:0x0059, B:43:0x0069, B:45:0x0073, B:47:0x0077, B:48:0x007d), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:3:0x0009, B:5:0x000f, B:10:0x001b, B:12:0x001f, B:17:0x002b, B:19:0x002f, B:24:0x003b, B:27:0x004a, B:35:0x0040, B:40:0x0059, B:43:0x0069, B:45:0x0073, B:47:0x0077, B:48:0x007d), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0059 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:3:0x0009, B:5:0x000f, B:10:0x001b, B:12:0x001f, B:17:0x002b, B:19:0x002f, B:24:0x003b, B:27:0x004a, B:35:0x0040, B:40:0x0059, B:43:0x0069, B:45:0x0073, B:47:0x0077, B:48:0x007d), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0069 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:3:0x0009, B:5:0x000f, B:10:0x001b, B:12:0x001f, B:17:0x002b, B:19:0x002f, B:24:0x003b, B:27:0x004a, B:35:0x0040, B:40:0x0059, B:43:0x0069, B:45:0x0073, B:47:0x0077, B:48:0x007d), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(so0.d r10) {
        /*
            r9 = this;
            java.lang.String r0 = r9.f365580b
            java.lang.String r1 = "[insertSession] invalid, session = "
            java.lang.String r2 = "session"
            kotlin.jvm.internal.o.g(r10, r2)
            java.lang.String r2 = r10.f410215a     // Catch: java.lang.Exception -> L7e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L18
            int r2 = r2.length()     // Catch: java.lang.Exception -> L7e
            if (r2 != 0) goto L16
            goto L18
        L16:
            r2 = r3
            goto L19
        L18:
            r2 = r4
        L19:
            if (r2 != 0) goto L57
            java.lang.String r2 = r10.f410217c     // Catch: java.lang.Exception -> L7e
            if (r2 == 0) goto L28
            int r2 = r2.length()     // Catch: java.lang.Exception -> L7e
            if (r2 != 0) goto L26
            goto L28
        L26:
            r2 = r3
            goto L29
        L28:
            r2 = r4
        L29:
            if (r2 != 0) goto L57
            java.lang.String r2 = r10.f410216b     // Catch: java.lang.Exception -> L7e
            if (r2 == 0) goto L38
            int r2 = r2.length()     // Catch: java.lang.Exception -> L7e
            if (r2 != 0) goto L36
            goto L38
        L36:
            r2 = r3
            goto L39
        L38:
            r2 = r4
        L39:
            if (r2 != 0) goto L57
            java.lang.Long r2 = r10.f410218d     // Catch: java.lang.Exception -> L7e
            if (r2 != 0) goto L40
            goto L4a
        L40:
            long r5 = r2.longValue()     // Catch: java.lang.Exception -> L7e
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L57
        L4a:
            int r2 = r10.f410219e     // Catch: java.lang.Exception -> L7e
            if (r4 > r2) goto L53
            r5 = 4
            if (r2 >= r5) goto L53
            r2 = r4
            goto L54
        L53:
            r2 = r3
        L54:
            if (r2 == 0) goto L57
            r3 = r4
        L57:
            if (r3 != 0) goto L69
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7e
            r2.<init>(r1)     // Catch: java.lang.Exception -> L7e
            r2.append(r10)     // Catch: java.lang.Exception -> L7e
            java.lang.String r10 = r2.toString()     // Catch: java.lang.Exception -> L7e
            com.tencent.mars.xlog.Log.i(r0, r10)     // Catch: java.lang.Exception -> L7e
            return
        L69:
            int r1 = c01.id.e()     // Catch: java.lang.Exception -> L7e
            r10.f410220f = r1     // Catch: java.lang.Exception -> L7e
            com.tencent.wcdb.core.Table r1 = r9.f365581c     // Catch: java.lang.Exception -> L7e
            if (r1 == 0) goto L77
            r1.insertOrReplaceObject(r10)     // Catch: java.lang.Exception -> L7e
            return
        L77:
            java.lang.String r10 = "sessionTable"
            kotlin.jvm.internal.o.o(r10)     // Catch: java.lang.Exception -> L7e
            r10 = 0
            throw r10     // Catch: java.lang.Exception -> L7e
        L7e:
            r10 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[insertSession] e:"
            r1.<init>(r2)
            java.lang.String r10 = r10.getMessage()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qo2.e.d(so0.d):void");
    }

    public final boolean e(so0.c cVar) {
        java.lang.String str = cVar.f410205b;
        if (str == null || str.length() == 0) {
            return false;
        }
        java.lang.String str2 = cVar.f410207d;
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        java.lang.String str3 = cVar.f410206c;
        if ((str3 == null || str3.length() == 0) || cVar.f410209f == null) {
            return false;
        }
        java.lang.Long l17 = cVar.f410208e;
        return l17 == null || l17.longValue() != 0;
    }

    public final void f(java.lang.String clientMsgId) {
        kotlin.jvm.internal.o.g(clientMsgId, "clientMsgId");
        try {
            so0.c cVar = new so0.c();
            cVar.f410211h = java.lang.Boolean.TRUE;
            com.tencent.wcdb.core.Table table = this.f365582d;
            if (table != null) {
                table.updateObject((com.tencent.wcdb.core.Table) cVar, (com.tencent.wcdb.orm.Field<com.tencent.wcdb.core.Table>) so0.a.f410191j, so0.a.f410194m.eq(clientMsgId));
            } else {
                kotlin.jvm.internal.o.o("msgTable");
                throw null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i(this.f365580b, "[updateMsgRead] e:" + e17.getMessage());
        }
    }
}
