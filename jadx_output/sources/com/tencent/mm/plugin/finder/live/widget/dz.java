package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class dz extends com.tencent.mm.ui.widget.dialog.g2 {

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f118169e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f118170f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f118171g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f118172h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f118173i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f118174m;

    /* renamed from: n, reason: collision with root package name */
    public long f118175n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.ry f118176o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f118177p;

    /* renamed from: q, reason: collision with root package name */
    public int f118178q;

    /* renamed from: r, reason: collision with root package name */
    public dk2.xf f118179r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.l f118180s;

    /* renamed from: t, reason: collision with root package name */
    public long f118181t;

    public static final void i(com.tencent.mm.plugin.finder.live.widget.dz dzVar) {
        android.content.Context context;
        r45.q63 q63Var;
        if (dzVar.f118181t != 0) {
            return;
        }
        dzVar.f118181t = java.lang.System.currentTimeMillis();
        dk2.xf xfVar = dzVar.f118179r;
        if (xfVar != null) {
            android.view.View view = dzVar.f118169e;
            if (view == null || (context = view.getContext()) == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            android.content.Context context2 = context;
            com.tencent.mm.plugin.finder.live.plugin.l lVar = dzVar.f118180s;
            if (lVar != null) {
                mm2.e1 e1Var = (mm2.e1) lVar.P0(mm2.e1.class);
                com.tencent.mm.plugin.finder.live.plugin.l lVar2 = dzVar.f118180s;
                if (lVar2 != null) {
                    mm2.c1 c1Var = (mm2.c1) lVar2.P0(mm2.c1.class);
                    r45.n52 n52Var = new r45.n52();
                    r45.fr1 fr1Var = c1Var.M2;
                    n52Var.set(0, (fr1Var == null || (q63Var = (r45.q63) fr1Var.getCustom(7)) == null) ? null : q63Var.getString(1));
                    n52Var.set(1, java.lang.Integer.valueOf(dzVar.f118178q));
                    r45.xq1 xq1Var = c1Var.C2;
                    n52Var.set(2, xq1Var != null ? xq1Var.getString(2) : null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage", "doPayment " + c1Var.f328880s3 + ' ' + dzVar.f118178q + ' ' + n52Var.getString(0) + ' ' + n52Var.getString(2));
                    android.widget.ProgressBar progressBar = dzVar.f118174m;
                    if (!(progressBar != null && progressBar.getVisibility() == 0) && c1Var.f328880s3 < dzVar.f118178q) {
                        dzVar.f118181t = 0L;
                        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.bz(dzVar));
                        return;
                    }
                    zl2.r4 r4Var = zl2.r4.f473950a;
                    kotlin.jvm.internal.o.d(context2);
                    r4Var.h3(context2, true);
                    long j17 = e1Var.f328988r.getLong(0);
                    long j18 = e1Var.f328983m;
                    com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(n52Var.toByteArray());
                    kz5.p0 p0Var = kz5.p0.f313996d;
                    com.tencent.mm.plugin.finder.live.plugin.l lVar3 = dzVar.f118180s;
                    java.lang.String str = lVar3 != null ? ((mm2.e1) lVar3.P0(mm2.e1.class)).f328993w : null;
                    com.tencent.mm.plugin.finder.live.plugin.l lVar4 = dzVar.f118180s;
                    dk2.xf.d(xfVar, context2, j17, j18, null, 0, 0, null, "", 2, b17, p0Var, null, null, str, lVar4 != null ? ((mm2.e1) lVar4.P0(mm2.e1.class)).f328985o : null, new com.tencent.mm.plugin.finder.live.widget.sy(context2, n52Var, dzVar), 6144, null);
                }
            }
        }
    }

    public static final void r(com.tencent.mm.plugin.finder.live.widget.dz dzVar, boolean z17) {
        android.view.View view = dzVar.f118169e;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context instanceof androidx.fragment.app.FragmentActivity) {
            com.tencent.mm.ui.widget.dialog.y1 y1Var = dzVar.f211798d;
            if (y1Var != null) {
                y1Var.r(true);
            }
            dk2.xf xfVar = dzVar.f118179r;
            if (xfVar != null) {
                js4.k a17 = dk2.xf.a(xfVar, (androidx.fragment.app.FragmentActivity) context, z17 ? 12 : 11, 0, new com.tencent.mm.plugin.finder.live.widget.yy(dzVar), 4, null);
                if (a17 != null) {
                    ((ns4.s) a17).f339648m = new com.tencent.mm.plugin.finder.live.widget.zy(dzVar);
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.da9, (android.view.ViewGroup) null, false);
        inflate.findViewById(com.tencent.mm.R.id.enx).setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.ty(this));
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kso);
        if (textView != null) {
            hc2.o.a(textView, true);
        }
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.eyz);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.vy(this, context));
        }
        this.f118170f = inflate.findViewById(com.tencent.mm.R.id.f1m);
        this.f118172h = inflate.findViewById(com.tencent.mm.R.id.f1k);
        this.f118171g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f1o);
        this.f118173i = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.f1l);
        this.f118174m = (android.widget.ProgressBar) inflate.findViewById(com.tencent.mm.R.id.f1n);
        inflate.findViewById(com.tencent.mm.R.id.f1l).setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.wy(this));
        this.f118169e = inflate;
        return inflate;
    }

    @Override // com.tencent.mm.ui.widget.dialog.g2
    public void g() {
        this.f118181t = 0L;
        android.view.View view = this.f118169e;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kso) : null;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(this.f118178q));
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f118175n = currentTimeMillis;
        dk2.xf xfVar = this.f118179r;
        if (xfVar != null) {
            ((dk2.r4) xfVar).T(currentTimeMillis, new com.tencent.mm.plugin.finder.live.widget.cz(this));
        }
    }
}
