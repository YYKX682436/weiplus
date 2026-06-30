package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes3.dex */
public final class s2 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f173130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f173131e;

    public s2(java.util.ArrayList arrayList, kotlin.jvm.internal.g0 g0Var) {
        this.f173130d = arrayList;
        this.f173131e = g0Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        boolean z17;
        com.tencent.mm.plugin.teenmode.ui.p2 p2Var;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.teenmode.ui.p2 p2Var2 = (com.tencent.mm.plugin.teenmode.ui.p2) holder.f293125i;
        boolean z18 = p2Var2.f173103e;
        boolean z19 = !z18;
        p2Var2.f173103e = z19;
        java.util.ArrayList arrayList = this.f173130d;
        kotlin.jvm.internal.g0 g0Var = this.f173131e;
        r45.mz2 mz2Var = p2Var2.f173102d;
        if (i17 != 0) {
            if (z19) {
                g0Var.f310121d |= mz2Var.getLong(0);
                com.tencent.mm.plugin.teenmode.ui.p2 p2Var3 = (com.tencent.mm.plugin.teenmode.ui.p2) kz5.n0.Z(arrayList);
                if (p2Var3 != null) {
                    p2Var3.f173103e = false;
                }
                adapter.notifyItemChanged(0);
            } else {
                g0Var.f310121d &= ~mz2Var.getLong(0);
                if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((com.tencent.mm.plugin.teenmode.ui.p2) it.next()).f173103e) {
                            z17 = false;
                            break;
                        }
                    }
                }
                z17 = true;
                if (z17 && (p2Var = (com.tencent.mm.plugin.teenmode.ui.p2) kz5.n0.Z(arrayList)) != null) {
                    p2Var.f173103e = false;
                    g0Var.f310121d = p2Var.f173102d.getLong(0);
                }
            }
            adapter.notifyItemChanged(i17);
        } else if (z19) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (!kotlin.jvm.internal.o.b((com.tencent.mm.plugin.teenmode.ui.p2) obj, p2Var2)) {
                    arrayList2.add(obj);
                }
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                ((com.tencent.mm.plugin.teenmode.ui.p2) it6.next()).f173103e = false;
            }
            adapter.notifyDataSetChanged();
            g0Var.f310121d = mz2Var.getLong(0);
        } else {
            g0Var.f310121d = 0L;
            adapter.notifyItemChanged(0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("itemClick: pos=");
        sb6.append(i17);
        sb6.append(", wording=");
        sb6.append(mz2Var.getString(1));
        sb6.append(", oldSelected=");
        sb6.append(z18);
        sb6.append(", newSelected=");
        sb6.append(p2Var2.f173103e);
        sb6.append(", tmpSelectedContentFlag=");
        long j17 = g0Var.f310121d;
        r26.a.a(2);
        java.lang.String l17 = java.lang.Long.toString(j17, 2);
        kotlin.jvm.internal.o.f(l17, "toString(...)");
        sb6.append(l17);
        com.tencent.mars.xlog.Log.i("FinderTeenModeContentManageUIC", sb6.toString());
    }
}
