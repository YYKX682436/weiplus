package pc0;

@j95.b
/* loaded from: classes4.dex */
public final class u1 extends i95.w implements qc0.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f353316d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f353317e = new java.util.HashSet();

    public void Ai(java.lang.String str) {
        if (str == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileOptService", "markBizUseFinish ".concat(str));
        this.f353316d.add(str);
        wi(str);
    }

    public void Bi(java.lang.String str) {
        if (str == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaFileOptService", "markComponentUseFinish ".concat(str));
        this.f353317e.add(str);
        wi(str);
    }

    public final void wi(java.lang.String str) {
        java.util.HashSet hashSet = this.f353316d;
        if (hashSet.contains(str)) {
            java.util.HashSet hashSet2 = this.f353317e;
            if (hashSet2.contains(str)) {
                hashSet.remove(str);
                hashSet2.remove(str);
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_media_clean_enale_v2, true)) {
                    dw3.h hVar = dw3.h.f244211a;
                    com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
                    java.lang.String o17 = lp0.b.h0("media").o();
                    kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
                    if (r26.n0.B(str, o17, true)) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        java.lang.String str2 = "MEDIA_FILE-" + java.lang.System.currentTimeMillis();
                        dw3.k kVar = dw3.k.f244219a;
                        kVar.c(str, str2);
                        dw3.c0.f244182a.j(str);
                        kVar.e(str, java.lang.System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            }
        }
    }
}
