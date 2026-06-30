package h62;

/* loaded from: classes8.dex */
public class l extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f279198d;

    /* renamed from: e, reason: collision with root package name */
    public final int f279199e;

    public l(int i17) {
        this.f279199e = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bb, code lost:
    
        if (r15 == false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedList H(boolean r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h62.l.H(boolean):java.util.LinkedList");
    }

    public final void I(int i17) {
        int i18 = (int) com.tencent.mm.sdk.platformtools.t8.i1();
        if (i18 > i17) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GET_EXPT_LAST_TIME_SEC_INT, java.lang.Integer.valueOf(i18));
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GET_EXPT_LAST_TIME_SEC_INT, java.lang.Integer.valueOf(i17));
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f279198d = u0Var;
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.df3();
            lVar.f70665b = new r45.ef3();
            lVar.f70666c = "/cgi-bin/mmexptappsvr-bin/getexptconfig";
            lVar.f70667d = 2738;
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            r45.df3 df3Var = (r45.df3) a17.f70710a.f70684a;
            df3Var.f372377e = this.f279199e;
            df3Var.f372376d = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GET_EXPT_LAST_TIME_SEC_INT, 0)).intValue();
            h62.d vj6 = h62.d.vj();
            boolean z18 = vj6.f279188h;
            vj6.f279188h = false;
            df3Var.f372378f = H(z18);
            long wj6 = h62.d.vj().wj();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(863L, 0L, 1L, false);
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = java.lang.Integer.valueOf(df3Var.f372377e);
            objArr[1] = java.lang.Integer.valueOf(df3Var.f372376d);
            java.util.LinkedList linkedList = df3Var.f372378f;
            objArr[2] = java.lang.Integer.valueOf(linkedList != null ? linkedList.size() : 0);
            objArr[3] = java.lang.Long.valueOf(wj6);
            objArr[4] = java.lang.Boolean.valueOf(z18);
            objArr[5] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetExpt", "get expt config scene[%d] lastGetSvrSec[%d] localExptList[%d] exptKeyCount[%d] needFixAllExpt[%b] cost[%d]", objArr);
            return dispatch(sVar, a17, this);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetExpt", e17, "get expt error", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2738;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetExpt", "get expt on gy end. errType[%d] erroCode[%d] errMsg[%s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.ef3 ef3Var = (r45.ef3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            ((ku5.t0) ku5.t0.f312615d).h(new h62.k(this, ef3Var), "netscene_getexpt");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(863L, 2L, 1L, false);
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetExpt", "get expt error");
            I((int) com.tencent.mm.sdk.platformtools.t8.i1());
        }
        this.f279198d.onSceneEnd(i18, i19, str, this);
    }
}
