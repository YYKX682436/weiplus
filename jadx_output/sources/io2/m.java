package io2;

/* loaded from: classes2.dex */
public final class m extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f293488a = new java.util.HashSet();

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        so2.j3 j3Var;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null && (j3Var = (so2.j3) s0Var.f293125i) != null) {
                r45.yf2 yf2Var = j3Var.f410441d;
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = yf2Var.f391034d;
                java.lang.String username = finderContact != null ? finderContact.getUsername() : null;
                if (!(username == null || username.length() == 0) && !hashSet.contains(username)) {
                    hashSet.add(username);
                    cl0.g gVar = new cl0.g();
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = yf2Var.f391034d;
                    gVar.h("finderusername", finderContact2 != null ? finderContact2.getUsername() : null);
                    gVar.h("tabtype", "会员专区");
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    android.content.Context context = s0Var.f293121e;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    java.lang.String gVar2 = gVar.toString();
                    kotlin.jvm.internal.o.f(gVar2, "toString(...)");
                    com.tencent.mm.plugin.finder.report.o3.Mj((com.tencent.mm.plugin.finder.report.o3) c17, context, 16L, 2L, false, 0, 0, r26.i0.t(gVar2, ",", ";", false), 56, null);
                }
            }
        }
        java.util.HashSet hashSet2 = this.f293488a;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }
}
