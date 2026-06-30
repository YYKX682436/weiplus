package kn;

/* loaded from: classes2.dex */
public class b extends com.tencent.mm.modelbase.i {
    public b(java.lang.String str, java.util.LinkedList linkedList) {
        com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ";");
        r45.x3 x3Var = new r45.x3();
        x3Var.f389726d = str;
        x3Var.f389727e = linkedList;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = x3Var;
        lVar.f70665b = new r45.y3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/addchatroomadmin";
        lVar.f70667d = uc1.i.CTRL_INDEX;
        p(lVar.a());
    }
}
