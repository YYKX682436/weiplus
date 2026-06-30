package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f214519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xcompat.recyclerview.widget.q f214520e;

    public g(com.tencent.mm.xcompat.recyclerview.widget.q qVar, java.util.ArrayList arrayList) {
        this.f214520e = qVar;
        this.f214519d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f214519d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.xcompat.recyclerview.widget.q qVar = this.f214520e;
            if (!hasNext) {
                arrayList.clear();
                qVar.f214615m.remove(arrayList);
                return;
            }
            com.tencent.mm.xcompat.recyclerview.widget.p pVar = (com.tencent.mm.xcompat.recyclerview.widget.p) it.next();
            com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = pVar.f214603a;
            qVar.getClass();
            android.view.View view = y1Var.f214703d;
            int i17 = pVar.f214606d - pVar.f214604b;
            int i18 = pVar.f214607e - pVar.f214605c;
            if (i17 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i18 != 0) {
                view.animate().translationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = view.animate();
            qVar.f214618p.add(y1Var);
            animate.setDuration(qVar.f214465e).setListener(new com.tencent.mm.xcompat.recyclerview.widget.l(qVar, y1Var, i17, view, i18, animate)).start();
        }
    }
}
