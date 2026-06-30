package nl4;

/* loaded from: classes11.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nl4.d f338195a;

    public c(nl4.d dVar) {
        this.f338195a = dVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.nw1 liveInfo;
        r45.nw1 liveInfo2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
        java.lang.Integer valueOf = (finderObject == null || (liveInfo2 = finderObject.getLiveInfo()) == null) ? null : java.lang.Integer.valueOf(liveInfo2.getInteger(2));
        boolean z17 = (valueOf != null && 2 == valueOf.intValue()) || (valueOf != null && 5 == valueOf.intValue());
        nl4.d dVar = this.f338195a;
        com.tencent.mars.xlog.Log.i(dVar.f338203h, "cgiGetFinderFeedComment end errType=" + fVar.f70615a + ", errCode=" + fVar.f70616b + ", liveStatus=" + valueOf + ", isLiveEnd=" + z17);
        if (fVar.f70615a != 0 || fVar.f70616b != 0 || finderObject == null || finderObject.getLiveInfo() == null || z17) {
            ll4.a aVar = dVar.f338196a;
            if (aVar != null) {
                ll4.a.a(aVar, 12, null, 2, null);
            }
        } else if (dVar.f338197b || dVar.f338198c) {
            com.tencent.mars.xlog.Log.w(dVar.f338203h, "hasCallStop do not call play " + dVar.f338197b + ", " + dVar.f338198c);
        } else {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            if (finderObject2 != null && (liveInfo = finderObject2.getLiveInfo()) != null) {
                mn0.b0.L(dVar.f338201f, liveInfo, null, 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
