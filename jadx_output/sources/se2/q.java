package se2;

/* loaded from: classes3.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm2.c f406876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406878g;

    public q(in5.s0 s0Var, lm2.c cVar, java.lang.String str, android.view.View view) {
        this.f406875d = s0Var;
        this.f406876e = cVar;
        this.f406877f = str;
        this.f406878g = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        gk2.e S0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentLikeListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentLikeListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        in5.s0 s0Var = this.f406875d;
        java.lang.Object tag = s0Var.o().getTag();
        com.tencent.mm.plugin.finder.live.plugin.tb tbVar = tag instanceof com.tencent.mm.plugin.finder.live.plugin.tb ? (com.tencent.mm.plugin.finder.live.plugin.tb) tag : null;
        java.lang.String str = this.f406877f;
        if (tbVar == null || (S0 = tbVar.S0()) == null) {
            com.tencent.mars.xlog.Log.e(str, "setBoxCommentLikeListener but buContext is null!");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentLikeListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        lm2.c cVar = this.f406876e;
        if (!cVar.f319374g) {
            se2.w.f406895a.t(s0Var.f293120d, this.f406878g, new se2.p(str, S0, cVar));
        } else if (se2.w.f406895a.d(str, S0, cVar)) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).vj(((mm2.c1) S0.a(mm2.c1.class)).T ? ml2.g5.M : ml2.g5.f327496w, 1, cVar.a(), cVar.j());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/comment/BoxCommentHelper$setBoxCommentLikeListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
