package com.tencent.mm.plugin.scanner.ui.widget;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010/\u001a\u00020.\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103B#\b\u0016\u0012\u0006\u0010/\u001a\u00020.\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\u0006\u00104\u001a\u00020\u0003¢\u0006\u0004\b2\u00105J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\u0012\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u000e\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0003J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\tH\u0016J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$H\u0016R\"\u0010-\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00066"}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/ScanSharedMaskView;", "Landroid/widget/RelativeLayout;", "", "", "getLayoutId", "", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "Ljz5/f0;", "setScanTitle", "", "show", "setShowTitle", "Landroid/widget/TextView;", "getScanTitleView", "tips", "setScanTips", "getScanTipsView", "toast", "setScanToast", "setShowToast", "setShowTips", "disable", "setDisableTips", "Lcom/tencent/mm/plugin/scanner/ui/ScannerFlashSwitcher;", "getFlashSwitcherView", "Landroid/view/View$OnClickListener;", "onClickListener", "setOnGalleryClickListener", "setOnFlashSwitcherClickListener", "Landroid/view/View;", "getGalleryButton", "bottomHeight", "setBottomExtraHeight", "needAnimate", "setAnimateBackgroundView", "setFlashStatus", "Lcom/tencent/mm/plugin/scanner/api/BaseScanRequest;", "request", "setScanRequest", "F", "I", "getGalleryIconBottomMarginDelta", "()I", "setGalleryIconBottomMarginDelta", "(I)V", "galleryIconBottomMarginDelta", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public class ScanSharedMaskView extends android.widget.RelativeLayout {
    public static final /* synthetic */ int G = 0;
    public boolean A;
    public boolean B;
    public java.lang.String C;
    public boolean D;
    public boolean E;

    /* renamed from: F, reason: from kotlin metadata */
    public int galleryIconBottomMarginDelta;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f159787d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f159788e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f159789f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f159790g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher f159791h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f159792i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f159793m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.model.u f159794n;

    /* renamed from: o, reason: collision with root package name */
    public int f159795o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f159796p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.TextureView f159797q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Bitmap f159798r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View.OnClickListener f159799s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View.OnClickListener f159800t;

    /* renamed from: u, reason: collision with root package name */
    public e04.c3 f159801u;

    /* renamed from: v, reason: collision with root package name */
    public e04.c3 f159802v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f159803w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f159804x;

    /* renamed from: y, reason: collision with root package name */
    public int f159805y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.api.BaseScanRequest f159806z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScanSharedMaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static /* synthetic */ void d(com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateShowScanTips");
        }
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        scanSharedMaskView.c(z17, aVar);
    }

    public void a(boolean z17, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        android.graphics.Bitmap bitmap = this.f159798r;
        if (bitmap != null) {
            kotlin.jvm.internal.o.d(bitmap);
            if (!bitmap.isRecycled()) {
                android.widget.ImageView imageView = this.f159793m;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("blurMaskView");
                    throw null;
                }
                imageView.setVisibility(0);
                float f17 = z17 ? 0.0f : 1.0f;
                float f18 = z17 ? 1.0f : 0.0f;
                android.widget.ImageView imageView2 = this.f159793m;
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o("blurMaskView");
                    throw null;
                }
                imageView2.setAlpha(f17);
                android.widget.ImageView imageView3 = this.f159793m;
                if (imageView3 != null) {
                    e04.i3.a(imageView3, f17, f18, 150L, new d04.z2(z17, this, animatorListenerAdapter));
                    return;
                } else {
                    kotlin.jvm.internal.o.o("blurMaskView");
                    throw null;
                }
            }
        }
        android.widget.ImageView imageView4 = this.f159793m;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("blurMaskView");
            throw null;
        }
    }

    public void b(boolean z17) {
        getAlpha();
        float alpha = getAlpha();
        if (z17 && alpha < 1.0f) {
            e04.i3.a(this, alpha, 1.0f, 200L, null);
        } else {
            if (z17 || alpha <= 0.0f) {
                return;
            }
            e04.i3.a(this, alpha, 0.0f, 200L, null);
        }
    }

    public final void c(boolean z17, yz5.a aVar) {
        com.tencent.mm.plugin.scanner.api.BaseScanRequest baseScanRequest;
        android.widget.TextView textView = this.f159789f;
        if (textView == null) {
            kotlin.jvm.internal.o.o("scanTips");
            throw null;
        }
        textView.getVisibility();
        if (!this.D || this.E) {
            android.widget.TextView textView2 = this.f159789f;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("scanTips");
                throw null;
            }
        }
        if (z17 && (baseScanRequest = this.f159806z) != null) {
            kotlin.jvm.internal.o.d(baseScanRequest);
            if (baseScanRequest.f158663e) {
                return;
            }
        }
        android.widget.TextView textView3 = this.f159789f;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("scanTips");
            throw null;
        }
        if (textView3.getVisibility() == 0) {
            android.widget.TextView textView4 = this.f159789f;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("scanTips");
                throw null;
            }
            if ((textView4.getAlpha() == 1.0f) && z17) {
                return;
            }
        }
        android.widget.TextView textView5 = this.f159789f;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("scanTips");
            throw null;
        }
        if (textView5.getVisibility() == 0 || z17) {
            l(true);
            android.widget.TextView textView6 = this.f159789f;
            if (textView6 != null) {
                e04.i3.a(textView6, z17 ? 0.0f : 1.0f, z17 ? 1.0f : 0.0f, 200L, new d04.a3(this, z17, aVar));
            } else {
                kotlin.jvm.internal.o.o("scanTips");
                throw null;
            }
        }
    }

    public final void e() {
        this.f159796p = gm0.j1.d().n() == 6 || gm0.j1.d().n() == 4;
    }

    public int f() {
        return i65.a.b(getContext(), 112);
    }

    public int g() {
        return i65.a.b(getContext(), 16);
    }

    public com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher getFlashSwitcherView() {
        com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher = this.f159791h;
        if (scannerFlashSwitcher != null) {
            return scannerFlashSwitcher;
        }
        kotlin.jvm.internal.o.o("flashSwitcher");
        throw null;
    }

    public android.view.View getGalleryButton() {
        android.view.View view = this.f159792i;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("galleryButton");
        throw null;
    }

    public final int getGalleryIconBottomMarginDelta() {
        return this.galleryIconBottomMarginDelta;
    }

    public int getLayoutId() {
        return com.tencent.mm.R.layout.bph;
    }

    public android.widget.TextView getScanTipsView() {
        android.widget.TextView textView = this.f159789f;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("scanTips");
        throw null;
    }

    public android.widget.TextView getScanTitleView() {
        android.widget.TextView textView = this.f159788e;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("scanTitle");
        throw null;
    }

    public void h(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanSharedMaskView", "onFlashStatusChanged show: %b, isTitleShowing: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(this.f159803w));
        if (this.f159804x != z17) {
            this.f159804x = z17;
            if (this.f159803w) {
                return;
            }
            d(this, !z17, null, 2, null);
        }
    }

    public final void i() {
        android.graphics.Bitmap bitmap = this.f159798r;
        if (bitmap != null) {
            kotlin.jvm.internal.o.d(bitmap);
            if (bitmap.isRecycled()) {
                return;
            }
            android.graphics.Bitmap bitmap2 = this.f159798r;
            kotlin.jvm.internal.o.d(bitmap2);
            bitmap2.recycle();
            this.f159798r = null;
        }
    }

    public int j() {
        return i65.a.b(getContext(), 96);
    }

    public final void k(boolean z17) {
        com.tencent.mm.plugin.scanner.api.BaseScanRequest baseScanRequest;
        if (!z17 || (baseScanRequest = this.f159806z) == null) {
            android.view.View view = this.f159792i;
            if (view == null) {
                kotlin.jvm.internal.o.o("galleryButton");
                throw null;
            }
            r1 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(r1));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanSharedMaskView", "showGalleryButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanSharedMaskView", "showGalleryButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f159792i;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("galleryButton");
            throw null;
        }
        kotlin.jvm.internal.o.d(baseScanRequest);
        if (!baseScanRequest.f158665g && z17) {
            r1 = 0;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(r1));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanSharedMaskView", "showGalleryButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanSharedMaskView", "showGalleryButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void l(boolean z17) {
        com.tencent.mm.plugin.scanner.api.BaseScanRequest baseScanRequest;
        if (!this.D || this.E) {
            android.widget.TextView textView = this.f159789f;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("scanTips");
                throw null;
            }
        }
        if (!z17 || (baseScanRequest = this.f159806z) == null) {
            android.widget.TextView textView2 = this.f159789f;
            if (textView2 != null) {
                textView2.setVisibility(z17 ? 0 : 8);
                return;
            } else {
                kotlin.jvm.internal.o.o("scanTips");
                throw null;
            }
        }
        android.widget.TextView textView3 = this.f159789f;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("scanTips");
            throw null;
        }
        kotlin.jvm.internal.o.d(baseScanRequest);
        if (!baseScanRequest.f158663e && z17) {
            r3 = 0;
        }
        textView3.setVisibility(r3);
    }

    public final void m(int i17) {
        if (this.f159796p) {
            k(true);
            android.widget.TextView textView = this.f159789f;
            if (textView != null) {
                textView.setText(this.C);
                return;
            } else {
                kotlin.jvm.internal.o.o("scanTips");
                throw null;
            }
        }
        boolean z17 = false;
        if (!(i17 == 12)) {
            if (!(i17 == 3)) {
                if (e04.v3.b(i17)) {
                    com.tencent.mm.plugin.scanner.model.u uVar = this.f159794n;
                    if (uVar != null && ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) uVar).f159167y0) {
                        z17 = true;
                    }
                    if (z17) {
                        android.widget.TextView textView2 = this.f159789f;
                        if (textView2 != null) {
                            textView2.setText(com.tencent.mm.R.string.i_p);
                            return;
                        } else {
                            kotlin.jvm.internal.o.o("scanTips");
                            throw null;
                        }
                    }
                }
                k(true);
                return;
            }
        }
        android.widget.TextView textView3 = this.f159789f;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("scanTips");
            throw null;
        }
        textView3.setText(com.tencent.mm.R.string.i_p);
        k(false);
    }

    public final void n(int i17) {
        int b17;
        int i18;
        android.widget.TextView textView = this.f159789f;
        android.view.ViewGroup.LayoutParams layoutParams = null;
        if (textView == null) {
            kotlin.jvm.internal.o.o("scanTips");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = null;
        } else if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
            if (e04.v3.b(i17)) {
                com.tencent.mm.plugin.scanner.model.u uVar = this.f159794n;
                if (uVar != null && ((com.tencent.mm.plugin.scanner.ui.BaseScanUI) uVar).f159167y0) {
                    b17 = j() + this.f159805y;
                    i18 = this.galleryIconBottomMarginDelta;
                    marginLayoutParams.bottomMargin = b17 + i18;
                }
            }
            b17 = i65.a.b(getContext(), 120) + this.f159805y;
            i18 = this.galleryIconBottomMarginDelta;
            marginLayoutParams.bottomMargin = b17 + i18;
        }
        textView.setLayoutParams(layoutParams2);
        android.widget.TextView textView2 = this.f159790g;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("scanToast");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
        if (layoutParams3 == null) {
            layoutParams3 = null;
        } else if (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = i65.a.b(getContext(), 110) + this.f159805y + this.galleryIconBottomMarginDelta;
        }
        textView2.setLayoutParams(layoutParams3);
        android.view.View view = this.f159792i;
        if (view == null) {
            kotlin.jvm.internal.o.o("galleryButton");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        if (layoutParams4 == null) {
            layoutParams4 = null;
        } else if (layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = g() + this.f159805y + this.galleryIconBottomMarginDelta;
        }
        view.setLayoutParams(layoutParams4);
        if (i17 == 3) {
            com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher = this.f159791h;
            if (scannerFlashSwitcher != null) {
                scannerFlashSwitcher.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("flashSwitcher");
                throw null;
            }
        }
        com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher scannerFlashSwitcher2 = this.f159791h;
        if (scannerFlashSwitcher2 == null) {
            kotlin.jvm.internal.o.o("flashSwitcher");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams5 = scannerFlashSwitcher2.getLayoutParams();
        if (layoutParams5 != null) {
            if (layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = f() + this.f159805y + this.galleryIconBottomMarginDelta;
            }
            layoutParams = layoutParams5;
        }
        scannerFlashSwitcher2.setLayoutParams(layoutParams);
    }

    public void setAnimateBackgroundView(boolean z17) {
        if (z17 && this.f159797q != null) {
            ((ku5.t0) ku5.t0.f312615d).g(new d04.g3(this));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ScanSharedMaskView", "updateBackgroundBlurView not need show blurMaskView");
        android.widget.ImageView imageView = this.f159793m;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("blurMaskView");
            throw null;
        }
        imageView.setVisibility(8);
        i();
    }

    public final void setBottomExtraHeight(int i17) {
        this.f159805y = i17;
    }

    public void setDisableTips(boolean z17) {
        this.E = z17;
    }

    public void setFlashStatus(boolean z17) {
        this.f159804x = z17;
    }

    public final void setGalleryIconBottomMarginDelta(int i17) {
        this.galleryIconBottomMarginDelta = i17;
    }

    public void setOnFlashSwitcherClickListener(android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.o.g(onClickListener, "onClickListener");
        this.f159800t = onClickListener;
    }

    public void setOnGalleryClickListener(android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.o.g(onClickListener, "onClickListener");
        this.f159799s = onClickListener;
        android.view.View view = this.f159792i;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        } else {
            kotlin.jvm.internal.o.o("galleryButton");
            throw null;
        }
    }

    public void setScanRequest(com.tencent.mm.plugin.scanner.api.BaseScanRequest baseScanRequest) {
        this.f159806z = baseScanRequest;
    }

    public void setScanTips(java.lang.String str) {
        this.C = str == null ? "" : str;
        android.widget.TextView textView = this.f159789f;
        if (textView != null) {
            textView.setText(str);
        } else {
            kotlin.jvm.internal.o.o("scanTips");
            throw null;
        }
    }

    public void setScanTitle(java.lang.String str) {
        android.widget.TextView textView = this.f159788e;
        if (textView != null) {
            textView.setText(str);
        } else {
            kotlin.jvm.internal.o.o("scanTitle");
            throw null;
        }
    }

    public void setScanToast(java.lang.String str) {
        android.widget.TextView textView = this.f159790g;
        if (textView != null) {
            textView.setText(str);
        } else {
            kotlin.jvm.internal.o.o("scanToast");
            throw null;
        }
    }

    public void setShowTips(boolean z17) {
        if (this.E) {
            android.widget.TextView textView = this.f159789f;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("scanTips");
                throw null;
            }
        }
        this.D = z17;
        android.widget.TextView textView2 = this.f159789f;
        if (textView2 != null) {
            textView2.setVisibility(z17 ? 0 : 8);
        } else {
            kotlin.jvm.internal.o.o("scanTips");
            throw null;
        }
    }

    public void setShowTitle(boolean z17) {
        this.A = z17;
    }

    public void setShowToast(boolean z17) {
        this.B = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanSharedMaskView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f159796p = true;
        this.A = true;
        this.C = "";
        this.D = true;
    }
}
