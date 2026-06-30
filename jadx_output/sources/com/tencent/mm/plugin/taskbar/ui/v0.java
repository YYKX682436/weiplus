package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes3.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f172734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.d1 f172735e;

    public v0(com.tencent.mm.plugin.taskbar.ui.d1 d1Var, java.util.ArrayList arrayList) {
        this.f172735e = d1Var;
        this.f172734d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f172734d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.plugin.taskbar.ui.d1 d1Var = this.f172735e;
            if (!hasNext) {
                arrayList.clear();
                d1Var.f172593l.remove(arrayList);
                return;
            }
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            d1Var.getClass();
            android.view.View view = k3Var.itemView;
            android.view.ViewPropertyAnimator animate = view.animate();
            d1Var.f172596o.add(k3Var);
            animate.alpha(1.0f).setDuration(d1Var.f12168c).setListener(new com.tencent.mm.plugin.taskbar.ui.x0(d1Var, k3Var, view, animate)).start();
        }
    }
}
