package df2;

/* loaded from: classes3.dex */
public final class sp extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231353m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f231354n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f231355o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f231356p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f231357q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f231358r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f231359s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f231360t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f231361u;

    /* renamed from: v, reason: collision with root package name */
    public int f231362v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f231363w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f231364x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231353m = "LivePkgGiftBubbleGuideViewController";
        this.f231362v = 8;
        this.f231363w = jz5.h.b(new df2.jp(this));
        this.f231364x = jz5.h.b(new df2.kp(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean Z6(df2.sp r13, r45.o35 r14) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.sp.Z6(df2.sp, r45.o35):boolean");
    }

    public static final void a7(df2.sp spVar) {
        df2.ip ipVar;
        androidx.lifecycle.j0 j0Var;
        androidx.lifecycle.j0 j0Var2;
        df2.ip ipVar2 = (df2.ip) spVar.controller(df2.ip.class);
        if (ipVar2 != null && (j0Var2 = ipVar2.f230420o) != null) {
            j0Var2.postValue(null);
        }
        df2.ip ipVar3 = (df2.ip) spVar.controller(df2.ip.class);
        if (ipVar3 != null && (j0Var = ipVar3.f230421p) != null) {
            j0Var.postValue(null);
        }
        android.view.View view = spVar.f231354n;
        java.lang.Object tag = view != null ? view.getTag() : null;
        r45.o35 o35Var = tag instanceof r45.o35 ? (r45.o35) tag : null;
        if (o35Var == null || (ipVar = (df2.ip) spVar.controller(df2.ip.class)) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(ipVar.f230418m, "[onBubbleTouchDismiss] info:" + pm0.b0.g(o35Var));
        ipVar.Z6();
    }

    public final boolean b7(android.view.View view) {
        android.view.View view2 = this.f231354n;
        if (view2 == null) {
            return false;
        }
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = b17.y;
        int i18 = b17.x;
        int i19 = (!U6() || com.tencent.mm.ui.bk.d0()) ? i17 : i18;
        int i27 = (!U6() || com.tencent.mm.ui.bk.d0()) ? i18 : i17;
        int[] t17 = pm0.v.t(view);
        int i28 = t17[0];
        if (i28 <= 0 || t17[1] <= 0) {
            return false;
        }
        int width = i28 + view.getWidth();
        int i29 = t17[1];
        float dimension = view2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        float dimension2 = view2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
        float f17 = (i19 - i29) - dimension;
        float dimension3 = (i27 - width) - view2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479731dn);
        if (dimension3 >= dimension2) {
            dimension2 = dimension3;
        }
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), (int) dimension2, (int) f17);
        android.view.View view3 = this.f231354n;
        android.widget.LinearLayout linearLayout = view3 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) view3 : null;
        if (linearLayout != null) {
            linearLayout.setGravity(85);
        }
        float width2 = ((i27 - dimension2) - width) + ((view.getWidth() / 2) - (view2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479688cn) / 2));
        android.view.View view4 = this.f231355o;
        java.lang.Object layoutParams = view4 != null ? view4.getLayoutParams() : null;
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.rightMargin = (int) width2;
            android.view.View view5 = this.f231355o;
            if (view5 != null) {
                view5.setLayoutParams(layoutParams2);
            }
        }
        if (zl2.q4.f473933a.E()) {
            com.tencent.mars.xlog.Log.i(this.f231353m, "targetView = " + view + ",targetViewLoc-x = " + t17[0] + ", screenHeightHardWare = " + i17 + ", screenWidthHardWare = " + i18 + ", targetViewRight = " + width + ", targetViewTop = " + i29 + ", paddingBottom = " + f17 + ", paddingEnd = " + dimension2 + ", ");
        }
        return true;
    }

    public final void c7(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f231353m, "[dismiss] scene = " + str);
        android.view.View view = this.f231354n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController", "dismiss", "(Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController", "dismiss", "(Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z17) {
            this.f231362v = 8;
        }
    }

    public final int d7(r45.o35 o35Var) {
        java.lang.Object obj;
        int e17 = c01.id.e();
        java.util.LinkedList list = o35Var.getList(3);
        kotlin.jvm.internal.o.f(list, "getBatch_list(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.ht3 ht3Var = (r45.ht3) obj;
            if (ht3Var.getLong(1) > 0 && ht3Var.getInteger(2) - e17 > 0) {
                break;
            }
        }
        r45.ht3 ht3Var2 = (r45.ht3) obj;
        if (ht3Var2 == null) {
            return -1;
        }
        int integer = (((ht3Var2.getInteger(2) - e17) / 60) / 60) / 24;
        if (integer < 1) {
            return 1;
        }
        return integer;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        android.view.ViewGroup J1;
        android.view.View view;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        super.onLiveMsg(r71Var);
        if (this.f231362v == 0) {
            com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) R6(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
            jz5.f0 f0Var = null;
            if (ag0Var != null && (J1 = ag0Var.J1()) != null) {
                if (!J1.isShown()) {
                    J1 = null;
                }
                if (J1 != null) {
                    if (b7(J1)) {
                        android.view.View view2 = this.f231354n;
                        if (!(view2 != null && view2.getVisibility() == 0)) {
                            df2.a9 a9Var = (df2.a9) controller(df2.a9.class);
                            if (!((a9Var == null || (liveMutableData = a9Var.A) == null) ? false : kotlin.jvm.internal.o.b(liveMutableData.getValue(), java.lang.Boolean.TRUE)) && (view = this.f231354n) != null) {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList.add(0);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController", "onLiveMsg", "(Lcom/tencent/mm/protocal/protobuf/FinderGetLiveMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LivePkgGiftBubbleGuideViewController", "onLiveMsg", "(Lcom/tencent/mm/protocal/protobuf/FinderGetLiveMsgResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                    } else {
                        c7("onLiveMsg", false);
                    }
                    f0Var = jz5.f0.f302826a;
                }
            }
            if (f0Var == null) {
                c7("onLiveMsg", true);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData2;
        androidx.lifecycle.j0 j0Var;
        androidx.lifecycle.j0 j0Var2;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        com.tencent.mars.xlog.Log.i(this.f231353m, "[onViewMount]");
        df2.ip ipVar = (df2.ip) controller(df2.ip.class);
        if (ipVar != null && (j0Var2 = ipVar.f230420o) != null) {
            j0Var2.observe((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout, new df2.mp(this));
        }
        df2.ip ipVar2 = (df2.ip) controller(df2.ip.class);
        if (ipVar2 != null && (j0Var = ipVar2.f230421p) != null) {
            j0Var.observe((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout, new df2.np(this));
        }
        df2.a9 a9Var = (df2.a9) controller(df2.a9.class);
        if (a9Var != null && (liveMutableData2 = a9Var.A) != null) {
            liveMutableData2.f111660d = true;
            liveMutableData2.observe((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout, new df2.op(this));
        }
        jf2.k0 k0Var = (jf2.k0) controller(jf2.k0.class);
        if (k0Var == null || (liveMutableData = k0Var.f299387v) == null) {
            return;
        }
        liveMutableData.f111660d = true;
        liveMutableData.observe((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout, new df2.pp(this));
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f231354n = null;
        this.f231355o = null;
        this.f231357q = null;
        this.f231356p = null;
        this.f231358r = null;
        this.f231359s = null;
        this.f231360t = null;
        this.f231361u = null;
    }
}
