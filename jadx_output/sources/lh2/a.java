package lh2;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f318659a;

    /* renamed from: b, reason: collision with root package name */
    public java.io.OutputStream f318660b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f318661c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f318662d;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3838p).getValue()).r()).intValue() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "filename"
            kotlin.jvm.internal.o.g(r2, r0)
            r1.<init>()
            r1.f318659a = r2
            zl2.q4 r2 = zl2.q4.f473933a
            boolean r2 = r2.E()
            if (r2 == 0) goto L2c
            ae2.in r2 = ae2.in.f3688a
            jz5.g r2 = ae2.in.f3838p
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.getValue()
            lb2.j r2 = (lb2.j) r2
            java.lang.Object r2 = r2.r()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0 = 1
            if (r2 != r0) goto L2c
            goto L2d
        L2c:
            r0 = 0
        L2d:
            r1.f318662d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lh2.a.<init>(java.lang.String):void");
    }

    public final void a() {
        if (this.f318661c) {
            return;
        }
        this.f318661c = true;
        try {
            java.lang.String str = lp0.b.e0() + "/A_live_ktv_test/";
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a()) {
                m17.f213266a.r(m17.f213267b);
            }
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str, this.f318659a);
            if (r6Var.m()) {
                r6Var.l();
            }
            r6Var.k();
            this.f318660b = com.tencent.mm.vfs.w6.H(r6Var);
            com.tencent.mars.xlog.Log.i("KTVFileSaver", "createNewFile path: " + r6Var.o());
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("KTVFileSaver", "createNewFile error: " + jz5.f0.f302826a);
        }
    }

    public final void b(byte[] buffer, int i17) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        if (this.f318662d) {
            try {
                a();
                java.io.OutputStream outputStream = this.f318660b;
                if (outputStream != null) {
                    outputStream.write(buffer, 0, i17);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
