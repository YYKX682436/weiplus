package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes3.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f172729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.d1 f172730e;

    public u0(com.tencent.mm.plugin.taskbar.ui.d1 d1Var, java.util.ArrayList arrayList) {
        this.f172730e = d1Var;
        this.f172729d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f172729d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.plugin.taskbar.ui.d1 d1Var = this.f172730e;
            if (!hasNext) {
                arrayList.clear();
                d1Var.f172595n.remove(arrayList);
                return;
            }
            com.tencent.mm.plugin.taskbar.ui.b1 b1Var = (com.tencent.mm.plugin.taskbar.ui.b1) it.next();
            d1Var.getClass();
            androidx.recyclerview.widget.k3 k3Var = b1Var.f172563a;
            android.view.View view = k3Var == null ? null : k3Var.itemView;
            androidx.recyclerview.widget.k3 k3Var2 = b1Var.f172564b;
            android.view.View view2 = k3Var2 != null ? k3Var2.itemView : null;
            java.util.ArrayList arrayList2 = d1Var.f172599r;
            if (view != null) {
                android.view.ViewPropertyAnimator duration = view.animate().setDuration(d1Var.f12171f);
                arrayList2.add(b1Var.f172563a);
                duration.translationX(b1Var.f172567e - b1Var.f172565c);
                duration.translationY(b1Var.f172568f - b1Var.f172566d);
                duration.alpha(0.0f).setListener(new com.tencent.mm.plugin.taskbar.ui.z0(d1Var, b1Var, duration, view)).start();
            }
            if (view2 != null) {
                android.view.ViewPropertyAnimator animate = view2.animate();
                arrayList2.add(b1Var.f172564b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(d1Var.f12171f).alpha(1.0f).setListener(new com.tencent.mm.plugin.taskbar.ui.a1(d1Var, b1Var, animate, view2)).start();
            }
        }
    }
}
