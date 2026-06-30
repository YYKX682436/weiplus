package ek2;

/* loaded from: classes.dex */
public final class u2 extends ek2.g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(java.lang.String str, java.util.ArrayList selectChatRoomList, java.util.ArrayList selectUserList) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(selectChatRoomList, "selectChatRoomList");
        kotlin.jvm.internal.o.g(selectUserList, "selectUserList");
        r45.ee2 ee2Var = new r45.ee2();
        ee2Var.set(1, db2.t4.f228171a.b(8586, this.f16135n));
        ee2Var.set(2, str);
        ee2Var.getList(3).addAll(selectChatRoomList);
        ee2Var.getList(4).addAll(selectUserList);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ee2Var;
        r45.fe2 fe2Var = new r45.fe2();
        fe2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) fe2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = fe2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivevisibilityorchargesettings";
        lVar.f70667d = 8586;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.fe2 resp = (r45.fe2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveVisibilityOrChargeSettingsRequest", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
