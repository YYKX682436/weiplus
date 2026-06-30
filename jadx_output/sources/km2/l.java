package km2;

/* loaded from: classes3.dex */
public final class l {
    public l(kotlin.jvm.internal.i iVar) {
    }

    public final r45.nw1 a(km2.m liveData) {
        r45.rp1 rp1Var;
        kotlin.jvm.internal.o.g(liveData, "liveData");
        r45.nw1 nw1Var = new r45.nw1();
        nw1Var.set(0, java.lang.Long.valueOf(liveData.f309129d.f68537e));
        nw1Var.set(3, liveData.f309129d.f68545p);
        r45.q82 q82Var = new r45.q82();
        q82Var.set(0, java.lang.Integer.valueOf(liveData.f309129d.f68547q));
        nw1Var.set(9, q82Var);
        nw1Var.set(29, liveData.f309129d.W);
        nw1Var.set(42, java.lang.Integer.valueOf(liveData.f309129d.R));
        com.tencent.mm.live.api.LiveConfig liveConfig = liveData.f309129d;
        kotlin.jvm.internal.o.g(liveConfig, "<this>");
        if (liveConfig.S != 0) {
            rp1Var = new r45.rp1();
            rp1Var.set(0, java.lang.Integer.valueOf(liveConfig.S));
            rp1Var.set(1, java.lang.Integer.valueOf(liveConfig.T));
            rp1Var.set(2, java.lang.Integer.valueOf(liveConfig.U));
            rp1Var.set(3, java.lang.Integer.valueOf(liveConfig.V));
        } else {
            rp1Var = null;
        }
        nw1Var.set(45, rp1Var);
        return nw1Var;
    }

    public final com.tencent.mm.protocal.protobuf.FinderObject b(km2.m liveData) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        finderObject.setLiveInfo(km2.m.f309128u.a(liveData));
        finderObject.setObjectNonceId(liveData.f309129d.f68556z);
        finderObject.setId(liveData.f309129d.f68549s);
        finderObject.setUsername(liveData.f309129d.f68542m);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc = new com.tencent.mm.protocal.protobuf.FinderObjectDesc();
        finderObjectDesc.setDescription(liveData.f309129d.f68551u);
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> linkedList = new java.util.LinkedList<>();
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = new com.tencent.mm.protocal.protobuf.FinderMedia();
        finderMedia.setThumbUrl(liveData.f309129d.f68541i);
        linkedList.add(finderMedia);
        finderObjectDesc.setMedia(linkedList);
        finderObject.setObjectDesc(finderObjectDesc);
        finderObject.setSessionBuffer(liveData.f309129d.F);
        finderObject.setNickname(liveData.f309129d.M);
        return finderObject;
    }
}
