package com.tencent.mm.plugin.wallet_core.ui.cashier;

/* loaded from: classes9.dex */
public class WcPayCashierFingerprintDialog extends com.tencent.mm.ui.widget.dialog.k2 implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f180222d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f180223e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f180224f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f180225g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f180226h;

    /* renamed from: i, reason: collision with root package name */
    public et4.q0 f180227i;

    /* renamed from: m, reason: collision with root package name */
    public et4.r0 f180228m;

    public WcPayCashierFingerprintDialog(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494791wd);
        c();
    }

    public final void c() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f489641d94, null);
        this.f180222d = viewGroup;
        this.f180223e = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.ppc);
        this.f180224f = (android.widget.TextView) this.f180222d.findViewById(com.tencent.mm.R.id.ppd);
        this.f180225g = (android.widget.ImageView) this.f180222d.findViewById(com.tencent.mm.R.id.ppf);
        this.f180226h = (android.widget.TextView) this.f180222d.findViewById(com.tencent.mm.R.id.ppe);
        this.f180223e.setOnClickListener(new et4.m0(this));
        setContentView(this.f180222d);
        setCanceledOnTouchOutside(false);
        this.f180227i = new et4.q0(this);
        setOnCancelListener(new et4.k0(this));
        setOnDismissListener(new et4.l0(this));
    }

    public void e() {
        this.f180225g.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icons_outlined_pay_fingerprint_android, getContext().getResources().getColor(com.tencent.mm.R.color.FG_2)));
        this.f180226h.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.t_));
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public void onActivityDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierFingerprintDialog", "activity destroy");
        et4.q0 q0Var = this.f180227i;
        if (q0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierFingerprintDialog", "release fingerprint");
            q0Var.f256655c.cancel();
            ju5.n.c().b();
            q0Var.f256655c = null;
            this.f180227i = null;
        }
        this.f180223e = null;
        this.f180228m = null;
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public void onActivityPause() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierFingerprintDialog", "activity paused, release and dismiss");
        cancel();
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        et4.q0 q0Var = this.f180227i;
        q0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayCashierFingerprintDialog", "req fingerprint auth 2");
        re4.n.b();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 38);
        nz2.o oVar = (nz2.o) gm0.j1.s(nz2.o.class);
        nz2.f fVar = new nz2.f(q0Var.f256654b, 1);
        fVar.f341555c = q0Var.f256653a;
        oVar.z9(com.tencent.mm.sdk.platformtools.x2.f193071a, fVar, new et4.p0(q0Var));
    }

    public WcPayCashierFingerprintDialog(android.content.Context context, int i17) {
        super(context, com.tencent.mm.R.style.f494791wd);
        c();
    }
}
