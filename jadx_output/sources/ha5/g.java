package ha5;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ha5.g f280005a = new ha5.g();

    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r9 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.UDRLogic"
            java.lang.String r2 = "doCleanAll start"
            java.lang.String r3 = "MicroMsg.UDRCleaner"
            com.tencent.mars.xlog.Log.i(r3, r2)
            ha5.h r2 = ha5.h.f280006a
            if (r2 != 0) goto L1e
            java.lang.Class<ha5.h> r2 = ha5.h.class
            monitor-enter(r2)
            ha5.h r4 = new ha5.h     // Catch: java.lang.Throwable -> L1b
            r4.<init>()     // Catch: java.lang.Throwable -> L1b
            ha5.h.f280006a = r4     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r0
        L1e:
            ha5.h r2 = ha5.h.f280006a
            r2.getClass()
            r2 = 0
            r4 = 0
            java.lang.String r5 = "getAllResource"
            android.os.Bundle r5 = ka5.d.a(r5, r2, r2)     // Catch: java.lang.Exception -> L2c
            goto L33
        L2c:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r5, r0, r6)
            r5 = r2
        L33:
            if (r5 != 0) goto L3b
            java.lang.String r5 = "getAllResource bundle is null"
            com.tencent.mars.xlog.Log.i(r1, r5)
            goto L51
        L3b:
            java.lang.Class<com.tencent.mm.udr.api.WxUdrResource> r6 = com.tencent.mm.udr.api.WxUdrResource.class
            java.lang.ClassLoader r6 = r6.getClassLoader()
            r5.setClassLoader(r6)
            java.lang.String r6 = "UdrAllResource"
            boolean r7 = r5.containsKey(r6)
            if (r7 == 0) goto L51
            java.util.ArrayList r5 = r5.getParcelableArrayList(r6)
            goto L52
        L51:
            r5 = r2
        L52:
            if (r5 == 0) goto Lab
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ 1
            if (r6 == 0) goto Lab
            java.util.Iterator r5 = r5.iterator()
        L60:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lab
            java.lang.Object r6 = r5.next()
            com.tencent.mm.udr.api.WxUdrResource r6 = (com.tencent.mm.udr.api.WxUdrResource) r6
            if (r6 == 0) goto L60
            ha5.h r7 = ha5.h.f280006a
            if (r7 != 0) goto L81
            java.lang.Class<ha5.h> r7 = ha5.h.class
            monitor-enter(r7)
            ha5.h r8 = new ha5.h     // Catch: java.lang.Throwable -> L7e
            r8.<init>()     // Catch: java.lang.Throwable -> L7e
            ha5.h.f280006a = r8     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7e
            goto L81
        L7e:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7e
            throw r0
        L81:
            ha5.h r7 = ha5.h.f280006a
            r7.getClass()
            java.lang.String r7 = r6.f196456m
            if (r7 == 0) goto La4
            com.tencent.mm.vfs.w6.h(r7)
            java.lang.String r7 = r6.f196457n
            com.tencent.mm.vfs.w6.f(r7)
            java.lang.String r7 = "removeResource"
            java.lang.String r6 = r6.a()     // Catch: java.lang.Exception -> L9d
            ka5.d.a(r7, r6, r2)     // Catch: java.lang.Exception -> L9d
            goto L60
        L9d:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r4]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r6, r0, r7)
            goto L60
        La4:
            java.lang.String r0 = "path"
            kotlin.jvm.internal.o.o(r0)
            throw r2
        Lab:
            java.lang.String r0 = "UDRSyncSTORAGEWithKey"
            com.tencent.mm.sdk.platformtools.o4 r0 = com.tencent.mm.sdk.platformtools.o4.M(r0)
            r0.d()
            java.lang.String r0 = "doCleanAll end"
            com.tencent.mars.xlog.Log.i(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ha5.g.a():void");
    }
}
