package df2;

/* loaded from: classes3.dex */
public final class sh extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.vh f231340b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(df2.vh vhVar, java.lang.Class cls) {
        super(cls);
        this.f231340b = vhVar;
    }

    @Override // dk2.cb
    public void a(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i(this.f231340b.f231602m, "startPollingBannerData onPollingFail ret:" + i17 + ",errMsg:" + errMsg);
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        java.lang.Object obj;
        r45.dc2 result = (r45.dc2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        df2.vh vhVar = this.f231340b;
        com.tencent.mars.xlog.Log.i(vhVar.f231602m, "startPollingBannerData onPollingSuccess");
        je2.n nVar = (je2.n) vhVar.business(je2.n.class);
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderJumpInfo> list = result.getList(0);
        kotlin.jvm.internal.o.f(list, "getJump_infos(...)");
        nVar.getClass();
        boolean isEmpty = list.isEmpty();
        java.lang.String str = nVar.f299245f;
        java.util.LinkedList linkedList = null;
        if (!isEmpty) {
            for (com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo : list) {
                r45.wq1 O6 = nVar.O6(finderJumpInfo.getExt_info());
                if (O6 != null) {
                    if (linkedList == null) {
                        linkedList = new java.util.LinkedList();
                    }
                    java.lang.String string = O6.getString(0);
                    if (string == null || string.length() == 0) {
                        com.tencent.mars.xlog.Log.e(str, "convertJumpInfoListToGameDataList err,ext info id is null!");
                        obj = jz5.f0.f302826a;
                    } else {
                        java.lang.String string2 = O6.getString(0);
                        if (string2 == null) {
                            string2 = "";
                        }
                        obj = java.lang.Boolean.valueOf(linkedList.add(new je2.j(string2, O6, finderJumpInfo)));
                    }
                    if (obj == null) {
                    }
                }
                com.tencent.mars.xlog.Log.e(str, "convertJumpInfoListToGameDataList err,convert extInfo fail!");
            }
        }
        if (linkedList != null) {
            java.util.Iterator it = nVar.Q6().iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                je2.j jVar = (je2.j) it.next();
                java.util.Iterator it6 = linkedList.iterator();
                int i17 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i17 = -1;
                        break;
                    } else if (kotlin.jvm.internal.o.b(((je2.j) it6.next()).f299237a, jVar.f299237a)) {
                        break;
                    } else {
                        i17++;
                    }
                }
                if (!(i17 != -1)) {
                    it.remove();
                    com.tencent.mars.xlog.Log.i(str, "delete game data banner:" + jVar);
                }
            }
            java.util.Iterator it7 = linkedList.iterator();
            while (it7.hasNext()) {
                pm0.v.X(new je2.l(nVar, (je2.j) it7.next()));
            }
        }
    }
}
