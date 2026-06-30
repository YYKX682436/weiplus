package cw1;

/* loaded from: classes12.dex */
public final class l6 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f223106a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f223107b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f223108c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f223109d;

    /* renamed from: e, reason: collision with root package name */
    public int f223110e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.y1 f223111f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.loading.MMProgressLoading f223112g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f223113h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f223114i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f223115j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.View f223116k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View f223117l;

    /* renamed from: m, reason: collision with root package name */
    public final yv1.g1 f223118m;

    /* renamed from: n, reason: collision with root package name */
    public final long f223119n;

    /* renamed from: o, reason: collision with root package name */
    public final int f223120o;

    /* renamed from: p, reason: collision with root package name */
    public long f223121p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.wcdb.support.CancellationSignal f223122q;

    public l6(android.content.Context context, boolean z17, int i17, yz5.l callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f223106a = context;
        this.f223107b = z17;
        this.f223108c = callback;
        this.f223109d = "";
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
        this.f223111f = y1Var;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e2x, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.lbl);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f223112g = (com.tencent.mm.ui.widget.loading.MMProgressLoading) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f485406u73);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f223113h = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.oqh);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f223114i = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.oqc);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f223115j = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.f483507sn2);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f223116k = findViewById5;
        findViewById5.setOnClickListener(new cw1.d6(this));
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.sm7);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f223117l = findViewById6;
        findViewById6.setOnClickListener(new cw1.e6(this));
        y1Var.k(inflate);
        yv1.g1 b17 = yv1.g1.f466040p.b(i17);
        this.f223118m = b17;
        this.f223119n = z17 ? b17.f466049h : b17.f466047f;
        this.f223120o = z17 ? b17.f466050i : b17.f466048g;
    }

    public static final boolean a(cw1.l6 l6Var) {
        l6Var.getClass();
        if (j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageOtherResAndAccSeparating()) > 0) {
            return j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageForceInterceptCleanTask()) > 0;
        }
        return false;
    }

    public static final void b(cw1.l6 l6Var) {
        l6Var.f223112g.setVisibility(8);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = l6Var.f223113h;
        weImageView.setVisibility(0);
        weImageView.s(com.tencent.mm.R.raw.checkmark_circle_filled, com.tencent.mm.R.color.Brand_100);
        android.content.Context context = l6Var.f223106a;
        l6Var.f223114i.setText(context.getString(com.tencent.mm.R.string.d1f));
        long j17 = l6Var.f223119n;
        l6Var.f223115j.setText(context.getString(com.tencent.mm.R.string.f490917d74, fp.n0.a(j17)));
        android.view.View view = l6Var.f223116k;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog", "onFinished", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog", "onFinished", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = l6Var.f223117l;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog", "onFinished", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanHalfBottomDialog", "onFinished", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (l6Var.f223109d.length() > 0) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            java.lang.String str = l6Var.f223109d;
            jz5.l[] lVarArr = new jz5.l[5];
            lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(aw1.v.c() ? 2 : 1));
            lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(l6Var.f223110e));
            lVarArr[2] = new jz5.l("removed_size_byte", java.lang.Long.valueOf(j17));
            lVarArr[3] = new jz5.l("cache_removed_size", java.lang.Long.valueOf(j17));
            lVarArr[4] = new jz5.l("storage_manage_sessionid", l6Var.f223118m.f466043b);
            ((cy1.a) rVar).Hj(str, "view_exp", kz5.c1.k(lVarArr), 32903);
        }
    }

    public static final void c(cw1.l6 l6Var, long j17, int i17) {
        int i18;
        yv1.h1.f(2, l6Var.f223122q);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        if (i17 <= 0 || currentTimeMillis <= 0 || (i18 = l6Var.f223120o) <= 0) {
            return;
        }
        float f17 = i17 / ((float) currentTimeMillis);
        int i19 = (int) (((l6Var.f223120o - i17) / f17) / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
        ((ku5.t0) ku5.t0.f312615d).B(new cw1.k6(l6Var, e06.p.f((i17 * 100) / i18, 0, 100), i19 >= 0 ? i19 : 0));
    }
}
