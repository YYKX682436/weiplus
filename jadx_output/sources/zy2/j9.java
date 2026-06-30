package zy2;

/* loaded from: classes2.dex */
public interface j9 {
    static void a(zy2.j9 j9Var, boolean z17, int i17, zy2.gc gcVar, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: modifyWxPersonalizedSetting");
        }
        if ((i18 & 4) != 0) {
            gcVar = null;
        }
        ((ya2.r) j9Var).getClass();
        hb2.q qVar = hb2.q.f280082e;
        qVar.getClass();
        r45.ti2 ti2Var = new r45.ti2();
        ti2Var.set(0, java.lang.Integer.valueOf(z17 ? 1 : 0));
        ti2Var.set(1, java.lang.Integer.valueOf(i17));
        hb2.w0.m(qVar, ti2Var, gcVar, false, false, null, null, 60, null);
    }

    static void b(zy2.j9 j9Var, java.lang.String finderUserName, boolean z17, java.lang.Long l17, java.lang.String str, zy2.gc gcVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: modBlockPoster");
        }
        java.lang.Long l18 = (i17 & 4) != 0 ? null : l17;
        java.lang.String str2 = (i17 & 8) != 0 ? null : str;
        ((ya2.r) j9Var).getClass();
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        hb2.d dVar = hb2.d.f280030e;
        dVar.getClass();
        r45.lh2 lh2Var = new r45.lh2();
        lh2Var.set(1, java.lang.Integer.valueOf(z17 ? 1 : 0));
        lh2Var.set(0, finderUserName);
        if (l18 != null) {
            lh2Var.set(2, java.lang.Long.valueOf(l18.longValue()));
        }
        hb2.w0.m(dVar, lh2Var, gcVar, false, false, l18, str2, 12, null);
    }
}
