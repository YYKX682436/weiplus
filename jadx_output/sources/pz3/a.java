package pz3;

/* loaded from: classes10.dex */
public final class a extends com.tencent.mm.modelbase.i {
    public a(int i17, java.lang.String url, r45.fw5 searchContactContext) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(searchContactContext, "searchContactContext");
        r45.c05 c05Var = new r45.c05();
        c05Var.f371192d = i17;
        if (i17 == 1) {
            r45.c15 c15Var = new r45.c15();
            c15Var.f371219e = url;
            c15Var.f371218d = searchContactContext;
            c05Var.f371193e = c15Var;
        } else if (i17 == 2) {
            r45.d15 d15Var = new r45.d15();
            d15Var.f371992e = url;
            d15Var.f371991d = searchContactContext;
            c05Var.f371194f = d15Var;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiScanJoinOpenIMRoomReport", "reportScanOpenIMRoom reportType: " + i17 + ", url: " + url + ", searchContactContext: " + searchContactContext);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 15693;
        lVar.f70666c = "/cgi-bin/micromsg-bin/openimdatareport";
        lVar.f70664a = c05Var;
        lVar.f70665b = new r45.d05();
        p(lVar.a());
    }
}
