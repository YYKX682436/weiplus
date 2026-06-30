package w11;

/* loaded from: classes12.dex */
public class b0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f441971d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f441972e;

    /* renamed from: f, reason: collision with root package name */
    public final int f441973f;

    /* renamed from: g, reason: collision with root package name */
    public int f441974g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f441975h;

    /* renamed from: i, reason: collision with root package name */
    public final int f441976i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f441977m;

    /* renamed from: n, reason: collision with root package name */
    public final int f441978n;

    /* renamed from: o, reason: collision with root package name */
    public final r45.cu5 f441979o;

    /* renamed from: p, reason: collision with root package name */
    public final byte[] f441980p;

    /* renamed from: q, reason: collision with root package name */
    public final long f441981q;

    public b0(int i17, int i18, java.lang.String str, int i19, r45.cu5 cu5Var, byte[] bArr, int i27, long j17) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(i18);
        objArr[1] = str;
        objArr[2] = java.lang.Integer.valueOf(i19);
        objArr[3] = java.lang.Integer.valueOf(cu5Var == null ? -1 : cu5Var.f371839d);
        objArr[4] = java.lang.Integer.valueOf(bArr != null ? bArr.length : -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetAxAuth", "summerauthax NetsceneAxAuth funcId[%d] uri[%s], bType[%d] ticket[%d] randomKey[%d]", objArr);
        this.f441973f = i17;
        this.f441976i = i18;
        this.f441977m = str;
        this.f441978n = i19;
        this.f441979o = cu5Var;
        this.f441980p = bArr;
        w11.y yVar = new w11.y(i18, str, i19, cu5Var, bArr);
        this.f441972e = yVar;
        this.f441974g = i27;
        this.f441975h = str;
        this.f441981q = j17;
        yVar.getReqObj().setAxRandomKey(bArr);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f441971d = u0Var;
        int i17 = this.f441974g + 1;
        this.f441974g = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetAxAuth", "summerauthax doScene callback[%s] retry count %d , uri %s ", u0Var, java.lang.Integer.valueOf(i17), this.f441975h);
        int i18 = this.f441976i;
        com.tencent.mm.network.v0 v0Var = this.f441972e;
        if (i18 == 799) {
            v0Var.setNewDNSBusinessType(2);
        }
        jx3.f.INSTANCE.idkeyStat(148L, 129L, 1L, false);
        return dispatch(sVar, v0Var, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return ((w11.y) this.f441972e).f442171c;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetAxAuth", "summerauthax type [%d], onGYNetEnd [%d, %d, %s], retry count %d, uri %s ", java.lang.Integer.valueOf(getType()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(this.f441974g), this.f441975h);
        if (i18 == 0 && i19 == 0) {
            r45.uc ucVar = ((w11.x) v0Var.getRespObj()).f442162a;
            try {
                com.tencent.mm.network.x2.c().f71993n.R1(this.f441973f, ucVar.toByteArray(), bArr, this.f441981q);
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Integer.valueOf(this.f441973f);
                byte[] byteArray = ucVar.toByteArray();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                objArr[1] = java.lang.Integer.valueOf(byteArray == null ? -1 : byteArray.length);
                objArr[2] = java.lang.Integer.valueOf(bArr == null ? -1 : bArr.length);
                com.tencent.mars.xlog.Log.i("MicroMsg.NetAxAuth", "set axauth session btype[%d], session length [%d], cookie length[%d]", objArr);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetAxAuth", e17, "", new java.lang.Object[0]);
            }
            if (this.f441976i == 799) {
                com.tencent.mm.network.x2.c().k();
            }
            com.tencent.mm.network.x2.c().f71993n.Y0(this.f441973f, false, this.f441981q);
        } else {
            int i27 = this.f441974g;
            if (i27 >= 3) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetAxAuth", "axauth retry reach max times %d, uri is %s ", java.lang.Integer.valueOf(i27), this.f441975h);
                com.tencent.mm.network.x2.c().f71993n.Y0(this.f441973f, false, this.f441981q);
            } else if (v0Var == null || v0Var.getRespObj() == null || !(v0Var.getRespObj().getRetCode() == -1 || v0Var.getRespObj().getRetCode() == -446)) {
                com.tencent.mm.network.x2.c().f71993n.Y0(this.f441973f, false, this.f441981q);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetAxAuth", "summerauth retry NetsceneAxAuth:%d", java.lang.Integer.valueOf(this.f441974g));
                ((ku5.t0) ku5.t0.f312615d).l(new java.lang.Runnable() { // from class: w11.b0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        w11.b0 b0Var = w11.b0.this;
                        b0Var.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetAxAuth", "summerauth do NetsceneAxAuth");
                        if (new w11.b0(b0Var.f441973f, b0Var.f441976i, b0Var.f441977m, b0Var.f441978n, b0Var.f441979o, b0Var.f441980p, b0Var.f441974g, b0Var.f441981q).doScene(com.tencent.mm.network.x2.c(), new w11.b0$$b()) < 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.NetAxAuth", "send axauth failed %s ", b0Var.f441975h);
                            b0Var.f441971d.onSceneEnd(3, -1, "", b0Var);
                            com.tencent.mm.network.x2.c().f71993n.Y0(b0Var.f441973f, false, b0Var.f441981q);
                        }
                    }
                }, 30000L, "axauth");
            }
        }
        this.f441971d.onSceneEnd(i18, i19, str, this);
        if (i19 == -446) {
            jx3.f.INSTANCE.idkeyStat(148L, 137L, 1L, false);
        } else if (i19 == -104) {
            jx3.f.INSTANCE.idkeyStat(148L, 136L, 1L, false);
        } else if (i19 == -13) {
            jx3.f.INSTANCE.idkeyStat(148L, 135L, 1L, false);
        } else if (i19 == -3) {
            jx3.f.INSTANCE.idkeyStat(148L, 134L, 1L, false);
        } else if (i19 == -2) {
            jx3.f.INSTANCE.idkeyStat(148L, 133L, 1L, false);
        } else if (i19 == -1) {
            jx3.f.INSTANCE.idkeyStat(148L, 132L, 1L, false);
        } else if (i19 != 0) {
            jx3.f.INSTANCE.idkeyStat(148L, 138L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(148L, 130L, 1L, false);
        }
        if (i18 != 0) {
            jx3.f.INSTANCE.idkeyStat(148L, 131L, 1L, false);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 3;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
