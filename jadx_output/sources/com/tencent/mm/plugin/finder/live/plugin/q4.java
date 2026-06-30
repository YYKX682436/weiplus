package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class q4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a5 f113957d;

    public q4(com.tencent.mm.plugin.finder.live.plugin.a5 a5Var) {
        this.f113957d = a5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.plugin.a5 a5Var = this.f113957d;
        com.tencent.mm.plugin.finder.live.plugin.a5.u1(a5Var, false);
        com.tencent.mm.plugin.finder.live.widget.fe feVar = a5Var.X;
        java.util.ArrayList arrayList = feVar.f118347e;
        if (arrayList.isEmpty()) {
            uh2.c cVar = uh2.c.f427953a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.List list = uh2.c.f427954b;
            arrayList2.addAll(list);
            if (!arrayList2.isEmpty()) {
                arrayList.add(com.tencent.mm.plugin.finder.live.widget.fe.f118342i);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.addAll(list);
                arrayList.addAll(arrayList3);
            }
        }
        feVar.c(dk2.ef.f233406u);
        feVar.f118346d.notifyDataSetChanged();
        feVar.f118343a.setVisibility(0);
        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.ee(feVar));
    }
}
