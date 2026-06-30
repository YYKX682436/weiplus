package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes14.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f214602d;

    public o0(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView) {
        this.f214602d = recyclerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214602d;
        com.tencent.mm.xcompat.recyclerview.widget.b1 b1Var = recyclerView.S;
        if (b1Var != null) {
            com.tencent.mm.xcompat.recyclerview.widget.q qVar = (com.tencent.mm.xcompat.recyclerview.widget.q) b1Var;
            java.util.ArrayList arrayList = qVar.f214610h;
            boolean z17 = !arrayList.isEmpty();
            java.util.ArrayList arrayList2 = qVar.f214612j;
            boolean z18 = !arrayList2.isEmpty();
            java.util.ArrayList arrayList3 = qVar.f214613k;
            boolean z19 = !arrayList3.isEmpty();
            java.util.ArrayList arrayList4 = qVar.f214611i;
            boolean z27 = !arrayList4.isEmpty();
            if (z17 || z18 || z27 || z19) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    j17 = qVar.f214464d;
                    if (!hasNext) {
                        break;
                    }
                    com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = (com.tencent.mm.xcompat.recyclerview.widget.y1) it.next();
                    android.view.View view = y1Var.f214703d;
                    android.view.ViewPropertyAnimator animate = view.animate();
                    qVar.f214619q.add(y1Var);
                    animate.setDuration(j17).alpha(0.0f).setListener(new com.tencent.mm.xcompat.recyclerview.widget.j(qVar, y1Var, animate, view)).start();
                    it = it;
                }
                arrayList.clear();
                if (z18) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.addAll(arrayList2);
                    qVar.f214615m.add(arrayList5);
                    arrayList2.clear();
                    com.tencent.mm.xcompat.recyclerview.widget.g gVar = new com.tencent.mm.xcompat.recyclerview.widget.g(qVar, arrayList5);
                    if (z17) {
                        android.view.View view2 = ((com.tencent.mm.xcompat.recyclerview.widget.p) arrayList5.get(0)).f214603a.f214703d;
                        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                        n3.u0.n(view2, gVar, j17);
                    } else {
                        gVar.run();
                    }
                }
                if (z19) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    arrayList6.addAll(arrayList3);
                    qVar.f214616n.add(arrayList6);
                    arrayList3.clear();
                    com.tencent.mm.xcompat.recyclerview.widget.h hVar = new com.tencent.mm.xcompat.recyclerview.widget.h(qVar, arrayList6);
                    if (z17) {
                        android.view.View view3 = ((com.tencent.mm.xcompat.recyclerview.widget.o) arrayList6.get(0)).f214596a.f214703d;
                        java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
                        n3.u0.n(view3, hVar, j17);
                    } else {
                        hVar.run();
                    }
                }
                if (z27) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.addAll(arrayList4);
                    qVar.f214614l.add(arrayList7);
                    arrayList4.clear();
                    com.tencent.mm.xcompat.recyclerview.widget.i iVar = new com.tencent.mm.xcompat.recyclerview.widget.i(qVar, arrayList7);
                    if (z17 || z18 || z19) {
                        if (!z17) {
                            j17 = 0;
                        }
                        long max = j17 + java.lang.Math.max(z18 ? qVar.f214465e : 0L, z19 ? qVar.f214466f : 0L);
                        android.view.View view4 = ((com.tencent.mm.xcompat.recyclerview.widget.y1) arrayList7.get(0)).f214703d;
                        java.util.WeakHashMap weakHashMap3 = n3.l1.f334362a;
                        n3.u0.n(view4, iVar, max);
                    } else {
                        iVar.run();
                    }
                }
            }
        }
        recyclerView.L1 = false;
    }
}
