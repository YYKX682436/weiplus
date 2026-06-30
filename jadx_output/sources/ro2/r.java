package ro2;

/* loaded from: classes2.dex */
public abstract class r {
    /* JADX WARN: Code restructure failed: missing block: B:103:0x020a, code lost:
    
        if ((r3 != null && r3.f410355f == r8) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f9, code lost:
    
        if (r2 < r8) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x020c, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(com.tencent.mm.plugin.finder.convert.qe r20, com.tencent.mm.plugin.finder.model.BaseFinderFeed r21, int r22, java.lang.String r23, r45.zu0 r24) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ro2.r.a(com.tencent.mm.plugin.finder.convert.qe, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, java.lang.String, r45.zu0):boolean");
    }

    public static final java.util.Map b(com.tencent.mm.plugin.finder.convert.qe qeVar, android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(qeVar, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        java.lang.String ek6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(item.getFeedObject().getId(), item.w(), V6 != null ? V6.getInteger(5) : 0);
        so2.g mileStoneShowInfo = item.getMileStoneShowInfo();
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("session_buffer", ek6);
        lVarArr[1] = new jz5.l("feed_id", pm0.v.u(item.getFeedObject().getId()));
        lVarArr[2] = new jz5.l("author_finder_username", item.getFeedObject().getUserName());
        lVarArr[3] = new jz5.l("poster_type", mileStoneShowInfo != null ? java.lang.Integer.valueOf(mileStoneShowInfo.f410351b) : null);
        lVarArr[4] = new jz5.l("poster_num", mileStoneShowInfo != null ? java.lang.Integer.valueOf(mileStoneShowInfo.f410352c) : null);
        return kz5.c1.k(lVarArr);
    }

    public static final void c(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 holder) {
        so2.g mileStoneShowInfo;
        kotlin.jvm.internal.o.g(qeVar, "<this>");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.g4y);
        com.tencent.mm.plugin.finder.view.FinderMileStoneView finderMileStoneView = (com.tencent.mm.plugin.finder.view.FinderMileStoneView) holder.p(com.tencent.mm.R.id.trt);
        if (finderMileStoneView != null && finderMileStoneView.getVisibility() == 0) {
            if (finderMileStoneView != null) {
                android.animation.AnimatorSet animatorSet = finderMileStoneView.f131316w;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                finderMileStoneView.f131316w = null;
            }
            if (finderMileStoneView != null) {
                finderMileStoneView.setVisibility(8);
            }
            if (finderMileStoneView != null) {
                finderMileStoneView.c();
            }
            qeVar.K1(findViewById, 8);
            android.view.View view = holder.itemView;
            com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout = view instanceof com.tencent.mm.plugin.finder.view.SimpleTouchableLayout ? (com.tencent.mm.plugin.finder.view.SimpleTouchableLayout) view : null;
            if (simpleTouchableLayout != null) {
                simpleTouchableLayout.a(false, "Finder.FeedFullConvert");
            }
        }
        so2.g mileStoneShowInfo2 = baseFinderFeed.getMileStoneShowInfo();
        if ((mileStoneShowInfo2 != null ? mileStoneShowInfo2.f410350a : null) == so2.h.f410371e && (mileStoneShowInfo = baseFinderFeed.getMileStoneShowInfo()) != null) {
            mileStoneShowInfo.f410350a = so2.h.f410372f;
        }
        g(holder);
    }

    public static final void d(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 holder, android.view.View btnIv, android.view.View view, int i17, int i18, boolean z17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.o.g(qeVar, "<this>");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(btnIv, "btnIv");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i;
        android.view.View view2 = holder.itemView;
        kotlin.jvm.internal.o.e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
        android.content.Context context = viewGroup.getContext();
        baseFinderFeed.w1(new so2.g(so2.h.f410371e, i17, i18, java.lang.System.currentTimeMillis(), false, i18, 16, null));
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String username = baseFinderFeed.getFeedObject().getUserName();
        kotlin.jvm.internal.o.g(username, "username");
        dq.b bVar = ((cq.k) c17).f221226g;
        bVar.getClass();
        com.tencent.mm.sdk.platformtools.o4 o4Var = bVar.f242286c;
        if (o4Var != null) {
            java.lang.String concat = "KEY_FINDER_INTERACTION_MILE_STONE_POINT_PREFIX_".concat(username);
            if (o4Var.T(concat, java.lang.Integer.valueOf(i18))) {
                if (o4Var.U()) {
                    java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = o4Var.f192901g;
                    readLock.lock();
                    o4Var.c(o4Var.f192899e);
                    o4Var.f192898d.putInt(concat, i18, 1296000);
                    readLock.unlock();
                } else {
                    o4Var.f192898d.putInt(concat, i18, 1296000);
                }
            }
        }
        boolean z18 = i17 == 1;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setId(com.tencent.mm.R.id.trk);
        if (viewGroup instanceof android.widget.RelativeLayout) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(13);
            layoutParams = layoutParams2;
        } else {
            android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            layoutParams = layoutParams3;
        }
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setVisibility(8);
        kotlin.jvm.internal.o.d(context);
        com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(context);
        mMPAGView.setId(com.tencent.mm.R.id.trj);
        int dimension = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479675cc);
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams4.gravity = 17;
        mMPAGView.setLayoutParams(layoutParams4);
        mMPAGView.setRepeatCount(1);
        mMPAGView.setProgress(0.0d);
        java.lang.String str = z18 ? "finder_mile_stone_like_animate.pag" : "finder_mile_stone_fav_animate.pag";
        if (mMPAGView.getUseRfx()) {
            mMPAGView.setComposition(com.tencent.mm.rfx.RfxPagFile.Load(context.getAssets(), str));
        } else {
            mMPAGView.setComposition(org.libpag.PAGFile.Load(context.getAssets(), str));
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 81;
        linearLayout.setLayoutParams(layoutParams5);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        int dimension2 = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479714d7);
        linearLayout.setPadding(dimension2, 0, dimension2, 0);
        int color = context.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3);
        float h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479674cb);
        int color2 = context.getResources().getColor(com.tencent.mm.R.color.f478553an);
        int i19 = z18 ? com.tencent.mm.R.raw.heart_medium : com.tencent.mm.R.raw.thumb_medium;
        int h18 = i65.a.h(context, com.tencent.mm.R.dimen.f479693cs);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.ohi);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        textView.setTextSize(0, h17);
        textView.setTextColor(color2);
        textView.setShadowLayer(20.0f, 0.0f, 8.0f, color);
        textView.setLineSpacing(i65.a.h(context, com.tencent.mm.R.dimen.f479648bn), 1.0f);
        android.content.Context context2 = textView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        textView.setText(hc2.x0.k(string, context2, '#', i19, com.tencent.mm.R.color.f478553an, h18, h18, 0, 0, 2, 192, null));
        android.widget.TextView textView2 = new android.widget.TextView(context);
        textView2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
        ya2.b2 contact = baseFinderFeed.getContact();
        textView2.setText(contact != null ? contact.w0() : "");
        textView2.setTextSize(0, h17);
        textView2.setTextColor(color2);
        textView2.setShadowLayer(20.0f, 0.0f, 8.0f, color);
        textView2.setLineSpacing(i65.a.h(context, com.tencent.mm.R.dimen.f479648bn), 1.0f);
        textView2.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        android.widget.TextView textView3 = new android.widget.TextView(context);
        android.widget.LinearLayout.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479644bj);
        textView3.setLayoutParams(layoutParams6);
        textView3.setText(context.getString(com.tencent.mm.R.string.olx, java.lang.Integer.valueOf(i18)));
        textView3.setTextSize(0, h17);
        textView3.setTextColor(color2);
        textView3.setShadowLayer(20.0f, 0.0f, 8.0f, color);
        textView3.setLineSpacing(i65.a.h(context, com.tencent.mm.R.dimen.f479648bn), 1.0f);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        frameLayout.addView(mMPAGView);
        frameLayout.addView(linearLayout);
        viewGroup.addView(frameLayout);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.g4y);
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(findViewById, "alpha", 1.0f).setDuration(200L);
        kotlin.jvm.internal.o.f(duration, "setDuration(...)");
        android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(frameLayout, "alpha", 1.0f).setDuration(200L);
        kotlin.jvm.internal.o.f(duration2, "setDuration(...)");
        animatorSet.addListener(new ro2.a(qeVar, findViewById, holder, frameLayout, qeVar, findViewById, mMPAGView, z18, btnIv, view));
        mMPAGView.a(new ro2.b(qeVar, findViewById, holder, i17, i18, z17));
        animatorSet.playTogether(duration, duration2);
        frameLayout.post(new ro2.d(qeVar, animatorSet));
        com.tencent.mm.plugin.finder.view.FinderMileStoneView finderMileStoneView = (com.tencent.mm.plugin.finder.view.FinderMileStoneView) holder.p(com.tencent.mm.R.id.trt);
        if (finderMileStoneView == null) {
            android.view.ViewStub viewStub = (android.view.ViewStub) holder.p(com.tencent.mm.R.id.tfo);
            android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
            finderMileStoneView = inflate instanceof com.tencent.mm.plugin.finder.view.FinderMileStoneView ? (com.tencent.mm.plugin.finder.view.FinderMileStoneView) inflate : null;
        }
        if (finderMileStoneView != null) {
            finderMileStoneView.setVisibility(8);
        }
        if (finderMileStoneView != null) {
            android.widget.ImageView mileStoneLeftAvatar = finderMileStoneView.getMileStoneLeftAvatar();
            android.widget.ImageView mileStoneRightAvatar = finderMileStoneView.getMileStoneRightAvatar();
            ng5.a.a(mileStoneLeftAvatar, c01.z1.r());
            java.lang.String n17 = baseFinderFeed.n();
            if (n17 == null) {
                n17 = "";
            }
            boolean f17 = ya2.d.f(baseFinderFeed.getContact());
            mn2.g1 g1Var = mn2.g1.f329975a;
            if (f17) {
                g1Var.a().c(new mn2.n("", null, 2, null), mileStoneRightAvatar, g1Var.h(mn2.f1.f329957h));
            } else {
                g1Var.a().c(new mn2.n(n17, null, 2, null), mileStoneRightAvatar, g1Var.h(mn2.f1.f329957h));
            }
        }
    }

    public static final void e(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(qeVar, "<this>");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127597a6).getValue()).r()).booleanValue()) {
            so2.g mileStoneShowInfo = item.getMileStoneShowInfo();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (mileStoneShowInfo == null || mileStoneShowInfo.f410350a != so2.h.f410371e || currentTimeMillis - mileStoneShowInfo.f410353d >= 60000 || mileStoneShowInfo.f410354e) {
                c(qeVar, holder);
            } else {
                mileStoneShowInfo.f410354e = true;
                i(qeVar, holder, mileStoneShowInfo.f410351b, mileStoneShowInfo.f410352c, false, true);
            }
        }
    }

    public static final void f(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 holder) {
        kotlin.jvm.internal.o.g(qeVar, "<this>");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.view.FinderMileStoneView finderMileStoneView = (com.tencent.mm.plugin.finder.view.FinderMileStoneView) holder.p(com.tencent.mm.R.id.trt);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) holder.f293125i;
        android.content.Context context = holder.f293121e;
        if (finderMileStoneView != null) {
            ro2.e eVar = new ro2.e(finderMileStoneView, qeVar, context, baseFinderFeed);
            finderMileStoneView.mileStoneScreenShotCallback = eVar;
            i95.m c17 = i95.n0.c(ct.d3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context2 = finderMileStoneView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) c17)).wi(context2, eVar);
            ro2.f fVar = new ro2.f(context, finderMileStoneView, qeVar, holder, baseFinderFeed);
            finderMileStoneView.mileStoneOnBackPressedCallback = fVar;
            android.content.Context context3 = finderMileStoneView.getContext();
            com.tencent.mm.ui.MMActivity mMActivity = context3 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context3 : null;
            if (mMActivity != null) {
                mMActivity.addOnBackPressListener(fVar);
            }
            ro2.g gVar = new ro2.g(qeVar, context, baseFinderFeed);
            finderMileStoneView.mileStoneAppForegroundListener = gVar;
            com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE.addLifecycleCallback(gVar);
        }
    }

    public static final void g(in5.s0 s0Var) {
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.trk);
        if (p17 != null) {
            com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) s0Var.p(com.tencent.mm.R.id.trj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/milestone/FinderFeedFullConvert_FinderMileStoneKt", "removeMileStonePag", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/milestone/FinderFeedFullConvert_FinderMileStoneKt", "removeMileStonePag", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (mMPAGView != null) {
                mMPAGView.n();
            }
            p17.post(new ro2.h(p17));
        }
    }

    public static final void h(com.tencent.mm.plugin.finder.convert.qe qeVar, ro2.t type, android.content.Context context, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        kotlin.jvm.internal.o.g(qeVar, "<this>");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(item, "item");
        java.util.Map t17 = kz5.c1.t(b(qeVar, context, item));
        t17.put("poster_unexp_type", java.lang.Integer.valueOf(type.f398101d));
        com.tencent.mm.plugin.finder.report.d2.f124994a.h(context, "finder_poster", "view_unexp", false, t17);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(com.tencent.mm.plugin.finder.convert.qe r39, in5.s0 r40, int r41, int r42, boolean r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ro2.r.i(com.tencent.mm.plugin.finder.convert.qe, in5.s0, int, int, boolean, boolean):void");
    }
}
