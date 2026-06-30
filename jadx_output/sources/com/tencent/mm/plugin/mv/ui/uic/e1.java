package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class e1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.f5 f151106d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.uniComments.c2 f151107e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.view.h2 f151108f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.view.e4 f151109g;

    /* renamed from: h, reason: collision with root package name */
    public final pk4.u f151110h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f151111i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f151108f = new com.tencent.mm.plugin.mv.ui.view.h2(getContext());
        this.f151109g = new com.tencent.mm.plugin.mv.ui.view.e4(activity, new com.tencent.mm.plugin.mv.ui.uic.d1(activity));
        jz5.h.b(com.tencent.mm.plugin.mv.ui.uic.z0.f151560d);
        this.f151110h = new com.tencent.mm.plugin.mv.ui.uic.c1(this, activity);
        this.f151111i = new java.util.HashMap();
    }

    public final void O6(java.lang.String username, boolean z17) {
        java.lang.Integer valueOf;
        kotlin.jvm.internal.o.g(username, "username");
        if (z17) {
            r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(getContext(), 7, r45.bt4.class);
            valueOf = bt4Var != null ? java.lang.Integer.valueOf(bt4Var.f371052w + 1) : null;
            r45.bt4 bt4Var2 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(getContext(), 7, r45.bt4.class);
            if (bt4Var2 != null) {
                bt4Var2.f371052w = valueOf.intValue();
            }
        } else {
            r45.bt4 bt4Var3 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(getContext(), 7, r45.bt4.class);
            valueOf = bt4Var3 != null ? java.lang.Integer.valueOf(bt4Var3.f371053x + 1) : null;
            r45.bt4 bt4Var4 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(getContext(), 7, r45.bt4.class);
            if (bt4Var4 != null) {
                bt4Var4.f371053x = valueOf.intValue();
            }
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", username);
        intent.putExtra("report_scene", 19);
        intent.putExtra("key_enter_profile_type", 1);
        intent.putExtra("key_not_request_focus", true);
        intent.putExtra("key_hide_float_ball", true);
        intent.putExtra("key_from_comment_scene", 91);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(7, 2, 32, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.w(getActivity(), intent);
    }

    public final void P6() {
        if (this.f151106d == null) {
            com.tencent.mm.plugin.finder.view.d5 d5Var = com.tencent.mm.plugin.finder.view.f5.f132064i;
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            android.view.View decorView = getActivity().getWindow().getDecorView();
            kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
            this.f151106d = d5Var.b((com.tencent.mm.ui.MMActivity) activity, decorView, 2, false, 70);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q6(fm3.u r24, long r25, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback r27) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.e1.Q6(fm3.u, long, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$CloseDrawerCallback):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mm.plugin.finder.view.f5 f5Var = this.f151106d;
        if (!(f5Var != null && f5Var.b())) {
            return false;
        }
        com.tencent.mm.plugin.finder.view.f5 f5Var2 = this.f151106d;
        if (f5Var2 != null) {
            f5Var2.a();
        }
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        P6();
        if (this.f151107e == null) {
            int i17 = com.tencent.mm.plugin.finder.uniComments.c2.f130213a;
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
            android.view.View decorView = getActivity().getWindow().getDecorView();
            kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
            mMActivity.getWindow().setSoftInputMode(50);
            com.tencent.mm.plugin.finder.uniComments.c2 c2Var = new com.tencent.mm.plugin.finder.uniComments.c2(2, false, null, 4, null);
            int i18 = com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer.R;
            com.tencent.mm.plugin.finder.uniComments.a5 a5Var = new com.tencent.mm.plugin.finder.uniComments.a5(new com.tencent.mm.plugin.finder.uniComments.q3(mMActivity));
            com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer uniCommentDrawer = new com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer(mMActivity);
            android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i19 = b17.x;
            int i27 = b17.y;
            java.lang.System.nanoTime();
            boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!z17) {
                if (i27 >= i19) {
                    i19 = i27;
                }
                i27 = i19;
            }
            uniCommentDrawer.setTopOffset((int) (i27 * 0.25d));
            android.content.Context context = uniCommentDrawer.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            a5Var.f130198q = context;
            uniCommentDrawer.setId(com.tencent.mm.R.id.ean);
            a5Var.f130192h = uniCommentDrawer;
            uniCommentDrawer.setSquaresBackgroundResource(com.tencent.mm.R.drawable.f481541w3);
            uniCommentDrawer.setEnableClickBackgroundToCloseDrawer(true);
            uniCommentDrawer.h(a5Var);
            a5Var.h().setScene(2);
            a5Var.h().setSelfProfile(a5Var.h().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String() == 1);
            com.tencent.mm.plugin.finder.uniComments.g2 g2Var = a5Var.f130188d;
            com.tencent.mm.plugin.finder.uniComments.q3 q3Var = g2Var instanceof com.tencent.mm.plugin.finder.uniComments.q3 ? (com.tencent.mm.plugin.finder.uniComments.q3) g2Var : null;
            if (q3Var != null) {
                q3Var.f130368e = 70;
            }
            kotlin.jvm.internal.o.e(g2Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter");
            ((com.tencent.mm.plugin.finder.uniComments.q3) g2Var).f130382v = false;
            decorView.post(new com.tencent.mm.plugin.finder.uniComments.e2(mMActivity, decorView, uniCommentDrawer, new android.widget.FrameLayout.LayoutParams(-1, -1), a5Var, false));
            this.f151107e = c2Var;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.view.f5 f5Var = this.f151106d;
        if (f5Var != null) {
            f5Var.a();
        }
    }
}
