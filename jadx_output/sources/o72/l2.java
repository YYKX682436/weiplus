package o72;

/* loaded from: classes12.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public static final o72.l2 f343393a = new o72.l2();

    public static final c01.f7 b(r45.gp0 gp0Var) {
        if (gp0Var == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavDataItemConverter", "toFavDataItemInMsg: dataId=%s, dataType=%d, cdnDataUrl=%s, cdnDataKey=%s, cdnThumbUrl=%s, cdnThumbKey=%s, fullsize=%d, fullmd5=%s, thumbFullSize=%d, orgnPath=%s, orgnThumbPath=%s", gp0Var.T, java.lang.Integer.valueOf(gp0Var.I), gp0Var.f375434s, gp0Var.f375438u, gp0Var.f375412h, gp0Var.f375420m, java.lang.Long.valueOf(gp0Var.R), gp0Var.M, java.lang.Long.valueOf(gp0Var.f375418l1), gp0Var.V, gp0Var.X);
        c01.f7 f7Var = new c01.f7();
        f7Var.f0(gp0Var.f375404d);
        f7Var.J(gp0Var.f375408f);
        f7Var.H(gp0Var.I);
        f7Var.I(gp0Var.K);
        f7Var.F(gp0Var.T);
        f7Var.L(gp0Var.G);
        f7Var.A(gp0Var.f375434s);
        f7Var.z(gp0Var.f375438u);
        f7Var.O(gp0Var.M);
        f7Var.Q(gp0Var.P);
        f7Var.P(gp0Var.R);
        f7Var.B(gp0Var.f375442w);
        f7Var.E(gp0Var.f375412h);
        f7Var.C(gp0Var.f375420m);
        f7Var.c0(gp0Var.Z);
        f7Var.a0(gp0Var.f375445x0);
        f7Var.Z(gp0Var.f375418l1);
        f7Var.d0(gp0Var.f375424o);
        f7Var.b0(gp0Var.f375430q);
        f7Var.e0(gp0Var.f375439u2);
        f7Var.N(gp0Var.f375443w2);
        f7Var.U(gp0Var.V);
        f7Var.V(gp0Var.X);
        f7Var.K(gp0Var.f375448y);
        f7Var.Y(gp0Var.R1);
        f7Var.W(gp0Var.V1);
        f7Var.T(gp0Var.f375431q2);
        f7Var.S(gp0Var.f375435s2);
        f7Var.G(gp0Var.f375446x1);
        f7Var.R(gp0Var.D2);
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavDataItemConverter", "toFavDataItemInMsg: isHighQualityResources=" + gp0Var.D2 + ", dataId=" + gp0Var.T);
        return f7Var;
    }

    public final l15.c a(c01.f7 f7Var, java.lang.String str) {
        if (f7Var == null) {
            return null;
        }
        l15.c cVar = new l15.c();
        v05.b bVar = new v05.b();
        java.lang.String title = f7Var.getTitle();
        if (title == null) {
            title = "";
        }
        int i17 = bVar.f368365d;
        bVar.set(i17 + 2, title);
        bVar.set(i17 + 6, 6);
        v05.a aVar = new v05.a();
        if (str == null) {
            str = "";
        }
        int i18 = aVar.f368364d;
        aVar.set(i18 + 1, str);
        java.lang.String p17 = f7Var.p();
        if (p17 == null) {
            p17 = "";
        }
        aVar.N(p17);
        aVar.set(i18 + 0, java.lang.Long.valueOf(f7Var.r()));
        int i19 = bVar.f432315e;
        bVar.set(i19 + 8, aVar);
        java.lang.String q17 = f7Var.q();
        bVar.set(i19 + 24, q17 != null ? q17 : "");
        cVar.q(bVar);
        f15.a aVar2 = new f15.a();
        aVar2.k(f7Var);
        cVar.s(aVar2);
        return cVar;
    }
}
