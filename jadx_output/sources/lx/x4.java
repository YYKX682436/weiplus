package lx;

/* loaded from: classes10.dex */
public final class x4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f322007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f322008b;

    public x4(yz5.l lVar, com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin) {
        this.f322007a = lVar;
        this.f322008b = flutterBizPlugin;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
        int i17 = fVar.f70615a;
        yz5.l lVar = this.f322007a;
        if (i17 != 0 || fVar.f70616b != 0 || finderObject == null || finderObject.getLiveInfo() == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.biz_base.BizFinderLiveStats(null, null, null, null, -1L, null, 47, null))));
            com.tencent.mars.xlog.Log.w(this.f322008b.f65253d, "[requestFinderLiveStats] error " + fVar.f70615a + ", " + fVar.f70616b + '}');
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            java.lang.Long valueOf = java.lang.Long.valueOf(finderObject.getId());
            r45.nw1 liveInfo = finderObject.getLiveInfo();
            kotlin.jvm.internal.o.d(liveInfo);
            java.lang.Long valueOf2 = java.lang.Long.valueOf(liveInfo.getLong(0));
            java.lang.String username = finderObject.getUsername();
            kotlin.jvm.internal.o.d(finderObject.getLiveInfo());
            java.lang.Long valueOf3 = java.lang.Long.valueOf(r2.getInteger(1));
            kotlin.jvm.internal.o.d(finderObject.getLiveInfo());
            java.lang.Long valueOf4 = java.lang.Long.valueOf(r2.getInteger(2));
            r45.nw1 liveInfo2 = finderObject.getLiveInfo();
            kotlin.jvm.internal.o.d(liveInfo2);
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.biz_base.BizFinderLiveStats(valueOf, valueOf2, username, valueOf3, valueOf4, java.lang.Boolean.valueOf(liveInfo2.getBoolean(77))))));
        }
        return jz5.f0.f302826a;
    }
}
