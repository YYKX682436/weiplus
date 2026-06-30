package y54;

/* loaded from: classes15.dex */
public final class f implements n54.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI f459538a;

    public f(com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI) {
        this.f459538a = adHalfScreenPageUI;
    }

    @Override // n54.t
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onWholeScreen", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$configHalfScreenContainer$1");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459538a;
        com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout Z6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.Z6(adHalfScreenPageUI);
        if (Z6 != null) {
            Z6.setScrollable(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setWholeScreen$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        adHalfScreenPageUI.H = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setWholeScreen$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.V6(adHalfScreenPageUI).o();
        n44.m0 V6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.V6(adHalfScreenPageUI);
        androidx.appcompat.app.AppCompatActivity context = adHalfScreenPageUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.graphics.drawable.Drawable d17 = V6.d(context, false);
        if (d17 != null) {
            adHalfScreenPageUI.updateBackBtn(d17);
        }
        i64.z a76 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.a7(adHalfScreenPageUI);
        a76.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCanShowCommonMoreBtn", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        boolean z17 = a76.f289382t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCanShowCommonMoreBtn", "com.tencent.mm.plugin.sns.ad.model.AdHalfScreenParameter");
        if (z17 && com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.a7(adHalfScreenPageUI).b() == 0) {
            adHalfScreenPageUI.addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new y54.e(adHalfScreenPageUI));
            adHalfScreenPageUI.enableOptionMenu(true);
            adHalfScreenPageUI.showOptionMenu(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onWholeScreen", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$configHalfScreenContainer$1");
    }

    @Override // n54.t
    public void b(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTranslationY", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$configHalfScreenContainer$1");
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459538a;
        try {
            if (f17 >= 0.0f) {
                int i17 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.S;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdHalfScreenDraggableHelper$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                n44.d dVar = adHalfScreenPageUI.B;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdHalfScreenDraggableHelper$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                if (dVar != null) {
                    dVar.c(f17);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isPlayingShowHalfScreenAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                boolean z17 = adHalfScreenPageUI.E;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isPlayingShowHalfScreenAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                if (!z17) {
                    float c17 = 1.0f - (f17 / com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.X6(adHalfScreenPageUI).c());
                    if (com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.a7(adHalfScreenPageUI).g() == n44.h1.f334945e) {
                        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.V6(adHalfScreenPageUI).c(c17, com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.c7(adHalfScreenPageUI));
                    } else if (com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.a7(adHalfScreenPageUI).g() == n44.h1.f334944d || com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.a7(adHalfScreenPageUI).g() == n44.h1.f334946f) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMaterialContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                        android.widget.FrameLayout frameLayout = adHalfScreenPageUI.f163161f;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMaterialContainer$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                        android.widget.FrameLayout frameLayout2 = frameLayout instanceof android.view.View ? frameLayout : null;
                        if (frameLayout2 == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTranslationY", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$configHalfScreenContainer$1");
                            return;
                        }
                        z54.c cVar = z54.d.f470278n;
                        android.view.ViewGroup.MarginLayoutParams b17 = cVar.b(c17, com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.c7(adHalfScreenPageUI), com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.X6(adHalfScreenPageUI).d(), com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.X6(adHalfScreenPageUI).g());
                        if (b17 == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTranslationY", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$configHalfScreenContainer$1");
                            return;
                        }
                        cVar.a(c17, frameLayout2, b17, com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.d7(adHalfScreenPageUI).b(), com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.d7(adHalfScreenPageUI).c(), com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.d7(adHalfScreenPageUI).d(), com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.d7(adHalfScreenPageUI).a(), com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.Y6(adHalfScreenPageUI).b(), com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.Y6(adHalfScreenPageUI).c(), com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.Y6(adHalfScreenPageUI).d(), com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.Y6(adHalfScreenPageUI).a());
                    }
                }
                com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.U6(adHalfScreenPageUI, 0.0f);
            } else {
                float f18 = (-f17) / com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.X6(adHalfScreenPageUI).f();
                if (f18 >= 1.0f) {
                    com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.U6(adHalfScreenPageUI, 1.0f);
                } else {
                    com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.U6(adHalfScreenPageUI, f18);
                }
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdHalfScreenPageUI", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTranslationY", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$configHalfScreenContainer$1");
    }

    @Override // n54.t
    public void c(n54.o type) {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$configHalfScreenContainer$1");
        kotlin.jvm.internal.o.g(type, "type");
        n54.o oVar = n54.o.f335147f;
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459538a;
        if (type == oVar) {
            com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout Z6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.Z6(adHalfScreenPageUI);
            if (Z6 != null) {
                Z6.setVisibility(0);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayingShowHalfScreenAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            adHalfScreenPageUI.E = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayingShowHalfScreenAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setAnimationType$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            adHalfScreenPageUI.D = oVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setAnimationType$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        } else {
            n54.o oVar2 = n54.o.f335145d;
            if (type == oVar2) {
                int i17 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.S;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayingHideHalfScreenAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                adHalfScreenPageUI.F = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayingHideHalfScreenAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setAnimationType$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                adHalfScreenPageUI.D = oVar2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setAnimationType$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            } else {
                n54.o oVar3 = n54.o.f335146e;
                if (type == oVar3 || type == n54.o.f335148g) {
                    int i18 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.S;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayingToTopHalfScreenAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                    adHalfScreenPageUI.G = true;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayingToTopHalfScreenAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setAnimationType$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                    adHalfScreenPageUI.D = oVar3;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setAnimationType$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
                }
            }
        }
        if (adHalfScreenPageUI.getF65848t() && (swipeBackLayout = adHalfScreenPageUI.getSwipeBackLayout()) != null) {
            swipeBackLayout.setEnableGesture(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$configHalfScreenContainer$1");
    }

    @Override // n54.t
    public void d(n54.o type) {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$configHalfScreenContainer$1");
        kotlin.jvm.internal.o.g(type, "type");
        n54.o oVar = n54.o.f335147f;
        com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI adHalfScreenPageUI = this.f459538a;
        if (type == oVar) {
            int i17 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.S;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayingShowHalfScreenAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            adHalfScreenPageUI.E = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayingShowHalfScreenAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            new com.tencent.mm.autogen.events.SnsAdHalfScreenNotifyFloatPreferenceEvent().e();
        } else if (type == n54.o.f335145d) {
            int i18 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.S;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayingHideHalfScreenAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            adHalfScreenPageUI.F = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayingHideHalfScreenAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setAlreadyExpend$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            adHalfScreenPageUI.C = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setAlreadyExpend$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDragToFullScreenCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            int i19 = adHalfScreenPageUI.f163158J;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDragToFullScreenCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setDragToFullScreenCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            adHalfScreenPageUI.f163158J = i19 + 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setDragToFullScreenCount$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            n44.m0 V6 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.V6(adHalfScreenPageUI);
            androidx.appcompat.app.AppCompatActivity context = adHalfScreenPageUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.graphics.drawable.Drawable d17 = V6.d(context, false);
            if (d17 != null) {
                adHalfScreenPageUI.updateBackBtn(d17);
            }
        } else if (type == n54.o.f335146e || type == n54.o.f335148g) {
            int i27 = com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI.S;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayingToTopHalfScreenAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
            adHalfScreenPageUI.G = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayingToTopHalfScreenAnimation$p", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI");
        }
        if (adHalfScreenPageUI.getF65848t() && (swipeBackLayout = adHalfScreenPageUI.getSwipeBackLayout()) != null) {
            swipeBackLayout.setEnableGesture(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.landingpage.ui.activity.AdHalfScreenPageUI$configHalfScreenContainer$1");
    }
}
