package so2;

/* loaded from: classes10.dex */
public final class z1 {

    /* renamed from: a */
    public static final so2.z1 f410730a = new so2.z1();

    public static void c(so2.z1 z1Var, r45.qt2 contextObj, java.lang.String finderUser, int i17, long j17, java.lang.String str, boolean z17, int i18, r45.o72 o72Var, java.lang.Integer num, long j18, int i19, java.lang.Object obj) {
        boolean z18 = (i19 & 32) != 0 ? false : z17;
        int i27 = (i19 & 64) != 0 ? 0 : i18;
        r45.o72 o72Var2 = (i19 & 128) != 0 ? null : o72Var;
        java.lang.Integer num2 = (i19 & 256) != 0 ? 0 : num;
        long j19 = (i19 & 512) != 0 ? 0L : j18;
        z1Var.getClass();
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(finderUser, "finderUser");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("follow event commentScene=");
        sb6.append(contextObj.getInteger(7));
        sb6.append(", user=");
        sb6.append(finderUser);
        sb6.append(", opType=");
        sb6.append(i17);
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(j17));
        sb6.append(", commentId=");
        sb6.append(pm0.v.u(j19));
        sb6.append(" form ");
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("Finder.FinderFollowLogic", sb6.toString());
        jx3.f.INSTANCE.idkeyStat(1278L, i17 == 2 ? 5L : 4L, 1L, false);
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).xj(contextObj, contextObj.getLong(6), str, finderUser, i17 == 2 ? 1 : 2);
        new db2.m0(new nv2.a0(finderUser, i17, j17, str, contextObj, false, i27, null, o72Var2, num2, null, null, 0, j19, 0, null, null, null, 253056, null), z18).l().K(new so2.x1(finderUser, i17, contextObj));
    }

    public static void d(so2.z1 z1Var, r45.qt2 contextObj, java.lang.String finderUser, int i17, long j17, java.lang.String str, boolean z17, java.lang.String str2, r45.o72 o72Var, java.lang.Integer num, int i18, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, int i19, r45.p31 p31Var, java.lang.String str3, java.lang.String str4, int i27, java.lang.Object obj) {
        long j18 = (i27 & 8) != 0 ? 0L : j17;
        boolean z18 = (i27 & 32) != 0 ? false : z17;
        java.lang.String participantFinderUsername = (i27 & 64) != 0 ? "" : str2;
        r45.o72 o72Var2 = (i27 & 128) != 0 ? null : o72Var;
        java.lang.Integer num2 = (i27 & 256) != 0 ? 0 : num;
        int i28 = (i27 & 512) != 0 ? 0 : i18;
        com.tencent.mm.protobuf.g gVar3 = (i27 & 1024) != 0 ? null : gVar;
        com.tencent.mm.protobuf.g gVar4 = (i27 & 2048) != 0 ? null : gVar2;
        int i29 = (i27 & 4096) != 0 ? 0 : i19;
        r45.p31 newLifeReportInfo = (i27 & 8192) != 0 ? new r45.p31() : p31Var;
        java.lang.String nonceId = (i27 & 16384) != 0 ? "" : str3;
        java.lang.String micId = (i27 & 32768) != 0 ? "" : str4;
        z1Var.getClass();
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(finderUser, "finderUser");
        kotlin.jvm.internal.o.g(participantFinderUsername, "participantFinderUsername");
        kotlin.jvm.internal.o.g(newLifeReportInfo, "newLifeReportInfo");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(micId, "micId");
        java.lang.String str5 = micId;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("follow event commentScene:");
        sb6.append(contextObj.getInteger(7));
        sb6.append(" user:");
        sb6.append(finderUser);
        sb6.append(" opType: ");
        sb6.append(i17);
        sb6.append(" participantFinderUsername:");
        sb6.append(participantFinderUsername);
        sb6.append(" form ");
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        sb6.append(" enterType:");
        sb6.append(i28);
        com.tencent.mars.xlog.Log.i("Finder.FinderFollowLogic", sb6.toString());
        jx3.f.INSTANCE.idkeyStat(1278L, i17 == 2 ? 5L : 4L, 1L, false);
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).xj(contextObj, contextObj.getLong(6), str, finderUser, i17 == 2 ? 1 : 2);
        nv2.d0.f340470e.a(finderUser, i17, j18, str, contextObj, z18, i28, participantFinderUsername, o72Var2, num2, gVar3, gVar4, i29, newLifeReportInfo, nonceId, str5);
        if (i17 == 2) {
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            qs5.e eVar = qs5.e.f366429d;
            com.tencent.mm.feature.finder.live.v4 v4Var = (com.tencent.mm.feature.finder.live.v4) w0Var;
            v4Var.getClass();
            rl2.a aVar = (rl2.a) ((jz5.n) v4Var.f67000x).getValue();
            aVar.getClass();
            java.lang.String y07 = aVar.y0(finderUser, eVar);
            synchronized (aVar) {
                ce2.a aVar2 = new ce2.a();
                aVar2.field_actionTag = y07;
                aVar2.field_actionTime = java.lang.System.currentTimeMillis();
                aVar.replace(aVar2);
            }
        }
    }

    public final void a(android.content.Context context, r45.qt2 contextObj, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, int i17, boolean z17, int i18) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(feed, "feed");
        r45.xk bizInfo = feed.getFeedObject().getBizInfo();
        if (bizInfo != null) {
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            long j17 = contextObj.getLong(6);
            java.lang.String string = contextObj.getString(21);
            ya2.b2 contact = feed.getContact();
            o3Var.xj(contextObj, j17, string, contact != null ? contact.D0() : "", i17 == 2 ? 1 : 2);
            o25.a aVar = new o25.a();
            aVar.f342469g = false;
            java.lang.String sessionBuffer = feed.getFeedObject().getFeedObject().getSessionBuffer();
            aVar.f342465c = sessionBuffer == null || sessionBuffer.length() == 0 ? ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(feed.getFeedObject().getId(), feed.w(), contextObj.getInteger(5)) : feed.getFeedObject().getFeedObject().getSessionBuffer();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("commentscene", contextObj.getInteger(5));
            jSONObject.put("clicktabcontextid", contextObj.getString(2));
            jSONObject.put("findercontextid", contextObj.getString(1));
            jSONObject.put("feedid", pm0.v.u(feed.getItemId()));
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            aVar.f342466d = r26.i0.t(jSONObject2, ",", ";", false);
            aVar.f342470h = false;
            ((r35.o) ((r35.p) ((o25.o1) i95.n0.c(o25.o1.class))).Ai(context, bizInfo.getString(0), 212, true, new so2.w1(feed), aVar)).f();
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            ya2.b2 contact2 = feed.getContact();
            c(this, contextObj, contact2 != null ? contact2.D0() : "", i17, feed.getItemId(), feed.w(), z17, i18, null, null, 0L, ce1.h.CTRL_INDEX, null);
        }
    }
}
