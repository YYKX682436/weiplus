package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class l3 implements bi4.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.q3 f174045a;

    public l3(com.tencent.mm.plugin.textstatus.ui.q3 q3Var) {
        this.f174045a = q3Var;
    }

    @Override // bi4.m0
    public void a(int i17, java.lang.Object obj) {
        al5.a0 a0Var;
        com.tencent.mm.plugin.textstatus.ui.q3 q3Var = this.f174045a;
        if (i17 == 2) {
            bi4.m0 m0Var = q3Var.D1;
            if (m0Var != null) {
                m0Var.a(2, obj);
                return;
            }
            return;
        }
        if (i17 != 4) {
            if (i17 == 5 && (a0Var = q3Var.B1) != null) {
                a0Var.b();
                return;
            }
            return;
        }
        al5.a0 a0Var2 = q3Var.B1;
        if (a0Var2 != null) {
            a0Var2.c();
        }
    }
}
