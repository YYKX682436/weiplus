package w52;

@j95.b(dependencies = {c42.l.class})
/* loaded from: classes15.dex */
public final class g extends i95.w implements e42.f0 {
    public static w52.g wi() {
        return (w52.g) i95.n0.c(w52.g.class);
    }

    public java.lang.String Ai() {
        return p52.h.f352025j + "_" + p52.h.f352026k;
    }

    public int Bi() {
        try {
            if (gm0.j1.a()) {
                return ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_REPORT_SDK_SPECIAL_SOURCE_INT_SYNC, 1)).intValue();
            }
            return 1;
        } catch (java.lang.Exception unused) {
            return 1;
        }
    }

    public void Di(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HellBizService", "HABBYGE-MALI, %d putBizData key[%s] data[%s]", java.lang.Integer.valueOf(hashCode()), str, str2);
        r45.kw3 kw3Var = new r45.kw3();
        kw3Var.f379000f = str;
        kw3Var.f378998d = str2;
        d52.d.a().d(500, kw3Var);
    }

    public java.lang.String Ni() {
        return v52.c.g().d();
    }

    public java.lang.String Ri() {
        java.lang.String b17 = w52.j.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.HellBizService", "HABBYGE-MALI, HellBizService, requestSessionPageId: %s", b17);
        return b17;
    }
}
