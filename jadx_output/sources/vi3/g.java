package vi3;

/* loaded from: classes9.dex */
public class g extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f437585d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f437586e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f437587f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f437588g;

    /* renamed from: h, reason: collision with root package name */
    public final int f437589h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437590i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f437591m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f437592n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f437593o;

    public g(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f437587f = str;
        this.f437588g = str2;
        this.f437589h = i17;
        this.f437590i = str3;
        this.f437591m = str4;
        this.f437592n = str5;
        this.f437593o = str6;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.py5();
        lVar.f70665b = new r45.qy5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/sendappmsg";
        lVar.f70667d = com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT;
        lVar.f70668e = 107;
        lVar.f70669f = 1000000107;
        this.f437585d = lVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizeSendAppMsgNetScene", "MsgSynchronizeSendAppMsgNetScene action[%s], messagaction[%s], fileId[%s], fileLen[%d], selfName[%s], stack[%s]", str4, str4, str, java.lang.Integer.valueOf(i17), str3, new com.tencent.mm.sdk.platformtools.z3());
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f437586e = u0Var;
        ot0.q qVar = new ot0.q();
        qVar.f348654f = "ChatSync";
        qVar.f348658g = "ChatSync";
        qVar.f348666i = 35;
        qVar.f348674k = this.f437587f;
        java.lang.String str = this.f437588g;
        qVar.T = str;
        qVar.f348682m = this.f437589h;
        qVar.U = str;
        qVar.f348634J = 0;
        qVar.f348662h = "phone";
        qVar.Y = this.f437591m;
        qVar.f348702r = "supportAfterSleep,supportGetMore";
        qVar.f348686n = this.f437592n;
        qVar.f348733y2 = this.f437593o;
        com.tencent.mm.modelbase.o oVar = this.f437585d;
        r45.py5 py5Var = (r45.py5) oVar.f70710a.f70684a;
        r45.b9 b9Var = new r45.b9();
        java.lang.String str2 = this.f437590i;
        b9Var.set(0, str2);
        b9Var.set(2, java.lang.Integer.valueOf(qVar.f348650e));
        b9Var.set(4, 35);
        b9Var.set(3, str2);
        b9Var.set(5, ot0.q.t(qVar, null, null, 0, 0));
        b9Var.set(6, java.lang.Integer.valueOf((int) com.tencent.mm.sdk.platformtools.t8.i1()));
        py5Var.set(1, b9Var);
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizeSendAppMsgNetScene", "msgSynchronize sendAppMsg onGYNetEnd. [%d,%d,%s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f437586e.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
