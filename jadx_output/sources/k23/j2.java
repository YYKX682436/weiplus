package k23;

/* loaded from: classes12.dex */
public final class j2 extends k23.i1 {
    public int A;
    public final k23.n1 B;
    public final k23.n1 C;
    public android.view.View.OnLayoutChangeListener D;
    public android.view.View E;
    public android.animation.AnimatorSet F;
    public boolean G;

    /* renamed from: n, reason: collision with root package name */
    public k23.k1 f303596n;

    /* renamed from: o, reason: collision with root package name */
    public k23.f0 f303597o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f303598p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f303599q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f303600r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f303601s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f303602t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f303603u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f303604v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f303605w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f303606x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f303607y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f303608z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(android.content.Context context, k23.d0 params) {
        super(context, params);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(params, "params");
        this.f303597o = k23.f0.f303564f;
        this.f303598p = "";
        this.f303600r = jz5.h.b(new k23.t1(context));
        this.f303601s = jz5.h.b(new k23.v1(this));
        this.f303602t = jz5.h.b(new k23.w1(this));
        this.f303603u = jz5.h.b(new k23.x1(this));
        this.f303604v = jz5.h.b(new k23.y1(this));
        this.f303605w = jz5.h.b(new k23.u1(this));
        this.f303606x = jz5.h.b(new k23.z1(this));
        this.f303607y = jz5.h.b(new k23.i2(this));
        this.f303608z = jz5.h.b(new k23.g2(this));
        boolean z17 = params.f303554k == k23.b0.f303520g;
        this.B = new k23.n1(this, "左侧麦克风", 500L);
        this.C = new k23.n1(this, "右侧按钮", 10L);
        getLeftKeyboardIcon().setImageResource(com.tencent.mm.R.raw.keyboard_circle_medium);
        getKeyboardIcon().setImageResource(com.tencent.mm.R.raw.keyboard_circle_medium);
        getLeftVoiceIcon().setImageResource(com.tencent.mm.R.raw.mike_on_medium);
        getMikeIcon().setImageResource(com.tencent.mm.R.raw.mike_on_medium);
        p(this.f303597o, false);
        getLeftCircleBtn().setOnTouchListener(new k23.c2(this));
        getStartBtn().setOnTouchListener(new k23.d2(this));
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", "setupThreeButtonMode");
            android.view.View uploadBtnContainer = getUploadBtnContainer();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(uploadBtnContainer, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch", "setupThreeButtonMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            uploadBtnContainer.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(uploadBtnContainer, "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch", "setupThreeButtonMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View spacerUpload = getSpacerUpload();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(spacerUpload, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch", "setupThreeButtonMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            spacerUpload.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(spacerUpload, "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch", "setupThreeButtonMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.vkq)).setImageResource(com.tencent.mm.R.raw.plus_circle_regular);
            getUploadBtnContainer().setOnClickListener(new k23.e2(this));
            android.view.View modeSwitchContainer = getModeSwitchContainer();
            modeSwitchContainer = modeSwitchContainer instanceof android.view.View ? modeSwitchContainer : null;
            if (modeSwitchContainer == null) {
                return;
            }
            android.view.ViewParent parent = modeSwitchContainer.getParent();
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = parent instanceof androidx.constraintlayout.widget.ConstraintLayout ? (androidx.constraintlayout.widget.ConstraintLayout) parent : null;
            if (constraintLayout == null) {
                return;
            }
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.d(constraintLayout);
            int i17 = (int) (20 * getContext().getResources().getDisplayMetrics().density);
            cVar.i(com.tencent.mm.R.id.tyx).f10957l0 = 0;
            cVar.m(com.tencent.mm.R.id.tyx, 6, i17);
            cVar.m(com.tencent.mm.R.id.tyx, 7, i17);
            cVar.b(constraintLayout);
            constraintLayout.setConstraintSet(null);
            k23.f2 f2Var = new k23.f2(this, modeSwitchContainer);
            this.D = f2Var;
            modeSwitchContainer.addOnLayoutChangeListener(f2Var);
        }
    }

    public static final android.widget.ImageView c(android.view.ViewGroup viewGroup, android.graphics.Bitmap bitmap, float f17, float f18) {
        android.widget.ImageView imageView = new android.widget.ImageView(viewGroup.getContext());
        imageView.setImageBitmap(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        imageView.measure(android.view.View.MeasureSpec.makeMeasureSpec(width, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        imageView.layout((int) f17, (int) f18, (int) (f17 + width), (int) (f18 + height));
        viewGroup.getOverlay().add(imageView);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getCancelLimitY() {
        return ((java.lang.Number) ((jz5.n) this.f303600r).getValue()).floatValue();
    }

    private final com.tencent.mm.ui.widget.imageview.WeImageView getKeyboardIcon() {
        java.lang.Object value = ((jz5.n) this.f303605w).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    private final android.view.View getLeftCircleBtn() {
        java.lang.Object value = ((jz5.n) this.f303601s).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.ui.widget.imageview.WeImageView getLeftKeyboardIcon() {
        java.lang.Object value = ((jz5.n) this.f303602t).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.ui.widget.imageview.WeImageView getLeftVoiceIcon() {
        java.lang.Object value = ((jz5.n) this.f303603u).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.ui.widget.imageview.WeImageView getMikeIcon() {
        java.lang.Object value = ((jz5.n) this.f303604v).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    private final android.view.View getModeSwitchContainer() {
        java.lang.Object value = ((jz5.n) this.f303606x).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final android.view.View getSpacerUpload() {
        java.lang.Object value = ((jz5.n) this.f303608z).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final android.view.View getUploadBtnContainer() {
        java.lang.Object value = ((jz5.n) this.f303607y).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public static final void h(k23.j2 j2Var) {
        android.view.ViewGroupOverlay overlay;
        j2Var.getStartBtn().getWidth();
        int height = j2Var.getStartBtn().getHeight();
        com.tencent.mm.ui.widget.imageview.WeImageView keyboardIcon = j2Var.getKeyboardIcon();
        float left = keyboardIcon.getLeft();
        float left2 = j2Var.getStartBtnTv().getLeft() + j2Var.getStartBtnTv().getWidth();
        float max = java.lang.Math.max(keyboardIcon.getHeight(), j2Var.getStartBtnTv().getHeight());
        if (left2 <= 0.0f || max <= 0.0f) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FTSStartRecognizeBtnModeSwitch", "setupAndStartShimmerAnimation: invalid shimmer size (w=" + left2 + ", h=" + max + "), skip");
            return;
        }
        int d17 = i65.a.d(j2Var.getContext(), com.tencent.mm.R.color.f478494f);
        int argb = android.graphics.Color.argb(0, android.graphics.Color.red(d17), android.graphics.Color.green(d17), android.graphics.Color.blue(d17));
        float e17 = left2 > 0.0f ? e06.p.e(left / left2, 0.0f, 1.0f) : 0.0f;
        int i17 = (int) left2;
        int i18 = (int) max;
        android.view.View view = new android.view.View(j2Var.getContext());
        android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
        paintDrawable.setShape(new android.graphics.drawable.shapes.RectShape());
        paintDrawable.setShaderFactory(new k23.b2(argb, d17, e17));
        view.setBackground(paintDrawable);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch", "setupAndStartShimmerAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch", "setupAndStartShimmerAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        int i19 = (height - i18) / 2;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i17, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i18, 1073741824));
        view.layout(0, i19, i17, i18 + i19);
        android.view.View startBtn = j2Var.getStartBtn();
        android.view.ViewGroup viewGroup = startBtn instanceof android.view.ViewGroup ? (android.view.ViewGroup) startBtn : null;
        if (viewGroup != null && (overlay = viewGroup.getOverlay()) != null) {
            overlay.add(view);
        }
        j2Var.E = view;
        view.setTranslationX(0.0f);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 0.0f, 1.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_X, 0.0f, left2);
        ofFloat2.setDuration(1150L);
        ofFloat2.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f);
        ofFloat3.setDuration(150L);
        ofFloat3.setStartDelay(1000L);
        ofFloat3.setInterpolator(new android.view.animation.LinearInterpolator());
        android.animation.ValueAnimator ofFloat4 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat4.setDuration(1700L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(ofFloat).before(ofFloat2);
        animatorSet.play(ofFloat2).with(ofFloat3);
        animatorSet.play(ofFloat4).after(ofFloat2);
        animatorSet.addListener(new k23.a2(new kotlin.jvm.internal.f0(), view, 0.0f, animatorSet, j2Var));
        j2Var.F = animatorSet;
        animatorSet.start();
    }

    public final k23.f0 getCurrentMode() {
        return this.f303597o;
    }

    public final int getFloatingButtonBottomHeight() {
        if (this.A == 0) {
            o();
        }
        return this.A;
    }

    @Override // k23.i1
    public int getLayoutId() {
        return com.tencent.mm.R.layout.efc;
    }

    @Override // k23.i1
    public java.lang.Integer getStartButtonTopToBottomHeightPx() {
        android.view.View modeSwitchContainer = getModeSwitchContainer();
        android.view.ViewGroup.LayoutParams layoutParams = modeSwitchContainer.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        return java.lang.Integer.valueOf((marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + modeSwitchContainer.getHeight());
    }

    public final void i(k23.f0 f0Var) {
        java.lang.String string;
        java.lang.String string2;
        j(f0Var);
        int ordinal = f0Var.ordinal();
        if (ordinal == 0) {
            getLeftKeyboardIcon().setVisibility(8);
            getLeftVoiceIcon().setVisibility(0);
            getMikeIcon().setVisibility(8);
            getKeyboardIcon().setVisibility(0);
            if (this.f303599q) {
                if (this.f303598p.length() > 0) {
                    string = this.f303598p;
                    getStartBtnTv().setText(string);
                    return;
                }
            }
            string = getContext().getString(com.tencent.mm.R.string.niw);
            kotlin.jvm.internal.o.d(string);
            getStartBtnTv().setText(string);
            return;
        }
        if (ordinal != 1) {
            return;
        }
        getLeftKeyboardIcon().setVisibility(0);
        getLeftVoiceIcon().setVisibility(8);
        getMikeIcon().setVisibility(0);
        getKeyboardIcon().setVisibility(8);
        if (this.f303599q) {
            if (this.f303598p.length() > 0) {
                string2 = this.f303598p;
                getStartBtnTv().setText(string2);
            }
        }
        string2 = getContext().getString(com.tencent.mm.R.string.niu);
        kotlin.jvm.internal.o.d(string2);
        getStartBtnTv().setText(string2);
    }

    public final void j(k23.f0 f0Var) {
        if (getParams().f303552i == k23.u2.f303702e) {
            int ordinal = f0Var.ordinal();
            if (ordinal == 0) {
                int d17 = i65.a.d(getContext(), com.tencent.mm.R.color.f478494f);
                int d18 = i65.a.d(getContext(), com.tencent.mm.R.color.abw);
                getStartBtn().setBackgroundColor(d17);
                getStartBtnTv().setTextColor(d18);
                getKeyboardIcon().setIconColor(d18);
                return;
            }
            if (ordinal != 1) {
                return;
            }
            int d19 = i65.a.d(getContext(), com.tencent.mm.R.color.Brand_120);
            int d27 = i65.a.d(getContext(), com.tencent.mm.R.color.aby);
            getStartBtn().setBackgroundColor(d19);
            getStartBtnTv().setTextColor(d27);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) getStartBtn().findViewById(com.tencent.mm.R.id.ugo);
            if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.mike_on_filled);
                weImageView.setIconColor(d27);
            }
        }
    }

    public final jz5.l k(android.view.View view, android.view.ViewGroup viewGroup) {
        view.getLocationOnScreen(new int[2]);
        viewGroup.getLocationOnScreen(new int[2]);
        return new jz5.l(java.lang.Float.valueOf(r1[0] - r0[0]), java.lang.Float.valueOf(r1[1] - r0[1]));
    }

    public final void l() {
        android.view.ViewGroupOverlay overlay;
        android.animation.AnimatorSet animatorSet = this.F;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.F = null;
        android.view.View view = this.E;
        if (view != null) {
            android.view.View startBtn = getStartBtn();
            android.view.ViewGroup viewGroup = startBtn instanceof android.view.ViewGroup ? (android.view.ViewGroup) startBtn : null;
            if (viewGroup != null && (overlay = viewGroup.getOverlay()) != null) {
                overlay.remove(view);
            }
        }
        this.E = null;
        this.G = false;
    }

    public final android.graphics.Bitmap m(android.view.View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch", "snapshotBitmap", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnModeSwitch", "snapshotBitmap", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        view.draw(new android.graphics.Canvas(createBitmap));
        return createBitmap;
    }

    public final void n(k23.f0 mode, boolean z17) {
        kotlin.jvm.internal.o.g(mode, "mode");
        if (this.f303597o == mode) {
            p(mode, z17);
            this.f303599q = false;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", "API切换模式: " + this.f303597o + " -> " + mode + ", animated: " + z17);
        l();
        this.f303597o = mode;
        p(mode, z17);
        this.f303599q = false;
    }

    public final void o() {
        android.view.View modeSwitchContainer = getModeSwitchContainer();
        int height = modeSwitchContainer.getHeight();
        android.view.ViewGroup.LayoutParams layoutParams = modeSwitchContainer.getLayoutParams();
        this.A = (int) ((height + ((layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r0.bottomMargin : 0)) / getContext().getResources().getDisplayMetrics().density);
    }

    public final void p(k23.f0 f0Var, boolean z17) {
        java.lang.String string;
        if (!z17) {
            i(f0Var);
            return;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        int ordinal = f0Var.ordinal();
        if (ordinal == 0) {
            j(f0Var);
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(getLeftKeyboardIcon(), (android.util.Property<com.tencent.mm.ui.widget.imageview.WeImageView, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(getLeftVoiceIcon(), (android.util.Property<com.tencent.mm.ui.widget.imageview.WeImageView, java.lang.Float>) android.view.View.ALPHA, 0.0f, 1.0f);
            ofFloat.addListener(new k23.r1(this));
            getLeftVoiceIcon().setAlpha(0.0f);
            getLeftVoiceIcon().setVisibility(0);
            getMikeIcon().setVisibility(8);
            getKeyboardIcon().setVisibility(0);
            if (this.f303599q) {
                if (this.f303598p.length() > 0) {
                    string = this.f303598p;
                    getStartBtnTv().setText(string);
                    animatorSet.playTogether(ofFloat, ofFloat2);
                }
            }
            string = getContext().getString(com.tencent.mm.R.string.niw);
            kotlin.jvm.internal.o.d(string);
            getStartBtnTv().setText(string);
            animatorSet.playTogether(ofFloat, ofFloat2);
        } else if (ordinal == 1) {
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(getLeftVoiceIcon(), (android.util.Property<com.tencent.mm.ui.widget.imageview.WeImageView, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f);
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(getLeftKeyboardIcon(), (android.util.Property<com.tencent.mm.ui.widget.imageview.WeImageView, java.lang.Float>) android.view.View.ALPHA, 0.0f, 1.0f);
            ofFloat3.addListener(new k23.s1(this));
            getLeftKeyboardIcon().setAlpha(0.0f);
            getLeftKeyboardIcon().setVisibility(0);
            android.view.View modeSwitchContainer = getModeSwitchContainer();
            kotlin.jvm.internal.o.e(modeSwitchContainer, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) modeSwitchContainer;
            jz5.l k17 = k(getKeyboardIcon(), viewGroup);
            float floatValue = ((java.lang.Number) k17.f302833d).floatValue();
            float floatValue2 = ((java.lang.Number) k17.f302834e).floatValue();
            jz5.l k18 = k(getStartBtnTv(), viewGroup);
            float floatValue3 = ((java.lang.Number) k18.f302833d).floatValue();
            float floatValue4 = ((java.lang.Number) k18.f302834e).floatValue();
            android.graphics.Bitmap r17 = com.tencent.mm.sdk.platformtools.x.r(com.tencent.mm.R.raw.keyboard_circle_medium, getKeyboardIcon().getWidth(), getKeyboardIcon().getHeight(), i65.a.d(getContext(), com.tencent.mm.R.color.abw), 0, 1.0f);
            android.graphics.Bitmap m17 = m(getStartBtnTv());
            i(k23.f0.f303565g);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(new k23.o1(viewGroup, this, viewGroup, r17, floatValue, floatValue2, m17, floatValue3, floatValue4, 200L));
            animatorSet.playTogether(ofFloat3, ofFloat4);
        }
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    public final void setModeSwitchListener(k23.k1 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f303596n = listener;
    }
}
