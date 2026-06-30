package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class j1 implements com.tencent.mm.ipcinvoker.wx_extension.v {
    public j1(com.tencent.mm.plugin.game.model.i1 i1Var) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r3 < 864000) goto L15;
     */
    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r3, int r4, java.lang.String r5, com.tencent.mm.modelbase.o r6) {
        /*
            r2 = this;
            java.lang.String r0 = "MicroMsg.GameMessageService"
            if (r3 != 0) goto L2e
            if (r4 != 0) goto L2e
            com.tencent.mm.modelbase.n r1 = r6.f70711b
            com.tencent.mm.protobuf.f r1 = r1.f70700a
            if (r1 != 0) goto Ld
            goto L2e
        Ld:
            m53.a5 r1 = (m53.a5) r1
            long r3 = r1.f323565d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "ReportInactiveUser success time: %d"
            com.tencent.mars.xlog.Log.i(r0, r4, r3)
            long r3 = r1.f323565d
            r5 = 10
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L43
            r5 = 864000(0xd2f00, double:4.268727E-318)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L43
            goto L46
        L2e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.tencent.mm.modelbase.n r6 = r6.f70711b
            com.tencent.mm.protobuf.f r6 = r6.f70700a
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r6}
            java.lang.String r4 = "ReportInactiveUser cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s"
            com.tencent.mars.xlog.Log.e(r0, r4, r3)
        L43:
            r3 = 86400(0x15180, double:4.26873E-319)
        L46:
            gm0.b0 r5 = gm0.j1.u()
            com.tencent.mm.storage.n3 r5 = r5.c()
            com.tencent.mm.storage.u3 r6 = com.tencent.mm.storage.u3.USERINFO_GAME_REDDOT_EMPTY_REPORT_MIN_DURATION_SEC_LONG
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r5.x(r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.model.j1.a(int, int, java.lang.String, com.tencent.mm.modelbase.o):void");
    }
}
