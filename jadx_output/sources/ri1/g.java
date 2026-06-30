package ri1;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ri1.g f396031a = new ri1.g();

    public static final void a(java.lang.String str, int i17) {
        ri1.c cVar;
        if ((str == null || str.length() == 0) || (cVar = (ri1.c) com.tencent.mm.plugin.appbrand.app.r9.fj(ri1.c.class)) == null) {
            return;
        }
        try {
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = "  appId=? ";
            if (i17 == 1) {
                h0Var.f310123d = ((java.lang.String) h0Var.f310123d) + " and appVersionId = TEST";
            } else if (i17 == 2) {
                h0Var.f310123d = ((java.lang.String) h0Var.f310123d) + " and appVersionId = DEMO";
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            l75.k0 k0Var = cVar.f396025e;
            ri1.d dVar = new ri1.d(h0Var, str, linkedList);
            long F = k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            dVar.invoke(k0Var);
            k0Var.w(java.lang.Long.valueOf(F));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.vfs.w6.h((java.lang.String) it.next());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WebRenderingCacheCleanupLogic", "clearCache with appId[" + str + "] versionType[" + i17 + "], e=" + e17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0259, code lost:
    
        if (r2.moveToFirst() != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x025b, code lost:
    
        r5 = new ri1.b();
        r5.convertFrom(r2);
        r0.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x026a, code lost:
    
        if (r2.moveToNext() != false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x00a9, code lost:
    
        if (r5.moveToFirst() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x00ab, code lost:
    
        r4.add(r5.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00b6, code lost:
    
        if (r5.moveToNext() != false) goto L189;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b() {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ri1.g.b():void");
    }

    public final java.lang.String c(boolean z17) {
        com.tencent.mm.plugin.appbrand.appcache.t3 t3Var;
        com.tencent.mm.plugin.appbrand.appcache.n9 c17 = com.tencent.mm.plugin.appbrand.appcache.r7.f75948a.c(z17);
        if (c17 == null) {
            if (z17) {
                return com.tencent.mm.plugin.appbrand.appcache.AssetReader.f75370n.Y0();
            }
            return null;
        }
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo b17 = com.tencent.mm.plugin.appbrand.appcache.i8.b(c17);
        if (!b17.f75401f) {
            java.lang.String str = b17.pkgPath;
            if (!(str == null || str.length() == 0)) {
                t3Var = new com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader$PkgReader(b17);
                return t3Var.Y0();
            }
        }
        t3Var = com.tencent.mm.plugin.appbrand.appcache.AssetReader.f75370n;
        kotlin.jvm.internal.o.d(t3Var);
        return t3Var.Y0();
    }
}
