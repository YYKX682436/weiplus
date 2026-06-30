package v24;

/* loaded from: classes.dex */
public final class s extends com.tencent.mm.sdk.event.n {
    public s() {
        super(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[Catch: Exception -> 0x0056, TryCatch #0 {Exception -> 0x0056, blocks: (B:5:0x0018, B:7:0x002a, B:16:0x0037, B:19:0x0049), top: B:4:0x0018 }] */
    @Override // com.tencent.mm.sdk.event.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean callback(com.tencent.mm.sdk.event.IEvent r6) {
        /*
            r5 = this;
            com.tencent.mm.autogen.events.ConfigUpdatedEvent r6 = (com.tencent.mm.autogen.events.ConfigUpdatedEvent) r6
            java.lang.String r0 = "file_list"
            java.lang.String r1 = "event"
            kotlin.jvm.internal.o.g(r6, r1)
            am.k3 r6 = r6.f54072g
            java.lang.String r6 = r6.f7126a
            java.lang.String r1 = "clicfg_oneshot_file_list"
            boolean r6 = kotlin.jvm.internal.o.b(r6, r1)
            r2 = 0
            if (r6 != 0) goto L17
            goto L61
        L17:
            r6 = 1
            java.lang.Class<e42.e0> r3 = e42.e0.class
            i95.m r3 = i95.n0.c(r3)     // Catch: java.lang.Exception -> L56
            e42.e0 r3 = (e42.e0) r3     // Catch: java.lang.Exception -> L56
            java.lang.String r4 = ""
            h62.d r3 = (h62.d) r3     // Catch: java.lang.Exception -> L56
            java.lang.String r1 = r3.aj(r1, r4)     // Catch: java.lang.Exception -> L56
            if (r1 == 0) goto L33
            int r3 = r1.length()     // Catch: java.lang.Exception -> L56
            if (r3 != 0) goto L31
            goto L33
        L31:
            r3 = r2
            goto L34
        L33:
            r3 = r6
        L34:
            if (r3 == 0) goto L37
            goto L60
        L37:
            java.lang.String r3 = "oneshot_action"
            com.tencent.mm.sdk.platformtools.o4 r3 = com.tencent.mm.sdk.platformtools.o4.M(r3)     // Catch: java.lang.Exception -> L56
            r4 = 0
            java.lang.String r4 = r3.getString(r0, r4)     // Catch: java.lang.Exception -> L56
            boolean r4 = kotlin.jvm.internal.o.b(r1, r4)     // Catch: java.lang.Exception -> L56
            if (r4 == 0) goto L49
            goto L60
        L49:
            r3.D(r0, r1)     // Catch: java.lang.Exception -> L56
            ku5.u0 r0 = ku5.t0.f312615d     // Catch: java.lang.Exception -> L56
            v24.r r1 = v24.r.f432947d     // Catch: java.lang.Exception -> L56
            ku5.t0 r0 = (ku5.t0) r0     // Catch: java.lang.Exception -> L56
            r0.g(r1)     // Catch: java.lang.Exception -> L56
            goto L60
        L56:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "MicroMsg.ListFile"
            java.lang.String r3 = "Cannot list files"
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r0, r3, r1)
        L60:
            r2 = r6
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v24.s.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
