package ss3;

/* loaded from: classes9.dex */
public abstract class q {
    public static boolean a(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, c01.ta taVar, int i17) {
        if (doFavoriteEvent == null || taVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or readerAppInfo is null");
            if (doFavoriteEvent == null) {
                return false;
            }
            doFavoriteEvent.f54090g.f6326l = com.tencent.mm.R.string.cac;
            return false;
        }
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        jq0Var.e("newsapp");
        jq0Var.j(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(1);
        jq0Var.c(taVar.f37476i);
        jq0Var.f378046s = taVar.f37483p + "";
        jq0Var.f378047t = true;
        jq0Var.f(taVar.h());
        jq0Var.B = "newsapp";
        jq0Var.C = true;
        gp0Var.K0(taVar.h());
        gp0Var.O0(taVar.f());
        gp0Var.m0(taVar.d());
        gp0Var.o0(taVar.c());
        gp0Var.x0(true);
        gp0Var.z0(true);
        gp0Var.h0(5);
        bq0Var.o(jq0Var);
        bq0Var.f370964f.add(gp0Var);
        java.lang.String f17 = taVar.f();
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6319e = f17;
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 5;
        return true;
    }
}
