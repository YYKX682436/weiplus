package yf4;

/* loaded from: classes4.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f461831d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f461832e;

    /* renamed from: h, reason: collision with root package name */
    public int f461835h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f461836i = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461833f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.io.RandomAccessFile f461834g = null;

    public e(java.lang.String str) {
        this.f461832e = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f461831d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pk3();
        lVar.f70665b = new r45.qk3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getpsmimg";
        lVar.f70667d = 141;
        lVar.f70668e = 29;
        lVar.f70669f = 1000000029;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        r45.pk3 pk3Var = (r45.pk3) a17.f70710a.f70684a;
        pk3Var.f383126d = this.f461832e;
        pk3Var.f383127e = this.f461835h;
        return dispatch(sVar, a17, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 141;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:4|(1:6)|7|(4:9|(1:35)(2:13|(1:15)(2:30|31))|16|(2:18|19)(2:21|(2:23|24)(2:25|(2:27|28)(1:29))))|36|37|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetPSMImg", "writeFile write file error [" + r6.f461833f + "]  e:" + r12.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r7, int r8, int r9, java.lang.String r10, com.tencent.mm.network.v0 r11, byte[] r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yf4.e.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 10;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        int i17;
        java.lang.String str = ((r45.pk3) ((com.tencent.mm.modelbase.o) v0Var).f70710a.f70684a).f383126d;
        boolean z17 = false;
        if (str != null && str.indexOf("weixin://") == 0) {
            z17 = true;
        }
        com.tencent.mm.modelbase.o1 o1Var = com.tencent.mm.modelbase.o1.EFailed;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : url invalid:" + this.f461832e);
            return o1Var;
        }
        int i18 = this.f461835h;
        if (i18 < 0 || (i17 = this.f461836i) < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.f461835h + " total:" + this.f461836i);
            return o1Var;
        }
        if (i18 == 0) {
            if (i17 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.f461835h + " total:" + this.f461836i);
                return o1Var;
            }
        } else if (i18 >= i17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetPSMImg", "security checked failed : offset:" + this.f461835h + " total:" + this.f461836i);
            return o1Var;
        }
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
