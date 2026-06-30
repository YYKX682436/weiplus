package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class h80 extends com.tencent.mm.ui.component.UIComponent implements zy2.rb {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f134596e;

    /* renamed from: d, reason: collision with root package name */
    public ay2.i f134597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h80(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public void O6() {
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_FORBID_SQUARE_TEEN", false);
        getIntent().removeExtra("KEY_FORBID_SQUARE_TEEN");
        if (booleanExtra) {
            com.tencent.mars.xlog.Log.i("Finder.FinderTeensGuideUIC", "checkTeensGuideShowByConfig: forbid square teen, skip teens guide");
            return;
        }
        if (c01.e2.a0()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderTeensGuideUIC", "checkTeensGuideShowByConfig: wechat user don't show teen guide");
            return;
        }
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        boolean Xd = ((uh4.c0) i95.n0.c(uh4.c0.class)).Xd();
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USREINFO_FINDER_TEENS_GUIDE_DONT_REMIND_ME_BOOLEAN_SYNC, false);
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USREINFO_FINDER_TEENS_GUIDE_TIPS_LASTIME_LONG_SYNC;
        long t17 = c17.t(u3Var, 0L);
        long A = zl2.q4.f473933a.A();
        com.tencent.mars.xlog.Log.i("Finder.FinderTeensGuideUIC", "isTeenMode=" + isTeenMode + " lastime=" + t17 + " todayStartTime=" + A + " isHideTeenMode=" + Xd);
        if (isTeenMode || Xd || o17) {
            return;
        }
        if (A < t17) {
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            return;
        }
        r45.jz2 jz2Var = (r45.jz2) g92.b.f269769e.k2().d().getCustom(11);
        int integer = jz2Var != null ? jz2Var.getInteger(2) : 0;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        if (activity instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            int S6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) a17).S6();
            if (S6 == 1) {
                P6(integer, 2);
                return;
            } else if (S6 == 3 || S6 == 4) {
                P6(integer, 1);
                return;
            } else {
                P6(integer, 4);
                return;
            }
        }
        if (activity instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) {
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI");
            if (((com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI) activity3).getD() == 16) {
                P6(integer, 1);
                return;
            } else {
                P6(integer, 4);
                return;
            }
        }
        jz2.x0.f302754a.b(getActivity());
        androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
        kotlin.jvm.internal.o.g(activity4, "activity");
        ((wo2.q0) ((jz2.y0) i95.n0.c(jz2.y0.class))).getClass();
        if (!((activity4 instanceof com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageUI) || (activity4 instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI))) {
            androidx.appcompat.app.AppCompatActivity activity5 = getActivity();
            kotlin.jvm.internal.o.g(activity5, "activity");
            ((wo2.q0) ((jz2.y0) i95.n0.c(jz2.y0.class))).getClass();
            if (!(activity5 instanceof com.tencent.mm.plugin.finder.nearby.NearbyUI)) {
                androidx.appcompat.app.AppCompatActivity activity6 = getActivity();
                kotlin.jvm.internal.o.g(activity6, "activity");
                ((wo2.q0) ((jz2.y0) i95.n0.c(jz2.y0.class))).getClass();
                if (!((activity6 instanceof com.tencent.mm.plugin.finder.nearby.live.square.more.NearbyLiveMoreUI) || (activity6 instanceof com.tencent.mm.plugin.finder.feed.ui.FinderLiveOperationUI))) {
                    P6(integer, 4);
                    return;
                }
            }
        }
        P6(integer, 1);
    }

    public final void P6(int i17, int i18) {
        if (!((i17 & i18) > 0) || f134596e) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.ea eaVar = (com.tencent.mm.plugin.finder.viewmodel.component.ea) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.ea.class);
        if (eaVar != null) {
            eaVar.O6(new com.tencent.mm.plugin.finder.viewmodel.component.ba(10, "TeensGuide", new com.tencent.mm.plugin.finder.viewmodel.component.g80(this)));
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USREINFO_FINDER_TEENS_GUIDE_TIPS_LASTIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            Q6();
        }
    }

    public final void Q6() {
        if (this.f134597d == null) {
            java.lang.String string = getContext().getString(com.tencent.mm.R.string.f7w);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mars.xlog.Log.i("Finder.FinderTeensGuideUIC", "tips=".concat(string));
            ay2.i iVar = new ay2.i(getActivity());
            this.f134597d = iVar;
            iVar.f15248p = string;
        }
        ay2.i iVar2 = this.f134597d;
        if (iVar2 != null) {
            iVar2.f15251s = false;
            android.app.Activity activity = iVar2.f15239d;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
            iVar2.f15250r = android.os.SystemClock.uptimeMillis();
            iVar2.show();
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            o3Var.getClass();
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct finderShowInWXProfileStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct();
            finderShowInWXProfileStruct.s(V6.getString(0));
            finderShowInWXProfileStruct.f57827e = finderShowInWXProfileStruct.b("findercontextid", V6.getString(1), true);
            finderShowInWXProfileStruct.p(java.lang.String.valueOf(V6.getInteger(5)));
            finderShowInWXProfileStruct.f57833k = finderShowInWXProfileStruct.b("clicktabcontextid", V6.getString(2), true);
            finderShowInWXProfileStruct.f57829g = 0;
            finderShowInWXProfileStruct.q("teenagemode_set");
            finderShowInWXProfileStruct.r(java.lang.String.valueOf(c01.id.c()));
            finderShowInWXProfileStruct.k();
            o3Var.Zk(finderShowInWXProfileStruct);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        boolean z17 = false;
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_TEMPORARY_FORBID_TEENS_GUIDE", false);
        getIntent().removeExtra("KEY_TEMPORARY_FORBID_TEENS_GUIDE");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((wo2.q0) ((jz2.y0) i95.n0.c(jz2.y0.class))).getClass();
        if (!(activity instanceof com.tencent.mm.plugin.finder.nearby.NearbyUI)) {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((wo2.q0) ((jz2.y0) i95.n0.c(jz2.y0.class))).getClass();
            if (!((activity2 instanceof com.tencent.mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageUI) || (activity2 instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI)) && !(getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI)) {
                jz2.x0.f302754a.b(getActivity());
                if (!booleanExtra) {
                    z17 = true;
                }
            }
        }
        if (z17) {
            O6();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ay2.i iVar = this.f134597d;
        if (iVar != null) {
            iVar.b(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h80(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
