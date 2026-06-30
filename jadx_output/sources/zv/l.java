package zv;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final zv.l f476016a = new zv.l();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f476017b = jz5.h.b(zv.j.f475997d);

    /* renamed from: c, reason: collision with root package name */
    public static boolean f476018c;

    static {
        i95.n0.c(e70.q.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if ((!yo.a.b(qw.a.f367052b, r2)) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List a(zv.l r4, java.util.List r5) {
        /*
            r4.getClass()
            zv.h r0 = zv.h.f475976d
            java.util.List r4 = r4.e(r0)     // Catch: com.tencent.wcdb.database.SQLiteDiskIOException -> La
            goto L20
        La:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "collectAllBrandServiceCovHasNoParentRef, db access failed, "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "MicroMsg.BrandServiceEntryStrategy"
            com.tencent.mars.xlog.Log.e(r0, r4)
            kz5.p0 r4 = kz5.p0.f313996d
        L20:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L29:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r5.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r4.contains(r2)
            if (r3 == 0) goto L4d
            java.lang.String r3 = "username"
            kotlin.jvm.internal.o.g(r2, r3)
            java.lang.String[] r3 = qw.a.f367052b
            boolean r2 = yo.a.b(r3, r2)
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L4d
            goto L4e
        L4d:
            r3 = 0
        L4e:
            if (r3 == 0) goto L29
            r0.add(r1)
            goto L29
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zv.l.a(zv.l, java.util.List):java.util.List");
    }

    public final void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceEntryStrategy", "applyBrandServiceEntryEnable, enable: " + z17 + ", has checked: " + d().f("key_mmkv_had_enable_brand_service_entry_2") + ", current status: " + d().getBoolean("key_mmkv_had_enable_brand_service_entry_2", false));
        ((ku5.t0) ku5.t0.f312615d).q(new zv.k(z17));
        if (d().f("key_mmkv_had_enable_brand_service_entry_2") && z17 == d().getBoolean("key_mmkv_had_enable_brand_service_entry_2", false)) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).q(new zv.e(z17));
    }

    public final java.util.List c(yz5.l lVar) {
        try {
            return f(lVar);
        } catch (com.tencent.wcdb.database.SQLiteDiskIOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandServiceEntryStrategy", "collectBrandServiceUsernameList, db access failed, " + e17);
            return kz5.p0.f313996d;
        }
    }

    public final com.tencent.mm.sdk.platformtools.o4 d() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f476017b).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        r0.add(r2.h1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r1.moveToNext() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        vz5.b.a(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r1.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        r2 = new com.tencent.mm.storage.l4();
        r2.convertFrom(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (((java.lang.Boolean) r6.invoke(r2)).booleanValue() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List e(yz5.l r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<vg3.x3> r1 = vg3.x3.class
            lm0.a r1 = gm0.j1.s(r1)
            vg3.x3 r1 = (vg3.x3) r1
            com.tencent.mm.plugin.messenger.foundation.h2 r1 = (com.tencent.mm.plugin.messenger.foundation.h2) r1
            com.tencent.mm.storage.m4 r1 = r1.Di()
            r2 = -1
            r3 = 1
            r4 = 0
            android.database.Cursor r1 = r1.s(r3, r4, r4, r2)
            if (r1 != 0) goto L1d
            return r0
        L1d:
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L44
        L23:
            com.tencent.mm.storage.l4 r2 = new com.tencent.mm.storage.l4     // Catch: java.lang.Throwable -> L48
            r2.<init>()     // Catch: java.lang.Throwable -> L48
            r2.convertFrom(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r6.invoke(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L48
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L3e
            java.lang.String r2 = r2.h1()     // Catch: java.lang.Throwable -> L48
            r0.add(r2)     // Catch: java.lang.Throwable -> L48
        L3e:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L23
        L44:
            vz5.b.a(r1, r4)
            return r0
        L48:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L4a
        L4a:
            r0 = move-exception
            vz5.b.a(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zv.l.e(yz5.l):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r2.r2() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (((java.lang.Boolean) r6.invoke(r2)).booleanValue() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        r0.add(r2.d1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r1.moveToNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        vz5.b.a(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r1.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        r2 = new com.tencent.mm.storage.z3();
        r2.convertFrom(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (r2.m2() == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List f(yz5.l r6) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<vg3.x3> r1 = vg3.x3.class
            lm0.a r1 = gm0.j1.s(r1)
            vg3.x3 r1 = (vg3.x3) r1
            com.tencent.mm.plugin.messenger.foundation.h2 r1 = (com.tencent.mm.plugin.messenger.foundation.h2) r1
            com.tencent.mm.storage.k4 r1 = r1.Bi()
            java.lang.String r2 = "@biz.contact"
            r3 = 0
            android.database.Cursor r1 = r1.x(r2, r3, r3)
            if (r1 != 0) goto L1d
            return r0
        L1d:
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L50
        L23:
            com.tencent.mm.storage.z3 r2 = new com.tencent.mm.storage.z3     // Catch: java.lang.Throwable -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L54
            r2.convertFrom(r1)     // Catch: java.lang.Throwable -> L54
            boolean r4 = r2.m2()     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L4a
            boolean r4 = r2.r2()     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L4a
            java.lang.Object r4 = r6.invoke(r2)     // Catch: java.lang.Throwable -> L54
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L54
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L54
            if (r4 == 0) goto L4a
            java.lang.String r2 = r2.d1()     // Catch: java.lang.Throwable -> L54
            r0.add(r2)     // Catch: java.lang.Throwable -> L54
        L4a:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L23
        L50:
            vz5.b.a(r1, r3)
            return r0
        L54:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L56
        L56:
            r0 = move-exception
            vz5.b.a(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zv.l.f(yz5.l):java.util.List");
    }
}
