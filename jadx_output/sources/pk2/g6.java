package pk2;

/* loaded from: classes3.dex */
public final class g6 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f355776h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355777i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f355778j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355776h = helper.f356071J;
        this.f355777i = "assistant.more.commentmanage";
        this.f355778j = kz5.c0.k(new pk2.h5(helper, i17), new pk2.v5(helper, i17), new pk2.z4(helper, i17));
        zl2.r4 r4Var = zl2.r4.f473950a;
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_MORE_COMMENT_SETTING_BOOLEAN_SYNC, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canShowAnchorMoreCommentSettingRedDot:");
        boolean z17 = !o17;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", sb6.toString());
        if (z17) {
            qk2.h.z(this, 24071, 0, null, false, 14, null);
        }
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        pk2.g8 g8Var;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
        int i17 = mMActivity.getResources().getDisplayMetrics().heightPixels;
        int i18 = (int) (i17 * 0.6d);
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(mMActivity);
        android.view.View inflate = android.view.LayoutInflater.from(mMActivity).inflate(com.tencent.mm.R.layout.ant, (android.view.ViewGroup) null);
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "showAnchorMoreCommentSettingPanel peekHeight:" + i18);
        if (o9Var.h()) {
            e3Var.g(inflate, new android.widget.FrameLayout.LayoutParams(i17, i17));
        } else {
            if (i18 <= 0) {
                i18 = -2;
            }
            e3Var.g(inflate, new android.widget.FrameLayout.LayoutParams(-1, i18));
        }
        e3Var.f131959f.findViewById(com.tencent.mm.R.id.jrn).setOnClickListener(new pk2.e6(e3Var));
        e3Var.c(true);
        e3Var.b();
        pk2.d9 d9Var = o9Var.f356082f;
        if (d9Var != null && (g8Var = d9Var.f355658a) != null) {
            ((pk2.k9) g8Var).c();
        }
        for (qk2.f fVar : this.f355778j) {
            qk2.d dVar = fVar instanceof qk2.d ? (qk2.d) fVar : null;
            if (dVar != null) {
                qk2.d.s(dVar, e3Var, null, 2, null);
            }
        }
        e3Var.f131968r = new pk2.f6(this);
        e3Var.i();
    }

    @Override // qk2.f
    public java.util.List g() {
        return this.f355778j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355777i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        zl2.r4 r4Var = zl2.r4.f473950a;
        com.tencent.mars.xlog.Log.i("FinderLiveUtil", "hasClickAnchorMoreCommentSettingRedDot");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SHOW_MORE_COMMENT_SETTING_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        int i17 = this.f355776h;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dwo);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        t(menu, i17, string, com.tencent.mm.R.raw.icons_outlined_live_chats, o9Var.f356078d.getResources().getColor(com.tencent.mm.R.color.FG_0));
    }

    @Override // qk2.h
    public int y() {
        return this.f355776h;
    }
}
