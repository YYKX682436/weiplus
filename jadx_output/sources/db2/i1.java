package db2;

/* loaded from: classes.dex */
public final class i1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public static final db2.h1 f228015t = new db2.h1(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(java.lang.String username, r45.cd1 cd1Var, r45.cd1 cd1Var2, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(username, "username");
        r45.a91 a91Var = new r45.a91();
        a91Var.set(1, db2.t4.f228171a.b(7566, qt2Var));
        a91Var.set(3, username);
        if (cd1Var != null) {
            a91Var.getList(2).add(cd1Var);
        }
        if (cd1Var2 != null) {
            a91Var.getList(2).add(cd1Var2);
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = a91Var;
        lVar.f70665b = new r45.b91();
        lVar.f70667d = 7566;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetnewlbslist";
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderGetNewLbsList", "init GetLbsList");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.ArrayList arrayList;
        r45.b91 resp = (r45.b91) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        sb6.append(' ');
        java.util.LinkedList<r45.dd1> list = resp.getList(1);
        if (list != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (r45.dd1 dd1Var : list) {
                arrayList.add("lbs_type:" + dd1Var.getInteger(0) + " city:" + dd1Var.getString(3) + ' ' + dd1Var.getList(4) + '\n');
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("CgiFinderGetNewLbsList", sb6.toString());
    }
}
