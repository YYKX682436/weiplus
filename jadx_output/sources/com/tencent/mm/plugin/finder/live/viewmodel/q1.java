package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes9.dex */
public final class q1 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f117334a = new java.util.HashSet();

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        cm2.k kVar;
        r45.b73 b73Var;
        java.lang.String string;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            bm2.a aVar = k3Var instanceof bm2.a ? (bm2.a) k3Var : null;
            if (aVar != null && (kVar = aVar.f21746g) != null) {
                r45.c73 c73Var = kVar.f43358d;
                r45.b73 b73Var2 = (r45.b73) c73Var.getCustom(1);
                if ((b73Var2 != null && b73Var2.getInteger(10) == 1) && (b73Var = (r45.b73) c73Var.getCustom(1)) != null && (string = b73Var.getString(0)) != null) {
                    java.util.HashSet hashSet = this.f117334a;
                    if (!hashSet.contains(string)) {
                        hashSet.add(string);
                        com.tencent.mm.plugin.finder.assist.x2.f102672a.f(4, string);
                    }
                }
            }
        }
    }
}
