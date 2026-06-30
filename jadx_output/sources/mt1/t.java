package mt1;

/* loaded from: classes12.dex */
public final class t implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msg.MsgIdTalker f331264d;

    public t(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        this.f331264d = msgIdTalker;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call() {
        /*
            r11 = this;
            java.lang.String r0 = "MicroMsg.CalcWxNewService"
            kz5.p0 r1 = kz5.p0.f313996d
            com.tencent.mm.plugin.msg.MsgIdTalker r2 = r11.f331264d
            d95.f.q()     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            pt0.e0 r3 = pt0.f0.f358209b1     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            java.lang.String r4 = r2.a()     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            long r5 = r2.f149480d
            com.tencent.mm.storage.f9 r3 = r3.n(r4, r5)     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            long r7 = r3.getMsgId()     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            r9 = 0
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L20
            goto L4c
        L20:
            java.util.Map r4 = mt1.e0.f331213a     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            int r7 = r3.getType()     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            java.lang.Object r7 = r4.get(r7)     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            nt1.c r7 = (nt1.c) r7     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            if (r7 != 0) goto L45
            int r7 = r3.getType()     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            int r7 = com.tencent.mm.pluginsdk.model.app.k0.c(r7)     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            java.lang.Object r4 = r4.get(r7)     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            r7 = r4
            nt1.c r7 = (nt1.c) r7     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
        L45:
            if (r7 == 0) goto L4c
            java.util.List r3 = r7.b(r3)     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            goto L4d
        L4c:
            r3 = 0
        L4d:
            jz5.o r4 = new jz5.o     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            java.lang.String r6 = r2.a()     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            if (r3 != 0) goto L5a
            r3 = r1
        L5a:
            r4.<init>(r5, r6, r3)     // Catch: java.lang.Throwable -> L5e com.tencent.wcdb.database.SQLiteDatabaseCorruptException -> L98
            goto Lac
        L5e:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Cannot scan talker: "
            r4.<init>(r5)
            java.lang.String r5 = r2.a()
            r4.append(r5)
            java.lang.String r5 = " msgId "
            r4.append(r5)
            long r5 = r2.f149480d
            r4.append(r5)
            java.lang.String r7 = ": "
            r4.append(r7)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.tencent.mars.xlog.Log.e(r0, r3)
            jz5.o r4 = new jz5.o
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.String r2 = r2.a()
            r4.<init>(r0, r2, r1)
            goto Lac
        L98:
            java.lang.String r3 = "getIndicesByMsgInfo Dirty, DB Corrupt"
            com.tencent.mars.xlog.Log.e(r0, r3)
            jz5.o r4 = new jz5.o
            long r5 = r2.f149480d
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.String r2 = r2.a()
            r4.<init>(r0, r2, r1)
        Lac:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mt1.t.call():java.lang.Object");
    }
}
