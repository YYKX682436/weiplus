package com.tencent.mm.plugin.media.image;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006)"}, d2 = {"Lcom/tencent/mm/plugin/media/image/SwitchableImageContainer;", "Landroid/widget/FrameLayout;", "", "Lrf3/g;", "Landroid/view/View;", "getActiveView", "Landroid/graphics/PointF;", "getTranslationValues", "getTranslationScale", "Lcom/tencent/mm/ui/base/WxImageView;", "e", "Lcom/tencent/mm/ui/base/WxImageView;", "getSampleImageView", "()Lcom/tencent/mm/ui/base/WxImageView;", "setSampleImageView", "(Lcom/tencent/mm/ui/base/WxImageView;)V", "sampleImageView", "Lsf3/d;", "g", "Lsf3/d;", "getInnerLoader", "()Lsf3/d;", "setInnerLoader", "(Lsf3/d;)V", "innerLoader", "Lrf3/v;", "h", "Lrf3/v;", "getListener", "()Lrf3/v;", "setListener", "(Lrf3/v;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class SwitchableImageContainer extends android.widget.FrameLayout implements rf3.g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f148561i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.MultiTouchImageView f148562d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.ui.base.WxImageView sampleImageView;

    /* renamed from: f, reason: collision with root package name */
    public sf3.g f148564f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public sf3.d innerLoader;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public rf3.v listener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwitchableImageContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // rf3.g
    public jz5.l a(float f17, float f18) {
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = this.f148562d;
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        if (multiTouchImageView != null) {
            boolean z17 = false;
            if (multiTouchImageView != null && multiTouchImageView.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView2 = this.f148562d;
                if (multiTouchImageView2 != null) {
                    multiTouchImageView2.c(f17, f18);
                }
                return new jz5.l(valueOf, valueOf);
            }
        }
        return new jz5.l(valueOf, valueOf);
    }

    @Override // rf3.g
    public void b() {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView;
        com.tencent.mm.ui.base.WxImageView wxImageView = this.sampleImageView;
        if (wxImageView == null || wxImageView.getVisibility() != 0 || (subsamplingScaleImageView = wxImageView.f68217f) == null) {
            return;
        }
        subsamplingScaleImageView.refreshRequiredTiles(true);
        wxImageView.f68217f.invalidate();
    }

    @Override // rf3.g
    public void c(float f17) {
        com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView subsamplingScaleImageView;
        com.tencent.mm.ui.base.WxImageView wxImageView = this.sampleImageView;
        if (wxImageView == null || wxImageView.getVisibility() != 0 || (subsamplingScaleImageView = wxImageView.f68217f) == null) {
            return;
        }
        subsamplingScaleImageView.startRevertAnimation();
    }

    public final void d() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            if (this.f148562d == null) {
                android.view.View childAt = getChildAt(i17);
                com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = childAt instanceof com.tencent.mm.ui.base.MultiTouchImageView ? (com.tencent.mm.ui.base.MultiTouchImageView) childAt : null;
                if (multiTouchImageView != null) {
                    this.f148562d = multiTouchImageView;
                }
            }
            if (this.sampleImageView == null) {
                android.view.View childAt2 = getChildAt(i17);
                com.tencent.mm.ui.base.WxImageView wxImageView = childAt2 instanceof com.tencent.mm.ui.base.WxImageView ? (com.tencent.mm.ui.base.WxImageView) childAt2 : null;
                if (wxImageView != null) {
                    this.sampleImageView = wxImageView;
                    wxImageView.setForceTileFlag(rj0.d.Tile);
                    com.tencent.mm.ui.base.WxImageView wxImageView2 = this.sampleImageView;
                    if (wxImageView2 != null) {
                        wxImageView2.setDoubleTabZoomToNormal(true);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(sf3.g param) {
        java.lang.Object m521constructorimpl;
        com.davemorrissey.labs.subscaleview.view.ImageSource uri;
        kotlin.jvm.internal.o.g(param, "param");
        if (this.f148562d == null) {
            return;
        }
        boolean a17 = param.f407392f.a(param);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load start, id: ");
        java.lang.String str = param.f407388b;
        sb6.append(str);
        sb6.append(" type: ");
        sb6.append(param.f407391e.name());
        sb6.append(" path: ");
        sb6.append(param.c());
        sb6.append(" opt: ");
        sb6.append(a17);
        i(sb6.toString(), new java.lang.Object[0]);
        java.lang.String c17 = param.c();
        sf3.g gVar = this.f148564f;
        if (kotlin.jvm.internal.o.b(c17, gVar != null ? gVar.c() : null)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("load abort, id: ");
            sb7.append(str);
            sb7.append(" type: ");
            sb7.append(param.f407391e.name());
            sb7.append(" oldPath: ");
            sf3.g gVar2 = this.f148564f;
            sb7.append(gVar2 != null ? gVar2.c() : null);
            sb7.append(" newPath: ");
            sb7.append(param.c());
            h(sb7.toString(), new java.lang.Object[0]);
            return;
        }
        if (this.sampleImageView == null || !a17) {
            i("loadDirectly " + str, new java.lang.Object[0]);
            this.f148564f = param;
            if (param.f407391e != sf3.m.f407402d) {
                if ((param.c().length() == 0) == false) {
                    java.lang.String c18 = param.c();
                    sf3.d dVar = this.innerLoader;
                    android.graphics.Bitmap a18 = dVar != null ? dVar.a(param) : null;
                    if (a18 != null && !a18.isRecycled() && this.f148562d != null) {
                        g("use cache, fillBitmap path : %s");
                        java.util.Arrays.copyOf(new java.lang.Object[]{c18}, 1);
                        j(false, true);
                        f(a18);
                        return;
                    }
                    com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = this.f148562d;
                    if (multiTouchImageView != null) {
                        multiTouchImageView.setImageBitmap(null);
                    }
                    j(false, true);
                    sf3.g a19 = param.a(sf3.m.f407406h);
                    sf3.d dVar2 = this.innerLoader;
                    if (dVar2 != null) {
                        dVar2.b(a19, new rf3.x(this));
                    }
                    sf3.d dVar3 = this.innerLoader;
                    if (dVar3 != null) {
                        dVar3.b(param, new rf3.x(this));
                        return;
                    }
                    return;
                }
            }
            h("load UNKNOWN param", new java.lang.Object[0]);
            return;
        }
        i("loadBigImage " + str, new java.lang.Object[0]);
        java.lang.String c19 = param.c();
        sf3.g gVar3 = this.f148564f;
        boolean b17 = kotlin.jvm.internal.o.b(c19, gVar3 != null ? gVar3.c() : null);
        this.f148564f = param;
        if (param.f407391e != sf3.m.f407402d) {
            if ((param.c().length() == 0) == false) {
                sf3.g b18 = param.b(sf3.m.f407404f, sf3.m.f407403e);
                java.lang.String c27 = param.c();
                i("checkUseBigImageOpt, result: %b, path: %s", java.lang.Boolean.valueOf(param.f407392f.a(param)), param.c());
                com.tencent.mm.ui.base.WxImageView wxImageView = this.sampleImageView;
                if (wxImageView == null) {
                    return;
                }
                if (b17) {
                    j(true, false);
                }
                wxImageView.setOnImageLoadEventListener(new rf3.w(this, c27, b18, param));
                java.lang.String imgPath = param.c();
                if (!com.tencent.mm.vfs.w6.j(imgPath)) {
                    h("loadSampleInternal path not exits: " + imgPath, new java.lang.Object[0]);
                    return;
                }
                kotlin.jvm.internal.o.g(imgPath, "imgPath");
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d(imgPath, options);
                    if (d17 != null) {
                        d17.recycle();
                    }
                    m521constructorimpl = kotlin.Result.m521constructorimpl(options);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                    m521constructorimpl = null;
                }
                android.graphics.BitmapFactory.Options options2 = (android.graphics.BitmapFactory.Options) m521constructorimpl;
                if (options2 == null) {
                    h("options null", new java.lang.Object[0]);
                    return;
                }
                sf3.g b19 = param.b(sf3.m.f407407i, sf3.m.f407406h);
                java.lang.String c28 = b19.f407391e == sf3.m.f407402d ? "" : b19.c();
                if ((c28.length() > 0) && com.tencent.mm.vfs.w6.j(c28)) {
                    uri = com.davemorrissey.labs.subscaleview.view.ImageSource.uri(c28);
                } else {
                    uri = com.davemorrissey.labs.subscaleview.view.ImageSource.uri(imgPath);
                    h("loadSampleInternal previewPath not exits, use raw : ".concat(c28), new java.lang.Object[0]);
                }
                h("loadSampleInternal loadFile: " + imgPath + " previewPath: " + c28, new java.lang.Object[0]);
                com.tencent.mm.ui.base.WxImageView wxImageView2 = this.sampleImageView;
                com.tencent.mm.ui.base.WxImageView wxImageView3 = wxImageView2 instanceof com.tencent.mm.ui.base.WxImageView ? wxImageView2 : null;
                if (wxImageView3 != null) {
                    wxImageView3.setOrientation(com.tencent.mm.sdk.platformtools.l.a(imgPath));
                    int i17 = options2.outWidth;
                    int i18 = options2.outHeight;
                    wxImageView3.f68219h = i17;
                    wxImageView3.f68220i = i18;
                    rf3.v vVar = this.listener;
                    if (vVar != null) {
                        vVar.r(i17, i18);
                    }
                    wxImageView3.i();
                    wxImageView3.t(imgPath, uri);
                    return;
                }
                return;
            }
        }
        h("load UNKNOWN param", new java.lang.Object[0]);
    }

    public final void f(android.graphics.Bitmap bitmap) {
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = this.f148562d;
        if (multiTouchImageView == null) {
            return;
        }
        multiTouchImageView.setEnableHorLongBmpMode(false);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        multiTouchImageView.f197651o = width;
        multiTouchImageView.f197652p = height;
        rf3.v vVar = this.listener;
        if (vVar != null) {
            vVar.r(bitmap.getWidth(), bitmap.getHeight());
        }
        multiTouchImageView.setImageBitmap(null);
        multiTouchImageView.setImageBitmap(bitmap);
        multiTouchImageView.invalidate();
    }

    public final java.lang.String g(java.lang.String str) {
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" ");
        sb6.append(hashCode());
        sb6.append('#');
        sf3.g gVar = this.f148564f;
        if (gVar == null || (str2 = gVar.f407388b) == null) {
            str2 = com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE;
        }
        sb6.append(str2);
        return str + sb6.toString();
    }

    public final android.view.View getActiveView() {
        com.tencent.mm.ui.base.WxImageView wxImageView = this.sampleImageView;
        if (wxImageView != null && wxImageView.getVisibility() == 0) {
            return this.sampleImageView;
        }
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = this.f148562d;
        if (multiTouchImageView != null && multiTouchImageView.getVisibility() == 0) {
            return this.f148562d;
        }
        return null;
    }

    public final sf3.d getInnerLoader() {
        return this.innerLoader;
    }

    public final rf3.v getListener() {
        return this.listener;
    }

    public final com.tencent.mm.ui.base.WxImageView getSampleImageView() {
        return this.sampleImageView;
    }

    @Override // rf3.g
    public android.graphics.PointF getTranslationScale() {
        com.tencent.mm.ui.base.WxImageView wxImageView = this.sampleImageView;
        if (wxImageView != null && wxImageView.getVisibility() == 0) {
            return wxImageView.getImageViewMatrixScale();
        }
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = this.f148562d;
        if (multiTouchImageView == null || multiTouchImageView.getVisibility() != 0) {
            return null;
        }
        return multiTouchImageView.getImageViewMatrixScale();
    }

    @Override // rf3.g
    public android.graphics.PointF getTranslationValues() {
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView;
        com.tencent.mm.ui.base.WxImageView wxImageView = this.sampleImageView;
        if (wxImageView != null && wxImageView.getVisibility() == 0) {
            return wxImageView.getImageViewMatrixTranslation();
        }
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView2 = this.f148562d;
        if (multiTouchImageView2 == null || multiTouchImageView2.getVisibility() != 0 || (multiTouchImageView = this.f148562d) == null) {
            return null;
        }
        return multiTouchImageView.getImageViewMatrixTranslation();
    }

    public final void h(java.lang.String str, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.e("MediaGallery.SwitchableImageContainer", g(str), java.util.Arrays.copyOf(objArr, objArr.length));
    }

    public final void i(java.lang.String str, java.lang.Object... objArr) {
        com.tencent.mars.xlog.Log.i("MediaGallery.SwitchableImageContainer", g(str), java.util.Arrays.copyOf(objArr, objArr.length));
    }

    public final void j(boolean z17, boolean z18) {
        com.tencent.mm.ui.base.WxImageView wxImageView = this.sampleImageView;
        if (wxImageView != null) {
            wxImageView.setVisibility(z17 ? 0 : 8);
            com.tencent.mm.ui.base.WxImageView wxImageView2 = this.sampleImageView;
            if (wxImageView2 != null) {
                wxImageView2.setDrawFullSampleSizeBitmap(z17);
            }
        }
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = this.f148562d;
        if (multiTouchImageView != null) {
            multiTouchImageView.setVisibility(z18 ? 0 : 8);
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView2 = this.f148562d;
            if (multiTouchImageView2 != null) {
                multiTouchImageView2.setImageBitmap(null);
            }
        }
        g("showImageView showWxImage:" + z17 + " showMultiTouchImage:" + z18);
        java.util.Arrays.copyOf(new java.lang.Object[0], 0);
    }

    public final void setInnerLoader(sf3.d dVar) {
        this.innerLoader = dVar;
    }

    public final void setListener(rf3.v vVar) {
        this.listener = vVar;
    }

    public final void setSampleImageView(com.tencent.mm.ui.base.WxImageView wxImageView) {
        this.sampleImageView = wxImageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchableImageContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
