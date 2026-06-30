package z71;

/* loaded from: classes8.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FindMoreFriendEntryRedDotEvent f470513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z71.f f470514e;

    public c(z71.f fVar, com.tencent.mm.autogen.events.FindMoreFriendEntryRedDotEvent findMoreFriendEntryRedDotEvent) {
        this.f470514e = fVar;
        this.f470513d = findMoreFriendEntryRedDotEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r0 != null) goto L23;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r5 = this;
            com.tencent.mm.autogen.events.FindMoreFriendEntryRedDotEvent r0 = r5.f470513d
            r1 = 1
            if (r0 == 0) goto L3c
            java.lang.String r2 = "MicroMsg.AiRedDotData"
            java.lang.String r3 = "note entry red dot [%s] entry [%b]"
            am.la r0 = r0.f54255g
            java.lang.String r4 = r0.f7232a
            boolean r0 = r0.f7233b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0}
            com.tencent.mars.xlog.Log.i(r2, r3, r0)
            z71.f r0 = r5.f470514e
            java.util.HashMap r0 = r0.f470520e
            monitor-enter(r0)
            z71.f r2 = r5.f470514e     // Catch: java.lang.Throwable -> L39
            java.util.HashMap r2 = r2.f470520e     // Catch: java.lang.Throwable -> L39
            com.tencent.mm.autogen.events.FindMoreFriendEntryRedDotEvent r3 = r5.f470513d     // Catch: java.lang.Throwable -> L39
            am.la r3 = r3.f54255g     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = r3.f7232a     // Catch: java.lang.Throwable -> L39
            boolean r3 = r3.f7233b     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L2f
            r3 = r1
            goto L30
        L2f:
            r3 = 0
        L30:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L39
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            goto L3c
        L39:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r1
        L3c:
            com.tencent.mm.autogen.events.FindMoreFriendEntryRedDotEvent r0 = r5.f470513d
            am.la r0 = r0.f54255g
            boolean r2 = r0.f7233b
            if (r2 == 0) goto Lac
            java.lang.String r0 = r0.f7232a
            z71.e r0 = z71.e.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L4d
            if (r0 == 0) goto L4d
            goto L4e
        L4d:
            r0 = 0
        L4e:
            if (r0 == 0) goto Lac
            int r0 = r0.ordinal()
            if (r0 == r1) goto L93
            r1 = 13
            if (r0 == r1) goto L79
            r1 = 14
            if (r0 == r1) goto L5f
            goto Lac
        L5f:
            z71.b r0 = z71.b.a()
            r0.getClass()
            c81.b r0 = c81.b.wi()
            r0.requireAccountInitialized()
            c81.a r0 = r0.f39656d
            java.lang.String r1 = "last_expose_finder_live_reddot_ms"
            long r2 = c01.id.c()
            r0.c(r1, r2)
            goto Lac
        L79:
            z71.b r0 = z71.b.a()
            r0.getClass()
            c81.b r0 = c81.b.wi()
            r0.requireAccountInitialized()
            c81.a r0 = r0.f39656d
            java.lang.String r1 = "last_expose_finder_reddot_ms"
            long r2 = c01.id.c()
            r0.c(r1, r2)
            goto Lac
        L93:
            z71.b r0 = z71.b.a()
            r0.getClass()
            c81.b r0 = c81.b.wi()
            r0.requireAccountInitialized()
            c81.a r0 = r0.f39656d
            java.lang.String r1 = "last_expose_near_reddot_ms"
            long r2 = c01.id.c()
            r0.c(r1, r2)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z71.c.run():void");
    }
}
