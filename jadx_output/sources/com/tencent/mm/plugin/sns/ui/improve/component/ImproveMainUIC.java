package com.tencent.mm.plugin.sns.ui.improve.component;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC;", "Lcom/tencent/mm/plugin/sns/ui/improve/component/j;", "Lcom/tencent/mm/plugin/sns/ui/improve/component/g2;", "Lcom/tencent/mm/modelbase/u0;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "com/tencent/mm/plugin/sns/ui/improve/component/q0", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveMainUIC extends com.tencent.mm.plugin.sns.ui.improve.component.j implements com.tencent.mm.plugin.sns.ui.improve.component.g2, com.tencent.mm.modelbase.u0 {

    /* renamed from: t, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.improve.component.q0 f168694t = new com.tencent.mm.plugin.sns.ui.improve.component.q0(null);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f168695d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f168696e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f168697f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f168698g;

    /* renamed from: h, reason: collision with root package name */
    public int f168699h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f168700i;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.r2 f168701m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.improve.component.p0 f168702n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f168703o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f168704p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC f168705q;

    /* renamed from: r, reason: collision with root package name */
    public int f168706r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f168707s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImproveMainUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f168695d = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.a1(activity));
        this.f168696e = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.u0(activity));
        this.f168697f = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.r0(this));
        this.f168698g = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.t0(activity));
        this.f168699h = -1;
        this.f168702n = com.tencent.mm.plugin.sns.ui.improve.component.p0.f168968d;
        this.f168703o = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.v0(this));
        this.f168704p = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.b1(this));
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f168705q = (com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC) a17;
        this.f168706r = -1;
    }

    public static final com.tencent.mm.plugin.sns.ui.improve.component.m O6(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAvoidLeakUIC", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        improveMainUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvoidLeakUIC", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.m mVar = (com.tencent.mm.plugin.sns.ui.improve.component.m) improveMainUIC.f168696e.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvoidLeakUIC", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAvoidLeakUIC", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        return mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P6(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.P6(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q6(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.Q6(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void R6(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC, androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        improveMainUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.MainUIC", "onScrollStateChanged newState:" + i17);
        if (improveMainUIC.b7()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        } else {
            androidx.appcompat.app.AppCompatActivity activity = improveMainUIC.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUIComponents", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
            java.util.HashSet<com.tencent.mm.ui.component.UIComponent> uiComponents = ((com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI) activity).getUiComponents();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUIComponents", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI");
            com.tencent.mm.plugin.sns.ui.improve.component.x1 visibleItemView = improveMainUIC.getVisibleItemView();
            for (com.tencent.mm.ui.component.UIComponent uIComponent : uiComponents) {
                if (uIComponent instanceof com.tencent.mm.plugin.sns.ui.improve.component.j) {
                    ((com.tencent.mm.plugin.sns.ui.improve.component.j) uIComponent).onScrollStateChangedInMain(recyclerView, visibleItemView, i17);
                }
            }
            pf5.e.launch$default(improveMainUIC, improveMainUIC.getDispatcher(), null, new com.tencent.mm.plugin.sns.ui.improve.component.m1(uiComponents, recyclerView, visibleItemView, i17, null), 2, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.g2
    public void B2(xm3.o0 pendingData) {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterUpdate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        kotlin.jvm.internal.o.g(pendingData, "pendingData");
        java.util.Iterator it = pendingData.f455366c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            xm3.b bVar = (xm3.b) obj;
            if (bVar.f455287a == xm3.c.f455296d && bVar.f455288b == 0 && bVar.f455289c > 0) {
                break;
            }
        }
        xm3.b bVar2 = (xm3.b) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("afterUpdate mode:");
        sb6.append(this.f168702n);
        sb6.append(" job:");
        kotlinx.coroutines.r2 r2Var = this.f168701m;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.a()) : null);
        sb6.append(" insertTopList:");
        sb6.append(bVar2 != null ? java.lang.Integer.valueOf(bVar2.f455289c) : null);
        sb6.append(" falut:");
        sb6.append(X6().R6());
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.MainUIC", sb6.toString());
        if (this.f168702n == com.tencent.mm.plugin.sns.ui.improve.component.p0.f168969e && bVar2 != null) {
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView recycleView = getRecycleView();
            int i17 = bVar2.f455289c + 1;
            int i18 = this.f168706r;
            recycleView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("forceScrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
            recycleView.f1();
            recycleView.r0(0, 0);
            recycleView.g1(i17, i18, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("forceScrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
            if (!X6().R6()) {
                getRecycleView().post(new com.tencent.mm.plugin.sns.ui.improve.component.s0(this));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterUpdate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }

    public final void S6(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeFooterContent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        switch (i17) {
            case 2147483645:
                if (Y6().getParent() == null) {
                    U6().O(Y6(), 2147483645, false);
                }
                Y6().setVisibility(0);
                W6().setVisibility(4);
                break;
            case 2147483646:
                if (W6().getVisibility() != 0) {
                    W6().setVisibility(0);
                    Y6().setVisibility(8);
                    break;
                }
                break;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeFooterContent", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r3 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T6() {
        /*
            r9 = this;
            java.lang.String r0 = "checkLoadFront"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            kotlinx.coroutines.r2 r2 = r9.f168701m
            if (r2 == 0) goto L18
            r3 = 0
            if (r2 == 0) goto L16
            boolean r2 = r2.A()
            r4 = 1
            if (r2 != r4) goto L16
            r3 = r4
        L16:
            if (r3 == 0) goto L2c
        L18:
            kotlinx.coroutines.p0 r2 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r4 = kotlinx.coroutines.internal.b0.f310484a
            r5 = 0
            com.tencent.mm.plugin.sns.ui.improve.component.z0 r6 = new com.tencent.mm.plugin.sns.ui.improve.component.z0
            r2 = 0
            r6.<init>(r9, r2)
            r7 = 2
            r8 = 0
            r3 = r9
            kotlinx.coroutines.r2 r2 = pf5.e.launch$default(r3, r4, r5, r6, r7, r8)
            r9.f168701m = r2
        L2c:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.T6():void");
    }

    public final com.tencent.mm.plugin.sns.ui.improve.component.h2 U6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.h2 h2Var = (com.tencent.mm.plugin.sns.ui.improve.component.h2) ((jz5.n) this.f168697f).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        return h2Var;
    }

    public final ad4.d V6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAutoPlayManager", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        ad4.d dVar = (ad4.d) ((jz5.n) this.f168698g).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAutoPlayManager", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        return dVar;
    }

    public final com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView W6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomLoadingView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView improveLoadingMoreView = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView) ((jz5.n) this.f168703o).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomLoadingView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        return improveLoadingMoreView;
    }

    public final com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC X6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDataUIC", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC improveDataUIC = (com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC) this.f168695d.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDataUIC", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        return improveDataUIC;
    }

    public final com.tencent.mm.plugin.sns.ui.improve.view.ImproveEmptyView Y6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEmptyView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveEmptyView improveEmptyView = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveEmptyView) ((jz5.n) this.f168704p).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmptyView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        return improveEmptyView;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z6(androidx.recyclerview.widget.RecyclerView r19, com.tencent.mm.plugin.sns.ui.improve.component.x1 r20, int r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.Z6(androidx.recyclerview.widget.RecyclerView, com.tencent.mm.plugin.sns.ui.improve.component.x1, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.g2
    public void a3(xm3.o0 pendingData) {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beforeUpdate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        kotlin.jvm.internal.o.g(pendingData, "pendingData");
        androidx.recyclerview.widget.k3 p07 = getRecycleView().p0(1);
        this.f168706r = (p07 == null || (view = p07.itemView) == null) ? 0 : view.getTop();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beforeUpdate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }

    public final boolean a7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isUnreadMode", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        boolean z17 = this.f168702n == com.tencent.mm.plugin.sns.ui.improve.component.p0.f168969e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUnreadMode", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        return z17;
    }

    public final boolean b7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pageInvalid", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        boolean z17 = getActivity().isDestroyed() || getActivity().isFinishing();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pageInvalid", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        return z17;
    }

    public final void c7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showEndLineView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.ui.improve.component.s1(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showEndLineView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }

    public final void d7(com.tencent.mm.plugin.sns.ui.improve.component.p0 mode, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchReadMode", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        kotlin.jvm.internal.o.g(mode, "mode");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Improve.MainUIC", "switchReadMode cur:" + this.f168702n + " target:" + mode, new java.lang.Object[0]);
        this.f168702n = mode;
        boolean z18 = mode == com.tencent.mm.plugin.sns.ui.improve.component.p0.f168969e;
        if (!z18) {
            com.tencent.mm.plugin.sns.ui.improve.component.h2 U6 = U6();
            U6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnUpdateCallback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsRecyclerAdapter");
            U6.K = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnUpdateCallback", "com.tencent.mm.plugin.sns.ui.improve.component.SnsRecyclerAdapter");
        }
        getRecycleView().setNestedScrollingEnabled(!z18);
        com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC improveHeaderUIC = this.f168705q;
        if (z18) {
            improveHeaderUIC.showUnreadHeader();
        } else {
            improveHeaderUIC.showNormalHeader();
        }
        if (z18 && z17) {
            getRecycleView().b1(0, 100, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchReadMode", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.MainUIC", "onCreate " + hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setupRecyclerView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        getRecycleView().setAdapter(U6());
        getRecycleView().setLayoutManager(new com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager(getContext()));
        getRecycleView().setItemAnimator(null);
        this.f168705q.addHeader(U6());
        getRecycleView().i(new com.tencent.mm.plugin.sns.ui.improve.component.r1(this));
        U6().O(W6(), 2147483646, true);
        if (resumePage()) {
            com.tencent.mm.plugin.sns.ui.f8 qj6 = com.tencent.mm.plugin.sns.model.l4.qj();
            qj6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMode", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            com.tencent.mm.plugin.sns.ui.improve.component.p0 p0Var = qj6.f168317g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMode", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            if (p0Var == null) {
                p0Var = com.tencent.mm.plugin.sns.ui.improve.component.p0.f168968d;
            }
            this.f168702n = p0Var;
            if (!X6().R6()) {
                this.f168702n = com.tencent.mm.plugin.sns.ui.improve.component.p0.f168968d;
            }
        }
        d7(this.f168702n, false);
        ((u30.e) ((v30.e) i95.n0.c(v30.e.class))).wi(getRecycleView(), getActivity().getClass().getName());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setupRecyclerView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleToolBarDoubleClick", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).setTitleBarDoubleClickListener(new com.tencent.mm.plugin.sns.ui.improve.component.k1(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleToolBarDoubleClick", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restorePositionInfo", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        i64.u1.b(26, 1, resumePage() ? 1 : 2);
        if (resumePage()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restoreRecyclerViewPosition", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            com.tencent.mm.plugin.sns.ui.f8 qj7 = com.tencent.mm.plugin.sns.model.l4.qj();
            qj7.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            int i17 = qj7.f168313c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            com.tencent.mm.plugin.sns.ui.f8 qj8 = com.tencent.mm.plugin.sns.model.l4.qj();
            qj8.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopY", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            int i18 = qj8.f168314d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopY", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager layoutManager = getLayoutManager();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC", "restoreRecyclerViewPosition", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            layoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(layoutManager, "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC", "restoreRecyclerViewPosition", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            getRecycleView().getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.sns.ui.improve.component.q1(this, i17, i18, new kotlin.jvm.internal.f0()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreRecyclerViewPosition", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restorePositionInfo", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        gm0.j1.n().f273288b.a(218, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        android.view.View view;
        android.view.View view2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.MainUIC", "onDestroy " + hashCode());
        ad4.d V6 = V6();
        V6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.AutoPlayUtil", "onUIDestroy");
        com.tencent.mm.plugin.sns.ui.zm b17 = V6.b();
        b17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unregisterBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(b17.f171702c);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unregisterBroadcastReceiver", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        b17.f171700a = null;
        b17.f171701b = 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("savePositionInfo", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        int w17 = getLayoutManager().w();
        androidx.recyclerview.widget.k3 p07 = getRecycleView().p0(w17);
        int top = (p07 == null || (view2 = p07.itemView) == null) ? 0 : view2.getTop();
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.MainUIC", "save recyclerView position:" + w17 + " offset:" + top + " height:" + ((p07 == null || (view = p07.itemView) == null) ? null : java.lang.Integer.valueOf(view.getHeight())));
        com.tencent.mm.plugin.sns.ui.f8 qj6 = com.tencent.mm.plugin.sns.model.l4.qj();
        com.tencent.mm.plugin.sns.ui.improve.component.p0 p0Var = this.f168702n;
        qj6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMode", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        qj6.f168317g = p0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMode", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        com.tencent.mm.plugin.sns.ui.f8 qj7 = com.tencent.mm.plugin.sns.model.l4.qj();
        qj7.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePositionEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        qj7.f168311a = android.os.SystemClock.elapsedRealtime();
        qj7.f168313c = w17;
        qj7.f168314d = top;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePositionEvent", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("savePositionInfo", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        gm0.j1.n().f273288b.q(218, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reset >> ");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = mc4.c.f325646b;
        sb6.append(snsInfo != null ? snsInfo.getLocalid() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveSnsSecurityPassFooterHelper", sb6.toString());
        mc4.c.f325646b = null;
        mc4.c.f325647c = null;
        mc4.c.f325648d = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        com.tencent.mm.plugin.sns.ui.widget.j3 j3Var = com.tencent.mm.plugin.sns.ui.widget.j3.f171174a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCommentTimelineSession", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("reportCommentTimelineSession >> ");
        sb7.append(com.tencent.mm.plugin.sns.ui.widget.j3.f171177d);
        sb7.append(", ");
        java.util.HashMap hashMap = com.tencent.mm.plugin.sns.ui.widget.j3.f171176c;
        sb7.append(hashMap.size());
        ot5.g.c("MicroMsg.SnsSessionCmtReportManager", sb7.toString());
        java.lang.String Ni = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
        kotlin.jvm.internal.o.f(Ni, "requestSessionId(...)");
        j3Var.d(1, Ni, hashMap);
        hashMap.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCommentTimelineSession", "com.tencent.mm.plugin.sns.ui.widget.SnsSessionCmtReportManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        super.onPause();
        V6().getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.AutoPlayUtil", "onUIPause");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        com.tencent.mm.plugin.sns.ui.widget.x1.f171306a.h();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        super.onResume();
        V6().getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.AutoPlayUtil", "onUIResume");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveAutoPlayManager");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView recycleView = getRecycleView();
        n3.m0.a(recycleView, new com.tencent.mm.plugin.sns.ui.improve.component.l1(recycleView, this));
        getRecycleView().requestLayout();
        mc4.c cVar = mc4.c.f325645a;
        android.app.Activity context = getContext();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showRetryPostAlert$default", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        cVar.c(context, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showRetryPostAlert$default", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        com.tencent.mm.plugin.sns.ui.widget.j3.f171174a.f(1);
        com.tencent.mm.plugin.sns.ui.widget.x1.f171306a.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd: errType=");
        sb6.append(i17);
        sb6.append(", errCode=");
        sb6.append(i18);
        sb6.append(", scene type:");
        sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataUIC", sb6.toString());
        if (m1Var != null && m1Var.getType() == 218) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f168707s;
            if (!(u3Var != null && u3Var.isShowing())) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
                return;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideOpDialog", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("hideOpDialog: dialog null=");
            sb7.append(this.f168707s == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.MainUIC", sb7.toString());
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f168707s;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            this.f168707s = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideOpDialog", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
            com.tencent.mm.plugin.sns.model.q2 q2Var = (com.tencent.mm.plugin.sns.model.q2) m1Var;
            int L = q2Var.L();
            if (L == 4 || L == 6) {
                if (i17 == 0 && i18 == 0) {
                    db5.t7.i(getActivity(), getActivity().getResources().getString(com.tencent.mm.R.string.md7), com.tencent.mm.R.raw.icons_filled_done);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentUsername", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                    r45.e86 e86Var = q2Var.f164592i;
                    if (e86Var == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentUsername", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                        str2 = "";
                    } else {
                        java.lang.String str3 = e86Var.f373126d;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentUsername", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                        str2 = str3;
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.D0(str2, c01.z1.r())) {
                        com.tencent.mm.plugin.sns.storage.v1 D0 = com.tencent.mm.plugin.sns.model.l4.Aj().D0(q2Var.M(), q2Var.J(), q2Var.L() == 6 ? 10 : 9);
                        if (D0 != null) {
                            D0.u0();
                            com.tencent.mm.plugin.sns.model.l4.Aj().update(D0.systemRowid, D0);
                        }
                    }
                } else {
                    db5.t7.i(getActivity(), getActivity().getResources().getString(com.tencent.mm.R.string.md6), com.tencent.mm.R.raw.icons_outlined_error);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009b, code lost:
    
        if ((r1 != null && r1.A()) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r15, com.tencent.mm.plugin.sns.ui.improve.component.x1 r16, int r17, kotlin.coroutines.Continuation r18) {
        /*
            r14 = this;
            r0 = r14
            r1 = r18
            java.lang.String r2 = "onScrollStateChanged"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            boolean r4 = r1 instanceof com.tencent.mm.plugin.sns.ui.improve.component.n1
            if (r4 == 0) goto L1e
            r4 = r1
            com.tencent.mm.plugin.sns.ui.improve.component.n1 r4 = (com.tencent.mm.plugin.sns.ui.improve.component.n1) r4
            int r5 = r4.f168956g
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1e
            int r5 = r5 - r6
            r4.f168956g = r5
            goto L23
        L1e:
            com.tencent.mm.plugin.sns.ui.improve.component.n1 r4 = new com.tencent.mm.plugin.sns.ui.improve.component.n1
            r4.<init>(r14, r1)
        L23:
            java.lang.Object r1 = r4.f168954e
            pz5.a r5 = pz5.a.f359186d
            int r6 = r4.f168956g
            r7 = 1
            if (r6 == 0) goto L41
            if (r6 != r7) goto L36
            java.lang.Object r4 = r4.f168953d
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC r4 = (com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC) r4
            kotlin.ResultKt.throwOnFailure(r1)
            goto L8c
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r4)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            throw r1
        L41:
            kotlin.ResultKt.throwOnFailure(r1)
            java.util.ArrayList r1 = r16.a()
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r7
            if (r1 == 0) goto L78
            rc4.e r1 = rc4.e.f394136a
            java.util.ArrayList r1 = r16.a()
            java.lang.Object r1 = kz5.n0.i0(r1)
            com.tencent.mm.plugin.sns.ui.improve.component.o0 r1 = (com.tencent.mm.plugin.sns.ui.improve.component.o0) r1
            zc4.b r1 = r1.a()
            xc4.p r1 = r1.n()
            java.lang.String r1 = r1.getUserName()
            if (r1 != 0) goto L6b
            java.lang.String r1 = ""
        L6b:
            java.lang.String r6 = "setLastSnsUsername"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r8)
            rc4.e.f394144i = r1
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r8)
        L78:
            r4.f168953d = r0
            r4.f168956g = r7
            r1 = r15
            r6 = r16
            r8 = r17
            java.lang.Object r1 = r14.Z6(r15, r6, r8, r4)
            if (r1 != r5) goto L8b
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r5
        L8b:
            r4 = r0
        L8c:
            kotlinx.coroutines.r2 r1 = r4.f168700i
            if (r1 == 0) goto L9d
            r5 = 0
            if (r1 == 0) goto L9a
            boolean r1 = r1.A()
            if (r1 != r7) goto L9a
            goto L9b
        L9a:
            r7 = r5
        L9b:
            if (r7 == 0) goto Lb1
        L9d:
            kotlinx.coroutines.p0 r1 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r9 = kotlinx.coroutines.internal.b0.f310484a
            r10 = 0
            com.tencent.mm.plugin.sns.ui.improve.component.o1 r11 = new com.tencent.mm.plugin.sns.ui.improve.component.o1
            r1 = 0
            r11.<init>(r4, r1)
            r12 = 2
            r13 = 0
            r8 = r4
            kotlinx.coroutines.r2 r1 = pf5.e.launch$default(r8, r9, r10, r11, r12, r13)
            r4.f168700i = r1
        Lb1:
            r4.T6()
            jz5.f0 r1 = jz5.f0.f302826a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, com.tencent.mm.plugin.sns.ui.improve.component.x1, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j
    public void onScrollStateChangedInMain(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.sns.ui.improve.component.x1 struct, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(struct, "struct");
        super.onScrollStateChangedInMain(recyclerView, struct, i17);
        V6().c(recyclerView, i17, struct.a());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i17, i18);
        if (recyclerView.getScrollState() == 1) {
            T6();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
    }
}
