package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class t2 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h3 f119860a;

    public t2(com.tencent.mm.plugin.finder.live.widget.h3 h3Var) {
        this.f119860a = h3Var;
    }

    @Override // ym5.m0
    public boolean d() {
        return false;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        com.tencent.mm.plugin.finder.live.widget.h3 h3Var;
        java.lang.String str;
        r45.cw1 cw1Var;
        java.lang.String string;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.lang.String str2 = "";
            h3Var = this.f119860a;
            if (!hasNext) {
                break;
            }
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            com.tencent.mm.plugin.finder.live.widget.v2 v2Var = k3Var instanceof com.tencent.mm.plugin.finder.live.widget.v2 ? (com.tencent.mm.plugin.finder.live.widget.v2) k3Var : null;
            if (v2Var != null) {
                java.util.LinkedHashSet linkedHashSet = h3Var.f118516e;
                r45.cw1 cw1Var2 = v2Var.f120026d;
                if (cw1Var2 != null && (string = cw1Var2.getString(0)) != null) {
                    str2 = string;
                }
                if (!linkedHashSet.contains(str2) && (cw1Var = v2Var.f120026d) != null) {
                    com.tencent.mars.xlog.Log.i(h3Var.f118514c, "report expose nickname " + cw1Var.getString(1));
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).pj(ml2.c4.f327333e, cw1Var.getInteger(5), cw1Var.getString(0));
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).pj(ml2.c4.f327335g, cw1Var.getInteger(5), cw1Var.getString(0));
                }
            }
        }
        if (h3Var.f118516e.size() > 0) {
            h3Var.f118516e.clear();
        }
        java.util.LinkedHashSet linkedHashSet2 = h3Var.f118516e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : exposedHolders) {
            if (obj instanceof com.tencent.mm.plugin.finder.live.widget.v2) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            r45.cw1 cw1Var3 = ((com.tencent.mm.plugin.finder.live.widget.v2) it6.next()).f120026d;
            if (cw1Var3 == null || (str = cw1Var3.getString(0)) == null) {
                str = "";
            }
            arrayList2.add(str);
        }
        linkedHashSet2.addAll(arrayList2);
    }
}
