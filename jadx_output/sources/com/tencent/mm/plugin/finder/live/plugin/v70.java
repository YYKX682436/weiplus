package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class v70 extends com.tencent.mm.plugin.finder.live.plugin.l {
    public static final float W = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f479723df);
    public final android.widget.TextView A;
    public final android.view.View B;
    public com.tencent.mm.ui.widget.dialog.k0 C;
    public final com.tencent.mm.plugin.finder.live.plugin.a70 D;
    public final androidx.recyclerview.widget.LinearLayoutManager E;
    public com.tencent.mm.sdk.platformtools.b4 F;
    public final java.util.List G;
    public final java.util.List H;
    public final com.tencent.mm.plugin.finder.live.plugin.p70 I;

    /* renamed from: J, reason: collision with root package name */
    public final android.animation.AnimatorSet f114681J;
    public final android.animation.ObjectAnimator K;
    public final android.animation.ObjectAnimator L;
    public final android.animation.ObjectAnimator M;
    public java.util.List N;
    public final java.util.function.Consumer P;
    public int Q;
    public final android.os.Handler R;
    public java.lang.Runnable S;
    public java.lang.Runnable T;
    public com.tencent.mm.ui.widget.dialog.k0 U;
    public kotlinx.coroutines.r2 V;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f114682p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.gp0 f114683q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 f114684r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f114685s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.ViewGroup f114686t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f114687u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.ViewGroup f114688v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f114689w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f114690x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout f114691y;

    /* renamed from: z, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f114692z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(final android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114682p = statusMonitor;
        this.f114683q = com.tencent.mm.plugin.finder.live.plugin.gp0.f112724d;
        this.f114684r = (com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2) root.findViewById(com.tencent.mm.R.id.tik);
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.tnx);
        this.f114685s = findViewById;
        this.f114686t = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.f484792to2);
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.f484791to1);
        this.f114687u = findViewById2;
        this.f114688v = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.tny);
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.f484795to5);
        this.f114689w = findViewById3;
        this.f114690x = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f484790to0);
        com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout finderLiveInterceptRelativeLayout = (com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout) root.findViewById(com.tencent.mm.R.id.to6);
        this.f114691y = finderLiveInterceptRelativeLayout;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) root.findViewById(com.tencent.mm.R.id.fjo);
        this.f114692z = recyclerView;
        android.widget.TextView textView = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.fjp);
        this.A = textView;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.fjr);
        this.B = findViewById4;
        com.tencent.mm.plugin.finder.live.plugin.a70 a70Var = new com.tencent.mm.plugin.finder.live.plugin.a70();
        this.D = a70Var;
        final android.content.Context context = root.getContext();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(context) { // from class: com.tencent.mm.plugin.finder.live.plugin.FinderLiveRandomMatchLinkMicStatePlugin$layoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView2, androidx.recyclerview.widget.h3 h3Var, int i17) {
                com.tencent.mm.plugin.finder.live.plugin.n70 n70Var = new com.tencent.mm.plugin.finder.live.plugin.n70(root.getContext());
                n70Var.f12049a = i17;
                startSmoothScroll(n70Var);
            }
        };
        this.E = linearLayoutManager;
        this.G = new java.util.ArrayList();
        this.H = new java.util.ArrayList();
        this.I = new com.tencent.mm.plugin.finder.live.plugin.p70(this);
        this.f114681J = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(textView, (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f).setDuration(300L);
        kotlin.jvm.internal.o.f(duration, "setDuration(...)");
        this.K = duration;
        android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(findViewById4, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_X, 0.11f, 1.0f).setDuration(400L);
        kotlin.jvm.internal.o.f(duration2, "setDuration(...)");
        this.L = duration2;
        android.animation.ObjectAnimator duration3 = android.animation.ObjectAnimator.ofFloat(findViewById4, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.SCALE_Y, 0.11f, 1.0f).setDuration(400L);
        kotlin.jvm.internal.o.f(duration3, "setDuration(...)");
        this.M = duration3;
        this.P = new com.tencent.mm.plugin.finder.live.plugin.d70(this);
        this.R = new android.os.Handler(android.os.Looper.getMainLooper());
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.x60(this));
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.y60(this));
        findViewById3.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.z60(this));
        recyclerView.setAdapter(a70Var);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.requestDisallowInterceptTouchEvent(false);
        finderLiveInterceptRelativeLayout.setNeedInterceptTouchEvent(true);
        java.util.Iterator it = kz5.c0.i(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cim), java.lang.Integer.valueOf(com.tencent.mm.R.drawable.civ), java.lang.Integer.valueOf(com.tencent.mm.R.drawable.ciw), java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cix), java.lang.Integer.valueOf(com.tencent.mm.R.drawable.ciy), java.lang.Integer.valueOf(com.tencent.mm.R.drawable.ciz), java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481772cj0), java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481773cj1), java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cin), java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cio), java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cip), java.lang.Integer.valueOf(com.tencent.mm.R.drawable.ciq), java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cir), java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cis), java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cit), java.lang.Integer.valueOf(com.tencent.mm.R.drawable.ciu)).iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            com.tencent.mm.plugin.finder.live.plugin.b70 b70Var = new com.tencent.mm.plugin.finder.live.plugin.b70(null, null, 3, null);
            android.content.res.Resources resources = this.f365323d.getContext().getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(intValue));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "getDefaultAvatarBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "getDefaultAvatarBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            float f17 = W;
            int i17 = (int) f17;
            android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(decodeResource, i17, i17, true);
            kotlin.jvm.internal.o.f(createScaledBitmap, "createScaledBitmap(...)");
            android.graphics.Bitmap s07 = com.tencent.mm.sdk.platformtools.x.s0(createScaledBitmap, false, f17 * 0.5f);
            kotlin.jvm.internal.o.f(s07, "getRoundedCornerBitmap(...)");
            b70Var.f111982a = s07;
            this.G.add(b70Var);
        }
        u1();
        android.view.animation.OvershootInterpolator overshootInterpolator = new android.view.animation.OvershootInterpolator();
        android.animation.ObjectAnimator objectAnimator = this.L;
        objectAnimator.setInterpolator(overshootInterpolator);
        android.view.animation.OvershootInterpolator overshootInterpolator2 = new android.view.animation.OvershootInterpolator();
        android.animation.ObjectAnimator objectAnimator2 = this.M;
        objectAnimator2.setInterpolator(overshootInterpolator2);
        android.animation.AnimatorSet animatorSet = this.f114681J;
        animatorSet.play(objectAnimator).with(objectAnimator2).after(this.K);
        animatorSet.addListener(new com.tencent.mm.plugin.finder.live.plugin.l70(this));
        objectAnimator.addListener(new com.tencent.mm.plugin.finder.live.plugin.m70(this));
        mm2.o4 o4Var = (mm2.o4) P0(mm2.o4.class);
        java.util.function.Consumer consumer = this.P;
        com.tencent.mm.plugin.finder.live.util.b0 b0Var = o4Var.f329323r;
        if (consumer != null) {
            ((java.util.ArrayList) b0Var.f115444d).add(consumer);
        } else {
            b0Var.getClass();
        }
        android.view.ViewGroup viewGroup = this.f365323d;
        int i18 = (com.tencent.mm.ui.bl.b(viewGroup.getContext()).x / 3) * 2;
        int a17 = com.tencent.mm.ui.zk.a(viewGroup.getContext(), 152);
        a17 = zl2.r4.f473950a.t1(S0()) ? a17 + com.tencent.mm.ui.zk.a(viewGroup.getContext(), 32) : a17;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "getDefaultY: " + a17);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.tim);
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.til);
        android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.tij);
        kotlin.jvm.internal.o.d(viewGroup2);
        kotlin.jvm.internal.o.d(viewGroup3);
        kotlin.jvm.internal.o.d(viewGroup4);
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 finderLiveFloatContainerV2 = this.f114684r;
        finderLiveFloatContainerV2.getClass();
        finderLiveFloatContainerV2.f115875f = i18;
        finderLiveFloatContainerV2.f115876g = a17;
        finderLiveFloatContainerV2.f115877h = false;
        finderLiveFloatContainerV2.f115890x = viewGroup2;
        finderLiveFloatContainerV2.f115891y = viewGroup3;
        finderLiveFloatContainerV2.f115892z = viewGroup4;
        java.lang.Object parent = finderLiveFloatContainerV2.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null && finderLiveFloatContainerV2.C == null) {
            com.tencent.mm.plugin.finder.live.view.a5 a5Var = new com.tencent.mm.plugin.finder.live.view.a5(finderLiveFloatContainerV2);
            finderLiveFloatContainerV2.C = a5Var;
            view.addOnLayoutChangeListener(a5Var);
        }
        finderLiveFloatContainerV2.h(false, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        android.view.View.OnLayoutChangeListener onLayoutChangeListener;
        super.O0();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.F;
        if (b4Var != null) {
            b4Var.d();
        }
        this.F = null;
        this.f114692z.V0(this.I);
        this.f114681J.cancel();
        java.lang.Runnable runnable = this.S;
        if (runnable != null) {
            this.R.removeCallbacks(runnable);
            this.S = null;
        }
        ((java.util.ArrayList) ((mm2.o4) P0(mm2.o4.class)).f329323r.f115444d).remove(this.P);
        com.tencent.mm.plugin.finder.live.view.FinderLiveFloatContainerV2 finderLiveFloatContainerV2 = this.f114684r;
        finderLiveFloatContainerV2.b();
        android.animation.ValueAnimator valueAnimator = finderLiveFloatContainerV2.f115887u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        finderLiveFloatContainerV2.f115887u = null;
        java.lang.Object parent = finderLiveFloatContainerV2.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            view.setTouchDelegate(null);
        }
        finderLiveFloatContainerV2.A = null;
        finderLiveFloatContainerV2.B = null;
        java.lang.Object parent2 = finderLiveFloatContainerV2.getParent();
        android.view.View view2 = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
        if (view2 != null && (onLayoutChangeListener = finderLiveFloatContainerV2.C) != null) {
            view2.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        finderLiveFloatContainerV2.C = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void t1() {
        java.lang.Runnable runnable = this.T;
        if (runnable != null) {
            this.R.removeCallbacks(runnable);
            this.T = null;
        }
    }

    public final void u1() {
        java.util.List<java.lang.String> list;
        java.util.List list2 = this.H;
        list2.clear();
        java.util.List list3 = this.N;
        int i17 = 0;
        if (list3 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list3, 10));
            java.util.Iterator it = list3.iterator();
            while (it.hasNext()) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.xn1) it.next()).getCustom(0);
                arrayList.add(finderContact != null ? finderContact.getHeadUrl() : null);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) obj)) {
                    arrayList2.add(obj);
                }
            }
            list = kz5.n0.K0(arrayList2, 10);
        } else {
            list = null;
        }
        if (list != null) {
            for (java.lang.String str : list) {
                com.tencent.mm.plugin.finder.live.plugin.b70 b70Var = new com.tencent.mm.plugin.finder.live.plugin.b70(null, null, 3, null);
                b70Var.f111983b = str;
                list2.add(b70Var);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("genCurrentDataList: realAvatarList size:");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", sb6.toString());
        if (list2.size() >= 10) {
            return;
        }
        c06.d dVar = c06.e.f37716d;
        java.util.List list4 = this.G;
        int e17 = dVar.e(0, list4.size());
        int size = 10 - list2.size();
        while (i17 < size) {
            list2.add(list4.get(e17 % list4.size()));
            i17++;
            e17++;
        }
        com.tencent.mm.plugin.finder.live.plugin.a70 a70Var = this.D;
        a70Var.getClass();
        kotlin.jvm.internal.o.g(list2, "list");
        java.util.ArrayList arrayList3 = (java.util.ArrayList) a70Var.f111819d;
        arrayList3.clear();
        arrayList3.addAll(list2);
    }

    public final void v1() {
        int size = ((mm2.o4) P0(mm2.o4.class)).f329324s.size();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "onAnimationEnd anchorMicNum:" + size);
        if (size > 0) {
            x1(com.tencent.mm.plugin.finder.live.plugin.gp0.f112727g, null);
        } else {
            x1(com.tencent.mm.plugin.finder.live.plugin.gp0.f112726f, null);
        }
    }

    public final void w1() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "quitChatMode");
        ((mm2.o4) P0(mm2.o4.class)).f329330x0 = false;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "hideStatePanel");
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.k70(this));
    }

    public final void x1(com.tencent.mm.plugin.finder.live.plugin.gp0 targetState, java.util.List list) {
        kotlin.jvm.internal.o.g(targetState, "targetState");
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.q70(this, targetState, list));
    }

    public final void y1(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "stopMatch: headUrl:" + str);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.F;
        if (b4Var != null) {
            b4Var.d();
        }
        int size = this.H.size();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = this.E;
        int w17 = linearLayoutManager.w();
        int w18 = linearLayoutManager.w() % size;
        int i17 = w18 == 0 ? size - 1 : w18 - 1;
        com.tencent.mm.plugin.finder.live.plugin.b70 b70Var = new com.tencent.mm.plugin.finder.live.plugin.b70(null, null, 3, null);
        b70Var.f111983b = str;
        com.tencent.mm.plugin.finder.live.plugin.a70 a70Var = this.D;
        a70Var.getClass();
        if (i17 >= 0) {
            java.util.ArrayList arrayList = (java.util.ArrayList) a70Var.f111819d;
            if (i17 < arrayList.size()) {
                arrayList.set(i17, b70Var);
            }
        }
        int i18 = (w17 + size) - 1;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f114692z;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "stopMatch", "(Ljava/lang/String;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "stopMatch", "(Ljava/lang/String;)V", "Undefined", "smoothScrollToPosition", "(I)V");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "firstPosition:" + w17 + ", targetPosition:" + i18 + " listSize:" + size);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "realFirstPosition:" + w18 + ", realInsertPosition:" + i17 + ", realTargetPosition:" + (i18 % size));
        this.f114692z.i(this.I);
    }
}
