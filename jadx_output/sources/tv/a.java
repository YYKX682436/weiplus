package tv;

/* loaded from: classes8.dex */
public abstract class a {
    public static java.lang.String a() {
        return ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Zi() ? g83.a.c() : "wcf://bizimg/";
    }

    public static java.lang.String b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        if (((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Zi()) {
            java.lang.String c17 = g83.a.c();
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            return java.lang.String.format("%spic_%s", c17, com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        }
        if (!gm0.j1.b().m()) {
            return "";
        }
        return java.lang.String.format("%s%s", "wcf://bizimg/", kk.k.g((gm0.j1.b().j() + str).getBytes()));
    }
}
