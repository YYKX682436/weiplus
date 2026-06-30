package zh4;

/* loaded from: classes11.dex */
public final class q implements vg3.o4, i35.f, d70.k {
    @Override // i35.f
    public void K0(java.lang.String str, int i17, r45.g25 g25Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.PluginTextStatus", "onDeleteContact() called with: username = " + str + ", ret = " + i17 + ", oplogErrMsg = " + g25Var);
        if (i17 == 0) {
            if (str == null || r26.n0.N(str)) {
                return;
            }
            pm0.v.K(null, new zh4.p(str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009b  */
    @Override // vg3.o4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M(com.tencent.mm.storage.z3 r22, com.tencent.mm.storage.z3 r23, r45.tn4 r24, byte[] r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zh4.q.M(com.tencent.mm.storage.z3, com.tencent.mm.storage.z3, r45.tn4, byte[], boolean):void");
    }

    @Override // vg3.o4
    public void b0(com.tencent.mm.storage.z3 z3Var, com.tencent.mm.storage.z3 z3Var2, r45.tn4 tn4Var, byte[] bArr, boolean z17) {
    }

    @Override // vg3.o4
    public void m1(com.tencent.mm.storage.z3 z3Var, r45.xb0 xb0Var) {
    }
}
