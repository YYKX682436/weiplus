package n34;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI f334700a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f334701b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f334702c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f334703d;

    /* renamed from: e, reason: collision with root package name */
    public n34.o2 f334704e;

    /* renamed from: f, reason: collision with root package name */
    public n34.p2 f334705f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f334706g;

    public p(com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI detailUI) {
        kotlin.jvm.internal.o.g(detailUI, "detailUI");
        this.f334700a = detailUI;
        this.f334701b = jz5.h.b(new n34.o(this));
        this.f334702c = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
    }

    public final void a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doChangeStar", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        kotlinx.coroutines.r2 r2Var = this.f334703d;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CommentDetailStarHelper", "the last job is no finish，ignore");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doChangeStar", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            return;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsFirstSettingShow", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
            boolean z17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_STAR_SETTING_TEACH_SHOW_INT, 0) == 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarConfig", "getSnsFirstSettingShow >> " + z17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsFirstSettingShow", "com.tencent.mm.plugin.sns.ui.config.SnsStarConfig");
            if (z17) {
                n34.o4.f334697a.a(this.f334700a, new n34.i(this, snsInfo, i17, i18));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doChangeStar", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
            }
        }
        b(snsInfo, i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doChangeStar", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
    }

    public final void b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doChangeStarInternal", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        java.lang.String snsId = snsInfo.getSnsId();
        long n17 = com.tencent.mm.plugin.sns.storage.w2.n(snsId);
        com.tencent.mars.xlog.Log.i("MicroMsg.CommentDetailStarHelper", "feedId: " + ca4.z0.t0(n17) + ", action: " + i17);
        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = this.f334700a;
        com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(snsCommentDetailUI, snsCommentDetailUI.getString(com.tencent.mm.R.string.f493243jf1), false, 0, null);
        n34.p2 p2Var = this.f334705f;
        if (p2Var != null) {
            p2Var.e(i17);
        }
        this.f334703d = kotlinx.coroutines.l.d(this.f334702c, null, null, new n34.l(i17, n17, snsId, snsInfo, this, f17, i18, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doChangeStarInternal", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
    }

    public final com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDetailUI", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDetailUI", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        return this.f334700a;
    }

    public final android.view.View d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarIcon", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        java.lang.Object value = this.f334701b.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarIcon", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        return view;
    }
}
