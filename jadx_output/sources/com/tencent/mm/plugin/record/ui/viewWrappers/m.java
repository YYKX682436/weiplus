package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes12.dex */
public class m implements com.tencent.mm.plugin.record.ui.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.record.ui.f0 f155537a;

    /* renamed from: b, reason: collision with root package name */
    public int f155538b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f155539c;

    /* renamed from: f, reason: collision with root package name */
    public final kd0.p2 f155542f;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f155547k;

    /* renamed from: d, reason: collision with root package name */
    public int f155540d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f155541e = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f155543g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f155544h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnClickListener f155545i = new com.tencent.mm.plugin.record.ui.viewWrappers.c(this);

    /* renamed from: j, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f155546j = new com.tencent.mm.plugin.record.ui.viewWrappers.i(this);

    public m(com.tencent.mm.plugin.record.ui.f0 f0Var, android.widget.ListView listView) {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent>(a0Var) { // from class: com.tencent.mm.plugin.record.ui.viewWrappers.ImageViewWrapper$6
            {
                this.__eventId = 812146647;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent2 = recogQBarOfImageFileResultEvent;
                java.lang.String str = recogQBarOfImageFileResultEvent2.f54661g.f6368a;
                com.tencent.mm.plugin.record.ui.viewWrappers.l lVar = new com.tencent.mm.plugin.record.ui.viewWrappers.l(null);
                lVar.f155535a = recogQBarOfImageFileResultEvent2;
                com.tencent.mm.plugin.record.ui.viewWrappers.m mVar = com.tencent.mm.plugin.record.ui.viewWrappers.m.this;
                ((java.util.HashMap) mVar.f155541e).put(str, lVar);
                com.tencent.mm.ui.widget.dialog.k0 k0Var = mVar.f155539c;
                if (k0Var == null || !k0Var.i()) {
                    return true;
                }
                ((com.tencent.mm.plugin.record.ui.viewWrappers.i) mVar.f155546j).onLongClick(null);
                return true;
            }
        };
        this.f155547k = iListener;
        this.f155537a = f0Var;
        iListener.alive();
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        android.content.Context context = listView.getContext();
        com.tencent.mm.plugin.record.ui.viewWrappers.b bVar = new com.tencent.mm.plugin.record.ui.viewWrappers.b(this);
        ((jd0.q2) x2Var).getClass();
        this.f155542f = new com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic(context, bVar);
    }

    public static void c(com.tencent.mm.plugin.record.ui.viewWrappers.m mVar, android.content.Intent intent, android.view.View view) {
        int i17;
        int i18;
        mVar.getClass();
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
            i18 = view.getWidth();
            i17 = view.getHeight();
        } else {
            i17 = 0;
            i18 = 0;
        }
        intent.putExtra("img_gallery_left", iArr[0]);
        intent.putExtra("img_gallery_top", iArr[1]);
        intent.putExtra("img_gallery_width", i18);
        intent.putExtra("img_gallery_height", i17);
    }

    @Override // com.tencent.mm.plugin.record.ui.g0
    public android.view.View a(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.ccz, null);
        int a17 = ((context == null || !(context instanceof com.tencent.mm.ui.MMActivity)) ? com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics() : ((com.tencent.mm.ui.MMActivity) context).getOriginalResources().getDisplayMetrics()).widthPixels - com.tencent.mm.ui.zk.a(context, 80);
        this.f155540d = a17;
        int max = java.lang.Math.max(a17, 0);
        this.f155540d = max;
        if (max == 0) {
            this.f155540d = com.tencent.mm.ui.zk.a(context, com.tencent.mapsdk.internal.km.f50100e);
        }
        this.f155538b = this.f155540d;
        return inflate;
    }

    @Override // com.tencent.mm.plugin.record.ui.g0
    public void b(android.view.View view, int i17, et3.b bVar, java.lang.Object obj) {
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.lp8);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.imb);
        imageView.setTag(bVar);
        imageView.setOnClickListener(this.f155545i);
        if (bVar.f256594e == 1) {
            imageView.setOnLongClickListener(this.f155546j);
        }
        com.tencent.mm.plugin.record.ui.d0 d0Var = new com.tencent.mm.plugin.record.ui.d0();
        int i18 = bVar.f256594e;
        if (i18 == 0) {
            d0Var.f155368b = bVar.f256592c;
            d0Var.f155369c = bVar.f256600k;
        } else if (i18 == 1) {
            d0Var.f155368b = bVar.f256591b.field_localId;
        }
        d0Var.f155367a = bVar.f256590a;
        d0Var.f155371e = true;
        d0Var.f155370d = this.f155540d;
        android.graphics.Bitmap b17 = this.f155537a.b(d0Var);
        if (b17 != null) {
            java.lang.String str = d0Var.f155367a.T;
            d(imageView, progressBar, b17, true, 0, bVar.f256590a.T);
        } else {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.record.ui.viewWrappers.k(this, bVar, imageView, progressBar));
        }
    }

    public final void d(android.widget.ImageView imageView, android.widget.ProgressBar progressBar, android.graphics.Bitmap bitmap, boolean z17, int i17, java.lang.String str) {
        int f17;
        int i18;
        int f18;
        int i19;
        float height;
        int width;
        android.graphics.Bitmap bitmap2 = bitmap;
        if (!((et3.b) imageView.getTag()).f256590a.T.equals(str)) {
            imageView.getTag();
            return;
        }
        if (bitmap2 == null) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int i27 = this.f155540d;
            layoutParams.height = i27;
            layoutParams.width = i27;
            imageView.setBackgroundResource(com.tencent.mm.R.color.f478490b);
            imageView.setImageResource(com.tencent.mm.R.drawable.f481147lw);
            progressBar.setVisibility(0);
            return;
        }
        progressBar.setVisibility(8);
        bitmap.getWidth();
        bitmap.getHeight();
        imageView.getWidth();
        imageView.getHeight();
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        if (height2 >= width2) {
            float f19 = height2 / width2;
            if (z17) {
                i18 = this.f155540d;
                height = bitmap.getHeight() * i18;
                width = bitmap.getWidth();
                f17 = (int) (height / width);
            } else {
                if (f19 > 2.5d) {
                    int height3 = (bitmap.getHeight() - ((int) (bitmap.getWidth() * 2.5f))) / 2;
                    int width3 = bitmap.getWidth();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf((int) (bitmap.getWidth() * 2.5f)));
                    arrayList.add(java.lang.Integer.valueOf(width3));
                    arrayList.add(java.lang.Integer.valueOf(height3));
                    arrayList.add(0);
                    arrayList.add(bitmap2);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper", "updateView", "(Landroid/widget/ImageView;Landroid/widget/ProgressBar;Landroid/graphics/Bitmap;ZILjava/lang/String;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                    yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper", "updateView", "(Landroid/widget/ImageView;Landroid/widget/ProgressBar;Landroid/graphics/Bitmap;ZILjava/lang/String;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                    bitmap2 = createBitmap;
                    f19 = 2.5f;
                }
                if (f19 <= 2.0f) {
                    i19 = i65.a.f(imageView.getContext(), com.tencent.mm.R.dimen.f479593a3);
                    f18 = (int) (i19 / f19);
                    int i28 = f18;
                    f17 = i19;
                    i18 = i28;
                } else {
                    i18 = i65.a.f(imageView.getContext(), com.tencent.mm.R.dimen.f479595a5);
                    f17 = (int) (i18 * f19);
                }
            }
        } else {
            float f27 = width2 / height2;
            if (f27 > 2.33f) {
                int width4 = (bitmap.getWidth() - ((int) (bitmap.getHeight() * 2.33f))) / 2;
                int height4 = bitmap.getHeight();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(height4));
                arrayList2.add(java.lang.Integer.valueOf((int) (bitmap.getHeight() * 2.33f)));
                arrayList2.add(0);
                arrayList2.add(java.lang.Integer.valueOf(width4));
                arrayList2.add(bitmap2);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper", "updateView", "(Landroid/widget/ImageView;Landroid/widget/ProgressBar;Landroid/graphics/Bitmap;ZILjava/lang/String;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), ((java.lang.Integer) arrayList2.get(2)).intValue(), ((java.lang.Integer) arrayList2.get(3)).intValue(), ((java.lang.Integer) arrayList2.get(4)).intValue());
                yj0.a.e(obj2, createBitmap2, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper", "updateView", "(Landroid/widget/ImageView;Landroid/widget/ProgressBar;Landroid/graphics/Bitmap;ZILjava/lang/String;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                bitmap2 = createBitmap2;
            }
            if (z17) {
                i18 = this.f155540d;
                height = bitmap2.getHeight() * i18;
                width = bitmap2.getWidth();
                f17 = (int) (height / width);
            } else if (f27 <= 2.0f) {
                f18 = i65.a.f(imageView.getContext(), com.tencent.mm.R.dimen.f479593a3);
                i19 = (int) (f18 / f27);
                int i282 = f18;
                f17 = i19;
                i18 = i282;
            } else {
                f17 = i65.a.f(imageView.getContext(), com.tencent.mm.R.dimen.f479595a5);
                i18 = (int) (f17 * f27);
            }
        }
        layoutParams2.width = i18;
        layoutParams2.height = f17;
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        imageView.setImageBitmap(bitmap2);
        imageView.setBackgroundResource(0);
    }

    @Override // com.tencent.mm.plugin.record.ui.g0
    public void destroy() {
        this.f155547k.dead();
    }

    @Override // com.tencent.mm.plugin.record.ui.g0
    public void pause() {
    }
}
