package zf0;

/* loaded from: classes12.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String str, bm5.f0 resType) {
        kotlin.jvm.internal.o.g(resType, "resType");
        if (str == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        byte[] bytes = str.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(bytes);
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        return new com.tencent.mm.vfs.r6(lp0.b.h0(gm0.j1.b().j() + "_VideoFeatureService"), "send_" + resType.name() + '_' + b17).o();
    }

    public final java.lang.String b(y15.d videoMsg, bm5.f0 resType) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(videoMsg, "videoMsg");
        kotlin.jvm.internal.o.g(resType, "resType");
        if (resType == bm5.f0.f22571s) {
            y15.c n17 = videoMsg.n();
            if (com.tencent.mm.sdk.platformtools.t8.K0(n17.getString(n17.f458922d + 5))) {
                y15.c n18 = videoMsg.n();
                string = n18.getString(n18.f458922d + 1);
            } else {
                y15.c n19 = videoMsg.n();
                string = n19.getString(n19.f458922d + 5);
            }
        } else {
            y15.c n27 = videoMsg.n();
            string = n27.getString(n27.f458922d + 23);
        }
        return a(string, resType);
    }

    public final boolean c(int i17) {
        switch (i17) {
            case -520023:
            case -520019:
            case -520008:
            case -520002:
            case -510001:
                return false;
            default:
                return true;
        }
    }
}
