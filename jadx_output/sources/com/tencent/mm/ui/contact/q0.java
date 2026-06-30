package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class q0 implements bb5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.s0 f207125a;

    public q0(com.tencent.mm.ui.contact.s0 s0Var) {
        this.f207125a = s0Var;
    }

    @Override // bb5.e
    public int a() {
        return this.f207125a.getCount();
    }

    @Override // bb5.e
    public java.lang.String b(int i17) {
        if (i17 >= 0) {
            com.tencent.mm.ui.contact.s0 s0Var = this.f207125a;
            if (i17 < s0Var.getCount()) {
                com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) s0Var.getItem(i17);
                if (z3Var == null) {
                    return null;
                }
                return z3Var.d1();
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomContactAdapter", "pos is invalid");
        return null;
    }
}
