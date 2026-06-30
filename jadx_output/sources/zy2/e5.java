package zy2;

/* loaded from: classes9.dex */
public abstract class e5 {
    public static final r45.g92 a(x05.k kVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String k17;
        kotlin.jvm.internal.o.g(kVar, "<this>");
        r45.g92 g92Var = new r45.g92();
        g92Var.set(0, kVar.A());
        g92Var.set(1, kVar.getFinderUsername());
        g92Var.set(2, kVar.C());
        g92Var.set(3, kVar.getNickname());
        g92Var.set(4, kVar.s());
        x05.n K = kVar.K();
        java.lang.String str3 = "";
        if (K == null || (str = K.getCoverUrl()) == null) {
            str = "";
        }
        java.lang.String t17 = r26.i0.t(str, "&amp;", "&", false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        g92Var.set(5, t17);
        x05.n K2 = kVar.K();
        g92Var.set(7, java.lang.Float.valueOf(K2 != null ? K2.getHeight() : 0.0f));
        x05.n K3 = kVar.K();
        g92Var.set(6, java.lang.Float.valueOf(K3 != null ? K3.getWidth() : 0.0f));
        g92Var.set(11, kVar.getHeadUrl());
        g92Var.set(12, kVar.B());
        g92Var.set(13, java.lang.Integer.valueOf(kVar.getLiveStatus()));
        g92Var.set(15, java.lang.Integer.valueOf(kVar.getSourceType()));
        if (g92Var.getInteger(15) == 0) {
            g92Var.set(15, java.lang.Integer.valueOf(kVar.I()));
        }
        g92Var.set(18, java.lang.Integer.valueOf(kVar.getAuthIconType()));
        if (g92Var.getInteger(18) == 0) {
            g92Var.set(18, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1(kVar.j(), 0)));
        }
        g92Var.set(17, kVar.getAuthIconUrl());
        g92Var.set(19, java.lang.Integer.valueOf(kVar.k()));
        g92Var.set(20, kVar.getBizUsername());
        g92Var.set(21, kVar.getBizNickname());
        g92Var.set(22, java.lang.Integer.valueOf(kVar.n()));
        g92Var.set(25, kVar.H());
        g92Var.set(26, kVar.J());
        g92Var.set(27, kVar.l());
        g92Var.set(28, kVar.N());
        g92Var.set(29, kVar.y());
        g92Var.set(30, kVar.w());
        g92Var.set(31, kVar.x());
        g92Var.set(32, kVar.L());
        g92Var.set(33, kVar.z());
        g92Var.set(34, kVar.Q());
        g92Var.set(35, java.lang.Integer.valueOf(kVar.r()));
        g92Var.set(36, kVar.q());
        g92Var.set(37, kVar.o());
        g92Var.set(38, java.lang.Integer.valueOf(kVar.G()));
        g92Var.set(39, java.lang.Integer.valueOf(kVar.O()));
        g92Var.set(40, kVar.R());
        g92Var.set(41, kVar.F());
        g92Var.set(42, kVar.u());
        g92Var.set(44, java.lang.Integer.valueOf(kVar.P()));
        if (g92Var.getInteger(13) != 1 && g92Var.getInteger(13) != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderShareParser", "[parseFinderLive] shareObject.liveStatus = " + g92Var.getInteger(13));
            g92Var.set(13, 1);
        }
        g92Var.set(14, java.lang.Integer.valueOf(kVar.getExtFlag()));
        g92Var.set(16, kVar.t());
        x05.o E = kVar.E();
        if (E == null || (str2 = E.j()) == null) {
            str2 = "";
        }
        x05.o E2 = kVar.E();
        if (E2 != null && (k17 = E2.k()) != null) {
            str3 = k17;
        }
        r45.xz3 xz3Var = new r45.xz3();
        xz3Var.set(0, str2);
        xz3Var.set(1, str3);
        g92Var.set(43, xz3Var);
        return g92Var;
    }
}
