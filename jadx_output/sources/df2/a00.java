package df2;

/* loaded from: classes3.dex */
public final class a00 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f229648m;

    /* renamed from: n, reason: collision with root package name */
    public st2.c f229649n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.j0 f229650o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.rfx.RfxPagFile f229651p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.rfx.RfxPagFile f229652q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a00(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f229648m = "ShopCouponBubbleController";
        this.f229650o = new androidx.lifecycle.j0(null);
    }

    public static final void Z6(df2.a00 a00Var) {
        android.view.ViewGroup targetLayout;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout c76 = a00Var.c7();
        if (c76 == null || (targetLayout = c76.getTargetLayout()) == null || (weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) targetLayout.findViewById(com.tencent.mm.R.id.odl)) == null) {
            return;
        }
        com.tencent.mm.view.MMPAGView b76 = a00Var.b7();
        weImageView.setImageBitmap(b76 != null ? b76.getBitmap() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab A[LOOP:0: B:28:0x00a5->B:30:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(df2.a00 r9, r45.xb2 r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.a00.a7(df2.a00, r45.xb2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.tencent.mm.view.MMPAGView b7() {
        android.view.View c76 = c7();
        if (c76 == null) {
            c76 = (android.view.ViewGroup) S6(com.tencent.mm.R.id.rp7);
        }
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) (c76 != null ? c76.findViewById(com.tencent.mm.R.id.f483053vc) : null);
        if (mMPAGView == null) {
            return null;
        }
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        mMPAGView.o(true);
        return mMPAGView;
    }

    public final com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout c7() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) S6(com.tencent.mm.R.id.rp7);
        android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        if (parent instanceof com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout) {
            return (com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout) parent;
        }
        return null;
    }

    public final void d7() {
        boolean a86 = ((mm2.c1) business(mm2.c1.class)).a8();
        java.lang.String str = this.f229648m;
        if (!a86) {
            com.tencent.mars.xlog.Log.i(str, "startPolling liveStarted:" + ((mm2.c1) business(mm2.c1.class)).a8());
            return;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.tb tbVar = dk2.ef.f233392k;
        tbVar.f(34);
        r45.wb2 wb2Var = new r45.wb2();
        com.tencent.mars.xlog.Log.i(str, "start polling with req " + wb2Var.toJSON());
        tbVar.e(45, wb2Var, new df2.vz(this, r45.xb2.class), false);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233392k.f(45);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        d7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        androidx.lifecycle.y yVar = pluginLayout instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) pluginLayout : null;
        java.lang.String str = this.f229648m;
        if (yVar == null) {
            com.tencent.mars.xlog.Log.e(str, pluginLayout + " is not owner");
            return;
        }
        try {
            com.tencent.mm.rfx.RfxPagFont.RegisterFont(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets(), "fonts/WeChatSansSS-Bold.ttf");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "register font failed", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout c76 = c7();
        if (c76 != null) {
            c76.b();
        }
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout c77 = c7();
        if (c77 != null) {
            c77.setOnClickListener(new df2.mz(this));
        }
        android.view.View T6 = T6(com.tencent.mm.R.id.rly, com.tencent.mm.R.id.rlx);
        if (T6 != null) {
            st2.c cVar = this.f229649n;
            if (cVar == null) {
                cVar = new st2.c(T6, this);
                cVar.f412239d = new df2.nz(this);
            }
            this.f229649n = cVar;
        }
        androidx.lifecycle.j0 j0Var = this.f229650o;
        j0Var.removeObservers(yVar);
        pm0.v.y(j0Var, yVar, new df2.pz(this));
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout c78 = c7();
        if (c78 != null) {
            c78.setSceneStateListener(new df2.uz(this));
        }
        d7();
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        com.tencent.mm.view.MMPAGView b76 = b7();
        if (b76 != null) {
            b76.n();
        }
        this.f229649n = null;
    }
}
