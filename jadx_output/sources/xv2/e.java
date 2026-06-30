package xv2;

/* loaded from: classes10.dex */
public final class e extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f457403h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f457404i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f457405m;

    /* renamed from: n, reason: collision with root package name */
    public pv2.g f457406n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f457407o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.finder.storage.FinderItem finderObj, byte[] bArr) {
        super(java.lang.String.valueOf(finderObj.getLocalId()));
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f457403h = finderObj;
        this.f457404i = bArr;
        this.f457405m = "LogPost.FinderPostCgiStage";
        this.f457406n = new tv2.x(finderObj, 2);
        this.f457407o = new java.util.concurrent.CountDownLatch(1);
    }

    @Override // pv2.g
    public int a() {
        return 4;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // ov2.e
    public pv2.g j() {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        r45.zw0 client_draft_ext_info;
        r45.zw0 client_draft_ext_info2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start localId:");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f457403h;
        sb6.append(finderItem.getLocalId());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f457405m;
        com.tencent.mars.xlog.Log.i(str, sb7);
        cu2.t tVar = cu2.u.f222441a;
        if (!tVar.k(finderItem.getLocalId())) {
            return new tv2.x(finderItem, 1);
        }
        com.tencent.mars.xlog.Log.i(str, "doPostScene " + finderItem.getLocalId());
        boolean isLongVideo = finderItem.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 23L, 1L);
        if (isLongVideo) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 23L, 1L);
            }
        }
        finderItem.trackPost("doPostScene");
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.setPostStage(4);
        }
        tVar.l(finderItem);
        db2.p2 p2Var = new db2.p2(this.f457403h, this.f457404i, false, 4, null);
        r45.qo5 qo5Var = (r45.qo5) finderItem.getPostInfo().getCustom(12);
        if (com.tencent.mm.sdk.platformtools.t8.K0(qo5Var != null ? qo5Var.getString(2) : null)) {
            k(p2Var);
        } else {
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderItem.getFeedObject().getObjectDesc();
            int i17 = 0;
            if (((objectDesc == null || (client_draft_ext_info2 = objectDesc.getClient_draft_ext_info()) == null) ? 0 : client_draft_ext_info2.getInteger(0)) != 0) {
                com.tencent.mars.xlog.Log.i(str, "dealDumpCgi has done, continue post");
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderItem.getFeedObject().getObjectDesc();
                if (objectDesc2 != null && (client_draft_ext_info = objectDesc2.getClient_draft_ext_info()) != null) {
                    i17 = client_draft_ext_info.getInteger(0);
                }
                p2Var.f228114w.set(23, java.lang.Integer.valueOf(i17));
                k(p2Var);
            } else {
                r45.qo5 qo5Var2 = (r45.qo5) finderItem.getPostInfo().getCustom(12);
                java.lang.String field_username = finderItem.field_username;
                kotlin.jvm.internal.o.f(field_username, "field_username");
                new db2.k0(field_username, finderItem.getClientId(), (qo5Var2 == null || (string3 = qo5Var2.getString(2)) == null) ? "" : string3, (qo5Var2 == null || (string2 = qo5Var2.getString(0)) == null) ? "" : string2, (qo5Var2 == null || (string = qo5Var2.getString(1)) == null) ? "" : string).l().K(new xv2.c(finderItem, this, p2Var));
            }
        }
        this.f457407o.await();
        return this.f457406n;
    }

    public final boolean k(db2.p2 p2Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPostSceneContinue finderObj_waitType: ");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f457403h;
        sb6.append(finderItem.getPostInfo().getInteger(13));
        sb6.append(", request_waitType:");
        sb6.append(p2Var.f228114w.getInteger(23));
        com.tencent.mars.xlog.Log.i(this.f457405m, sb6.toString());
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.d1().r()).intValue() == 3) {
            this.f457406n = new tv2.x(finderItem, 2);
            this.f457407o.countDown();
            return false;
        }
        ov2.e.i(this, "andr_Cgi_Post_Begin", this.f457403h, 0, null, 12, null);
        p2Var.l().K(new xv2.d(this));
        return true;
    }
}
