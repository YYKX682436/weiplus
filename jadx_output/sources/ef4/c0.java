package ef4;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ef4.c0 f252438a = new ef4.c0();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f252439b = "";

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (kotlin.jvm.internal.o.b(ef4.c0.f252439b, r4) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto Ld
            int r2 = r4.length()
            if (r2 != 0) goto Lb
            goto Ld
        Lb:
            r2 = r1
            goto Le
        Ld:
            r2 = r0
        Le:
            if (r2 == 0) goto L11
            goto L3c
        L11:
            java.lang.String r2 = ef4.c0.f252439b
            int r2 = r2.length()
            if (r2 != 0) goto L1b
            r2 = r0
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L33
            java.lang.String r4 = ef4.c0.f252439b
            int r4 = r4.length()
            if (r4 != 0) goto L27
            goto L28
        L27:
            r0 = r1
        L28:
            if (r0 == 0) goto L3c
            ef4.v r4 = ef4.w.f252468t
            java.lang.String r4 = r4.e()
            ef4.c0.f252439b = r4
            goto L3c
        L33:
            java.lang.String r2 = ef4.c0.f252439b
            boolean r4 = kotlin.jvm.internal.o.b(r2, r4)
            if (r4 == 0) goto L3c
            goto L3d
        L3c:
            r0 = r1
        L3d:
            if (r0 == 0) goto L46
            ef4.v r4 = ef4.w.f252468t
            java.lang.String r4 = r4.b()
            return r4
        L46:
            ef4.v r4 = ef4.w.f252468t
            java.lang.String r4 = r4.a()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ef4.c0.a(java.lang.String):java.lang.String");
    }

    public final void b(java.lang.String newVideoPath, boolean z17) {
        kotlin.jvm.internal.o.g(newVideoPath, "newVideoPath");
        if (newVideoPath.length() == 0) {
            return;
        }
        java.lang.String r17 = com.tencent.mm.vfs.w6.r(newVideoPath);
        com.tencent.mm.vfs.w6.u(r17);
        if (z17) {
            com.tencent.mm.vfs.w6.t(r17);
        }
    }

    public final java.lang.String c() {
        new fp.j().b();
        jz5.l d17 = d("pic/");
        jz5.l d18 = d("video/");
        return ((java.lang.String) d17.f302833d) + "  " + ((java.lang.String) d18.f302833d) + " total: " + com.tencent.mm.sdk.platformtools.t8.h0(((java.lang.Number) d17.f302834e).longValue() + ((java.lang.Number) d18.f302834e).longValue());
    }

    public final jz5.l d(java.lang.String str) {
        pm0.c cVar = new pm0.c("dumpCacheDir");
        java.lang.String str2 = ef4.w.f252468t.a() + str;
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryFileNameUtil", "dumpCacheDir cache " + str2);
        java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(str2, true);
        java.util.List k17 = s17 != null ? com.tencent.mm.vfs.e8.k(s17) : null;
        if (k17 != null && k17.size() > 1) {
            kz5.g0.t(k17, new ef4.b0());
        }
        long j17 = 0;
        if (k17 != null) {
            int i17 = 0;
            for (java.lang.Object obj : k17) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) obj;
                if (x1Var != null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dumpCacheDir ");
                    sb6.append(i17);
                    sb6.append(" filePath: ");
                    java.lang.String name = x1Var.f213232b;
                    sb6.append(name);
                    sb6.append(" time: ");
                    sb6.append(x1Var.f213235e);
                    sb6.append(" size: ");
                    long j18 = x1Var.f213233c;
                    sb6.append(com.tencent.mm.sdk.platformtools.t8.f0(j18));
                    sb6.append(' ');
                    sb6.append(x1Var.f213231a);
                    com.tencent.mars.xlog.Log.i("MicroMsg.StoryFileNameUtil", sb6.toString());
                    kotlin.jvm.internal.o.f(name, "name");
                    if (!kotlin.jvm.internal.o.b(".nomedia", name)) {
                        j17 += j18;
                    }
                }
                i17 = i18;
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("dumpCacheDir ");
        sb7.append(str);
        sb7.append(" totalSize ");
        sb7.append(com.tencent.mm.sdk.platformtools.t8.f0(j17));
        sb7.append(" fileCounts ");
        sb7.append(k17 != null ? java.lang.Integer.valueOf(k17.size()) : null);
        sb7.append(" cost:");
        sb7.append(cVar);
        sb7.append(" \n");
        java.lang.String sb8 = sb7.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryFileNameUtil", sb8);
        return new jz5.l(sb8, java.lang.Long.valueOf(j17));
    }

    public final java.lang.String e(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return "";
        }
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(str + str2 + ".p", true);
        kotlin.jvm.internal.o.d(i17);
        return i17;
    }
}
