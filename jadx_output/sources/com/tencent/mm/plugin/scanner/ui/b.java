package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes9.dex */
public class b extends com.tencent.mm.ui.base.preference.Preference implements y60.e {
    public android.view.View L;
    public android.widget.TextView M;
    public android.widget.ImageView N;
    public java.lang.String P;
    public java.lang.String Q;

    public b(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = null;
        this.Q = null;
        this.G = com.tencent.mm.R.layout.chz;
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equals(this.P) || bitmap == null || bitmap.isRecycled() || this.N == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.scanner.ui.a(this, bitmap));
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View p(android.view.View view, android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            this.L = u(viewGroup);
        }
        t(this.L);
        return this.L;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.M = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484095d02);
        this.N = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f482549hh);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.Q)) {
            this.M.setVisibility(8);
        } else {
            this.M.setText(this.Q);
            this.M.setVisibility(0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.P)) {
            return;
        }
        e04.s3 s3Var = new e04.s3(this.P);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(s3Var);
        if (d17 == null || d17.isRecycled()) {
            return;
        }
        this.N.setImageBitmap(d17);
        this.N.setVisibility(0);
    }
}
