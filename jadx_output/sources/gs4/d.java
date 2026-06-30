package gs4;

/* loaded from: classes2.dex */
public class d extends com.tencent.mm.modelbase.i {
    public d(java.util.LinkedList linkedList) {
        r45.ws6 ws6Var = new r45.ws6();
        ws6Var.f389426d = linkedList;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ws6Var;
        lVar.f70665b = new r45.xs6();
        lVar.f70667d = 2638;
        lVar.f70666c = "/cgi-bin/mmpay-bin/updateunipayorder";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiUpdateUniPayOrder", "update uni pay order");
    }
}
