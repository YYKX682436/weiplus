package y94;

/* loaded from: classes10.dex */
public final class a0 extends yt3.a implements bn5.i {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f460338f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f460339g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f460340h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f460341i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f460342m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f460343n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f460344o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f460345p;

    /* renamed from: q, reason: collision with root package name */
    public l45.q f460346q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f460347r;

    /* renamed from: s, reason: collision with root package name */
    public int f460348s;

    /* renamed from: t, reason: collision with root package name */
    public int f460349t;

    /* renamed from: u, reason: collision with root package name */
    public int f460350u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f460351v;

    /* renamed from: w, reason: collision with root package name */
    public bn5.f f460352w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Bitmap f460353x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(status, "status");
        this.f460338f = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f460339g = jz5.h.b(new y94.t(this));
        this.f460340h = jz5.h.b(new y94.j(this));
        this.f460341i = jz5.h.b(new y94.s(this));
        this.f460342m = jz5.h.b(new y94.l(this));
        this.f460343n = jz5.h.b(new y94.v(this));
        this.f460344o = jz5.h.b(y94.z.f460407d);
        this.f460345p = jz5.h.b(y94.u.f460397d);
        this.f460347r = jz5.h.b(new y94.m(this));
        this.f460351v = jz5.h.b(y94.n.f460388d);
    }

    public static final /* synthetic */ boolean A(y94.a0 a0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCoverBlurOptimization", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        boolean F = a0Var.F();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCoverBlurOptimization", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return F;
    }

    public static final /* synthetic */ android.view.View B(y94.a0 a0Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        android.view.View y17 = a0Var.y(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return y17;
    }

    public static final com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo C(y94.a0 a0Var, android.graphics.Bitmap bitmap, android.graphics.Rect rect, java.lang.String str, og3.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$saveBitmap", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        a0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveBitmap", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo mediaSingleInfo = null;
        if (bitmap != null) {
            try {
                int max = java.lang.Math.max(rect.left, 0);
                int max2 = java.lang.Math.max(rect.top, 0);
                int width = rect.width() + max >= bitmap.getWidth() ? bitmap.getWidth() - max : rect.width();
                int height = rect.height() + max2 >= bitmap.getHeight() ? bitmap.getHeight() - max2 : rect.height();
                zj0.a aVar2 = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                aVar2.c(java.lang.Boolean.FALSE);
                aVar2.c(null);
                aVar2.c(java.lang.Integer.valueOf(height));
                aVar2.c(java.lang.Integer.valueOf(width));
                aVar2.c(java.lang.Integer.valueOf(max2));
                aVar2.c(java.lang.Integer.valueOf(max));
                aVar2.c(bitmap);
                java.lang.Object obj = new java.lang.Object();
                yj0.a.d(obj, aVar2.b(), "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverEffectImagePlugin", "saveBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Ljava/lang/String;Lcom/tencent/mm/plugin/mediabasic/data/MediaBasicType;)Lcom/tencent/mm/plugin/mediabasic/data/MediaSingleInfo;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
                yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverEffectImagePlugin", "saveBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Ljava/lang/String;Lcom/tencent/mm/plugin/mediabasic/data/MediaBasicType;)Lcom/tencent/mm/plugin/mediabasic/data/MediaSingleInfo;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
                com.tencent.mm.sdk.platformtools.x.D0(createBitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo mediaSingleInfo2 = new com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo(aVar, str, null, 4, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveBitmap", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                mediaSingleInfo = mediaSingleInfo2;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsCoverEffectImagePlugin", e17, "saveBitmapToImage error", new java.lang.Object[0]);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$saveBitmap", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            return mediaSingleInfo;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveBitmap", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$saveBitmap", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return mediaSingleInfo;
    }

    public static final /* synthetic */ bn5.f z(y94.a0 a0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBoardView$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        bn5.f fVar = a0Var.f460352w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBoardView$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return fVar;
    }

    public final android.widget.ImageView D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvatarImg", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        android.widget.ImageView imageView = (android.widget.ImageView) this.f460340h.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvatarImg", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return imageView;
    }

    public final android.content.Context E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        android.content.Context context = (android.content.Context) this.f460347r.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return context;
    }

    public final boolean F() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoverBlurOptimization", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        boolean booleanValue = ((java.lang.Boolean) this.f460351v.getValue()).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverBlurOptimization", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return booleanValue;
    }

    public final android.widget.TextView G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNickNameTxt", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        android.widget.TextView textView = (android.widget.TextView) this.f460341i.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNickNameTxt", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return textView;
    }

    public final android.view.ViewGroup H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getParentLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f460339g.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getParentLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return viewGroup;
    }

    public final java.lang.String I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        java.lang.Object value = ((jz5.n) this.f460344o).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        java.lang.String str = (java.lang.String) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        return str;
    }

    public final void J(android.graphics.Bitmap bitmap, android.graphics.Rect rect) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setup", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        if (bitmap == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setup", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            return;
        }
        qk.l9 l9Var = new qk.l9();
        l9Var.f364232b = false;
        l9Var.f364233c = false;
        l9Var.f364236f = new android.graphics.Rect(H().getLeft(), H().getTop(), H().getRight(), H().getBottom());
        l9Var.f364231a = qk.n9.PHOTO;
        l9Var.f364237g = false;
        l9Var.f364241k = bitmap;
        if (F()) {
            l9Var.f364231a = qk.n9.SNS_COVER;
            l9Var.f364243m = 1.0f;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPhotoEditor", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        jz5.g gVar = this.f460345p;
        qk.o9 o9Var = (qk.o9) ((jz5.n) gVar).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhotoEditor", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        o9Var.d(l9Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPhotoEditor", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        qk.o9 o9Var2 = (qk.o9) ((jz5.n) gVar).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhotoEditor", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        qk.s c17 = o9Var2.c(E());
        kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.view.PhotoDrawingView");
        ym5.x2 x2Var = (ym5.x2) c17;
        bn5.f baseBoardView = x2Var.getBaseBoardView();
        this.f460352w = baseBoardView;
        baseBoardView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        baseBoardView.setValidImageRect(rect);
        if (F()) {
            android.graphics.Bitmap bitmap2 = this.f460353x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBlurBackground", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            if (bitmap2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsCoverEffectImagePlugin", "setBlurBackground bitmap is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBlurBackground", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            } else {
                um5.d dVar = new um5.d();
                um5.p pVar = dVar.f429144e;
                pVar.f429209r.f429213b = 1;
                dVar.b(bitmap2);
                int width = bitmap2.getWidth();
                dVar.f429141b = width;
                dVar.f429142c = (int) (bitmap2.getWidth() * 1.7777778f);
                pVar.f429193b.b().d(50.0f);
                dVar.a(new y94.w(this, baseBoardView));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBlurBackground", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            }
            if (rect != null && (baseBoardView instanceof bn5.l)) {
                ((bn5.l) baseBoardView).setSnsCoverOrigin(this.f460353x);
            }
        }
        dn5.e eVar = (dn5.e) x2Var.getBaseFooterView();
        if (eVar != null) {
            eVar.setHideFooter(true);
        }
        this.f460346q = x2Var.getPresenter();
        H().addView(x2Var, new android.widget.FrameLayout.LayoutParams(-1, -1));
        if (F()) {
            android.view.ViewGroup H = H();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBorderView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f460342m).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBorderView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            H.bringChildToFront(imageView);
            H().bringChildToFront(G());
            H().bringChildToFront(D());
            H().invalidate();
            H().requestLayout();
            bn5.f fVar = this.f460352w;
            bn5.l lVar = fVar instanceof bn5.l ? (bn5.l) fVar : null;
            if (lVar != null) {
                lVar.setOnTouchStateListener(this);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setup", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
    }

    public final void K(float f17, float f18, long j17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator listener;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator alpha2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator listener2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAlphaAnimation", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        android.widget.ImageView D = D();
        if (D != null && (animate2 = D.animate()) != null && (alpha2 = animate2.alpha(f18)) != null && (duration2 = alpha2.setDuration(j17)) != null && (listener2 = duration2.setListener(new y94.x(f17, this, f18))) != null) {
            listener2.start();
        }
        android.widget.TextView G = G();
        if (G != null && (animate = G.animate()) != null && (alpha = animate.alpha(f18)) != null && (duration = alpha.setDuration(j17)) != null && (listener = duration.setListener(new y94.y(f17, this, f18))) != null) {
            listener.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAlphaAnimation", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
    }

    public final void L(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateResetBtnState", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResetBtn", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        jz5.g gVar = this.f460343n;
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) gVar).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResetBtn", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        if (textView != null) {
            textView.setEnabled(z17);
        }
        int color = z17 ? -1 : E().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResetBtn", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) gVar).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResetBtn", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        if (textView2 != null) {
            textView2.setTextColor(color);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateResetBtnState", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
    }

    @Override // yt3.r2
    public void release() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
        l45.q qVar = this.f460346q;
        if (qVar != null) {
            ((l45.n) qVar).p();
        }
        kotlinx.coroutines.z0.d(this.f460338f, this + " onRelease", null, 2, null);
        bn5.f fVar = this.f460352w;
        bn5.l lVar = fVar instanceof bn5.l ? (bn5.l) fVar : null;
        if (lVar != null) {
            lVar.setOnTouchStateListener(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
    
        if (r10.getHeight() > r8) goto L18;
     */
    @Override // yt3.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r18) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y94.a0.t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider):void");
    }
}
