package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public abstract class d1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {
    private android.os.Bundle mBundle;
    private long mRequestTime;
    private int mCmdId = 0;
    private java.lang.String mProcessName = "";
    public long sessionId = 0;
    private int mScene = 0;

    @Override // com.tencent.mm.modelbase.m1
    public int dispatch(com.tencent.mm.network.s sVar, com.tencent.mm.network.v0 v0Var, com.tencent.mm.network.l0 l0Var) {
        this.mRequestTime = java.lang.System.currentTimeMillis();
        rp3.c.a().getClass();
        com.tencent.mm.wallet_core.ui.b0.g(v0Var.getType());
        if (v0Var.getNewDNSBusinessType() == 0) {
            v0Var.setNewDNSBusinessType(2);
        }
        return super.dispatch(sVar, v0Var, l0Var);
    }

    public int getCgicmdForKV() {
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a3  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r31, int r32, int r33, java.lang.String r34, com.tencent.mm.network.v0 r35, byte[] r36) {
        /*
            Method dump skipped, instructions count: 1475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.wallet_core.model.d1.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    public abstract void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17);

    public void setCmdId(int i17) {
        this.mCmdId = i17;
    }

    public void setProcessBundle(android.os.Bundle bundle) {
        this.mBundle = bundle;
    }

    public void setProcessName(java.lang.String str) {
        this.mProcessName = str;
    }

    public void setProcessSessionId(long j17) {
        this.sessionId = j17;
    }

    public void setScene(int i17) {
        this.mScene = i17;
    }
}
