package df2;

/* loaded from: classes3.dex */
public final class bn extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.cn f229818b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(df2.cn cnVar, java.lang.Class cls) {
        super(cls);
        this.f229818b = cnVar;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        java.util.ArrayList<java.lang.String> arrayList;
        boolean z17;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> list;
        java.util.LinkedList list2;
        r45.ej6 result = (r45.ej6) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        df2.cn cnVar = this.f229818b;
        com.tencent.mars.xlog.Log.i(cnVar.f229892p, "[startPollingFriendLikeMsg] onPollingSuccess = " + pm0.b0.g(result));
        cnVar.I = (r45.wm2) result.getCustom(0);
        r45.wm2 wm2Var = (r45.wm2) result.getCustom(0);
        java.util.LinkedList linkedList = null;
        if (wm2Var == null || (list2 = wm2Var.getList(3)) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.tencent.mm.protocal.protobuf.FinderCommentInfo) it.next()).getUsername());
            }
        }
        java.lang.String str = cnVar.f229892p;
        if (arrayList != null) {
            for (java.lang.String str2 : arrayList) {
                if (str2 != null && !cnVar.f229891J.contains(str2)) {
                    com.tencent.mars.xlog.Log.i(str, "[startPollingFriendLikeMsg] hasNewLike userName = " + str2 + " }");
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        com.tencent.mars.xlog.Log.i(str, "[startPollingFriendLikeMsg] hasNewLike = " + z17);
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "[startPollingFriendLikeMsg] insert bullet");
            r45.ch1 ch1Var = new r45.ch1();
            ch1Var.set(1, 1000067);
            r45.qq1 qq1Var = new r45.qq1();
            r45.wm2 wm2Var2 = (r45.wm2) result.getCustom(0);
            if (wm2Var2 != null && (list = wm2Var2.getList(3)) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo : list) {
                    r45.xj5 xj5Var = new r45.xj5();
                    xj5Var.set(1, finderCommentInfo.getUsername());
                    arrayList2.add(xj5Var);
                }
                linkedList = new java.util.LinkedList(arrayList2);
            }
            qq1Var.set(0, linkedList);
            ch1Var.set(4, new com.tencent.mm.protobuf.g(qq1Var.toByteArray()));
            dk2.j jVar = new dk2.j(ch1Var);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.add(jVar);
            com.tencent.mm.plugin.finder.live.plugin.mg mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) cnVar.R6(com.tencent.mm.plugin.finder.live.plugin.mg.class);
            if (mgVar != null) {
                mgVar.I1(linkedList2);
            }
        }
        if (arrayList != null) {
            com.tencent.mars.xlog.Log.i(str, "[startPollingFriendLikeMsg] update ".concat(kz5.n0.g0(arrayList, "|", null, null, 0, null, df2.an.f229731d, 30, null)));
            cnVar.f229891J = new java.util.LinkedList(arrayList);
            if (linkedList != null) {
                if (cnVar.H == null) {
                    cnVar.H = new r45.qq1();
                }
                r45.qq1 qq1Var2 = cnVar.H;
                if (qq1Var2 != null) {
                    qq1Var2.set(0, linkedList);
                }
            }
        }
        dk2.tb tbVar = dk2.ef.f233392k;
        r45.dj6 dj6Var = new r45.dj6();
        dj6Var.set(0, cnVar.I);
        tbVar.h(42, dj6Var);
    }
}
