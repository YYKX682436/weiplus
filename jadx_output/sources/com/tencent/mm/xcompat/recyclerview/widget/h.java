package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes14.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f214539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.q f214540e;

    public h(com.tencent.mm.xcompat.recyclerview.widget.q qVar, java.util.ArrayList arrayList) {
        this.f214540e = qVar;
        this.f214539d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f214539d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.xcompat.recyclerview.widget.q qVar = this.f214540e;
            if (!hasNext) {
                arrayList.clear();
                qVar.f214616n.remove(arrayList);
                return;
            }
            com.tencent.mm.xcompat.recyclerview.widget.o oVar = (com.tencent.mm.xcompat.recyclerview.widget.o) it.next();
            qVar.getClass();
            com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = oVar.f214596a;
            android.view.View view = y1Var == null ? null : y1Var.f214703d;
            com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var2 = oVar.f214597b;
            android.view.View view2 = y1Var2 != null ? y1Var2.f214703d : null;
            java.util.ArrayList arrayList2 = qVar.f214620r;
            long j17 = qVar.f214466f;
            if (view != null) {
                android.view.ViewPropertyAnimator duration = view.animate().setDuration(j17);
                arrayList2.add(oVar.f214596a);
                duration.translationX(oVar.f214600e - oVar.f214598c);
                duration.translationY(oVar.f214601f - oVar.f214599d);
                duration.alpha(0.0f).setListener(new com.tencent.mm.xcompat.recyclerview.widget.m(qVar, oVar, duration, view)).start();
            }
            if (view2 != null) {
                android.view.ViewPropertyAnimator animate = view2.animate();
                arrayList2.add(oVar.f214597b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(j17).alpha(1.0f).setListener(new com.tencent.mm.xcompat.recyclerview.widget.n(qVar, oVar, animate, view2)).start();
            }
        }
    }
}
