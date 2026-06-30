package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.ui.base.preference.Preference implements y60.e {
    public android.view.View L;
    public android.widget.ImageView M;
    public java.lang.String N;
    public final android.content.Context P;
    public com.tencent.mm.ui.base.preference.r Q;

    public c(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = null;
        this.G = com.tencent.mm.R.layout.f489360ca1;
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
        this.P = context;
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equals(this.N) || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.M.setImageBitmap(bitmap);
        this.M.setBackgroundColor(0);
        com.tencent.mm.ui.base.preference.r rVar = this.Q;
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        }
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
        this.M = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.af6);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.N)) {
            return;
        }
        e04.s3 s3Var = new e04.s3(this.N);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(s3Var);
        if (d17 == null || d17.isRecycled()) {
            this.M.setBackgroundColor(this.P.getResources().getColor(com.tencent.mm.R.color.f479221t9));
            this.M.setImageBitmap(null);
        } else {
            this.M.setImageBitmap(d17);
            this.M.setBackgroundColor(0);
        }
    }
}
