package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes9.dex */
public class h extends com.tencent.mm.ui.base.preference.Preference implements y60.e {
    public android.view.View L;
    public android.widget.ImageView M;
    public android.widget.TextView N;
    public android.widget.TextView P;
    public java.lang.String Q;
    public java.lang.String R;
    public java.lang.String S;

    public h(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = null;
        this.N = null;
        this.P = null;
        this.G = com.tencent.mm.R.layout.f489362ca3;
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equals(this.Q) || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.M.setImageBitmap(bitmap);
        this.M.setBackgroundColor(0);
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
        this.M = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.c6k);
        this.N = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c7q);
        this.P = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c6p);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.Q)) {
            this.M.setVisibility(8);
        } else {
            e04.s3 s3Var = new e04.s3(this.Q);
            ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
            android.graphics.Bitmap d17 = x51.w0.d(s3Var);
            if (d17 == null || d17.isRecycled()) {
                try {
                    this.M.setImageBitmap(com.tencent.mm.sdk.platformtools.j.c(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null)));
                } catch (java.io.IOException unused) {
                    this.M.setImageBitmap(null);
                }
            } else {
                this.M.setImageBitmap(d17);
                this.M.setBackgroundColor(0);
            }
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.S);
        android.content.Context context = this.f197770d;
        if (K0) {
            this.N.setVisibility(8);
        } else {
            android.widget.TextView textView = this.N;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = this.S;
            float textSize = this.N.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.R)) {
            this.P.setVisibility(8);
        } else {
            this.P.setText(this.R);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.S) && com.tencent.mm.sdk.platformtools.t8.K0(this.Q)) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.c6o);
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.height = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a7v);
            linearLayout.setPadding(com.tencent.mm.sdk.platformtools.j.d(context, 9.0f), 0, 0, 0);
            linearLayout.setLayoutParams(layoutParams);
        }
    }
}
