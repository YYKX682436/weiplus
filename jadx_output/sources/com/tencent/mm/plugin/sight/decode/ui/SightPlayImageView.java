package com.tencent.mm.plugin.sight.decode.ui;

/* loaded from: classes15.dex */
public class SightPlayImageView extends com.tencent.mm.memory.ui.QPictureView implements com.tencent.mm.plugin.sight.decode.model.a {
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f162489J;
    public int K;
    public com.tencent.mm.pluginsdk.ui.tools.a4 L;
    public final com.tencent.mm.plugin.sight.decode.model.s M;
    public boolean N;
    public boolean P;
    public int Q;

    public SightPlayImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.N = true;
        this.P = false;
        this.Q = 0;
        this.M = new m34.g(0, this);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayImageView", "mController %s", com.tencent.mm.sdk.platformtools.z3.b(true));
    }

    @Override // com.tencent.mm.plugin.sight.decode.model.a
    public void d(java.lang.String str, boolean z17, int i17) {
        com.tencent.mm.plugin.sight.decode.model.s sVar = this.M;
        com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayController", "#0x%x data: set video[%s], old path[%s], fling[%B], last video id %d, recording %B, canPlay %B", java.lang.Integer.valueOf(sVar.hashCode()), str, sVar.f162447c, java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(sVar.f162449e), java.lang.Boolean.valueOf(sVar.D), java.lang.Boolean.valueOf(sVar.f162466v));
        if (sVar.D) {
            sVar.j(false);
            return;
        }
        sVar.g();
        if (!sVar.f162466v) {
            sVar.c();
            return;
        }
        if (z17) {
            sVar.f162448d = str;
            sVar.j(false);
            return;
        }
        if (sVar.f162447c.equals(str)) {
            sVar.f162448d = "ERROR#PATH";
            sVar.j(false);
            sVar.i();
            return;
        }
        sVar.c();
        if (str == null) {
            str = "";
        }
        sVar.f162447c = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SightPlayController", "empty video path, do draw empty thumb and return");
            sVar.d(null);
        } else {
            if (!com.tencent.mm.plugin.sight.decode.model.s.b(sVar.f162447c)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SightPlayController", "Check Sight Fail!!! return");
                sVar.c();
                return;
            }
            sVar.f162458n = new com.tencent.mm.plugin.sight.decode.model.n(sVar, null);
            wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.tencent.mm.plugin.sight.decode.model.n nVar = sVar.f162458n;
            ((vf0.y1) k1Var).getClass();
            t21.o2.aj(nVar, 0L);
        }
    }

    @Override // com.tencent.mm.plugin.sight.decode.model.a
    public void e(int i17, int i18) {
        this.N = false;
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        this.H = i17;
        int i19 = (i18 * i17) / i17;
        this.I = i19;
        layoutParams.width = i17;
        layoutParams.height = i19;
        setLayoutParams(layoutParams);
        postInvalidate();
    }

    public com.tencent.mm.plugin.sight.decode.model.s getController() {
        return this.M;
    }

    public int getDuration() {
        com.tencent.mm.plugin.sight.decode.model.s sVar = this.M;
        if (sVar == null) {
            return 0;
        }
        return (int) (sVar.f162449e == -1 ? 0.0d : ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).getVideoDuration(sVar.f162449e));
    }

    @Override // com.tencent.mm.plugin.sight.decode.model.a
    public java.lang.Object getTagObject() {
        return getTag();
    }

    public android.content.Context getUIContext() {
        return getContext();
    }

    @Override // com.tencent.mm.plugin.sight.decode.model.a
    public java.lang.String getVideoPath() {
        return this.M.f162447c;
    }

    @Override // com.tencent.mm.memory.ui.QPictureView, android.view.View
    public void onAttachedToWindow() {
        hashCode();
        super.onAttachedToWindow();
        this.M.f().alive();
    }

    @Override // com.tencent.mm.memory.ui.QPictureView, com.tencent.mm.ui.widget.QImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayImageView", "#0x%x clear, on deattached to window", java.lang.Integer.valueOf(hashCode()));
        p();
        this.M.f().dead();
    }

    @Override // com.tencent.mm.ui.widget.QImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
    }

    public void p() {
        this.M.c();
    }

    public void q(boolean z17) {
        com.tencent.mm.plugin.sight.decode.model.s sVar = this.M;
        sVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayController", "configure: need sound %B", java.lang.Boolean.valueOf(z17));
        if (z17) {
            if (sVar.f162460p == null) {
                sVar.f162460p = new com.tencent.mm.plugin.sight.decode.model.p(sVar, null);
                return;
            }
            return;
        }
        if (sVar.f162460p != null) {
            sVar.f162460p.f162438e = 0;
            wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
            com.tencent.mm.plugin.sight.decode.model.p pVar = sVar.f162460p;
            ((vf0.y1) k1Var).getClass();
            t21.o2.aj(pVar, 0L);
        }
        sVar.f162460p = null;
    }

    public void r() {
        this.P = true;
    }

    public void s(android.graphics.Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    @Override // com.tencent.mm.plugin.sight.decode.model.a
    public void setCanPlay(boolean z17) {
        this.M.f162466v = z17;
    }

    public void setDrawWidthAndHeightFix(boolean z17) {
        this.P = z17;
    }

    @Override // com.tencent.mm.plugin.sight.decode.model.a
    public void setDrawableWidth(int i17) {
        this.N = false;
        this.H = i17;
        if (this.f162489J <= 0 || this.K <= 0) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i18 = this.H;
        int i19 = (this.K * i18) / this.f162489J;
        this.I = i19;
        if (layoutParams.width == i18 && layoutParams.height == i19) {
            return;
        }
        layoutParams.width = i18;
        layoutParams.height = i19;
        setLayoutParams(layoutParams);
    }

    public void setForceRecordState(boolean z17) {
    }

    @Override // com.tencent.mm.ui.widget.QImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        int height;
        int width;
        super.setImageBitmap(bitmap);
        if (this.P) {
            return;
        }
        if (bitmap == null) {
            height = this.I;
            if (height == 0) {
                height = 240;
            }
        } else {
            height = bitmap.getHeight();
        }
        if (bitmap == null) {
            width = this.H;
            if (width == 0) {
                width = com.tencent.mapsdk.internal.km.f50100e;
            }
        } else {
            width = bitmap.getWidth();
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i17 = layoutParams.height;
        int i18 = this.H;
        float f17 = width;
        if (i17 != ((int) ((i18 * height) / f17))) {
            layoutParams.width = i18;
            layoutParams.height = (int) ((i18 * height) / f17);
            setLayoutParams(layoutParams);
        }
    }

    @Override // com.tencent.mm.memory.ui.QPictureView, com.tencent.mm.ui.widget.QImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        int intrinsicHeight;
        int intrinsicWidth;
        super.setImageDrawable(drawable);
        if (this.P) {
            return;
        }
        if (drawable == null) {
            intrinsicHeight = this.I;
            if (intrinsicHeight == 0) {
                intrinsicHeight = 240;
            }
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        if (drawable == null) {
            intrinsicWidth = this.H;
            if (intrinsicWidth == 0) {
                intrinsicWidth = com.tencent.mapsdk.internal.km.f50100e;
            }
        } else {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        if (intrinsicHeight == 0 || intrinsicWidth == 0) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i17 = layoutParams.height;
        int i18 = this.H;
        float f17 = intrinsicHeight;
        float f18 = intrinsicWidth;
        if (i17 == ((int) ((i18 * f17) / f18)) || this.Q != 0) {
            return;
        }
        layoutParams.width = i18;
        layoutParams.height = (int) ((i18 * f17) / f18);
        setLayoutParams(layoutParams);
    }

    public void setIsAdVideo(boolean z17) {
        com.tencent.mm.plugin.sight.decode.model.s sVar = this.M;
        if (sVar != null) {
            sVar.f162467w = z17;
        }
    }

    public void setIsForbidLoopAnim(boolean z17) {
        com.tencent.mm.plugin.sight.decode.model.s sVar = this.M;
        if (sVar != null) {
            sVar.f162468x = z17;
        }
    }

    public void setIsWhatsNew(boolean z17) {
        this.M.f162469y = z17;
    }

    public void setLoopImp(boolean z17) {
        com.tencent.mm.plugin.sight.decode.model.s sVar = this.M;
        if (sVar != null) {
            sVar.f162470z = z17;
        }
    }

    public void setMaskID(int i17) {
    }

    public void setOnCompletionListener(com.tencent.mm.plugin.sight.decode.model.k kVar) {
        this.M.F = kVar;
    }

    public void setOnDecodeDurationListener(com.tencent.mm.plugin.sight.decode.model.l lVar) {
        com.tencent.mm.plugin.sight.decode.model.s sVar = this.M;
        if (lVar == null) {
            sVar.G = sVar.f162464t;
        }
        sVar.G = lVar;
    }

    public void setOnSightCompletionAction(com.tencent.mm.plugin.sight.decode.model.m mVar) {
        this.M.getClass();
    }

    @Override // com.tencent.mm.plugin.sight.decode.model.a
    public void setPosition(int i17) {
        this.M.C = i17;
    }

    public void setScaleMode(int i17) {
        this.Q = i17;
    }

    public void setSightInfoView(android.widget.TextView textView) {
        this.M.getClass();
        new java.lang.ref.WeakReference(textView);
    }

    public void setTagObject(java.lang.Object obj) {
        setTag(obj);
    }

    public void setThumbBgView(android.view.View view) {
        com.tencent.mm.plugin.sight.decode.model.s sVar = this.M;
        sVar.getClass();
        sVar.f162453i = new java.lang.ref.WeakReference(view);
    }

    @Override // com.tencent.mm.plugin.sight.decode.model.a
    public void setThumbBmp(android.graphics.Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    public void stop() {
        p();
    }

    public SightPlayImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
