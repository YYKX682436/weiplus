package sp2;

/* loaded from: classes2.dex */
public final class b0 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.modelbase.u0 {

    /* renamed from: n, reason: collision with root package name */
    public static r45.h81 f410977n;

    /* renamed from: d, reason: collision with root package name */
    public qp2.z f410978d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f410979e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f410980f;

    /* renamed from: g, reason: collision with root package name */
    public int f410981g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.lifecycle.k0 f410982h;

    /* renamed from: i, reason: collision with root package name */
    public long f410983i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f410984m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f410979e = kotlinx.coroutines.z0.b();
        this.f410984m = "";
    }

    public final void O6(ll2.a aVar) {
        com.tencent.mars.xlog.Log.i("LiveEntranceFragmentUICMoreIcon", "[checkLivePersonCenterRedDotReport] lastExposePersonalCenterTipsId=" + this.f410984m);
        ll2.e eVar = ll2.e.f319133a;
        ll2.b[] bVarArr = ll2.b.f319128d;
        this.f410984m = eVar.n(java.lang.String.valueOf(13), "LivePersonalCenter", aVar.f319127d, this.f410984m);
    }

    public final void P6(r45.dk2 dk2Var, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkShowMode flags: ");
        sb6.append(dk2Var != null ? java.lang.Integer.valueOf(dk2Var.getInteger(11)) : null);
        com.tencent.mars.xlog.Log.i("LiveEntranceFragmentUICMoreIcon", sb6.toString());
        if (pm0.v.z(dk2Var != null ? dk2Var.getInteger(11) : 0, 1)) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.b1h);
            findViewById.setContentDescription(getContext().getString(com.tencent.mm.R.string.f489816ck));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "showSearchEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "showSearchEntrance", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.b1i);
            if (weImageView != null) {
                if (weImageView.getVisibility() == 8) {
                    S6("main_page_search", true);
                }
                weImageView.setVisibility(0);
                weImageView.setOnClickListener(new sp2.a0(this));
                weImageView.setContentDescription(weImageView.getContext().getString(com.tencent.mm.R.string.jzr));
                su4.f1 f1Var = (su4.f1) i95.n0.c(su4.f1.class);
                if (f1Var != null) {
                    android.content.Context context = weImageView.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    ((sg0.h3) f1Var).Ai(125, context);
                }
            }
        } else {
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.b1i);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "checkShowMode", "(Lcom/tencent/mm/protocal/protobuf/FinderNavLiveStreamResponse;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "checkShowMode", "(Lcom/tencent/mm/protocal/protobuf/FinderNavLiveStreamResponse;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (z17) {
                android.app.Activity context2 = getContext();
                kotlin.jvm.internal.o.g(context2, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((sp2.b0) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(sp2.b0.class)).T6(f410977n);
            } else {
                android.app.Activity context3 = getContext();
                kotlin.jvm.internal.o.g(context3, "context");
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                sp2.b0 b0Var = (sp2.b0) zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).a(sp2.b0.class);
                androidx.appcompat.app.AppCompatActivity activity = b0Var.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar2.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                rq2.s sVar = rq2.s.f398879a;
                com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", "tickTabCgiStart");
                rq2.s.f398887i = c01.id.c();
                b0Var.f410978d = new qp2.z(V6, 9, null, null, null, null, 60, null);
                gm0.j1.d().a(4210, b0Var);
                gm0.j1.d().g(b0Var.f410978d);
            }
        }
        if (pm0.v.z(dk2Var != null ? dk2Var.getInteger(11) : 0, 2)) {
            com.tencent.mars.xlog.Log.i("LiveEntranceFragmentUICMoreIcon", "checkPreloadPersonalCenterPage");
            this.f410981g = hashCode();
            kotlinx.coroutines.l.d(v65.m.b(getActivity()), null, null, new sp2.t(this, null), 3, null);
        }
    }

    public final void Q6(int i17, android.content.Context ctx, r45.dd2 dd2Var) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        pf5.z zVar = pf5.z.f353948a;
        if (!(ctx instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String string = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) ctx).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6().getString(1);
        if (string == null) {
            string = "";
        }
        ip2.a.f293619h = 2;
        uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_request_scene", 9);
        if (dd2Var != null) {
            intent.putExtra("nearby_live_target_square_page_params_key", dd2Var.toByteArray());
            nq2.d dVar = nq2.d.f338980a;
            android.content.Intent intent2 = getIntent();
            if (intent2 == null) {
                intent2 = new android.content.Intent();
            }
            int integer = dd2Var.getInteger(0);
            java.lang.String string2 = dd2Var.getString(1);
            if (string2 == null) {
                string2 = "";
            }
            dVar.l(intent2, integer, i17, string2);
        }
        intent.putExtra("key_context_id", string);
        intent.putExtra("enter_from_type", 1);
        ((v40.s) nVar).Ai(ctx, intent);
        android.app.Activity activity = ctx instanceof android.app.Activity ? (android.app.Activity) ctx : null;
        if (activity != null) {
            pf5.z zVar2 = pf5.z.f353948a;
            boolean z17 = activity instanceof androidx.appcompat.app.AppCompatActivity;
            if (!z17) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) activity;
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar2.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            if (!z17) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar2.a(appCompatActivity).a(rq2.w.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((rq2.w) a17).Q6(V6.getString(1), "main_page_recmd_more", "");
        }
        S6("main_page_more_button", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R6(r45.dd2 r22) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.b0.R6(r45.dd2):void");
    }

    public final void S6(java.lang.String eid, boolean z17) {
        kotlin.jvm.internal.o.g(eid, "eid");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        if (activity != null) {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(rq2.w.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            rq2.w wVar = (rq2.w) a17;
            com.tencent.mars.xlog.Log.i("LiveEntranceFragmentUICMoreIcon", "optionIconReport: " + z17);
            if (z17) {
                wVar.P6("", V6.getString(1), eid, "");
            } else {
                wVar.Q6(V6.getString(1), eid, "");
            }
        }
    }

    public final void T6(r45.h81 h81Var) {
        java.util.LinkedList list = h81Var != null ? h81Var.getList(9) : null;
        int integer = list == null || list.isEmpty() ? 18 : h81Var != null ? h81Var.getInteger(4) : 0;
        if (h81Var != null) {
            h81Var.getList(9);
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.b1h);
        findViewById.setContentDescription(getContext().getString(com.tencent.mm.R.string.f489816ck));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "renderTagView", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "renderTagView", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new sp2.z(this, integer));
        S6("main_page_more_button", true);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "renderTagView$startShow$renderDefault", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon", "renderTagView$startShow$renderDefault", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/LiveEntranceFragmentUICMoreIcon;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        gm0.j1.d().q(4210, this);
        qp2.z zVar = this.f410978d;
        if (zVar != null) {
            if (!(!zVar.isCanceled())) {
                zVar = null;
            }
            if (zVar != null) {
                gm0.j1.d().d(zVar);
            }
        }
        kotlinx.coroutines.z0.e(this.f410979e, null, 1, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        su4.f1 f1Var;
        findViewById(com.tencent.mm.R.id.b1h);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.b1i);
        if (weImageView == null || weImageView.getVisibility() != 0 || (f1Var = (su4.f1) i95.n0.c(su4.f1.class)) == null) {
            return;
        }
        ((sg0.h3) f1Var).Ai(125, getContext());
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        gm0.j1.d().q(4210, this);
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.modelbase.o oVar = ((qp2.z) scene).f365828h;
            kotlin.jvm.internal.o.d(oVar);
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveTabsResponse");
            f410977n = (r45.h81) fVar;
            pm0.v.X(new sp2.w(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        sp2.y yVar = new sp2.y(this);
        pm0.v.y(com.tencent.mm.plugin.finder.extension.reddot.aa.O, getActivity(), yVar);
        this.f410982h = yVar;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        super.onUserVisibleFocused();
        androidx.lifecycle.k0 k0Var = this.f410982h;
        if (k0Var != null) {
            com.tencent.mm.plugin.finder.extension.reddot.aa.O.removeObserver(k0Var);
            this.f410982h = null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) contentView.findViewById(com.tencent.mm.R.id.ico);
        this.f410980f = weImageView;
        if (weImageView != null) {
            weImageView.setContentDescription(contentView.getContext().getString(com.tencent.mm.R.string.f9w));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f410980f;
        if (weImageView2 != null) {
            weImageView2.setOnClickListener(new sp2.x(this));
        }
        android.view.View findViewById = contentView.findViewById(com.tencent.mm.R.id.fnn);
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(getContext(), new sp2.v(this));
        gestureDetector.setIsLongpressEnabled(false);
        findViewById.setOnTouchListener(new sp2.u(gestureDetector));
    }
}
