package o01;

/* loaded from: classes.dex */
public final class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f341892d;

    /* renamed from: e, reason: collision with root package name */
    public final u26.k0 f341893e;

    public e(com.tencent.mm.modelbase.o reqResp, u26.k0 channel) {
        kotlin.jvm.internal.o.g(reqResp, "reqResp");
        kotlin.jvm.internal.o.g(channel, "channel");
        this.f341892d = reqResp;
        this.f341893e = channel;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        if (sVar == null) {
            return -1;
        }
        int dispatch = dispatch(sVar, this.f341892d, this);
        u26.k0 k0Var = this.f341893e;
        if (!k0Var.j()) {
            k0Var.e(new o01.a(q01.f.f359275d, dispatch, -1, -1, "", this, null));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.FlowNetScene", "doScene, netId:" + dispatch);
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return this.f341892d.f70713d;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean needCheckCallback() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r10, int r11, int r12, java.lang.String r13, com.tencent.mm.network.v0 r14, byte[] r15) {
        /*
            r9 = this;
            r15 = 0
            if (r14 == 0) goto L1b
            boolean r0 = r14 instanceof com.tencent.mm.modelbase.o
            if (r0 == 0) goto L8
            goto L9
        L8:
            r14 = r15
        L9:
            if (r14 == 0) goto L1b
            com.tencent.mm.modelbase.o r14 = (com.tencent.mm.modelbase.o) r14
            com.tencent.mm.modelbase.n r14 = r14.f70711b
            com.tencent.mm.protobuf.f r14 = r14.f70700a
            boolean r0 = r14 instanceof r45.ny3
            if (r0 == 0) goto L18
            r45.ny3 r14 = (r45.ny3) r14
            goto L19
        L18:
            r14 = r15
        L19:
            r7 = r14
            goto L1c
        L1b:
            r7 = r15
        L1c:
            u26.k0 r14 = r9.f341893e
            boolean r0 = r14.j()
            if (r0 != 0) goto L3a
            o01.a r8 = new o01.a
            q01.f r1 = q01.f.f359276e
            if (r13 != 0) goto L2e
            java.lang.String r0 = ""
            r5 = r0
            goto L2f
        L2e:
            r5 = r13
        L2f:
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.e(r8)
        L3a:
            r0 = 1
            u26.x0.a(r14, r15, r0, r15)
            com.tencent.mm.modelbase.r1 r2 = gm0.j1.d()
            com.tencent.mm.sdk.platformtools.n3 r14 = r2.f70770m
            com.tencent.mm.modelbase.v1 r15 = new com.tencent.mm.modelbase.v1
            r1 = r15
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r14.post(r15)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "onGYNetEnd, netId:"
            r14.<init>(r15)
            r14.append(r10)
            java.lang.String r10 = " errType:"
            r14.append(r10)
            r14.append(r11)
            java.lang.String r10 = " errCode:"
            r14.append(r10)
            r14.append(r12)
            java.lang.String r10 = " errMsg:"
            r14.append(r10)
            r14.append(r13)
            java.lang.String r10 = r14.toString()
            java.lang.String r11 = "MicroMsg.Mvvm.FlowNetScene"
            com.tencent.mars.xlog.Log.i(r11, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o01.e.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }
}
