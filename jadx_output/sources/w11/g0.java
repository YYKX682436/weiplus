package w11;

/* loaded from: classes12.dex */
public class g0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f442028d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f442029e;

    /* renamed from: f, reason: collision with root package name */
    public final int f442030f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f442031g;

    /* renamed from: h, reason: collision with root package name */
    public final fp.j f442032h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.StringBuilder f442033i;

    /* renamed from: m, reason: collision with root package name */
    public final long f442034m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f442035n;

    public g0() {
        this.f442029e = "";
        this.f442030f = 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        this.f442033i = sb6;
        this.f442034m = -1L;
        this.f442035n = false;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f442032h = new fp.j();
        sb6.append("stack:" + new com.tencent.mm.sdk.platformtools.z3() + " time:" + com.tencent.mm.sdk.platformtools.t8.i1());
    }

    public final boolean H(int i17, java.lang.String str, java.lang.String str2, com.tencent.mm.pointers.PString pString) {
        if (i17 == 50) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetPushSync", "hit voip");
            pString.value = "abort-by-voip";
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetPushSync", "check should launch to mm ,content or from username is null.");
            pString.value = "abort-by-content-nil";
            return false;
        }
        if (i17 == 9998 && str.equalsIgnoreCase("weixin")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetPushSync", "hit ipxx");
            pString.value = "abort-by-ipxx";
            return true;
        }
        if (i17 == 10002 && str2.contains("revokemsg")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetPushSync", "hit MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE");
            pString.value = "abort-by-revoke";
            return true;
        }
        if (i17 < 9998) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetPushSync", "hit notifyMsgType: " + i17);
        pString.value = "abort-by-unknown-msg";
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(long r11, java.lang.String r13, java.lang.String r14, java.util.Map r15, r45.j4 r16) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w11.g0.I(long, java.lang.String, java.lang.String, java.util.Map, r45.j4):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public void cancel() {
        super.cancel();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f442028d = u0Var;
        this.f442033i.append(" lastd:" + this.lastdispatch + " dotime:" + com.tencent.mm.sdk.platformtools.t8.i1() + " net:" + com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a));
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(hashCode());
        objArr[1] = 7;
        objArr[2] = java.lang.Boolean.valueOf(this.f442031g != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetPushSync", "doScene[%d] selector:%d pusher:%b ", objArr);
        if (this.f442031g != null) {
            prepareDispatcher(sVar);
            this.f442031g.c(0L, 0L);
            this.f442031g = null;
            return -1;
        }
        w11.e0 e0Var = new w11.e0(false);
        e0Var.f442013c = com.tencent.mm.network.x2.c().f71993n.f71902o;
        r45.dw4 dw4Var = ((o45.xh) e0Var.getReqObj()).f343036a;
        dw4Var.f372778e = 7;
        dw4Var.f372779f = x51.j1.a(w11.c2.f441991a.a());
        dw4Var.f372780g = 1;
        dw4Var.f372777d = new r45.c50();
        dw4Var.f372781h = wo.q.f447780a;
        int wi6 = ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).wi();
        if (wi6 != 0) {
            dw4Var.f372784n = wi6;
        }
        return dispatch(sVar, e0Var, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public java.lang.String getInfo() {
        return this.f442033i.toString();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 138;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x031f  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r19, int r20, int r21, java.lang.String r22, com.tencent.mm.network.v0 r23, byte[] r24) {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w11.g0.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 500;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean securityLimitCountReach() {
        return super.securityLimitCountReach();
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    public g0(o45.yh yhVar, int i17, long j17) {
        this();
        this.f442030f = i17;
        this.f442034m = j17;
        this.f442031g = new com.tencent.mm.sdk.platformtools.b4(xu5.b.a("MMPushCore"), (com.tencent.mm.sdk.platformtools.a4) new w11.c0(this, yhVar), false);
    }
}
