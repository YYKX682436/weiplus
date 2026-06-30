package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class bg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI f128950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.bs2 f128951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI finderSelfQRCodeUI, r45.bs2 bs2Var) {
        super(0);
        this.f128950d = finderSelfQRCodeUI;
        this.f128951e = bs2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap;
        r45.bs2 bs2Var = this.f128951e;
        com.tencent.mm.protobuf.g byteString = bs2Var.getByteString(1);
        android.graphics.Bitmap G = com.tencent.mm.sdk.platformtools.x.G(byteString != null ? byteString.f192156a : null);
        java.lang.String string = bs2Var.getString(2);
        com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI finderSelfQRCodeUI = this.f128950d;
        android.widget.ProgressBar progressBar = finderSelfQRCodeUI.B;
        if (progressBar == null) {
            kotlin.jvm.internal.o.o("loading");
            throw null;
        }
        progressBar.setVisibility(8);
        com.tencent.mars.xlog.Log.i("Finder.FinderSelfQRCodeUI", "qrcode url " + string);
        if (G == null) {
            if (!(string == null || string.length() == 0)) {
                kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                java.lang.String str = finderSelfQRCodeUI.f128701t;
                ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
                android.graphics.Bitmap s07 = com.tencent.mm.sdk.platformtools.x.s0(com.tencent.mm.modelavatar.g.a(str), false, r2.getWidth() * 0.5f);
                float e17 = (com.tencent.mm.ui.zk.e(finderSelfQRCodeUI, com.tencent.mm.R.dimen.f479727dj) * 1.0f) / s07.getWidth();
                android.graphics.Bitmap z07 = com.tencent.mm.sdk.platformtools.x.z0(s07, 0.0f, e17, e17);
                android.graphics.Bitmap K0 = com.tencent.mm.sdk.platformtools.x.K0(finderSelfQRCodeUI.getResources().getDrawable(com.tencent.mm.R.drawable.ac7));
                java.lang.Object[] objArr = new java.lang.Object[4];
                objArr[0] = java.lang.Integer.valueOf(z07 == null ? 0 : z07.getWidth());
                objArr[1] = java.lang.Integer.valueOf(z07 == null ? 0 : z07.getHeight());
                objArr[2] = java.lang.Integer.valueOf(K0 == null ? 0 : K0.getWidth());
                objArr[3] = java.lang.Integer.valueOf(K0 == null ? 0 : K0.getHeight());
                com.tencent.mars.xlog.Log.i("MicroMsg.BitmapUtil", "src(%d,%d) background(%d,%d)", objArr);
                if (z07 == null || K0 == null) {
                    bitmap = null;
                } else {
                    android.graphics.Bitmap m17 = com.tencent.mm.sdk.platformtools.x.m(java.lang.Math.max(z07.getWidth(), K0.getWidth()), java.lang.Math.max(z07.getHeight(), K0.getHeight()), android.graphics.Bitmap.Config.ARGB_8888, false);
                    java.util.WeakHashMap weakHashMap = com.tencent.mm.sdk.platformtools.t.f192977a;
                    android.graphics.Canvas canvas = new android.graphics.Canvas(m17);
                    canvas.drawBitmap(K0, (r1 - K0.getWidth()) / 2.0f, (r4 - K0.getHeight()) / 2.0f, new android.graphics.Paint());
                    canvas.drawBitmap(z07, (r1 - z07.getWidth()) / 2.0f, (r4 - z07.getHeight()) / 2.0f, new android.graphics.Paint());
                    K0.recycle();
                    z07.recycle();
                    bitmap = m17;
                }
                G = ((jd0.w1) ((kd0.k2) i95.n0.c(kd0.k2.class))).Ai(finderSelfQRCodeUI, bitmap, string, 3, 0.0d);
            }
        }
        if (G != null) {
            android.widget.ImageView imageView = finderSelfQRCodeUI.f128707z;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("qrcode");
                throw null;
            }
            imageView.setImageBitmap(G);
            android.widget.TextView textView = finderSelfQRCodeUI.f128706y;
            if (textView == null) {
                kotlin.jvm.internal.o.o("saveToGalleryTv");
                throw null;
            }
            textView.setVisibility(0);
        }
        return jz5.f0.f302826a;
    }
}
