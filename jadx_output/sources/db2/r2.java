package db2;

/* loaded from: classes2.dex */
public final class r2 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.mp2 mp2Var = new r45.mp2();
        mp2Var.set(2, finderItem.field_username);
        mp2Var.set(3, finderItem.getClientId());
        mv2.f0 f0Var = mv2.f0.f331561a;
        mp2Var.set(5, java.lang.Long.valueOf(f0Var.j(finderItem)));
        mp2Var.set(6, java.lang.Integer.valueOf(f0Var.k(finderItem)));
        r45.jq2 jq2Var = new r45.jq2();
        jq2Var.set(7, java.lang.Integer.valueOf(finderItem.getPostInfo().getInteger(16)));
        mp2Var.set(4, jq2Var);
        lVar.f70664a = mp2Var;
        r45.np2 np2Var = new r45.np2();
        np2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) np2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = np2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderpostconfirm";
        lVar.f70667d = 11561;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[init] username:");
        sb6.append(mp2Var.getString(2));
        sb6.append(" clientId:");
        sb6.append(mp2Var.getString(3));
        sb6.append(" postFlag:");
        sb6.append(mp2Var.getLong(5));
        sb6.append(" postScene:");
        sb6.append(mp2Var.getInteger(6));
        sb6.append(" findPostTime:");
        r45.jq2 jq2Var2 = (r45.jq2) mp2Var.getCustom(4);
        sb6.append(jq2Var2 != null ? java.lang.Integer.valueOf(jq2Var2.getInteger(7)) : null);
        com.tencent.mars.xlog.Log.i("Finder.LogPost.CgiFinderPostConfirm", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.np2 resp = (r45.np2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.LogPost.CgiFinderPostConfirm", "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
