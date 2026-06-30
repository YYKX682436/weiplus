package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes14.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f214542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.q f214543e;

    public i(com.tencent.mm.xcompat.recyclerview.widget.q qVar, java.util.ArrayList arrayList) {
        this.f214543e = qVar;
        this.f214542d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f214542d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.xcompat.recyclerview.widget.q qVar = this.f214543e;
            if (!hasNext) {
                arrayList.clear();
                qVar.f214614l.remove(arrayList);
                return;
            }
            com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = (com.tencent.mm.xcompat.recyclerview.widget.y1) it.next();
            qVar.getClass();
            android.view.View view = y1Var.f214703d;
            android.view.ViewPropertyAnimator animate = view.animate();
            qVar.f214617o.add(y1Var);
            animate.alpha(1.0f).setDuration(qVar.f214463c).setListener(new com.tencent.mm.xcompat.recyclerview.widget.k(qVar, y1Var, view, animate)).start();
        }
    }
}
