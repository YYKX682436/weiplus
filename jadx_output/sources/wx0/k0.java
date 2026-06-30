package wx0;

/* loaded from: classes5.dex */
public final class k0 extends mx0.a {

    /* renamed from: g, reason: collision with root package name */
    public wx0.h0 f450502g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView f450503h;

    /* renamed from: i, reason: collision with root package name */
    public volatile android.os.CountDownTimer f450504i;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f450505m;

    /* renamed from: n, reason: collision with root package name */
    public wx0.g0 f450506n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k0(android.view.ViewGroup r3, android.view.ViewGroup r4) {
        /*
            r2 = this;
            java.lang.String r0 = "sideToolbar"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "rootView"
            kotlin.jvm.internal.o.g(r4, r0)
            r0 = 2131299152(0x7f090b50, float:1.8216297E38)
            android.view.View r0 = r3.findViewById(r0)
            java.lang.String r1 = "findViewById(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            r2.<init>(r0)
            wx0.h0 r0 = wx0.h0.f450493d
            r2.f450502g = r0
            android.view.View r0 = r2.f331814d
            wx0.f0 r1 = new wx0.f0
            r1.<init>(r2, r3, r4)
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wx0.k0.<init>(android.view.ViewGroup, android.view.ViewGroup):void");
    }

    public final boolean b() {
        wx0.s0 flashControlPlugin;
        androidx.constraintlayout.widget.ConstraintLayout rootView;
        mx0.g3 recordPlugin;
        mx0.l favoritePlugin;
        mx0.g3 recordPlugin2;
        mx0.g3 recordPlugin3;
        this.f450505m = true;
        android.os.CountDownTimer countDownTimer = this.f450504i;
        if (countDownTimer == null) {
            return false;
        }
        countDownTimer.cancel();
        this.f450504i = null;
        wx0.g0 g0Var = this.f450506n;
        if (g0Var != null) {
            mx0.p4 p4Var = (mx0.p4) g0Var;
            int i17 = com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout.f69541d2;
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = p4Var.f332212c;
            kotlinx.coroutines.l.d(shootComposingPluginLayout.getScope(), null, null, new mx0.o4(shootComposingPluginLayout, null), 3, null);
            flashControlPlugin = shootComposingPluginLayout.getFlashControlPlugin();
            if (flashControlPlugin.f450540m == wx0.m0.f450512d) {
                ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) flashControlPlugin.f450538h).i1(false);
            }
            rootView = shootComposingPluginLayout.getRootView();
            rootView.removeView(p4Var.f332211b);
            recordPlugin = shootComposingPluginLayout.getRecordPlugin();
            recordPlugin.b(false);
            shootComposingPluginLayout.R0();
            favoritePlugin = shootComposingPluginLayout.getFavoritePlugin();
            favoritePlugin.c();
            recordPlugin2 = shootComposingPluginLayout.getRecordPlugin();
            recordPlugin2.reset();
            recordPlugin3 = shootComposingPluginLayout.getRecordPlugin();
            recordPlugin3.b(true);
        }
        return true;
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        if (this.f450504i != null) {
            b();
            return true;
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView selectorView = this.f450503h;
        if (selectorView != null) {
            return selectorView.a();
        }
        return false;
    }
}
