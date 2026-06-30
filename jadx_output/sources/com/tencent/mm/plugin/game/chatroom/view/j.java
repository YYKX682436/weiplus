package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.l f139177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f139178e;

    public j(com.tencent.mm.plugin.game.chatroom.view.l lVar, java.util.ArrayList arrayList) {
        this.f139177d = lVar;
        this.f139178e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.game.chatroom.view.l lVar = this.f139177d;
        java.util.ArrayList arrayList = lVar.f139210n;
        java.util.ArrayList arrayList2 = this.f139178e;
        if (arrayList.remove(arrayList2)) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.game.chatroom.view.b bVar = (com.tencent.mm.plugin.game.chatroom.view.b) it.next();
                kotlin.jvm.internal.o.d(bVar);
                lVar.getClass();
                androidx.recyclerview.widget.k3 k3Var = bVar.f139027a;
                android.view.View view = k3Var != null ? k3Var.itemView : null;
                androidx.recyclerview.widget.k3 k3Var2 = bVar.f139028b;
                android.view.View view2 = k3Var2 != null ? k3Var2.itemView : null;
                java.util.ArrayList arrayList3 = lVar.f139214r;
                if (view != null) {
                    if (k3Var != null) {
                        arrayList3.add(k3Var);
                    }
                    android.view.ViewPropertyAnimator duration = view.animate().setDuration(lVar.f12171f);
                    kotlin.jvm.internal.o.f(duration, "setDuration(...)");
                    duration.translationX(bVar.f139031e - bVar.f139029c);
                    duration.translationY(bVar.f139032f - bVar.f139030d);
                    duration.alpha(0.0f).setListener(new com.tencent.mm.plugin.game.chatroom.view.f(lVar, bVar, duration, view)).start();
                }
                if (view2 != null) {
                    androidx.recyclerview.widget.k3 k3Var3 = bVar.f139028b;
                    if (k3Var3 != null) {
                        arrayList3.add(k3Var3);
                    }
                    android.view.ViewPropertyAnimator animate = view2.animate();
                    animate.translationX(0.0f).translationY(0.0f).setDuration(lVar.f12171f).alpha(1.0f).setListener(new com.tencent.mm.plugin.game.chatroom.view.g(lVar, bVar, animate, view2)).start();
                }
            }
            arrayList2.clear();
        }
    }
}
