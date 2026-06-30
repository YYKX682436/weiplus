package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class iq extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f118691a = new java.util.HashSet();

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        java.lang.String string;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                java.lang.Object obj = s0Var.f293125i;
                r45.z53 z53Var = obj instanceof r45.z53 ? (r45.z53) obj : null;
                if (z53Var != null && z53Var.getInteger(13) == 1 && (string = z53Var.getString(0)) != null) {
                    java.util.HashSet hashSet = this.f118691a;
                    if (!hashSet.contains(string)) {
                        hashSet.add(string);
                        com.tencent.mm.plugin.finder.assist.x2.f102672a.f(1, string);
                    }
                }
            }
        }
    }
}
