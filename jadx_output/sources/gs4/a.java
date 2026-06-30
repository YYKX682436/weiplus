package gs4;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.modelbase.i {
    public a() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.x40();
        lVar.f70665b = new r45.y40();
        lVar.f70667d = 2913;
        lVar.f70666c = "/cgi-bin/mmpay-bin/closeunipayorder";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiCloseUniPayOrder", "close uni pay order");
    }
}
