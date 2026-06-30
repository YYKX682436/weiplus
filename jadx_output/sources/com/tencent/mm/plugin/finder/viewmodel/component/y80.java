package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class y80 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f136537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e90 f136538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f136539f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.v80 f136540g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136541h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y80(boolean z17, com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var, android.widget.FrameLayout frameLayout, com.tencent.mm.plugin.finder.viewmodel.component.v80 v80Var, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136537d = z17;
        this.f136538e = e90Var;
        this.f136539f = frameLayout;
        this.f136540g = v80Var;
        this.f136541h = view;
    }

    public static final void a(com.tencent.mm.plugin.finder.viewmodel.component.v80 v80Var, com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var, android.widget.FrameLayout frameLayout, android.view.View view) {
        android.content.Context context;
        if (v80Var != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = v80Var.f136223a;
            java.lang.String P6 = e90Var.P6(baseFinderFeed.getItemId());
            if (v80Var.f136224b.compareTo(com.tencent.mm.plugin.finder.viewmodel.component.u80.f136109e) >= 0) {
                com.tencent.mm.plugin.finder.report.d2.k(com.tencent.mm.plugin.finder.report.d2.f124994a, view, "listen_page_thumbnail", "view_unexp", true, e90Var.Q6(baseFinderFeed), null, 32, null);
            }
            if (baseFinderFeed.getEnhanceFromEventType() == 16 && !v80Var.f136225c && v80Var.f136224b != com.tencent.mm.plugin.finder.viewmodel.component.u80.f136108d && !v80Var.f136226d && (context = view.getContext()) != null) {
                hc2.v0.c(context, iy1.c.FinderBreakReminder, "page_out", false, kz5.b1.e(new jz5.l("feed_id", P6)), 4, null);
            }
            if (v80Var.f136224b != com.tencent.mm.plugin.finder.viewmodel.component.u80.f136110f) {
                e90Var.U6(baseFinderFeed, com.tencent.mm.plugin.finder.viewmodel.component.u80.f136108d);
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderTingEntryUIC", "flutterContainerClose, feedId = " + P6 + '}');
        }
        pi0.n1 n1Var = e90Var.f134234g;
        if (n1Var != null) {
            n1Var.a();
        }
        e90Var.f134234g = null;
        e90Var.f134238n = null;
        frameLayout.setVisibility(8);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.y80(this.f136537d, this.f136538e, this.f136539f, this.f136540g, this.f136541h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.y80 y80Var = (com.tencent.mm.plugin.finder.viewmodel.component.y80) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y80Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f136537d;
        android.view.View view = this.f136541h;
        com.tencent.mm.plugin.finder.viewmodel.component.v80 v80Var = this.f136540g;
        android.widget.FrameLayout frameLayout = this.f136539f;
        com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var = this.f136538e;
        if (z17) {
            float f17 = com.tencent.mm.ui.bh.a(e90Var.getContext()).f197136b;
            com.tencent.mm.plugin.finder.viewmodel.component.rc rcVar = e90Var.f134235h;
            if (rcVar != null) {
                rcVar.a(true);
            }
            android.view.ViewPropertyAnimator animate = frameLayout.animate();
            animate.setUpdateListener(new com.tencent.mm.plugin.finder.viewmodel.component.w80(e90Var));
            animate.setDuration(300L).translationY(f17).setListener(new com.tencent.mm.plugin.finder.viewmodel.component.x80(e90Var, v80Var, frameLayout, view)).start();
        } else {
            com.tencent.mm.plugin.finder.viewmodel.component.rc rcVar2 = e90Var.f134235h;
            if (rcVar2 != null) {
                rcVar2.a(true);
            }
            com.tencent.mm.plugin.finder.viewmodel.component.rc rcVar3 = e90Var.f134235h;
            if (rcVar3 != null) {
                rcVar3.c(1.0f);
            }
            com.tencent.mm.plugin.finder.viewmodel.component.rc rcVar4 = e90Var.f134235h;
            if (rcVar4 != null) {
                rcVar4.a(false);
            }
            a(v80Var, e90Var, frameLayout, view);
        }
        return jz5.f0.f302826a;
    }
}
