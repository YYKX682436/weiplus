package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes3.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.l f139147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f139148e;

    public i(com.tencent.mm.plugin.game.chatroom.view.l lVar, java.util.ArrayList arrayList) {
        this.f139147d = lVar;
        this.f139148e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.game.chatroom.view.l lVar = this.f139147d;
        java.util.ArrayList arrayList = lVar.f139208l;
        java.util.ArrayList arrayList2 = this.f139148e;
        if (arrayList.remove(arrayList2)) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
                kotlin.jvm.internal.o.d(k3Var);
                lVar.getClass();
                com.tencent.mm.plugin.game.chatroom.view.o1 o1Var = (com.tencent.mm.plugin.game.chatroom.view.o1) lVar;
                android.view.ViewPropertyAnimator animate = k3Var.itemView.animate();
                animate.translationY(0.0f);
                animate.alpha(1.0f);
                animate.setDuration(o1Var.f12168c);
                animate.setInterpolator(animate.getInterpolator());
                animate.setListener(new com.tencent.mm.plugin.game.chatroom.view.c(o1Var, k3Var));
                animate.setStartDelay(java.lang.Math.abs((k3Var.getAdapterPosition() * o1Var.f12168c) / 4));
                animate.start();
                lVar.f139211o.add(k3Var);
            }
            arrayList2.clear();
        }
    }
}
