package db2;

/* loaded from: classes.dex */
public final class t extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.util.LinkedList mentionIdList, int i17, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(mentionIdList, "mentionIdList");
        r45.lv0 lv0Var = new r45.lv0();
        lv0Var.set(1, db2.t4.f228171a.b(8546, qt2Var));
        lv0Var.set(2, qt2Var != null ? xy2.c.f(qt2Var) : null);
        lv0Var.set(3, mentionIdList);
        lv0Var.set(4, java.lang.Integer.valueOf(i17));
        r45.mv0 mv0Var = new r45.mv0();
        mv0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) mv0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = lv0Var;
        lVar.f70665b = mv0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderbatchgetmentioninfo";
        lVar.f70667d = 8546;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderBatchGetMentionInfo", "init userName = " + lv0Var.getString(2) + ", mentionIdList:" + mentionIdList.size());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.mv0 resp = (r45.mv0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderBatchGetMentionInfo", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
