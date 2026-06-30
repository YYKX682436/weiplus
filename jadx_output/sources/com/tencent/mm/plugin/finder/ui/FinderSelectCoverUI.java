package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSelectCoverUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/ui/tools/c5;", "<init>", "()V", "com/tencent/mm/plugin/finder/ui/ud", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes10.dex */
public final class FinderSelectCoverUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: e2, reason: collision with root package name */
    public static int f128668e2;
    public android.view.View A;
    public android.widget.FrameLayout A1;
    public android.view.View B;
    public ym5.n6 B1;
    public android.view.View C;
    public com.tencent.mm.ui.tools.f5 C1;
    public android.view.View D;
    public int D1;
    public android.view.View E;
    public int E1;
    public android.widget.SeekBar F;
    public int F1;
    public android.view.View G;
    public int G1;
    public android.view.View H;
    public cw2.aa H1;
    public android.view.View I;
    public cw2.aa I1;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.ImageView f128669J;
    public com.tencent.mm.plugin.finder.ui.td J1;
    public android.view.View K;
    public boolean K1;
    public android.view.View L;
    public com.tencent.mm.plugin.finder.ui.td L1;
    public android.view.View M;
    public boolean M1;
    public android.view.View N;
    public boolean N1;
    public boolean O1;
    public android.widget.TextView P;
    public boolean P1;
    public android.widget.TextView Q;
    public boolean Q1;
    public android.view.View R;
    public boolean R1;
    public android.view.View S;
    public long S1;
    public long T1;
    public rm5.k U;
    public long U1;
    public android.graphics.Canvas V;
    public boolean V1;
    public android.graphics.Bitmap W;
    public int W1;
    public android.graphics.Paint X;
    public r45.mb4 X1;
    public boolean Y;
    public int Y1;
    public int Z;
    public int Z1;

    /* renamed from: a2, reason: collision with root package name */
    public java.lang.Runnable f128670a2;

    /* renamed from: b2, reason: collision with root package name */
    public float f128671b2;

    /* renamed from: c2, reason: collision with root package name */
    public float f128672c2;

    /* renamed from: d2, reason: collision with root package name */
    public int f128673d2;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f128677t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.cropview.CropLayout f128678u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f128679v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f128680w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f128681x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f128684y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f128687z;

    /* renamed from: z1, reason: collision with root package name */
    public qk.o9 f128688z1;
    public final java.util.LinkedList T = new java.util.LinkedList();

    /* renamed from: p0, reason: collision with root package name */
    public final r45.s01 f128675p0 = new r45.s01();

    /* renamed from: x0, reason: collision with root package name */
    public final r45.b01 f128682x0 = new r45.b01();

    /* renamed from: y0, reason: collision with root package name */
    public boolean f128685y0 = true;

    /* renamed from: l1, reason: collision with root package name */
    public final jz5.g f128674l1 = jz5.h.b(com.tencent.mm.plugin.finder.ui.df.f129071d);

    /* renamed from: p1, reason: collision with root package name */
    public final jz5.g f128676p1 = jz5.h.b(new com.tencent.mm.plugin.finder.ui.ef(this));

    /* renamed from: x1, reason: collision with root package name */
    public final jz5.g f128683x1 = jz5.h.b(new com.tencent.mm.plugin.finder.ui.ff(this));

    /* renamed from: y1, reason: collision with root package name */
    public final jz5.g f128686y1 = jz5.h.b(new com.tencent.mm.plugin.finder.ui.uf(this));

    public FinderSelectCoverUI() {
        com.tencent.mm.plugin.finder.ui.td tdVar = com.tencent.mm.plugin.finder.ui.td.f129873e;
        this.J1 = tdVar;
        this.L1 = tdVar;
        this.P1 = true;
        this.Q1 = true;
        this.U1 = 1L;
    }

    public static final void c7(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI, float f17, int i17) {
        finderSelectCoverUI.getClass();
        boolean z17 = 1 == i17;
        android.graphics.Bitmap h76 = finderSelectCoverUI.h7();
        if (h76 != null) {
            int width = h76.getWidth();
            int height = h76.getHeight();
            jz5.l k76 = finderSelectCoverUI.k7(height / width);
            int intValue = ((java.lang.Number) k76.f302833d).intValue();
            int intValue2 = ((java.lang.Number) k76.f302834e).intValue();
            com.tencent.mm.ui.widget.cropview.CropLayout cropLayout = finderSelectCoverUI.f128678u;
            if (cropLayout == null) {
                kotlin.jvm.internal.o.o("cropLayout");
                throw null;
            }
            float f18 = cropLayout.getContentViewScale()[0];
            com.tencent.mm.ui.widget.cropview.CropLayout cropLayout2 = finderSelectCoverUI.f128678u;
            if (cropLayout2 == null) {
                kotlin.jvm.internal.o.o("cropLayout");
                throw null;
            }
            finderSelectCoverUI.C7(width, height, intValue / f18, intValue2 / cropLayout2.getContentViewScale()[1], finderSelectCoverUI.j7(h76), z17);
        }
        finderSelectCoverUI.B7(f17, i17);
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout3 = finderSelectCoverUI.f128678u;
        if (cropLayout3 != null) {
            cropLayout3.post(new com.tencent.mm.plugin.finder.ui.wd(finderSelectCoverUI));
        } else {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
    }

    public static final void d7(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI, boolean z17, r45.dd4 dd4Var, android.graphics.Bitmap bitmap) {
        r45.c07 c07Var;
        r45.c07 c07Var2;
        r45.c07 c07Var3;
        r45.c07 c07Var4;
        if (finderSelectCoverUI.V == null) {
            int n76 = (int) finderSelectCoverUI.n7();
            int l76 = (int) finderSelectCoverUI.l7();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(l76));
            arrayList.add(java.lang.Integer.valueOf(n76));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "refreshThumb", "(ZLcom/tencent/mm/protocal/protobuf/LocalVideoCropInfo;Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "refreshThumb", "(ZLcom/tencent/mm/protocal/protobuf/LocalVideoCropInfo;Landroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            finderSelectCoverUI.W = createBitmap;
            android.graphics.Bitmap bitmap2 = finderSelectCoverUI.W;
            if (bitmap2 == null) {
                kotlin.jvm.internal.o.o("thumbBitmap");
                throw null;
            }
            finderSelectCoverUI.V = new android.graphics.Canvas(bitmap2);
            android.graphics.Paint paint = new android.graphics.Paint(1);
            finderSelectCoverUI.X = paint;
            paint.setColor(b3.l.getColor(finderSelectCoverUI.getContext(), com.tencent.mm.R.color.f478553an));
            android.graphics.Paint paint2 = finderSelectCoverUI.X;
            if (paint2 == null) {
                kotlin.jvm.internal.o.o("thumbPaint");
                throw null;
            }
            paint2.setStyle(android.graphics.Paint.Style.STROKE);
            android.graphics.Paint paint3 = finderSelectCoverUI.X;
            if (paint3 == null) {
                kotlin.jvm.internal.o.o("thumbPaint");
                throw null;
            }
            paint3.setStrokeWidth(i65.a.b(finderSelectCoverUI.getContext(), 2));
        }
        android.graphics.Canvas canvas = finderSelectCoverUI.V;
        if (canvas != null) {
            canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            if (!z17 || finderSelectCoverUI.Y) {
                canvas.drawBitmap(bitmap, finderSelectCoverUI.f7(0, 0, bitmap.getWidth(), bitmap.getHeight(), (int) finderSelectCoverUI.n7(), (int) finderSelectCoverUI.l7()), new android.graphics.Rect(0, 0, (int) finderSelectCoverUI.n7(), (int) finderSelectCoverUI.l7()), (android.graphics.Paint) null);
            } else {
                canvas.drawBitmap(bitmap, finderSelectCoverUI.f7((dd4Var == null || (c07Var4 = (r45.c07) dd4Var.getCustom(6)) == null) ? 0 : c07Var4.getInteger(0), (dd4Var == null || (c07Var3 = (r45.c07) dd4Var.getCustom(6)) == null) ? 0 : c07Var3.getInteger(3), (dd4Var == null || (c07Var2 = (r45.c07) dd4Var.getCustom(6)) == null) ? 0 : c07Var2.getInteger(2), (dd4Var == null || (c07Var = (r45.c07) dd4Var.getCustom(6)) == null) ? 0 : c07Var.getInteger(1), (int) finderSelectCoverUI.n7(), (int) finderSelectCoverUI.l7()), new android.graphics.Rect(0, 0, (int) finderSelectCoverUI.n7(), (int) finderSelectCoverUI.l7()), (android.graphics.Paint) null);
            }
            float b17 = i65.a.b(finderSelectCoverUI.getContext(), 2);
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            float f17 = 2 * b17;
            android.graphics.Paint paint4 = finderSelectCoverUI.X;
            if (paint4 == null) {
                kotlin.jvm.internal.o.o("thumbPaint");
                throw null;
            }
            canvas.drawRoundRect(rectF, f17, f17, paint4);
        }
        finderSelectCoverUI.runOnUiThread(new com.tencent.mm.plugin.finder.ui.xe(finderSelectCoverUI, com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI.S.a(bitmap, finderSelectCoverUI.E1, finderSelectCoverUI.F1)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if ((r0 == 0.0f) == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e7(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI r11, android.graphics.Bitmap r12) {
        /*
            boolean r0 = r11.f128685y0
            if (r0 == 0) goto L8f
            r45.s01 r0 = r11.f128675p0
            r1 = 2
            float r2 = r0.getFloat(r1)
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r4 = 1
            r5 = 0
            if (r2 > 0) goto L1e
            r2 = 3
            float r2 = r0.getFloat(r2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L1c
            goto L1e
        L1c:
            r2 = r5
            goto L1f
        L1e:
            r2 = r4
        L1f:
            if (r2 == 0) goto L8f
            com.tencent.mm.ui.widget.cropview.CropLayout r2 = r11.f128678u
            r6 = 0
            java.lang.String r7 = "cropLayout"
            if (r2 == 0) goto L8b
            float[] r2 = r2.getContentViewScale()
            r2 = r2[r5]
            com.tencent.mm.ui.widget.cropview.CropLayout r8 = r11.f128678u
            if (r8 == 0) goto L87
            float[] r8 = r8.getContentViewScale()
            r8 = r8[r4]
            int r9 = r12.getWidth()
            float r9 = (float) r9
            float r9 = r9 * r2
            int r12 = r12.getHeight()
            float r12 = (float) r12
            float r12 = r12 * r8
            int r2 = r11.E1
            int r8 = r11.F1
            float r2 = (float) r2
            int r10 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r10 <= 0) goto L57
            float r10 = r0.getFloat(r4)
            float r10 = r10 * r9
            float r9 = r9 - r2
            float r2 = (float) r1
            float r9 = r9 / r2
            float r10 = r10 - r9
            goto L58
        L57:
            r10 = r3
        L58:
            float r2 = (float) r8
            int r8 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r8 <= 0) goto L67
            float r0 = r0.getFloat(r5)
            float r0 = r0 * r12
            float r12 = r12 - r2
            float r1 = (float) r1
            float r12 = r12 / r1
            float r0 = r0 - r12
            goto L68
        L67:
            r0 = r3
        L68:
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 != 0) goto L6e
            r12 = r4
            goto L6f
        L6e:
            r12 = r5
        L6f:
            if (r12 == 0) goto L79
            int r12 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r12 != 0) goto L76
            goto L77
        L76:
            r4 = r5
        L77:
            if (r4 != 0) goto L80
        L79:
            com.tencent.mm.ui.widget.cropview.CropLayout r12 = r11.f128678u
            if (r12 == 0) goto L83
            r12.M(r10, r0)
        L80:
            r11.f128685y0 = r5
            goto L8f
        L83:
            kotlin.jvm.internal.o.o(r7)
            throw r6
        L87:
            kotlin.jvm.internal.o.o(r7)
            throw r6
        L8b:
            kotlin.jvm.internal.o.o(r7)
            throw r6
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.e7(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI, android.graphics.Bitmap):void");
    }

    public final void A7(boolean z17) {
        int i17 = z17 ? 0 : 4;
        android.view.View view = this.f128687z;
        if (view == null) {
            kotlin.jvm.internal.o.o("cropOperationLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "setOperationButtonsVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "setOperationButtonsVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.miv);
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "setOperationButtonsVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "setOperationButtonsVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.G;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("selectBtn");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "setOperationButtonsVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "setOperationButtonsVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void B7(float f17, int i17) {
        int i18;
        int i19 = this.E1;
        int i27 = this.F1;
        int dimension = y4().y - ((int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479675cc));
        android.view.View view = this.f128677t;
        if (view == null) {
            kotlin.jvm.internal.o.o("contentLayout");
            throw null;
        }
        view.post(new com.tencent.mm.plugin.finder.ui.vf(this));
        android.view.View view2 = this.E;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("centerHoleView");
            throw null;
        }
        view2.getLayoutParams().height = this.F1;
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout = this.f128678u;
        if (cropLayout == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        cropLayout.getVisibilityRect().setEmpty();
        if (com.tencent.mm.plugin.finder.ui.vd.f129956a[this.J1.ordinal()] == 2) {
            android.widget.ImageView imageView = this.f128679v;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("cropBlurView");
                throw null;
            }
            imageView.setVisibility(8);
            android.view.View view3 = this.f128680w;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("cropWayLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "updateCropLayout", "(FI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "updateCropLayout", "(FI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (f17 > 1.0f) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f128684y;
                if (weImageView == null) {
                    kotlin.jvm.internal.o.o("cropWayIv");
                    throw null;
                }
                weImageView.setImageResource(com.tencent.mm.R.raw.finder_icons_filled_min_window);
                int min = java.lang.Math.min((int) (i19 * f17), dimension);
                int i28 = (min - i27) / 2;
                android.graphics.Rect rect = new android.graphics.Rect(0, i28, i19, i27 + i28);
                com.tencent.mm.ui.widget.cropview.CropLayout cropLayout2 = this.f128678u;
                if (cropLayout2 == null) {
                    kotlin.jvm.internal.o.o("cropLayout");
                    throw null;
                }
                cropLayout2.getVisibilityRect().set(rect);
                com.tencent.mm.ui.widget.cropview.CropLayout cropLayout3 = this.f128678u;
                if (cropLayout3 == null) {
                    kotlin.jvm.internal.o.o("cropLayout");
                    throw null;
                }
                cropLayout3.getLayoutParams().width = i19;
                com.tencent.mm.ui.widget.cropview.CropLayout cropLayout4 = this.f128678u;
                if (cropLayout4 == null) {
                    kotlin.jvm.internal.o.o("cropLayout");
                    throw null;
                }
                cropLayout4.getLayoutParams().height = min;
            } else if (f17 <= 0.75f) {
                int min2 = java.lang.Math.min((int) (i27 / f17), y4().x);
                int i29 = (min2 - i19) / 2;
                android.graphics.Rect rect2 = new android.graphics.Rect(i29, 0, i19 + i29, i27);
                com.tencent.mm.ui.widget.cropview.CropLayout cropLayout5 = this.f128678u;
                if (cropLayout5 == null) {
                    kotlin.jvm.internal.o.o("cropLayout");
                    throw null;
                }
                cropLayout5.getVisibilityRect().set(rect2);
                com.tencent.mm.ui.widget.cropview.CropLayout cropLayout6 = this.f128678u;
                if (cropLayout6 == null) {
                    kotlin.jvm.internal.o.o("cropLayout");
                    throw null;
                }
                cropLayout6.getLayoutParams().width = min2;
                com.tencent.mm.ui.widget.cropview.CropLayout cropLayout7 = this.f128678u;
                if (cropLayout7 == null) {
                    kotlin.jvm.internal.o.o("cropLayout");
                    throw null;
                }
                cropLayout7.getLayoutParams().height = i27;
                if (f17 == 0.75f) {
                    com.tencent.mm.ui.widget.cropview.CropLayout cropLayout8 = this.f128678u;
                    if (cropLayout8 == null) {
                        kotlin.jvm.internal.o.o("cropLayout");
                        throw null;
                    }
                    cropLayout8.setEnableTouch(false);
                }
            } else {
                int i37 = (int) (i19 * f17);
                int i38 = (i37 - i27) / 2;
                android.graphics.Rect rect3 = new android.graphics.Rect(0, i38, i19, i27 + i38);
                com.tencent.mm.ui.widget.cropview.CropLayout cropLayout9 = this.f128678u;
                if (cropLayout9 == null) {
                    kotlin.jvm.internal.o.o("cropLayout");
                    throw null;
                }
                cropLayout9.getVisibilityRect().set(rect3);
                com.tencent.mm.ui.widget.cropview.CropLayout cropLayout10 = this.f128678u;
                if (cropLayout10 == null) {
                    kotlin.jvm.internal.o.o("cropLayout");
                    throw null;
                }
                cropLayout10.getLayoutParams().width = i19;
                com.tencent.mm.ui.widget.cropview.CropLayout cropLayout11 = this.f128678u;
                if (cropLayout11 == null) {
                    kotlin.jvm.internal.o.o("cropLayout");
                    throw null;
                }
                cropLayout11.getLayoutParams().height = i37;
            }
        } else {
            if (f17 <= 1.0f) {
                int i39 = y4().x;
                int i47 = (int) (y4().x * f17);
                float f18 = i39;
                float f19 = (i47 * 1.0f) / f18;
                jz5.l lVar = f19 > 1.3333334f ? new jz5.l(java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf((int) (f18 * 1.3333334f))) : f19 < 1.0f ? new jz5.l(java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i39)) : new jz5.l(java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i47));
                int intValue = (((java.lang.Number) lVar.f302834e).intValue() * i19) / ((java.lang.Number) lVar.f302833d).intValue();
                com.tencent.mm.ui.widget.cropview.CropLayout cropLayout12 = this.f128678u;
                if (cropLayout12 == null) {
                    kotlin.jvm.internal.o.o("cropLayout");
                    throw null;
                }
                cropLayout12.getLayoutParams().width = y4().x;
                if (intValue < i27) {
                    if (i17 == 1) {
                        android.widget.ImageView imageView2 = this.f128679v;
                        if (imageView2 == null) {
                            kotlin.jvm.internal.o.o("cropBlurView");
                            throw null;
                        }
                        imageView2.setVisibility(8);
                        android.widget.TextView textView = this.f128681x;
                        if (textView == null) {
                            kotlin.jvm.internal.o.o("cropWayTv");
                            throw null;
                        }
                        textView.setText(getContext().getResources().getString(com.tencent.mm.R.string.cqz));
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f128684y;
                        if (weImageView2 == null) {
                            kotlin.jvm.internal.o.o("cropWayIv");
                            throw null;
                        }
                        weImageView2.setImageResource(com.tencent.mm.R.raw.finder_icons_filled_min_window);
                        int i48 = (y4().x - i27) / 2;
                        android.graphics.Rect rect4 = new android.graphics.Rect(i48, 0, i48 >= 0 ? i27 - i48 : i27 + i48, i27);
                        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout13 = this.f128678u;
                        if (cropLayout13 == null) {
                            kotlin.jvm.internal.o.o("cropLayout");
                            throw null;
                        }
                        cropLayout13.getVisibilityRect().set(rect4);
                    } else if (i17 == 2) {
                        android.widget.ImageView imageView3 = this.f128679v;
                        if (imageView3 == null) {
                            kotlin.jvm.internal.o.o("cropBlurView");
                            throw null;
                        }
                        imageView3.setVisibility(0);
                        android.widget.TextView textView2 = this.f128681x;
                        if (textView2 == null) {
                            kotlin.jvm.internal.o.o("cropWayTv");
                            throw null;
                        }
                        textView2.setText(getContext().getResources().getString(com.tencent.mm.R.string.f491324cr0));
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f128684y;
                        if (weImageView3 == null) {
                            kotlin.jvm.internal.o.o("cropWayIv");
                            throw null;
                        }
                        weImageView3.setImageResource(com.tencent.mm.R.raw.finder_icons_filled_max_window);
                        int i49 = (y4().x - i19) / 2;
                        android.graphics.Rect rect5 = new android.graphics.Rect(i49, 0, i19 + i49, intValue);
                        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout14 = this.f128678u;
                        if (cropLayout14 == null) {
                            kotlin.jvm.internal.o.o("cropLayout");
                            throw null;
                        }
                        cropLayout14.getVisibilityRect().set(rect5);
                        i27 = intValue;
                    }
                    android.view.View view4 = this.f128680w;
                    if (view4 == null) {
                        kotlin.jvm.internal.o.o("cropWayLayout");
                        throw null;
                    }
                    if (f17 == 1.0f) {
                        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout15 = this.f128678u;
                        if (cropLayout15 == null) {
                            kotlin.jvm.internal.o.o("cropLayout");
                            throw null;
                        }
                        cropLayout15.setEnableTouch(false);
                        i18 = 8;
                    } else {
                        i18 = 0;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "updateCropLayout", "(FI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "updateCropLayout", "(FI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.Z = i17;
                }
            } else {
                if (f17 >= 1.3333334f) {
                    com.tencent.mm.ui.widget.cropview.CropLayout cropLayout16 = this.f128678u;
                    if (cropLayout16 == null) {
                        kotlin.jvm.internal.o.o("cropLayout");
                        throw null;
                    }
                    cropLayout16.getLayoutParams().width = i19;
                    i27 = (int) (i19 * f17);
                    int i57 = (i27 - this.F1) / 2;
                    android.graphics.Rect rect6 = new android.graphics.Rect(0, i57, i19, this.F1 + i57);
                    com.tencent.mm.ui.widget.cropview.CropLayout cropLayout17 = this.f128678u;
                    if (cropLayout17 == null) {
                        kotlin.jvm.internal.o.o("cropLayout");
                        throw null;
                    }
                    cropLayout17.getVisibilityRect().set(rect6);
                } else {
                    int i58 = (int) (i27 / f17);
                    com.tencent.mm.ui.widget.cropview.CropLayout cropLayout18 = this.f128678u;
                    if (cropLayout18 == null) {
                        kotlin.jvm.internal.o.o("cropLayout");
                        throw null;
                    }
                    android.view.ViewGroup.LayoutParams layoutParams = cropLayout18.getLayoutParams();
                    if (i58 > y4().x) {
                        i58 = y4().x;
                    }
                    layoutParams.width = i58;
                    com.tencent.mm.ui.widget.cropview.CropLayout cropLayout19 = this.f128678u;
                    if (cropLayout19 == null) {
                        kotlin.jvm.internal.o.o("cropLayout");
                        throw null;
                    }
                    int i59 = (cropLayout19.getLayoutParams().width - i19) / 2;
                    android.graphics.Rect rect7 = new android.graphics.Rect(i59, 0, i19 + i59, i27);
                    com.tencent.mm.ui.widget.cropview.CropLayout cropLayout20 = this.f128678u;
                    if (cropLayout20 == null) {
                        kotlin.jvm.internal.o.o("cropLayout");
                        throw null;
                    }
                    cropLayout20.getVisibilityRect().set(rect7);
                }
                this.Z = 1;
                android.view.View view5 = this.f128680w;
                if (view5 == null) {
                    kotlin.jvm.internal.o.o("cropWayLayout");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "updateCropLayout", "(FI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "updateCropLayout", "(FI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.ui.widget.cropview.CropLayout cropLayout21 = this.f128678u;
            if (cropLayout21 == null) {
                kotlin.jvm.internal.o.o("cropLayout");
                throw null;
            }
            cropLayout21.getLayoutParams().height = i27;
        }
        android.view.View view6 = this.f128677t;
        if (view6 == null) {
            kotlin.jvm.internal.o.o("contentLayout");
            throw null;
        }
        view6.requestLayout();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateCropLayout] cropLayoutLp.width=");
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout22 = this.f128678u;
        if (cropLayout22 == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        sb6.append(cropLayout22.getWidth());
        sb6.append(" cropLayoutLp.height=");
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout23 = this.f128678u;
        if (cropLayout23 == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        sb6.append(cropLayout23.getHeight());
        com.tencent.mars.xlog.Log.i("Finder.FinderSelectCoverUI", sb6.toString());
    }

    public final void C7(int i17, int i18, float f17, float f18, android.graphics.Rect rect, boolean z17) {
        float f19 = i17;
        r45.s01 s01Var = this.f128675p0;
        if (f19 <= f17 || i17 <= 0) {
            float f27 = i18;
            if (f27 <= f18 || i18 <= 0) {
                return;
            }
            s01Var.set(0, java.lang.Float.valueOf(rect.top / f27));
            s01Var.set(3, java.lang.Float.valueOf(f18 / f27));
            return;
        }
        float f28 = rect.left;
        int i19 = this.E1;
        float f29 = i18;
        float f37 = this.F1 / f29;
        if (z17 && this.J1 != com.tencent.mm.plugin.finder.ui.td.f129875g && f29 / f19 <= 1.0f) {
            f28 += ((r10 - i19) / f37) / 2;
        }
        s01Var.set(1, java.lang.Float.valueOf(f28 / f19));
        s01Var.set(2, java.lang.Float.valueOf(f17 / f19));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 74;
    }

    public final android.graphics.Rect f7(int i17, int i18, int i19, int i27, int i28, int i29) {
        float f17;
        float f18;
        int abs = java.lang.Math.abs(i19 - i17);
        int abs2 = java.lang.Math.abs(i27 - i18);
        float f19 = 0.0f;
        if (abs * i29 > i28 * abs2) {
            f18 = i29 / abs2;
            f19 = ((abs * f18) - i28) * 0.5f;
            f17 = 0.0f;
        } else {
            float f27 = i28 / abs;
            f17 = ((abs2 * f27) - i29) * 0.5f;
            f18 = f27;
        }
        int i37 = (int) (f19 / f18);
        int i38 = (int) (f17 / f18);
        if (i37 < 0) {
            i37 = 0;
        }
        if (i38 < 0) {
            i38 = 0;
        }
        return new android.graphics.Rect(i17 + i37, i18 + i38, i19 - i37, i27 - i38);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (!this.M1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_is_set_cover", false);
            intent.putExtra("RESULT_COVER_WORD_INFO_WRAP", this.f128682x0.toByteArray());
            setResult(0, intent);
        }
        super.finish();
    }

    public final void g7(r45.mb4 mb4Var, int i17, int i18, long j17, long j18, boolean z17) {
        int dimension = y4().x - ((int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479653br));
        int ceil = (int) java.lang.Math.ceil(dimension / m7());
        if (ceil < 2) {
            ceil = 2;
        }
        long j19 = j18 - j17;
        if (j19 < 1) {
            j19 = 1;
        }
        long j27 = j19 / (ceil - 1);
        e06.k m17 = e06.p.m(0, ceil);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = m17.iterator();
        while (it.hasNext()) {
            linkedList.add(java.lang.Long.valueOf(j17 + (((kz5.x0) it).b() * j27)));
        }
        int i19 = this.W1 + 1;
        this.W1 = i19;
        int l76 = (int) l7();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(l76));
        arrayList.add(java.lang.Integer.valueOf(dimension));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "fetchThumbStripForWindow", "(Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;IIJJZ)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "fetchThumbStripForWindow", "(Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;IIJJZ)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.finder.ui.zd(z17, this, mb4Var, i17, i18, linkedList, i19, new android.graphics.Canvas(createBitmap), createBitmap));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b8o;
    }

    public final android.graphics.Bitmap h7() {
        cw2.aa i76 = i7();
        if (i76 != null) {
            return i76.getBitmap();
        }
        return null;
    }

    public final cw2.aa i7() {
        return s7() ? this.I1 : this.H1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.eb6);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f128677t = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ebm);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f128678u = (com.tencent.mm.ui.widget.cropview.CropLayout) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ebk);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f128679v = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ebq);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f128680w = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.ebr);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f128681x = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.ebp);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f128684y = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.ebo);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.C = findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.ebl);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.D = findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.g1z);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.E = findViewById9;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.miz);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.F = (android.widget.SeekBar) findViewById10;
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.miy);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.G = findViewById11;
        findViewById11.setEnabled(false);
        android.view.View view = this.G;
        if (view == null) {
            kotlin.jvm.internal.o.o("selectBtn");
            throw null;
        }
        view.setOnClickListener(new com.tencent.mm.plugin.finder.ui.ne(this));
        android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.f486816s54);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.H = findViewById12;
        android.view.View findViewById13 = findViewById(com.tencent.mm.R.id.v2h);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.I = findViewById13;
        findViewById(com.tencent.mm.R.id.miv).setOnClickListener(new com.tencent.mm.plugin.finder.ui.oe(this));
        android.view.View findViewById14 = findViewById(com.tencent.mm.R.id.ebi);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.A = findViewById14;
        android.view.View findViewById15 = findViewById(com.tencent.mm.R.id.mix);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.B = findViewById15;
        android.view.View findViewById16 = findViewById(com.tencent.mm.R.id.ebn);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.f128687z = findViewById16;
        android.view.View findViewById17 = findViewById(com.tencent.mm.R.id.f487295o70);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.f128669J = (android.widget.ImageView) findViewById17;
        android.view.View findViewById18 = findViewById(com.tencent.mm.R.id.s8i);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        this.K = findViewById18;
        android.view.View findViewById19 = findViewById(com.tencent.mm.R.id.s8k);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        this.L = findViewById19;
        android.view.View findViewById20 = findViewById(com.tencent.mm.R.id.s4y);
        kotlin.jvm.internal.o.f(findViewById20, "findViewById(...)");
        this.M = findViewById20;
        android.view.View findViewById21 = findViewById(com.tencent.mm.R.id.ros);
        kotlin.jvm.internal.o.f(findViewById21, "findViewById(...)");
        this.N = findViewById21;
        findViewById21.setEnabled(false);
        android.view.View view2 = this.N;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("previewBtn");
            throw null;
        }
        view2.setOnClickListener(new com.tencent.mm.plugin.finder.ui.pe(this));
        android.view.View findViewById22 = findViewById(com.tencent.mm.R.id.tuf);
        kotlin.jvm.internal.o.f(findViewById22, "findViewById(...)");
        this.P = (android.widget.TextView) findViewById22;
        android.view.View findViewById23 = findViewById(com.tencent.mm.R.id.tue);
        kotlin.jvm.internal.o.f(findViewById23, "findViewById(...)");
        this.Q = (android.widget.TextView) findViewById23;
        android.view.View findViewById24 = findViewById(com.tencent.mm.R.id.uf_);
        kotlin.jvm.internal.o.f(findViewById24, "findViewById(...)");
        this.R = findViewById24;
        android.view.View findViewById25 = findViewById(com.tencent.mm.R.id.ufa);
        kotlin.jvm.internal.o.f(findViewById25, "findViewById(...)");
        this.S = findViewById25;
        int ordinal = this.J1.ordinal();
        if (ordinal == 2) {
            android.widget.TextView textView = this.P;
            if (textView == null) {
                kotlin.jvm.internal.o.o("titleView");
                throw null;
            }
            textView.setVisibility(0);
            android.widget.TextView textView2 = this.Q;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("descView");
                throw null;
            }
            textView2.setVisibility(0);
            android.widget.TextView textView3 = this.P;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("titleView");
                throw null;
            }
            textView3.setText(getContext().getResources().getString(com.tencent.mm.R.string.nzq));
            android.widget.TextView textView4 = this.Q;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("descView");
                throw null;
            }
            textView4.setText(getContext().getResources().getString(com.tencent.mm.R.string.nzm));
        } else if (ordinal != 3) {
            android.widget.TextView textView5 = this.P;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("titleView");
                throw null;
            }
            textView5.setVisibility(8);
            android.widget.TextView textView6 = this.Q;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("descView");
                throw null;
            }
            textView6.setVisibility(8);
            android.view.View view3 = this.N;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("previewBtn");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.widget.TextView textView7 = this.P;
            if (textView7 == null) {
                kotlin.jvm.internal.o.o("titleView");
                throw null;
            }
            textView7.setVisibility(0);
            android.widget.TextView textView8 = this.Q;
            if (textView8 == null) {
                kotlin.jvm.internal.o.o("descView");
                throw null;
            }
            textView8.setVisibility(0);
            android.widget.TextView textView9 = this.P;
            if (textView9 == null) {
                kotlin.jvm.internal.o.o("titleView");
                throw null;
            }
            textView9.setText(getContext().getResources().getString(com.tencent.mm.R.string.nzr));
            android.widget.TextView textView10 = this.Q;
            if (textView10 == null) {
                kotlin.jvm.internal.o.o("descView");
                throw null;
            }
            textView10.setText(getContext().getResources().getString(com.tencent.mm.R.string.nzo));
            int dimension = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479689co);
            android.view.View view4 = this.R;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("leftMask");
                throw null;
            }
            view4.getLayoutParams().width = dimension;
            android.view.View view5 = this.S;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("rightMask");
                throw null;
            }
            view5.getLayoutParams().width = dimension;
            android.view.View view6 = this.E;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("centerHoleView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = view6.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((android.widget.RelativeLayout.LayoutParams) layoutParams).setMarginStart(dimension);
            android.view.View view7 = this.E;
            if (view7 == null) {
                kotlin.jvm.internal.o.o("centerHoleView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = view7.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((android.widget.RelativeLayout.LayoutParams) layoutParams2).setMarginEnd(dimension);
        }
        android.widget.ImageView imageView = this.f128679v;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("cropBlurView");
            throw null;
        }
        imageView.getLayoutParams().width = this.E1;
        android.widget.ImageView imageView2 = this.f128679v;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("cropBlurView");
            throw null;
        }
        imageView2.getLayoutParams().height = this.F1;
    }

    public final android.graphics.Rect j7(android.graphics.Bitmap bitmap) {
        int width;
        int width2 = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f17 = height;
        float f18 = width2;
        float f19 = f17 / f18;
        jz5.l k76 = k7(f19);
        int intValue = ((java.lang.Number) k76.f302833d).intValue();
        int intValue2 = ((java.lang.Number) k76.f302834e).intValue();
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout = this.f128678u;
        if (cropLayout == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        float f27 = cropLayout.getContentViewScale()[0];
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout2 = this.f128678u;
        if (cropLayout2 == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        float f28 = cropLayout2.getContentViewScale()[1];
        float f29 = intValue / f27;
        float f37 = intValue2 / f28;
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout3 = this.f128678u;
        if (cropLayout3 == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        float f38 = (-cropLayout3.getContentViewTrans()[0]) / f27;
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout4 = this.f128678u;
        if (cropLayout4 == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        float f39 = (-cropLayout4.getContentViewTrans()[1]) / f28;
        float f47 = 2;
        android.graphics.RectF rectF = new android.graphics.RectF((f18 - f29) / f47, (f17 - f37) / f47, (f18 + f29) / f47, (f17 + f37) / f47);
        if (com.tencent.mm.plugin.finder.ui.vd.f129956a[this.J1.ordinal()] == 2) {
            com.tencent.mm.ui.widget.cropview.CropLayout cropLayout5 = this.f128678u;
            if (cropLayout5 == null) {
                kotlin.jvm.internal.o.o("cropLayout");
                throw null;
            }
            width = (cropLayout5.getWidth() - intValue) / 2;
        } else {
            if (f19 > 1.0f) {
                if (f19 < 1.3333334f) {
                    com.tencent.mm.ui.widget.cropview.CropLayout cropLayout6 = this.f128678u;
                    if (cropLayout6 == null) {
                        kotlin.jvm.internal.o.o("cropLayout");
                        throw null;
                    }
                    width = (cropLayout6.getWidth() - intValue) / 2;
                }
                float f48 = f38 - rectF.left;
                android.graphics.Rect rect = new android.graphics.Rect((int) (rectF.left + f48), (int) (rectF.top + f39), (int) (rectF.right + f48), (int) (rectF.bottom + f39));
                com.tencent.mars.xlog.Log.i("Finder.FinderSelectCoverUI", "scaleX:" + f27 + " scaleY:" + f28 + " translateX:" + f38 + " translateY:" + f39 + " mappedWidth:" + f29 + " mappedHeight:" + f37 + " originWidth:" + width2 + " originHeight:" + height);
                return rect;
            }
            width = (y4().x - intValue) / 2;
        }
        f38 += width / f27;
        float f482 = f38 - rectF.left;
        android.graphics.Rect rect2 = new android.graphics.Rect((int) (rectF.left + f482), (int) (rectF.top + f39), (int) (rectF.right + f482), (int) (rectF.bottom + f39));
        com.tencent.mars.xlog.Log.i("Finder.FinderSelectCoverUI", "scaleX:" + f27 + " scaleY:" + f28 + " translateX:" + f38 + " translateY:" + f39 + " mappedWidth:" + f29 + " mappedHeight:" + f37 + " originWidth:" + width2 + " originHeight:" + height);
        return rect2;
    }

    public final jz5.l k7(float f17) {
        int i17;
        int i18;
        if (com.tencent.mm.plugin.finder.ui.vd.f129956a[this.J1.ordinal()] == 2) {
            if (f17 == 1.0f) {
                i17 = this.E1;
            } else if (f17 > 1.0f) {
                i17 = this.E1;
            } else {
                i17 = this.E1;
                i18 = this.F1;
            }
            i18 = i17;
        } else {
            if (f17 == 1.0f) {
                i17 = this.F1;
            } else if (f17 >= 1.0f) {
                i17 = this.E1;
                i18 = this.F1;
            } else if (this.Z == 2) {
                i17 = this.E1;
            } else {
                i17 = this.E1;
                i18 = this.F1;
            }
            i18 = i17;
        }
        return new jz5.l(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public final float l7() {
        return ((java.lang.Number) ((jz5.n) this.f128676p1).getValue()).floatValue();
    }

    public final float m7() {
        return ((java.lang.Number) ((jz5.n) this.f128683x1).getValue()).floatValue();
    }

    public final float n7() {
        return ((java.lang.Number) ((jz5.n) this.f128686y1).getValue()).floatValue();
    }

    public final void o7(android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, int i17, int i18, long j17, r45.b01 b01Var, java.lang.Boolean bool) {
        java.lang.String str;
        r45.c07 c07Var;
        r45.c07 c07Var2;
        boolean b17 = kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE);
        java.util.LinkedList linkedList = this.T;
        if (b17) {
            java.lang.String str2 = com.tencent.mm.plugin.finder.assist.e9.f102146o + "cover_" + java.lang.System.currentTimeMillis();
            if (com.tencent.mm.sdk.platformtools.x.D0(bitmap2, com.tencent.mm.plugin.finder.storage.t70.f127590a.r2(), android.graphics.Bitmap.CompressFormat.JPEG, str2, false)) {
                float width = bitmap2.getHeight() > 0 ? bitmap2.getWidth() / bitmap2.getHeight() : 0.0f;
                com.tencent.mm.plugin.finder.ui.tc tcVar = com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI.S;
                androidx.appcompat.app.AppCompatActivity context = getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                tcVar.c(context, str2, str2, width, this.Z, tcVar.b((r45.mb4) kz5.n0.Z(linkedList)));
                return;
            }
            return;
        }
        java.lang.String str3 = com.tencent.mm.plugin.finder.assist.e9.f102147p;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str4 = str3 + "full_cover_" + currentTimeMillis;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean D0 = com.tencent.mm.sdk.platformtools.x.D0(bitmap, t70Var.r2(), android.graphics.Bitmap.CompressFormat.JPEG, str4, false);
        if (com.tencent.mm.plugin.finder.ui.vd.f129956a[this.J1.ordinal()] == 2) {
            str = str3 + "share_cover_" + currentTimeMillis;
        } else {
            str = str3 + "cover_" + currentTimeMillis;
        }
        boolean D02 = com.tencent.mm.sdk.platformtools.x.D0(bitmap2, t70Var.r2(), android.graphics.Bitmap.CompressFormat.JPEG, str, false);
        int e17 = t70Var.v2() ? com.tencent.mm.plugin.sight.base.AdaptiveAdjustBitrate.e(40, 0, i17, i18, t70Var.r2() / 100.0f) : 0;
        android.content.Intent intent = new android.content.Intent();
        if (D0) {
            intent.putExtra("RESULT_COVER_FULL_PATH", str4);
        }
        if (D02) {
            intent.putExtra("RESULT_COVER_PATH", str);
            intent.putExtra("RESULT_COVER_QUALITY", e17);
            intent.putExtra("RESULT_COVER_TIME_MS", j17);
            intent.putExtra("RESULT_COVER_CROP_MODEL", this.f128675p0.toByteArray());
            intent.putExtra("RESULT_COVER_WORD_INFO_WRAP", b01Var != null ? b01Var.toByteArray() : null);
            if (this.Y) {
                r45.mb4 mb4Var = (r45.mb4) linkedList.getFirst();
                r45.dd4 dd4Var = new r45.dd4();
                r45.dd4 dd4Var2 = (r45.dd4) mb4Var.getCustom(14);
                if (dd4Var2 != null && (c07Var = (r45.c07) dd4Var2.getCustom(6)) != null && (c07Var2 = (r45.c07) dd4Var2.getCustom(0)) != null) {
                    com.tencent.mm.ui.widget.cropview.CropLayout cropLayout = this.f128678u;
                    if (cropLayout == null) {
                        kotlin.jvm.internal.o.o("cropLayout");
                        throw null;
                    }
                    float f17 = cropLayout.getContentViewScale()[0];
                    com.tencent.mm.ui.widget.cropview.CropLayout cropLayout2 = this.f128678u;
                    if (cropLayout2 == null) {
                        kotlin.jvm.internal.o.o("cropLayout");
                        throw null;
                    }
                    float f18 = -cropLayout2.getContentViewTrans()[1];
                    r45.c07 c07Var3 = new r45.c07();
                    c07Var3.set(0, java.lang.Integer.valueOf(c07Var.getInteger(0)));
                    c07Var3.set(2, java.lang.Integer.valueOf(c07Var.getInteger(2)));
                    float f19 = f18 / f17;
                    c07Var3.set(1, java.lang.Integer.valueOf((int) ((c07Var.getInteger(1) - c07Var.getInteger(3)) + f19)));
                    c07Var3.set(3, java.lang.Integer.valueOf((int) f19));
                    dd4Var.set(6, c07Var3);
                    r45.c07 c07Var4 = new r45.c07();
                    c07Var4.set(0, java.lang.Integer.valueOf(c07Var2.getInteger(0)));
                    c07Var4.set(3, java.lang.Integer.valueOf((int) f18));
                    c07Var4.set(1, java.lang.Integer.valueOf(c07Var4.getInteger(3) + java.lang.Math.abs(c07Var2.getInteger(3) - c07Var2.getInteger(1))));
                    c07Var4.set(2, java.lang.Integer.valueOf(c07Var2.getInteger(2)));
                    dd4Var.set(0, c07Var4);
                    com.tencent.mm.ui.widget.cropview.CropLayout cropLayout3 = this.f128678u;
                    if (cropLayout3 == null) {
                        kotlin.jvm.internal.o.o("cropLayout");
                        throw null;
                    }
                    android.graphics.Matrix matrix = new android.graphics.Matrix(cropLayout3.getMainMatrix());
                    matrix.postTranslate(0.0f, 0.0f);
                    float[] fArr = new float[9];
                    matrix.getValues(fArr);
                    r45.s23 s23Var = new r45.s23();
                    s23Var.getList(0).addAll(kz5.z.w0(fArr));
                    dd4Var.set(1, s23Var);
                    com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable localVideoCropInfoParcelable = new com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable();
                    localVideoCropInfoParcelable.f130759d = dd4Var;
                    intent.putExtra("RESULT_CROP_INFO", localVideoCropInfoParcelable);
                }
            }
        }
        this.M1 = true;
        intent.putExtra("key_is_set_cover", true);
        intent.putExtra("RESULT_COVER_STYLE", this.Z);
        intent.putExtra("key_cover_select_source", this.G1);
        setResult(0, intent);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.ArrayList parcelableArrayListExtra;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1001 || i17 == 1002) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_select_mix_media_list")) == null) ? null : (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) kz5.n0.Z(parcelableArrayListExtra);
            if (galleryItem$MediaItem == null && i17 == 1002) {
                x7(true);
                return;
            }
            java.lang.Integer valueOf = galleryItem$MediaItem != null ? java.lang.Integer.valueOf(galleryItem$MediaItem.getType()) : null;
            if (valueOf != null && valueOf.intValue() == 1) {
                getIntent().putExtra("key_full_cover_path", galleryItem$MediaItem.f138430e);
                v7(1, false);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.tencent.mm.R.style.f494400m2);
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setStatusBarColor(-16777216);
        updataStatusBarIcon(true);
        setBackBtn(new com.tencent.mm.plugin.finder.ui.re(this));
        r7();
        initView();
        w7();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.miw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.A1 = (android.widget.FrameLayout) findViewById;
        p7();
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(this);
        this.C1 = f5Var;
        f5Var.f210400e = this;
        i95.m c17 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        dy1.r rVar = (dy1.r) c17;
        android.view.View view = this.A;
        if (view == null) {
            kotlin.jvm.internal.o.o("addTitleLayout");
            throw null;
        }
        ((cy1.a) rVar).pk(view, "cover_add_title_button");
        i95.m c18 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        dy1.r rVar2 = (dy1.r) c18;
        android.view.View view2 = this.A;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("addTitleLayout");
            throw null;
        }
        ((cy1.a) rVar2).ik(view2, 40, 25496);
        i95.m c19 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        dy1.r rVar3 = (dy1.r) c19;
        android.view.View view3 = this.A;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("addTitleLayout");
            throw null;
        }
        jz5.l[] lVarArr = new jz5.l[4];
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context);
        lVarArr[0] = new jz5.l("behaviour_session_id", e17 != null ? e17.f135385q : null);
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context2);
        lVarArr[1] = new jz5.l("finder_context_id", e18 != null ? e18.f135382p : null);
        androidx.appcompat.app.AppCompatActivity context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(context3);
        lVarArr[2] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f135386r : null);
        androidx.appcompat.app.AppCompatActivity context4 = getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(context4);
        lVarArr[3] = new jz5.l("comment_scene", e27 != null ? java.lang.Integer.valueOf(e27.f135380n) : null);
        ((cy1.a) rVar3).gk(view3, kz5.c1.k(lVarArr));
        i95.m c27 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c27, "getService(...)");
        dy1.r rVar4 = (dy1.r) c27;
        android.view.View view4 = this.A;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("addTitleLayout");
            throw null;
        }
        ((cy1.a) rVar4).Ai(view4, new com.tencent.mm.plugin.finder.ui.he(this));
        if (this.K1 && this.J1 == com.tencent.mm.plugin.finder.ui.td.f129875g) {
            com.tencent.mm.ui.widget.cropview.CropLayout cropLayout = this.f128678u;
            if (cropLayout != null) {
                cropLayout.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.finder.ui.ge(this));
            } else {
                kotlin.jvm.internal.o.o("cropLayout");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        cw2.aa aaVar = this.H1;
        if (aaVar != null) {
            aaVar.destroy();
        }
        rm5.k kVar = this.U;
        if (kVar != null) {
            kVar.destroy();
        }
        z7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        android.view.View view = this.A;
        if (view != null) {
            view.post(new com.tencent.mm.plugin.finder.ui.se(this));
        } else {
            kotlin.jvm.internal.o.o("addTitleLayout");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        android.view.View view = this.A;
        if (view != null) {
            view.post(new com.tencent.mm.plugin.finder.ui.te(this));
        } else {
            kotlin.jvm.internal.o.o("addTitleLayout");
            throw null;
        }
    }

    public final void p7() {
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout = this.f128678u;
        if (cropLayout != null) {
            cropLayout.getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.finder.ui.fe(this));
        } else {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
    }

    public final void q7(int i17, int i18) {
        float f17 = i18 / i17;
        if (com.tencent.mm.plugin.finder.ui.vd.f129956a[this.J1.ordinal()] == 2) {
            this.Z = 1;
        } else if (f17 >= 1.0f) {
            this.Z = 1;
        }
        android.view.View view = this.f128680w;
        if (view == null) {
            kotlin.jvm.internal.o.o("cropWayLayout");
            throw null;
        }
        view.setOnClickListener(new com.tencent.mm.plugin.finder.ui.ie(this, f17));
        android.view.View view2 = this.A;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("addTitleLayout");
            throw null;
        }
        view2.setOnClickListener(new com.tencent.mm.plugin.finder.ui.ke(this));
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout = this.f128678u;
        if (cropLayout == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        cropLayout.F();
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout2 = this.f128678u;
        if (cropLayout2 == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        cropLayout2.setEnableTouch(true);
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout3 = this.f128678u;
        if (cropLayout3 == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        cropLayout3.setEnableScale(false);
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout4 = this.f128678u;
        if (cropLayout4 == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        cropLayout4.setEnableOverScroll(false);
        B7(f17, this.Z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r7() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.r7():void");
    }

    public final boolean s7() {
        return this.G1 == 1;
    }

    public final void t7(boolean z17) {
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        qs2.v vVar = qs2.v.f366327a;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        qs2.t.a(vVar, context, null, 1, 1, java.lang.Boolean.TRUE, java.lang.Integer.valueOf(z17 ? 1002 : 1001), 41, false, 128, null);
    }

    public final void u7(boolean z17) {
        dl.y yVar;
        l45.q presenter;
        um.g gVar;
        l45.q presenter2;
        android.graphics.Bitmap h76 = h7();
        if (h76 == null) {
            finish();
            return;
        }
        int width = h76.getWidth();
        int height = h76.getHeight();
        jz5.l k76 = k7(height / width);
        int intValue = ((java.lang.Number) k76.f302833d).intValue();
        int intValue2 = ((java.lang.Number) k76.f302834e).intValue();
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout = this.f128678u;
        java.util.LinkedList linkedList = null;
        if (cropLayout == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        int i17 = 0;
        float f17 = cropLayout.getContentViewScale()[0];
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout2 = this.f128678u;
        if (cropLayout2 == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        float f18 = intValue;
        float f19 = f18 / f17;
        float f27 = intValue2;
        float f28 = f27 / cropLayout2.getContentViewScale()[1];
        android.graphics.Rect j76 = j7(h76);
        boolean z18 = 1 == this.Z;
        if (!z17) {
            C7(width, height, f19, f28, j76, z18);
        }
        int i18 = com.tencent.mm.plugin.finder.storage.t70.f127590a.K2().f71204t;
        int i19 = (int) ((f27 / f18) * i18);
        cw2.aa i76 = i7();
        long currentPositionMs = i76 != null ? i76.getCurrentPositionMs() : 0L;
        com.tencent.mars.xlog.Log.i("Finder.FinderSelectCoverUI", "save cover, size: " + i18 + ", " + i19 + " currentPosMs:" + currentPositionMs);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "onSave", "(Z)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "onSave", "(Z)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.drawBitmap(h76, new android.graphics.Rect(j76.left, j76.top, j76.right, j76.bottom), new android.graphics.Rect(0, 0, i18, i19), (android.graphics.Paint) null);
        ym5.n6 n6Var = this.B1;
        dl.y yVar2 = (n6Var == null || (presenter2 = n6Var.getPresenter()) == null) ? null : (dl.y) ((l45.n) presenter2).d(qk.g6.TEXT);
        if (yVar2 != null && (gVar = (um.g) yVar2.d()) != null) {
            linkedList = new java.util.LinkedList();
            java.util.Iterator it = gVar.f428681d.iterator();
            while (it.hasNext()) {
                xk0.f fVar = (xk0.f) it.next();
                if (fVar instanceof xk0.p) {
                    linkedList.add((xk0.p) fVar);
                }
            }
            gVar.f428681d.size();
            linkedList.size();
        }
        if (linkedList == null || linkedList.isEmpty()) {
            o7(h76, createBitmap, i18, i19, currentPositionMs, null, java.lang.Boolean.valueOf(z17));
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderSelectCoverUI", "gen title size %d", java.lang.Integer.valueOf(linkedList.size()));
        ym5.n6 n6Var2 = this.B1;
        if (n6Var2 != null && (presenter = n6Var2.getPresenter()) != null) {
            ((l45.n) presenter).x(i18, i19);
        }
        if (!z17) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            r45.b01 b01Var = this.f128682x0;
            b01Var.set(0, linkedList2);
            b01Var.set(1, new java.util.LinkedList());
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                xk0.p pVar = (xk0.p) it6.next();
                b01Var.getList(i17).add(pVar.E.toString());
                r45.a01 a01Var = new r45.a01();
                if (yVar2 == null || yVar2.f235041c.width() == 0 || yVar2.f235041c.height() == 0) {
                    yVar = yVar2;
                    a01Var.set(0, java.lang.Float.valueOf(0.5f));
                    a01Var.set(1, java.lang.Float.valueOf(0.5f));
                } else {
                    a01Var.set(0, java.lang.Float.valueOf(pVar.f454955m.x / yVar2.f235041c.width()));
                    a01Var.set(1, java.lang.Float.valueOf(pVar.f454955m.y / yVar2.f235041c.height()));
                    yVar = yVar2;
                }
                a01Var.set(2, java.lang.Integer.valueOf(pVar.C ? 3 : pVar.B != 0 ? 2 : 1));
                java.lang.String format = java.lang.String.format("#%06X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(pVar.A & 16777215)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                a01Var.set(3, format);
                java.lang.String format2 = java.lang.String.format("#%06X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(pVar.B & 16777215)}, 1));
                kotlin.jvm.internal.o.f(format2, "format(...)");
                a01Var.set(4, format2);
                a01Var.set(5, java.lang.Float.valueOf(pVar.f454957o));
                a01Var.set(6, java.lang.Integer.valueOf(pVar.f454956n));
                a01Var.set(7, pVar.E.toString());
                b01Var.getList(1).add(a01Var);
                yVar2 = yVar;
                it6 = it6;
                i17 = 0;
            }
            kz5.g0.t(linkedList, com.tencent.mm.plugin.finder.ui.ae.f128860d);
            java.util.Iterator it7 = linkedList.iterator();
            while (it7.hasNext()) {
                b01Var.getList(0).add(((xk0.p) it7.next()).E.toString());
            }
        }
        qk.o9 o9Var = this.f128688z1;
        if (o9Var != null) {
            o9Var.g(new com.tencent.mm.plugin.finder.ui.ue(this, h76, createBitmap, i18, i19, currentPositionMs, z17, canvas), true);
        }
    }

    public final void v7(int i17, boolean z17) {
        rm5.k kVar;
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout = this.f128678u;
        if (cropLayout == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        cw2.aa i76 = i7();
        cropLayout.removeView(i76 != null ? i76.getView() : null);
        this.Z = 2;
        this.G1 = i17;
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout2 = this.f128678u;
        if (cropLayout2 == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        cropLayout2.post(new com.tencent.mm.plugin.finder.ui.ve(this));
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        r45.s01 s01Var = this.f128675p0;
        s01Var.set(1, valueOf);
        s01Var.set(0, java.lang.Float.valueOf(0.0f));
        s01Var.set(2, java.lang.Float.valueOf(0.0f));
        s01Var.set(3, java.lang.Float.valueOf(0.0f));
        this.V = null;
        this.P1 = true;
        r45.mb4 mb4Var = (r45.mb4) this.T.getFirst();
        if (!hc2.l0.c(mb4Var) && !s7() && (kVar = this.U) != null) {
            cw2.aa i77 = i7();
            kVar.a(kz5.b0.c(java.lang.Long.valueOf(i77 != null ? i77.getCurrentPositionMs() : 0L)), new com.tencent.mm.plugin.finder.ui.we(this, mb4Var));
        }
        if (z17) {
            r7();
        }
        w7();
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        ym5.n6 n6Var = this.B1;
        if (n6Var != null) {
            n6Var.f463357t.postDelayed(new ym5.m6(n6Var, i17), 160L);
        }
    }

    public final void w7() {
        int i17;
        int i18;
        int i19;
        int i27;
        long j17;
        int height;
        r45.y25 y25Var;
        int i28;
        r45.s23 s23Var;
        wo0.c a17;
        boolean z17 = i7() == null;
        java.util.LinkedList linkedList = this.T;
        r45.mb4 mb4Var = (r45.mb4) linkedList.getFirst();
        kotlin.jvm.internal.o.d(mb4Var);
        long integer = mb4Var.getInteger(3) * 1000;
        if (s7()) {
            java.lang.String stringExtra = getIntent().getStringExtra("key_full_cover_path");
            if (i7() == null) {
                androidx.appcompat.app.AppCompatActivity context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                this.I1 = new cw2.x2(context);
            }
            android.view.View view = this.G;
            if (view == null) {
                kotlin.jvm.internal.o.o("selectBtn");
                throw null;
            }
            view.setEnabled(false);
            android.view.View view2 = this.N;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("previewBtn");
                throw null;
            }
            view2.setEnabled(false);
            boolean j18 = com.tencent.mm.vfs.w6.j(stringExtra);
            pf5.u uVar = pf5.u.f353936a;
            if (j18) {
                mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
                i95.m c17 = i95.n0.c(zy2.b6.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                a17 = d1Var.d(ya2.l.f460502a.e(stringExtra, com.tencent.mm.plugin.finder.storage.y90.f128355e));
            } else {
                mn2.d1 d1Var2 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
                java.lang.Object first = linkedList.getFirst();
                kotlin.jvm.internal.o.f(first, "getFirst(...)");
                a17 = d1Var2.a(new mn2.f4((r45.mb4) first, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, 4, null));
            }
            a17.f447873d = new com.tencent.mm.plugin.finder.ui.ee(this, mb4Var);
            a17.f();
            i17 = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479709d4);
            i18 = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479717da);
            i27 = 0;
            i19 = 0;
        } else if (hc2.l0.c(mb4Var)) {
            if (com.tencent.mm.vfs.w6.j(mb4Var.getString(0))) {
                if (i7() == null) {
                    this.H1 = new cw2.q4(this, mb4Var);
                }
                i95.m c18 = i95.n0.c(bg0.v.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(mb4Var.getString(0), true);
                if (d17 != null) {
                    integer = d17.f162382a;
                } else {
                    com.tencent.mars.xlog.Log.w("Finder.FinderSelectCoverUI", "initView: mediaInfo null");
                }
                i95.m c19 = i95.n0.c(bg0.v.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                com.tencent.mm.plugin.sight.base.b c27 = j33.s.f297456a.c(mb4Var.getString(0));
                int i29 = c27.f162384c;
                int i37 = c27.f162385d;
                com.tencent.mars.xlog.Log.i("Finder.FinderSelectCoverUI", "1 videoWidth=" + i29 + " videoHeight=" + i37 + " media.width=" + mb4Var.getFloat(4) + " media.height=" + mb4Var.getFloat(5));
                i18 = i37;
                i17 = i29;
            } else {
                if (i7() == null) {
                    this.H1 = new cw2.w4(this, mb4Var);
                }
                int i38 = (int) mb4Var.getFloat(4);
                int i39 = (int) mb4Var.getFloat(5);
                com.tencent.mars.xlog.Log.i("Finder.FinderSelectCoverUI", "2 videoWidth=" + i38 + " videoHeight=" + i39 + " media.width=" + mb4Var.getFloat(4) + " media.height=" + mb4Var.getFloat(5));
                i17 = i38;
                i18 = i39;
            }
            i27 = (int) m7();
            i19 = (int) l7();
        } else {
            r45.h70 h70Var = (r45.h70) mb4Var.getCustom(21);
            if (h70Var != null) {
                r45.i70 i70Var = h70Var.f375902i;
                if (i70Var.A == null) {
                    r45.vl5 vl5Var = i70Var.f376778g;
                    r45.bb1 bb1Var = (r45.bb1) mb4Var.getCustom(34);
                    if (bb1Var != null && java.lang.Math.abs(bb1Var.getFloat(2) - bb1Var.getFloat(0)) > 0.0f && java.lang.Math.abs(bb1Var.getFloat(1) - bb1Var.getFloat(3)) > 0.0f) {
                        vl5Var.f388350d.set(0, java.lang.Integer.valueOf((int) bb1Var.getFloat(0)));
                        vl5Var.f388350d.set(1, java.lang.Integer.valueOf((int) bb1Var.getFloat(1)));
                        vl5Var.f388350d.set(2, java.lang.Integer.valueOf((int) bb1Var.getFloat(2)));
                        vl5Var.f388350d.set(3, java.lang.Integer.valueOf((int) bb1Var.getFloat(3)));
                    }
                    java.lang.Object obj = vl5Var.f388350d.get(0);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    int intValue = ((java.lang.Number) obj).intValue();
                    java.lang.Object obj2 = vl5Var.f388350d.get(1);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    int intValue2 = ((java.lang.Number) obj2).intValue();
                    java.lang.Object obj3 = vl5Var.f388350d.get(2);
                    kotlin.jvm.internal.o.f(obj3, "get(...)");
                    int intValue3 = ((java.lang.Number) obj3).intValue();
                    java.lang.Object obj4 = vl5Var.f388350d.get(3);
                    kotlin.jvm.internal.o.f(obj4, "get(...)");
                    android.graphics.Rect rect = new android.graphics.Rect(intValue, intValue2, intValue3, ((java.lang.Number) obj4).intValue());
                    j17 = h70Var.f375899f - h70Var.f375898e;
                    r45.i70 i70Var2 = h70Var.f375902i;
                    i17 = i70Var2 != null ? i70Var2.f376780i : 0;
                    height = (rect.height() * i17) / rect.width();
                    mb4Var.set(5, java.lang.Float.valueOf((mb4Var.getFloat(4) * rect.height()) / rect.width()));
                    com.tencent.mars.xlog.Log.i("Finder.FinderSelectCoverUI", "3 videoWidth=" + i17 + " videoHeight=" + height + " media.width=" + mb4Var.getFloat(4) + " media.height=" + mb4Var.getFloat(5));
                } else {
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    i95.m c28 = i95.n0.c(bg0.v.class);
                    kotlin.jvm.internal.o.f(c28, "getService(...)");
                    com.tencent.mm.plugin.vlog.model.x.f(h70Var.f375902i.A.f390730d, rect2);
                    com.tencent.mars.xlog.Log.i("Finder.FinderSelectCoverUI", "originRect: " + rect2);
                    j17 = h70Var.f375899f - h70Var.f375898e;
                    r45.i70 i70Var3 = h70Var.f375902i;
                    i17 = (i70Var3 == null || (y25Var = i70Var3.A) == null) ? 0 : y25Var.f390731e;
                    height = (rect2.height() * i17) / rect2.width();
                    mb4Var.set(5, java.lang.Float.valueOf((mb4Var.getFloat(4) * rect2.height()) / rect2.width()));
                    com.tencent.mars.xlog.Log.i("Finder.FinderSelectCoverUI", "4 videoWidth=" + i17 + " videoHeight=" + height + " media.width=" + mb4Var.getFloat(4) + " media.height=" + mb4Var.getFloat(5));
                }
                i18 = height;
                integer = j17;
            } else {
                i17 = 0;
                i18 = 0;
            }
            if (i7() == null) {
                this.H1 = new cw2.l0(this, mb4Var);
            }
            float f17 = i17;
            float f18 = i18;
            float max = java.lang.Math.max(m7() / f17, l7() / f18);
            int i47 = (int) (f17 * max);
            i19 = (int) (f18 * max);
            i27 = i47;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderSelectCoverUI", "videoThumbWidth=" + i27 + " videoThumbHeight=" + i19);
        java.lang.Long valueOf = java.lang.Long.valueOf(integer);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i27);
        java.lang.Integer valueOf5 = java.lang.Integer.valueOf(i19);
        long longValue = valueOf.longValue();
        int intValue4 = valueOf2.intValue();
        int intValue5 = valueOf3.intValue();
        int intValue6 = valueOf4.intValue();
        int intValue7 = valueOf5.intValue();
        if (!s7()) {
            q7(intValue4, intValue5);
            r45.dd4 dd4Var = (r45.dd4) mb4Var.getCustom(14);
            if (dd4Var != null) {
                i28 = 1;
                s23Var = (r45.s23) dd4Var.getCustom(1);
            } else {
                i28 = 1;
                s23Var = null;
            }
            if (s23Var != null) {
                r45.dd4 dd4Var2 = (r45.dd4) mb4Var.getCustom(14);
                r45.s23 s23Var2 = dd4Var2 != null ? (r45.s23) dd4Var2.getCustom(i28) : null;
                if (s23Var2 != null && s23Var2.getList(0).size() == 9) {
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    java.util.LinkedList list = s23Var2.getList(0);
                    kotlin.jvm.internal.o.f(list, "getValue(...)");
                    matrix.setValues(kz5.n0.P0(list));
                    cw2.aa i76 = i7();
                    android.view.View view3 = i76 != null ? i76.getView() : null;
                    if (view3 != null) {
                        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout = this.f128678u;
                        if (cropLayout == null) {
                            kotlin.jvm.internal.o.o("cropLayout");
                            throw null;
                        }
                        cropLayout.G(view3, intValue4, intValue5, new android.graphics.Matrix(), ml5.k.f328430d, com.tencent.mm.plugin.finder.ui.gf.f129299d);
                    }
                }
            } else {
                cw2.aa i77 = i7();
                android.view.View view4 = i77 != null ? i77.getView() : null;
                if (view4 != null) {
                    com.tencent.mm.ui.widget.cropview.CropLayout cropLayout2 = this.f128678u;
                    if (cropLayout2 == null) {
                        kotlin.jvm.internal.o.o("cropLayout");
                        throw null;
                    }
                    cropLayout2.G(view4, intValue4, intValue5, new android.graphics.Matrix(), ml5.k.f328430d, com.tencent.mm.plugin.finder.ui.hf.f129327d);
                }
            }
            p7();
            if (z17) {
                android.widget.SeekBar seekBar = this.F;
                if (seekBar == null) {
                    kotlin.jvm.internal.o.o("seekBar");
                    throw null;
                }
                seekBar.setMax(longValue > 0 ? (int) longValue : 1);
                this.S1 = 0L;
                this.T1 = longValue;
                this.U1 = longValue > 0 ? longValue : 1L;
                this.X1 = mb4Var;
                this.Y1 = intValue6;
                this.Z1 = intValue7;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fineTuning] fetchThumbs durationMs=");
                sb6.append(longValue);
                sb6.append(" seekBar.max=");
                android.widget.SeekBar seekBar2 = this.F;
                if (seekBar2 == null) {
                    kotlin.jvm.internal.o.o("seekBar");
                    throw null;
                }
                sb6.append(seekBar2.getMax());
                sb6.append(" isNormalVideo=");
                sb6.append(hc2.l0.c(mb4Var));
                sb6.append(" thumbW=");
                sb6.append(intValue6);
                sb6.append(" thumbH=");
                sb6.append(intValue7);
                com.tencent.mars.xlog.Log.i("Finder.FinderSelectCoverUI", sb6.toString());
                android.widget.SeekBar seekBar3 = this.F;
                if (seekBar3 == null) {
                    kotlin.jvm.internal.o.o("seekBar");
                    throw null;
                }
                seekBar3.setVisibility(4);
                android.widget.SeekBar seekBar4 = this.F;
                if (seekBar4 == null) {
                    kotlin.jvm.internal.o.o("seekBar");
                    throw null;
                }
                seekBar4.setEnabled(false);
                this.U = null;
                g7(mb4Var, intValue6, intValue7, 0L, longValue, true);
                long longExtra = getIntent().getLongExtra("cover_time_ms", 0L);
                cw2.aa i78 = i7();
                if (i78 != null) {
                    i78.a(new com.tencent.mm.plugin.finder.ui.qf(this, longExtra, longValue, mb4Var), new com.tencent.mm.plugin.finder.ui.rf(this), new com.tencent.mm.plugin.finder.ui.tf(mb4Var, this));
                }
            }
            if (this.N1) {
                cw2.aa i79 = i7();
                android.view.View view5 = i79 != null ? i79.getView() : null;
                if (view5 != null) {
                    view5.post(new com.tencent.mm.plugin.finder.ui.ye(this, longValue));
                }
                this.N1 = false;
            }
        }
        this.D1 = (int) (longValue / 1000);
        android.view.View view6 = this.H;
        if (view6 == null) {
            kotlin.jvm.internal.o.o("selectAlbumBtn");
            throw null;
        }
        view6.setOnClickListener(new com.tencent.mm.plugin.finder.ui.ze(this));
        android.view.View view7 = this.H;
        if (view7 == null) {
            kotlin.jvm.internal.o.o("selectAlbumBtn");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view7, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view8 = this.I;
        if (view8 == null) {
            kotlin.jvm.internal.o.o("selectFromVideoBtn");
            throw null;
        }
        view8.setOnClickListener(new com.tencent.mm.plugin.finder.ui.af(this));
        android.view.View view9 = this.L;
        if (view9 == null) {
            kotlin.jvm.internal.o.o("thumbImageRemoveBtn");
            throw null;
        }
        view9.setOnClickListener(new com.tencent.mm.plugin.finder.ui.bf(this));
        if (s7()) {
            android.view.View view10 = this.K;
            if (view10 == null) {
                kotlin.jvm.internal.o.o("thumbImageContainer");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view10, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "refreshThumbView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "refreshThumbView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view11 = this.M;
            if (view11 == null) {
                kotlin.jvm.internal.o.o("seekBarContainer");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view11, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "refreshThumbView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "refreshThumbView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view12 = this.I;
            if (view12 == null) {
                kotlin.jvm.internal.o.o("selectFromVideoBtn");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view12, arrayList4.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "refreshThumbView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view12, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "refreshThumbView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view13 = this.M;
        if (view13 == null) {
            kotlin.jvm.internal.o.o("seekBarContainer");
            throw null;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view13, arrayList5.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "refreshThumbView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view13.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view13, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "refreshThumbView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view14 = this.K;
        if (view14 == null) {
            kotlin.jvm.internal.o.o("thumbImageContainer");
            throw null;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view14, arrayList6.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "refreshThumbView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view14.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view14, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "refreshThumbView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view15 = this.I;
        if (view15 == null) {
            kotlin.jvm.internal.o.o("selectFromVideoBtn");
            throw null;
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view15, arrayList7.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "refreshThumbView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view15.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view15, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI", "refreshThumbView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void x7(boolean z17) {
        v7(0, z17);
        r45.mb4 mb4Var = (r45.mb4) this.T.getFirst();
        if (hc2.l0.c(mb4Var)) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.ui.cf(this, mb4Var));
    }

    public final android.graphics.Point y4() {
        return (android.graphics.Point) ((jz5.n) this.f128674l1).getValue();
    }

    public final void y7(int i17, android.graphics.Rect rect, java.util.Stack stack) {
        if (stack == null) {
            return;
        }
        java.util.Iterator it = stack.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            xk0.f fVar = (xk0.f) it.next();
            fVar.f454955m.y -= i17;
            android.graphics.Rect rect2 = new android.graphics.Rect();
            fVar.r(rect2, false);
            int i18 = rect2.top;
            int i19 = rect2.bottom;
            float f17 = i18;
            if (f17 < 0.0f) {
                fVar.f454955m.y -= f17;
            } else if (i19 > rect.height()) {
                fVar.f454955m.y -= i19 - rect.height();
            }
            fVar.w(false);
        }
    }

    public final void z7() {
        l45.q presenter;
        l45.q presenter2;
        bn5.o oVar;
        qk.l9 l9Var;
        android.graphics.Rect rect;
        qk.o9 o9Var = this.f128688z1;
        f128668e2 = (o9Var == null || (l9Var = o9Var.f364302a) == null || (rect = l9Var.f364236f) == null) ? 0 : rect.top;
        ym5.n6 n6Var = this.B1;
        if (n6Var != null && (oVar = (bn5.o) n6Var.getBaseBoardView()) != null) {
            oVar.j();
        }
        ym5.n6 n6Var2 = this.B1;
        dl.y yVar = (n6Var2 == null || (presenter2 = n6Var2.getPresenter()) == null) ? null : (dl.y) ((l45.n) presenter2).d(qk.g6.TEXT);
        if (yVar == null) {
            return;
        }
        um.g gVar = (um.g) yVar.d();
        if (gVar != null) {
            gVar.A3(true);
        }
        um.g gVar2 = (um.g) yVar.d();
        if (gVar2 != null) {
            gVar2.A3(false);
        }
        yVar.z();
        ym5.n6 n6Var3 = this.B1;
        if (n6Var3 == null || (presenter = n6Var3.getPresenter()) == null) {
            return;
        }
        ((l45.n) presenter).f316482w = false;
    }
}
