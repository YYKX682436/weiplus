package ev2;

/* loaded from: classes10.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ev2.c f256899d;

    public b(ev2.c cVar) {
        this.f256899d = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            ev2.c r0 = r7.f256899d
            r0.getClass()
            x r1 = defpackage.y.f458297f
            y r1 = r1.a()
            pm0.c r2 = new pm0.c
            java.lang.String r3 = "getRecentAction"
            r2.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r1.f458302e
            r3.append(r4)
            java.lang.String r4 = " WHERE actionType = 1 and state == 1 ORDER BY postTime DESC limit 1"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            l75.k0 r1 = r1.f458301d
            r4 = 0
            r5 = 2
            android.database.Cursor r1 = r1.f(r3, r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "getRecentAction "
            r5.<init>(r6)
            r5.append(r2)
            r2 = 32
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "MicroMsg.TextStatus.TextStatusActionStorage"
            com.tencent.mars.xlog.Log.i(r3, r2)
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L5d
        L4e:
            jv2.a r2 = new jv2.a     // Catch: java.lang.Throwable -> L84
            r2.<init>()     // Catch: java.lang.Throwable -> L84
            r2.convertFrom(r1)     // Catch: java.lang.Throwable -> L84
            boolean r5 = r1.moveToNext()     // Catch: java.lang.Throwable -> L84
            if (r5 != 0) goto L4e
            goto L5e
        L5d:
            r2 = r4
        L5e:
            vz5.b.a(r1, r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r3, r1)
            if (r2 == 0) goto L83
            ev2.d r1 = new ev2.d
            iv2.a r3 = r2.M
            r1.<init>(r2, r3)
            ev2.a r2 = new ev2.a
            r2.<init>(r0)
            fp0.o r0 = r0.f256901a
            r0.b(r1, r2)
        L83:
            return
        L84:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L86
        L86:
            r2 = move-exception
            vz5.b.a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ev2.b.run():void");
    }
}
