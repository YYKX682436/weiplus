package fb2;

/* loaded from: classes2.dex */
public final class f implements fb2.m {
    @Override // fb2.m
    public boolean a(db2.c3 resp, int i17, int i18) {
        r45.nw1 liveInfo;
        java.lang.String str;
        kotlin.jvm.internal.o.g(resp, "resp");
        if (resp.d().f227910f <= 0) {
            com.tencent.mars.xlog.Log.i("FinderLiveIPUrlInterceptor", "onIntercept: error, startRequestTs=" + resp.d().f227910f);
            return false;
        }
        java.util.LinkedList list = resp.getList(1);
        if (list != null) {
            java.util.ArrayList<com.tencent.mm.protocal.protobuf.FinderObject> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
                kotlin.jvm.internal.o.d(finderObject);
                if (hc2.o0.j(finderObject) == 9) {
                    arrayList.add(obj);
                }
            }
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject2 : arrayList) {
                r45.nw1 liveInfo2 = finderObject2.getLiveInfo();
                java.lang.String string = liveInfo2 != null ? liveInfo2.getString(3) : null;
                if (!(string == null || string.length() == 0) && (liveInfo = finderObject2.getLiveInfo()) != null) {
                    zy2.z7 z7Var = (zy2.z7) i95.n0.c(zy2.z7.class);
                    r45.nw1 liveInfo3 = finderObject2.getLiveInfo();
                    if (liveInfo3 == null || (str = liveInfo3.getString(3)) == null) {
                        str = "";
                    }
                    liveInfo.set(3, ((b92.v1) z7Var).Ai("FinderStream", str, resp.d().f227910f));
                }
            }
        }
        return false;
    }

    @Override // fb2.m
    public boolean b(com.tencent.mm.plugin.finder.feed.model.d loadedInfo, int i17) {
        kotlin.jvm.internal.o.g(loadedInfo, "loadedInfo");
        return false;
    }

    @Override // fb2.m
    public boolean c(com.tencent.mm.plugin.finder.feed.model.d loadedInfo, int i17) {
        kotlin.jvm.internal.o.g(loadedInfo, "loadedInfo");
        return false;
    }
}
