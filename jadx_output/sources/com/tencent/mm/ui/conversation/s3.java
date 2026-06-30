package com.tencent.mm.ui.conversation;

/* loaded from: classes5.dex */
public final class s3 implements vg3.o4 {
    @Override // vg3.o4
    public void M(com.tencent.mm.storage.z3 z3Var, com.tencent.mm.storage.z3 z3Var2, r45.tn4 tn4Var, byte[] bArr, boolean z17) {
    }

    @Override // vg3.o4
    public void b0(com.tencent.mm.storage.z3 z3Var, com.tencent.mm.storage.z3 z3Var2, r45.tn4 tn4Var, byte[] bArr, boolean z17) {
    }

    @Override // vg3.o4
    public void m1(com.tencent.mm.storage.z3 z3Var, r45.xb0 xb0Var) {
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        if (d17 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvOnContactDel", "beforeContactDel, clear unread for: %s", d17);
        ((com.tencent.mm.storage.m4) c01.d9.b().r()).b0(d17);
    }
}
