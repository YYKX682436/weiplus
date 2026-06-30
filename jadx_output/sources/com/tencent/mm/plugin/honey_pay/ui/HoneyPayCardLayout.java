package com.tencent.mm.plugin.honey_pay.ui;

/* loaded from: classes9.dex */
public class HoneyPayCardLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f142280d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f142281e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f142282f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletTextView f142283g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f142284h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f142285i;

    public HoneyPayCardLayout(android.content.Context context) {
        super(context);
        a();
    }

    public final void a() {
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.bji, this);
        this.f142280d = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.h2m);
        this.f142283g = (com.tencent.mm.wallet_core.ui.WalletTextView) inflate.findViewById(com.tencent.mm.R.id.h2r);
        this.f142281e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.h2t);
        this.f142282f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.h2s);
        this.f142284h = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.h2o);
        this.f142285i = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate.findViewById(com.tencent.mm.R.id.h2n);
        this.f142283g.b();
    }

    public void setCardRecord(r45.ax3 ax3Var) {
        java.lang.String str = ax3Var.f370336i;
        this.f142284h.setText(ax3Var.f370337m);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(ax3Var.f370339o)) {
            this.f142285i.b(ax3Var.f370339o, 0, 0, u73.h.c(ax3Var.f370338n));
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f142280d, ax3Var.f370331d, 0.06f);
        com.tencent.mm.wallet_core.ui.r1.t0(this.f142281e, ax3Var.f370331d, 10);
        this.f142283g.setText(u73.h.a(ax3Var.f370332e));
        int i17 = ax3Var.f370333f;
        if (i17 == 0) {
            this.f142282f.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478526a7));
            this.f142282f.setText(com.tencent.mm.R.string.fxt);
            return;
        }
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HoneyPayCardLayout", "unknown rcvd: %s", java.lang.Integer.valueOf(i17));
            return;
        }
        long j17 = 0;
        if (ax3Var.f370335h != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPayCardLayout", "show check detail");
            this.f142282f.setText("");
            return;
        }
        long j18 = ax3Var.f370334g;
        if (j18 < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HoneyPayCardLayout", "unused quota wrong: %s", java.lang.Long.valueOf(j18));
        } else {
            j17 = j18;
        }
        this.f142282f.setText(getContext().getString(com.tencent.mm.R.string.fxs, com.tencent.mm.wallet_core.model.c2.b() + u73.h.a(j17)));
    }

    public HoneyPayCardLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public HoneyPayCardLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
