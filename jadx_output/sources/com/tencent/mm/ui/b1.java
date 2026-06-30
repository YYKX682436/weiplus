package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class b1 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.d1 f197203a;

    public b1(com.tencent.mm.ui.d1 d1Var) {
        this.f197203a = d1Var;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        com.tencent.mm.ui.d1 d1Var = this.f197203a;
        com.tencent.mm.ui.c1 c1Var = d1Var.f208321b;
        if (c1Var != null) {
            com.tencent.mm.ui.a1 a1Var = d1Var.f208320a;
            com.tencent.mm.ui.z0 z0Var = (com.tencent.mm.ui.z0) c1Var;
            if (a1Var == null) {
                z0Var.getClass();
                return;
            }
            com.tencent.mm.ui.f1 f1Var = z0Var.f212596a;
            java.util.Iterator it = f1Var.f208408e.iterator();
            while (it.hasNext()) {
                com.tencent.mm.ui.a1 a1Var2 = (com.tencent.mm.ui.a1) it.next();
                if (a1Var2 != null) {
                    java.lang.String str = a1Var2.f197112a;
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str == null) {
                        str = "";
                    }
                    if (str.equals(a1Var.f197112a)) {
                        boolean z19 = a1Var.f197115d;
                        java.util.LinkedList linkedList = f1Var.f208409f;
                        if (z19 != z17) {
                            linkedList.add(a1Var2);
                            return;
                        } else {
                            linkedList.remove(a1Var2);
                            return;
                        }
                    }
                }
            }
        }
    }
}
