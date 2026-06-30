package com.tencent.mm.plugin.scanner.ui.scangoods.widget;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aB#\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\u0012\u0010\u0014\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView;", "Lcom/tencent/mm/plugin/scanner/view/BaseScanMaskView;", "Lcom/tencent/mm/plugin/scanner/api/ScanGoodsRequest;", "Luy3/s;", "Luy3/u;", "Landroid/graphics/Point;", "getPreviewImageSize", "request", "Ljz5/f0;", "setCustomTipsWording", "Landroid/graphics/Bitmap;", "bitmap", "setCustomBackgroundBitmap", "", "translationY", "setBackgroundTransY", "getBackgroundTransY", "setMarkViewTransY", "getMarkViewTransY", "getMarkViewHeight", "setScanRequest", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class ScanGoodsMaskView extends com.tencent.mm.plugin.scanner.view.BaseScanMaskView<com.tencent.mm.plugin.scanner.api.ScanGoodsRequest> implements uy3.s, uy3.u {
    public static final /* synthetic */ int A1 = 0;
    public android.widget.ImageView A;
    public android.widget.ImageView B;
    public android.widget.ImageView C;
    public android.view.View D;
    public boolean E;
    public android.widget.ImageView F;
    public android.widget.ImageView G;
    public android.widget.LinearLayout H;
    public android.widget.LinearLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.ImageView f159635J;
    public android.widget.TextView K;
    public final java.util.ArrayList L;
    public long M;
    public int N;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public android.graphics.Bitmap U;
    public android.graphics.Bitmap V;
    public final android.view.animation.LinearInterpolator W;

    /* renamed from: l1, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f159636l1;

    /* renamed from: p0, reason: collision with root package name */
    public final android.view.animation.DecelerateInterpolator f159637p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.os.Vibrator f159638p1;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanAnimationDotsView f159639x;

    /* renamed from: x0, reason: collision with root package name */
    public final boolean f159640x0;

    /* renamed from: x1, reason: collision with root package name */
    public java.util.TimerTask f159641x1;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f159642y;

    /* renamed from: y0, reason: collision with root package name */
    public final boolean f159643y0;

    /* renamed from: y1, reason: collision with root package name */
    public wu5.c f159644y1;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f159645z;

    /* renamed from: z1, reason: collision with root package name */
    public u3.u f159646z1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScanGoodsMaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final android.graphics.Point getPreviewImageSize() {
        android.graphics.Bitmap bitmap = this.V;
        if (bitmap != null) {
            kotlin.jvm.internal.o.d(bitmap);
            if (!bitmap.isRecycled()) {
                try {
                    kotlin.jvm.internal.o.d(this.V);
                    kotlin.jvm.internal.o.d(this.V);
                    float width = (r0.getWidth() * 1.0f) / r3.getHeight();
                    if (width < (getMeasuredWidth() * 1.0f) / getMeasuredHeight()) {
                        int measuredHeight = getMeasuredHeight();
                        return new android.graphics.Point((int) (width * measuredHeight), measuredHeight);
                    }
                    int measuredWidth = getMeasuredWidth();
                    return new android.graphics.Point(measuredWidth, (int) (measuredWidth / width));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanGoodsMaskView", e17, "getPreviewImageSize exception", new java.lang.Object[0]);
                    return new android.graphics.Point(0, 0);
                }
            }
        }
        return new android.graphics.Point(0, 0);
    }

    private final void setCustomBackgroundBitmap(android.graphics.Bitmap bitmap) {
        c04.x xVar = new c04.x(bitmap, this);
        if (this.N == 0 || this.P == 0) {
            this.L.add(xVar);
        } else {
            xVar.run();
        }
    }

    private final void setCustomTipsWording(com.tencent.mm.plugin.scanner.api.ScanGoodsRequest scanGoodsRequest) {
        java.lang.String str = scanGoodsRequest.f158674s;
        if (str == null || str.length() == 0) {
            android.widget.TextView textView = this.K;
            if (textView != null) {
                textView.setText(getContext().getResources().getString(com.tencent.mm.R.string.i9t));
                return;
            } else {
                kotlin.jvm.internal.o.o("customTipsWording");
                throw null;
            }
        }
        android.widget.TextView textView2 = this.K;
        if (textView2 != null) {
            textView2.setText(scanGoodsRequest.f158674s);
        } else {
            kotlin.jvm.internal.o.o("customTipsWording");
            throw null;
        }
    }

    public static final void v(com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView scanGoodsMaskView, java.lang.String str) {
        scanGoodsMaskView.getClass();
        android.graphics.Bitmap a17 = com.tencent.mm.plugin.scanner.model.n1.f158959a.a(str);
        if (a17 == null || a17.isRecycled()) {
            scanGoodsMaskView.w();
        } else {
            scanGoodsMaskView.setCustomBackgroundBitmap(a17);
        }
    }

    @Override // uy3.u
    public void a(int i17, float f17, float f18) {
    }

    @Override // uy3.u
    public void b() {
    }

    @Override // uy3.u
    public void c() {
    }

    @Override // uy3.u
    public void d(int i17, float f17, float f18) {
        boolean z17;
        float max = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, f18));
        if (i17 == 1 || i17 == 2) {
            android.view.animation.DecelerateInterpolator decelerateInterpolator = this.f159637p0;
            if (max >= 0.5f && i17 == 1) {
                z17 = this.R;
                float f19 = (max - 0.5f) / 0.5f;
                android.widget.ImageView imageView = this.C;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("blurView");
                    throw null;
                }
                imageView.setAlpha(decelerateInterpolator.getInterpolation(f19));
                android.view.View view = this.f159642y;
                if (view == null) {
                    kotlin.jvm.internal.o.o("successMarkView");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(1.0f - f19));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.widget.ImageView imageView2 = this.B;
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
                    throw null;
                }
                android.widget.ImageView imageView3 = this.C;
                if (imageView3 == null) {
                    kotlin.jvm.internal.o.o("blurView");
                    throw null;
                }
                imageView2.setAlpha(1.0f - imageView3.getAlpha());
            } else if (i17 == 2) {
                z17 = this.R;
                android.widget.ImageView imageView4 = this.C;
                if (imageView4 == null) {
                    kotlin.jvm.internal.o.o("blurView");
                    throw null;
                }
                imageView4.setAlpha(decelerateInterpolator.getInterpolation(max));
                android.view.View view2 = this.f159642y;
                if (view2 == null) {
                    kotlin.jvm.internal.o.o("successMarkView");
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(1.0f - max));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.widget.ImageView imageView5 = this.B;
                if (imageView5 == null) {
                    kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
                    throw null;
                }
                android.widget.ImageView imageView6 = this.C;
                if (imageView6 == null) {
                    kotlin.jvm.internal.o.o("blurView");
                    throw null;
                }
                imageView5.setAlpha(1.0f - imageView6.getAlpha());
            } else {
                android.view.View view3 = this.f159642y;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("successMarkView");
                    throw null;
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.widget.ImageView imageView7 = this.B;
                if (imageView7 == null) {
                    kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
                    throw null;
                }
                imageView7.setAlpha(1.0f);
                z17 = false;
            }
            android.view.View view4 = this.f159645z;
            if (view4 == null) {
                kotlin.jvm.internal.o.o("maskView");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(0.5f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            android.view.View view5 = this.f159645z;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("maskView");
                throw null;
            }
            float max2 = java.lang.Math.max(0.0f, java.lang.Math.min(0.5f, 1.0f - max));
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList5.add(java.lang.Float.valueOf(max2));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            if (this.S) {
                if (this.T) {
                    float max3 = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, (f18 - 0.5f) / 0.5f));
                    android.widget.ImageView imageView8 = this.B;
                    if (imageView8 == null) {
                        kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
                        throw null;
                    }
                    imageView8.setAlpha(1.0f - max3);
                    android.widget.ImageView imageView9 = this.B;
                    if (imageView9 == null) {
                        kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
                        throw null;
                    }
                    imageView9.getAlpha();
                } else {
                    android.widget.ImageView imageView10 = this.B;
                    if (imageView10 == null) {
                        kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
                        throw null;
                    }
                    imageView10.setAlpha(1.0f);
                }
            }
            z17 = false;
        }
        android.widget.ImageView imageView11 = this.C;
        if (imageView11 == null) {
            kotlin.jvm.internal.o.o("blurView");
            throw null;
        }
        imageView11.setVisibility(z17 ? 0 : 8);
        android.view.View view6 = this.f159645z;
        if (view6 == null) {
            kotlin.jvm.internal.o.o("maskView");
            throw null;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView", "onDialogVerticalMoved", "(IFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView12 = this.C;
        if (imageView12 == null) {
            kotlin.jvm.internal.o.o("blurView");
            throw null;
        }
        imageView12.getAlpha();
        android.view.View view7 = this.f159642y;
        if (view7 == null) {
            kotlin.jvm.internal.o.o("successMarkView");
            throw null;
        }
        view7.getAlpha();
        android.view.View view8 = this.f159645z;
        if (view8 == null) {
            kotlin.jvm.internal.o.o("maskView");
            throw null;
        }
        view8.getAlpha();
        android.widget.ImageView imageView13 = this.B;
        if (imageView13 != null) {
            imageView13.getAlpha();
        } else {
            kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
            throw null;
        }
    }

    @Override // uy3.u
    public void e() {
    }

    @Override // uy3.u
    public void f() {
    }

    @Override // com.tencent.mm.plugin.scanner.view.BaseScanMaskView, com.tencent.mm.plugin.scanner.view.b
    public void g(android.animation.Animator.AnimatorListener animatorListener) {
        super.g(animatorListener);
        try {
            u3.u uVar = this.f159646z1;
            if (uVar != null) {
                uVar.b();
            }
            java.util.TimerTask timerTask = this.f159641x1;
            if (timerTask != null) {
                timerTask.cancel();
            }
            wu5.c cVar = this.f159644y1;
            if (cVar != null) {
                cVar.cancel(false);
            }
        } catch (java.lang.Exception unused) {
        }
        e04.i3.a(this, 1.0f, 0.0f, 200L, animatorListener);
    }

    @Override // uy3.s
    public float getBackgroundTransY() {
        android.view.View view = this.D;
        if (view != null) {
            return view.getTranslationY();
        }
        return 0.0f;
    }

    @Override // uy3.s
    public float getMarkViewHeight() {
        return this.Q;
    }

    @Override // uy3.s
    public float getMarkViewTransY() {
        android.view.View view = this.f159642y;
        if (view != null) {
            return view.getTranslationY();
        }
        kotlin.jvm.internal.o.o("successMarkView");
        throw null;
    }

    @Override // uy3.u
    public void h() {
    }

    @Override // com.tencent.mm.plugin.scanner.view.BaseScanMaskView
    public void i(android.view.View view) {
        this.D = view;
        getMScanSource();
        if (view instanceof android.view.TextureView) {
            if (getMScanSource() == 1) {
                ((ku5.t0) ku5.t0.f312615d).g(new c04.a0(this, (android.view.TextureView) view));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
    
        if (r4.getVisibility() == 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    @Override // com.tencent.mm.plugin.scanner.view.BaseScanMaskView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(boolean r9) {
        /*
            r8 = this;
            super.m(r9)
            c04.p r0 = new c04.p
            r0.<init>(r8, r9)
            android.widget.ImageView r9 = r8.C
            java.lang.String r1 = "blurView"
            r2 = 0
            if (r9 == 0) goto Lc3
            int r9 = r9.getVisibility()
            java.lang.String r3 = "bottomBlurView"
            java.lang.String r4 = "previewImage"
            if (r9 == 0) goto L3b
            android.widget.ImageView r9 = r8.B
            if (r9 == 0) goto L37
            int r9 = r9.getVisibility()
            if (r9 == 0) goto L3b
            android.widget.ImageView r9 = r8.A
            if (r9 == 0) goto L33
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L2e
            goto L3b
        L2e:
            r0.invoke()
            goto Lb6
        L33:
            kotlin.jvm.internal.o.o(r3)
            throw r2
        L37:
            kotlin.jvm.internal.o.o(r4)
            throw r2
        L3b:
            android.widget.ImageView r9 = r8.B
            if (r9 == 0) goto Lbf
            float r9 = r9.getAlpha()
            r5 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            r6 = 1
            r7 = 0
            if (r9 != 0) goto L4d
            r9 = r6
            goto L4e
        L4d:
            r9 = r7
        L4e:
            if (r9 == 0) goto L60
            android.widget.ImageView r9 = r8.B
            if (r9 == 0) goto L5c
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L60
            r9 = r6
            goto L61
        L5c:
            kotlin.jvm.internal.o.o(r4)
            throw r2
        L60:
            r9 = r7
        L61:
            android.widget.ImageView r4 = r8.A
            if (r4 == 0) goto Lbb
            float r4 = r4.getAlpha()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L6f
            r4 = r6
            goto L70
        L6f:
            r4 = r7
        L70:
            if (r4 == 0) goto L81
            android.widget.ImageView r4 = r8.A
            if (r4 == 0) goto L7d
            int r3 = r4.getVisibility()
            if (r3 != 0) goto L81
            goto L82
        L7d:
            kotlin.jvm.internal.o.o(r3)
            throw r2
        L81:
            r6 = r7
        L82:
            android.widget.ImageView r3 = r8.C
            if (r3 == 0) goto Lb7
            android.view.ViewPropertyAnimator r1 = r3.animate()
            if (r1 == 0) goto Lb6
            r2 = 0
            android.view.ViewPropertyAnimator r1 = r1.alpha(r2)
            if (r1 == 0) goto Lb6
            r2 = 300(0x12c, double:1.48E-321)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
            if (r1 == 0) goto Lb6
            android.view.animation.LinearInterpolator r2 = r8.W
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r2)
            if (r1 == 0) goto Lb6
            c04.i r2 = new c04.i
            r2.<init>(r0)
            android.view.ViewPropertyAnimator r0 = r1.setListener(r2)
            if (r0 == 0) goto Lb6
            c04.j r1 = new c04.j
            r1.<init>(r8, r9, r6)
            r0.setUpdateListener(r1)
        Lb6:
            return
        Lb7:
            kotlin.jvm.internal.o.o(r1)
            throw r2
        Lbb:
            kotlin.jvm.internal.o.o(r3)
            throw r2
        Lbf:
            kotlin.jvm.internal.o.o(r4)
            throw r2
        Lc3:
            kotlin.jvm.internal.o.o(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView.m(boolean):void");
    }

    @Override // com.tencent.mm.plugin.scanner.view.BaseScanMaskView
    public void o(java.lang.Object data, com.tencent.mm.plugin.scanner.view.w0 w0Var) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsMaskView", "onScanSuccess");
        if (this.f159640x0) {
            ((ku5.t0) ku5.t0.f312615d).g(new c04.q(this));
        }
        if (this.f159643y0) {
            postDelayed(new c04.r(this), 100L);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.N = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.P = measuredHeight;
        if (this.N == 0 || measuredHeight == 0) {
            return;
        }
        java.util.ArrayList arrayList = this.L;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        arrayList.clear();
    }

    @Override // com.tencent.mm.plugin.scanner.view.BaseScanMaskView, com.tencent.mm.plugin.scanner.view.b
    public void release() {
        com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanAnimationDotsView scanAnimationDotsView = this.f159639x;
        if (scanAnimationDotsView == null) {
            kotlin.jvm.internal.o.o("animationDotsView");
            throw null;
        }
        c04.f fVar = scanAnimationDotsView.f159632d;
        if (fVar != null) {
            ((c04.b) fVar).a();
            java.util.ArrayList arrayList = c04.b.f37670e;
            java.util.Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                c04.g gVar = (c04.g) ((c04.d) it.next());
                gVar.f37672a = 0;
                gVar.getClass();
                throw null;
            }
            arrayList.clear();
        }
        com.tencent.mm.plugin.scanner.model.n1 n1Var = com.tencent.mm.plugin.scanner.model.n1.f158959a;
        long j17 = this.M;
        java.util.HashMap hashMap = com.tencent.mm.plugin.scanner.model.n1.f158961c;
        com.tencent.mm.plugin.scanner.api.ScanGoodsRequest scanGoodsRequest = (com.tencent.mm.plugin.scanner.api.ScanGoodsRequest) hashMap.get(java.lang.Long.valueOf(j17));
        hashMap.remove(java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.scanner.model.n1.f158960b.remove(java.lang.Long.valueOf(j17));
        if (scanGoodsRequest != null) {
            java.lang.String format = java.lang.String.format("deco:%s,succ:%s,tips:%s", java.util.Arrays.copyOf(new java.lang.Object[]{scanGoodsRequest.f158671p, scanGoodsRequest.f158672q, scanGoodsRequest.f158673r}, 3));
            kotlin.jvm.internal.o.f(format, "format(...)");
            com.tencent.mm.plugin.scanner.model.n1.f158963e.put(format, java.lang.Boolean.TRUE);
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.scanner.model.m1 m1Var = new com.tencent.mm.plugin.scanner.model.m1(format, scanGoodsRequest);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.w(m1Var, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, "ScanResourceTag");
        }
        try {
            u3.u uVar = this.f159646z1;
            if (uVar != null) {
                uVar.b();
            }
            java.util.TimerTask timerTask = this.f159641x1;
            if (timerTask != null) {
                timerTask.cancel();
            }
            wu5.c cVar = this.f159644y1;
            if (cVar != null) {
                cVar.cancel(false);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.mm.plugin.scanner.view.BaseScanMaskView
    public void s() {
        super.s();
    }

    @Override // uy3.s
    public void setBackgroundTransY(float f17) {
        android.view.View view = this.D;
        if (view != null) {
            view.setTranslationY(f17);
        }
        android.widget.ImageView imageView = this.C;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("blurView");
            throw null;
        }
        imageView.setTranslationY(f17);
        android.widget.ImageView imageView2 = this.B;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o(com.tencent.mm.plugin.appbrand.jsapi.media.i6.NAME);
            throw null;
        }
        imageView2.setTranslationY(f17);
        android.widget.ImageView imageView3 = this.A;
        if (imageView3 != null) {
            imageView3.setTranslationY(f17);
        } else {
            kotlin.jvm.internal.o.o("bottomBlurView");
            throw null;
        }
    }

    @Override // uy3.s
    public void setMarkViewTransY(float f17) {
        android.view.View view = this.f159642y;
        if (view != null) {
            view.setTranslationY(f17);
        } else {
            kotlin.jvm.internal.o.o("successMarkView");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.scanner.view.BaseScanMaskView
    public void t(boolean z17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (z17) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f159636l1;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            this.f159636l1 = db5.e1.Q(getContext(), "", getResources().getString(com.tencent.mm.R.string.i_q), false, true, onCancelListener);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f159636l1;
        if (u3Var2 != null) {
            u3Var2.dismiss();
        }
    }

    public final void w() {
        com.tencent.mars.xlog.Log.e("MicroMsg.ScanGoodsMaskView", "onShowCustomViewFailed");
        this.E = false;
        android.widget.LinearLayout linearLayout = this.I;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("customTipsImageContainer");
            throw null;
        }
        linearLayout.setVisibility(8);
        android.widget.ImageView imageView = this.F;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("customMaskView");
            throw null;
        }
        imageView.setVisibility(8);
        android.widget.ImageView imageView2 = this.F;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("customMaskView");
            throw null;
        }
        imageView2.setImageBitmap(null);
        if (getRequest() instanceof com.tencent.mm.plugin.scanner.api.ScanGoodsRequest) {
            com.tencent.mm.plugin.scanner.api.BaseScanRequest request = getRequest();
            kotlin.jvm.internal.o.e(request, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.api.ScanGoodsRequest");
            com.tencent.mm.plugin.scanner.model.h2 h2Var = com.tencent.mm.plugin.scanner.model.h2.f158920a;
            if (((com.tencent.mm.plugin.scanner.api.ScanGoodsRequest) request).f158668m == 5) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 110);
            }
        }
    }

    public final void x() {
        android.graphics.Bitmap bitmap = this.U;
        if (bitmap != null) {
            kotlin.jvm.internal.o.d(bitmap);
            if (bitmap.isRecycled()) {
                return;
            }
            android.graphics.Bitmap bitmap2 = this.U;
            kotlin.jvm.internal.o.d(bitmap2);
            bitmap2.recycle();
            this.U = null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanGoodsMaskView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.lang.Object systemService;
        kotlin.jvm.internal.o.g(context, "context");
        this.L = new java.util.ArrayList();
        this.Q = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a9f);
        getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a9a);
        this.W = new android.view.animation.LinearInterpolator();
        this.f159637p0 = new android.view.animation.DecelerateInterpolator();
        this.f159640x0 = true;
        this.f159643y0 = true;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bou, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.m_a);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f159639x = (com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanAnimationDotsView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f486733ma3);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f159642y = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.l3s);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.A = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.l3r);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.C = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.jcb);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f159645z = findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.f486407l44);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.B = (android.widget.ImageView) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.cox);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.F = (android.widget.ImageView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.cpd);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.G = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.nro);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.view.View findViewById10 = inflate.findViewById(com.tencent.mm.R.id.f484009cp2);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.H = (android.widget.LinearLayout) findViewById10;
        android.view.View findViewById11 = inflate.findViewById(com.tencent.mm.R.id.f484011cp4);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.I = (android.widget.LinearLayout) findViewById11;
        android.view.View findViewById12 = inflate.findViewById(com.tencent.mm.R.id.f484010cp3);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f159635J = (android.widget.ImageView) findViewById12;
        android.view.View findViewById13 = inflate.findViewById(com.tencent.mm.R.id.f484012cp5);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.K = (android.widget.TextView) findViewById13;
        if (this.f159638p1 == null && (systemService = context.getSystemService("vibrator")) != null) {
            this.f159638p1 = (android.os.Vibrator) systemService;
        }
        android.widget.LinearLayout linearLayout = this.H;
        android.view.ViewGroup.LayoutParams layoutParams = null;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("customTipsContainer");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        if (layoutParams2 != null) {
            if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i65.a.b(context, 154) + getMBottomExtraHeight();
            }
            layoutParams = layoutParams2;
        }
        linearLayout.setLayoutParams(layoutParams);
    }

    @Override // com.tencent.mm.plugin.scanner.view.BaseScanMaskView
    public void setScanRequest(com.tencent.mm.plugin.scanner.api.ScanGoodsRequest scanGoodsRequest) {
        long j17;
        super.setScanRequest((com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanGoodsMaskView) scanGoodsRequest);
        if (scanGoodsRequest == null) {
            return;
        }
        if (!(com.tencent.mm.vfs.w6.j(scanGoodsRequest.f158671p) && com.tencent.mm.vfs.w6.j(scanGoodsRequest.f158672q) && com.tencent.mm.vfs.w6.j(scanGoodsRequest.f158673r))) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScanGoodsMaskView", "setScanRequest request is not valid and ignore");
            com.tencent.mm.plugin.scanner.model.h2 h2Var = com.tencent.mm.plugin.scanner.model.h2.f158920a;
            if (scanGoodsRequest.f158668m == 5) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1259, 109);
                return;
            }
            return;
        }
        android.widget.LinearLayout linearLayout = this.H;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            setCustomTipsWording(scanGoodsRequest);
            com.tencent.mm.plugin.scanner.model.n1 n1Var = com.tencent.mm.plugin.scanner.model.n1.f158959a;
            c04.y yVar = new c04.y(this, scanGoodsRequest);
            if (!(com.tencent.mm.vfs.w6.j(scanGoodsRequest.f158671p) && com.tencent.mm.vfs.w6.j(scanGoodsRequest.f158672q) && com.tencent.mm.vfs.w6.j(scanGoodsRequest.f158673r))) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanGoodsResourceManager", "prepare request not valid");
                j17 = -1;
            } else {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsResourceManager", "loadResource requestId: %d", java.lang.Long.valueOf(currentTimeMillis));
                com.tencent.mm.plugin.scanner.model.n1.f158960b.put(java.lang.Long.valueOf(currentTimeMillis), yVar);
                com.tencent.mm.plugin.scanner.model.n1.f158961c.put(java.lang.Long.valueOf(currentTimeMillis), scanGoodsRequest);
                ((ku5.t0) ku5.t0.f312615d).b(new com.tencent.mm.plugin.scanner.model.l1(scanGoodsRequest, currentTimeMillis), "ScanResourceTag");
                j17 = currentTimeMillis;
            }
            this.M = j17;
            if (scanGoodsRequest.f158677v) {
                scanGoodsRequest.f158677v = false;
                this.f159641x1 = new c04.o(this);
                ku5.u0 u0Var = ku5.t0.f312615d;
                java.util.TimerTask timerTask = this.f159641x1;
                kotlin.jvm.internal.o.d(timerTask);
                this.f159644y1 = ((ku5.t0) u0Var).k(timerTask, 15000L);
                return;
            }
            return;
        }
        kotlin.jvm.internal.o.o("customTipsContainer");
        throw null;
    }
}
