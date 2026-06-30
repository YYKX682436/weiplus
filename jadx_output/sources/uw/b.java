package uw;

/* loaded from: classes4.dex */
public final class b implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f431481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f431482e;

    public b(kotlin.jvm.internal.c0 c0Var, yz5.l lVar) {
        this.f431481d = c0Var;
        this.f431482e = lVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFinderLiveUtil", "getFinderLiveInfo callback %d/%d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        kotlin.jvm.internal.c0 c0Var = this.f431481d;
        if (c0Var.f310112d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFinderLiveUtil", "Multiple callbacks for the same request, skip");
            return 0;
        }
        c0Var.f310112d = true;
        kz5.p0 p0Var = kz5.p0.f313996d;
        yz5.l lVar = this.f431482e;
        if (i17 != 0 || i18 != 0) {
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(p0Var)));
            return 0;
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.EcsBatchGetLiveInfoResp");
        r45.zg0 zg0Var = (r45.zg0) fVar;
        java.util.LinkedList linkedList = zg0Var.f391993d;
        if (linkedList == null || linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandEcsFinderLiveUtil", "resp live_info_list null or empty");
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(p0Var)));
            return 0;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList<r45.ch0> live_info_list = zg0Var.f391993d;
        kotlin.jvm.internal.o.f(live_info_list, "live_info_list");
        for (r45.ch0 ch0Var : live_info_list) {
            if (ch0Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFinderLiveUtil", "export id: " + ch0Var.f371552g + ", live status: " + ch0Var.f371549d + ", live desc: " + ch0Var.f371550e + ", resp.interval: " + zg0Var.f391994e);
                if (zg0Var.f391994e > 0) {
                    java.lang.String str2 = ch0Var.f371552g;
                    if (!(str2 == null || str2.length() == 0)) {
                        uw.d dVar = uw.d.f431484a;
                        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) uw.d.f431485b.i();
                        java.lang.String export_id = ch0Var.f371552g;
                        kotlin.jvm.internal.o.f(export_id, "export_id");
                        o4Var.A("kEcsFinderLiveRefreshSvrInterval-".concat(export_id), zg0Var.f391994e);
                    }
                }
                linkedList2.add(new com.tencent.pigeon.brand_service.EcsFinderLiveInfo(ch0Var.f371552g, java.lang.Long.valueOf(ch0Var.f371549d), ch0Var.f371550e));
            }
        }
        lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(linkedList2)));
        return 0;
    }
}
