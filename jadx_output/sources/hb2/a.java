package hb2;

/* loaded from: classes2.dex */
public final class a extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public a(java.lang.String username, java.util.List cmdList, boolean z17, int i17, java.lang.String str, int i18, kotlin.jvm.internal.i iVar) {
        super(null, null, 3, null);
        ?? r96 = (i18 & 4) != 0 ? 0 : z17;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        str = (i18 & 16) != 0 ? null : str;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(cmdList, "cmdList");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderoplog";
        lVar.f70667d = 3870;
        r45.rn2 rn2Var = new r45.rn2();
        boolean z18 = true;
        rn2Var.set(1, username);
        rn2Var.getList(2).addAll(cmdList);
        rn2Var.set(3, db2.t4.f228171a.a(3870));
        r45.kv0 kv0Var = (r45.kv0) rn2Var.getCustom(3);
        if (kv0Var != null) {
            kv0Var.set(1, java.lang.Integer.valueOf((int) r96));
        }
        if (i17 != 0) {
            rn2Var.set(5, java.lang.Integer.valueOf(i17));
        }
        if (str != null && str.length() != 0) {
            z18 = false;
        }
        if (!z18) {
            rn2Var.set(6, str);
        }
        lVar.f70664a = rn2Var;
        lVar.f70665b = new r45.sn2();
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[init] username:");
        sb6.append(username);
        sb6.append(", opScene:");
        sb6.append(i17);
        sb6.append(", opUsername");
        sb6.append(str);
        sb6.append(", isMegaVideo:");
        sb6.append((boolean) r96);
        sb6.append(", cmdList:");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(cmdList, 10));
        java.util.Iterator it = cmdList.iterator();
        while (it.hasNext()) {
            r45.hx0 hx0Var = (r45.hx0) it.next();
            arrayList.add("cmdId:" + hx0Var.getInteger(0) + "#finderUsername:" + hx0Var.getString(2));
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("CgiFinderOpLog", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.sn2 resp = (r45.sn2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiFinderOpLog", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + '}');
    }
}
