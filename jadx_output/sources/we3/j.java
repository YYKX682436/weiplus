package we3;

/* loaded from: classes11.dex */
public final class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ we3.k f445277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ve3.o f445278b;

    public j(we3.k kVar, ve3.o oVar) {
        this.f445277a = kVar;
        this.f445278b = oVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.nw1 liveInfo;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        we3.k kVar = this.f445277a;
        kVar.f445285g = false;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
        int i17 = fVar.f70615a;
        int i18 = kVar.f445280b;
        ve3.o oVar = this.f445278b;
        if (i17 != 0 || fVar.f70616b != 0 || finderObject == null || finderObject.getLiveInfo() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBFinderLivePlayerItem", "GetFinderFeedComment failed, playId: " + i18);
            ((xd3.c) oVar).b(-1, "getCommentSceneFinderLivePage cgi failed, playId: " + i18);
        } else {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            if (finderObject2 == null || (liveInfo = finderObject2.getLiveInfo()) == null) {
                ((xd3.c) oVar).b(-1, "not feedObject, no liveInfo");
            } else if (liveInfo.getBoolean(77)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MBFinderLivePlayerItem", "disable auto play, playId: " + i18);
                ((xd3.c) oVar).b(2, "disable AutoPlay");
            } else if (kVar.f445284f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MBFinderLivePlayerItem", "startPlay, playId: " + i18);
                mn0.b0.L(kVar.f445283e, liveInfo, null, 2, null);
                ve3.o.a(oVar, null, 1, null);
            } else {
                ((xd3.c) oVar).b(-1, "not playing when requesting back");
            }
        }
        return jz5.f0.f302826a;
    }
}
