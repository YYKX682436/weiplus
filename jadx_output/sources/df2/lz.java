package df2;

/* loaded from: classes3.dex */
public final class lz extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230730m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f230731n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f230732o;

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.r2 f230733p;

    /* renamed from: q, reason: collision with root package name */
    public r45.aq4 f230734q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f230735r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230730m = "ShareDiscountBubbleController";
        this.f230731n = "finder_live_has_open_discount_page_" + gm0.m.i();
        this.f230732o = "finder_live_has_open_discount_page_prefix_";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(df2.lz r19, r45.aq4 r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.lz.Z6(df2.lz, r45.aq4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.tencent.mm.view.MMPAGView a7() {
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById(com.tencent.mm.R.id.f483053vc);
        if (mMPAGView == null) {
            return null;
        }
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        mMPAGView.o(ae2.in.f3688a.a(ym5.f6.J1));
        return mMPAGView;
    }

    public final com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout b7() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) S6(com.tencent.mm.R.id.r6v);
        android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        if (parent instanceof com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout) {
            return (com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout) parent;
        }
        return null;
    }

    public final android.widget.TextView c7() {
        return (android.widget.TextView) findViewById(com.tencent.mm.R.id.nhh);
    }

    public final void d7(r45.aq4 aq4Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String string;
        l81.b1 b1Var = new l81.b1();
        r45.c33 c33Var = (r45.c33) aq4Var.getCustom(5);
        java.lang.String str3 = "";
        if (c33Var == null || (str = c33Var.getString(0)) == null) {
            str = "";
        }
        b1Var.f317014b = str;
        r45.c33 c33Var2 = (r45.c33) aq4Var.getCustom(5);
        if (c33Var2 == null || (str2 = c33Var2.getString(1)) == null) {
            str2 = "";
        }
        b1Var.f317022f = str2;
        r45.c33 c33Var3 = (r45.c33) aq4Var.getCustom(5);
        if (c33Var3 != null && (string = c33Var3.getString(2)) != null) {
            str3 = string;
        }
        b1Var.f317012a = str3;
        b1Var.H = k91.z3.TRANSPARENT;
        k91.y3 y3Var = k91.y3.DISABLED;
        b1Var.S = y3Var;
        b1Var.T = y3Var;
        b1Var.f317032k = 1177;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(O6(), b1Var);
    }

    public final void e7(java.lang.String str, int i17, ym5.w1 w1Var) {
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.iz(this, str, i17, w1Var, null), 3, null);
    }

    public final void f7() {
        boolean a86 = ((mm2.c1) business(mm2.c1.class)).a8();
        java.lang.String str = this.f230730m;
        if (!a86) {
            com.tencent.mars.xlog.Log.i(str, "startPolling liveStarted:" + ((mm2.c1) business(mm2.c1.class)).a8());
            return;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.tb tbVar = dk2.ef.f233392k;
        tbVar.f(34);
        r45.mt1 mt1Var = new r45.mt1();
        mt1Var.set(0, ((mm2.c1) business(mm2.c1.class)).f328852o);
        mt1Var.set(1, java.lang.Long.valueOf(((mm2.e1) business(mm2.e1.class)).f328983m));
        mt1Var.set(2, ((mm2.f6) business(mm2.f6.class)).C1);
        mt1Var.set(3, java.lang.Boolean.valueOf(this.f230735r));
        mt1Var.set(4, java.lang.Integer.valueOf((((mm2.f6) business(mm2.f6.class)).C1.length() == 0 ? 1 : 0) ^ 1));
        com.tencent.mars.xlog.Log.i(str, "start polling with req " + mt1Var.toJSON());
        tbVar.e(34, mt1Var, new df2.kz(this, r45.nt1.class), true);
    }

    public final android.view.View findViewById(int i17) {
        android.view.View b76 = b7();
        if (b76 == null) {
            b76 = (android.view.ViewGroup) S6(com.tencent.mm.R.id.r6v);
        }
        if (b76 != null) {
            return b76.findViewById(i17);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233392k.f(34);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        f7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        java.lang.String str;
        android.content.Intent intent;
        android.content.Intent intent2;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        com.tencent.mm.ui.MMActivity N6 = N6();
        if (N6 == null || (intent2 = N6.getIntent()) == null || (str = intent2.getStringExtra("KEY_ENTER_LIVE_PARAM_DISCOUNT_ACTIVITY_KEY")) == null) {
            str = "";
        }
        com.tencent.mm.ui.MMActivity N62 = N6();
        if (N62 != null && (intent = N62.getIntent()) != null) {
            intent.putExtra("KEY_ENTER_LIVE_PARAM_DISCOUNT_ACTIVITY_KEY", "");
        }
        boolean z17 = str.length() > 0;
        java.lang.String str2 = this.f230730m;
        if (z17) {
            mm2.f6 f6Var = (mm2.f6) business(mm2.f6.class);
            f6Var.getClass();
            f6Var.C1 = str;
            this.f230735r = true;
            com.tencent.mars.xlog.Log.i(str2, "enter live with activity key ".concat(str));
        }
        f7();
        if ((pluginLayout instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) pluginLayout : null) == null) {
            com.tencent.mars.xlog.Log.e(str2, pluginLayout + " is not owner");
            return;
        }
        pm0.v.y(((mm2.f6) business(mm2.f6.class)).B1, (androidx.lifecycle.y) pluginLayout, new df2.ez(this));
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout b76 = b7();
        if (b76 != null) {
            b76.setSceneStateListener(new df2.hz(this));
        }
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout b77 = b7();
        if (b77 != null) {
            b77.b();
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        com.tencent.mm.view.MMPAGView a76 = a7();
        if (a76 != null) {
            a76.n();
        }
        kotlinx.coroutines.r2 r2Var = this.f230733p;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233392k.f(34);
    }
}
