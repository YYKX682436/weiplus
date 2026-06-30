package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class p8 implements com.tencent.mm.ui.tools.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.c9 f210639a;

    public p8(com.tencent.mm.ui.tools.c9 c9Var) {
        this.f210639a = c9Var;
    }

    @Override // com.tencent.mm.ui.tools.q
    public void L(java.lang.String str) {
        com.tencent.mm.ui.tools.c9 c9Var = this.f210639a;
        if (!c9Var.f210318c) {
            java.lang.String str2 = c9Var.f210316a;
            return;
        }
        com.tencent.mm.ui.tools.b9 b9Var = c9Var.f210324i;
        if (b9Var != null) {
            b9Var.P4(str);
        }
    }

    @Override // com.tencent.mm.ui.tools.q
    public void v() {
        com.tencent.mm.ui.tools.b9 b9Var = this.f210639a.f210324i;
        if (b9Var != null) {
            b9Var.v();
        }
    }

    @Override // com.tencent.mm.ui.tools.q
    public void w() {
        com.tencent.mm.ui.tools.c9 c9Var = this.f210639a;
        if (c9Var.f210318c) {
            c9Var.p();
        } else {
            java.lang.String str = c9Var.f210316a;
        }
    }

    @Override // com.tencent.mm.ui.tools.q
    public void x() {
        com.tencent.mm.ui.tools.b9 b9Var = this.f210639a.f210324i;
        if (b9Var != null) {
            b9Var.H0();
        }
    }
}
