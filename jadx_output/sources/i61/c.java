package i61;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.wallet_core.model.h1 {
    public c(int i17, int i18, int i19, java.lang.String str, int i27, int i28, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.e0 e0Var = new r45.e0();
        e0Var.f372879d = i17;
        e0Var.f372880e = i18;
        e0Var.f372881f = i19;
        e0Var.f372882g = str;
        e0Var.f372883h = i27;
        e0Var.f372884i = i28;
        e0Var.f372885m = str2;
        lVar.f70664a = e0Var;
        lVar.f70665b = new r45.f0();
        lVar.f70666c = "/cgi-bin/mmpay-bin/newaaquerylist";
        lVar.f70667d = 1676;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiAAQueryList", "CgiAAQueryList, limit: %s, offset: %s, type: %s, bill_id: %s, trans_id: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, str2);
    }

    public c(int i17, int i18, int i19) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.e0 e0Var = new r45.e0();
        e0Var.f372879d = i17;
        e0Var.f372880e = i18;
        e0Var.f372881f = i19;
        lVar.f70664a = e0Var;
        lVar.f70665b = new r45.f0();
        lVar.f70666c = "/cgi-bin/mmpay-bin/newaaquerylist";
        lVar.f70667d = 1676;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiAAQueryList", "CgiAAQueryList, limit: %s, offset: %s, type: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }
}
