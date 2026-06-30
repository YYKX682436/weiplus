package ef3;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.wallet_core.model.h1 {
    public b(int i17, int i18, int i19, int i27) {
        r45.xk3 xk3Var = new r45.xk3();
        xk3Var.f390179d = i17;
        xk3Var.f390180e = i18;
        xk3Var.f390181f = i19;
        xk3Var.f390182g = i27;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = xk3Var;
        lVar.f70665b = new r45.yk3();
        lVar.f70667d = 2680;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getpayfunctionswitchlist";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 1;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetPayFunctionSwitchList", "TpaCountry: %s", java.lang.Integer.valueOf(i17));
    }
}
