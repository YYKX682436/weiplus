package xf0;

@j95.b
/* loaded from: classes12.dex */
public final class u extends jm0.o implements wf0.y1 {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f454218m = jz5.h.b(xf0.t.f454217d);

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(xf0.s.class);
        set.add(xf0.w.class);
    }

    public java.lang.String Zi(com.tencent.mm.storage.f9 msgInfo) {
        java.lang.String str;
        r45.vh4 vh4Var;
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        t21.v2 d17 = vf0.m3.d(msgInfo);
        if (d17 == null) {
            return null;
        }
        if (d17.f415026x != -1) {
            i95.m c17 = i95.n0.c(tg3.u0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String e86 = tg3.u0.e8((tg3.u0) c17, msgInfo, bm5.f0.f22571s, msgInfo.z0(), false, 8, null);
            if (msgInfo.A0() == 1 && (vh4Var = d17.H) != null && vh4Var.f388235e) {
                try {
                    java.lang.String r17 = com.tencent.mm.vfs.w6.r(e86);
                    if (r17 == null) {
                        r17 = "";
                    }
                    if (!r26.i0.n(r17, "/", false)) {
                        r17 = r17.concat("/");
                    }
                    java.lang.String str2 = r17 + com.tencent.mm.vfs.w6.q(e86) + "_hd.mp4";
                    boolean j17 = com.tencent.mm.vfs.w6.j(str2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.VideoDownloadFeatureService", "local capture video, hdFilePath: " + str2 + ", exist: " + j17);
                    if (j17) {
                        str = str2;
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.VideoMsg.VideoDownloadFeatureService", "try to get hd filePath error: " + e17.getMessage());
                }
            }
            str = e86;
        } else if (com.tencent.mm.vfs.w6.j(d17.f())) {
            str = d17.f();
        } else {
            i95.m c18 = i95.n0.c(tg3.u0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            str = tg3.u0.e8((tg3.u0) c18, msgInfo, bm5.f0.f22571s, msgInfo.z0(), false, 8, null);
        }
        if (str == null || com.tencent.mm.vfs.w6.j(str)) {
            return str;
        }
        java.lang.String wi6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).wi(str);
        if (!com.tencent.mm.vfs.w6.j(wi6)) {
            return str;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.VideoDownloadFeatureService", "findVideoPlayPath: final path not found, using tmp_: " + wi6);
        return wi6;
    }

    public final boolean aj() {
        return ((java.lang.Boolean) ((jz5.n) this.f454218m).getValue()).booleanValue();
    }

    public boolean bj(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        t21.v2 d17 = vf0.m3.d(msgInfo);
        if (d17 == null) {
            return false;
        }
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(msgInfo, bm5.f0.f22571s, msgInfo.z0(), false);
        if (d17.f415011i == 199) {
            return com.tencent.mm.vfs.w6.j(rj6);
        }
        if (!com.tencent.mm.vfs.w6.j(rj6)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoMsg.VideoDownloadFeatureService", "not found video file for msg " + msgInfo.z0());
            return false;
        }
        long k17 = com.tencent.mm.vfs.w6.k(rj6);
        long j17 = d17.f415008f;
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.VideoDownloadFeatureService", "nowSize: " + k17 + ", totalLen: " + j17);
        return k17 >= j17;
    }

    public boolean cj(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f279671d;
        return fj(msgInfo) && ((g90.u) wVar).Ai(msgInfo, 2) == 4;
    }

    public boolean fj(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        bm5.f0 f0Var = bm5.f0.f22570r;
        if (!com.tencent.mm.vfs.w6.j(((k90.b) u0Var).rj(msgInfo, f0Var, msgInfo.z0(), false))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoMsg.VideoDownloadFeatureService", "not found origin file for msg " + msgInfo.z0());
            return false;
        }
        t21.v2 d17 = vf0.m3.d(msgInfo);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoMsg.VideoDownloadFeatureService", "not found thumb video info for msg " + msgInfo.z0());
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17.S)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoMsg.VideoDownloadFeatureService", "not found origin video info for msg " + msgInfo.z0());
            return false;
        }
        long k17 = com.tencent.mm.vfs.w6.k(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(msgInfo, f0Var, d17.d(), false));
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.v2 g17 = t21.o2.Ui().g(d17.S);
        if (g17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoMsg.VideoDownloadFeatureService", "not found origin video info for msg " + msgInfo.z0());
            return false;
        }
        long j17 = g17.f415008f;
        if (j17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.VideoDownloadFeatureService", "originVideoFileSize: " + k17 + ", originTotalLen: " + j17);
            return k17 >= j17;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.VideoMsg.VideoDownloadFeatureService", "not found origin video info for msg " + msgInfo.z0() + " originFileSize: " + k17 + " originTotalLen: " + j17);
        return false;
    }

    public boolean hj(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f279671d;
        return ((g90.u) wVar).Bi(msgInfo, 5) == 3 && ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Ai(msgInfo, 5) == 4 && ((java.lang.Number) ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Di(msgInfo).f302833d).intValue() != 3;
    }
}
