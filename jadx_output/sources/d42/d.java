package d42;

/* loaded from: classes9.dex */
public class d extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f226406d;

    /* renamed from: e, reason: collision with root package name */
    public long f226407e;

    /* renamed from: f, reason: collision with root package name */
    public long f226408f;

    /* renamed from: g, reason: collision with root package name */
    public d42.a f226409g;

    public final r45.je0 H() {
        r45.je0 je0Var = new r45.je0();
        je0Var.f377739d = android.os.Build.MANUFACTURER;
        je0Var.f377740e = wo.w0.m();
        je0Var.f377741f = android.os.Build.VERSION.SDK_INT + "";
        je0Var.f377742g = android.os.Build.CPU_ABI;
        return je0Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f226406d = u0Var;
        this.f226409g = d42.a.a();
        if (gm0.j1.a()) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_REPORT_EXPT_APP_LAST_TIME_SEC_INT, java.lang.Integer.valueOf((int) com.tencent.mm.sdk.platformtools.t8.i1()));
            long j17 = d42.a.a().f226401a;
            this.f226407e = j17;
            if (j17 == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ReportExptAppInfo", "acquisition did not start  [%d]", java.lang.Long.valueOf(j17));
                return -1;
            }
            this.f226408f = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportExptAppInfo", "acquisition beginTime[%d] endTime[%d]", java.lang.Long.valueOf(this.f226407e), java.lang.Long.valueOf(this.f226408f));
            try {
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70664a = new r45.tp5();
                lVar.f70665b = new r45.up5();
                lVar.f70666c = "/cgi-bin/mmfddataappsvr/reportexptappinfo";
                lVar.f70667d = com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST;
                lVar.f70668e = 0;
                lVar.f70669f = 0;
                com.tencent.mm.modelbase.o a17 = lVar.a();
                r45.tp5 tp5Var = (r45.tp5) a17.f70710a.f70684a;
                tp5Var.f386655d = this.f226407e;
                tp5Var.f386656e = this.f226408f;
                tp5Var.f386658g = H();
                if (d42.b.f226402b == null) {
                    d42.b.f226402b = new d42.b();
                }
                java.util.List<r45.im0> b17 = d42.b.f226402b.b();
                if (((java.util.LinkedList) b17).size() > 0) {
                    tp5Var.f386657f = new java.util.LinkedList();
                    for (r45.im0 im0Var : b17) {
                        r45.im0 im0Var2 = new r45.im0();
                        im0Var2.f377144d = im0Var.f377144d;
                        im0Var2.f377145e = im0Var.f377145e;
                        im0Var2.f377146f = im0Var.f377146f;
                        im0Var2.f377147g = im0Var.f377147g;
                        tp5Var.f386657f.add(im0Var2);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ReportExptAppInfo", "req local appInfoList [%d] ", java.lang.Integer.valueOf(tp5Var.f386657f.size()));
                }
                jx3.f.INSTANCE.idkeyStat(863L, 160L, 1L, false);
                return dispatch(sVar, a17, this);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ReportExptAppInfo", e17, "get appInfo error", new java.lang.Object[0]);
            }
        }
        return -1;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ReportExptAppInfo", "get appInfo on gy end. errType[%d] erroCode[%d] errMsg[%s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.up5 up5Var = (r45.up5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            ((ku5.t0) ku5.t0.f312615d).h(new d42.c(this, up5Var), "netscene_getexpt");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportExptAppInfo", "report change begin time  ok!");
            jx3.f.INSTANCE.idkeyStat(863L, 162L, 1L, false);
        }
        this.f226406d.onSceneEnd(i18, i19, str, this);
    }
}
