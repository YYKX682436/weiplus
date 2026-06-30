package db2;

/* loaded from: classes4.dex */
public final class x3 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228233t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x3(java.util.LinkedList msgList, java.lang.String str) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(msgList, "msgList");
        this.f228233t = "Finder.CgiFinderTranslation";
        r45.jp3 jp3Var = new r45.jp3();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = jp3Var;
        r45.kp3 kp3Var = new r45.kp3();
        kp3Var.setBaseResponse(new r45.ie());
        kp3Var.getBaseResponse().f376960e = new r45.du5();
        lVar.f70665b = kp3Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/gettranstext";
        lVar.f70667d = 631;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        jp3Var.f378007e = msgList;
        jp3Var.f378006d = msgList.size();
        jp3Var.f378008f = str;
        p(a17);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderTranslation", "init request.MsgCount " + jp3Var.f378006d);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.kp3 resp = (r45.kp3) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228233t, "onCgiEnd errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
