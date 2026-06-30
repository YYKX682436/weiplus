package sj4;

/* loaded from: classes8.dex */
public final class q0 extends bi4.o0 {
    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        java.lang.String r17 = r();
        if (r17 == null || r26.n0.N(r17)) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", r17);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }

    @Override // bi4.o0
    public void e(pj4.w wVar) {
        if (wVar == null) {
            return;
        }
        wVar.f355316i = r();
    }

    @Override // bi4.o0
    public java.lang.String g() {
        return "3";
    }

    @Override // bi4.o0
    public boolean j() {
        return false;
    }

    @Override // bi4.o0
    public void m(java.lang.String str, pj4.j0 j0Var) {
        super.m(str, j0Var);
    }

    @Override // bi4.o0
    public void n() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:9:0x001c, B:11:0x0020, B:16:0x002c, B:18:0x003e), top: B:8:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String r() {
        /*
            r5 = this;
            pj4.j0 r0 = r5.f21074b
            if (r0 == 0) goto L56
            java.lang.String r1 = r0.f355139d
            java.lang.String r2 = "3"
            boolean r2 = kotlin.jvm.internal.o.b(r1, r2)
            r3 = 1
            if (r2 == 0) goto L11
            r1 = r3
            goto L17
        L11:
            java.lang.String r2 = "10"
            boolean r1 = kotlin.jvm.internal.o.b(r1, r2)
        L17:
            if (r1 == 0) goto L56
            java.lang.String r1 = r0.f355141f
            r2 = 0
            java.lang.String r4 = r0.f355142g     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L29
            boolean r4 = r26.n0.N(r4)     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L27
            goto L29
        L27:
            r4 = r2
            goto L2a
        L29:
            r4 = r3
        L2a:
            if (r4 != 0) goto L55
            java.lang.String r0 = r0.f355142g     // Catch: java.lang.Throwable -> L4a
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch: java.lang.Throwable -> L4a
            pj4.w1 r4 = new pj4.w1     // Catch: java.lang.Throwable -> L4a
            r4.<init>()     // Catch: java.lang.Throwable -> L4a
            r4.parseFrom(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = r4.f355321d     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L46
            boolean r4 = r26.n0.N(r0)     // Catch: java.lang.Throwable -> L4a
            if (r4 == 0) goto L45
            goto L46
        L45:
            r3 = r2
        L46:
            if (r3 != 0) goto L55
            r1 = r0
            goto L55
        L4a:
            r0 = move-exception
            java.lang.String r3 = "parse jump err"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "H5StatusService"
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r0, r3, r2)
        L55:
            return r1
        L56:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sj4.q0.r():java.lang.String");
    }
}
