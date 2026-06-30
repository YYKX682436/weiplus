package kn;

/* loaded from: classes2.dex */
public class e extends com.tencent.mm.modelbase.i {
    public e(java.lang.String str, java.util.LinkedList linkedList) {
        com.tencent.mm.sdk.platformtools.t8.c1(linkedList, ";");
        r45.tb0 tb0Var = new r45.tb0();
        tb0Var.f386270d = str;
        tb0Var.f386271e = linkedList;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = tb0Var;
        lVar.f70665b = new r45.ub0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/delchatroomadmin";
        lVar.f70667d = com.tencent.mars.cdn.proto.AppType.APPTYPE_259_VALUE;
        p(lVar.a());
    }
}
