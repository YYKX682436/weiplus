package xv2;

/* loaded from: classes10.dex */
public final class d implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xv2.e f457402a;

    public d(xv2.e eVar) {
        this.f457402a = eVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str = fVar.f70617c;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.iq2) fVar.f70618d).getCustom(1);
        long id6 = finderObject != null ? finderObject.getId() : 0L;
        xv2.e eVar = this.f457402a;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = eVar.f457403h;
        finderItem.trackPost("doPostSceneEnd");
        java.util.concurrent.CountDownLatch countDownLatch = eVar.f457407o;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(id6);
            if (h17 != null && (finderFeedReportObject2 = h17.field_reportObject) != null) {
                finderFeedReportObject2.setPostTaskCost(finderFeedReportObject2.getPostTaskCost() + ((int) eVar.g()));
            }
            if (h17 != null && (finderFeedReportObject = h17.field_reportObject) != null) {
                hc2.p0.b(finderFeedReportObject, "postSuccess");
            }
            eVar.f457406n = new tv2.q(finderItem);
            countDownLatch.countDown();
            ov2.e.i(eVar, "andr_Cgi_Post_Suc", eVar.f457403h, 0, null, 12, null);
        } else {
            com.tencent.mm.plugin.finder.report.p2.f125237a.P(finderItem.getLocalId(), i17, i18);
            if (finderItem.isPostFailed()) {
                mv2.f0 f0Var = mv2.f0.f331561a;
                pm0.v.X(new mv2.w(finderItem.getLocalId()));
            }
            eVar.f457406n = new tv2.x(finderItem, 2);
            countDownLatch.countDown();
            eVar.h("andr_Cgi_Post_Fail", finderItem, i18, str);
        }
        hz2.d.f286313a.h(i17, i18, str);
        return jz5.f0.f302826a;
    }
}
