package db2;

/* loaded from: classes.dex */
public final class y0 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f228239u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f228240v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(java.lang.String targetFinderUsername, long j17, long j18, java.lang.String nonceId, java.lang.String str, int i17, java.lang.String highLightId, r45.qt2 contextObj, int i18, boolean z17, com.tencent.mm.protobuf.g gVar, java.lang.String requestUniqueCode) {
        super(contextObj);
        kotlin.jvm.internal.o.g(targetFinderUsername, "targetFinderUsername");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(highLightId, "highLightId");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(requestUniqueCode, "requestUniqueCode");
        this.f228239u = requestUniqueCode;
        this.f228240v = "Finder.CgiFinderGetLiveMsgWithOffset";
        r45.s71 s71Var = new r45.s71();
        db2.t4 t4Var = db2.t4.f228171a;
        s71Var.set(1, t4Var.a(5806));
        s71Var.set(3, targetFinderUsername);
        s71Var.set(2, java.lang.Long.valueOf(j17));
        s71Var.set(4, java.lang.Long.valueOf(j18));
        s71Var.set(5, nonceId);
        s71Var.set(10, highLightId);
        s71Var.set(6, java.lang.Integer.valueOf(i18));
        s71Var.set(7, java.lang.Boolean.valueOf(z17));
        s71Var.set(9, gVar);
        s71Var.set(8, java.lang.Integer.valueOf(i17));
        t4Var.h((r45.kv0) s71Var.getCustom(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(contextObj.getInteger(5)), java.lang.Long.valueOf(j18), str)));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = s71Var;
        r45.t71 t71Var = new r45.t71();
        t71Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) t71Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = t71Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetlivemsgwithoffset";
        lVar.f70667d = 5806;
        lVar.f70673j = true;
        lVar.f70674k = 25000;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetLiveMsgWithOffset", "CgiFinderGetLiveMsg init " + s71Var.getLong(2) + ", object_id:" + pm0.v.u(s71Var.getLong(4)) + ", nonce_id:" + s71Var.getString(5) + ", offset:" + s71Var.getInteger(6) + ", continual:" + s71Var.getBoolean(7) + ", username:" + s71Var.getString(3) + ", scene:" + s71Var.getInteger(8) + ",requestUniqueCode:" + requestUniqueCode);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.t71 resp = (r45.t71) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        resp.set(9, this.f228239u);
        java.lang.String str2 = this.f228240v;
        long j17 = this.f253452t;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i(str2, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + ' ');
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(j17, 22L);
        } else {
            com.tencent.mars.xlog.Log.i(str2, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.B(j17, 23L);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(j17, 21L);
    }
}
