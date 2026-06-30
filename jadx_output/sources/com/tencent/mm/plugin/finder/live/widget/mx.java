package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class mx implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rx f119132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f119133e;

    public mx(com.tencent.mm.plugin.finder.live.widget.rx rxVar, java.util.LinkedList linkedList) {
        this.f119132d = rxVar;
        this.f119133e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        android.view.View view;
        com.tencent.mm.plugin.finder.live.widget.rx rxVar = this.f119132d;
        if (rxVar.X) {
            return;
        }
        rxVar.X = true;
        if (rxVar.Y) {
            return;
        }
        java.util.LinkedList linkedList = this.f119133e;
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (!zl2.r4.f473950a.u1((r45.f62) obj)) {
                    break;
                }
            }
        }
        r45.f62 f62Var = (r45.f62) obj;
        if (f62Var != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(linkedList.indexOf(f62Var));
            int intValue = valueOf.intValue();
            if (!(intValue >= 0 && intValue < linkedList.size())) {
                valueOf = null;
            }
            if (valueOf != null) {
                if (!(rxVar.f0().f438132e != valueOf.intValue())) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue2 = valueOf.intValue();
                    androidx.recyclerview.widget.RecyclerView recyclerView = rxVar.N;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.o.o("timeRv");
                        throw null;
                    }
                    androidx.recyclerview.widget.k3 p07 = recyclerView.p0(intValue2);
                    if (p07 == null || (view = p07.itemView) == null) {
                        return;
                    }
                    view.performClick();
                }
            }
        }
    }
}
