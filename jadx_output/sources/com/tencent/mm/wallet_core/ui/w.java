package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f214245a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Bitmap f214246b = null;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Bitmap f214247c = null;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f214248d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f214249e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f214250f = true;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f214251g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public db5.d5 f214252h = null;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f214253i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.ImageView f214254j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f214255k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.ImageView f214256l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMVerticalTextView f214257m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f214258n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f214259o;

    public w(com.tencent.mm.ui.MMActivity mMActivity, boolean z17) {
        this.f214259o = false;
        this.f214245a = mMActivity;
        this.f214259o = z17;
    }

    public void a() {
        android.view.View inflate;
        if (this.f214252h != null) {
            return;
        }
        if (this.f214259o) {
            inflate = android.view.View.inflate(this.f214245a, com.tencent.mm.R.layout.d7f, null);
            com.tencent.mm.ui.base.MMVerticalTextView mMVerticalTextView = (com.tencent.mm.ui.base.MMVerticalTextView) inflate.findViewById(com.tencent.mm.R.id.oxk);
            com.tencent.mm.ui.base.MMVerticalTextView mMVerticalTextView2 = (com.tencent.mm.ui.base.MMVerticalTextView) inflate.findViewById(com.tencent.mm.R.id.f485858jc2);
            mMVerticalTextView2.setMediumBold(true);
            mMVerticalTextView2.setAccessibilityViewType(1);
            this.f214258n = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.kzg);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.kzf);
            findViewById.setImportantForAccessibility(4);
            findViewById.setOnClickListener(new com.tencent.mm.wallet_core.ui.q(this));
            mMVerticalTextView2.setOnClickListener(new com.tencent.mm.wallet_core.ui.r(this, findViewById, mMVerticalTextView));
            ((android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.jc9)).setContentDescription(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.hdu) + com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.hdv));
        } else {
            inflate = android.view.View.inflate(this.f214245a, com.tencent.mm.R.layout.d7i, null);
            inflate.setOnClickListener(new com.tencent.mm.wallet_core.ui.s(this));
        }
        this.f214253i = inflate.findViewById(com.tencent.mm.R.id.kzi);
        this.f214254j = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.kzh);
        this.f214255k = inflate.findViewById(com.tencent.mm.R.id.kze);
        this.f214256l = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.kzd);
        this.f214257m = (com.tencent.mm.ui.base.MMVerticalTextView) inflate.findViewById(com.tencent.mm.R.id.oxl);
        db5.d5 d5Var = new db5.d5(inflate, -1, -1, true);
        this.f214252h = d5Var;
        d5Var.setClippingEnabled(false);
        this.f214252h.update();
        this.f214252h.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(16777215));
        this.f214252h.setOnDismissListener(new com.tencent.mm.wallet_core.ui.t(this));
    }

    public void b() {
        db5.d5 d5Var = this.f214252h;
        if (d5Var != null && d5Var.isShowing()) {
            this.f214252h.dismiss();
        }
        com.tencent.mm.wallet_core.ui.r1.n0(this.f214248d);
        java.util.ArrayList arrayList = this.f214251g;
        com.tencent.mm.wallet_core.ui.r1.o0(arrayList);
        arrayList.clear();
        this.f214245a = null;
    }

    public void c(android.view.View view, boolean z17) {
        this.f214250f = z17;
        db5.d5 d5Var = this.f214252h;
        if (d5Var == null || d5Var.isShowing()) {
            return;
        }
        this.f214252h.showAtLocation(view.getRootView(), 17, 0, 0);
        this.f214252h.setFocusable(true);
        this.f214252h.setTouchable(true);
        this.f214252h.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(16777215));
        this.f214252h.setOutsideTouchable(true);
        if (this.f214250f) {
            android.view.ViewGroup viewGroup = this.f214258n;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                this.f214258n.post(new com.tencent.mm.wallet_core.ui.u(this));
            }
        } else {
            android.view.ViewGroup viewGroup2 = this.f214258n;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
        }
        d();
        this.f214245a.getWindow().addFlags(1024);
    }

    public final void d() {
        if (this.f214250f) {
            android.graphics.Bitmap bitmap = this.f214248d;
            android.graphics.Bitmap bitmap2 = this.f214247c;
            if (bitmap2 != null) {
                java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.reset();
                matrix.setRotate(90.0f, bitmap2.getWidth() / 2, bitmap2.getHeight() / 2);
                int width = bitmap2.getWidth();
                int height = bitmap2.getHeight();
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                aVar.c(java.lang.Boolean.TRUE);
                aVar.c(matrix);
                aVar.c(java.lang.Integer.valueOf(height));
                aVar.c(java.lang.Integer.valueOf(width));
                aVar.c(0);
                aVar.c(0);
                aVar.c(bitmap2);
                java.lang.Object obj = new java.lang.Object();
                yj0.a.d(obj, aVar.b(), "com/tencent/mm/wallet_core/ui/WalletBaseUtil", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, "(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
                yj0.a.e(obj, createBitmap, "com/tencent/mm/wallet_core/ui/WalletBaseUtil", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION, "(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                this.f214248d = createBitmap;
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mRoateBmp != null");
            } else {
                this.f214248d = null;
                com.tencent.mars.xlog.Log.e("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mRoateBmp == null");
            }
            this.f214256l.setImageBitmap(this.f214248d);
            java.util.ArrayList arrayList = this.f214251g;
            arrayList.add(0, bitmap);
            if (arrayList.size() >= 2) {
                for (int size = arrayList.size() - 1; size > 1; size--) {
                    com.tencent.mm.wallet_core.ui.r1.n0((android.graphics.Bitmap) arrayList.remove(size));
                }
            }
            android.view.View view = this.f214253i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f214255k;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.base.MMVerticalTextView mMVerticalTextView = this.f214257m;
            java.lang.String str = this.f214249e;
            java.util.regex.Pattern pattern2 = com.tencent.mm.wallet_core.ui.r1.f214222a;
            java.lang.String str2 = "";
            if (!android.text.TextUtils.isEmpty(str)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                int length = str.length() / 4;
                int length2 = str.length() % 4;
                sb6.append(com.tencent.mm.wallet_core.ui.r1.a(str.substring(0, length2), ""));
                for (int i17 = 0; i17 < 4; i17++) {
                    sb6.append(" ");
                }
                java.lang.String substring = str.substring(length2);
                int i18 = 0;
                while (i18 < length) {
                    int i19 = i18 + 1;
                    int min = java.lang.Math.min(i19 * 4, substring.length());
                    if (min + 4 > substring.length()) {
                        min = substring.length();
                    }
                    int i27 = i18 * 4;
                    sb6.append(com.tencent.mm.wallet_core.ui.r1.a(substring.substring(i27, min), ""));
                    if (min - i27 == 4 && i18 != length - 1) {
                        for (int i28 = 0; i28 < 4; i28++) {
                            sb6.append(" ");
                        }
                    }
                    i18 = i19;
                }
                str2 = sb6.toString();
            }
            mMVerticalTextView.setText(str2);
            this.f214257m.setContentDescription(this.f214249e);
        } else {
            this.f214254j.setImageBitmap(this.f214246b);
            if (this.f214246b != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mQRCodeBmp != null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflinePopupWindow", "updatePopWindowContent mQRCodeBmp == null");
            }
            android.view.View view3 = this.f214253i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f214255k;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/wallet_core/ui/OfflinePopupWindow", "updatePopWindowContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f214254j.postDelayed(new com.tencent.mm.wallet_core.ui.v(this), 500L);
        }
        this.f214252h.update();
    }
}
