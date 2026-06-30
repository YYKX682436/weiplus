package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class r4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a5 f114083d;

    public r4(com.tencent.mm.plugin.finder.live.plugin.a5 a5Var) {
        this.f114083d = a5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.plugin.a5 a5Var = this.f114083d;
        com.tencent.mm.plugin.finder.live.plugin.a5.u1(a5Var, false);
        com.tencent.mm.plugin.finder.live.widget.sv svVar = a5Var.Y;
        java.util.ArrayList arrayList = svVar.f119844e;
        arrayList.clear();
        arrayList.add(com.tencent.mm.plugin.finder.live.widget.sv.f119839i);
        vh2.c cVar = vh2.c.f437041a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.addAll(vh2.c.f437042b);
        arrayList.addAll(arrayList2);
        svVar.c(dk2.ef.f233407v);
        svVar.f119843d.notifyDataSetChanged();
        svVar.f119840a.setVisibility(0);
        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.rv(svVar));
    }
}
