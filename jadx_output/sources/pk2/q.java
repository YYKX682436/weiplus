package pk2;

/* loaded from: classes3.dex */
public final class q extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356173h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356174i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f356175j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356173h = helper.f356097m0;
        this.f356174i = "";
        this.f356175j = kz5.c0.k(new pk2.n4(helper, i17), new pk2.y0(helper, i17), new pk2.w0(helper, i17), new pk2.b3(helper, i17), new pk2.t4(helper, i17));
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        com.tencent.mm.ui.MMActivity mMActivity = o9Var.f356078d;
        int i17 = (int) (mMActivity.getResources().getDisplayMetrics().heightPixels * 0.6d);
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(mMActivity);
        android.view.View inflate = android.view.LayoutInflater.from(mMActivity).inflate(com.tencent.mm.R.layout.e88, (android.view.ViewGroup) null);
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "showAnchorMoreCommentSettingPanel peekHeight:" + i17);
        if (o9Var.h()) {
            e3Var.g(inflate, new android.widget.FrameLayout.LayoutParams(-1, com.tencent.mm.plugin.finder.view.x7.b(mMActivity)));
        } else {
            if (i17 <= 0) {
                i17 = -1;
            }
            e3Var.g(inflate, new android.widget.FrameLayout.LayoutParams(-1, i17));
        }
        android.view.View view = e3Var.f131959f;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.jrn);
        if (findViewById != null) {
            findViewById.setOnClickListener(new pk2.p(e3Var));
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.odf);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        e3Var.c(true);
        e3Var.b();
        for (qk2.f fVar : this.f356175j) {
            qk2.d dVar = fVar instanceof qk2.d ? (qk2.d) fVar : null;
            if (dVar != null) {
                qk2.d.s(dVar, e3Var, null, 2, null);
            }
        }
        D(2);
        e3Var.i();
    }

    public final void D(int i17) {
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f328363m2, gVar.toString(), null, 4, null);
    }

    @Override // qk2.f
    public java.util.List g() {
        return this.f356175j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356174i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        int i17 = this.f356173h;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f493763oz1);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        t(menu, i17, string, com.tencent.mm.R.raw.article_regular, o9Var.f356078d.getResources().getColor(com.tencent.mm.R.color.FG_0));
        D(1);
    }

    @Override // qk2.h
    public int y() {
        return this.f356173h;
    }
}
