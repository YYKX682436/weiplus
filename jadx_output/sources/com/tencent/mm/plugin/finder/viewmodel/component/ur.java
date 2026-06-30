package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ur extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f136162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.hs f136163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136164f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f136165g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f136166h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f136167i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f136168m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f136169n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur(com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, in5.s0 s0Var, android.widget.FrameLayout frameLayout, java.util.Map map, boolean z17, android.widget.FrameLayout frameLayout2, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136163e = hsVar;
        this.f136164f = s0Var;
        this.f136165g = frameLayout;
        this.f136166h = map;
        this.f136167i = z17;
        this.f136168m = frameLayout2;
        this.f136169n = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.ur(this.f136163e, this.f136164f, this.f136165g, this.f136166h, this.f136167i, this.f136168m, this.f136169n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.ur) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar;
        java.lang.Object wi6;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f136162d;
        in5.s0 s0Var = this.f136164f;
        com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar2 = this.f136163e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.viewmodel.component.oq oqVar = com.tencent.mm.plugin.finder.viewmodel.component.hs.f134650z;
            hsVar2.getClass();
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "bindAnimationNPSFlutter, holder = " + s0Var);
            if (hsVar2.f134654g != null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "bindAnimationNPSFlutter , flutterContainer != null");
            } else {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed v76 = hsVar2.v7(s0Var, null);
                if (v76 != null) {
                    try {
                        android.content.Context context = s0Var.f293121e;
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        pf5.z zVar = pf5.z.f353948a;
                        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        hsVar2.f134656i = new com.tencent.mm.plugin.finder.viewmodel.component.lq(((com.tencent.mm.plugin.finder.viewmodel.component.a4) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.a4.class)).U6(hsVar2.getFragment(), v76, s0Var));
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.e("Finder.FinderNpsSurveyUIC", "getNPSFlutterView, exp=" + th6);
                    }
                }
            }
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.service.x4.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.service.x4 x4Var = (com.tencent.mm.plugin.finder.service.x4) c17;
            android.widget.FrameLayout frameLayout = this.f136165g;
            androidx.lifecycle.o mo133getLifecycle = hsVar2.getActivity().mo133getLifecycle();
            kotlin.jvm.internal.o.f(mo133getLifecycle, "getLifecycle(...)");
            kr2.j jVar = hsVar2.f134655h;
            kotlin.jvm.internal.o.e(jVar, "null cannot be cast to non-null type io.flutter.embedding.engine.plugins.FlutterPlugin");
            java.util.List c18 = kz5.b0.c(jVar);
            java.util.Map map = this.f136166h;
            this.f136162d = 1;
            hsVar = hsVar2;
            wi6 = x4Var.wi(frameLayout, mo133getLifecycle, "nps", (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : c18, (r18 & 32) != 0 ? null : map, this);
            if (wi6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            wi6 = obj;
            hsVar = hsVar2;
        }
        pi0.n1 n1Var = (pi0.n1) wi6;
        boolean z17 = this.f136167i;
        long j17 = this.f136169n;
        android.widget.FrameLayout frameLayout2 = this.f136165g;
        android.widget.FrameLayout frameLayout3 = this.f136168m;
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "realPopupFlutterSurvey, needFadeIn");
            com.tencent.mm.plugin.finder.viewmodel.component.oq oqVar2 = com.tencent.mm.plugin.finder.viewmodel.component.hs.f134650z;
            hsVar.getClass();
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "pauseVideo");
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) ((com.tencent.mm.plugin.finder.viewmodel.component.nb0) pf5.u.f353936a.e(zy2.b6.class).c(com.tencent.mm.plugin.finder.viewmodel.component.nb0.class))).c7(hsVar.getActivity());
            s0Var.o().setDescendantFocusability(262144);
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setFillAfter(true);
            com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar3 = hsVar;
            android.widget.FrameLayout frameLayout4 = hsVar3.f134657m;
            if (frameLayout4 != null) {
                frameLayout4.startAnimation(alphaAnimation);
            }
            frameLayout3.addView(frameLayout2);
            hsVar3.f134657m = frameLayout2;
            android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation2.setDuration(300L);
            alphaAnimation2.setFillAfter(true);
            alphaAnimation2.setAnimationListener(new com.tencent.mm.plugin.finder.viewmodel.component.rr(hsVar3, n1Var));
            frameLayout2.startAnimation(alphaAnimation2);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("realPopupFlutterSurvey-2, feedId = ");
            sb6.append(hsVar3.T6(j17));
            sb6.append(", holder=");
            sb6.append(hsVar3.V6(s0Var));
            sb6.append(", itemView=");
            android.view.View itemView = s0Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            sb6.append(hsVar3.W6(itemView));
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
        } else {
            com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar4 = hsVar;
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "realPopupFlutterSurvey, do not needFadeIn");
            hsVar4.f134654g = n1Var;
            frameLayout3.setTranslationY(s0Var.itemView.getHeight());
            frameLayout3.setVisibility(0);
            frameLayout3.addView(frameLayout2);
            com.tencent.mm.plugin.finder.viewmodel.component.lq lqVar = hsVar4.f134656i;
            if (lqVar != null) {
                lqVar.b(true);
            }
            android.view.ViewPropertyAnimator duration = frameLayout3.animate().translationY(0.0f).setDuration(300L);
            kotlin.jvm.internal.o.f(duration, "setDuration(...)");
            duration.setUpdateListener(new com.tencent.mm.plugin.finder.viewmodel.component.sr(hsVar4));
            duration.setListener(new com.tencent.mm.plugin.finder.viewmodel.component.tr(hsVar4, frameLayout3));
            duration.start();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("realPopupFlutterSurvey-1, feedId = ");
            sb7.append(hsVar4.T6(j17));
            sb7.append(", holder=");
            sb7.append(hsVar4.V6(s0Var));
            sb7.append(", itemView=");
            android.view.View itemView2 = s0Var.itemView;
            kotlin.jvm.internal.o.f(itemView2, "itemView");
            sb7.append(hsVar4.W6(itemView2));
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", sb7.toString());
        }
        return jz5.f0.f302826a;
    }
}
