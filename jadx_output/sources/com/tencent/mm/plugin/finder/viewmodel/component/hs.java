package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class hs extends com.tencent.mm.ui.component.UIComponent implements kr2.k {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f134651d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f134652e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f134653f;

    /* renamed from: g, reason: collision with root package name */
    public pi0.n1 f134654g;

    /* renamed from: h, reason: collision with root package name */
    public kr2.j f134655h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.viewmodel.component.lq f134656i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f134657m;

    /* renamed from: n, reason: collision with root package name */
    public int f134658n;

    /* renamed from: o, reason: collision with root package name */
    public long f134659o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f134660p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f134661q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f134662r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f134663s;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ValueAnimator f134664t;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.ValueAnimator f134665u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f134666v;

    /* renamed from: w, reason: collision with root package name */
    public long f134667w;

    /* renamed from: x, reason: collision with root package name */
    public long f134668x;

    /* renamed from: y, reason: collision with root package name */
    public androidx.lifecycle.k0 f134669y;

    /* renamed from: z, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.oq f134650z = new com.tencent.mm.plugin.finder.viewmodel.component.oq(null);
    public static final java.util.Set A = new java.util.LinkedHashSet();
    public static final java.util.concurrent.ConcurrentHashMap B = new java.util.concurrent.ConcurrentHashMap();
    public static final java.util.concurrent.ConcurrentHashMap C = new java.util.concurrent.ConcurrentHashMap();
    public static final java.util.concurrent.ConcurrentHashMap D = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134652e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f134653f = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f134660p = true;
        this.f134661q = true;
        this.f134662r = true;
        this.f134663s = new java.util.concurrent.ConcurrentHashMap();
    }

    public static /* synthetic */ void D7(com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, android.view.View view, boolean z17, java.lang.String str, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            str = "";
        }
        if ((i17 & 8) != 0) {
            z18 = false;
        }
        hsVar.C7(view, z17, str, z18);
    }

    public static final boolean O6(com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, in5.s0 s0Var) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed v76 = hsVar.v7(s0Var, null);
        if (v76 == null) {
            return false;
        }
        boolean z17 = (hsVar.g7(s0Var) && (com.tencent.mm.ui.bk.A() || com.tencent.mm.ui.bk.Q())) ? false : true;
        boolean z18 = v76.getItemId() == hsVar.f134659o;
        r45.al2 al2Var = (r45.al2) C.get(java.lang.Long.valueOf(v76.getItemId()));
        boolean contains = A.contains(java.lang.Long.valueOf(v76.getItemId()));
        android.app.Activity context = hsVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class);
        boolean W6 = finderDescPanelUIC != null ? finderDescPanelUIC.W6() : false;
        r45.dm2 object_extend = v76.getFeedObject().getFeedObject().getObject_extend();
        boolean z19 = ((object_extend != null ? object_extend.getLong(30) : 0L) & 128) == 0;
        boolean z27 = z17 && z18 && al2Var != null && !contains && !W6 && z19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isNeedShowSurvey ret=");
        sb6.append(z27);
        sb6.append(" isSupport=");
        sb6.append(z17);
        sb6.append(" isSameFeed=");
        sb6.append(z18);
        sb6.append(" isMatchedConfig=");
        sb6.append(al2Var != null);
        sb6.append(" shown=");
        sb6.append(contains);
        sb6.append(" isDescPanelShown=");
        sb6.append(W6);
        sb6.append(" canShow=");
        sb6.append(z19);
        sb6.append(" mediaType=");
        sb6.append(v76.getFeedObject().getMediaType());
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
        return z27;
    }

    public static void Z6(com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, in5.s0 s0Var, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator listener;
        if ((i17 & 4) != 0) {
            aVar = null;
        }
        hsVar.getClass();
        s0Var.o().setDescendantFocusability(393216);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.rol);
        if (frameLayout == null || frameLayout.getVisibility() == 8) {
            return;
        }
        java.lang.Object parent = frameLayout.getParent();
        if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "hideFlutterLayout");
            float f17 = com.tencent.mm.ui.bh.a(hsVar.getContext()).f197136b;
            if (z17) {
                com.tencent.mm.plugin.finder.viewmodel.component.lq lqVar = hsVar.f134656i;
                if (lqVar != null) {
                    lqVar.a(true);
                }
                android.view.ViewPropertyAnimator animate = frameLayout.animate();
                animate.setUpdateListener(new com.tencent.mm.plugin.finder.viewmodel.component.cr(hsVar));
                android.view.ViewPropertyAnimator duration = animate.setDuration(300L);
                if (duration == null || (translationY = duration.translationY(f17)) == null || (listener = translationY.setListener(new com.tencent.mm.plugin.finder.viewmodel.component.dr(hsVar, frameLayout, s0Var, aVar))) == null) {
                    return;
                }
                listener.start();
                return;
            }
            com.tencent.mm.plugin.finder.viewmodel.component.lq lqVar2 = hsVar.f134656i;
            if (lqVar2 != null) {
                lqVar2.a(true);
            }
            com.tencent.mm.plugin.finder.viewmodel.component.lq lqVar3 = hsVar.f134656i;
            if (lqVar3 != null) {
                lqVar3.c(1.0f);
            }
            com.tencent.mm.plugin.finder.viewmodel.component.lq lqVar4 = hsVar.f134656i;
            if (lqVar4 != null) {
                lqVar4.a(false);
            }
            frameLayout.setVisibility(8);
            hsVar.y7(s0Var, com.tencent.mm.plugin.finder.viewmodel.component.rq.f135823d);
            if (aVar != null) {
                aVar.invoke();
            }
            pi0.n1 n1Var = hsVar.f134654g;
            if (n1Var != null) {
                n1Var.a();
            }
            hsVar.f134654g = null;
            hsVar.f134655h = null;
        }
    }

    public static void o7(com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, android.view.View view, in5.s0 s0Var, float f17, long j17, yz5.a aVar, int i17, java.lang.Object obj) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationYBy;
        android.view.ViewPropertyAnimator duration;
        hsVar.getClass();
        s0Var.p(com.tencent.mm.R.id.g1y);
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.dq6);
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, -((int) f17));
        ofInt.setDuration(j17);
        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
        ofInt.addUpdateListener(new com.tencent.mm.plugin.finder.viewmodel.component.nr(view, s0Var));
        ofInt.addListener(new com.tencent.mm.plugin.finder.viewmodel.component.or(view));
        ofInt.start();
        hsVar.f134665u = ofInt;
        if (p17 == null || (animate = p17.animate()) == null || (translationYBy = animate.translationYBy(f17)) == null || (duration = translationYBy.setDuration(j17)) == null) {
            return;
        }
        duration.start();
    }

    public static r45.yk2 w7(com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, in5.s0 s0Var, yz5.l lVar, int i17, java.lang.Object obj) {
        r45.yk2 yk2Var = null;
        if ((i17 & 2) != 0) {
            lVar = null;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed v76 = hsVar.v7(s0Var, null);
        if (v76 != null && (yk2Var = (r45.yk2) B.get(java.lang.Long.valueOf(v76.getItemId()))) != null && lVar != null) {
            lVar.invoke(yk2Var);
        }
        return yk2Var;
    }

    public final void A7() {
        in5.s0 s0Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed v76;
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "triggerRealPopupFlutterSurvey");
        java.lang.ref.WeakReference weakReference = this.f134651d;
        if (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null || (v76 = v7(s0Var, null)) == null) {
            return;
        }
        long itemId = v76.getItemId();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("triggerRealPopupFlutterSurvey-1, feedId = ");
        sb6.append(T6(itemId));
        sb6.append(", holder=");
        sb6.append(V6(s0Var));
        sb6.append(", itemView=");
        android.view.View itemView = s0Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        sb6.append(W6(itemView));
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
        if (this.f134659o == itemId) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("triggerRealPopupFlutterSurvey-2, feedId = ");
            sb7.append(T6(itemId));
            sb7.append(", holder=");
            sb7.append(V6(s0Var));
            sb7.append(", itemView=");
            android.view.View itemView2 = s0Var.itemView;
            kotlin.jvm.internal.o.f(itemView2, "itemView");
            sb7.append(W6(itemView2));
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", sb7.toString());
            r45.zk2 zk2Var = z7(s0Var).f135591k;
            if (zk2Var != null) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("triggerRealPopupFlutterSurvey-3, feedId = ");
                sb8.append(T6(itemId));
                sb8.append(", holder=");
                sb8.append(V6(s0Var));
                sb8.append(", itemView=");
                android.view.View itemView3 = s0Var.itemView;
                kotlin.jvm.internal.o.f(itemView3, "itemView");
                sb8.append(W6(itemView3));
                com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", sb8.toString());
                q7(s0Var, zk2Var, null);
            }
        }
    }

    public final void B7(in5.s0 s0Var, r45.zk2 zk2Var, com.tencent.mm.plugin.finder.viewmodel.component.qq qqVar) {
        v7(s0Var, new com.tencent.mm.plugin.finder.viewmodel.component.gs(this, zk2Var, qqVar));
    }

    public final void C7(android.view.View view, boolean z17, java.lang.String str, boolean z18) {
        android.content.Context context = view.getContext();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(z18 ? com.tencent.mm.R.id.g3i : com.tencent.mm.R.id.g3h);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(z18 ? com.tencent.mm.R.id.g3l : com.tencent.mm.R.id.g3k);
        d92.f fVar = d92.f.f227470a;
        d92.f.o(fVar, view, false, false, false, 7, null);
        kotlin.jvm.internal.o.d(weImageView);
        d92.f.o(fVar, weImageView, false, false, false, 7, null);
        textView.setTextSize(1, 12.0f);
        if (z17) {
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9));
            view.setBackgroundResource(com.tencent.mm.R.drawable.f481630yi);
        } else {
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_6));
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_6));
            view.setBackgroundResource(com.tencent.mm.R.drawable.f481629yh);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        textView.setText(str);
    }

    public final void P6(in5.s0 s0Var) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed v76 = v7(s0Var, null);
        if (v76 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearPrepareLayout, feedId = ");
            sb6.append(T6(v76.getItemId()));
            sb6.append(", holder=");
            sb6.append(V6(s0Var));
            sb6.append(", itemView=");
            android.view.View itemView = s0Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            sb6.append(W6(itemView));
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.nq nqVar = (com.tencent.mm.plugin.finder.viewmodel.component.nq) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.nq.class);
            if (nqVar != null) {
                nqVar.clear();
            }
        }
    }

    public final android.view.View Q6(in5.s0 s0Var) {
        android.view.View inflate;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.f484899fv2);
        if (p17 != null) {
            return p17;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) s0Var.p(com.tencent.mm.R.id.f484900fv3);
        if (viewStub == null || (inflate = viewStub.inflate()) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "contentLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "contentLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.feed.FinderNpsSurveyView finderNpsSurveyView = (com.tencent.mm.plugin.finder.feed.FinderNpsSurveyView) inflate.findViewById(com.tencent.mm.R.id.nso);
        if (finderNpsSurveyView == null) {
            return inflate;
        }
        finderNpsSurveyView.setItemClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.hr(s0Var, finderNpsSurveyView, this));
        return inflate;
    }

    public final void R6(in5.s0 s0Var, r45.zk2 zk2Var, r45.xk2 xk2Var, java.lang.String str) {
        java.lang.Object obj;
        r45.zk2 zk2Var2;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator alpha2;
        android.view.ViewPropertyAnimator duration2;
        so2.j5 j5Var = (so2.j5) s0Var.f293125i;
        com.tencent.mm.plugin.finder.viewmodel.component.pq z76 = z7(s0Var);
        java.lang.Long valueOf = java.lang.Long.valueOf(xk2Var.getLong(0));
        java.util.List list = z76.f135586f;
        if (!list.contains(valueOf)) {
            list.add(java.lang.Long.valueOf(xk2Var.getLong(0)));
        }
        D.put(java.lang.Long.valueOf(j5Var.getItemId()), z76);
        B7(s0Var, zk2Var, com.tencent.mm.plugin.finder.viewmodel.component.qq.f135730e);
        int integer = xk2Var.getInteger(5);
        if (integer == 1) {
            S6(s0Var, zk2Var);
            return;
        }
        if (integer != 2) {
            return;
        }
        long j17 = xk2Var.getLong(6);
        r45.yk2 w76 = w7(this, s0Var, null, 2, null);
        if (w76 == null) {
            zk2Var2 = null;
        } else {
            java.util.LinkedList list2 = w76.getList(1);
            kotlin.jvm.internal.o.f(list2, "getQuestions(...)");
            java.util.Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.zk2) obj).getLong(0) == j17) {
                        break;
                    }
                }
            }
            zk2Var2 = (r45.zk2) obj;
        }
        if (zk2Var2 == null) {
            S6(s0Var, zk2Var);
            return;
        }
        if (g7(s0Var)) {
            k7(s0Var, zk2Var2, null);
            return;
        }
        int integer2 = zk2Var.getInteger(3);
        int integer3 = zk2Var2.getInteger(3);
        if (integer2 != 1 || integer3 != 2) {
            c7(s0Var, new com.tencent.mm.plugin.finder.viewmodel.component.vq(this, s0Var, zk2Var2));
            return;
        }
        android.view.View X6 = X6(s0Var);
        if (X6 != null) {
            android.widget.TextView textView = (android.widget.TextView) X6.findViewById(com.tencent.mm.R.id.g3t);
            android.view.View findViewById = X6.findViewById(com.tencent.mm.R.id.g3o);
            android.view.View findViewById2 = X6.findViewById(com.tencent.mm.R.id.g3r);
            com.tencent.mm.plugin.finder.viewmodel.component.uq uqVar = new com.tencent.mm.plugin.finder.viewmodel.component.uq(findViewById, findViewById2, textView, zk2Var2, str);
            android.view.View Q6 = Q6(s0Var);
            if (Q6 != null) {
                r7(s0Var, zk2Var2);
                s7(Q6, zk2Var2);
                java.util.Iterator it6 = zk2Var2.getList(2).iterator();
                while (it6.hasNext()) {
                    B7(s0Var, zk2Var2, com.tencent.mm.plugin.finder.viewmodel.component.qq.f135729d);
                }
                java.lang.Object parent = Q6.getParent();
                if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
                    Q6.animate().cancel();
                    int U6 = U6(Q6);
                    com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "popupContentLayout height: " + U6);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(Q6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupContentLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    Q6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(Q6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupContentLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(Q6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupContentLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    Q6.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(Q6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupContentLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    p7(Q6, s0Var, U6, 300L, new com.tencent.mm.plugin.finder.viewmodel.component.jr(this, s0Var, uqVar));
                    if (findViewById != null && (animate2 = findViewById.animate()) != null && (alpha2 = animate2.alpha(0.0f)) != null && (duration2 = alpha2.setDuration(300L)) != null) {
                        duration2.start();
                    }
                    if (findViewById2 == null || (animate = findViewById2.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(300L)) == null) {
                        return;
                    }
                    duration.start();
                }
            }
        }
    }

    public final void S6(in5.s0 s0Var, r45.zk2 zk2Var) {
        boolean g76 = g7(s0Var);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f134652e;
        if (!g76) {
            int integer = zk2Var.getInteger(3);
            if (integer == 1) {
                n3Var.postDelayed(new com.tencent.mm.plugin.finder.viewmodel.component.yq(this, s0Var), 1000L);
                return;
            }
            if (integer != 2) {
                return;
            }
            int integer2 = zk2Var.getInteger(4);
            if (integer2 == 1) {
                n3Var.postDelayed(new com.tencent.mm.plugin.finder.viewmodel.component.zq(this, s0Var), 1000L);
                return;
            } else {
                if (integer2 != 2) {
                    return;
                }
                n3Var.postDelayed(new com.tencent.mm.plugin.finder.viewmodel.component.ar(this, s0Var), 1000L);
                return;
            }
        }
        n3Var.postDelayed(new com.tencent.mm.plugin.finder.viewmodel.component.xq(this, s0Var), 1000L);
        android.app.Activity context = getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = s0Var.f293121e.getString(com.tencent.mm.R.string.f491954mr1);
        e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var.c();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = s0Var.o().getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
        int w17 = ((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager).w() + 1;
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "[smoothScrollToNextPosition] nextPosition=" + w17);
        s0Var.o().post(new com.tencent.mm.plugin.finder.viewmodel.component.bs(s0Var, w17));
    }

    @Override // kr2.k
    public void T(r45.zk2 question, r45.xk2 answer, java.lang.String inputText, java.util.List mutliAnswerIDs) {
        in5.s0 s0Var;
        kotlin.jvm.internal.o.g(question, "question");
        kotlin.jvm.internal.o.g(answer, "answer");
        kotlin.jvm.internal.o.g(inputText, "inputText");
        kotlin.jvm.internal.o.g(mutliAnswerIDs, "mutliAnswerIDs");
        java.lang.ref.WeakReference weakReference = this.f134651d;
        if (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.pq z76 = z7(s0Var);
        z76.f135588h = inputText;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = mutliAnswerIDs.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            java.lang.String obj = next != null ? next.toString() : null;
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        z76.f135587g = kz5.z.C0(arrayList.toArray(new java.lang.String[0]));
        R6(s0Var, question, answer, "");
    }

    public final java.lang.String T6(long j17) {
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String q17 = b52.b.q(j17);
        kotlin.jvm.internal.o.d(q17);
        return q17;
    }

    public final int U6(android.view.View view) {
        int height = view.getHeight();
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (height > 0 || view2 == null) {
            return height;
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(view2.getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(view2.getHeight(), 0));
        return new android.graphics.Point(view.getMeasuredWidth(), view.getMeasuredHeight()).y;
    }

    public final java.lang.String V6(in5.s0 s0Var) {
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(s0Var));
        kotlin.jvm.internal.o.d(hexString);
        return hexString;
    }

    public final java.lang.String W6(android.view.View view) {
        java.lang.String hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(view));
        kotlin.jvm.internal.o.d(hexString);
        return hexString;
    }

    public final android.view.View X6(in5.s0 s0Var) {
        android.view.View view;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.f484902fv4);
        if (p17 != null) {
            return p17;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) s0Var.p(com.tencent.mm.R.id.f484903fv5);
        if (viewStub == null || (view = viewStub.inflate()) == null) {
            view = null;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "headerLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "headerLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.g3t);
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.g3o);
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.g3r);
            textView.setTextSize(1, 15.0f);
            kotlin.jvm.internal.o.d(findViewById);
            D7(this, findViewById, false, null, false, 4, null);
            kotlin.jvm.internal.o.d(findViewById2);
            D7(this, findViewById2, false, null, true, 4, null);
        }
        return view;
    }

    public final void Y6(in5.s0 s0Var, yz5.a aVar) {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator alpha2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator listener;
        android.view.View X6 = X6(s0Var);
        android.view.View Q6 = Q6(s0Var);
        if (X6 == null || Q6 == null || !kotlin.jvm.internal.o.b(X6.getParent(), Q6.getParent())) {
            return;
        }
        java.lang.Object parent = X6.getParent();
        if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
            int U6 = U6(X6);
            int U62 = U6(Q6);
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "hideContentLayout headerHeight: " + U6 + ", contentHeight: " + U62);
            o7(this, Q6, s0Var, (float) (U6 + U62), 300L, null, 16, null);
            android.view.ViewPropertyAnimator animate = X6.animate();
            if (animate != null && (alpha2 = animate.alpha(0.0f)) != null && (duration2 = alpha2.setDuration(300L)) != null && (listener = duration2.setListener(new com.tencent.mm.plugin.finder.viewmodel.component.br(Q6, X6, this, s0Var, aVar))) != null) {
                listener.start();
            }
            android.view.ViewPropertyAnimator animate2 = Q6.animate();
            if (animate2 == null || (alpha = animate2.alpha(0.0f)) == null || (duration = alpha.setDuration(300L)) == null) {
                return;
            }
            duration.start();
        }
    }

    public final void a7(in5.s0 s0Var, yz5.a aVar) {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        android.view.View X6 = X6(s0Var);
        if (X6 != null) {
            java.lang.Object parent = X6.getParent();
            if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
                int U6 = U6(X6);
                o7(this, X6, s0Var, U6, 300L, null, 16, null);
                com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "hideHeaderLayout height: " + U6);
                android.view.ViewPropertyAnimator animate = X6.animate();
                if (animate == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(300L)) == null || (listener = duration.setListener(new com.tencent.mm.plugin.finder.viewmodel.component.er(X6, this, s0Var, aVar))) == null) {
                    return;
                }
                listener.start();
            }
        }
    }

    public final void b7(in5.s0 s0Var, yz5.a aVar) {
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        android.view.View x76 = x7(s0Var);
        if (x76 != null) {
            java.lang.Object parent = x76.getParent();
            if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
                int U6 = U6(x76);
                com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "hideScoreLayout height: " + U6);
                o7(this, x76, s0Var, (float) U6, 300L, null, 16, null);
                android.view.ViewPropertyAnimator animate = x76.animate();
                if (animate == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(300L)) == null || (listener = duration.setListener(new com.tencent.mm.plugin.finder.viewmodel.component.fr(x76, this, s0Var, aVar))) == null) {
                    return;
                }
                listener.start();
            }
        }
    }

    public final void c7(in5.s0 s0Var, yz5.a aVar) {
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "hideSurveyLayout showState=" + z7(s0Var).f135581a);
        int ordinal = z7(s0Var).f135581a.ordinal();
        if (ordinal == 2) {
            a7(s0Var, aVar);
        } else if (ordinal == 3) {
            Y6(s0Var, aVar);
        } else {
            if (ordinal != 4) {
                return;
            }
            b7(s0Var, aVar);
        }
    }

    public final void d7(in5.s0 s0Var) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed v76;
        y7(s0Var, com.tencent.mm.plugin.finder.viewmodel.component.rq.f135823d);
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.g1y);
        if (p17 != null) {
            p17.setTranslationY(0.0f);
        }
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.dq6);
        if (p18 != null) {
            p18.setTranslationY(0.0f);
        }
        android.view.View p19 = s0Var.p(com.tencent.mm.R.id.f484486ee3);
        if (p19 != null) {
            p19.setTranslationY(0.0f);
        }
        android.view.View p27 = s0Var.p(com.tencent.mm.R.id.fv6);
        if (p27 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p27, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.kk.d(p27, 0);
        }
        android.view.View p28 = s0Var.p(com.tencent.mm.R.id.f484902fv4);
        if (p28 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p28, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.kk.d(p28, 0);
        }
        android.view.View p29 = s0Var.p(com.tencent.mm.R.id.f484899fv2);
        if (p29 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p29, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p29.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p29, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.kk.d(p29, 0);
        }
        android.view.View p37 = s0Var.p(com.tencent.mm.R.id.rol);
        if (p37 == null || (v76 = v7(s0Var, null)) == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hideFlutterSurveyLayout, feedId = ");
        sb6.append(T6(v76.getItemId()));
        sb6.append(", holder=");
        sb6.append(V6(s0Var));
        sb6.append(", itemView=");
        android.view.View itemView = s0Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        sb6.append(W6(itemView));
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(p37, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p37.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(p37, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "hideSurveyLayoutWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.kk.d(p37, 0);
    }

    public final boolean e7(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.viewmodel.component.pq z76 = z7(holder);
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "isShowingNpsSurvey, showInfo.showState=" + z76.f135581a);
        return z76.f135581a != com.tencent.mm.plugin.finder.viewmodel.component.rq.f135823d;
    }

    public final long f7(int i17) {
        if (i17 != 2) {
            if (i17 != 4) {
                if (i17 == 9) {
                    return 4L;
                }
                if (i17 != 3001) {
                    if (i17 != 3002) {
                        return 0L;
                    }
                }
            }
            return 2L;
        }
        return 1L;
    }

    public final boolean g7(in5.s0 s0Var) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed v76 = v7(s0Var, null);
        if (v76 == null) {
            return false;
        }
        r45.al2 al2Var = (r45.al2) C.get(java.lang.Long.valueOf(v76.getItemId()));
        return al2Var != null && al2Var.getInteger(14) == 1;
    }

    public final void h7(in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFeedActionHappen, feedId = ");
        sb6.append(T6(j5Var.getItemId()));
        sb6.append(", holder=");
        sb6.append(V6(holder));
        sb6.append(", itemView=");
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        sb6.append(W6(itemView));
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
        v7(holder, new com.tencent.mm.plugin.finder.viewmodel.component.fs(this, holder, i17, false));
    }

    public final void i7(in5.s0 holder, boolean z17) {
        r45.al2 al2Var;
        java.lang.Object putIfAbsent;
        com.tencent.pigeon.finder.FinderNPSFlutterAPI finderNPSFlutterAPI;
        in5.s0 s0Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        java.lang.ref.WeakReference weakReference = this.f134651d;
        if (weakReference != null && (s0Var = (in5.s0) weakReference.get()) != null) {
            T6(j5Var.getItemId());
            V6(holder);
            android.view.View itemView = s0Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            W6(itemView);
            if (z7(s0Var).f135581a == com.tencent.mm.plugin.finder.viewmodel.component.rq.f135824e) {
                P6(s0Var);
            }
            Z6(this, s0Var, false, null, 4, null);
        }
        this.f134651d = new java.lang.ref.WeakReference(holder);
        T6(j5Var.getItemId());
        V6(holder);
        android.view.View itemView2 = holder.itemView;
        kotlin.jvm.internal.o.f(itemView2, "itemView");
        W6(itemView2);
        pf5.u uVar = pf5.u.f353936a;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) uVar.b(getContext()).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
        int S6 = finderHomeUIC != null ? finderHomeUIC.S6() : -1;
        if (S6 == 3 && !this.f134660p) {
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "onFeedFocused returned because follow disable");
            return;
        }
        if (S6 == 1 && !this.f134661q) {
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "onFeedFocused returned because friend disable");
            return;
        }
        if (S6 == 4 && !this.f134662r) {
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "onFeedFocused returned because machine disable");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFeedFocused-1, feedId = ");
        sb6.append(T6(j5Var.getItemId()));
        sb6.append(", holder=");
        sb6.append(V6(holder));
        sb6.append(", itemView=");
        android.view.View itemView3 = holder.itemView;
        kotlin.jvm.internal.o.f(itemView3, "itemView");
        sb6.append(W6(itemView3));
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
        if (z17) {
            kr2.j jVar = this.f134655h;
            if (jVar != null && (finderNPSFlutterAPI = jVar.f311312e) != null) {
                finderNPSFlutterAPI.resignTextField(kr2.i.f311310d);
            }
            this.f134659o = j5Var.getItemId();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onFeedFocused-2, focusingFeedId = ");
            sb7.append(T6(this.f134659o));
            sb7.append(", holder=");
            sb7.append(V6(holder));
            sb7.append(", itemView=");
            android.view.View itemView4 = holder.itemView;
            kotlin.jvm.internal.o.f(itemView4, "itemView");
            sb7.append(W6(itemView4));
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", sb7.toString());
            java.lang.System.currentTimeMillis();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f134663s;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(S6);
            java.lang.Object obj = concurrentHashMap.get(valueOf);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = java.lang.Integer.valueOf(holder.getAdapterPosition())))) != null) {
                obj = putIfAbsent;
            }
            java.lang.Integer num = (java.lang.Integer) obj;
            int adapterPosition = holder.getAdapterPosition();
            kotlin.jvm.internal.o.d(num);
            this.f134658n = adapterPosition - num.intValue();
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "onFeedFocused removeCallbackAndMessages");
            this.f134652e.removeCallbacksAndMessages(null);
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f134653f;
            n3Var.removeCallbacksAndMessages(null);
            this.f134666v = false;
            this.f134667w = 0L;
            so2.j5 j5Var2 = (so2.j5) holder.f293125i;
            androidx.lifecycle.k0 k0Var = this.f134669y;
            if (k0Var != null) {
                ((xc2.k0) uVar.e(zy2.b6.class).a(xc2.k0.class)).Y6(this.f134659o).removeObserver(k0Var);
            }
            com.tencent.mm.plugin.finder.viewmodel.component.tq tqVar = new com.tencent.mm.plugin.finder.viewmodel.component.tq(j5Var2, this, holder);
            this.f134669y = tqVar;
            android.app.Activity context = getContext();
            com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            if (mMActivity != null) {
                pm0.v.y(((xc2.k0) uVar.e(zy2.b6.class).a(xc2.k0.class)).Y6(j5Var2.getItemId()), mMActivity, tqVar);
                androidx.recyclerview.widget.RecyclerView o17 = holder.o();
                if (o17 != null) {
                    o17.i(new com.tencent.mm.plugin.finder.viewmodel.component.sq(this));
                }
            }
            so2.j5 j5Var3 = (so2.j5) holder.f293125i;
            if (e7(holder) && (al2Var = (r45.al2) C.get(java.lang.Long.valueOf(j5Var3.getItemId()))) != null) {
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.P9).getValue()).r()).intValue();
                long j17 = intValue == 0 ? al2Var.getFloat(9) * 1000 : intValue * 1000;
                if (j17 > 0) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "showSurveyLayoutWithoutAnimate timerHandler.postDelayed " + j17 + " ms");
                    n3Var.postDelayed(new com.tencent.mm.plugin.finder.viewmodel.component.wq(this, holder), j17);
                }
            }
            h7(holder, 1);
        }
    }

    public final void k7(in5.s0 s0Var, r45.zk2 zk2Var, yz5.a aVar) {
        com.tencent.mm.plugin.finder.viewmodel.component.pq z76 = z7(s0Var);
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "popupFlutterSurvey, showInfo=" + z76);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed v76 = v7(s0Var, null);
        if (v76 != null) {
            long itemId = v76.getItemId();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("popupFlutterSurvey, feedId = ");
            sb6.append(T6(itemId));
            sb6.append(", holder=");
            sb6.append(V6(s0Var));
            sb6.append(", itemView=");
            android.view.View itemView = s0Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            sb6.append(W6(itemView));
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
            if (z76.f135590j != null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "popupFlutterSurvey, showingQuestion is exist");
                q7(s0Var, zk2Var, aVar);
                return;
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "popupFlutterSurvey, showingQuestion is null");
            z76.f135591k = zk2Var;
            z76.f135592l = aVar;
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "preparePopupFlutterSurvey");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed v77 = v7(s0Var, null);
            if (v77 != null) {
                long itemId2 = v77.getItemId();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("preparePopupFlutterSurvey, feedId = ");
                sb7.append(T6(itemId2));
                sb7.append(", holder=");
                sb7.append(V6(s0Var));
                sb7.append(", itemView=");
                android.view.View itemView2 = s0Var.itemView;
                kotlin.jvm.internal.o.f(itemView2, "itemView");
                sb7.append(W6(itemView2));
                com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", sb7.toString());
            }
            this.f134654g = null;
            y7(s0Var, com.tencent.mm.plugin.finder.viewmodel.component.rq.f135824e);
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.nq nqVar = (com.tencent.mm.plugin.finder.viewmodel.component.nq) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.nq.class);
            if (nqVar != null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderNpsScrollUIC", "onBindView");
                com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) s0Var.o();
                nqVar.f135343e = finderRecyclerView;
                if (finderRecyclerView != null) {
                    nqVar.O6(true);
                    finderRecyclerView.setInterceptTouchEventListener(nqVar.f135346h);
                }
            }
        }
    }

    public final void l7(in5.s0 s0Var, r45.zk2 zk2Var, yz5.a aVar) {
        java.lang.Object obj;
        java.lang.Object obj2;
        y7(s0Var, com.tencent.mm.plugin.finder.viewmodel.component.rq.f135825f);
        android.view.View X6 = X6(s0Var);
        if (X6 != null) {
            r7(s0Var, zk2Var);
            t7(s0Var, zk2Var, X6);
            java.util.LinkedList list = zk2Var.getList(2);
            kotlin.jvm.internal.o.f(list, "getAnswers(...)");
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.xk2) obj).getInteger(2) == 2) {
                        break;
                    }
                }
            }
            r45.xk2 xk2Var = (r45.xk2) obj;
            java.util.LinkedList list2 = zk2Var.getList(2);
            kotlin.jvm.internal.o.f(list2, "getAnswers(...)");
            java.util.Iterator it6 = list2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it6.next();
                    if (((r45.xk2) obj2).getInteger(2) == 3) {
                        break;
                    }
                }
            }
            r45.xk2 xk2Var2 = (r45.xk2) obj2;
            if (xk2Var != null) {
                B7(s0Var, zk2Var, com.tencent.mm.plugin.finder.viewmodel.component.qq.f135729d);
            }
            if (xk2Var2 != null) {
                B7(s0Var, zk2Var, com.tencent.mm.plugin.finder.viewmodel.component.qq.f135729d);
            }
            java.lang.Object parent = X6.getParent();
            if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
                X6.animate().cancel();
                int U6 = U6(X6);
                com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "popupHeaderLayout height: " + U6);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(X6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                X6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(X6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(X6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                X6.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(X6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                p7(X6, s0Var, U6, 300L, new com.tencent.mm.plugin.finder.viewmodel.component.kr(aVar));
            }
        }
    }

    public final void m7(in5.s0 s0Var, r45.zk2 zk2Var, yz5.a aVar) {
        y7(s0Var, com.tencent.mm.plugin.finder.viewmodel.component.rq.f135827h);
        android.view.View x76 = x7(s0Var);
        if (x76 != null) {
            r7(s0Var, zk2Var);
            u7(s0Var, zk2Var, x76);
            java.util.LinkedList<r45.xk2> list = zk2Var.getList(2);
            kotlin.jvm.internal.o.f(list, "getAnswers(...)");
            for (r45.xk2 xk2Var : list) {
                B7(s0Var, zk2Var, com.tencent.mm.plugin.finder.viewmodel.component.qq.f135729d);
            }
            java.lang.Object parent = x76.getParent();
            if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
                x76.animate().cancel();
                int U6 = U6(x76);
                com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "popupScoreSurvey height: " + U6);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(x76, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupScoreSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                x76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(x76, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupScoreSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p7(x76, s0Var, U6, 300L, new com.tencent.mm.plugin.finder.viewmodel.component.lr(aVar));
            }
        }
    }

    public final void n7(in5.s0 s0Var, r45.zk2 zk2Var, yz5.a aVar) {
        android.view.View X6 = X6(s0Var);
        android.view.View Q6 = Q6(s0Var);
        if (X6 == null || Q6 == null) {
            return;
        }
        r7(s0Var, zk2Var);
        t7(s0Var, zk2Var, X6);
        s7(Q6, zk2Var);
        java.util.Iterator it = zk2Var.getList(2).iterator();
        while (it.hasNext()) {
            B7(s0Var, zk2Var, com.tencent.mm.plugin.finder.viewmodel.component.qq.f135729d);
        }
        java.lang.Object parent = Q6.getParent();
        if ((parent instanceof android.view.View ? (android.view.View) parent : null) != null) {
            X6.animate().cancel();
            Q6.animate().cancel();
            int U6 = U6(X6);
            int U62 = U6(Q6);
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "popupWholeSurvey headerHeight: " + U6 + ", contentHeight: " + U62);
            int i17 = U6 + U62;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(X6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            X6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(X6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(X6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            X6.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(X6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(Q6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            Q6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(Q6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(Q6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            Q6.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(Q6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "popupWholeSurvey", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p7(Q6, s0Var, i17, 300L, new com.tencent.mm.plugin.finder.viewmodel.component.mr(this, s0Var, aVar));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.ref.WeakReference weakReference;
        in5.s0 s0Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed v76;
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "onActivityResult: " + i17 + ' ' + i18);
        if (i17 != 7701 || (weakReference = this.f134651d) == null || (s0Var = (in5.s0) weakReference.get()) == null || (v76 = v7(s0Var, null)) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject = v76.getFeedObject();
        if (f7(feedObject != null ? feedObject.getMediaType() : -1) == 4) {
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "onActivityResult call triggerRealPopupFlutterSurvey now");
            this.f134652e.postDelayed(new com.tencent.mm.plugin.finder.viewmodel.component.ir(this), 1000L);
        }
    }

    @Override // kr2.k
    public void onCloseNPS() {
        in5.s0 s0Var;
        java.lang.ref.WeakReference weakReference = this.f134651d;
        if (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null) {
            return;
        }
        Z6(this, s0Var, true, null, 4, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        in5.s0 s0Var;
        this.f134652e.removeCallbacksAndMessages(null);
        android.animation.ValueAnimator valueAnimator = this.f134665u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimator2 = this.f134664t;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        java.lang.ref.WeakReference weakReference = this.f134651d;
        if (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null) {
            return;
        }
        Z6(this, s0Var, false, null, 4, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        in5.s0 s0Var;
        java.lang.ref.WeakReference weakReference = this.f134651d;
        if (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null || e7(s0Var)) {
            return;
        }
        if (z7(s0Var).f135581a == com.tencent.mm.plugin.finder.viewmodel.component.rq.f135824e) {
            P6(s0Var);
        } else {
            d7(s0Var);
        }
    }

    public final void p7(android.view.View view, in5.s0 s0Var, float f17, long j17, yz5.a aVar) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationYBy;
        android.view.ViewPropertyAnimator duration;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.dq6);
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(-((int) f17), 0);
        ofInt.setDuration(j17);
        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
        ofInt.addUpdateListener(new com.tencent.mm.plugin.finder.viewmodel.component.pr(view, s0Var));
        ofInt.addListener(new com.tencent.mm.plugin.finder.viewmodel.component.qr(aVar, view));
        ofInt.start();
        this.f134664t = ofInt;
        if (p17 == null || (animate = p17.animate()) == null || (translationYBy = animate.translationYBy(-f17)) == null || (duration = translationYBy.setDuration(j17)) == null) {
            return;
        }
        duration.start();
    }

    public final void q7(in5.s0 holder, r45.zk2 question, yz5.a aVar) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(question, "question");
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "realPopupFlutterSurvey, question = " + question);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.tencent.mm.R.id.rol);
        if (frameLayout != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "realPopupFlutterSurvey, in flutterLayout let");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed v76 = v7(holder, null);
            if (v76 != null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "realPopupFlutterSurvey, in safeGetFeedObj let");
                long itemId = v76.getItemId();
                r45.al2 al2Var = (r45.al2) C.get(java.lang.Long.valueOf(itemId));
                if (al2Var == null) {
                    return;
                }
                boolean z17 = this.f134654g != null;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                byte[] byteArray = al2Var.toByteArray();
                kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
                linkedHashMap.put("taskConfBuffer", byteArray);
                byte[] byteArray2 = question.toByteArray();
                kotlin.jvm.internal.o.f(byteArray2, "toByteArray(...)");
                linkedHashMap.put("surveyQuestionBuffer", byteArray2);
                linkedHashMap.put("needFullScreen", java.lang.Boolean.valueOf(z17));
                linkedHashMap.put("needTransparent", java.lang.Boolean.FALSE);
                linkedHashMap.put("tid", pm0.v.u(itemId));
                com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "realPopupFlutterSurvey, tid = ".concat(T6(itemId)));
                r7(holder, question);
                B7(holder, question, com.tencent.mm.plugin.finder.viewmodel.component.qq.f135729d);
                y7(holder, com.tencent.mm.plugin.finder.viewmodel.component.rq.f135828i);
                this.f134655h = new kr2.j(new java.lang.ref.WeakReference(new java.lang.ref.WeakReference(this).get()));
                android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(getContext());
                frameLayout2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                kotlinx.coroutines.l.d(getMainScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.ur(this, holder, frameLayout2, linkedHashMap, z17, frameLayout, itemId, null), 3, null);
            }
        }
    }

    public final void r7(in5.s0 s0Var, r45.zk2 zk2Var) {
        so2.j5 j5Var = (so2.j5) s0Var.f293125i;
        com.tencent.mm.plugin.finder.viewmodel.component.pq z76 = z7(s0Var);
        z76.f135590j = zk2Var;
        java.lang.Long valueOf = java.lang.Long.valueOf(zk2Var.getLong(0));
        java.util.List list = z76.f135585e;
        if (!list.contains(valueOf)) {
            list.add(java.lang.Long.valueOf(zk2Var.getLong(0)));
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (z76.f135582b == 0) {
            z76.f135582b = currentTimeMillis;
        }
        z76.f135589i.put(java.lang.Long.valueOf(zk2Var.getLong(0)), java.lang.Long.valueOf(currentTimeMillis));
        z76.f135583c++;
        D.put(java.lang.Long.valueOf(j5Var.getItemId()), z76);
    }

    public final void s7(android.view.View view, r45.zk2 zk2Var) {
        java.util.LinkedList<r45.xk2> list = zk2Var.getList(2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshContentData", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshContentData", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        kotlin.jvm.internal.o.d(list);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.xk2 xk2Var : list) {
            kotlin.jvm.internal.o.d(xk2Var);
            arrayList2.add(new com.tencent.mm.plugin.finder.feed.model.e5(zk2Var, xk2Var));
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "refreshContentData answerList = ".concat(kz5.n0.g0(arrayList2, null, null, null, 0, null, com.tencent.mm.plugin.finder.viewmodel.component.vr.f136266d, 31, null)));
        ((com.tencent.mm.plugin.finder.feed.FinderNpsSurveyView) view.findViewById(com.tencent.mm.R.id.nso)).setAnswerList(arrayList2);
    }

    public final void t7(in5.s0 s0Var, r45.zk2 zk2Var, android.view.View view) {
        java.lang.Object obj;
        jz5.f0 f0Var;
        java.lang.Object obj2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.g3t);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.g3o);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.g3r);
        java.util.LinkedList list = zk2Var.getList(2);
        kotlin.jvm.internal.o.f(list, "getAnswers(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.xk2) obj).getInteger(2) == 2) {
                    break;
                }
            }
        }
        r45.xk2 xk2Var = (r45.xk2) obj;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (xk2Var != null) {
            java.lang.String string = xk2Var.getString(1);
            if (string == null) {
                string = getContext().getString(com.tencent.mm.R.string.f492095f63);
            }
            kotlin.jvm.internal.o.d(string);
            findViewById.setEnabled(true);
            C7(findViewById, false, string, false);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.wr(this, findViewById, findViewById2, s0Var, zk2Var, xk2Var));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.LinkedList list2 = zk2Var.getList(2);
        kotlin.jvm.internal.o.f(list2, "getAnswers(...)");
        java.util.Iterator it6 = list2.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it6.next();
                if (((r45.xk2) obj2).getInteger(2) == 3) {
                    break;
                }
            }
        }
        r45.xk2 xk2Var2 = (r45.xk2) obj2;
        if (xk2Var2 != null) {
            java.lang.String string2 = xk2Var2.getString(1);
            if (string2 == null) {
                string2 = getContext().getString(com.tencent.mm.R.string.f492096f64);
            }
            kotlin.jvm.internal.o.d(string2);
            findViewById2.setEnabled(true);
            C7(findViewById2, false, string2, true);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById2.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.xr(this, findViewById2, findViewById, s0Var, zk2Var, xk2Var2));
        } else {
            f0Var2 = null;
        }
        if (f0Var2 == null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById2, arrayList7.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "refreshHeaderLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/FinderNpsSurveyQuestion;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.String string3 = zk2Var.getString(1);
        if (string3 == null) {
            string3 = s0Var.f293121e.getString(com.tencent.mm.R.string.bqf);
        }
        textView.setText(string3);
    }

    public final void u7(in5.s0 s0Var, r45.zk2 zk2Var, android.view.View view) {
        in5.s0 s0Var2 = s0Var;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.g3t);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.g3s);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        linearLayout.removeAllViews();
        java.util.LinkedList list = zk2Var.getList(2);
        kotlin.jvm.internal.o.f(list, "getAnswers(...)");
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.xk2 xk2Var = (r45.xk2) obj;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(s0Var2.f293121e);
            android.content.Context context = s0Var2.f293121e;
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(dimensionPixelOffset, dimensionPixelOffset);
            marginLayoutParams.rightMargin = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479672c9);
            weImageView.setLayoutParams(marginLayoutParams);
            weImageView.setImageDrawable(m95.a.e(context.getResources(), com.tencent.mm.R.raw.icons_filled_star, 0.0f));
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478499j));
            weImageView.setTag(xk2Var);
            weImageView.setClickable(true);
            weImageView.setFocusable(true);
            weImageView.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.yr(weImageView, arrayList, this, s0Var, zk2Var, xk2Var, i17));
            linearLayout.addView(weImageView);
            arrayList.add(weImageView);
            s0Var2 = s0Var;
            i17 = i18;
        }
        java.lang.String string = zk2Var.getString(1);
        if (string == null) {
            string = "";
        }
        textView.setText(string);
    }

    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed v7(in5.s0 s0Var, yz5.l lVar) {
        java.lang.Object obj = s0Var.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null) {
            return null;
        }
        if (lVar != null) {
            lVar.invoke(baseFinderFeed);
        }
        return baseFinderFeed;
    }

    public final android.view.View x7(in5.s0 s0Var) {
        android.view.View inflate;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.fv6);
        if (p17 != null) {
            return p17;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) s0Var.p(com.tencent.mm.R.id.fv7);
        if (viewStub == null || (inflate = viewStub.inflate()) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "scoreLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC", "scoreLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return inflate;
    }

    public final void y7(in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.rq rqVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setShowState, showState=");
        sb6.append(rqVar);
        sb6.append(", holder=");
        sb6.append(V6(s0Var));
        sb6.append(", itemView=");
        android.view.View itemView = s0Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        sb6.append(W6(itemView));
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", sb6.toString());
        so2.j5 j5Var = (so2.j5) s0Var.f293125i;
        com.tencent.mm.plugin.finder.viewmodel.component.pq z76 = z7(s0Var);
        if (rqVar == com.tencent.mm.plugin.finder.viewmodel.component.rq.f135823d && z76.f135581a == com.tencent.mm.plugin.finder.viewmodel.component.rq.f135828i) {
            r45.zk2 zk2Var = z76.f135590j;
            if (zk2Var != null) {
                B7(s0Var, zk2Var, com.tencent.mm.plugin.finder.viewmodel.component.qq.f135731f);
            }
            z76.f135590j = null;
            z76.f135591k = null;
        }
        kotlin.jvm.internal.o.g(rqVar, "<set-?>");
        z76.f135581a = rqVar;
        D.put(java.lang.Long.valueOf(j5Var.getItemId()), z76);
    }

    public final com.tencent.mm.plugin.finder.viewmodel.component.pq z7(in5.s0 s0Var) {
        so2.j5 j5Var = (so2.j5) s0Var.f293125i;
        java.lang.Object obj = D.get(java.lang.Long.valueOf(j5Var.getItemId()));
        if (obj == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderNpsSurveyUIC", "showInfo not found feedId = " + T6(j5Var.getItemId()) + " return empty object");
            obj = new com.tencent.mm.plugin.finder.viewmodel.component.pq(com.tencent.mm.plugin.finder.viewmodel.component.rq.f135823d, 0L, 0, this.f134658n, null, null, null, null, null, null, null, null, 4086, null);
        }
        return (com.tencent.mm.plugin.finder.viewmodel.component.pq) obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f134652e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f134653f = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f134660p = true;
        this.f134661q = true;
        this.f134662r = true;
        this.f134663s = new java.util.concurrent.ConcurrentHashMap();
    }
}
