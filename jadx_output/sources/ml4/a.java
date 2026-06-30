package ml4;

/* loaded from: classes11.dex */
public abstract class a {
    public static final java.lang.String a(bw5.lp0 lp0Var) {
        java.lang.String url;
        int i17;
        java.lang.String url2;
        java.lang.String i18;
        kotlin.jvm.internal.o.g(lp0Var, "<this>");
        java.lang.String str = null;
        if (lp0Var.d() == null) {
            return null;
        }
        if (il4.l.i(lp0Var.d().f34189e)) {
            java.lang.String filePath = lp0Var.d().i().getFilePath();
            java.lang.String i19 = com.tencent.mm.vfs.w6.i(filePath, false);
            return i19 == null ? filePath : i19;
        }
        boolean z17 = true;
        if (rk4.j5.h(lp0Var)) {
            java.lang.String url3 = lp0Var.e().getUrl();
            if (url3 != null && url3.length() != 0) {
                z17 = false;
            }
            if (z17) {
                bw5.nc0 l17 = lp0Var.d().l();
                url2 = l17.f30621o[5] ? l17.f30617h : "";
            } else {
                url2 = lp0Var.e().getUrl();
            }
            return (!lp0Var.d().l().f30616g || (i18 = com.tencent.mm.vfs.w6.i(url2, false)) == null) ? url2 : i18;
        }
        java.lang.String url4 = lp0Var.e().getUrl();
        if (url4 == null || url4.length() == 0) {
            bw5.z90 j17 = lp0Var.d().j();
            url = j17 != null ? j17.i() : null;
        } else {
            url = lp0Var.e().getUrl();
        }
        if (url != null && !r26.n0.N(url)) {
            return url;
        }
        bw5.v70 d17 = lp0Var.d();
        if (d17 != null && ((i17 = d17.f34189e) == 2 || i17 == 3)) {
            str = d17.b().d();
        }
        return str;
    }
}
