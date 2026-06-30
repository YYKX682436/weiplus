package y73;

/* loaded from: classes11.dex */
public class q extends com.tencent.mm.sdk.event.n {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f459744e = lp0.b.e() + "_temp.hp";

    /* renamed from: f, reason: collision with root package name */
    public static final bm5.p1 f459745f = new y73.r();

    /* renamed from: d, reason: collision with root package name */
    public c83.a f459746d;

    public q() {
        super(0);
        this.f459746d = null;
    }

    public void b(java.lang.String file) {
        com.tencent.mars.xlog.Log.w("Tinker.HotPatchApplyService", "hp_apply from file %s", file);
        if (com.tencent.mm.vfs.w6.j(file)) {
            kotlin.jvm.internal.o.g(file, "file");
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(new java.io.File(file)));
            try {
                long readLong = dataInputStream.readLong();
                vz5.b.a(dataInputStream, null);
                if (readLong == 96093072812398L) {
                    ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).Bi();
                    java.lang.String i17 = new java.io.File("/data/local/tmp/testtpc.apk").exists() ? "/data/local/tmp/testtpc.apk" : c83.e.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
                    com.tencent.mm.vfs.r6 h07 = lp0.b.h0("TPCFile");
                    com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(file);
                    java.lang.String str = a17.f213279f;
                    if (str != null) {
                        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                        if (!a17.f213279f.equals(l17)) {
                            a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                        }
                    }
                    java.lang.String str2 = a17.f213279f;
                    int lastIndexOf = str2.lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        str2 = str2.substring(lastIndexOf + 1);
                    }
                    final com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(h07, str2);
                    ((ku5.t0) ku5.t0.f312615d).q(new y73.u(this, i17, file, r6Var.o(), new xv.m0() { // from class: y73.q$$a
                        @Override // xv.m0
                        public final void a(int i18) {
                            if (i18 == 0) {
                                ak0.n.d(new java.io.File(com.tencent.mm.vfs.r6.this.o()));
                            } else {
                                com.tencent.mars.xlog.Log.e("Tinker.HotPatchApplyService", "TCPFile Fail:%d", java.lang.Integer.valueOf(i18));
                            }
                            com.tencent.mm.vfs.r7 r7Var2 = com.tencent.mm.vfs.q7.f213141a;
                            com.tencent.mm.vfs.r6[] G = lp0.b.h0("TPCFileTemp").G();
                            if (G != null) {
                                for (com.tencent.mm.vfs.r6 r6Var2 : G) {
                                    r6Var2.l();
                                }
                            }
                        }
                    }));
                    return;
                }
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(dataInputStream, th6);
                    throw th7;
                }
            }
        }
        ak0.n.d(new java.io.File(file));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e8, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r13.f54439g.f7534b) == false) goto L39;
     */
    @Override // com.tencent.mm.sdk.event.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean callback(com.tencent.mm.sdk.event.IEvent r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y73.q.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
