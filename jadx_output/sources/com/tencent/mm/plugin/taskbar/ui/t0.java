package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes3.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f172725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.d1 f172726e;

    public t0(com.tencent.mm.plugin.taskbar.ui.d1 d1Var, java.util.ArrayList arrayList) {
        this.f172726e = d1Var;
        this.f172725d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f172725d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.plugin.taskbar.ui.d1 d1Var = this.f172726e;
            if (!hasNext) {
                arrayList.clear();
                d1Var.f172594m.remove(arrayList);
                return;
            }
            com.tencent.mm.plugin.taskbar.ui.c1 c1Var = (com.tencent.mm.plugin.taskbar.ui.c1) it.next();
            androidx.recyclerview.widget.k3 k3Var = c1Var.f172579a;
            d1Var.getClass();
            android.view.View view = k3Var.itemView;
            int i17 = c1Var.f172582d - c1Var.f172580b;
            int i18 = c1Var.f172583e - c1Var.f172581c;
            if (i17 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i18 != 0) {
                view.animate().translationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = view.animate();
            d1Var.f172597p.add(k3Var);
            animate.setDuration(d1Var.f12170e).setListener(new com.tencent.mm.plugin.taskbar.ui.y0(d1Var, k3Var, i17, view, i18, animate)).start();
        }
    }
}
