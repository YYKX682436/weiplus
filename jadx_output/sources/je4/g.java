package je4;

/* loaded from: classes9.dex */
public abstract class g {
    public static final java.util.HashMap a(bw5.v70 v70Var) {
        bw5.j40 b17;
        bw5.e70 g17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildTingListenMenuReportParams", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "tyt_listen_later");
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        hashMap.put("currscene", java.lang.Integer.valueOf(v31.j.CTRL_INDEX));
        hashMap.put("which_button", 51);
        java.lang.String str = null;
        java.lang.String tid = (v70Var == null || (g17 = v70Var.g()) == null) ? null : g17.getTid();
        if (tid == null) {
            tid = "";
        }
        hashMap.put("actionfinderfeedid", tid);
        if (v70Var != null && (b17 = v70Var.b()) != null) {
            str = b17.getUrl();
        }
        hashMap.put("actionbizinfo", rk4.j5.f(str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildTingListenMenuReportParams", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(android.content.Context r8, com.tencent.mm.protocal.protobuf.TimeLineObject r9, android.view.ContextMenu r10) {
        /*
            java.lang.String r0 = "checkAddLaterListenMenu"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.util.TingSnsUtils"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "context"
            kotlin.jvm.internal.o.g(r8, r2)
            java.lang.String r2 = "menu"
            kotlin.jvm.internal.o.g(r10, r2)
            if (r9 != 0) goto L18
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L18:
            java.lang.String r2 = "canAddLaterListenMenu"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            java.lang.Class<qk.o8> r3 = qk.o8.class
            i95.m r3 = i95.n0.c(r3)
            qk.o8 r3 = (qk.o8) r3
            ef0.y2 r3 = (ef0.y2) r3
            boolean r3 = r3.Ai()
            r4 = 0
            if (r3 != 0) goto L32
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L54
        L32:
            r45.a90 r3 = r9.ContentObj
            if (r3 == 0) goto L39
            r45.xs4 r3 = r3.f369852w
            goto L3a
        L39:
            r3 = 0
        L3a:
            if (r3 != 0) goto L40
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L54
        L40:
            r5 = 18
            int r3 = r3.getInteger(r5)
            boolean r3 = il4.l.g(r3)
            if (r3 == 0) goto L51
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            r2 = 1
            goto L55
        L51:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L54:
            r2 = r4
        L55:
            if (r2 == 0) goto L97
            java.lang.Class<qk.a8> r2 = qk.a8.class
            i95.m r2 = i95.n0.c(r2)
            qk.a8 r2 = (qk.a8) r2
            ef0.q1 r2 = (ef0.q1) r2
            boolean r2 = r2.Bi()
            if (r2 == 0) goto L6b
            r2 = 2131778245(0x7f105ac5, float:1.9188013E38)
            goto L6e
        L6b:
            r2 = 2131778221(0x7f105aad, float:1.9187965E38)
        L6e:
            r3 = 33
            java.lang.String r8 = r8.getString(r2)
            r10.add(r4, r3, r4, r8)
            bw5.lp0 r8 = com.tencent.mm.plugin.sns.ui.wm.d(r9)
            bw5.v70 r8 = r8.d()
            java.util.HashMap r5 = a(r8)
            java.lang.Class<dy1.r> r8 = dy1.r.class
            i95.m r8 = i95.n0.c(r8)
            dy1.r r8 = (dy1.r) r8
            java.lang.String r3 = "view_exp"
            r4 = 0
            r6 = 5
            r7 = 0
            r2 = r8
            cy1.a r2 = (cy1.a) r2
            r2.yj(r3, r4, r5, r6, r7)
        L97:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je4.g.b(android.content.Context, com.tencent.mm.protocal.protobuf.TimeLineObject, android.view.ContextMenu):void");
    }

    public static final boolean c(android.content.Context context, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        kotlin.jvm.internal.o.g(context, "context");
        if (timeLineObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
            return false;
        }
        r45.a90 a90Var = timeLineObject.ContentObj;
        r45.xs4 xs4Var = a90Var.f369852w;
        if (xs4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
            return false;
        }
        int i17 = a90Var.f369837e;
        if (i17 == 47) {
            qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
            int integer = xs4Var.getInteger(18);
            ((ef0.l4) i9Var).getClass();
            boolean b17 = km4.v.b(context, integer, z17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
            return b17;
        }
        if (i17 != 48) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
            return false;
        }
        r45.km6 km6Var = a90Var.A;
        if (km6Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
            return false;
        }
        bw5.o50 v17 = il4.d.v(km6Var.f378839e);
        if (v17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
            return false;
        }
        qk.i9 i9Var2 = (qk.i9) i95.n0.c(qk.i9.class);
        int i18 = v17.f30964n;
        ((ef0.l4) i9Var2).getClass();
        boolean a17 = km4.v.a(context, i18, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        return a17;
    }

    public static final boolean d(android.content.Context context, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        kotlin.jvm.internal.o.g(context, "context");
        if (timeLineObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
            return false;
        }
        boolean c17 = c(context, timeLineObject, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSupportTingMsg", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        return c17;
    }
}
