package i61;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.wallet_core.model.h1 {
    public b(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.y yVar = new r45.y();
        yVar.f390640d = str;
        yVar.f390641e = str2;
        yVar.f390642f = i17;
        lVar.f70664a = yVar;
        lVar.f70665b = new r45.z();
        lVar.f70666c = "/cgi-bin/mmpay-bin/newaapayurge";
        lVar.f70667d = 1644;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiAAPayUrge", "CgiAAPayUrge, billNo: %s, chatroom: %s, scene: %s", str, str2, java.lang.Integer.valueOf(i17));
    }
}
