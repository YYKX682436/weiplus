package h62;

/* loaded from: classes9.dex */
public class n extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f279202d;

    /* renamed from: e, reason: collision with root package name */
    public final int f279203e;

    /* renamed from: f, reason: collision with root package name */
    public int f279204f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f279205g;

    public n(int i17) {
        this.f279203e = 0;
        this.f279204f = 1;
        this.f279203e = i17;
        this.f279204f = i17 == 3 ? 0 : 1;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List a17 = j62.b.f().a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(4096);
        java.util.ArrayList arrayList = (java.util.ArrayList) a17;
        if (arrayList.size() > 0) {
            com.tencent.mm.autogen.mmdata.rpt.ExptAppReportStruct exptAppReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ExptAppReportStruct();
            java.util.Iterator it = arrayList.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                j62.a aVar = (j62.a) it.next();
                if (aVar != null) {
                    r45.hm0 hm0Var = new r45.hm0();
                    int i19 = aVar.f297879d;
                    hm0Var.f376283d = i19;
                    hm0Var.f376284e = aVar.f297880e;
                    int i27 = aVar.f297881f;
                    hm0Var.f376285f = i27;
                    hm0Var.f376288i = aVar.f297888p;
                    exptAppReportStruct.f56127d = i19;
                    exptAppReportStruct.f56128e = i27;
                    exptAppReportStruct.f56130g = aVar.f297882g;
                    exptAppReportStruct.f56129f = 1;
                    exptAppReportStruct.l();
                    linkedList.add(hm0Var);
                    if (i18 >= 100) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetExptApp", "req local expt app List [%s]", sb6);
                        sb6.setLength(0);
                        i18 = 0;
                    }
                    sb6.append("{Id: " + aVar.f297879d + " group: " + aVar.f297880e + " seq: " + aVar.f297881f + "}");
                    sb6.append(";");
                    i18++;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetExptApp", "req local expt app List [%s] cost[%d]", sb6, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        this.f279205g = linkedList;
    }

    public final r45.je0 H() {
        r45.je0 je0Var = new r45.je0();
        je0Var.f377739d = android.os.Build.MANUFACTURER;
        je0Var.f377740e = wo.w0.m();
        java.lang.String str = android.os.Build.VERSION.SDK_INT + "";
        je0Var.f377741f = str;
        java.lang.String str2 = android.os.Build.CPU_ABI;
        je0Var.f377742g = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetExptApp", "create Device type manufacturer[%s] model[%s] os_api[%s] cpu[%s]", je0Var.f377739d, je0Var.f377740e, str, str2);
        return je0Var;
    }

    public final void I(int i17) {
        int i18 = (int) com.tencent.mm.sdk.platformtools.t8.i1();
        if (i18 > i17) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GET_EXPT_APP_LAST_TIME_SEC_INT, java.lang.Integer.valueOf(i18));
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GET_EXPT_APP_LAST_TIME_SEC_INT, java.lang.Integer.valueOf(i17));
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f279202d = u0Var;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.bf3();
            lVar.f70665b = new r45.cf3();
            lVar.f70666c = "/cgi-bin/mmfddataappsvr/getexptappconfig";
            lVar.f70667d = 1110;
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            r45.bf3 bf3Var = (r45.bf3) a17.f70710a.f70684a;
            bf3Var.f370722e = this.f279203e;
            bf3Var.f370721d = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GET_EXPT_APP_LAST_TIME_SEC_INT, 0)).intValue();
            bf3Var.f370723f = H();
            bf3Var.f370726i = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GET_EXPT_APP_GLOBAL_SEQ_STRING, "");
            if (!gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_NEXT_GET_EXPT_APP_IS_INCREMENT_BOOLEAN, true)) {
                this.f279204f = 0;
            }
            bf3Var.f370725h = this.f279204f;
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GET_EXPT_APP_NEED_LOCAL_LIST_INT, 1)).intValue();
            java.util.LinkedList linkedList = this.f279205g;
            if (intValue == 1 || bf3Var.f370725h == 0) {
                bf3Var.f370724g = linkedList;
            }
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.idkeyStat(863L, 155L, 1L, false);
            if (this.f279204f == 0) {
                fVar.idkeyStat(863L, 166L, 1L, false);
            } else {
                fVar.idkeyStat(863L, 167L, 1L, false);
            }
            java.lang.Object[] objArr = new java.lang.Object[8];
            objArr[0] = java.lang.Integer.valueOf(bf3Var.f370722e);
            objArr[1] = java.lang.Integer.valueOf(bf3Var.f370721d);
            objArr[2] = java.lang.Integer.valueOf(bf3Var.f370725h);
            objArr[3] = bf3Var.f370726i;
            objArr[4] = java.lang.Integer.valueOf(intValue);
            objArr[5] = java.lang.Integer.valueOf(linkedList != null ? linkedList.size() : 0);
            java.util.LinkedList linkedList2 = bf3Var.f370724g;
            objArr[6] = java.lang.Integer.valueOf(linkedList2 != null ? linkedList2.size() : 0);
            objArr[7] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetExptApp", "get expt app scene[%d] lastGetSvrSec[%d] IsIncrement[%d] GlobalSequence[%s] nextReqNeedLocalList[%d] localExptList[%d %d] cost[%d]", objArr);
            return dispatch(sVar, a17, this);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetExptApp", e17, "", new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1110;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.cf3 cf3Var = (r45.cf3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            ((ku5.t0) ku5.t0.f312615d).h(new h62.m(this, cf3Var), "netscene_getexpt");
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneGetExptApp", "get expt error");
            I((int) com.tencent.mm.sdk.platformtools.t8.i1());
            jx3.f.INSTANCE.idkeyStat(863L, 157L, 1L, false);
        }
        this.f279202d.onSceneEnd(i18, i19, str, this);
    }
}
