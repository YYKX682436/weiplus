package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.l f139189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f139190e;

    public k(com.tencent.mm.plugin.game.chatroom.view.l lVar, java.util.ArrayList arrayList) {
        this.f139189d = lVar;
        this.f139190e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.game.chatroom.view.l lVar = this.f139189d;
        java.util.ArrayList arrayList = lVar.f139209m;
        java.util.ArrayList arrayList2 = this.f139190e;
        if (arrayList.remove(arrayList2)) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.game.chatroom.view.e eVar = (com.tencent.mm.plugin.game.chatroom.view.e) it.next();
                androidx.recyclerview.widget.k3 k3Var = eVar.f139072a;
                lVar.getClass();
                android.view.View itemView = k3Var.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                int i17 = eVar.f139075d - eVar.f139073b;
                int i18 = eVar.f139076e - eVar.f139074c;
                if (i17 != 0) {
                    itemView.animate().translationX(0.0f);
                }
                if (i18 != 0) {
                    itemView.animate().translationY(0.0f);
                }
                lVar.f139212p.add(k3Var);
                android.view.ViewPropertyAnimator animate = itemView.animate();
                animate.setDuration(lVar.f12170e).setListener(new com.tencent.mm.plugin.game.chatroom.view.h(lVar, k3Var, i17, itemView, i18, animate)).start();
            }
            arrayList2.clear();
        }
    }
}
