package ng2;

/* loaded from: classes10.dex */
public class s extends lg2.d {

    /* renamed from: v, reason: collision with root package name */
    public ig2.q f336987v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.live.core.view.LiveVideoView f336988w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f336989x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f336989x = jz5.h.b(new ng2.r(context));
    }

    @Override // kg2.b
    public void f(com.tencent.mm.live.core.view.LiveVideoView renderView, yz5.l onFirstFrameRenderCallback, yz5.a isDetachInvokeFun) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(renderView, "renderView");
        kotlin.jvm.internal.o.g(onFirstFrameRenderCallback, "onFirstFrameRenderCallback");
        kotlin.jvm.internal.o.g(isDetachInvokeFun, "isDetachInvokeFun");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchInLiveRoom isRunning:");
        android.animation.AnimatorSet animatorSet = this.f318564o;
        sb6.append(animatorSet != null ? java.lang.Boolean.valueOf(animatorSet.isRunning()) : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f318557e;
        com.tencent.mars.xlog.Log.i(str, sb7);
        kz2.c cVar = ig2.o.f291411a;
        kz2.c cVar2 = ig2.o.f291411a;
        cVar2.c("switchInLiveRoom before");
        if (this.f318571r && renderView == this.f336988w) {
            onFirstFrameRenderCallback.invoke(java.lang.Boolean.FALSE);
            com.tencent.mars.xlog.Log.i(str, "switchInLiveRoom skipped by float view is detached.");
            return;
        }
        mn0.b0 b0Var = d().f291409h;
        if (b0Var != null) {
            ((mn0.y) b0Var).J(new ng2.p(this, renderView, onFirstFrameRenderCallback, isDetachInvokeFun));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            onFirstFrameRenderCallback.invoke(java.lang.Boolean.FALSE);
        }
        this.f336988w = renderView;
        android.animation.AnimatorSet animatorSet2 = this.f318564o;
        boolean z17 = false;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            z17 = true;
        }
        if (z17) {
            android.animation.AnimatorSet animatorSet3 = this.f318564o;
            if (animatorSet3 != null) {
                animatorSet3.addListener(new ng2.q(this, renderView));
            }
        } else {
            mn0.b0 b0Var2 = d().f291409h;
            if (b0Var2 != null) {
                mn0.b0.B(b0Var2, renderView, null, 2, null);
            }
        }
        cVar2.b("switchInLiveRoom after");
    }

    @Override // lg2.a
    public void j(jg2.b builder) {
        kotlin.jvm.internal.o.g(builder, "builder");
        ig2.j d17 = d();
        android.content.Context context = this.f318556d;
        if (d17.f291386k) {
            int color = context.getResources().getColor(com.tencent.mm.R.color.a9d);
            int color2 = context.getResources().getColor(com.tencent.mm.R.color.f478712f3);
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ng2.k(this));
            builder.a(ofFloat);
            android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(color), java.lang.Integer.valueOf(color2));
            ofObject.addUpdateListener(new ng2.l(this));
            builder.a(ofObject);
            return;
        }
        super.j(builder);
        int color3 = context.getResources().getColor(com.tencent.mm.R.color.a9d);
        int color4 = context.getResources().getColor(com.tencent.mm.R.color.f478712f3);
        ig2.q qVar = this.f336987v;
        float scaleX = qVar != null ? qVar.getScaleX() : 1.0f;
        ig2.q qVar2 = this.f336987v;
        float scaleY = qVar2 != null ? qVar2.getScaleY() : 1.0f;
        android.animation.ValueAnimator ofObject2 = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(color3), java.lang.Integer.valueOf(color4));
        ofObject2.addUpdateListener(new ng2.j(this));
        builder.a(ofObject2);
        if (qg2.d.f362793a.i(d())) {
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat2.addUpdateListener(new ng2.h(this, scaleX, scaleY));
            builder.a(ofFloat2);
        } else {
            android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.addUpdateListener(new ng2.i(this));
            builder.a(ofFloat3);
        }
    }

    @Override // lg2.d, lg2.a
    public void k() {
        if (!d().f291386k) {
            super.k();
            return;
        }
        android.view.WindowManager windowManager = (android.view.WindowManager) ((jz5.n) this.f336989x).getValue();
        android.widget.FrameLayout frameLayout = this.f318572s;
        android.view.WindowManager.LayoutParams a17 = qg2.d.f362793a.a();
        a17.height = this.f318559g;
        windowManager.addView(frameLayout, a17);
        this.f318571r = false;
    }

    @Override // lg2.a
    public android.graphics.Rect m() {
        int[] iArr = new int[2];
        qg2.d dVar = qg2.d.f362793a;
        android.view.View view = this.f318570q;
        kotlin.jvm.internal.o.d(view);
        dVar.e(view, iArr);
        android.view.View view2 = this.f318570q;
        kotlin.jvm.internal.o.e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
        ig2.j d17 = d();
        int i17 = iArr[0];
        d17.f291410i = new android.graphics.Rect(i17, iArr[1], viewGroup.getWidth() + i17, iArr[1] + viewGroup.getHeight());
        return d().f291410i;
    }

    @Override // lg2.a
    public void p() {
        jz5.f0 f0Var;
        java.lang.String str = "detachFloatView view: " + this.f318572s + " isFloatWindowEnter: " + d().f291386k;
        java.lang.String str2 = this.f318557e;
        com.tencent.mars.xlog.Log.i(str2, str);
        this.f318571r = true;
        android.widget.FrameLayout frameLayout = this.f318572s;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(null);
        }
        if (d().f291386k) {
            qg2.d dVar = qg2.d.f362793a;
            try {
                new ng2.m(this).invoke();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("FinderLiveFluentUtil", "safeInvoke exception ", th6);
            }
        } else {
            ig2.q qVar = this.f336987v;
            kotlin.jvm.internal.o.d(qVar);
            com.tencent.mars.xlog.Log.i(str2, "detachMaskView videoView:" + qVar + " surfaceTexture:" + qVar.getSurfaceTexture());
            qVar.setSurfaceTextureListener(new ig2.p("detachMaskView", true));
            android.view.ViewParent parent = qVar.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(qVar);
            }
            if (viewGroup != null) {
                viewGroup.addView(qVar);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w(str2, "liveView is null.");
            }
            android.view.View view = this.f318570q;
            kotlin.jvm.internal.o.d(view);
            android.view.View rootView = view.getRootView();
            android.view.View findViewWithTag = rootView.findViewWithTag("fluent_view_tag");
            if (findViewWithTag != null) {
                findViewWithTag.setOnTouchListener(null);
            }
            ((android.view.ViewGroup) rootView).removeView(findViewWithTag);
        }
        this.f336988w = null;
    }

    @Override // lg2.a
    public java.lang.String r() {
        return "SwitchOutLiveDirector";
    }

    @Override // lg2.a
    public long t() {
        return z().f291402a == ez2.a.f257855d ? 0L : 240L;
    }

    @Override // lg2.d
    public void v() {
        android.view.TextureView textureView = d().f291385j;
        if (textureView == null) {
            return;
        }
        textureView.setSurfaceTextureListener(new ig2.p("liveView surfaceTexture", false));
        java.lang.String str = "attachMaskView surfaceTexture:" + textureView.getSurfaceTexture();
        java.lang.String str2 = this.f318557e;
        com.tencent.mars.xlog.Log.i(str2, str);
        android.content.Context context = this.f318556d;
        ig2.q qVar = new ig2.q(context);
        android.graphics.SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
        kotlin.jvm.internal.o.d(surfaceTexture);
        qVar.setSurfaceTexture(surfaceTexture);
        if (d().f291386k) {
            int i17 = d().f291406e;
            int i18 = d().f291407f;
            qVar.f291414d = i17;
            qVar.f291415e = i18;
            qVar.a(q().width(), q().height());
        } else if (qg2.d.f362793a.i(d())) {
            qVar.setScaleX((d().f291408g * q().height()) / q().width());
        } else {
            int i19 = d().f291406e;
            int i27 = d().f291407f;
            qVar.f291414d = i19;
            qVar.f291415e = i27;
            qVar.a(q().width(), q().height());
        }
        com.tencent.mars.xlog.Log.i(str2, "createTexture scaleX： " + qVar.getScaleX() + " scaleY: " + qVar.getScaleY() + " videoRate: " + d().f291408g + " with: " + q().width() + " height: " + q().height());
        this.f336987v = qVar;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = this.f318573t;
        if (roundedCornerFrameLayout != null) {
            roundedCornerFrameLayout.addView(this.f336987v, layoutParams);
        }
        if (d().f291389n != null) {
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            imageView.setImageBitmap(d().f291389n);
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout2 = this.f318573t;
            if (roundedCornerFrameLayout2 != null) {
                roundedCornerFrameLayout2.addView(imageView, layoutParams2);
            }
        }
        qg2.d dVar = qg2.d.f362793a;
        android.view.ViewParent parent = textureView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(textureView);
        }
        if (viewGroup != null) {
            viewGroup.addView(textureView);
        }
    }
}
